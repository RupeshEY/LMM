package gw.policy
uses gw.processes.BatchProcessBase

@Export
class RetiredPolicyGraphDisconnectorBatch extends BatchProcessBase {

  construct() {
    super(BatchProcessType.TC_RETIREDPOLICYGRAPHDISCONNECTOR)
  }

  override function doWork() {
    new RetiredPolicyGraphDisconnector().run()
  }
}
