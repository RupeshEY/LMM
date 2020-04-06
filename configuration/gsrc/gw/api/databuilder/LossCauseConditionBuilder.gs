package gw.api.databuilder

@Export
public class LossCauseConditionBuilder extends ClassificationConditionBuilder<LossCauseCondition, LossCauseConditionBuilder> {

  public construct() {
    super(LossCauseCondition)
  }

  public static function anyLossCause() : LossCauseConditionBuilder {
    return new LossCauseConditionBuilder()
                    .withIncludeAll(true)
  }
  
  public static function filterOn(cause : LossCause) : LossCauseConditionBuilder {
    return new LossCauseConditionBuilder()
                    .withIncludeAll(false)
                    .withConditionFilter(new LossCauseConditionFilterBuilder().withLossCause(cause))
  }
  
  public function withConditionFilter(filter : ValueGenerator< LossCauseConditionFilter >) : LossCauseConditionBuilder {
    addArrayElement(LossCauseCondition.Type.TypeInfo.getProperty("ConditionFilters"), filter)
    return this
  }  
}
