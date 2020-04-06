package gw.api.name
uses java.lang.UnsupportedOperationException
uses gw.api.contact.ContactHandle

@Export
class CCContactHandlePersonNameDelegate implements PersonNameFields {
  private var _contactHandle : ContactHandle

  construct(contactHandle : ContactHandle) {
    if(contactHandle.getContact() typeis Person) {
      _contactHandle = contactHandle
    } else {
      throw new UnsupportedOperationException("PersonNameDelegate only supports Person types")
    }
  }
  
  override property get FirstName() : String {
    return (_contactHandle.getContact() as Person).FirstName
  }

  override property set FirstName(value : String) {
    (_contactHandle.getContact() as Person).FirstName = value
  }

  override property get MiddleName() : String {
    return (_contactHandle.getContact() as Person).MiddleName
  }

  override property set MiddleName(value : String) {
    (_contactHandle.getContact() as Person).MiddleName = value
  }

  override property get Particle() : String {
    return (_contactHandle.getContact() as Person).Particle
  }
  
  override property set Particle(value : String) {
    (_contactHandle.getContact() as Person).Particle = value
  }

  override property get LastName() : String {
    return (_contactHandle.getContact() as Person).LastName
  }

  override property set LastName(value : String) {
   (_contactHandle.getContact() as Person).LastName = value
  }

  override property get Prefix() : NamePrefix {
    return (_contactHandle.getContact() as Person).Prefix
  }

  override property set Prefix(value : NamePrefix) {
    (_contactHandle.getContact() as Person).Prefix = value
  }

  override property get Suffix() : NameSuffix {
    return (_contactHandle.getContact() as Person).Suffix
  }

  override property set Suffix(value : NameSuffix) {
    (_contactHandle.getContact() as Person).Suffix = value
  }

  override property get FirstNameKanji() : String {
    return (_contactHandle.getContact() as Person).FirstNameKanji
  }

  override property set FirstNameKanji(value : String) {
    (_contactHandle.getContact() as Person).FirstNameKanji = value
  }

  override property get LastNameKanji() : String {
    return (_contactHandle.getContact() as Person).LastNameKanji
  }

  override property set LastNameKanji(value : String) {
    (_contactHandle.getContact() as Person).LastNameKanji = value
  }


  // properties not used for Persons
  override property get Name() : String {
    throw notSupported()
  }

  override property set Name(value : String) {
    throw notSupported()
  }

  override property get NameKanji() : String {
    throw notSupported()
  }

  override property set NameKanji(value : String) {
    throw notSupported()
  }


  private function notSupported() : UnsupportedOperationException {
    return new UnsupportedOperationException("Field is not used for PersonNameDelegate")
  }
}
