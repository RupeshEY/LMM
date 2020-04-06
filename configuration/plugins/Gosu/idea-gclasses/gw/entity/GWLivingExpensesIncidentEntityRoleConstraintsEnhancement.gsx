package gw.entity

@ReadOnly
enhancement GWLivingExpensesIncidentEntityRoleConstraintsEnhancement : entity.LivingExpensesIncident {

  property get lodgingprovider() : entity.Company {
    return this.getContactByRole(TC_LODGINGPROVIDER) as entity.Company
  }

  property set lodgingprovider(value : entity.Company) {
    this.setContactByRole(TC_LODGINGPROVIDER, value)
  }

}
