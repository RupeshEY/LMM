package gw.api.databuilder

@Export
public class IncidentSeverityConditionBuilder extends ClassificationConditionBuilder<IncidentSeverityCondition, IncidentSeverityConditionBuilder> {
  public construct() {
    super(IncidentSeverityCondition)
  }

  public static function anyIncidentSeverity() : IncidentSeverityConditionBuilder {
    return new IncidentSeverityConditionBuilder().withIncludeAll(true)
  }
  
  public static function filterOn(severity : SeverityType) : IncidentSeverityConditionBuilder {
    return new IncidentSeverityConditionBuilder().withIncludeAll(false)
                    .withConditionFilter(new IncidentSeverityConditionFilterBuilder().withIncidentSeverity(severity))
  }
  
  public function withConditionFilter(filter : ValueGenerator< IncidentSeverityConditionFilter >) : IncidentSeverityConditionBuilder {
    addArrayElement(IncidentSeverityCondition.Type.TypeInfo.getProperty("ConditionFilters"), filter)
    return this
  }
}
