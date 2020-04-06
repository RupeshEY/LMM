package gw.sampledata
uses gw.pl.persistence.core.Bundle

@Export
class SampleRefTables extends SampleDataBase {

  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  // used by datagen to generate the wc calculations reference data
  construct() {
    super(new SampleDataCache())
  }

  // used by datagen to generate the wc calculations reference data
  function loadForDatagen() {
    gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
      testSampleData(bundle)})
  }
  
  override property get Description() : String {
    return "Reference Tables"
  }
    
  override function testSampleData(bundle : Bundle) {

    new gw.api.databuilder.InvalidCoverageForFaultBuilder()
      .withFaultRating(TC_THIRDPARTY)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:9")
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForFaultBuilder()
      .withFaultRating(TC_NOFAULT)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:10")
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForFaultBuilder()
      .withFaultRating(TC_0)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:32")
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)




    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_ANIMAL)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:101")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_FIRE)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:102")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_LOADINGDAMAGE)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:103")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_VANDALISM)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:104")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_RIOTANDCIVIL)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:105")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_THEFTENTIRE)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:106")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_THEFTPARTS)
      .withPrimaryCoverage(TC_PALIABILITYCOV)
      .withPublicId("cc_content:107")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)

    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_ANIMAL)
      .withPrimaryCoverage(TC_PACOLLISIONCOV)
      .withPublicId("cc_content:108")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_FIRE)
      .withPrimaryCoverage(TC_PACOLLISIONCOV)
      .withPublicId("cc_content:109")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_RIOTANDCIVIL)
      .withPrimaryCoverage(TC_PACOLLISIONCOV)
      .withPublicId("cc_content:112")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_THEFTENTIRE)
      .withPrimaryCoverage(TC_PACOLLISIONCOV)
      .withPublicId("cc_content:113")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_THEFTPARTS)
      .withPrimaryCoverage(TC_PACOLLISIONCOV)
      .withPublicId("cc_content:114")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_VEHCOLLISION)
      .withPrimaryCoverage(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:115")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_TRAINBUSCOLL)
      .withPrimaryCoverage(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:116")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_LEFTCOLLISION)
      .withPrimaryCoverage(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:117")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_BIKECOLLISION)
      .withPrimaryCoverage(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:118")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_FIXEDOBJCOLL)
      .withPrimaryCoverage(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:119")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_OTHEROBJCOLL)
      .withPrimaryCoverage(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:120")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_PEDCOLLISION)
      .withPrimaryCoverage(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:121")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_REAREND)
      .withPrimaryCoverage(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:122")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_ROLLOVER)
      .withPrimaryCoverage(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:123")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_ANIMAL)
      .withPrimaryCoverage(TC_PAUIMBICOV)
      .withPublicId("cc_content:124")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.InvalidCoverageForCauseBuilder()
      .withLOBCode(TC_PERSONALAUTOLINE)
      .withLossCause(TC_ANIMAL)
      .withPrimaryCoverage(TC_PAUMBICOV)
      .withPublicId("cc_content:125")
      .withLossType(TC_AUTO)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)




    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PACOLLISIONCOV)
      .withPublicId("cc_content:1")
      .withNewExposureCoverage(TC_PACOMPREHENSIVECOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:2")
      .withNewExposureCoverage(TC_PACOLLISIONCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PALIABILITYCOV)
      .withPublicId("cc_content:3")
      .withNewExposureCoverage(TC_PACOMPREHENSIVECOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:4")
      .withNewExposureCoverage(TC_PALIABILITYCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_GLCGLCOV)
      .withPublicId("cc_content:6")
      .withNewExposureCoverage(TC_PACOMPREHENSIVECOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PACOMPREHENSIVECOV)
      .withPublicId("cc_content:7")
      .withNewExposureCoverage(TC_GLCGLCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAMEDPAYCOV)
      .withPublicId("cc_content:63")
      .withNewExposureCoverage(TC_PAPIP_TX)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAMEDPAYCOV)
      .withPublicId("cc_content:64")
      .withNewExposureCoverage(TC_PAPIP_PA)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAMEDPAYCOV)
      .withPublicId("cc_content:65")
      .withNewExposureCoverage(TC_PAPIP_DC)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAMEDPAYCOV)
      .withPublicId("cc_content:66")
      .withNewExposureCoverage(TC_PAPIP_DE)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAMEDPAYCOV)
      .withPublicId("cc_content:67")
      .withNewExposureCoverage(TC_PAPIP_AR)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAMEDPAYCOV)
      .withPublicId("cc_content:68")
      .withNewExposureCoverage(TC_PAPIP_HI)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAMEDPAYCOV)
      .withPublicId("cc_content:69")
      .withNewExposureCoverage(TC_PAPIP_MD)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_TX)
      .withPublicId("cc_content:71")
      .withNewExposureCoverage(TC_PAMEDPAYCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_PA)
      .withPublicId("cc_content:72")
      .withNewExposureCoverage(TC_PAMEDPAYCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_DC)
      .withPublicId("cc_content:73")
      .withNewExposureCoverage(TC_PAMEDPAYCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_MD)
      .withPublicId("cc_content:77")
      .withNewExposureCoverage(TC_PAMEDPAYCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_TX)
      .withPublicId("cc_content:79")
      .withNewExposureCoverage(TC_PAUIMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_TX)
      .withPublicId("cc_content:80")
      .withNewExposureCoverage(TC_PAUMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_PA)
      .withPublicId("cc_content:81")
      .withNewExposureCoverage(TC_PAUIMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_PA)
      .withPublicId("cc_content:82")
      .withNewExposureCoverage(TC_PAUMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_DC)
      .withPublicId("cc_content:83")
      .withNewExposureCoverage(TC_PAUIMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_DC)
      .withPublicId("cc_content:84")
      .withNewExposureCoverage(TC_PAUMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_MD)
      .withPublicId("cc_content:91")
      .withNewExposureCoverage(TC_PAUIMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_MD)
      .withPublicId("cc_content:92")
      .withNewExposureCoverage(TC_PAUMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_DE)
      .withPublicId("cc_content:95")
      .withNewExposureCoverage(TC_PAMEDPAYCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_DE)
      .withPublicId("cc_content:96")
      .withNewExposureCoverage(TC_PAUIMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_DE)
      .withPublicId("cc_content:97")
      .withNewExposureCoverage(TC_PAUMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_NJ)
      .withPublicId("cc_content:98")
      .withNewExposureCoverage(TC_PAMEDPAYCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_NJ)
      .withPublicId("cc_content:99")
      .withNewExposureCoverage(TC_PAUIMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_NJ)
      .withPublicId("cc_content:100")
      .withNewExposureCoverage(TC_PAUMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_NY)
      .withPublicId("cc_content:101")
      .withNewExposureCoverage(TC_PAMEDPAYCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_NY)
      .withPublicId("cc_content:102")
      .withNewExposureCoverage(TC_PAUIMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_NY)
      .withPublicId("cc_content:103")
      .withNewExposureCoverage(TC_PAUMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_ND)
      .withPublicId("cc_content:104")
      .withNewExposureCoverage(TC_PAMEDPAYCOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_ND)
      .withPublicId("cc_content:105")
      .withNewExposureCoverage(TC_PAUIMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.IncompatibleNewExposureBuilder()
      .withExistingExposures(TC_PAPIP_ND)
      .withPublicId("cc_content:106")
      .withNewExposureCoverage(TC_PAUMBICOV)
      .withPolicyType(TC_PERSONALAUTO)
      .create(bundle)


    new gw.api.databuilder.ReinsuranceThresholdBuilder()
      .withLossType(TC_PR)
      .withTreatyType(TC_PROP)
      .withThresholdValue(1000000)
      .withPolicyType(TC_HOMEOWNERS)
      .withReportingThreshold(75)
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_HODW_DWELLING_COV_HOE))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_HODW_OTHER_STRUCTURES_HOE))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_HODW_PERSONAL_PROPERTY_HOE))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_HODW_SCHEDULEDPROPERTY_HOE))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_HODW_LOSS_OF_USE_HOE))
      .withLossCause( new gw.api.databuilder.ReinsuranceLossCauseBuilder()
        .withLossCause(TC_FIRE))
      .withLossCause( new gw.api.databuilder.ReinsuranceLossCauseBuilder()
        .withLossCause(TC_BURGLARY))
      .create(bundle)


    new gw.api.databuilder.ReinsuranceThresholdBuilder()
      .withLossType(TC_PR)
      .withTreatyType(TC_LIAB)
      .withThresholdValue(1000000)
      .withPolicyType(TC_HOMEOWNERS)
      .withReportingThreshold(75)
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_HOLI_MED_PAY_HOE))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_HOLI_PERSONAL_LIABILITY_HOE))
      .create(bundle)


    new gw.api.databuilder.ReinsuranceThresholdBuilder()
      .withLossType(TC_AUTO)
      .withTreatyType(TC_LIAB)
      .withThresholdValue(1000000)
      .withPolicyType(TC_PERSONALAUTO)
      .withReportingThreshold(75)
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_PALIABILITYCOV))
      .create(bundle)

    new gw.api.databuilder.ReinsuranceThresholdBuilder()
      .withLossType(TC_AUTO)
      .withTreatyType(TC_LIAB)
      .withThresholdValue(1000000)
      .withPolicyType(TC_BUSINESSAUTO)
      .withReportingThreshold(75)
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_BAHIREDLIABILITYCOV))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_BANONOWNEDLIABCOV))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_BAOWNEDLIABILITYCOV))
      .create(bundle)

    new gw.api.databuilder.ReinsuranceThresholdBuilder()
      .withLossType(TC_PR)
      .withTreatyType(TC_PROP)
      .withThresholdValue(1000000)
      .withPolicyType(TC_COMMERCIALPROPERTY)
      .withReportingThreshold(75)
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_CPBLDGCOV))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_CPBPPCOV))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_CPBLDGEXTRAEXPENSECOV))
// Commented out so that we have one CP coverage that is not included in the total for testing RI thresholds for testing purposes
//      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
//        .withCoverage("CPBldgBusIncomeCov"))
      .withLossCause( new gw.api.databuilder.ReinsuranceLossCauseBuilder()
        .withLossCause(TC_FIRE))
      .withLossCause( new gw.api.databuilder.ReinsuranceLossCauseBuilder()
        .withLossCause(TC_BURGLARY))
      .create(bundle)

