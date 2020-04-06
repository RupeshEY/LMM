package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.ecfwb.claimnotify.ClaimNotifyRqEntityMapper
uses gw.acc.iplm.services.message.ecfwriteback.ClaimNotifyService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Claimant
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.api.locale.DisplayKey
uses gw.api.util.ConfigAccess
uses gw.testharness.v3.GUnitTestClass
uses gw.xml.XmlElement

class ClaimantBuilderTest extends GUnitTestClass {

  function testCreateNewPolicyInsuredClaimant() {
    var notifyRqXml = ECFMessageUtil.createNewXmlMessage(ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE.xml"))
    var claimNotifyRq = ClaimNotifyEventRq.parse(notifyRqXml.asUTFString())
    claimNotifyRq.ClaimMovement.removeChild(Claimant.$QNAME)
    claimNotifyRq.UCR = ClaimBuilderHelper.getNextUCR()
    var ClaimNotifyRqEntityMapper = new ClaimNotifyRqEntityMapper()
    var EecfMessageDTO = new LMMessageDTO(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT, claimNotifyRq, null)
    var cn: ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cn = ClaimNotifyRqEntityMapper.createNewLMMessage(EecfMessageDTO) as ECFMessageClaimNotifyRq_Ext
      cn.Content = new Blob(claimNotifyRq.asUTFString().Bytes)
    }, User.util.UnrestrictedUser)
    try {
      new ClaimNotifyService().process(cn)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }

