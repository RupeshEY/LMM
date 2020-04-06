package gw.api.databuilder

@Export
public class SegmentConditionBuilder extends ClassificationConditionBuilder<SegmentCondition, SegmentConditionBuilder> {

  public construct() {
    super(SegmentCondition)
  }

  public static function anySegment() : SegmentConditionBuilder {
    return new SegmentConditionBuilder()
                    .withIncludeAll(true)
  }
  
  public static function filterOn(segment : ClaimSegment) : SegmentConditionBuilder {
    return new SegmentConditionBuilder()
                    .withIncludeAll(false)
                    .withConditionFilter(new SegmentConditionFilterBuilder().withClaimSegment(segment))
  }
  
  public function withConditionFilter(filter : ValueGenerator< SegmentConditionFilter >) : SegmentConditionBuilder {
    addArrayElement(SegmentCondition.Type.TypeInfo.getProperty("ConditionFilters"), filter)
    return this
  }
}
