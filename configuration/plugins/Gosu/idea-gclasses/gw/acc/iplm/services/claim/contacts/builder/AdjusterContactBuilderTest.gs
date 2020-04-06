package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.testharness.v3.GUnitTestClass

class AdjusterContactBuilderTest extends GUnitTestClass {

  private final var _adjusterContactBuilder = new AdjusterContactBuilder()
  private var _claim: Claim
  private var _contactDetails: List<ContactDetailsDTO>

  override function beforeMethod() {
    _claim = ClaimBuilderHelper.createClaim()
    _adjusterContactBuilder._newClaim = _claim
    _adjusterContactBuilder._contactRole = ContactRole.TC_EXTERNALADJUSTER_EXT
    _contactDetails = new ArrayList<ContactDetailsDTO>()
  }

  function testCreateContacts_WithOneValidContact(){
    // Arrange
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Name = "TestContactDetailsName"
    contactDetail.Reference = "TestCDReference"
    _contactDetails.add(contactDetail)
    _adjusterContactBuilder._contactDetails = _contactDetails
    // Act
    var results : List<ClaimContact>
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claim = bundle.add(_claim)
      results = _adjusterContactBuilder.createContacts()
    }, User.util.getUnrestrictedUser())
    // Assert
    assertEquals(1, results.Count)
    assertEquals(contactDetail.Name, results.first().Contact.Name)
    assertEquals(contactDetail.Reference, results.first().Contact.OriginalInsurerReference_Ext)
  }

  function testCreateContacts_WithOneInvalidOneValidContact(){
    // Arrange
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Name = "TestContactDetailsName"
    contactDetail.Reference = "TestCDReference"
    _contactDetails.add(contactDetail)
    _contactDetails.add(new ContactDetailsDTO())
    _adjusterContactBuilder._contactDetails = _contactDetails
    // Act
    var result = _adjusterContactBuilder.createContacts()
    // Assert
    assertEquals(1, result.Count)
    assertEquals(contactDetail.Name, result.first().Contact.Name)
    assertEquals(contactDetail.Reference, result.first().Contact.OriginalInsurerReference_Ext)
  }

  function testCreateContacts_WithTwoInvalidContacts(){
    _contactDetails.add(new ContactDetailsDTO())
    _contactDetails.add(new ContactDetailsDTO())
    _adjusterContactBuilder._contactDetails = _contactDetails
    // Act
    var result = _adjusterContactBuilder.createContacts()
    // Assert
    assertEquals(0, result.Count)
  }
}