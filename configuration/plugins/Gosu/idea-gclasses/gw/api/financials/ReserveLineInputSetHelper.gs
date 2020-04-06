package gw.api.financials

uses gw.entity.TypeKey
uses gw.pl.persistence.core.Key
uses java.util.ArrayList
uses java.util.Collections
uses java.util.HashMap
uses java.util.IdentityHashMap

/**
 * A helper for computing and caching filtered lists needed by
 * ReserveLineInputSet.
 *
 * <p>A single instance of this class is typically associated with a top-level
 * page or wizard (such as the various wizards for creating and editing checks)
 * in order to cache reserve line-related data on a per-claim basis. It may be
 * used while editing one or more transactions (such as payments on a check) by
 * calling wrap() to create associated ReserveLineInputSetWrapper instances for
 * each one. Any logic specific to a transaction instance is left as the
 * responsibility of the ReserveLineInputSetWrapper class.
 *
 * <p>The actual logic for deciding how to filter reserve lines, exposures, and
 * other values is delegated to the ReserveLineInputSetStrategy abstract class.
 * Every instance of this helper class needs to be given a strategy instance to
 * define the desired behavior. For example, since the rules for reserve lines
 * that can be used when creating payments differ from the rules when creating
 * recoveries, those two situations need different ReserveLineInputSetStrategy
 * implementations. Many such implementations are provided out of the box.
 *
 * <p>By convention, an instance of this class is typically created by a
 * static newHelper() convenience method on the desired subclass of
 * ReserveLineInputSetStrategy.
 *
 * <p>Given the design just described, ReserveLineInputSetHelper is unlikely to
 * need any changes to support customization, but the ReserveLineInputSetWrapper
 * class may need to change to support any additional input fields that are
 * added to the ReserveLineInputSet, and a new ReserveLineInputSetStrategy
 * subclass may need to be implemented, or an existing one modified, if new
 * situations are encountered or different rules are needed.
 *
 * <p>If you are just looking to get a list of allowed reserve lines, exposures,
 * or other reserve line components for a given situation, but are not
 * specifically using the ReserveLineInputSet, this helper is probably not
 * necessary. Simply instantiate the appropriate ReserveLineInputSetStrategy
 * subclass and use its allow...() methods directly.
 */
@Export
class ReserveLineInputSetHelper {

  /**
   * The strategy that defines the behavior of this helper.
   */
  var _strategy : ReserveLineInputSetStrategy

  /**
   * All instances of ReserveLineInputSetWrapper created by this helper, keyed
   * by each specific Transaction instance wrapped.
   */
  var _wrappers = new IdentityHashMap<Transaction, ReserveLineInputSetWrapper>()

  /**
   * Cache of reserve line options allowed by _strategy, keyed by claim ID.
   */
  var _reserveLineOptionsByClaim = new HashMap<Key, List<ReserveLineOption>>()

  /**
   * Cache of exposure options allowed by _strategy, keyed by claim ID.
   */
  var _exposureOptionsByClaim = new HashMap<Key, List<ExposureOption>>()

  /**
   * Cache of cost type options, keyed by either policy type or coverage type.
   */
  var _costTypeOptionsByKey = new HashMap<TypeKey, List<CostType>>()

  /**
   * Cache of cost category options, keyed by either (policy type, cost type) or
   * or (coverage type, cost type).
   */
  var _costCategoryOptionsByKey = new HashMap<List<TypeKey>, List<CostCategory>>()

  construct(s : ReserveLineInputSetStrategy) {
    _strategy = s
  }

  /**
   * Either creates a new wrapper or calls refresh() on an existing wrapper for
   * the given transaction.
   */
  function wrap(transaction: Transaction): ReserveLineInputSetWrapper {
    if (not _wrappers.containsKey(transaction)) {
      var wrapper = new ReserveLineInputSetWrapper(this, transaction)
      _wrappers.put(transaction, wrapper)
      return wrapper
    } else {
      var wrapper = _wrappers.get(transaction)
      wrapper.refresh()
      return wrapper
    }
  }

  internal property get Strategy() : ReserveLineInputSetStrategy {
    return _strategy
  }

  /**
   * Gets the reserve line options allowed for the given claim.
   *
   * 1. Reserve lines that have not been saved to the database yet are ignored.
   * 2. Existing reserve lines on the claim are included conditionally based on
   *    _strategy.allowExistingReserveLine().
   * 3. The "New..." option is included if there are any exposure options
   *    allowed for the claim (see getExposureOptions()), since those are
   *    specifically the exposures on which NEW reserve lines may be created.
   */
  internal function getReserveLineOptions(claim : Claim) : List<ReserveLineOption> {
    if (claim == null) {
      return Collections.emptyList()
    }
    if (not _reserveLineOptionsByClaim.containsKey(claim.ID)) {
      var reserveLineOptions = new ArrayList<ReserveLineOption>()
      for (var reserveLine in claim.ReserveLines) {
        if (not reserveLine.New and _strategy.allowExistingReserveLine(reserveLine)) {
          reserveLineOptions.add(ReserveLineOption.optionFor(reserveLine))
        }
      }
      if (getExposureOptions(claim).HasElements) {
        reserveLineOptions.add(ReserveLineOption.NEW_OPTION)
      }
      _reserveLineOptionsByClaim.put(claim.ID, Collections.unmodifiableList(reserveLineOptions))
    }
    return _reserveLineOptionsByClaim.get(claim.ID)
  }

