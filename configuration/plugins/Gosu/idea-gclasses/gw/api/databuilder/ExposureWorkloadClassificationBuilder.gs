package gw.api.databuilder

@Export
public class ExposureWorkloadClassificationBuilder extends WorkloadClassificationBuilder<ExposureWorkloadClassification, ExposureWorkloadClassificationBuilder> {
    
  public construct() {
    super(ExposureWorkloadClassification)
  }
 
  public function withLossCauseweight(weight : ClassificationCondition) : ExposureWorkloadClassificationBuilder {
    addArrayElement(ExposureWorkloadClassification.Type.TypeInfo.getProperty("Conditions"), weight)
    return this
  }

  public function withCondition(ConditionBuilder : ValueGenerator< ClassificationCondition >) : ExposureWorkloadClassificationBuilder {
    addArrayElement(ExposureWorkloadClassification.Type.TypeInfo.getProperty("Conditions"), ConditionBuilder)
    return this    
  }

  public static function auto() : ExposureWorkloadClassificationBuilder {
    return new ExposureWorkloadClassificationBuilder().withClaimLossType(LossType.TC_AUTO)
  }
  
  public static function comp() : ExposureWorkloadClassificationBuilder {
    return new ExposureWorkloadClassificationBuilder().withClaimLossType(LossType.TC_WC)
  }
  
  public static function gl() : ExposureWorkloadClassificationBuilder {
    return new ExposureWorkloadClassificationBuilder().withClaimLossType(LossType.TC_GL)
  }
  
  public static function prop() : ExposureWorkloadClassificationBuilder {
    return new ExposureWorkloadClassificationBuilder().withClaimLossType(LossType.TC_PR)
  }

  /**
   * Use a unique matter name of the form MatterN where N is a unique integer
   * @return the modified builder
   */
  public function withUniqueName() : ExposureWorkloadClassificationBuilder {
    set(ClaimWorkloadClassification.Type.TypeInfo.getProperty("Name"), SequentialStringGenerator.withPrefix("EWC"))
    return this
  }
      
  public static function uiReadyAuto() : ExposureWorkloadClassificationBuilder {
    return auto()
            .withUniqueName()
            .withAllPolicyTypes(true)
            .withAllLOBCodes(true)
            .withActive(true)
            .withWorkloadWeight(10000)
            .withPriority(100)
            .withCondition(SegmentConditionBuilder.anySegment())
            .withCondition(ExposureConditionBuilder.anyExposure())
            .withCondition(JurisdictionConditionBuilder.anyJurisdiction())
            .withCondition(IncidentSeverityConditionBuilder.anyIncidentSeverity())
            
  }
  
  public static function uiReadyProperty() : ExposureWorkloadClassificationBuilder {
    return prop()
            .withUniqueName()
            .withAllPolicyTypes(true)
            .withAllLOBCodes(true)
            .withActive(true)
            .withWorkloadWeight(100000)
            .withPriority(110)
            .withCondition(SegmentConditionBuilder.anySegment())
            .withCondition(ExposureConditionBuilder.anyExposure())
            .withCondition(JurisdictionConditionBuilder.anyJurisdiction())
            .withCondition(IncidentSeverityConditionBuilder.anyIncidentSeverity())
            
  }
  
  public static function uiReadyWorkComp() : ExposureWorkloadClassificationBuilder {
    return comp()
            .withUniqueName()
            .withAllPolicyTypes(true)
            .withAllLOBCodes(true)
            .withActive(true)
            .withWorkloadWeight(1000000)
            .withPriority(120)
            .withCondition(SegmentConditionBuilder.anySegment())
            .withCondition(ExposureConditionBuilder.anyExposure())
            .withCondition(JurisdictionConditionBuilder.anyJurisdiction())
            .withCondition(IncidentSeverityConditionBuilder.anyIncidentSeverity())
            
  }

  public static function uiReadyGL() : ExposureWorkloadClassificationBuilder {
    return gl()
            .withUniqueName()
            .withAllPolicyTypes(true)
            .withAllLOBCodes(true)
            .withActive(true)
            .withWorkloadWeight(10000000)
            .withPriority(130)
            .withCondition(SegmentConditionBuilder.anySegment())
            .withCondition(ExposureConditionBuilder.anyExposure())
            .withCondition(JurisdictionConditionBuilder.anyJurisdiction())
            .withCondition(IncidentSeverityConditionBuilder.anyIncidentSeverity())
            
  }

}
