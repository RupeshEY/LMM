package gw.plugin.policy.refresh.matcher


/**
 * Entity matcher for OfficialIDs.
 */
@Export
class OfficialIdMatcher extends PolicyGraphMatcherBase<OfficialID> {

  /**
   * Matches on the value and type of the id.
   */
  override function doEntitiesMatch(id1 : OfficialID, id2 : OfficialID) : boolean {
    return areBothNullOrEqual(id1.OfficialIDValue, id2.OfficialIDValue)
      and id1.OfficialIDType==id2.OfficialIDType
      and areBothNullOrEqual(id1.State, id2.State)
  }
}
