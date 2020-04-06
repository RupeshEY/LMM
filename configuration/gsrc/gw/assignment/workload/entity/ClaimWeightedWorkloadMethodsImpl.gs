package gw.assignment.workload.entity

uses gw.api.assignment.workload.entity.AbstractWeightedWorkloadMethodsBaseImpl
uses gw.api.database.IQueryResult
uses gw.api.database.Query
uses gw.api.system.CCLoggerCategory

/**
 * Weighted Workload Assignment methods for Claims.
 */
@Export
public class ClaimWeightedWorkloadMethodsImpl extends AbstractWeightedWorkloadMethodsBaseImpl<Claim> {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  /**
   * Internal constructor used by delegation. Do not access.
   */
  public construct(thisClaim : Claim) {
    super(thisClaim)
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
    var result : boolean 
    CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("assignUserbyWorkload: attempting to assign Claim " + Owner.Claim.ClaimNumber)    
    result = super.assignUserByWorkload(includeSubgroups, withinGroup)
    CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("assignUserbyWorkload: new assignee: " + Owner.Claim.AssignedUser?.Credential.UserName)
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
    var result : boolean 
    CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("assignUserbyWorkload: attempting to assign Claim " + Owner.Claim.ClaimNumber)    
    result = super.assignUserByWorkloadAndAttributes(crit, includeSubGroups, withinGroup)
    if (result) {
      CCLoggerCategory.ASSIGNMENT_WEIGHTED_WORKLOAD.debug("assignUserbyWorkload: successfully assigned to: " + Owner.Claim.AssignedUser?.Credential.UserName)
    }
    return result
  }
  
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    
  /**
   * Tests whether this assignable matches a given work classification.
   * @return true if this assignable matches a given work classification
   */
  public override function matchesClassification(crit : WorkloadClassification) : boolean {
    return (crit as ClaimWorkloadClassification).isMatch(Owner)
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

    // Has claim LOB code been changed?
    if (Owner.isFieldChanged(Claim#LOBCode)) {
      return true
    }

    // Has claim Policy type been changed?
    if (Owner.Policy.isFieldChanged(Policy#PolicyType)) {
      return true
    }

    // Has claim's Supplemental Workload Weight been altered?
    if (Owner.isFieldChanged(Claim#SupplementalWorkloadWeight)) {
      return true
    }
    
    // Has claim's Loss Cause or Segment been changed?
    if (Owner.isFieldChanged(Claim#LossCause) or Owner.isFieldChanged(Claim#Segment)) {
      return true
    }

    // Has Service Tier be altered?
    if (Owner.Policy.isFieldChanged(Policy#CustomerServiceTier)) {
      return true
    }
    
    // Has any of the important fields on the claim's exposure (PrimaryCoverage,
    // CoverageSubtype or LossParty) been changed?
    if (Owner.Exposures.hasMatch(\ exp ->exp.isFieldChanged(Exposure#PrimaryCoverage)
            or exp.isFieldChanged(Exposure#CoverageSubType) or exp.isFieldChanged(Exposure#LossParty))) {
      return true
    }
    
    // Have their been any exposures added or removed from the claim?
    if (Owner.isArrayElementAddedOrRemoved(Claim#Exposures)) {
      return true
    }
    
    return false  
  }



  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Protected Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  protected override function findClassifications(): IQueryResult<WorkloadClassification, WorkloadClassification> {
    return ClaimWorkloadClassification.findActiveClaimWorkloadClassifications()
  }

  protected override function shouldSyncWorkload(): boolean {
    return Owner.State != ClaimState.TC_CLOSED
  }
}
