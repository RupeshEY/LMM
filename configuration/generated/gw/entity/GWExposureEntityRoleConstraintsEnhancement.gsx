package gw.entity

@ReadOnly
enhancement GWExposureEntityRoleConstraintsEnhancement : entity.Exposure {

  property get FirstIntakeDoctor() : entity.Doctor {
    return this.getContactByRole(TC_FIRSTINTAKEDOCTOR) as entity.Doctor
  }

  property set FirstIntakeDoctor(value : entity.Doctor) {
    this.setContactByRole(TC_FIRSTINTAKEDOCTOR, value)
  }

  property get LawEnfcAgcy() : entity.Contact {
    return this.getContactByRole(TC_LAWENFCAGCY)
  }

  property set LawEnfcAgcy(value : entity.Contact) {
    this.setContactByRole(TC_LAWENFCAGCY, value)
  }

  property get OccTherapist() : entity.Contact[] {
    return this.getContactsByRole(TC_OCCTHERAPIST)
  }

  property get PhysTherapist() : entity.Contact[] {
    return this.getContactsByRole(TC_PHYSTHERAPIST)
  }

  property get PrimaryDoctor() : entity.Doctor {
    return this.getContactByRole(TC_PRIMARYDOCTOR) as entity.Doctor
  }

  property set PrimaryDoctor(value : entity.Doctor) {
    this.setContactByRole(TC_PRIMARYDOCTOR, value)
  }

  property get activityowner() : entity.Contact[] {
    return this.getContactsByRole(TC_ACTIVITYOWNER)
  }

  property get adverseparty() : entity.Contact[] {
    return this.getContactsByRole(TC_ADVERSEPARTY)
  }

  property get altcontact() : entity.Person {
    return this.getContactByRole(TC_ALTCONTACT) as entity.Person
  }

  property set altcontact(value : entity.Person) {
    this.setContactByRole(TC_ALTCONTACT, value)
  }

  property get arbitrationvenue() : entity.LegalVenue[] {
    return this.getContactsByRole(TC_ARBITRATIONVENUE).cast(entity.LegalVenue)
  }

  property get arbitrator() : entity.Adjudicator[] {
    return this.getContactsByRole(TC_ARBITRATOR).cast(entity.Adjudicator)
  }

  property get assessor() : entity.Contact[] {
    return this.getContactsByRole(TC_ASSESSOR)
  }

  property get attorney() : entity.Attorney[] {
    return this.getContactsByRole(TC_ATTORNEY).cast(entity.Attorney)
  }

  property get casemgmtco() : entity.Company {
    return this.getContactByRole(TC_CASEMGMTCO) as entity.Company
  }

  property set casemgmtco(value : entity.Company) {
    this.setContactByRole(TC_CASEMGMTCO, value)
  }

  property get casemgr() : entity.Person {
    return this.getContactByRole(TC_CASEMGR) as entity.Person
  }

  property set casemgr(value : entity.Person) {
    this.setContactByRole(TC_CASEMGR, value)
  }

  property get checkpayee() : entity.Contact[] {
    return this.getContactsByRole(TC_CHECKPAYEE)
  }

  property get claimantdep() : entity.Person[] {
    return this.getContactsByRole(TC_CLAIMANTDEP).cast(entity.Person)
  }

  property get codefendant() : entity.Contact[] {
    return this.getContactsByRole(TC_CODEFENDANT)
  }

  property get collection() : entity.Contact[] {
    return this.getContactsByRole(TC_COLLECTION)
  }

  property get defendant() : entity.Contact[] {
    return this.getContactsByRole(TC_DEFENDANT)
  }

  property get defenseattorney() : entity.Attorney[] {
    return this.getContactsByRole(TC_DEFENSEATTORNEY).cast(entity.Attorney)
  }

  property get defensefirm() : entity.LawFirm[] {
    return this.getContactsByRole(TC_DEFENSEFIRM).cast(entity.LawFirm)
  }

  property get disbenprovider() : entity.Company {
    return this.getContactByRole(TC_DISBENPROVIDER) as entity.Company
  }

  property set disbenprovider(value : entity.Company) {
    this.setContactByRole(TC_DISBENPROVIDER, value)
  }

  property get doctor() : entity.Doctor[] {
    return this.getContactsByRole(TC_DOCTOR).cast(entity.Doctor)
  }

  property get employer() : entity.Company {
    return this.getContactByRole(TC_EMPLOYER) as entity.Company
  }

  property set employer(value : entity.Company) {
    this.setContactByRole(TC_EMPLOYER, value)
  }

  property get filedby() : entity.Contact[] {
    return this.getContactsByRole(TC_FILEDBY)
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

  property get hearingjudge() : entity.Adjudicator[] {
    return this.getContactsByRole(TC_HEARINGJUDGE).cast(entity.Adjudicator)
  }

  property get hearingvenue() : entity.LegalVenue[] {
    return this.getContactsByRole(TC_HEARINGVENUE).cast(entity.LegalVenue)
  }

  property get hospital() : entity.MedicalCareOrg {
    return this.getContactByRole(TC_HOSPITAL) as entity.MedicalCareOrg
  }

  property set hospital(value : entity.MedicalCareOrg) {
    this.setContactByRole(TC_HOSPITAL, value)
  }

  property get injured() : entity.Person[] {
    return this.getContactsByRole(TC_INJURED).cast(entity.Person)
  }

  property get judge() : entity.Adjudicator[] {
    return this.getContactsByRole(TC_JUDGE).cast(entity.Adjudicator)
  }

  property get judges() : entity.Contact[] {
    return this.getContactsByRole(TC_JUDGES)
  }

  property get lienholder() : entity.Contact[] {
    return this.getContactsByRole(TC_LIENHOLDER)
  }

  property get maincontact() : entity.Person[] {
    return this.getContactsByRole(TC_MAINCONTACT).cast(entity.Person)
  }

  property get mattermanager() : entity.Person[] {
    return this.getContactsByRole(TC_MATTERMANAGER).cast(entity.Person)
  }

  property get mediationvenue() : entity.LegalVenue[] {
    return this.getContactsByRole(TC_MEDIATIONVENUE).cast(entity.LegalVenue)
  }

  property get mediator() : entity.Adjudicator[] {
    return this.getContactsByRole(TC_MEDIATOR).cast(entity.Adjudicator)
  }

  property get negcontact() : entity.Contact[] {
    return this.getContactsByRole(TC_NEGCONTACT)
  }

  property get nursecasemgr() : entity.Person[] {
    return this.getContactsByRole(TC_NURSECASEMGR).cast(entity.Person)
  }

  property get other() : entity.Contact[] {
    return this.getContactsByRole(TC_OTHER)
  }

  property get plaintiff() : entity.Contact[] {
    return this.getContactsByRole(TC_PLAINTIFF)
  }

  property get plaintiffatt() : entity.Attorney[] {
    return this.getContactsByRole(TC_PLAINTIFFATT).cast(entity.Attorney)
  }

  property get plaintifffirm() : entity.LawFirm[] {
    return this.getContactsByRole(TC_PLAINTIFFFIRM).cast(entity.LawFirm)
  }

  property get plaintiffs() : entity.Contact {
    return this.getContactByRole(TC_PLAINTIFFS)
  }

  property set plaintiffs(value : entity.Contact) {
    this.setContactByRole(TC_PLAINTIFFS, value)
  }

  property get recoveryonbehalfof() : entity.Contact[] {
    return this.getContactsByRole(TC_RECOVERYONBEHALFOF)
  }

  property get recoverypayer() : entity.Contact[] {
    return this.getContactsByRole(TC_RECOVERYPAYER)
  }

  property get reporter() : entity.Contact[] {
    return this.getContactsByRole(TC_REPORTER)
  }

  property get rsbenprovider() : entity.Contact[] {
    return this.getContactsByRole(TC_RSBENPROVIDER)
  }

  property get salvagebuyer() : entity.Contact[] {
    return this.getContactsByRole(TC_SALVAGEBUYER)
  }

  property get salvageservice() : entity.Company[] {
    return this.getContactsByRole(TC_SALVAGESERVICE).cast(entity.Company)
  }

  property get secdefattorney() : entity.Attorney[] {
    return this.getContactsByRole(TC_SECDEFATTORNEY).cast(entity.Attorney)
  }

  property get secdefensefirm() : entity.LawFirm[] {
    return this.getContactsByRole(TC_SECDEFENSEFIRM).cast(entity.LawFirm)
  }

  property get secplaintiffatt() : entity.Contact[] {
    return this.getContactsByRole(TC_SECPLAINTIFFATT)
  }

  property get secplaintifffirm() : entity.Contact[] {
    return this.getContactsByRole(TC_SECPLAINTIFFFIRM)
  }

  property get subrogator() : entity.Contact[] {
    return this.getContactsByRole(TC_SUBROGATOR)
  }

  property get supervisor() : entity.Person {
    return this.getContactByRole(TC_SUPERVISOR) as entity.Person
  }

  property set supervisor(value : entity.Person) {
    this.setContactByRole(TC_SUPERVISOR, value)
  }

  property get vendor() : entity.Contact[] {
    return this.getContactsByRole(TC_VENDOR)
  }

  property get venue() : entity.LegalVenue[] {
    return this.getContactsByRole(TC_VENUE).cast(entity.LegalVenue)
  }

  property get wccarrier() : entity.Company {
    return this.getContactByRole(TC_WCCARRIER) as entity.Company
  }

  property set wccarrier(value : entity.Company) {
    this.setContactByRole(TC_WCCARRIER, value)
  }

  property get witness() : entity.Person[] {
    return this.getContactsByRole(TC_WITNESS).cast(entity.Person)
  }

}
