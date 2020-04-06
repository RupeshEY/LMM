package gw.api.databuilder

@Export
public class ExposureConditionBuilder extends ClassificationConditionBuilder<ExposureCondition, ExposureConditionBuilder> {

  public construct() {
    super(ExposureCondition)
  }

  public static function anyExposure() : ExposureConditionBuilder {
    return new ExposureConditionBuilder().withIncludeAll(true)
  }
  
  public static function filterOn(ct : CoverageType, cs : CoverageSubtype, lpt : LossPartyType) : ExposureConditionBuilder {
    return new ExposureConditionBuilder()
                    .withIncludeAll(false)
                    .withConditionFilter(new ExposureConditionFilterBuilder()
                            .withCoverageSubtype(cs)
                            .withCoverageType(ct)
                            .withLossPartyType(lpt))    
  }
  
  public function withConditionFilter(filter : ValueGenerator< ExposureConditionFilter >) : ExposureConditionBuilder {
    addArrayElement(ExposureCondition.Type.TypeInfo.getProperty("ConditionFilters"), filter)
    return this
  }
}
