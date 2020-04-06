package gw.entity;

@Export
enhancement GWContactSearchCriteriaEnhancement : ContactSearchCriteria
{
  function populateContact( contact : Contact ) {
    if ( this.Address.City.length > 0 ) {
      contact.PrimaryAddress.City = this.Address.City;
    }
    if ( this.Address.State != null ) {
      contact.PrimaryAddress.State = this.Address.State;
    }
    if ( this.Address.PostalCode.length > 0 ) {
      contact.PrimaryAddress.PostalCode = this.Address.PostalCode;
    }

    contact.Preferred = !perm.Contact.createpreferredab or ( this.PreferredVendors == null ) ? false: this.PreferredVendors;
  }
  
  function populatePerson( contact : Contact ) {
    populateContact( contact );
    (contact as Person).FirstName = this.FirstName;
    (contact as Person).LastName = this.Keyword;
    if ( this.OrganizationName.length > 0 ) {
      (contact as Person).Employer.Name = this.OrganizationName;
    }
  }
  
  function populatePersonVendor( contact : Contact ) {
    populatePerson( contact );
    // Employer.Name should not be assigned.  Override?
    (contact as PersonVendor).TaxID = this.TaxID;
  }
  
  function populateAttorney( contact : Contact ) {
    populatePersonVendor( contact );
    (contact as Attorney).AttorneySpecialty = this.AttorneySpecialty;
  }
    
  function populateDoctor( contact : Contact ) {
    populatePersonVendor( contact );
    (contact as Doctor).DoctorSpecialty = this.DoctorSpecialty;
  }
  
  function populateAdjudicator( contact : Contact ) {
    populatePerson( contact );
    (contact as Adjudicator).AdjudicativeDomain = this.AdjudicativeDomain;
  }
  
  function populateCompany( contact : Contact ) {
    populateContact( contact );
    (contact as Company).Name = this.Keyword;
    (contact as Company).TaxID = this.TaxID;
  }
  
  function populateCompanyVendor( contact : Contact ) {
    populateCompany( contact );
  }
  
  function populateMedicalCareOrg( contact : Contact ) {
    populateCompanyVendor( contact );
    (contact as MedicalCareOrg).MedicalOrgSpecialty = this.MedicalOrgSpecialty;
  }
  
  function populateAutoRepairShop( contact : Contact ) {
    populateCompanyVendor( contact );
  }
  
  function populateAutoTowingAgcy( contact : Contact ) {
    populateCompanyVendor( contact );
  }
  
  function populateLawFirm( contact : Contact ) {
    populateCompanyVendor( contact );
    (contact as LawFirm).LawFirmSpecialty = this.LawFirmSpecialty;
  }
  
  function populatePlace( contact : Contact ) {
    populateContact( contact );
    (contact as Place).Name = this.Keyword;
  }
  
  function populateLegalVenue( contact : Contact ) {
    populatePlace( contact );
  }

  function isLeafSearch() : Boolean {
  return this.ContactIntrinsicType != Contact
         and this.ContactIntrinsicType != Person
         and this.ContactIntrinsicType != PersonVendor
         and this.ContactIntrinsicType != Company
         and this.ContactIntrinsicType != CompanyVendor
         and this.ContactIntrinsicType != Place
         ;
  }

}
