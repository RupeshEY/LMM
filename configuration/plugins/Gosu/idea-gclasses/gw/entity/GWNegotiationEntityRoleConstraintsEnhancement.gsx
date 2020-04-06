package gw.entity

@ReadOnly
enhancement GWNegotiationEntityRoleConstraintsEnhancement : entity.Negotiation {

  property get InsuredRep() : entity.Contact[] {
    return this.getContactsByRole(TC_INSUREDREP)
  }

  property get adverseparty() : entity.Contact[] {
    return this.getContactsByRole(TC_ADVERSEPARTY)
  }

  property get altcontact() : entity.Person[] {
    return this.getContactsByRole(TC_ALTCONTACT).cast(entity.Person)
  }

  property get attorney() : entity.Attorney[] {
    return this.getContactsByRole(TC_ATTORNEY).cast(entity.Attorney)
  }

  property get casemgr() : entity.Person[] {
    return this.getContactsByRole(TC_CASEMGR).cast(entity.Person)
  }

  property get filedby() : entity.Contact[] {
    return this.getContactsByRole(TC_FILEDBY)
  }

  property get maincontact() : entity.Person[] {
    return this.getContactsByRole(TC_MAINCONTACT).cast(entity.Person)
  }

  property get mediationvenue() : entity.LegalVenue[] {
    return this.getContactsByRole(TC_MEDIATIONVENUE).cast(entity.LegalVenue)
  }

  property get mediator() : entity.Adjudicator[] {
    return this.getContactsByRole(TC_MEDIATOR).cast(entity.Adjudicator)
  }

  property get negcontact() : entity.Contact {
    return this.getContactByRole(TC_NEGCONTACT)
  }

  property set negcontact(value : entity.Contact) {
    this.setContactByRole(TC_NEGCONTACT, value)
  }

  property get other() : entity.Contact[] {
    return this.getContactsByRole(TC_OTHER)
  }

}
