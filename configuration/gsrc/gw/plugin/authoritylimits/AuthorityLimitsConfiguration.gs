package gw.plugin.authoritylimits

uses com.google.common.collect.ImmutableList
uses com.google.common.collect.ImmutableMap
uses gw.api.locale.DisplayKey
uses gw.entity.TypeKey
uses gw.plugin.authoritylimits.sum.ClaimAvailableReservesSum
uses gw.plugin.authoritylimits.sum.ClaimPaymentsToDateSum
uses gw.plugin.authoritylimits.sum.ClaimTotalReservesSum
uses gw.plugin.authoritylimits.sum.ExposureAvailableReservesSum
uses gw.plugin.authoritylimits.sum.ExposurePaymentsToDateSum
uses gw.plugin.authoritylimits.sum.ExposureTotalReservesSum
uses gw.plugin.authoritylimits.sum.IAuthoritySum
uses gw.plugin.authoritylimits.sum.PaymentAmountSum
uses gw.plugin.authoritylimits.sum.PaymentsExceedReservesSum
uses gw.plugin.authoritylimits.sum.ReserveChangeSum

uses java.lang.Exception
uses java.util.Arrays
uses java.util.Collection
uses java.util.Comparator
uses java.util.HashSet

@Export
/**
 * This class contains several methods used in the various implementations of IAuthoritySum to calculate financial
 * amounts when determining whether limits have been exceeded. If authority limit behavior is being configured
 * (for example, adding or removing filters from the authority limit entity, or changing how the filters should be applied),
 * several methods in this class (indicated by the comments) should be updated to accommodate those changes.
 */
class AuthorityLimitsConfiguration {

  private static final var entries = new HashSet<Entry>()

  /**
   * When adding a new authority limit type, include an entry here to indicate what type of transaction should trigger
   * limits of the new type.
   */
  private static function buildEntryMap() {
    entries.add(new PaymentEntry(AuthorityLimitType.TC_CPTD, new ClaimPaymentsToDateSum()))
    entries.add(new PaymentEntry(AuthorityLimitType.TC_EPTD, new ExposurePaymentsToDateSum()))
    entries.add(new PaymentEntry(AuthorityLimitType.TC_PA, new PaymentAmountSum()))
    entries.add(new PaymentEntry(AuthorityLimitType.TC_PER, new PaymentsExceedReservesSum()))

    entries.add(new ReserveEntry(AuthorityLimitType.TC_CAR, new ClaimAvailableReservesSum()))
    entries.add(new ReserveEntry(AuthorityLimitType.TC_CTR, new ClaimTotalReservesSum()))
    entries.add(new ReserveEntry(AuthorityLimitType.TC_EAR, new ExposureAvailableReservesSum()))
    entries.add(new ReserveEntry(AuthorityLimitType.TC_ETR, new ExposureTotalReservesSum()))
    entries.add(new ReserveEntry(AuthorityLimitType.TC_RCS, new ReserveChangeSum()))
  }

  /**
   * When adding a new authority limit filter, the compare() implementation should be updated to include that filter.
   */
  static class AuthorityLimitComparator implements Comparator<AuthorityLimit> {
    override function compare(al1: AuthorityLimit, al2: AuthorityLimit): int {
      // NOTE - NO NEED TO SORT ON AMOUNT, SINCE 2 DIFFERENT LIMITS CANNOT DIFFER ONLY IN AMOUNTS
      var limitType1 = al1.LimitType
      var policyType1 = al1.PolicyType
      var coverageType1 = al1.CoverageType
      var costType1 = al1.CostType

      var limitType2 = al2.LimitType
      var policyType2 = al2.PolicyType
      var coverageType2 = al2.CoverageType
      var costType2 = al2.CostType

      if (limitType1 != limitType2) {
        // limit types are not equal, so we can just return result of comparing them (we know they are not null).
        return limitType1.compareTo(limitType2)
      } else if (policyType1 != policyType2) {
        // policyTypes are not equal so sort them, putting null values (if any) last
        return compareTypeKeysWithNullsOrderedLast(policyType1, policyType2)
      } else if (coverageType1 != coverageType2) {
        // coverageTypes are not equal so sort them, putting null values (if any) last
        return compareTypeKeysWithNullsOrderedLast(coverageType1, coverageType2)
      } else {
        // compare costTypes, putting null values (if any) last
        return compareTypeKeysWithNullsOrderedLast(costType1, costType2)
      }
    }

    private function compareTypeKeysWithNullsOrderedLast(tk1: TypeKey, tk2: TypeKey): int {
      var result = 0
      // default, assume that both TypeKeys are equal
      if (tk1 != tk2) {
        // we know that at most one TypeKey is null
        if (null == tk1) {
          // 1st TypeKey is NULL, so return positive int to have it ordered after 2nd TypeKey
          result = 1
        } else if (null == tk2) {
          // 2nd TypeKey is NULL, so return negative int to have 1st TypeKey ordered before it
          result = - 1
        } else {
          // neither TypeKey is null, so just use regular compareTo
          result = tk1.compareTo(tk2)
        }
      }

      return result
    }
  }

