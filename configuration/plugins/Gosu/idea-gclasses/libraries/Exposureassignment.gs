package libraries

/**
 * A utility class for Exposure assignments.
 */
@Export
class Exposureassignment
{
  private construct()
  {
    // Enforces static only access
  }

 /**
  * Given a LossType and a ClaimSegment, returns a two GroupType options for Exposure assignment
  * in order of preference.
  */
  static function getGroupTypeBasedOnExpSegment(lossType : LossType, segment : ClaimSegment) : GroupType[]
  {
    var primaryGroupType : GroupType
    var secondaryGroupType : GroupType
    if (lossType == TC_AUTO)
    {
      if (segment == TC_AUTO_HIGH)
      {
        primaryGroupType = TC_LBLTYCOMPLEX
        secondaryGroupType = TC_LBLTYNORMAL
      }

      if (segment == TC_AUTO_MID)
      {
        primaryGroupType = TC_LBLTYNORMAL
        secondaryGroupType = TC_LBLTYCOMPLEX
      }
      if (segment == TC_AUTO_LOW)
      {
        primaryGroupType = TC_LBLTYFASTTRACK
        secondaryGroupType = TC_LBLTYNORMAL
      }
    }
    return new GroupType[] {primaryGroupType, secondaryGroupType}
  }
}
