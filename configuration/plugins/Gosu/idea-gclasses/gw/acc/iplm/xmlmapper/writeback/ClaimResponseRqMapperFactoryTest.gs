package gw.acc.iplm.xmlmapper.writeback

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xmlmapper.writeback.ilu.ILULeadClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.ilu.ILUSAPClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.lirma.LirmaLeadClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.lirma.LirmaSAPClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.lloyds.LloydsLeadClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.lloyds.LloydsSAPClaimResponseRqMapper
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass

class ClaimResponseRqMapperFactoryTest extends GUnitTestClass {

  private static var factory = new ClaimResponseRqMapperFactory()

  public function testMapperTypeLloydsLead() {
    var claimresponseRq = ECFMessageEntityUtil.createClaimResponseRq()
    var mapper = factory.getMapper(claimresponseRq)
    assertEquals(LloydsLeadClaimResponseRqMapper.Type, mapper.IntrinsicType)
  }

  public function testMapperTypeLloydsSap() {
    var sample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-Lloyds-AP-SAMPLE.xml")
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(sample)
    var claimresponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimresponseXml)
    var mapper = factory.getMapper(claimresponseRq)
    assertEquals(LloydsSAPClaimResponseRqMapper.Type, mapper.IntrinsicType)
  }

  public function testMapperTypeLirmaLead() {
    var sample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-Lirma-Lead-SAMPLE.xml")
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(sample)
    var claimresponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimresponseXml)
    var mapper = factory.getMapper(claimresponseRq)
    assertEquals(LirmaLeadClaimResponseRqMapper.Type, mapper.IntrinsicType)
  }

  public function testMapperTypeLirmaSap() {
    var sample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-Lirma-AP-SAMPLE.xml")
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(sample)
    var claimresponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimresponseXml)
    var mapper = factory.getMapper(claimresponseRq)
    assertEquals(LirmaSAPClaimResponseRqMapper.Type, mapper.IntrinsicType)
  }

  public function testMapperTypeILULead() {
    var sample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-ILU-Lead-SAMPLE.xml")
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(sample)
    var claimresponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimresponseXml)
    var mapper = factory.getMapper(claimresponseRq)
    assertEquals(ILULeadClaimResponseRqMapper.Type, mapper.IntrinsicType)
  }

  public function testMapperTypeILUSap() {
    var sample = ConfigAccess.getConfigFile("config/iplm/testresources/claimresponse/ClaimResponseRq-ILU-AP-SAMPLE.xml")
    var claimresponseXml = ECFMessageUtil.createNewClaimResponseRq(sample)
    var claimresponseRq = ECFMessageEntityUtil.createClaimResponseRq(claimresponseXml)
    var mapper = factory.getMapper(claimresponseRq)
    assertEquals(ILUSAPClaimResponseRqMapper.Type, mapper.IntrinsicType)
  }

}