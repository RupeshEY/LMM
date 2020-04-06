package gw.acc.iplm.config

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.api.startable.IStartablePlugin
uses gw.api.startable.StartablePluginCallbackHandler
uses gw.api.startable.StartablePluginState

class LMConfigStartablePlugin implements IStartablePlugin {

  public static var LLOYDS_COMPANIES: List<Party>
  public static var LIRMA_COMPANIES: List<Party>
  public static var ILU_COMPANIES: List<Party>
  private var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _callbackHandler: StartablePluginCallbackHandler
  private var _state = StartablePluginState.Stopped

  override function start(startablePluginCallbackHandler: StartablePluginCallbackHandler, b: boolean) {

    _callbackHandler = startablePluginCallbackHandler
    _callbackHandler.execute(\-> {
      LOGGER.info("Loading IPLM Company Config Data")
      var companiesData = new LMCompaniesDataLoader()
      LLOYDS_COMPANIES = companiesData.getLloydsCompanies()
      LIRMA_COMPANIES = companiesData.getLirmaCompanies()
      ILU_COMPANIES = companiesData.getILUCompanies()
      LOGGER.info("Finished Loading IPLM Config Data")
    })
    _state = StartablePluginState.Started
    logCompaniesConfigDetails()
  }

  override function stop(b: boolean) {
    _state = StartablePluginState.Stopped
    _callbackHandler = null
  }

  private function logCompaniesConfigDetails() {
    LOGGER.debug("Following Data loaded from customer config iplm-company-config into memory")
    if (LLOYDS_COMPANIES.HasElements) {
      LLOYDS_COMPANIES.each(\elt -> {
        LOGGER.debug("_____________________")
        LOGGER.debug(elt.FirstId)
        LOGGER.debug(elt.Name)
        LOGGER.debug(elt.FirstAgency)
      })
    }

    if (LIRMA_COMPANIES.HasElements) {
      LIRMA_COMPANIES.each(\elt -> {
        LOGGER.debug("_____________________")
        LOGGER.debug(elt.FirstId)
        LOGGER.debug(elt.Name)
        LOGGER.debug(elt.FirstAgency)
      })
    }

    if (ILU_COMPANIES.HasElements) {
      ILU_COMPANIES.each(\elt -> {
        LOGGER.debug("_____________________")
        LOGGER.debug(elt.FirstId)
        LOGGER.debug(elt.Name)
        LOGGER.debug(elt.FirstAgency)
      })
    }
  }

  override property get State(): StartablePluginState {
    return _state
  }
}