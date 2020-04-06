package gw.entity

@ReadOnly
enhancement GWClaimEntityRoleConstraintsEnhancement : entity.Claim {

  property get Broker_Ext() : entity.Company {
    return this.getContactByRole(TC_BROKER_EXT) as entity.Company
  }

  property set Broker_Ext(value : entity.Company) {
    this.setContactByRole(TC_BROKER_EXT, value)
  }

  property get BureauLeadInsurerOrReinsurer_Ext() : entity.Company {
    return this.getContactByRole(TC_BUREAULEADINSURERORREINSURER_EXT) as entity.Company
  }

  property set BureauLeadInsurerOrReinsurer_Ext(value : entity.Company) {
    this.setContactByRole(TC_BUREAULEADINSURERORREINSURER_EXT, value)
  }

  property get ECFContractMarketInsurerOrReinsurer_Ext() : entity.Company[] {
    return this.getContactsByRole(TC_ECFCONTRACTMARKETINSURERORREINSURER_EXT).cast(entity.Company)
  }

  property get ECFInsurer_Ext() : entity.Company[] {
    return this.getContactsByRole(TC_ECFINSURER_EXT).cast(entity.Company)
  }

  property get ECFReinsurer_Ext() : entity.Company {
    return this.getContactByRole(TC_ECFREINSURER_EXT) as entity.Company
  }

  property set ECFReinsurer_Ext(value : entity.Company) {
    this.setContactByRole(TC_ECFREINSURER_EXT, value)
  }

  property get ExternalAdjuster_Ext() : entity.Company {
    return this.getContactByRole(TC_EXTERNALADJUSTER_EXT) as entity.Company
  }

  property set ExternalAdjuster_Ext(value : entity.Company) {
    this.setContactByRole(TC_EXTERNALADJUSTER_EXT, value)
  }

  property get FirstIntakeDoctor() : entity.Doctor {
    return this.getContactByRole(TC_FIRSTINTAKEDOCTOR) as entity.Doctor
  }

  property set FirstIntakeDoctor(value : entity.Doctor) {
    this.setContactByRole(TC_FIRSTINTAKEDOCTOR, value)
  }

  property get InsuredRep() : entity.Contact[] {
    return this.getContactsByRole(TC_INSUREDREP)
  }

  property get LawEnfcAgcy() : entity.Contact[] {
    return this.getContactsByRole(TC_LAWENFCAGCY)
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

  property get TowingAgcy() : entity.AutoTowingAgcy[] {
    return this.getContactsByRole(TC_TOWINGAGCY).cast(entity.AutoTowingAgcy)
  }

  property get activityowner() : entity.Contact[] {
    return this.getContactsByRole(TC_ACTIVITYOWNER)
  }

  property get adverseparty() : entity.Contact[] {
    return this.getContactsByRole(TC_ADVERSEPARTY)
  }

  property get altcontact() : entity.Person[] {
    return this.getContactsByRole(TC_ALTCONTACT).cast(entity.Person)
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

  property get casemgmtco() : entity.Company[] {
    return this.getContactsByRole(TC_CASEMGMTCO).cast(entity.Company)
  }

  property get casemgr() : entity.Person[] {
    return this.getContactsByRole(TC_CASEMGR).cast(entity.Person)
  }

  property get checkpayee() : entity.Contact[] {
    return this.getContactsByRole(TC_CHECKPAYEE)
  }

  property get claimant() : entity.Person {
    return this.getContactByRole(TC_CLAIMANT) as entity.Person
  }

  property set claimant(value : entity.Person) {
    this.setContactByRole(TC_CLAIMANT, value)
  }

  property get claimantdep() : entity.Person[] {
    return this.getContactsByRole(TC_CLAIMANTDEP).cast(entity.Person)
  }

  property get codefendant() : entity.Contact[] {
    return this.getContactsByRole(TC_CODEFENDANT)
  }

  property get collection() : entity.Contact {
    return this.getContactByRole(TC_COLLECTION)
  }

  property set collection(value : entity.Contact) {
    this.setContactByRole(TC_COLLECTION, value)
  }

  property get debrisremoval() : entity.Company[] {
    return this.getContactsByRole(TC_DEBRISREMOVAL).cast(entity.Company)
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

  property get disbenprovider() : entity.Company[] {
    return this.getContactsByRole(TC_DISBENPROVIDER).cast(entity.Company)
  }

  property get doctor() : entity.Doctor[] {
    return this.getContactsByRole(TC_DOCTOR).cast(entity.Doctor)
  }

  property get employer() : entity.Company[] {
    return this.getContactsByRole(TC_EMPLOYER).cast(entity.Company)
  }

  property get ems() : entity.Company[] {
    return this.getContactsByRole(TC_EMS).cast(entity.Company)
  }

  property get filedby() : entity.Contact[] {
    return this.getContactsByRole(TC_FILEDBY)
  }

  property get formeragent() : entity.Contact[] {
    return this.getContactsByRole(TC_FORMERAGENT)
  }

  property get formercheckpayee() : entity.Contact[] {
    return this.getContactsByRole(TC_FORMERCHECKPAYEE)
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

  property get lodgingprovider() : entity.Company[] {
    return this.getContactsByRole(TC_LODGINGPROVIDER).cast(entity.Company)
  }

  property get maincontact() : entity.Person {
    return this.getContactByRole(TC_MAINCONTACT) as entity.Person
  }

  property set maincontact(value : entity.Person) {
    this.setContactByRole(TC_MAINCONTACT, value)
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

  property get nursecasemgr() : entity.Person {
    return this.getContactByRole(TC_NURSECASEMGR) as entity.Person
  }

  property set nursecasemgr(value : entity.Person) {
    this.setContactByRole(TC_NURSECASEMGR, value)
  }

  property get other() : entity.Contact[] {
    return this.getContactsByRole(TC_OTHER)
  }

  property get passenger() : entity.Person[] {
    return this.getContactsByRole(TC_PASSENGER).cast(entity.Person)
  }

  property get pedestrian() : entity.Person[] {
    return this.getContactsByRole(TC_PEDESTRIAN).cast(entity.Person)
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

  property get plaintiffs() : entity.Contact[] {
    return this.getContactsByRole(TC_PLAINTIFFS)
  }

  property get recoveryonbehalfof() : entity.Contact[] {
    return this.getContactsByRole(TC_RECOVERYONBEHALFOF)
  }

  property get recoverypayer() : entity.Contact[] {
    return this.getContactsByRole(TC_RECOVERYPAYER)
  }

  property get repairshop() : entity.AutoRepairShop[] {
    return this.getContactsByRole(TC_REPAIRSHOP).cast(entity.AutoRepairShop)
  }

  property get reporter() : entity.Contact {
    return this.getContactByRole(TC_REPORTER)
  }

  property set reporter(value : entity.Contact) {
    this.setContactByRole(TC_REPORTER, value)
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

  property get servicerequestparticipant() : entity.Contact[] {
    return this.getContactsByRole(TC_SERVICEREQUESTPARTICIPANT)
  }

  property get servicerequestspecialist() : entity.Contact[] {
    return this.getContactsByRole(TC_SERVICEREQUESTSPECIALIST)
  }

  property get subrogator() : entity.Contact {
    return this.getContactByRole(TC_SUBROGATOR)
  }

  property set subrogator(value : entity.Contact) {
    this.setContactByRole(TC_SUBROGATOR, value)
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

  property get wccarrier() : entity.Company[] {
    return this.getContactsByRole(TC_WCCARRIER).cast(entity.Company)
  }

  property get witness() : entity.Person[] {
    return this.getContactsByRole(TC_WITNESS).cast(entity.Person)
  }

}
