package gw.api.databuilder

@Export
public class ExposureConditionFilterBuilder extends ConditionFilterBuilder<ExposureConditionFilter, ExposureConditionFilterBuilder> {

  public construct() {
    super(ExposureConditionFilter)
  }

  public function withCoverageType(coverageType : CoverageType) : ExposureConditionFilterBuilder {
    set(ExposureConditionFilter.Type.TypeInfo.getProperty("CoverageType"), coverageType)
    return this
  }
  
  public function withCoverageSubtype(subtype : CoverageSubtype) : ExposureConditionFilterBuilder {
    set(ExposureConditionFilter.Type.TypeInfo.getProperty("CoverageSubType"), subtype)
    return this
  }
  
  public function withLossPartyType(lossPartyType : LossPartyType) : ExposureConditionFilterBuilder {
    set(ExposureConditionFilter.Type.TypeInfo.getProperty("LossPartyType"), lossPartyType)
    return this 
  }

}
