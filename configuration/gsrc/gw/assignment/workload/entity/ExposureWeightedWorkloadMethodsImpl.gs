package gw.assignment.workload.entity

uses gw.api.assignment.workload.entity.AbstractWeightedWorkloadMethodsBaseImpl
uses gw.api.database.IQueryResult
uses gw.api.locale.DisplayKey
uses gw.api.system.CCConfigParameters
uses gw.api.system.CCLoggerCategory
uses gw.pl.exception.GWConfigurationException

/**
 * Weighted Workload Assignment methods for Claims.
 */
@Export
public class ExposureWeightedWorkloadMethodsImpl extends AbstractWeightedWorkloadMethodsBaseImpl<Exposure> {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
  
  /**
   * Internal constructor used by delegation. Do not access.
   */
  public construct(thisExposure : Exposure) {
    super(thisExposure)
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Assignment Method Implementations
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
  
  /**
   * Assigns this assignable to user within a group of users that has the least workload.
   *
   * @param withinGroup The group to be used during the assignment (usually the parent group to which the entity is or should be assigned)
   * @param includeSubgroups Whether the subgroups of the supplied group should also be considered
   * @return true if the assignment is successful, false otherwise
   */
  public override function assignUserByWorkload(includeSubgroups : boolean, withinGroup : Group) : boolean {

    preventAssignmentIfConfigParamNotSet()

    var result : boolean
    CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("assignUserbyWorkload: attempting to assign Exposure " + Owner.DisplayName)    
    result = super.assignUserByWorkload(includeSubgroups, withinGroup)
    CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("assignUserbyWorkload: new assignee: " + Owner.AssignedUser?.Credential.UserName)
    return result
  }
  
  /**
   * 
   * @param attributeBasedAssignmentCriteria
   *                         The criteria used to perform the search
   * @param includeSubGroups if true, searches  all the users in any subgroups of the current group, as well as those in
   *                         the current group. If false, only searches users in the current group
   * @return true if the assignment is successful, false otherwise
   */
  public override function assignUserByWorkloadAndAttributes(crit : AttributeBasedAssignmentCriteria, includeSubGroups : boolean, withinGroup : Group) : boolean {

    preventAssignmentIfConfigParamNotSet()

    var result : boolean
    CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("assignUserbyWorkload: attempting to assign Exposure " + Owner.DisplayName)    
    result = super.assignUserByWorkloadAndAttributes(crit, includeSubGroups, withinGroup)
    if (result) {
      CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("assignUserbyWorkload: successfully assigned to: " + Owner.AssignedUser?.Credential.UserName)
    }
    return result
  }

  private function preventAssignmentIfConfigParamNotSet() {
    var exposureWWLEnabledConfigParam = CCConfigParameters.ExposureWWLEnabled
    if (not exposureWWLEnabledConfigParam.Value) {
      throw new GWConfigurationException(DisplayKey.get("Config.Error.ExposureWWLAttemptedButConfigParamNotSet",
          CCConfigParameters.ExposureWWLEnabled.Name));
    }
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  


  /**
   * Tests whether this assignable matches a given work classification.
   * @return true if this assignable matches a given work classification
   */
  public override function matchesClassification(crit : WorkloadClassification) : boolean {
    return (crit as ExposureWorkloadClassification).isMatch(Owner)
  }


  /**
   * Tests if the workload weight of this assignable needs to be updated.
   * @return true if the workload weight of this assignable needs to be updated
   */
  public override function isWorkloadAffected() : boolean {

    // Unassigned?
    if (Owner.AssignedUser == null) {
      return false
    }

    // Has exposure's Supplemental Workload Weight been altered?
    if (Owner.isFieldChanged(Exposure#SupplementalWorkloadWeight)) {
      return true
    }
    
    // Loss Cause has been changed?
    if (Owner.Claim.isFieldChanged(Claim#LossCause)) {
      return true
    }
    
    // Has claim LOB code been changed?
    if (Owner.Claim.isFieldChanged(Claim#LOBCode)) {
      return true
    }

    // Has claim Policy type been changed?
    if (Owner.Claim.Policy.isFieldChanged(Policy#PolicyType)) {
      return true
    }
    
    // Has Exposure Segment changed?
    if (Owner.isFieldChanged(Exposure#Segment)) {
      return true
    }
    
    // Has Coverage Type or Coverage Subtype or Loss Party on an Exposure has changed?
    if (Owner.isFieldChanged(Exposure#PrimaryCoverage)
            or Owner.isFieldChanged(Exposure#CoverageSubType)
            or Owner.isFieldChanged(Exposure#LossParty)
            or Owner.isFieldChanged(Exposure#JurisdictionState)) {
      return true
    }
      
    // Has Incident Severity has changed?
    if (Owner.Incident != null and Owner.Incident.isFieldChanged(Incident#Severity)) {
      return true
    }
    
    return false
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Protected Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  protected override function shouldSyncWorkload(): boolean {
    return Owner.State != ExposureState.TC_CLOSED
  }

  protected override function findClassifications() : IQueryResult<WorkloadClassification, WorkloadClassification> {
    return ExposureWorkloadClassification.findActiveExposureWorkloadClassifications()
  }

}
