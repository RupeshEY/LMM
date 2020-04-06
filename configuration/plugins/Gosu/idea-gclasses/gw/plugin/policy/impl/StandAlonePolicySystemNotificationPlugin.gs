package gw.plugin.policy.impl
uses gw.plugin.policy.IPolicySystemNotificationPlugin
uses java.util.Date

/**
 * Skeleton implementation of IPolicySystemNotificationPlugin, implements the
 * interface but all methods are empty.
 */
@Export
class StandAlonePolicySystemNotificationPlugin implements IPolicySystemNotificationPlugin {

  override function claimExceedsLargeLossThreshold(lossDate : Date,
          policyNumber : String, grossTotalIncurred : String, transactionId : String) {
  }

}
