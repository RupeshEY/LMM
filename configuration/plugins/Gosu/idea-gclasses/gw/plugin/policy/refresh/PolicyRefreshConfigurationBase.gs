package gw.plugin.policy.refresh

uses entity.*
uses gw.api.policy.refresh.PolicyRefreshConfiguration
uses gw.entity.IEntityType
uses java.lang.Class
uses gw.api.bean.compare.EntityMatcher
uses java.util.Map
uses gw.api.graph.Tree
uses gw.plugin.policy.refresh.matcher.*
uses gw.plugin.policy.refresh.ui.DiffDisplay
uses gw.plugin.policy.refresh.diffdisplay.*
uses gw.api.policy.refresh.relink.RelinkHandler
uses gw.api.policy.refresh.relink.RelinkFilter
uses gw.api.policy.refresh.ContactPreservingFilter
uses java.util.Set
uses gw.lang.reflect.IPropertyInfo
uses gw.plugin.policy.refresh.relink.handler.*
uses gw.api.policy.refresh.CopyInternalFieldsFilter
uses gw.api.policy.refresh.relink.ClaimLinkPreservingFilter

/**
 * <p>
 * Base implementation of the PolicyRefreshConfiguration interface, which specifies the matcher types, UI tree
 * configuration, relink filters, and other configuration information. Customers can edit this class, 
 * for example if they added a new entity type to the policy graph then they could add a new matcher here so 
 * the refresh plugin can match this new type.
 * </p>
 * <p>
 * This base implementation does not contain the code to define which entities belong to the "policy graph". 
 * Customers who use PolicyCenter as their policy system can use the PCPolicyRefreshConfiguration subclass 
 * which has an automatic mechanism for determining the extent of the policy graph. Other customers should use 
 * the BasicPolicyRefreshConfiguration, where they can manually specify any new entity types that need to be 
 * included in the comparison during Policy Refresh.
 * </p>  
 */
@Export
abstract class PolicyRefreshConfigurationBase implements PolicyRefreshConfiguration {

  construct() {}
  
  /**
   * <p>
   * Returns a map of <code>IEntityType-->EntityMatcher</code> that is used to match entities between
   * the existing and new policies. This definition of matching behavior is critical to how the
   * comparison between the existing and new policies is performed, and determines whether an
   * entity is classified as Added, Removed, or Matched in the <code>PolicyComparison</code>.
   * </p>
   * <p>
   * In general, when you add new entities to the policy data model
   * (i.e., an entity which can be retrieved from the <code>IPolicySearchAdapter</code>), you will also
   * want to add a corresponding EntityMatcher for that entity. If no <code>EntityMatcher</code> is defined
   * for a given type, then any EntityMatcher defined for the nearest supertype will be used. Hence
   * if a new entity subtype is added to the data model that does not define any identifying fields,
   * an <code>EntityMatcher</code> does not need to be created for that entity if there is an appropriate matcher
   * defined for the supertype.
   * </p> 
   * <p>See also the documentation for <code>gw.api.bean.compare.EntityMatcher</code>.</p>
   */
  override property get MatcherTypes() : Map<IEntityType, Class<EntityMatcher<KeyableBean>>> {
    return {
      /***********************************
       * Base ClaimCenter entity matchers
       ***********************************/
      Address -> AddressMatcher,
      Building -> BuildingMatcher,
      ClaimContact -> ClaimContactMatcher,
      ClaimContactRole -> ClaimContactRoleMatcher,
      ClassCode -> ClassCodeMatcher,
      ClassificationCovTerm -> ClassificationCovTermMatcher,
      Company -> CompanyMatcher,
      Contact -> ContactMatcher,
      ContactAddress -> ContactAddressMatcher,      
      ContactContact -> ContactContactMatcher,
      Coverage -> CoverageMatcher,
      CovTerm -> CovTermMatcher,
      Endorsement -> EndorsementMatcher,
      LocationBasedRU -> LocationBasedRUMatcher,
      OfficialID -> OfficialIdMatcher,
      Person -> PersonMatcher,
      Policy -> PolicyMatcher,
      PolicyLocation -> PolicyLocationMatcher,
      PropertyItem -> PropertyItemMatcher,
      PropertyOwner -> PropertyOwnerMatcher,
      RiskUnit -> RiskUnitMatcher,
      RUCoverage -> RUCoverageMatcher,
      StatCode -> StatCodeMatcher,
      Vehicle -> VehicleMatcher,
      VehicleOwner -> VehicleOwnerMatcher,
      VehicleRU -> VehicleRUMatcher
      /*******************************************
       * Custom extension entity matchers
       *******************************************/
    }
  }

