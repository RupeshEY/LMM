package gw.acc.iplm.config

uses gw.testharness.v3.GUnitTestClass

class LMCustomerConfigUtilTest extends GUnitTestClass {

  function testIsInsurerRegisteredMember_Lloyds(): void {
    assertTrue(LMCustomerConfigUtil.isInsurerRegisteredMember("lloyds", "urn:lloyds:2623"))
  }

  function testIsInsurerRegisteredMember_Lirma(): void {
    assertTrue(LMCustomerConfigUtil.isInsurerRegisteredMember("lirma", "urn:lirma:C1104"))
  }

  function testIsInsurerRegisteredMember_Ilu(): void {
    assertTrue(LMCustomerConfigUtil.isInsurerRegisteredMember("ilu", "urn:ilu:402801"))
  }

  function testIsInsurerRegisteredMember_WrongBureauAndId(): void {
    assertFalse(LMCustomerConfigUtil.isInsurerRegisteredMember("lirma", "urn:lloyds:2623"))
  }

  function testIsInsurerRegisteredMember_NullBureau(): void {
    assertFalse(LMCustomerConfigUtil.isInsurerRegisteredMember(null, "urn:lloyds:2623"))
  }

  function testIsInsurerRegisteredMember_NullId(): void {
    assertFalse(LMCustomerConfigUtil.isInsurerRegisteredMember("ilu", null))
  }

  function testIsInsurerRegisteredMember_EmptyBureau(): void {
    assertFalse(LMCustomerConfigUtil.isInsurerRegisteredMember("  ", "urn:lloyds:2623"))
  }

  function testIsInsurerRegisteredMember_EmptyId(): void {
    assertFalse(LMCustomerConfigUtil.isInsurerRegisteredMember("ilu", "  "))
  }

  function testIsLloydsMember_IsLloyds() {
    assertTrue(LMCustomerConfigUtil.isLloydsMember("lloyds", "urn:lloyds:2623"))
  }

  function testIsLloydsMember_NotLloyds() {
    assertFalse(LMCustomerConfigUtil.isLloydsMember("lirma", "urn:lirma:C1104"))
  }

  function testIsLirmaMember_IsLirma() {
    assertTrue(LMCustomerConfigUtil.isLirmaMember("lirma", "urn:lirma:C1104"))
  }

  function testIsLirmaMember_NotLirma() {
    assertFalse(LMCustomerConfigUtil.isLirmaMember("lloyds", "urn:lloyds:2623"))
  }

  function testIsIluMember_IsIlu() {
    assertTrue(LMCustomerConfigUtil.isIluMember("ilu", "urn:ilu:402801"))
  }

  function testIsIluMember_NotIlu() {
    assertFalse(LMCustomerConfigUtil.isIluMember("lloyds", "urn:lloyds:2623"))
  }

}