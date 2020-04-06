package gw.api.databuilder

@Export
public class ClaimWorkloadClassificationBuilder extends WorkloadClassificationBuilder<ClaimWorkloadClassification, ClaimWorkloadClassificationBuilder> {
  
  public construct() {
    super(ClaimWorkloadClassification)
  }
  
  public function withCondition(weight : ClassificationCondition) : ClaimWorkloadClassificationBuilder {
    addArrayElement(ClaimWorkloadClassification.Type.TypeInfo.getProperty("Conditions"), weight)
    return this
  }
 
  public function withCondition(ConditionBuilder : ValueGenerator< ClassificationCondition >) : ClaimWorkloadClassificationBuilder {
    addArrayElement(ClaimWorkloadClassification.Type.TypeInfo.getProperty("Conditions"), ConditionBuilder)
    return this    
  }
  
  public static function auto() : ClaimWorkloadClassificationBuilder {
    return new ClaimWorkloadClassificationBuilder().withClaimLossType(LossType.TC_AUTO)
  }
  
  public static function comp() : ClaimWorkloadClassificationBuilder {
    return new ClaimWorkloadClassificationBuilder().withClaimLossType(LossType.TC_WC)
  }
  
  public static function gl() : ClaimWorkloadClassificationBuilder {
    return new ClaimWorkloadClassificationBuilder().withClaimLossType(LossType.TC_GL)
  }
  
  public static function prop() : ClaimWorkloadClassificationBuilder {
    return new ClaimWorkloadClassificationBuilder().withClaimLossType(LossType.TC_PR)
  }

  /**
   * Use a unique matter name of the form MatterN where N is a unique integer
   * @return the modified builder
   */
  public function withUniqueName() : ClaimWorkloadClassificationBuilder {
    set(ClaimWorkloadClassification.Type.TypeInfo.getProperty("Name"), SequentialStringGenerator.withPrefix("CWC"))
    return this
  }
      
  public static function uiReadyAuto() : ClaimWorkloadClassificationBuilder {
    return auto()
            .withUniqueName()
            .withAllPolicyTypes(true)
            .withAllLOBCodes(true)
            .withActive(true)
            .withWorkloadWeight(10)
            .withPriority(10)
            .withCondition(SegmentConditionBuilder.anySegment())
            .withCondition(LossCauseConditionBuilder.anyLossCause())
            .withCondition(ExposureConditionBuilder.anyExposure())
            .withCondition(CustomerServiceTierConditionBuilder.anyCustomerServiceTier())
  }
  
  public static function uiReadyProperty() : ClaimWorkloadClassificationBuilder {
    return prop()
            .withUniqueName()
            .withAllPolicyTypes(true)
            .withAllLOBCodes(true)
            .withActive(true)
            .withWorkloadWeight(100)
            .withPriority(15)
            .withCondition(SegmentConditionBuilder.anySegment())
            .withCondition(LossCauseConditionBuilder.anyLossCause())
            .withCondition(ExposureConditionBuilder.anyExposure())
            .withCondition(CustomerServiceTierConditionBuilder.anyCustomerServiceTier())
  }
  
  public static function uiReadyWorkComp() : ClaimWorkloadClassificationBuilder {
    return comp()
            .withUniqueName()
            .withAllPolicyTypes(true)
            .withAllLOBCodes(true)
            .withActive(true)
            .withWorkloadWeight(1000)
            .withPriority(20)
            .withCondition(SegmentConditionBuilder.anySegment())
            .withCondition(LossCauseConditionBuilder.anyLossCause())
            .withCondition(ExposureConditionBuilder.anyExposure())
            .withCondition(CustomerServiceTierConditionBuilder.anyCustomerServiceTier())
  }
  
  public static function uiReadyGL() : ClaimWorkloadClassificationBuilder {
    return gl()
            .withUniqueName()
            .withAllPolicyTypes(true)
            .withAllLOBCodes(true)
            .withActive(true)
            .withWorkloadWeight(10000)
            .withPriority(25)
            .withCondition(SegmentConditionBuilder.anySegment())
            .withCondition(LossCauseConditionBuilder.anyLossCause())
            .withCondition(ExposureConditionBuilder.anyExposure())
            .withCondition(CustomerServiceTierConditionBuilder.anyCustomerServiceTier())
  }
}
