package gw.entity

@ReadOnly
enhancement GWVehicleIncidentEntityRoleConstraintsEnhancement : entity.VehicleIncident {

  property get InsuredRep() : entity.Contact {
    return this.getContactByRole(TC_INSUREDREP)
  }

  property set InsuredRep(value : entity.Contact) {
    this.setContactByRole(TC_INSUREDREP, value)
  }

  property get TowingAgcy() : entity.AutoTowingAgcy {
    return this.getContactByRole(TC_TOWINGAGCY) as entity.AutoTowingAgcy
  }

  property set TowingAgcy(value : entity.AutoTowingAgcy) {
    this.setContactByRole(TC_TOWINGAGCY, value)
  }

  property get driver() : entity.Person {
    return this.getContactByRole(TC_DRIVER) as entity.Person
  }

  property set driver(value : entity.Person) {
    this.setContactByRole(TC_DRIVER, value)
  }

  property get passenger() : entity.Person[] {
    return this.getContactsByRole(TC_PASSENGER).cast(entity.Person)
  }

  property get repairshop() : entity.AutoRepairShop {
    return this.getContactByRole(TC_REPAIRSHOP) as entity.AutoRepairShop
  }

  property set repairshop(value : entity.AutoRepairShop) {
    this.setContactByRole(TC_REPAIRSHOP, value)
  }

  property get salvagebuyer() : entity.Contact {
    return this.getContactByRole(TC_SALVAGEBUYER)
  }

  property set salvagebuyer(value : entity.Contact) {
    this.setContactByRole(TC_SALVAGEBUYER, value)
  }

  property get salvageservice() : entity.Company {
    return this.getContactByRole(TC_SALVAGESERVICE) as entity.Company
  }

  property set salvageservice(value : entity.Company) {
    this.setContactByRole(TC_SALVAGESERVICE, value)
  }

}
