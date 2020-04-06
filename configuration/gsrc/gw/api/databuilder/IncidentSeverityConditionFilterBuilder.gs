package gw.api.databuilder

@Export
public class IncidentSeverityConditionFilterBuilder extends ConditionFilterBuilder<IncidentSeverityConditionFilter, IncidentSeverityConditionFilterBuilder> {

  public construct() {
    super(IncidentSeverityConditionFilter)
  }
  
  
  public function withIncidentSeverity(severity : SeverityType) : IncidentSeverityConditionFilterBuilder {
    set(IncidentSeverityConditionFilter.Type.TypeInfo.getProperty("IncidentSeverity"), severity)
    return this
  }

}
