package gw.entity

@ReadOnly
enhancement GWPropertyIncidentEntityRoleConstraintsEnhancement : entity.PropertyIncident {

  property get AppraisalSource() : entity.Contact[] {
    return this.getContactsByRole(TC_APPRAISALSOURCE)
  }

  property get fnolassessor() : entity.Contact {
    return this.getContactByRole(TC_FNOLASSESSOR)
  }

  property set fnolassessor(value : entity.Contact) {
    this.setContactByRole(TC_FNOLASSESSOR, value)
  }

}