    cn = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, cn.UUID).select().AtMostOneRow as ECFMessageClaimNotifyRq_Ext
    assertEquals("Exposue should be created", 1, cn.Claim.Exposures.length)
    assertEquals("Property damage exposure must be created", ExposureType.TC_PROPERTYDAMAGE, cn.Claim.Exposures.first().ExposureType)
    assertTrue("Party Name should be saved in the exposure", cn.Claim.Exposures.first().DisplayName.contains(cn.Claim.Insured.DisplayName))
  }


  function testUpdateInsuredClaimant() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var notifyRqXml1 = ECFMessageUtil.createNewXmlMessage(ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE.xml"))
    var claimNotifyRq1 = ClaimNotifyEventRq.parse(notifyRqXml1.asUTFString())
    claimNotifyRq1.ClaimMovement.removeChild(Claimant.$QNAME)
    claimNotifyRq1.UCR = ucr
    var ClaimNotifyRqEntityMapper = new ClaimNotifyRqEntityMapper()
    var EecfMessageDTO1 = new LMMessageDTO(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT, claimNotifyRq1, null)

    var notifyRqXml2 = ECFMessageUtil.createNewXmlMessage(ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE.xml"))
    var claimNotifyRq2 = ClaimNotifyEventRq.parse(notifyRqXml2.asUTFString())
    claimNotifyRq2.UCR = ucr
    claimNotifyRq2.ClaimMovement.removeChild(Claimant.$QNAME)
    var EecfMessageDTO2 = new LMMessageDTO(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT, claimNotifyRq2, null)

    var cn1: ECFMessageClaimNotifyRq_Ext
    var cn2: ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cn1 = ClaimNotifyRqEntityMapper.createNewLMMessage(EecfMessageDTO1) as ECFMessageClaimNotifyRq_Ext
      cn1.Content = new Blob(claimNotifyRq1.asUTFString().Bytes)

      cn2 = ClaimNotifyRqEntityMapper.createNewLMMessage(EecfMessageDTO2) as ECFMessageClaimNotifyRq_Ext
      cn2.Content = new Blob(claimNotifyRq2.asUTFString().Bytes)
    }, User.util.UnrestrictedUser)
    try {
      new ClaimNotifyService().process(cn1)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }
    cn1 = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, cn1.UUID).select().AtMostOneRow as ECFMessageClaimNotifyRq_Ext
    try {
      new ClaimNotifyService().process(cn2)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }
    cn2 = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, cn2.UUID).select().AtMostOneRow as ECFMessageClaimNotifyRq_Ext
    assertEquals("Exposue should be created", 1, cn1.Claim.Exposures.length)
    assertEquals("Property damage exposure must be created", ExposureType.TC_PROPERTYDAMAGE, cn1.Claim.Exposures.first().ExposureType)
    assertTrue("Party Name should be saved in the exposure", cn1.Claim.Exposures.first().DisplayName.contains(cn1.Claim.Insured.DisplayName))
  }

  function testCreateNewMessageClaimant() {
    var notifyRqXml = ECFMessageUtil.createNewXmlMessage(ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE.xml"))
    var claimants = new ArrayList<Claimant>()
    var claimant = new Claimant()
    claimant.Party = new Party()
    claimant.Party.Name = "Test Claimant"
    claimants.add(claimant)
    var claimNotifyRq = ClaimNotifyEventRq.parse(notifyRqXml.asUTFString())
    claimNotifyRq.ClaimMovement.Claimant = claimants
    claimNotifyRq.UCR = ClaimBuilderHelper.getNextUCR()
    var ClaimNotifyRqEntityMapper = new ClaimNotifyRqEntityMapper()
    var EecfMessageDTO = new LMMessageDTO(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT, XmlElement.parse(claimNotifyRq.asUTFString()), null)
    var cn: ECFMessageClaimNotifyRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cn = ClaimNotifyRqEntityMapper.createNewLMMessage(EecfMessageDTO) as ECFMessageClaimNotifyRq_Ext
      cn.Content = new Blob(claimNotifyRq.asUTFString().Bytes)
    }, User.util.UnrestrictedUser)

    try {
      new ClaimNotifyService().process(cn)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }
    cn = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, cn.UUID).select().AtMostOneRow as ECFMessageClaimNotifyRq_Ext
    assertEquals("Exposue should be created", 1, cn.Claim.Exposures.length)
    assertEquals("Property damage exposure must be created", ExposureType.TC_PROPERTYDAMAGE, cn.Claim.Exposures.first().ExposureType)
    assertTrue("Party Name should be saved in the exposure", cn.Claim.Exposures.first().DisplayName.contains(claimNotifyRq.ClaimMovement.Claimant.first().Party.Name))
  }

  function testUpdateMessageClaimant() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var notifyRqXml1 = ECFMessageUtil.createNewXmlMessage(ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE.xml"))
    var claimants1 = new ArrayList<Claimant>()
    var claimant1 = new Claimant()
    claimant1.Party = new Party()
    claimant1.Party.Name = "Test Claimant"
    claimants1.add(claimant1)
    var claimNotifyRq1 = ClaimNotifyEventRq.parse(notifyRqXml1.asUTFString())
    claimNotifyRq1.ClaimMovement.Claimant = claimants1
    claimNotifyRq1.UCR = ucr

    var notifyRqXml2 = ECFMessageUtil.createNewXmlMessage(ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-SAMPLE.xml"))
    var claimants2 = new ArrayList<Claimant>()
    var claimant2 = new Claimant()
    claimant2.Party = new Party()
    claimant2.Party.Name = "Test Claimant"
    claimants2.add(claimant2)
    var claimNotifyRq2 = ClaimNotifyEventRq.parse(notifyRqXml2.asUTFString())
    claimNotifyRq2.ClaimMovement.Claimant = claimants2
    claimNotifyRq2.UCR = ucr

    var ClaimNotifyRqEntityMapper = new ClaimNotifyRqEntityMapper()
    var EecfMessageDTO1 = new LMMessageDTO(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT, XmlElement.parse(claimNotifyRq1.asUTFString()), null)
    var cn1: ECFMessageClaimNotifyRq_Ext

    var EecfMessageDTO2 = new LMMessageDTO(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT, XmlElement.parse(claimNotifyRq2.asUTFString()), null)
    var cn2: ECFMessageClaimNotifyRq_Ext

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cn1 = ClaimNotifyRqEntityMapper.createNewLMMessage(EecfMessageDTO1) as ECFMessageClaimNotifyRq_Ext
      cn1.Content = new Blob(claimNotifyRq1.asUTFString().Bytes)
      cn2 = ClaimNotifyRqEntityMapper.createNewLMMessage(EecfMessageDTO2) as ECFMessageClaimNotifyRq_Ext
      cn2.Content = new Blob(claimNotifyRq2.asUTFString().Bytes)
    }, User.util.UnrestrictedUser)

    try {
      new ClaimNotifyService().process(cn1)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }
    cn1 = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, cn1.UUID).select().AtMostOneRow as ECFMessageClaimNotifyRq_Ext
    try {
      new ClaimNotifyService().process(cn2)
    } catch (ex: Exception) {
      assertTrue(ex.Message.contains(DisplayKey.get("Accelerator.IPLM.Exception.UnreachableGateway")))
    }
    cn2 = gw.api.database.Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, gw.api.database.Relop.Equals, cn2.UUID).select().AtMostOneRow as ECFMessageClaimNotifyRq_Ext
    assertEquals("Exposue should be created", 1, cn1.Claim.Exposures.length)
    assertEquals("Property damage exposure must be created", ExposureType.TC_PROPERTYDAMAGE, cn1.Claim.Exposures.first().ExposureType)
    assertTrue("Party Name should be saved in the exposure", cn1.Claim.Exposures.first().DisplayName.contains(claimNotifyRq1.ClaimMovement.Claimant.first().Party.Name))
  }
}