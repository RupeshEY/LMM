package gw.api.name

uses java.lang.UnsupportedOperationException

@Export
class AddressBookSearchNameDelegate implements ContactNameFields, PersonNameFields {

  construct (nameCriteria : ContactSearchCriteria) {
    _nameCriteria = nameCriteria
  }

  var _nameCriteria : ContactSearchCriteria

  // for Contacts
  override property get Name() : String {
    return _nameCriteria.Keyword
  }

  override property set Name(value : String) {
    _nameCriteria.Keyword = value
  }

  override property get NameKanji() : String {
    return _nameCriteria.KeywordKanji
  }

  override property set NameKanji(value: String) {
    _nameCriteria.KeywordKanji = value
  }

  // for Persons
  override property get FirstName() : String {
    return _nameCriteria.FirstName
  }

  override property set FirstName(value : String) {
    _nameCriteria.FirstName = value
  }

  override property get LastName() : String {
    return _nameCriteria.Keyword
  }

  override property set LastName(value : String) {
    _nameCriteria.Keyword = value
  }

  override property get FirstNameKanji() : String {
    return _nameCriteria.FirstNameKanji
  }

  override property set FirstNameKanji(value : String) {
    _nameCriteria.FirstNameKanji = value
  }

  override property get LastNameKanji() : String {
    return _nameCriteria.KeywordKanji
  }

  override property set LastNameKanji(value : String) {
    _nameCriteria.KeywordKanji = value
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
    return new UnsupportedOperationException("Field is not used for AddressBookSearchNameDelegate")
  }

}
