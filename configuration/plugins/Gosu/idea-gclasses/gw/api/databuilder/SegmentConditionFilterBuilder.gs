package gw.api.databuilder

@Export
public class SegmentConditionFilterBuilder extends ConditionFilterBuilder<SegmentConditionFilter, SegmentConditionFilterBuilder> {

  public construct() {
    super(SegmentConditionFilter)
  }

  public function withClaimSegment(segment : ClaimSegment) : SegmentConditionFilterBuilder {
    set(SegmentConditionFilter.Type.TypeInfo.getProperty("Segment"), segment)
    return this
  }

}
