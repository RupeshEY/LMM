package gw.bizrules

uses gw.api.util.DateUtil
uses gw.plugin.bizrules.BizRulesUtility

uses java.util.Date

/**
 * Utility class used by the CCBizRulesPlugin to define methods that are to be
 * available on the Rules screen
 */
@Export
class ActivityRulesUtility implements BizRulesUtility {

  public static var INSTANCE : ActivityRulesUtility = new ActivityRulesUtility()

  private construct() {}

  /**
   * Getter to get the ScriptParameter value for the ActivityThreshold
   * @return
   */
  public function getSIActivityThreshold() : int {
    return ScriptParameters.getScriptValue("SpecialInvestigation_CreateActivityForSupervisorThreshold") as int
  }

  /**
   * Returns the current date
   * @return
   */
  public function currentDate() : Date {
    return DateUtil.currentDate();
  }
}