  /**
   * Specifies properties which should be ignored on the Policy comparison screen.
   */
  override property get EntityPropertiesToIgnoreForComparison () : Set<IPropertyInfo> {
    return {
      Contact#AutoSync.PropertyInfo,
      ClaimContact#ClaimantFlag.PropertyInfo,
      ClaimContactRole#PartyNumber.PropertyInfo,
      /***********************************************************************************
       * When determining whether or not two policies are different, link properties such
       * FKs, arrays, and edge FKs can also be ignored
       * *********************************************************************************/
      //ignore the array of ClaimContacts on Policy, since these are moved to the Claim after the Policy is set
      Policy#Contacts.PropertyInfo,
      ClaimContact#Policy.PropertyInfo
    }
  }

  /**
   * <p>
   * Returns a map of the owner <code>IEntityType-->RelinkHandler</code> type that is used to customize how
   * foreign keys are relinked when the existing policy entities are replaced by the new
   * policy entities during the refresh. These custom relinker types will be used in lieu of default behavior 
   * during the <code>gw.plugin.policy.refresh.IPolicyRefreshPlugin#relink(java.util.Set, gw.api.policy.refresh.relink.RelinkContext)</code> 
   * step.
   * </p>
   * <p>
   * The default relinking behavior is defined according to the direction of the "broken" foreign key link. (Here
   * we define any "Claim entity" as an entity that exists in the Claim graph that is not an entity returned from
   * the <code>IPolicySearchAdapter</code>. Conversely, a "Policy entity" is any entity returned by the 
   * <code>IPolicySearchAdapter</code>.)
   * If the direction of the foreign key is from a Claim entity to a Policy entity, the default relinker will do
   * the following:
   * <ul>
   * <li>If the entity is matched, the target of the foreign key on the existing entity is replaced by the matched
   * entity on the new policy.</li>
   * <li>If the entity is removed in the new policy and the &lt;foreignkey&gt; is defined as nullok="true" the
   * link will be set to null.</li>
   * <li>If the entity is removed in the new policy and the &lt;foreignkey&gt; is defined as nullok="false" an
   * exception will be thrown (which will block the Policy Refresh from completing).</li>
   * </ul>
   * If the direction of the foreign key is from a Policy entity to a Claim entity, the default relinker will do the 
   * following:
   * <ul>
   * <li>If the entity is matched, the owner of the foreign key will be transferred from the existing entity to the
   * matched entity on the new policy.</li>
   * <li>If the entity is removed, nothing happens as the default behavior is to retire that entity.</li>
   * </ul>
   * Any entity that is added (i.e., present in the new policy but not in the existing) is not affected by the relinking
   * step.
   * </p>
   */
  override property get CustomRelinkerTypes() : Map<IEntityType, Class<RelinkHandler>> {
    return {
      ClaimContactRole -> ClaimContactRoleRelinkHandler,
      ContactTag -> ContactTagRelinkHandler,
      Contact -> ContactRelinkHandler,
      ContactFingerprint -> ContactFingerprintRelinkHandler,
      ContactAddress -> ContactAddressRelinkHandler,
      Deductible -> DeductibleRelinkHandler,
      Message -> MessageRelinkHandler
    }
  }
  
  
  /**
   * Returns a list of filters that will be executed before and after the relinking step,
   * and before any entities are retired.
   */
  override property get RelinkFilters() : java.util.List<RelinkFilter> {
     return {
       /**
        * Specifies preservation behavior in the case that certain entities that are
        * "pointed to" by the claim are removed in the Policy Refresh. Do not add
        * links here where the target of the link has foreign keys to other entities
        * that could be retired in the Policy Refresh.
        */
       new ClaimLinkPreservingFilter()
           .add(Claim#LossLocation)
           .add(MobilePropertyIncident#LocationAddress)
           .add(VehicleIncident#RecoveryLocation)
           .add(VehicleIncident#Vehicle),
       /**
        * The ContactPreservingFilter is responsible for talking any
        * Contacts (and related ClaimContacts) in the removed set (which
        * would otherwise be retired), preserving them, and moving them into 
        * "former_*" roles on the Claim.
        */
       new ContactPreservingFilter(),
       /**
        * Copies all internal-only fields from any entitiy that is matched
        * to its corresponding entity in the new Policy. May be removed if
        * internal-only fields are not used.
        */
        new CopyInternalFieldsFilter()
     }
  }
  
  /**
   * Configures the difference display on the Policy comparison screen. Note that
   * the implementations of <code>DiffDisplay</code> defined here control how the
   * differences are displayed as well as any warning or error messages that are
   * shown to the user.
   */
  override property get DiffDisplayTypes() : Map<IEntityType, Class<DiffDisplay>> {
    return {
      ClassCode -> ClassCodeDiffDisplay,
      KeyableBean ->KeyableBeanDiffDisplay,
      Policy -> PolicyDiffDisplay,
      PolicyCoverage -> PolicyCoverageDiffDisplay,
      PropertyItem -> PropertyItemDiffDisplay,
      RUCoverage -> RUCoverageDiffDisplay
      
      /* Custom DiffDisplay for Policy to illustrate one way to customize the hierarchy
         that gets displayed.  For demo purposes, currently unregistered in this 
         configuration file. If you use this, comment out the entry for PolicyDiffDisplay above. */
      // Policy -> CustomPolicyDiffDisplay
    }
  }

  /**
   * Configures how the differences between the existing and new policies is displayed
   * (as a tree). Since the data model is not a tree, this property is used to transform
   * the graph of differences into a tree for display purposes. Hence if there is more than
   * one way of reaching an entity from the Policy, then only one should be chosen to avoid
   * duplication of information on the comparison screen.
   */
  override property get DisplayTree() : Tree<IEntityType> {
      var tree = new Tree<IEntityType>(Policy.Type)
      var policyRoot = tree.Root
      tree.addOneToMany(Policy#Endorsements)

      tree.addOneToMany(Policy#ClassCodes)
      tree.addOneToMany(Policy#RiskUnits)
      tree.addOneToOne(RiskUnit#ClassCode)

      tree.addOneToMany(Policy#Coverages)
        tree.addOneToOne(PolicyCoverage#ClaimDeductible)
        tree.addOneToMany(PolicyCoverage#CovTerms)

      tree.addOneToMany(Policy#RiskUnits, VehicleRU)
        tree.addOneToMany(VehicleRU#Coverages, VehicleCoverage)
          tree.addOneToOne(VehicleCoverage#ClaimDeductible)
          tree.addOneToMany(VehicleCoverage#CovTerms)
        tree.addOneToOne(VehicleRU#Vehicle)
          tree.addOneToMany(Vehicle#Lienholders)
            tree.addOneToOne(VehicleOwner#Lienholder)
        tree.addOneToOne(VehicleRU#VehicleLocation)

      tree.addOneToMany(Policy#RiskUnits, LocationBasedRU)
        tree.addOneToMany(LocationBasedRU#Coverages, PropertyCoverage)
        tree.addOneToOne(LocationBasedRU#Building)
        tree.addOneToOne(LocationBasedRU#PolicyLocation)
          tree.addOneToOne(PolicyLocation#Address)
          tree.addOneToMany(PolicyLocation#HighValueItems)
          tree.addOneToMany(PolicyLocation#Lienholders)
            tree.addOneToOne(PropertyOwner#Lienholder)
          //tree.addOneToOne(PropertyOwner, "Property", PolicyLocation)

      /*
       * We handle connecting Contacts to ClaimContactRoles directly 
       * for purposes of display.
       */
      tree.addOneToMany(policyRoot, "Contacts", Contact)
        tree.addOneToMany(Contact, "Roles", ClaimContactRole)
        tree.addOneToOne(Contact#PrimaryAddress)
        // tree.addOneToMany(Contact, "TargetRelatedContacts", ContactContact)
        // tree.addOneToOne(ContactContact, "RelatedContact", Contact)
        tree.addOneToMany(Contact#ContactAddresses)
          tree.addOneToOne(ContactAddress#Address)
      
      return tree
  }
}
