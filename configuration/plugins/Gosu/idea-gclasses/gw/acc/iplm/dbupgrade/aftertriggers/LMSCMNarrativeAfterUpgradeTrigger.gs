package gw.acc.iplm.dbupgrade.aftertriggers

uses gw.acc.iplm.entitymapper.lloyds.SyndicateClaimMessageEntityMapper
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.api.database.Query
uses gw.api.database.upgrade.after.AfterUpgradeVersionTrigger

class LMSCMNarrativeAfterUpgradeTrigger extends AfterUpgradeVersionTrigger {

  construct(minorVersionWhenTriggerIsApplicable: int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  override function execute() {

    var scmMessagesList = getSCMMessages()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      scmMessagesList.each(\msg -> {
        var parsedMessage = Jv_Ins_Reinsurance.parse(msg.Content.toInputStream())
        msg = bundle.add(msg)
        msg = mapNarrative(msg, parsedMessage)
      })
    }, ECFConstants.ECF_SUPER_USER)

  }

  private function getSCMMessages(): List<LMMessageLloydsSCM_Ext> {
    return Query.make(LMMessageLloydsSCM_Ext)
        .select().toList()
  }

  private function mapNarrative(msg: LMMessageLloydsSCM_Ext, parsedMessage: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    msg = SyndicateClaimMessageEntityMapper.mapNarrative(msg, parsedMessage)
    return msg
  }

  override property get Description(): String {
    return "Populates the Narrative column of the LMMessageLloydsSCM_Ext entity."
  }

}