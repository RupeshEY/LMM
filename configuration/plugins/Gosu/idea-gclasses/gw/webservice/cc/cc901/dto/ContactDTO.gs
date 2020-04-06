package gw.webservice.cc.cc901.dto

uses entity.Address
uses entity.Contact
uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.lang.reflect.ReflectUtil
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses typekey.Currency

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link ContactDTO} is a DTO that represents an instance of {@link Contact} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link Contact}.
 * <p>None of these methods constrain how an instance of ContactDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the ContactDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link ContactDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>AddressBookUID</td><td>Contact.AddressBookUID</td></tr><tr><td>AutoRepairLicense</td><td>AutoRepairShop.AutoRepairLicense</td></tr><tr><td>CellPhone</td><td>Person.CellPhone</td></tr><tr><td>CollectionAgencyPublicID</td><td>Contact.CollectionAgency.PublicID</td></tr><tr><td>CreateStatus</td><td>Contact.CreateStatus</td></tr><tr><td>CreateTime</td><td>Contact.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Contact.CreateUser.PublicID</td></tr><tr><td>DateOfBirth</td><td>Person.DateOfBirth</td></tr><tr><td>DoctorSpecialty</td><td>Doctor.DoctorSpecialty</td></tr><tr><td>EmailAddress1</td><td>Contact.EmailAddress1</td></tr><tr><td>EmployerPublicID</td><td>Doctor.Employer.PublicID</td></tr><tr><td>FEINOfficialID</td><td>MedicalCareOrg.FEINOfficialID</td></tr><tr><td>FirstName</td><td>Person.FirstName</td></tr><tr><td>FirstNameKanji</td><td>Person.FirstNameKanji</td></tr><tr><td>Gender</td><td>Person.Gender</td></tr><tr><td>HomePhone</td><td>Contact.HomePhone</td></tr><tr><td>HomePhoneCountry</td><td>Contact.HomePhoneCountry</td></tr><tr><td>HomePhoneExtension</td><td>Contact.HomePhoneExtension</td></tr><tr><td>LastName</td><td>Person.LastName</td></tr><tr><td>LastNameKanji</td><td>Person.LastNameKanji</td></tr><tr><td>LicenseNumber</td><td>Person.LicenseNumber</td></tr><tr><td>LicenseState</td><td>Person.LicenseState</td></tr><tr><td>MaritalStatus</td><td>Person.MaritalStatus</td></tr><tr><td>MedicalLicense</td><td>Doctor.MedicalLicense</td></tr><tr><td>MedicalOrgSpecialty</td><td>MedicalCareOrg.MedicalOrgSpecialty</td></tr><tr><td>MiddleName</td><td>Person.MiddleName</td></tr><tr><td>Name</td><td>Contact.Name</td></tr><tr><td>NameKanji</td><td>Contact.NameKanji</td></tr><tr><td>Notes</td><td>Contact.Notes</td></tr><tr><td>Occupation</td><td>Person.Occupation</td></tr><tr><td>OrganizationType</td><td>Contact.OrganizationType</td></tr><tr><td>Preferred</td><td>Contact.Preferred</td></tr><tr><td>PreferredCurrency</td><td>Contact.PreferredCurrency</td></tr><tr><td>Prefix</td><td>Person.Prefix</td></tr><tr><td>PrimaryAddressDisplayValue</td><td>Contact.PrimaryAddressDisplayValue</td></tr><tr><td>PrimaryAddressPublicID</td><td>Contact.PrimaryAddress.PublicID</td></tr><tr><td>PrimaryContactPublicID</td><td>MedicalCareOrg.PrimaryContact.PublicID</td></tr><tr><td>PrimaryPhone</td><td>Contact.PrimaryPhone</td></tr><tr><td>PrimaryPhoneValue</td><td>Contact.PrimaryPhoneValue</td></tr><tr><td>PublicID</td><td>Contact.PublicID</td></tr><tr><td>Score</td><td>Contact.Score</td></tr><tr><td>SpecialtyType</td><td>Contact.SpecialtyType</td></tr><tr><td>SSNOfficialID</td><td>Contact.SSNOfficialID</td></tr><tr><td>Subtype</td><td>Contact.Subtype</td></tr><tr><td>Suffix</td><td>Person.Suffix</td></tr><tr><td>TaxFilingStatus</td><td>Person.TaxFilingStatus</td></tr><tr><td>TaxID</td><td>Contact.TaxID</td></tr><tr><td>TaxStatus</td><td>Contact.TaxStatus</td></tr><tr><td>ThirdpartyinsurerPublicID</td><td>Contact.Thirdpartyinsurer.PublicID</td></tr><tr><td>UpdateTime</td><td>Contact.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Contact.UpdateUser.PublicID</td></tr><tr><td>ValidationLevel</td><td>Contact.ValidationLevel</td></tr><tr><td>VendorNumber</td><td>Contact.VendorNumber</td></tr><tr><td>VendorType</td><td>Contact.VendorType</td></tr><tr><td>WorkPhone</td><td>Contact.WorkPhone</td></tr><tr><td>WorkPhoneCountry</td><td>Contact.WorkPhoneCountry</td></tr><tr><td>WorkPhoneExtension</td><td>Contact.WorkPhoneExtension</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ContactDTO")
