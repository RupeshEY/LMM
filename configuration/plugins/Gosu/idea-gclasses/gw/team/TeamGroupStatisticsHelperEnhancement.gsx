package gw.team

uses gw.api.locale.DisplayKey
uses gw.api.statistics.Statistics

/**
 * Enhancement that provides some helper methods for displaying sum values of 
 * data in the Team Group - Aging screen.
 */
@Export
enhancement TeamGroupStatisticsHelperEnhancement : gw.api.team.TeamGroupStatisticsHelper {

  public static function getAgingOneSummationRow(stats : Statistics[]) : String {
    return getAgingSummationRow(stats, \ s -> s.ClaimAgingOne, \ m -> m.LitClaimAgingOne )
  }

  public static function getAgingTwoSummationRow(stats : Statistics[]) : String {
    return getAgingSummationRow(stats, \ s -> s.ClaimAgingTwo, \ m -> m.LitClaimAgingTwo )
  }

  public static function getAgingThreeSummationRow(stats : Statistics[]) : String {
    return getAgingSummationRow(stats, \ s -> s.ClaimAgingThree, \ m -> m.LitClaimAgingThree )
  }

  public static function getAgingFourSummationRow(stats : Statistics[]) : String {
    return getAgingSummationRow(stats, \ s -> s.ClaimAgingFour, \ m -> m.LitClaimAgingFour )
  }

  public static function getAgingSummationRow(stats : Statistics[],
                                              agingBlock : block(s : Statistics) : int,
                                              litigationgBlock : block(s : Statistics) : int) : String {
    var claimSum = 0
    var litSum = 0
  
    for (s in stats) {
      claimSum += agingBlock(s)
      litSum += litigationgBlock(s)
    }
  
    return format(claimSum, litSum)
  }

  private static function format(claimSum : int, litSum : int) : String {
    if (gw.api.system.CCConfigParameters.CalculateLitigatedClaimAgingStats.Value) {
      return DisplayKey.get("Java.Team.User.Aging.UnderLitigation", claimSum, litSum)
    } else {
      return DisplayKey.get("Java.Team.User.Aging", claimSum)
    }
  }  
  
}
