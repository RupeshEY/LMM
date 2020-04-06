package gw.plugin.pcintegration.pc900.location

uses gw.api.upgrade.Coercions
uses gw.plugin.policy.location.CCPolicyLocationInfo
uses wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_PNIAddressFields
uses wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_PolicyLocationAddress
uses wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_TotalInsuredValues
uses wsi.remote.gw.webservice.pc.pc900.entities.types.complex.PolicyLocationInfo

uses java.math.BigDecimal

@Export
class CCPolicyLocationInfoImpl implements CCPolicyLocationInfo {
  private var _info : PolicyLocationInfo

  construct(info: PolicyLocationInfo) {
    _info = info
  }

  override property get PolicyNumber(): String {
    return _info.PolicyNumber
  }

  override property get PolicyLocationAddress(): gw.plugin.pcintegration.pc900.location.CCPolicyLocationInfoImpl.Address {
    return new gw.plugin.pcintegration.pc900.location.CCPolicyLocationInfoImpl.Address(_info.PolicyLocationAddress)
  }

  override property get PolicyLocationPolicySystemID(): String {
    return _info.PolicyLocationPolicySystemID
  }

  override property get PNIAddressFields(): PNIAddress {
    return new PNIAddress(_info.PNIAddressFields)
  }

  override property get PolicyLocationLatitude(): BigDecimal {
    return Coercions.makeBigDecimalFrom(_info.PolicyLocationLatitude)
  }

  override property get PolicyLocationLongitude(): BigDecimal {
    return Coercions.makeBigDecimalFrom(_info.PolicyLocationLongitude)
  }

  override property get PolicyLocationGeocodeStatus(): String {
    return _info.PolicyLocationGeocodeStatus
  }

  override property get ProductCode(): String {
    return _info.ProductCode
  }

  override property get PNIName(): String {
    return _info.PNIName
  }

  override property get PNIEmail(): String {
    return _info.PNIEmail
  }

  override property get PNIPhoneCountry() : PhoneCountryCode {
    return _info.PNIPhoneCountry!=null ? PhoneCountryCode.get(_info.PNIPhoneCountry) : null
  }

  override property get PNIPhoneNumber(): String {
    return _info.PNIPhoneNumber
  }

  override property get PNIPhoneExtension() : String {
    return _info.PNIPhoneExtension
  }

  override property get TotalInsuredValues(): gw.plugin.pcintegration.pc900.location.CCPolicyLocationInfoImpl.InsuredValue[] {
    return (_info.TotalInsuredValues.map(\insuredVal -> new gw.plugin.pcintegration.pc900.location.CCPolicyLocationInfoImpl.InsuredValue(insuredVal)))?.toTypedArray()
  }

  private class InsuredValue implements CCPolicyLocationInfo.InsuredValue {

    private var _insuredVal : PolicyLocationInfo_TotalInsuredValues

    construct(insuredVal : PolicyLocationInfo_TotalInsuredValues) {
      _insuredVal = insuredVal
    }

    override property get Name(): String {
      return _insuredVal.Name
    }

    override property get Value(): BigDecimal {
      return _insuredVal.Value
    }

    override property get Currency(): String {
      return _insuredVal.Currency
    }
  }

  private class Address implements CCPolicyLocationInfo.Address {
    private var _address : PolicyLocationInfo_PolicyLocationAddress

    construct(address: PolicyLocationInfo_PolicyLocationAddress) {
      _address = address
    }

    override property get AddressLine1(): String {
      return _address.AddressLine1
    }

    override property get AddressLine1Kanji(): String {
      return _address.AddressLine1Kanji
    }

    override property get AddressLine2(): String {
      return _address.AddressLine2
    }

    override property get AddressLine2Kanji(): String {
      return _address.AddressLine2Kanji
    }

    override property get AddressLine3(): String {
      return _address.AddressLine3
    }

    override property get City(): String {
      return _address.City
    }

    override property get CityKanji(): String {
      return _address.CityKanji
    }

    override property get County(): String {
      return _address.County
    }

    override property get State(): String {
      return _address.State
    }

    override property get PostalCode(): String {
      return _address.PostalCode
    }

    override property get CEDEX(): String {
      return _address.CEDEX as String
    }

    override property get CEDEXBureau(): String {
      return _address.CEDEXBureau
    }

    override property get Country(): String {
      return _address.Country
    }
  }

  private class PNIAddress implements CCPolicyLocationInfo.Address {
    private var _address : PolicyLocationInfo_PNIAddressFields

    construct(address: PolicyLocationInfo_PNIAddressFields) {
      _address = address
    }

    override property get AddressLine1(): String {
      return _address.AddressLine1
    }

    override property get AddressLine1Kanji(): String {
      return _address.AddressLine1Kanji
    }

    override property get AddressLine2(): String {
      return _address.AddressLine2
    }

    override property get AddressLine2Kanji(): String {
      return _address.AddressLine2Kanji
    }

    override property get AddressLine3(): String {
      return _address.AddressLine3
    }

    override property get City(): String {
      return _address.City
    }

    override property get CityKanji(): String {
      return _address.CityKanji
    }

    override property get County(): String {
      return _address.County
    }

    override property get State(): String {
      return _address.State
    }

    override property get PostalCode(): String {
      return _address.PostalCode
    }

    override property get CEDEX(): String {
      return _address.CEDEX as String
    }

    override property get CEDEXBureau(): String {
      return _address.CEDEXBureau
    }

    override property get Country(): String {
      return _address.Country
    }
  }
}
