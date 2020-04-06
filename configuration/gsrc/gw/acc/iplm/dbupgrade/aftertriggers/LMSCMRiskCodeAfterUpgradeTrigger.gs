package gw.acc.iplm.dbupgrade.aftertriggers

uses gw.acc.iplm.entitymapper.lloyds.SyndicateClaimMessageEntityMapper
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.api.database.Query
uses gw.api.database.upgrade.after.AfterUpgradeVersionTrigger

/**
 * Updates the existing SCM Messages to map their SCMRiskCode field with a SCMRiskCode_Ext entity
 */
class LMSCMRiskCodeAfterUpgradeTrigger extends AfterUpgradeVersionTrigger {


  construct(minorVersionWhenTriggerIsApplicable: int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  /**
   * Imports the list of LMRiskCodes and then maps the risk code field of the SCM messages
   */
  override function execute() {
    mapRiskCodeFieldOnAllSCMMessages()
  }

  /**
   * Queries all the SCM messages and individually maps the risk code fields
   */
  private function mapRiskCodeFieldOnAllSCMMessages() {
    var scmMessagesList = getSCMMessages()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scmMessagesList.each(\msg -> {
        var parsedMessage = Jv_Ins_Reinsurance.parse(msg.Content.toInputStream())
        msg = bundle.add(msg)
        msg = mapRiskCode(msg, parsedMessage)
      })
    }, ECFConstants.ECF_SUPER_USER)
  }

  /**
   * Returns the list of LMMessageLLyodsSCM_Ext
   *
   * @return a list containing all LMMessageLLoydsSCM_Ext entities
   */
  private function getSCMMessages(): List<LMMessageLloydsSCM_Ext> {
    return Query.make(LMMessageLloydsSCM_Ext)
        .select().toList()
  }

  /**
   * @param msg           : the SCM message entity
   * @param parsedMessage : the parsed message
   * @return : an SCM message corresponding to the passed msg argument, with a mapped risk code.
   */
  private function mapRiskCode(msg: LMMessageLloydsSCM_Ext, parsedMessage: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    msg = SyndicateClaimMessageEntityMapper.mapRiskCode(msg, parsedMessage)
    return msg
  }

  override property get Description(): String {
    return "Populates the SCMRiskCode column of the LMMessageLloydsSCM_Ext entity."
  }
}