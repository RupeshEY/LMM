package gw.api.name

uses java.lang.UnsupportedOperationException

@Export
class PolicySearchContactNameDelegate implements PersonNameFields {
  construct (searchCriteria : PolicySearchCriteria) {
    _searchCriteria = searchCriteria
  }

  var _searchCriteria : PolicySearchCriteria

  // for Contacts
  override property get Name() : String {
    return _searchCriteria.CompanyName
  }

  override property set Name(value : String) {
    _searchCriteria.CompanyName = value
  }

  override property get NameKanji() : String {
    return _searchCriteria.NameKanji
  }

  override property set NameKanji(value: String) {
    _searchCriteria.NameKanji = value
  }

  // for Persons
  override property get FirstName() : String {
    return _searchCriteria.FirstName
  }

  override property set FirstName(value : String) {
    _searchCriteria.FirstName = value
  }

  override property get LastName() : String {
    return _searchCriteria.LastName
  }

  override property set LastName(value : String) {
    _searchCriteria.LastName = value
  }

  override property get FirstNameKanji() : String {
    return _searchCriteria.FirstNameKanji
  }

  override property set FirstNameKanji(value : String) {
    _searchCriteria.FirstNameKanji = value
  }

  override property get LastNameKanji() : String {
    return _searchCriteria.LastNameKanji
  }

  override property set LastNameKanji(value : String) {
    _searchCriteria.LastNameKanji = value
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
    return new UnsupportedOperationException("Field is not used for SearchContactNameDelegate")
  }
}