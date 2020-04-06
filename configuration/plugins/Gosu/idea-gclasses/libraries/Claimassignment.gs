package libraries

/**
 * A utility class for Claim assignments.
 */
@Export
class Claimassignment
{

  private construct()
  {
    // Enforces static only access
  }

 /**
  * Given a LossType and a ClaimSegment, returns a two GroupType options for Claim assignment in order
  * of preference.
  */
  static function getGroupTypeBasedOnClaimSegment(losstype : LossType, segment : ClaimSegment) : GroupType[]
  {
    var primaryGroupType : GroupType
    var secondaryGroupType : GroupType
    if (losstype == TC_AUTO)
    {
      if (segment == TC_AUTO_HIGH)
      {
        primaryGroupType = TC_AUTOCOMPLEX
        secondaryGroupType = TC_AUTONORMAL
      }

      if (segment == TC_AUTO_MID)
      {
        primaryGroupType = TC_AUTONORMAL
        secondaryGroupType = TC_AUTOCOMPLEX
      }
      if (segment == TC_AUTO_LOW)
      {
        primaryGroupType = TC_AUTOFASTTRACK
        secondaryGroupType = TC_AUTONORMAL
      }
    }

    if (losstype == TC_PR)
    {
      if (segment == TC_PROP_HIGH)
      {
        primaryGroupType = TC_PROPCOMPLEX
        secondaryGroupType = TC_PROPNORMAL
      }

      if (segment == TC_PROP_MID)
      {
        primaryGroupType = TC_PROPNORMAL
        secondaryGroupType = TC_PROPCOMPLEX
      }
      if (segment == TC_PROP_LOW)
      {
        primaryGroupType = TC_PROPFASTTRACK
        secondaryGroupType = TC_PROPNORMAL
      } 
    }

    if (losstype == TC_GL)
    {
      if (segment == TC_LIAB_HIGH)
      {
        primaryGroupType = TC_LBLTYCOMPLEX
        secondaryGroupType = TC_LBLTYNORMAL
      }

      if (segment == TC_LIAB_MID)
      {
        primaryGroupType = TC_LBLTYNORMAL
        secondaryGroupType = TC_LBLTYCOMPLEX
      }
      if (segment == TC_LIAB_LOW)
      {
        primaryGroupType = TC_LBLTYFASTTRACK
        secondaryGroupType = TC_LBLTYNORMAL
      }
    }
    if (losstype == TC_WC)
    {
      if (segment == TC_WC_MED_ONLY)
      {
        primaryGroupType = TC_WC_MED_ONLY
        secondaryGroupType = TC_WC_NORMAL
      }

      if (segment == TC_WC_LOST_TIME)
      {
        primaryGroupType = TC_WC_LOST_TIME
        secondaryGroupType = TC_WC_NORMAL
      }
      if (segment == TC_WC_LIABILITY)
      {
        primaryGroupType = TC_WC_LOST_TIME
        secondaryGroupType = TC_WC_NORMAL
      }
    }
    if (losstype == TC_TRAV )
    {
      if (segment == TC_TRAVEL_LOW)
      {
        primaryGroupType = TC_TRAVEL
        secondaryGroupType = TC_TRAVEL
      }

      if (segment == TC_TRAVEL_MID)
      {
        primaryGroupType = TC_TRAVEL
        secondaryGroupType = TC_TRAVEL
      }
      if (segment == TC_TRAVEL_HIGH)
      {
        primaryGroupType = TC_TRAVEL
        secondaryGroupType = TC_TRAVEL
      }
    }
    return new GroupType[] {primaryGroupType, secondaryGroupType}
  }

}
