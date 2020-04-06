package gw.entity

uses gw.api.address.AddressHandlingMethods
uses gw.pl.persistence.core.Bundle

@Export
class AddressHandlingMethodsImpl implements AddressHandlingMethods{

  var _address : Address

  construct( address : Address ) {
    _address = address
  }

  override function cloneAddress() : Address {

    var address = _address.coreCloneAddress()
    address.CEDEX = _address.CEDEX
    address.CEDEXBureau = _address.CEDEXBureau
    address.CityKanji = _address.CityKanji
    address.AddressLine1Kanji= _address.AddressLine1Kanji
    address.AddressLine2Kanji = _address.AddressLine2Kanji

    return address
  }

  override function cloneAddress(bundle: Bundle): Address {
    var address = _address.coreCloneAddress(bundle)
    address.CEDEX = _address.CEDEX
    address.CEDEXBureau = _address.CEDEXBureau
    address.CityKanji = _address.CityKanji
    address.AddressLine1Kanji= _address.AddressLine1Kanji
    address.AddressLine2Kanji = _address.AddressLine2Kanji

    return address
  }

  override function syncAddressFields(changedAddress: Address) {
    _address.coreSyncAddressFields(changedAddress)
    _address.CEDEX = changedAddress.CEDEX
    _address.CEDEXBureau = changedAddress.CEDEXBureau
    _address.CityKanji = changedAddress.CityKanji
    _address.AddressLine1Kanji = changedAddress.AddressLine1Kanji
    _address.AddressLine2Kanji = changedAddress.AddressLine2Kanji
  }
}