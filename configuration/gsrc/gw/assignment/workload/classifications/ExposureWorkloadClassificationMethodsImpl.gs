package gw.assignment.workload.classifications

uses gw.api.database.Query
uses gw.entity.IEntityType

/**
 * Exposure Workload Classification methods. 
 */
@Export
public class ExposureWorkloadClassificationMethodsImpl extends AbstractWorkloadClassificationMethodsImpl {
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Constructor used by delegation. Do not access.
   */  
  public construct(weight : ExposureWorkloadClassification) {
    super(weight)
  }


  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Public Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  public override property get AssignableType() : IEntityType {
    return Exposure
  }

  public override function isMatch(entity: Object): boolean {
    if (not (entity typeis Exposure)) {
      return false
    }
    var exposure = entity as Exposure
    // Exposure's parent Claim LOB Code a match?
    if ((WorkloadClassification.ClaimLOBCode != null) and exposure.Claim.LOBCode != WorkloadClassification.ClaimLOBCode) {
      return false
    }
    // Exposure's parent Claim Policy Type a match?
    if ((WorkloadClassification.ClaimPolicyType != null) and exposure.Claim.Policy.PolicyType != WorkloadClassification.ClaimPolicyType) {
      return false
    }
    // Exposure's parent Claim Loss Type a match?
    if (exposure.Claim.LossType != WorkloadClassification.ClaimLossType) {
      return false
    }

    return super.isMatch(exposure)
  }

  protected override function buildQuery(query: Query) {
    var claimQuery = query.join(Exposure#Claim)

    //Claim Loss Type
    claimQuery.compare(Claim#LossType, Equals, WorkloadClassification.ClaimLossType)

    //Claim LOB Code
    if (WorkloadClassification.ClaimLOBCode != null) {
      claimQuery.compare(Claim#LOBCode, Equals, WorkloadClassification.ClaimLOBCode)
    }

    //Policy level fields
    if (WorkloadClassification.ClaimPolicyType != null) {
      var policyQuery = claimQuery.join(Claim#Policy)
      policyQuery.compare(Policy#PolicyType, Equals, WorkloadClassification.ClaimPolicyType)
    }

    // add query restrictions based on information provided by workload weights
    for (wc in WorkloadClassification.Conditions) {
      wc.filterQuery(query)
    }
  }

  protected override function addStateFilterForGroupUserToQuery(query : Query) {
    query.compare(Exposure#State, Equals, ExposureState.TC_OPEN)
  }
}
