package gw.entity

@ReadOnly
enhancement GWIncidentEntityRoleConstraintsEnhancement : entity.Incident {

  property get assessor() : entity.Contact[] {
    return this.getContactsByRole(TC_ASSESSOR)
  }

  property get incidentowner() : entity.Contact {
    return this.getContactByRole(TC_INCIDENTOWNER)
  }

  property set incidentowner(value : entity.Contact) {
    this.setContactByRole(TC_INCIDENTOWNER, value)
  }

  property get other() : entity.Contact[] {
    return this.getContactsByRole(TC_OTHER)
  }

  property get witness() : entity.Person[] {
    return this.getContactsByRole(TC_WITNESS).cast(entity.Person)
  }

}
