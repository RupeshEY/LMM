package gw.api.databuilder

@Export
public class JurisdictionConditionBuilder extends ClassificationConditionBuilder<JurisdictionCondition, JurisdictionConditionBuilder> {

  public construct() {
    super(JurisdictionCondition)
  }
  
  public static function anyJurisdiction() : JurisdictionConditionBuilder {
    return new JurisdictionConditionBuilder().withIncludeAll(true)
  }
  
  public static function filterOn(jurisdiction : Jurisdiction) : JurisdictionConditionBuilder {
    return new JurisdictionConditionBuilder().withIncludeAll(false)
            .withConditionFilter(new JurisdictionConditionFilterBuilder().withJurisdiction(jurisdiction))
  }
  
  public function withConditionFilter(filter : ValueGenerator< JurisdictionConditionFilter >) : JurisdictionConditionBuilder {
    addArrayElement(JurisdictionCondition.Type.TypeInfo.getProperty("ConditionFilters"), filter)
    return this
  }
}
