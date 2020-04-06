package gw.command

uses gw.api.databuilder.PersonBuilder
uses gw.api.databuilder.CompanyBuilder
uses gw.api.databuilder.LegalVenueBuilder
uses gw.api.util.LocationUtil
uses com.guidewire.pl.quickjump.DefaultMethod
uses com.guidewire.pl.quickjump.Argument
uses pcf.AddressBookSearch

@DefaultMethod("personType")
@Export
class NewContact extends CCBaseCommand {
  
  @Argument("Person Type", "Person")
  function personType() {
    var entityType = gw.lang.reflect.TypeSystem.getByFullName("entity." + Argument) as gw.entity.IEntityType
    var contact = PersonBuilder.uiReadyPersonOfType(entityType).withTaxID(randMasked("###-##-####")).createAndCommit()
    contact.createInAddressBook(true)
    AddressBookSearch.go()
    LocationUtil.addRequestScopedInfoMessage(Argument + ":  " + contact.FirstName + " " + contact.LastName)
  }

  @Argument("Company Type", "Company")
      function companyType() {
      var entityType = gw.lang.reflect.TypeSystem.getByFullName("entity." + Argument) as gw.entity.IEntityType
      var contact = CompanyBuilder.uiReadyCompanyOfType(entityType).withTaxID(randMasked("##-#######")).createAndCommit()
      contact.createInAddressBook(true)
      AddressBookSearch.go()
      LocationUtil.addRequestScopedInfoMessage(Argument + ":  " + contact.Name)
  }

  function legalVenue() {
    var code = randDigits(5)
    var contact = new LegalVenueBuilder()
            .withName("LegalVenue" + code)
            .withPrimaryAddress( new gw.api.databuilder.AddressBuilder()
                      .withAddressLine1(code + " Main St.")
                      .withCity("San Mateo")
                      .withPostalCode("94404")
                      .withState(State.getState(Country.TC_US, "CA"))
                      .withCountry(Country.TC_US))
            .withWorkPhone("650-234-1111")
            .createAndCommit()
    contact.createInAddressBook(true)
    AddressBookSearch.go()
    LocationUtil.addRequestScopedInfoMessage("Legal Venue:  " + contact.Name)
  }
}