  /**
   * Assumes that we've already checked that the limit type applies
   * Returns whether the given transaction applies to the given limit by comparing the limit's filters.
   * If you add a new filter, or want an existing filter to behave differently, modify the behavior here.
   */
  public static function limitApplies(limit: AuthorityLimit, transaction: Transaction): boolean {
    //    See comments in AuthorityLimit.etx before uncommenting this code.
    //    if (limit.Claim.ID != null && limit.Claim.ID != transaction.Claim.ID) {
    //      return false
    //    }

    var policyType = limit.PolicyType
    if (policyType != null) {
      var policy = transaction.Claim.Policy
      if (policy == null || policyType != policy.PolicyType) {
        return false
      }
    }

    var coverageType = limit.CoverageType
    if (coverageType != null) {
      var exposure = transaction.Exposure
      if (exposure == null || coverageType != exposure.PrimaryCoverage) {
        return false
      }
    }

    var costType = limit.CostType
    if (costType != null) {
      if (costType != transaction.CostType) {
        return false
      }
    }

    return true
  }

  /**
   * Returns a collection of exposures to which the given limit applies, based on the limit's coverage type.
   * If the limit has no coverage type, that means all exposures apply, and this method returns null.
   * This is a distinct from returning an empty list, which indicates that no exposures apply.
   *
   * This method is used by implementations of IAuthoritySum to determine which transactions should be included in calculations.
   * Transactions whose exposures match those returned by this method are included.
   * If this method returns an empty list, no transactions (including claim-level ones) will be included.
   * If this method returns null, all transactions (including claim-level ones) will be included.
   *
   * If you add a filter that is an attribute of Exposure (such as CoverageSubtype), you should modify this method.
   * The return contract must remain the same however; an empty list indicates no exposures apply, while null indicates
   * all exposures apply.
   *
   * @param claim the claim whose exposures may be returned
   * @param limit the authority limit that is being applied
   * @return set of exposures on the given claim which satisfy the given limit, or null if the limit's coverage type is null
   */
  public static function getExposures(claim: Claim, final limit: AuthorityLimit) : Collection<Exposure> {
    if (limit.CoverageType == null) {
      return null
    }
    return new HashSet<Exposure>(Arrays.asList(
        claim.Exposures.where(\exposure -> (exposure.PrimaryCoverage != null && limit.CoverageType == exposure.PrimaryCoverage))
    ))
  }

  /**
   * Returns whether the given reserve's exposure matches the given limit's attributes.
   * If you add an authority limit filter that is an attribute of Exposure, you should modify this method.
   */
  public static function reserveMatchesExposureAttributes(reserve : Reserve, limit : AuthorityLimit) : boolean {
    var reserveExposureCoverageType = (null != reserve.Exposure) ? reserve.Exposure.PrimaryCoverage : null
    return (limit.CoverageType == null || limit.CoverageType == reserveExposureCoverageType)
  }

  private static abstract class Entry {

    final var _authorityLimitType: AuthorityLimitType
    final var _authoritySum: IAuthoritySum

    construct(authorityLimitType: AuthorityLimitType, authoritySum: IAuthoritySum) {
      this._authorityLimitType = authorityLimitType
      this._authoritySum = authoritySum
    }
  }

  private static class PaymentEntry extends Entry {
    construct(authorityLimitType: AuthorityLimitType, authoritySum: IAuthoritySum) {
      super(authorityLimitType, authoritySum)
    }
  }

  private static class ReserveEntry extends Entry {
    construct(authorityLimitType: AuthorityLimitType, authoritySum: IAuthoritySum) {
      super(authorityLimitType, authoritySum)
    }
  }

  private static class RecoveryEntry extends Entry {
    construct(authorityLimitType: AuthorityLimitType, authoritySum: IAuthoritySum) {
      super(authorityLimitType, authoritySum)
    }
  }

  private static class RecoveryReserveEntry extends Entry {
    construct(authorityLimitType: AuthorityLimitType, authoritySum: IAuthoritySum) {
      super(authorityLimitType, authoritySum)
    }
  }

  private static final var lock = new Object()
  private static var initialized = false

  private static var authoritySumByLimitType: ImmutableMap<AuthorityLimitType, IAuthoritySum>
  private static var authorityLimitTypesPayment: ImmutableList<AuthorityLimitType>
  private static var authorityLimitTypesReserves: ImmutableList<AuthorityLimitType>
  private static var authorityLimitTypesRecoveries: ImmutableList<AuthorityLimitType>
  private static var authorityLimitTypesRecoveryReserves: ImmutableList<AuthorityLimitType>

