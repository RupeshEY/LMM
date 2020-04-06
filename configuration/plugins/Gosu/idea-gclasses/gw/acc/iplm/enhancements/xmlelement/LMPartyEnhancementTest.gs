package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Id
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party
uses gw.testharness.v3.GUnitTestClass

class LMPartyEnhancementTest extends GUnitTestClass {

  var _partyElement : Party

  override function beforeMethod() {
    var id = new Id()
    id.Value = "0079"
    id.Agency = "lloyds"

    _partyElement = new Party()
    _partyElement.Id_elem.add(id)
  }

  function testFirstId() {
    assertEquals("The First ID does not match the XML value", _partyElement.Id_elem.first().Value, _partyElement.FirstId)
  }

  function testFirstAgency() {
    assertEquals("The First Agency does not match the XML value", _partyElement.Id_elem.first().Agency, _partyElement.FirstAgency)
  }
}