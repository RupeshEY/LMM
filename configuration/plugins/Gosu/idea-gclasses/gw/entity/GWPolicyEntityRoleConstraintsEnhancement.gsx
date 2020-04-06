package gw.entity

@ReadOnly
enhancement GWPolicyEntityRoleConstraintsEnhancement : entity.Policy {

  property get InsuredRep() : entity.Contact[] {
    return this.getContactsByRole(TC_INSUREDREP)
  }

  property get agent() : entity.Contact {
    return this.getContactByRole(TC_AGENT)
  }

  property set agent(value : entity.Contact) {
    this.setContactByRole(TC_AGENT, value)
  }

  property get altcontact() : entity.Person[] {
    return this.getContactsByRole(TC_ALTCONTACT).cast(entity.Person)
  }

  property get coveredparty() : entity.Contact[] {
    return this.getContactsByRole(TC_COVEREDPARTY)
  }

  property get doingbusinessas() : entity.Company {
    return this.getContactByRole(TC_DOINGBUSINESSAS) as entity.Company
  }

  property set doingbusinessas(value : entity.Company) {
    this.setContactByRole(TC_DOINGBUSINESSAS, value)
  }

  property get excludedparty() : entity.Contact[] {
    return this.getContactsByRole(TC_EXCLUDEDPARTY)
  }

  property get formeragent() : entity.Contact[] {
    return this.getContactsByRole(TC_FORMERAGENT)
  }

  property get formercoveredparty() : entity.Contact[] {
    return this.getContactsByRole(TC_FORMERCOVEREDPARTY)
  }

  property get formerdoingbusinessas() : entity.Contact[] {
    return this.getContactsByRole(TC_FORMERDOINGBUSINESSAS)
  }

  property get formerexcludedparty() : entity.Contact[] {
    return this.getContactsByRole(TC_FORMEREXCLUDEDPARTY)
  }

  property get formerinsured() : entity.Contact[] {
    return this.getContactsByRole(TC_FORMERINSURED)
  }

  property get formerpolicyholder() : entity.Contact[] {
    return this.getContactsByRole(TC_FORMERPOLICYHOLDER)
  }

  property get formerunderwriter() : entity.Contact[] {
    return this.getContactsByRole(TC_FORMERUNDERWRITER)
  }

  property get insured() : entity.Contact {
    return this.getContactByRole(TC_INSURED)
  }

  property set insured(value : entity.Contact) {
    this.setContactByRole(TC_INSURED, value)
  }

  property get maincontact() : entity.Person[] {
    return this.getContactsByRole(TC_MAINCONTACT).cast(entity.Person)
  }

  property get other() : entity.Contact[] {
    return this.getContactsByRole(TC_OTHER)
  }

  property get policyholder() : entity.Contact {
    return this.getContactByRole(TC_POLICYHOLDER)
  }

  property set policyholder(value : entity.Contact) {
    this.setContactByRole(TC_POLICYHOLDER, value)
  }

  property get underwriter() : entity.Person {
    return this.getContactByRole(TC_UNDERWRITER) as entity.Person
  }

  property set underwriter(value : entity.Person) {
    this.setContactByRole(TC_UNDERWRITER, value)
  }

  property get wccarrier() : entity.Company[] {
    return this.getContactsByRole(TC_WCCARRIER).cast(entity.Company)
  }

}
