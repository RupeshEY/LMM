package gw.entity

@ReadOnly
enhancement GWMobilePropertyIncidentEntityRoleConstraintsEnhancement : entity.MobilePropertyIncident {

  property get recoveryagent() : entity.Contact {
    return this.getContactByRole(TC_RECOVERYAGENT)
  }

  property set recoveryagent(value : entity.Contact) {
    this.setContactByRole(TC_RECOVERYAGENT, value)
  }

}