  private static function init() {
    using (lock as IMonitorLock) {
      if (initialized) return;

      buildEntryMap()

      var authoritySumByLimitTypeBuilder = ImmutableMap<AuthorityLimitType, IAuthoritySum>.builder<AuthorityLimitType, IAuthoritySum>()
      var authorityLimitTypesPaymentBuilder = ImmutableList<AuthorityLimitType>.builder<AuthorityLimitType>()
      var authorityLimitTypesReservesBuilder = ImmutableList<AuthorityLimitType>.builder<AuthorityLimitType>()
      var authorityLimitTypesRecoveriesBuilder = ImmutableList<AuthorityLimitType>.builder<AuthorityLimitType>()
      var authorityLimitTypesRecoveryReservesBuilder = ImmutableList<AuthorityLimitType>.builder<AuthorityLimitType>()


      for (var entry in entries) {
        authoritySumByLimitTypeBuilder.put(entry._authorityLimitType, entry._authoritySum)
        if (entry typeis PaymentEntry) {
          authorityLimitTypesPaymentBuilder.add(entry._authorityLimitType)
        } else if (entry typeis ReserveEntry) {
          authorityLimitTypesReservesBuilder.add(entry._authorityLimitType)
        } else if (entry typeis RecoveryEntry) {
          authorityLimitTypesRecoveriesBuilder.add(entry._authorityLimitType)
        } else if (entry typeis RecoveryReserveEntry) {
          authorityLimitTypesRecoveryReservesBuilder.add(entry._authorityLimitType)
        } else {
          throw new Exception("Unhandled authority class encountered: " + entry._authorityLimitType.toString())
        }
      }

      authoritySumByLimitType = authoritySumByLimitTypeBuilder.build()
      authorityLimitTypesPayment = authorityLimitTypesPaymentBuilder.build()
      authorityLimitTypesReserves = authorityLimitTypesReservesBuilder.build()
      authorityLimitTypesRecoveries = authorityLimitTypesRecoveriesBuilder.build()
      authorityLimitTypesRecoveryReserves = authorityLimitTypesRecoveryReservesBuilder.build()

      initialized = true
    }
  }

  public static property get AuthoritySumByLimitTypeMap(): ImmutableMap<AuthorityLimitType, IAuthoritySum> {
    init()
    return authoritySumByLimitType
  }

  public static function isPaymentLimitType(type: AuthorityLimitType): boolean {
    init()
    return authorityLimitTypesPayment.contains(type)
  }

  public static function isReserveLimitType(type: AuthorityLimitType): boolean {
    init()
    return authorityLimitTypesReserves.contains(type)
  }

  public static function isRecoveryLimitType(type: AuthorityLimitType): boolean {
    init()
    return authorityLimitTypesRecoveries.contains(type)
  }

  public static function isRecoveryReserveLimitType(type: AuthorityLimitType): boolean {
    init()
    return authorityLimitTypesRecoveryReserves.contains(type)
  }

  public static function validateTypecodeHierarchy(authorityLimit : AuthorityLimit) {
    if (authorityLimit.PolicyType != null && authorityLimit.CoverageType != null && !authorityLimit.CoverageType.hasCategory(authorityLimit.PolicyType)) {
      authorityLimit.CoverageType = null
    }
  }

  /**
   * Returns true if this profile has no duplicate authority limits. A limit is considered to be a
   * duplicate if it has the same limit type, coverage type, cost type and claim id as another limit.
   *
   * @param profile the authority profile to test
   * @return true if this profile has no duplicate authority limits
   */
  public static function resolveAuthorityLimits(profile : AuthorityLimitProfile) : boolean {
    var newLimits = new HashSet<String>()
    for (var limit in profile.Limits) {
      var limitCode = getUniqueIdentifier(limit)
      if (newLimits.contains(limitCode)) { // Two authority limits with the same profile found
        return false;
      } else { // It's unique, so add it to our list
        newLimits.add(limitCode);
      }
    }
    return true;
  }

  /**
   * If you add or delete a filter from an authority limit, you must modify this function.
  */
  private static function getUniqueIdentifier(limit : AuthorityLimit) : String {
    return (limit.LimitType == null ? limit.LimitType : limit.LimitType.Code) + "-" +
      (limit.PolicyType == null ? limit.PolicyType : limit.PolicyType.Code) + "-" +
      (limit.CoverageType == null ? limit.CoverageType : limit.CoverageType.Code) + "-" +
      (limit.CostType == null ? limit.CostType : limit.CostType.Code) /*+ "-" + asAuthorityLimitInternal(limit).ClaimID */;
  }

  /**
   * Returns the error string if a duplicate authority limit is found in a profile.
   *
   * If you change the filters in the authority limit (for example, by adding a new type code), you must also
   * change this string.
   *
   * @return the error string
   */
  public static property get ErrorString() : String {
    return DisplayKey.get('AuthorityLimit.AuthorityLimitError')
  }
}