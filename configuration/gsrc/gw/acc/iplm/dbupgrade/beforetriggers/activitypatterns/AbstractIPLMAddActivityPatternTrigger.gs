package gw.acc.iplm.dbupgrade.beforetriggers.activitypatterns

uses com.guidewire.commons.metadata.MetadataDependencies
uses gw.api.database.Relop
uses gw.api.database.upgrade.after.AfterUpgradeVersionTrigger
uses gw.entity.IEntityPropertyInfo

abstract class AbstractIPLMAddActivityPatternTrigger extends AfterUpgradeVersionTrigger {

  private static var ACTIVITY_PATTERN_TABLE = "activitypattern"
  private final var _table = getTable(ACTIVITY_PATTERN_TABLE)

  protected construct(minorVersionWhenTriggerIsApplicable : int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  override public function execute() : void {
    for (pattern in getPatternDetailsList()) {
      if (not patternAlreadyExists(pattern)) {
        insertActivityPattern(pattern)
      }
    }
  }

  private function patternAlreadyExists(pattern : IPLMActivityPatternCreateDetails) : boolean {
    final var query = _table.query()
    query.compare(ActivityPattern#Code, Relop.Equals, pattern._patternCode)
    var count = query.select().getCount()
    return count > 0
  }

  private function insertActivityPattern(patternDetails : IPLMActivityPatternCreateDetails) : void {
    var insert = _table.insert()

    patternDetails.mapColumns(new IPLMActivityPatternCreateDetails.AbstractInsertBuilder() {
      override public function mapTypeKey(propInfo : IEntityPropertyInfo, typelist : String, typecode : String) : void {
        var typeListIntrinsicType = MetadataDependencies.getTypelistTypeFactory().getTypeListIntrinsicType(typelist)
        insert.mapColumn(propInfo, typeListIntrinsicType.getTypeKey(typecode))
      }

      override public function mapValue(propInfo : IEntityPropertyInfo, value : Object) : void {
        insert.mapColumn(propInfo, value)
      }
    })

    insert.execute()
  }

  protected abstract function getPatternDetailsList() : List<IPLMActivityPatternCreateDetails>
}