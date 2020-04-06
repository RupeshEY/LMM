package gw.entity
uses gw.api.claim.PurgeClaimInfoMethods
uses gw.pl.persistence.core.Key
uses gw.util.Pair
uses java.util.List

@Export
/**
 * This class is the default implementation of the PurgeClaimInfoMethods interface,
 * which provides support for purging any extension entities that point to ClaimInfo
 * when the owning Claim is purged.
 */
class PurgeClaimInfoMethodsImpl implements PurgeClaimInfoMethods {

  var _claimInfo : ClaimInfo

  construct( claimInfo : ClaimInfo ) {
    _claimInfo = claimInfo
  }

  /**
   * Implement this property to identify the IDs of beans that are linked to this
   * ClaimInfo and should be purged along with the ClaimInfo, but are outside the claim graph.
   * The internal purge logic uses the claim graph to decide what beans are part of the claim,
   * but relies on this property for information about beans outside the graph but that should
   * still be deleted during purge. The order of the returned List determines the order in
   * which the beans will be deleted. The ID of the ClaimInfo must also be included in the identified
   * beans, and it must be the only ClaimInfo; the other beans in the result will normally be
   * extension entities.
   * 
   * Important implementation note: as a claim is being purged, this property will be evaluated twice.
   * First, when the claim is being marked as ready for purge, the beans it identifies will be
   * retired, indicating that they are ready for purge. Then, it will be evaluated again to determine
   * the beans to actually delete from the database. Since the beans will already be retired during
   * this second execution, this property must be implemented to find the IDs of both retired and
   * non-retired beans. You may wish to use the Query API and call Query.withFindRetired(true).
   *
   * @return a List of the IDs for the beans to delete (including the ClaimInfo itself), grouped by type and
   *         in the order that they should be deleted; this is actually a list of Pairs, where each
   *         Pair contains a type and the IDs of the beans of that type to be deleted
   */
  override property get NonGraphBeansToPurge() : List<Pair<IEntityType,List<Key>>> {
    return {
      // put beans to be deleted before ClaimInfo here
      new Pair<IEntityType,List<Key>>(entity.ClaimInfo, {_claimInfo.ID})
      // put beans to be deleted after ClaimInfo here
    }
  }
}
