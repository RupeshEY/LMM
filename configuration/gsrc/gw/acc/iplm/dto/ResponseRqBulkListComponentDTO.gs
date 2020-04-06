package gw.acc.iplm.dto

uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_BulkList_Component
uses gw.pl.currency.MonetaryAmount
uses typekey.Currency

uses java.math.BigInteger

class ResponseRqBulkListComponentDTO {

  var _componentXml: ClaimResponseRq_ClaimResponse_LeadResponse_BulkList_Component as readonly ComponentXml

  construct() {
  }

  construct(componentXml: ClaimResponseRq_ClaimResponse_LeadResponse_BulkList_Component) {
    _componentXml = componentXml
  }

  property get ComponentLineNo(): BigInteger {
    return _componentXml.ComponentLineNo
  }

  property get Ccy(): Currency {
    return _componentXml.Ccy == null ? null : Currency.get(_componentXml.Ccy)
  }

  property get VatAmount(): MonetaryAmount {
    return _componentXml.ImportedServicesAmount == null ? emptyMonetary() : new MonetaryAmount(_componentXml.VatAmount, Ccy)
  }

  property set VatAmount(val: MonetaryAmount) {
    _componentXml.VatAmount = val.Amount
  }

  property get ImportedServicesAmount(): MonetaryAmount {
    return _componentXml.ImportedServicesAmount == null ? emptyMonetary() : new MonetaryAmount(_componentXml.ImportedServicesAmount, Ccy)
  }

  property set ImportedServicesAmount(val: MonetaryAmount) {
    _componentXml.ImportedServicesAmount = val.Amount
  }

  property get ImportedServicesNarrative(): String {
    return _componentXml.ImportedServicesNarrative
  }

  property set ImportedServicesNarrative(val: String) {
    _componentXml.ImportedServicesNarrative = val
  }

  private function emptyMonetary(): MonetaryAmount {
    return new MonetaryAmount(0, Currency.TC_EUR)
  }
}