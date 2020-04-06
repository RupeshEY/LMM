package gw.assignment.workload.classifications

uses gw.api.database.Query
uses gw.entity.IEntityType
uses gw.pl.persistence.core.Key

/**
 * Claim Workload Classification methods. 
 */
@Export
public class ClaimWorkloadClassificationMethodsImpl extends AbstractWorkloadClassificationMethodsImpl {

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Constructors
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Constructor used by delegation. Do not access.
   */  
  public construct(weight : ClaimWorkloadClassification) {
    super(weight)
  }


  public override property get AssignableType() : IEntityType {
    return Claim
  }

  public override function isMatch(entity: Object): boolean {
    if (not (entity typeis Claim)) {
      return false
    }
    var claim = entity as Claim
    // Claim has matching Loss Type?
    if (claim.LossType != WorkloadClassification.ClaimLossType) {
      return false
    }
    // Claim has matching LOB Code?
    if ((WorkloadClassification.ClaimLOBCode != null) and claim.LOBCode != WorkloadClassification.ClaimLOBCode) {
      return false
    }
    // Claim has matching Policy Type?
    if ((WorkloadClassification.ClaimPolicyType != null) and claim.Policy.PolicyType != WorkloadClassification.ClaimPolicyType) {
      return false
    }

    return super.isMatch(claim)
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // Protected Methods
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  protected override function buildQuery(query : Query) {
    // Claim Loss Type
    query.compare(Claim#LossType, Equals, WorkloadClassification.ClaimLossType)

    // Policy level fields
    if (WorkloadClassification.ClaimPolicyType != null) {
    query.outerJoin(Claim#Policy).compare(Policy#PolicyType, Equals, WorkloadClassification.ClaimPolicyType)
    }

    // Claim LOB Code
    if (WorkloadClassification.ClaimLOBCode != null) {
      query.compare(Claim#LOBCode, Equals, WorkloadClassification.ClaimLOBCode)
    }
  }


  protected override function addStateFilterForGroupUserToQuery(query : Query) {
    query.compare(Claim#State, Equals, ClaimState.TC_OPEN)
  }
}