/* KenB 7/3/10: no equivalent coverage in the new PC codes
    new gw.api.databuilder.ReinsuranceThresholdBuilder()
      .withLossType("pr")
      .withTreatyType("liab")
      .withThresholdValue(1000000)
      .withPolicyType("CommercialProperty")
      .withReportingThreshold(75)
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage("LGLLIAB"))
      .create(bundle)
*/

    new gw.api.databuilder.ReinsuranceThresholdBuilder()
      .withLossType(TC_GL)
      .withTreatyType(TC_LIAB)
      .withThresholdValue(1000000)
      .withPolicyType(TC_GENERALLIABILITY)
      .withReportingThreshold(75)
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_GLCGLCOV))
// Commented out so that we have 1 GL coverage which is not included in the GL Reinsurance threshold for testing purposes
//      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
//        .withCoverage("GLLiquorEndorsement"))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_POLLUTIONBROADLIMITED))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_PRODUCTWITHDRAWALLTD))
      .withCoverageType( new gw.api.databuilder.ReinsuranceCoverageBuilder()
        .withCoverage(TC_GLEMPBENEFITSLIABILITYCOV))
      .create(bundle)


    new gw.api.databuilder.ReinsuranceThresholdBuilder()
      .withLossType(TC_WC)
      .withTreatyType(TC_WC)
      .withThresholdValue(1000000)
      .withPolicyType(TC_WORKERSCOMP)
      .withReportingThreshold(75)
      .create(bundle)
  }
  
  override function demoSampleData(bundle : Bundle) {
    super.demoSampleData( bundle )
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_BUSINESSOWNERS )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(25000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_BUSINESSOWNERS )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(25000) )
      .create(bundle)                    
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_BUSINESSAUTO )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(50000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_BUSINESSAUTO )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(50000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_COMMERCIALPROPERTY )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(100000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_COMMERCIALPROPERTY )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(100000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_FARMOWNERS )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(10000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_FARMOWNERS )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(10000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_GENERALLIABILITY )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(50000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_GENERALLIABILITY )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(50000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_HOMEOWNERS )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(10000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_HOMEOWNERS )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(10000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_INLANDMARINE )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(25000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_INLANDMARINE )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(25000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_PERSONALAUTO )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(20000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_PERSONALAUTO )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(20000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_PROF_LIABILITY )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(100000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_PROF_LIABILITY )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(100000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_WORKERSCOMP )
      .withNotificationType( LargeLossNotificationType.TC_CC )
      .withThresholdValue( new java.math.BigDecimal(50000) )
      .create(bundle)
    
    new gw.api.databuilder.LargeLossThresholdBuilder()
      .withPolicyType( PolicyType.TC_WORKERSCOMP )
      .withNotificationType( LargeLossNotificationType.TC_PS )
      .withThresholdValue( new java.math.BigDecimal(25000) )
      .create(bundle)                     
  }
}
