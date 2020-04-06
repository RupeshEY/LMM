package gw.api.databuilder

@Export
public class LossCauseConditionFilterBuilder extends ConditionFilterBuilder<LossCauseConditionFilter, LossCauseConditionFilterBuilder> {

  public construct() {
    super(LossCauseConditionFilter)
  }

  public function withLossCause(LossCause : LossCause) : LossCauseConditionFilterBuilder {
    set(LossCauseConditionFilter.Type.TypeInfo.getProperty("LossCause"), LossCause)
    return this
  }

}