  /**
   * Gets the exposure options allowed for the given claim. These are
   * specifically the exposures on which NEW reserve lines may be created.
   *
   * 1. The "claim-level" option is included conditionally based on
   *    _strategy.allowNewClaimLevelReserveLine().
   * 2. Individual exposures on the claim are included conditionally based on
   *    _strategy.allowNewExposureLevelReserveLine().
   */
  internal function getExposureOptions(claim : Claim) : List<ExposureOption> {
    if (claim == null) {
      return Collections.emptyList()
    }
    if (not _exposureOptionsByClaim.containsKey(claim.ID)) {
      var exposureOptions = new ArrayList<ExposureOption>()
      if (_strategy.allowNewClaimLevelReserveLine(claim)) {
        exposureOptions.add(ExposureOption.CLAIM_LEVEL_OPTION)
      }
      for (var exposure in claim.OrderedExposures) {
        if (_strategy.allowNewExposureLevelReserveLine(exposure)) {
          exposureOptions.add(ExposureOption.optionFor(exposure))
        }
      }
      _exposureOptionsByClaim.put(claim.ID, Collections.unmodifiableList(exposureOptions))
    }
    return _exposureOptionsByClaim.get(claim.ID)
  }

  /**
   * Gets the possible cost types for the given coverage type (if not null) or
   * policy type (if the coverage type is null). Allowed combinations of
   * coverage types, cost types, and cost categories are defined purely by
   * typekey categories listed on the CostCategory typelist, so the only way to
   * filter cost types is by simply checking, for each cost type, whether there
   * would be any cost categories allowed if that cost type were to be selected
   * (see getCostCategoryOptions()). If the coverage type is null, then all
   * possible coverage types for the given policy type are used instead.
   */
  internal function getCostTypeOptions(policyType : PolicyType, coverageType : CoverageType) : List<CostType> {
    if (policyType == null) {
      return Collections.emptyList()
    }
    var key = coverageType ?: policyType
    if (not _costTypeOptionsByKey.containsKey(key)) {
      var costTypeOptions = new ArrayList<CostType>()
      for (var costType in typekey.CostType.getTypeKeys(false)) {
        if (getCostCategoryOptions(policyType, coverageType, costType).HasElements) {
          costTypeOptions.add(costType)
        }
      }
      _costTypeOptionsByKey.put(key, Collections.unmodifiableList(costTypeOptions))
    }
    return _costTypeOptionsByKey.get(key)
  }

  /**
   * Gets the possible cost categories for the given coverage type (if not null)
   * or policy type (if the coverage type is null) together with the given cost
   * type (which may itself be null in order to not filter by cost type).
   * Allowed combinations of coverage types, cost types, and cost categories are
   * defined by typekey categories listed on the CostCategory typelist. If the
   * coverage type is null, then all possible coverage types for the given
   * policy type are used instead; a cost category is considered possible as
   * long as it matches at least one of those coverage types (and the given cost
   * type, if not null).
   */
  internal function getCostCategoryOptions(
          policyType : PolicyType, coverageType : CoverageType, costType : CostType) : List<CostCategory> {
    if (policyType == null) {
      return Collections.emptyList()
    }
    var key = {coverageType ?: policyType, costType}.toList()
    if (not _costCategoryOptionsByKey.containsKey(key)) {
      var coverageTypes : List<CoverageType>
      if (coverageType != null) {
        coverageTypes = Collections.singletonList(coverageType)
      } else {
        coverageTypes = typekey.CoverageType.getTypeKeys(false).where(\ ct -> ct.hasCategory(policyType))
      }
      var costCategoryOptions = new ArrayList<CostCategory>()
      for (var costCategory in typekey.CostCategory.getTypeKeys(false)) {
        if (hasCostTypeAndAnyCoverageType(costCategory, costType, coverageTypes)) {
          costCategoryOptions.add(costCategory)
        }
      }
      _costCategoryOptionsByKey.put(key, Collections.unmodifiableList(costCategoryOptions))
    }
    return _costCategoryOptionsByKey.get(key)
  }

  private function hasCostTypeAndAnyCoverageType(
          costCategory : CostCategory, costType : CostType, coverageTypes : List<CoverageType>) : boolean {
    return (costType == null or costCategory.hasCategory(costType))
            and coverageTypes.hasMatch(\ coverageType -> costCategory.hasCategory(coverageType))
  }

}
