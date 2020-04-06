package gw.entity

@ReadOnly
enhancement GWDwellingIncidentEntityRoleConstraintsEnhancement : entity.DwellingIncident {

  property get debrisremoval() : entity.Company {
    return this.getContactByRole(TC_DEBRISREMOVAL) as entity.Company
  }

  property set debrisremoval(value : entity.Company) {
    this.setContactByRole(TC_DEBRISREMOVAL, value)
  }

  property get ems() : entity.Company {
    return this.getContactByRole(TC_EMS) as entity.Company
  }

  property set ems(value : entity.Company) {
    this.setContactByRole(TC_EMS, value)
  }

}
