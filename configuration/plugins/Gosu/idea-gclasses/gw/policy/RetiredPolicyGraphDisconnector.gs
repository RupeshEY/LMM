package gw.policy

uses java.util.List
uses gw.pl.persistence.core.Key

/**
 * This class resolves archivability issues for claims that are incorrectly linked to old, retired
 * policies. These incorrect links can be produced in two ways:
 *
 * 1. During a normal policy refresh, the old policy graph (the Policy itself and beans that belong
 * to it) is removed and unlinked from the claim, and a new one -- based on information received from
 * the policy system -- is attached to the claim in its place. In releases of ClaimCenter prior to
 * 7.0.0, beans in the old graph that are retireable got retired, not deleted, in the database, and
 * the policy refresh algorithm did not detect and sever all connections between the claim and the
 * now-retired beans in the old policy graph. When such a claim is upgraded to ClaimCenter 7.0.0 or
 * later, the links can interfere with the archiving process.
 *
 * 2. When a user selects a policy in the FNOL wizard, the policy is attached to the new claim. If the
 * user changes their mind and selects a different policy, the wizard will retire the old policy,
 * unlink it from the claim, and then link the new policy to the claim. However, some links between
 * the claim and the retired policy graph may not be automatically detected and unlinked, and they can
 * prevent the claim from being archived.
 *
 * In the base ClaimCenter data model, there are several types of claim-policy links that are known to
 * survive the unlinking in cases 1 and 2 above and thereby cause an issue with archiving. This class
 * queries the database for such links and severs them. It is primarily intended to be invoked by the
 * RetiredPolicyGraphDisconnectorBatch batch process, but it can easily be invoked from other contexts.
 *
 * If you use this class in your configuration, you should test the FNOL-then-archive scenario thoroughly
 * to verify that it severs all of the links used in your data model. If you have added extension
 * properties that produce new links between policy and non-policy entities within a claim, then you may
 * wish to add steps to this class to unlink them.
 */
@Export
class RetiredPolicyGraphDisconnector extends RetiredPolicyGraphDisconnectorBase {

  override property get UnlinkSteps() : List<block(policyId : Key)> {
    return {
      \ policyId -> unlinkClaimContactRoles(policyId),
      // this is commented out because it doesn't work properly when there are multiple
      // PropertyContentsScheduledItems on one Incident
      //\ policyId -> unlinkPropertyContentsScheduledItemsFromPropertyItems(policyId),
      \ policyId -> unlinkPolicyLocationsFromAddresses(policyId),
      \ policyId -> unlinkDeductiblesFromCoverages(policyId),
      \ policyId -> unlinkFixedPropertyIncidentsFromPolicyLocations(policyId),
      \ policyId -> unlinkTripIncidentsFromTripRUs(policyId),
      \ policyId -> unlinkBaggageIncidentsFromTripRUs(policyId),
      \ policyId -> unlinkVehiclesFromVehicleIncidents(policyId)
    }
  }

}
