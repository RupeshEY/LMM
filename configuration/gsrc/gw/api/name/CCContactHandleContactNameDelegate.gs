package gw.api.name
uses gw.api.contact.ContactHandle

@Export
class CCContactHandleContactNameDelegate implements ContactNameFields {

  private var _contactHandle : ContactHandle

  construct(contactHandle : ContactHandle) {
    _contactHandle = contactHandle
  }
  
  override property get Name() : String {
    return _contactHandle.getContact().Name
  }

  override property set Name(value : String) {
    _contactHandle.getContact().Name = value
  }

  override property get NameKanji() : String {
    return _contactHandle.getContact().NameKanji
  }

  override property set NameKanji(value : String) {
    _contactHandle.getContact().NameKanji = value
  }
}
