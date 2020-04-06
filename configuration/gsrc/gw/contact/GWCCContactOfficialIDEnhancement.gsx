package gw.contact

@Export
enhancement GWCCContactOfficialIDEnhancement : entity.Contact {

  property get NCCIintrastateOfficialID(): String {
    return this.getOfficialID(TC_NCCIINTRASTATE)
  }

  property set NCCIintrastateOfficialID(id: String) {
    this.setOfficialID(TC_NCCIINTRASTATE, id)
  }

}
