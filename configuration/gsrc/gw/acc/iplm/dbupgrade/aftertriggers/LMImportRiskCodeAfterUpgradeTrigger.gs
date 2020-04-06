package gw.acc.iplm.dbupgrade.aftertriggers

uses gw.acc.iplm.utils.ECFConstants
uses gw.api.database.upgrade.after.AfterUpgradeVersionTrigger
uses gw.api.util.ConfigAccess
uses gw.api.webservice.importTools.ImportToolsImpl

uses java.io.FileNotFoundException

/**
 * Imports the list of LM Risk codes
 */
class LMImportRiskCodeAfterUpgradeTrigger extends AfterUpgradeVersionTrigger {

  construct(minorVersionWhenTriggerIsApplicable: int) {
    super(minorVersionWhenTriggerIsApplicable)
  }

  override function execute() {
    importLMRiskCodes()
  }

  /**
   * Imports the list of LMRiskCodes
   */
  private function importLMRiskCodes() {
    gw.transaction.Transaction.runWithNewBundle(\bundle ->
        {
          var importResults = new ImportToolsImpl().importXmlData(getLMRiskCodesXMlAsString())
          if (importResults.isOk()) {
            logDebugMessage("Succesfully imported LM Risk codes")
          } else {
            logDebugMessage("Failed to import LM Risk codes.")
          }
        }, ECFConstants.ECF_SUPER_USER)
  }

  /**
   * Reads the LMRiskCodes.xml file and returns its content as a string
   *
   * @return a string containing the content of the LMRiskCodes.xml file
   */
  private function getLMRiskCodesXMlAsString(): String {
    var LMRiskCodesXml = ""
    try {
      LMRiskCodesXml = ConfigAccess.getConfigFile("config/import/gen/LMRiskCodes.xml").read()
    } catch (e: FileNotFoundException) {
      logDebugMessage("Could not find LMRiskCodes xml file ")
    }
    return LMRiskCodesXml
  }


  override property get Description(): String {
    return "Imports the list of LMRiskCodes"
  }
}