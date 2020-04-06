package gw.entity

@ReadOnly
enhancement GWEvaluationEntityRoleConstraintsEnhancement : entity.Evaluation {

  property get InsuredRep() : entity.Contact[] {
    return this.getContactsByRole(TC_INSUREDREP)
  }

  property get agent() : entity.Contact[] {
    return this.getContactsByRole(TC_AGENT)
  }

  property get altcontact() : entity.Person[] {
    return this.getContactsByRole(TC_ALTCONTACT).cast(entity.Person)
  }

  property get assessor() : entity.Contact[] {
    return this.getContactsByRole(TC_ASSESSOR)
  }

  property get attorney() : entity.Attorney[] {
    return this.getContactsByRole(TC_ATTORNEY).cast(entity.Attorney)
  }

  property get casemgmtco() : entity.Company[] {
    return this.getContactsByRole(TC_CASEMGMTCO).cast(entity.Company)
  }

  property get casemgr() : entity.Person[] {
    return this.getContactsByRole(TC_CASEMGR).cast(entity.Person)
  }

  property get doctor() : entity.Doctor[] {
    return this.getContactsByRole(TC_DOCTOR).cast(entity.Doctor)
  }

  property get employer() : entity.Company[] {
    return this.getContactsByRole(TC_EMPLOYER).cast(entity.Company)
  }

  property get maincontact() : entity.Person[] {
    return this.getContactsByRole(TC_MAINCONTACT).cast(entity.Person)
  }

  property get supervisor() : entity.Person[] {
    return this.getContactsByRole(TC_SUPERVISOR).cast(entity.Person)
  }

  property get vendor() : entity.Contact[] {
    return this.getContactsByRole(TC_VENDOR)
  }

  property get venue() : entity.LegalVenue[] {
    return this.getContactsByRole(TC_VENUE).cast(entity.LegalVenue)
  }

}
