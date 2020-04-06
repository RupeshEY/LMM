package gw.entity

@ReadOnly
enhancement GWMatterEntityRoleConstraintsEnhancement : entity.Matter {

  property get InsuredRep() : entity.Contact[] {
    return this.getContactsByRole(TC_INSUREDREP)
  }

  property get LawEnfcAgcy() : entity.Contact[] {
    return this.getContactsByRole(TC_LAWENFCAGCY)
  }

  property get altcontact() : entity.Person[] {
    return this.getContactsByRole(TC_ALTCONTACT).cast(entity.Person)
  }

  property get arbitrationvenue() : entity.LegalVenue {
    return this.getContactByRole(TC_ARBITRATIONVENUE) as entity.LegalVenue
  }

  property set arbitrationvenue(value : entity.LegalVenue) {
    this.setContactByRole(TC_ARBITRATIONVENUE, value)
  }

  property get arbitrator() : entity.Adjudicator {
    return this.getContactByRole(TC_ARBITRATOR) as entity.Adjudicator
  }

  property set arbitrator(value : entity.Adjudicator) {
    this.setContactByRole(TC_ARBITRATOR, value)
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

  property get claimant() : entity.Person[] {
    return this.getContactsByRole(TC_CLAIMANT).cast(entity.Person)
  }

  property get codefendant() : entity.Contact {
    return this.getContactByRole(TC_CODEFENDANT)
  }

  property set codefendant(value : entity.Contact) {
    this.setContactByRole(TC_CODEFENDANT, value)
  }

  property get defendant() : entity.Contact {
    return this.getContactByRole(TC_DEFENDANT)
  }

  property set defendant(value : entity.Contact) {
    this.setContactByRole(TC_DEFENDANT, value)
  }

  property get defenseattorney() : entity.Attorney {
    return this.getContactByRole(TC_DEFENSEATTORNEY) as entity.Attorney
  }

  property set defenseattorney(value : entity.Attorney) {
    this.setContactByRole(TC_DEFENSEATTORNEY, value)
  }

  property get defensefirm() : entity.LawFirm {
    return this.getContactByRole(TC_DEFENSEFIRM) as entity.LawFirm
  }

  property set defensefirm(value : entity.LawFirm) {
    this.setContactByRole(TC_DEFENSEFIRM, value)
  }

  property get employer() : entity.Company[] {
    return this.getContactsByRole(TC_EMPLOYER).cast(entity.Company)
  }

  property get filedby() : entity.Contact {
    return this.getContactByRole(TC_FILEDBY)
  }

  property set filedby(value : entity.Contact) {
    this.setContactByRole(TC_FILEDBY, value)
  }

  property get hearingjudge() : entity.Adjudicator {
    return this.getContactByRole(TC_HEARINGJUDGE) as entity.Adjudicator
  }

  property set hearingjudge(value : entity.Adjudicator) {
    this.setContactByRole(TC_HEARINGJUDGE, value)
  }

  property get hearingvenue() : entity.LegalVenue {
    return this.getContactByRole(TC_HEARINGVENUE) as entity.LegalVenue
  }

  property set hearingvenue(value : entity.LegalVenue) {
    this.setContactByRole(TC_HEARINGVENUE, value)
  }

  property get injured() : entity.Person {
    return this.getContactByRole(TC_INJURED) as entity.Person
  }

  property set injured(value : entity.Person) {
    this.setContactByRole(TC_INJURED, value)
  }

  property get judge() : entity.Adjudicator {
    return this.getContactByRole(TC_JUDGE) as entity.Adjudicator
  }

  property set judge(value : entity.Adjudicator) {
    this.setContactByRole(TC_JUDGE, value)
  }

  property get judges() : entity.Contact[] {
    return this.getContactsByRole(TC_JUDGES)
  }

  property get leadparalegal() : entity.Person {
    return this.getContactByRole(TC_LEADPARALEGAL) as entity.Person
  }

  property set leadparalegal(value : entity.Person) {
    this.setContactByRole(TC_LEADPARALEGAL, value)
  }

  property get lienholder() : entity.Contact {
    return this.getContactByRole(TC_LIENHOLDER)
  }

  property set lienholder(value : entity.Contact) {
    this.setContactByRole(TC_LIENHOLDER, value)
  }

  property get maincontact() : entity.Person[] {
    return this.getContactsByRole(TC_MAINCONTACT).cast(entity.Person)
  }

  property get mattermanager() : entity.Person {
    return this.getContactByRole(TC_MATTERMANAGER) as entity.Person
  }

  property set mattermanager(value : entity.Person) {
    this.setContactByRole(TC_MATTERMANAGER, value)
  }

  property get mediationvenue() : entity.LegalVenue {
    return this.getContactByRole(TC_MEDIATIONVENUE) as entity.LegalVenue
  }

  property set mediationvenue(value : entity.LegalVenue) {
    this.setContactByRole(TC_MEDIATIONVENUE, value)
  }

  property get mediator() : entity.Adjudicator {
    return this.getContactByRole(TC_MEDIATOR) as entity.Adjudicator
  }

  property set mediator(value : entity.Adjudicator) {
    this.setContactByRole(TC_MEDIATOR, value)
  }

  property get nursecasemgr() : entity.Person[] {
    return this.getContactsByRole(TC_NURSECASEMGR).cast(entity.Person)
  }

  property get other() : entity.Contact[] {
    return this.getContactsByRole(TC_OTHER)
  }

  property get plaintiff() : entity.Contact {
    return this.getContactByRole(TC_PLAINTIFF)
  }

  property set plaintiff(value : entity.Contact) {
    this.setContactByRole(TC_PLAINTIFF, value)
  }

  property get plaintiffatt() : entity.Attorney {
    return this.getContactByRole(TC_PLAINTIFFATT) as entity.Attorney
  }

  property set plaintiffatt(value : entity.Attorney) {
    this.setContactByRole(TC_PLAINTIFFATT, value)
  }

  property get plaintifffirm() : entity.LawFirm {
    return this.getContactByRole(TC_PLAINTIFFFIRM) as entity.LawFirm
  }

  property set plaintifffirm(value : entity.LawFirm) {
    this.setContactByRole(TC_PLAINTIFFFIRM, value)
  }

  property get plaintiffs() : entity.Contact[] {
    return this.getContactsByRole(TC_PLAINTIFFS)
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

  property get supervisor() : entity.Person[] {
    return this.getContactsByRole(TC_SUPERVISOR).cast(entity.Person)
  }

  property get venue() : entity.LegalVenue {
    return this.getContactByRole(TC_VENUE) as entity.LegalVenue
  }

  property set venue(value : entity.LegalVenue) {
    this.setContactByRole(TC_VENUE, value)
  }

  property get wccarrier() : entity.Company[] {
    return this.getContactsByRole(TC_WCCARRIER).cast(entity.Company)
  }

  property get witness() : entity.Person[] {
    return this.getContactsByRole(TC_WITNESS).cast(entity.Person)
  }

}
