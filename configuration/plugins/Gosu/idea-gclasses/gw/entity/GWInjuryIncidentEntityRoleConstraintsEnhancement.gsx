package gw.entity

@ReadOnly
enhancement GWInjuryIncidentEntityRoleConstraintsEnhancement : entity.InjuryIncident {

  property get PrimaryDoctor() : entity.Doctor {
    return this.getContactByRole(TC_PRIMARYDOCTOR) as entity.Doctor
  }

  property set PrimaryDoctor(value : entity.Doctor) {
    this.setContactByRole(TC_PRIMARYDOCTOR, value)
  }

  property get injured() : entity.Person {
    return this.getContactByRole(TC_INJURED) as entity.Person
  }

  property set injured(value : entity.Person) {
    this.setContactByRole(TC_INJURED, value)
  }

}
