package gw.api.financials

uses gw.api.address.SimpleAddressOwner
uses gw.lang.Export

@Export
class CheckMethodsImpl implements CheckMethods {

  var _check: Check

  construct(check: Check) {
    this._check = check
  }

  override property get AddressOwner(): SimpleAddressOwner {
    return _check.CheckAddressOwner
  }

  override function getDefaultTargetReservingCurrencyForTransfer(targetClaim: Claim): Currency {
    return targetClaim?.Currency
  }

}