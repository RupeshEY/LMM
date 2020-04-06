package gw.plugin.contact.ab900

uses gw.api.upgrade.Coercions
uses wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_Results_Entry
uses wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPISearchResultContainer_Results_Entry
uses entity.Address
uses entity.Contact

/*
 *  This class contains methods to map the ABContactAPISearchResult to Contact.
 *  If you add any properties to ABContactAPISearchResult or ABContactAPIFindDuplicatesResult, you need to
 *  update this file to make sure the properties are mapped back to the Contact that is returned
 *  from the search calls.
 */
@Export
class ContactSearchResultMapper {

  private construct() { }

/**
 * Populates a Contact instance with the values returned from a Contact search in ContactManager.
 * 
 * If you extend the ABContactAPISearchResult to have additional properties returned from the search
 * you need to extend this method to copy those properties into the Contact instance.
 * 
 * @param contact the Contact to populate
 * @param searchResult the ABContactAPISearchResult returned from ContactManager
 */
  public static function populateContactFromSearchResult(contact:Contact, searchResult:ABContactAPISearchResultContainer_Results_Entry) {

    contact.AddressBookUID = searchResult.LinkID
    if (contact typeis Person) {
      contact.FirstName   = searchResult.FirstName
      contact.FirstNameKanji   = searchResult.FirstNameKanji
      contact.LastName    = searchResult.LastName
      contact.LastNameKanji    = searchResult.LastNameKanji
      contact.MiddleName  = searchResult.MiddleName
      contact.Prefix      = NamePrefix.get(searchResult.Prefix)
      contact.Suffix      = NameSuffix.get(searchResult.Suffix)
      contact.Particle    = searchResult.Particle
      contact.CellPhone   = searchResult.CellPhone
      contact.CellPhoneCountry = PhoneCountryCode.get(searchResult.CellPhoneCountry)
      contact.CellPhoneExtension = searchResult.CellPhoneExtension
      contact.DateOfBirth = searchResult.DateOfBirth
    }
    contact.Name          = searchResult.Name
    contact.NameKanji     = searchResult.NameKanji
    contact.EmailAddress1 = searchResult.EmailAddress1
    contact.EmailAddress2 = searchResult.EmailAddress2
    contact.PrimaryPhone  = PrimaryPhoneType.get(searchResult.PrimaryPhone)
    contact.FaxPhone      = searchResult.FaxPhone
    contact.FaxPhoneCountry = PhoneCountryCode.get(searchResult.FaxPhoneCountry)
    contact.FaxPhoneExtension = searchResult.FaxPhoneExtension
    contact.HomePhone     = searchResult.HomePhone
    contact.HomePhoneCountry = PhoneCountryCode.get(searchResult.HomePhoneCountry)
    contact.HomePhoneExtension = searchResult.HomePhoneExtension
    contact.WorkPhone     = searchResult.WorkPhone
    contact.WorkPhoneCountry = PhoneCountryCode.get(searchResult.WorkPhoneCountry)
    contact.WorkPhoneExtension = searchResult.WorkPhoneExtension
    contact.Preferred     = searchResult.Preferred
    contact.VendorType    = VendorType.get(searchResult.VendorType)
    contact.Score         = searchResult.Score as java.lang.Integer
    contact.TaxID         = searchResult.TaxID
    var address = new Address(contact.Bundle)
    address.AddressBookUID = searchResult.PrimaryAddress.LinkID
    address.AddressLine1   = searchResult.PrimaryAddress.AddressLine1
    address.AddressLine1Kanji   = searchResult.PrimaryAddress.AddressLine1Kanji
    address.AddressLine2   = searchResult.PrimaryAddress.AddressLine2
    address.AddressLine2Kanji   = searchResult.PrimaryAddress.AddressLine2Kanji
    address.AddressLine3   = searchResult.PrimaryAddress.AddressLine3
    address.City           = searchResult.PrimaryAddress.City
    address.CityKanji      = searchResult.PrimaryAddress.CityKanji
    address.State          = State.get(searchResult.PrimaryAddress.State)
    address.PostalCode     = searchResult.PrimaryAddress.PostalCode
    address.CEDEX          = Coercions.makeBooleanFrom(searchResult.PrimaryAddress.CEDEX)
    address.CEDEXBureau    = searchResult.PrimaryAddress.CEDEXBureau
    address.Country        = Country.get(searchResult.PrimaryAddress.Country)
    address.County         = searchResult.PrimaryAddress.County
    address.Description    = searchResult.PrimaryAddress.Description
    address.AddressType    = AddressType.get(searchResult.PrimaryAddress.AddressType)
    address.ValidUntil     = searchResult.PrimaryAddress.ValidUntil
    address.SpatialPoint   = searchResult.PrimaryAddress.SpatialPoint
    address.GeocodeStatus  = GeocodeStatus.get(searchResult.PrimaryAddress.GeocodeStatus)
    contact.PrimaryAddress = address
    contact.CreateStatus = ContactCreationApprovalStatus.get(searchResult.CreateStatus)
  }

/**
 * Populates a Contact instance with the values returned from a findDuplicates call in ContactManager.
 *
 * If you extend the ABContactAPIFindDuplicatesResult to have additional properties returned from the
 * duplicate search you need to extend this method to copy those properties into the Contact instance.
 *
 * @param contact the Contact to populate
 * @param duplicateResult the ABContactAPIFindDuplicatesResult returned from ContactManager
 */
  public static function populateContactFromDuplicateResult(contact:Contact, duplicateResult:ABContactAPIFindDuplicatesResultContainer_Results_Entry) {
    contact.AddressBookUID = duplicateResult.LinkID
    if (contact typeis Person) {
      contact.FirstName   = duplicateResult.FirstName
      contact.FirstNameKanji   = duplicateResult.FirstNameKanji
      contact.LastName    = duplicateResult.LastName
      contact.LastNameKanji    = duplicateResult.LastNameKanji
      contact.MiddleName  = duplicateResult.MiddleName
      contact.Prefix      = NamePrefix.get(duplicateResult.Prefix)
      contact.Suffix      = NameSuffix.get(duplicateResult.Suffix)
      contact.Particle    = duplicateResult.Particle
      contact.CellPhone   = duplicateResult.CellPhone
      contact.CellPhoneCountry = PhoneCountryCode.get(duplicateResult.CellPhoneCountry)
      contact.CellPhoneExtension = duplicateResult.CellPhoneExtension
      contact.DateOfBirth = duplicateResult.DateOfBirth
    }
    contact.Name          = duplicateResult.Name
    contact.NameKanji     = duplicateResult.NameKanji
    contact.EmailAddress1 = duplicateResult.EmailAddress1
    contact.EmailAddress2 = duplicateResult.EmailAddress2
    contact.PrimaryPhone  = PrimaryPhoneType.get(duplicateResult.PrimaryPhone)
    contact.FaxPhone      = duplicateResult.FaxPhone
    contact.FaxPhoneCountry = PhoneCountryCode.get(duplicateResult.FaxPhoneCountry)
    contact.FaxPhoneExtension = duplicateResult.FaxPhoneExtension
    contact.HomePhone     = duplicateResult.HomePhone
    contact.HomePhoneCountry = PhoneCountryCode.get(duplicateResult.HomePhoneCountry)
    contact.HomePhoneExtension = duplicateResult.HomePhoneExtension
    contact.WorkPhone     = duplicateResult.WorkPhone
    contact.WorkPhoneCountry = PhoneCountryCode.get(duplicateResult.WorkPhoneCountry)
    contact.WorkPhoneExtension = duplicateResult.WorkPhoneExtension
    contact.Preferred     = duplicateResult.Preferred
    contact.VendorType    = VendorType.get(duplicateResult.VendorType)
    contact.Score         = duplicateResult.Score as java.lang.Integer
    contact.TaxID         = duplicateResult.TaxID
    var address = new Address(contact.Bundle)
    address.AddressBookUID = duplicateResult.PrimaryAddress.LinkID
    address.AddressLine1   = duplicateResult.PrimaryAddress.AddressLine1
    address.AddressLine1Kanji   = duplicateResult.PrimaryAddress.AddressLine1Kanji
    address.AddressLine2   = duplicateResult.PrimaryAddress.AddressLine2
    address.AddressLine2Kanji   = duplicateResult.PrimaryAddress.AddressLine2Kanji
    address.AddressLine3   = duplicateResult.PrimaryAddress.AddressLine3
    address.City           = duplicateResult.PrimaryAddress.City
    address.CityKanji      = duplicateResult.PrimaryAddress.CityKanji
    address.State          = State.get(duplicateResult.PrimaryAddress.State)
    address.PostalCode     = duplicateResult.PrimaryAddress.PostalCode
    address.CEDEX          = Coercions.makeBooleanFrom(duplicateResult.PrimaryAddress.CEDEX)
    address.CEDEXBureau    = duplicateResult.PrimaryAddress.CEDEXBureau
    address.Country        = Country.get(duplicateResult.PrimaryAddress.Country)
    address.County         = duplicateResult.PrimaryAddress.County
    address.Description    = duplicateResult.PrimaryAddress.Description
    address.AddressType    = AddressType.get(duplicateResult.PrimaryAddress.AddressType)
    address.ValidUntil     = duplicateResult.PrimaryAddress.ValidUntil
    address.SpatialPoint   = duplicateResult.PrimaryAddress.SpatialPoint
    address.GeocodeStatus  = GeocodeStatus.get(duplicateResult.PrimaryAddress.GeocodeStatus)
    contact.PrimaryAddress = address
  }
}