final class ContactDTO {
  var _addressBookUID             : String                        as AddressBookUID
  var _autoRepairLicense          : String                        as AutoRepairLicense
  var _cellPhone                  : String                        as CellPhone
  /** Derived from Contact#CollectionAgency.PublicID */
  var _collectionAgencyPublicID   : String                        as CollectionAgencyPublicID
  var _createStatus               : ContactCreationApprovalStatus as CreateStatus
  var _createTime                 : Date                          as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID         : String                        as CreateUserPublicID
  var _dateOfBirth                : Date                          as DateOfBirth
  var _doctorSpecialty            : SpecialtyType                 as DoctorSpecialty
  var _emailAddress1              : String                        as EmailAddress1
  /** Derived from Doctor#Employer.PublicID */
  var _employerPublicID           : String                        as EmployerPublicID
  var _fEINOfficialID             : String                        as FEINOfficialID
  var _firstName                  : String                        as FirstName
  var _firstNameKanji             : String                        as FirstNameKanji
  var _gender                     : GenderType                    as Gender
  var _homePhone                  : String                        as HomePhone
  var _homePhoneCountry           : PhoneCountryCode              as HomePhoneCountry
  var _homePhoneExtension         : String                        as HomePhoneExtension
  var _lastName                   : String                        as LastName
  var _lastNameKanji              : String                        as LastNameKanji
  var _licenseNumber              : String                        as LicenseNumber
  var _licenseState               : Jurisdiction                  as LicenseState
  var _maritalStatus              : MaritalStatus                 as MaritalStatus
  var _medicalLicense             : String                        as MedicalLicense
  var _medicalOrgSpecialty        : SpecialtyType                 as MedicalOrgSpecialty
  var _middleName                 : String                        as MiddleName
  var _name                       : String                        as Name
  var _nameKanji                  : String                        as NameKanji
  var _notes                      : String                        as Notes
  var _occupation                 : String                        as Occupation
  var _organizationType           : OrganizationType              as OrganizationType
  var _preferred                  : Boolean                       as Preferred
  var _preferredCurrency          : Currency                      as PreferredCurrency
  var _prefix                     : NamePrefix                    as Prefix
  var _primaryAddressDisplayValue : String                        as PrimaryAddressDisplayValue
  /** Derived from Contact#PrimaryAddress.PublicID */
  var _primaryAddressPublicID     : String                        as PrimaryAddressPublicID
  /** Derived from MedicalCareOrg#PrimaryContact.PublicID */
  var _primaryContactPublicID     : String                        as PrimaryContactPublicID
  var _primaryPhone               : PrimaryPhoneType              as PrimaryPhone
  var _primaryPhoneValue          : String                        as PrimaryPhoneValue
  var _publicID                   : String                        as PublicID
  var _score                      : Integer                       as Score
  var _specialtyType              : SpecialtyType                 as SpecialtyType
  var _sSNOfficialID              : String                        as SSNOfficialID
  var _subtype                    : typekey.Contact               as Subtype
  var _suffix                     : NameSuffix                    as Suffix
  var _taxFilingStatus            : TaxFilingStatusType           as TaxFilingStatus
  var _taxID                      : String                        as TaxID
  var _taxStatus                  : TaxStatus                     as TaxStatus
  /** Derived from Contact#Thirdpartyinsurer.PublicID */
  var _thirdpartyinsurerPublicID  : String                        as ThirdpartyinsurerPublicID
  var _updateTime                 : Date                          as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID         : String                        as UpdateUserPublicID
  var _validationLevel            : ValidationLevel               as ValidationLevel
  var _vendorNumber               : String                        as VendorNumber
  var _vendorType                 : VendorType                    as VendorType
  var _workPhone                  : String                        as WorkPhone
  var _workPhoneCountry           : PhoneCountryCode              as WorkPhoneCountry
  var _workPhoneExtension         : String                        as WorkPhoneExtension

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Contact
   * @param that The Contact to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Contact) {
    // if field is on base class
      _createTime                 = that.CreateTime
      _createUserPublicID         = that.CreateUser.PublicID
      _primaryAddressDisplayValue = that.PrimaryAddressDisplayValue
      _primaryPhoneValue          = that.PrimaryPhoneValue
      _subtype                    = that.Subtype
      _updateTime                 = that.UpdateTime
      _updateUserPublicID         = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Contact
   * @param that The Contact to copy from.
   */
  final function readFrom(that : Contact) : ContactDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      AddressBookUID              = that.AddressBookUID
      CollectionAgencyPublicID    = that.CollectionAgency.PublicID
      CreateStatus                = that.CreateStatus
      EmailAddress1               = that.EmailAddress1
      HomePhone                   = that.HomePhone
      HomePhoneCountry            = that.HomePhoneCountry
      HomePhoneExtension          = that.HomePhoneExtension
      Name                        = that.Name
      NameKanji                   = that.NameKanji
      Notes                       = that.Notes
      OrganizationType            = that.OrganizationType
      Preferred                   = that.Preferred
      PreferredCurrency           = that.PreferredCurrency
      PrimaryAddressPublicID      = that.PrimaryAddress.PublicID
      PrimaryPhone                = that.PrimaryPhone
      PublicID                    = that.PublicID
      SSNOfficialID               = that.SSNOfficialID
      Score                       = that.Score
      SpecialtyType               = that.SpecialtyType
      TaxID                       = that.TaxID
      TaxStatus                   = that.TaxStatus
      ThirdpartyinsurerPublicID   = that.Thirdpartyinsurer.PublicID
      ValidationLevel             = that.ValidationLevel
      VendorNumber                = that.VendorNumber
      VendorType                  = that.VendorType
      WorkPhone                   = that.WorkPhone
      WorkPhoneCountry            = that.WorkPhoneCountry
      WorkPhoneExtension          = that.WorkPhoneExtension
    //
    if (that typeis AutoRepairShop) {
      AutoRepairLicense           = that.AutoRepairLicense
    }
    if (that typeis Doctor) {
      DoctorSpecialty             = that.DoctorSpecialty
      EmployerPublicID            = that.Employer.PublicID
      MedicalLicense              = that.MedicalLicense
    }
    if (that typeis MedicalCareOrg) {
      FEINOfficialID              = that.FEINOfficialID
      MedicalOrgSpecialty         = that.MedicalOrgSpecialty
      PrimaryContactPublicID      = that.PrimaryContact.PublicID
    }
    if (that typeis Person) {
      CellPhone                   = that.CellPhone
      DateOfBirth                 = that.DateOfBirth
      FirstName                   = that.FirstName
      FirstNameKanji              = that.FirstNameKanji
      Gender                      = that.Gender
      LastName                    = that.LastName
      LastNameKanji               = that.LastNameKanji
      LicenseNumber               = that.LicenseNumber
      LicenseState                = that.LicenseState
      MaritalStatus               = that.MaritalStatus
      MiddleName                  = that.MiddleName
      Occupation                  = that.Occupation
      Prefix                      = that.Prefix
      Suffix                      = that.Suffix
      TaxFilingStatus             = that.TaxFilingStatus
    }
    return this
  }

  /**
   * Update the supplied Contact using the field values stored in this DTO
   * @param that The Contact to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Contact, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Contact, ignoreNullValues = true) : Contact {
    // if field is on base class
      if (AddressBookUID             != null or !ignoreNullValues) that.AddressBookUID             = AddressBookUID
      if (CollectionAgencyPublicID   != null or !ignoreNullValues) that.CollectionAgency           = CollectionAgency
      if (CreateStatus               != null or !ignoreNullValues) that.CreateStatus               = CreateStatus
      if (EmailAddress1              != null or !ignoreNullValues) that.EmailAddress1              = EmailAddress1
      if (HomePhone                  != null or !ignoreNullValues) that.HomePhone                  = HomePhone
      if (HomePhoneCountry           != null or !ignoreNullValues) that.HomePhoneCountry           = HomePhoneCountry
      if (HomePhoneExtension         != null or !ignoreNullValues) that.HomePhoneExtension         = HomePhoneExtension
      if (Name                       != null or !ignoreNullValues) that.Name                       = Name
      if (NameKanji                  != null or !ignoreNullValues) that.NameKanji                  = NameKanji
      if (Notes                      != null or !ignoreNullValues) that.Notes                      = Notes
      if (OrganizationType           != null or !ignoreNullValues) that.OrganizationType           = OrganizationType
      if (Preferred                  != null or !ignoreNullValues) that.Preferred                  = Preferred
      if (PreferredCurrency          != null or !ignoreNullValues) that.PreferredCurrency          = PreferredCurrency
      if (PrimaryAddressPublicID     != null or !ignoreNullValues) that.PrimaryAddress             = PrimaryAddress
      if (PrimaryPhone               != null or !ignoreNullValues) that.PrimaryPhone               = PrimaryPhone
      if (PublicID                   != null or !ignoreNullValues) that.PublicID                   = PublicID
      if (SSNOfficialID              != null or !ignoreNullValues) that.SSNOfficialID              = SSNOfficialID
      if (Score                      != null or !ignoreNullValues) that.Score                      = Score
      if (SpecialtyType              != null or !ignoreNullValues) that.SpecialtyType              = SpecialtyType
      if (TaxID                      != null or !ignoreNullValues) that.TaxID                      = TaxID
      if (TaxStatus                  != null or !ignoreNullValues) that.TaxStatus                  = TaxStatus
      if (ThirdpartyinsurerPublicID  != null or !ignoreNullValues) that.Thirdpartyinsurer          = Thirdpartyinsurer
      if (ValidationLevel            != null or !ignoreNullValues) that.ValidationLevel            = ValidationLevel
      if (VendorNumber               != null or !ignoreNullValues) that.VendorNumber               = VendorNumber
      if (VendorType                 != null or !ignoreNullValues) that.VendorType                 = VendorType
      if (WorkPhone                  != null or !ignoreNullValues) that.WorkPhone                  = WorkPhone
      if (WorkPhoneCountry           != null or !ignoreNullValues) that.WorkPhoneCountry           = WorkPhoneCountry
      if (WorkPhoneExtension         != null or !ignoreNullValues) that.WorkPhoneExtension         = WorkPhoneExtension
    //
    if (that typeis AutoRepairShop) {
      if (AutoRepairLicense          != null or !ignoreNullValues) that.AutoRepairLicense          = AutoRepairLicense
    }
    if (that typeis Doctor) {
      if (DoctorSpecialty            != null or !ignoreNullValues) that.DoctorSpecialty            = DoctorSpecialty
      if (EmployerPublicID           != null or !ignoreNullValues) that.Employer                   = Employer
      if (MedicalLicense             != null or !ignoreNullValues) that.MedicalLicense             = MedicalLicense
    }
    if (that typeis MedicalCareOrg) {
      if (FEINOfficialID             != null or !ignoreNullValues) that.FEINOfficialID             = FEINOfficialID
      if (MedicalOrgSpecialty        != null or !ignoreNullValues) that.MedicalOrgSpecialty        = MedicalOrgSpecialty
      if (PrimaryContactPublicID     != null or !ignoreNullValues) that.PrimaryContact             = PrimaryContact
    }
    if (that typeis Person) {
      if (CellPhone                  != null or !ignoreNullValues) that.CellPhone                  = CellPhone
      if (DateOfBirth                != null or !ignoreNullValues) that.DateOfBirth                = DateOfBirth
      if (FirstName                  != null or !ignoreNullValues) that.FirstName                  = FirstName
      if (FirstNameKanji             != null or !ignoreNullValues) that.FirstNameKanji             = FirstNameKanji
      if (Gender                     != null or !ignoreNullValues) that.Gender                     = Gender
      if (LastName                   != null or !ignoreNullValues) that.LastName                   = LastName
      if (LastNameKanji              != null or !ignoreNullValues) that.LastNameKanji              = LastNameKanji
      if (LicenseNumber              != null or !ignoreNullValues) that.LicenseNumber              = LicenseNumber
      if (LicenseState               != null or !ignoreNullValues) that.LicenseState               = LicenseState
      if (MaritalStatus              != null or !ignoreNullValues) that.MaritalStatus              = MaritalStatus
      if (MiddleName                 != null or !ignoreNullValues) that.MiddleName                 = MiddleName
      if (Occupation                 != null or !ignoreNullValues) that.Occupation                 = Occupation
      if (Prefix                     != null or !ignoreNullValues) that.Prefix                     = Prefix
      if (Suffix                     != null or !ignoreNullValues) that.Suffix                     = Suffix
      if (TaxFilingStatus            != null or !ignoreNullValues) that.TaxFilingStatus            = TaxFilingStatus
    }
    return that
  }

  /**
   * Uses the createNew block to create a new Contact, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Contact.
   * @param createNew (Optional) A block that returns a new instance of Contact. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Contact, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Contact = null, ignoreNullValues = true) : Contact {
    var instance : Contact
    if (createNew == null) {
      instance = bundle == null
          ? ReflectUtil.construct(ConcreteSubtypeClassName, {})
          : ReflectUtil.construct(ConcreteSubtypeClassName, {bundle})
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /**
   * Returns the name of the instantiable subclass referred to by the Subtype typekey.
   * @throws IllegalArgumentException if Subclass is null, since the base class (Contact) is abstract.
   */
  final property get ConcreteSubtypeClassName() : String {
    if (Subtype == null) {
      throw new IllegalArgumentException("The subtype field must be set since Contact is abstract and cannot be instantiated!")
    }
    return "entity." + Subtype.Code
  }

  /** Convenience property that returns the {@link Company} whose PublicID is {@code CollectionAgencyPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CollectionAgency()        : Company                      { return fetchByPublicID(CollectionAgencyPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()              : User                         { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Company} whose PublicID is {@code EmployerPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Employer()                : Company                      { return fetchByPublicID(EmployerPublicID) }
  
  /** Convenience property that returns the {@link Address} whose PublicID is {@code PrimaryAddressPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get PrimaryAddress()          : Address                      { return fetchByPublicID(PrimaryAddressPublicID) }
  
  /** Convenience property that returns the {@link Contact} whose PublicID is {@code PrimaryContactPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get PrimaryContact()          : Contact                      { return fetchByPublicID(PrimaryContactPublicID) }
  
  /** Convenience property that returns the {@link Company} whose PublicID is {@code ThirdpartyinsurerPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Thirdpartyinsurer()       : Company                      { return fetchByPublicID(ThirdpartyinsurerPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()              : User                         { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new ContactDTO that represents the current state of the supplied Contact.
   * @param that The Contact to be represented.
   */
  static function valueOf(that : Contact) : ContactDTO {
    return new ContactDTO().readFrom(that)
  }

  /**
   * Returns the Contact whose public ID is in the supplied list, or null if the publicID is null.
   * @param publicIDs A list of the PublicIDs.
   */
  private static function fetchByPublicID<T extends KeyableBean>(publicID: String) : T {
    var result : T
    if (publicID != null) {
      result = Query.make(T)
          .compare(T#PublicID, Equals, publicID)
          .select()
          .AtMostOneRow
      if (result == null) throw BadIdentifierException.badPublicId(T, publicID)
    }
    return result
  }

}