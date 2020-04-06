package gw.api.databuilder

@Export
public class JurisdictionConditionFilterBuilder extends ConditionFilterBuilder<JurisdictionConditionFilter, JurisdictionConditionFilterBuilder> {

  public construct() {
    super(JurisdictionConditionFilter)
  }

  public function withJurisdiction(jurisdiction : Jurisdiction) : JurisdictionConditionFilterBuilder {
    set(JurisdictionConditionFilter.Type.TypeInfo.getProperty("Jurisdiction"), jurisdiction)
    return this
  }
}
