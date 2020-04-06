package gw.api.name

uses java.lang.UnsupportedOperationException

@Export
class ClaimAssociationNameDelegate implements PersonNameFields, ContactNameFields {
  construct (nameCriteria : ClaimAssociationSearchCriteria) {
    _nameCriteria = nameCriteria
  }

  var _nameCriteria : ClaimAssociationSearchCriteria

  // for Persons
  override property get FirstName() : String {
    return _nameCriteria.FirstName
  }

  override property set FirstName(value : String) {
    _nameCriteria.FirstName = value
  }

  override property get LastName() : String {
    return _nameCriteria.LastName
  }

  override property set LastName(value : String) {
    _nameCriteria.LastName = value
  }

  override property get FirstNameKanji() : String {
    return _nameCriteria.FirstNameKanji
  }

  override property set FirstNameKanji(value : String) {
    _nameCriteria.FirstNameKanji = value
  }

  override property get LastNameKanji() : String {
    return _nameCriteria.LastNameKanji
  }

  override property set LastNameKanji(value : String) {
    _nameCriteria.LastNameKanji = value
  }


  // For Contacts
  override property get Name() : String {
    return _nameCriteria.CompanyName
  }

  override property set Name(value : String) {
    _nameCriteria.CompanyName = value
  }

  override property get NameKanji() : String {
    return _nameCriteria.NameKanji
  }

  override property set NameKanji(value : String) {
    _nameCriteria.NameKanji = value
  }



  // not supported

  override property get MiddleName() : String {
    return null
  }

  override property set MiddleName(value : String) {
    throw notSupported()
  }

  override property get Particle() : String {
    return null
  }

  override property set Particle(value : String) {
    throw notSupported()
  }

  override property get Prefix(): typekey.NamePrefix {
    return null
  }

  override property set Prefix(value: typekey.NamePrefix) {
    throw notSupported()
  }

  override property get Suffix(): typekey.NameSuffix {
    return null
  }

  override property set Suffix(value: typekey.NameSuffix) {
    throw notSupported()
  }


  private function notSupported() : UnsupportedOperationException {
    return new UnsupportedOperationException("Field is not used for ClaimAssociationNameDelegate")
  }

}
