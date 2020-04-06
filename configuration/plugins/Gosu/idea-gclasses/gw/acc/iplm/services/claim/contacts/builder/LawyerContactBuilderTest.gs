package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.testharness.v3.GUnitTestClass

class LawyerContactBuilderTest extends GUnitTestClass {

  private final var _lawyerContactBuilder = new LawyerContactBuilder()
  private var _claim: Claim
  private var _contactDetails: List<ContactDetailsDTO>

  override function beforeMethod() {
    _claim = ClaimBuilderHelper.createClaim()
    _lawyerContactBuilder._newClaim = _claim
    _lawyerContactBuilder._contactRole = ContactRole.TC_ATTORNEY
    _contactDetails = new ArrayList<ContactDetailsDTO>()
  }

  function testCreateContacts_WithOneValidContact(){
    // Arrange
    var contactDetail = new ContactDetailsDTO()
    contactDetail.Name = "TestContactDetailsName"
    contactDetail.Reference = "TestCDReference"
    _contactDetails.add(contactDetail)
    _lawyerContactBuilder._contactDetails = _contactDetails
    // Act
    var results : List<ClaimContact>
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _claim = bundle.add(_claim)
      results = _lawyerContactBuilder.createContacts()
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
    _contactDetails.add(new ContactDetailsDTO())
    _contactDetails.add(contactDetail)
    _lawyerContactBuilder._contactDetails = _contactDetails
    // Act
    var result = _lawyerContactBuilder.createContacts()
    // Assert
    assertEquals(1, result.Count)
    assertEquals(contactDetail.Name, result.first().Contact.Name)
    assertEquals(contactDetail.Reference, result.first().Contact.OriginalInsurerReference_Ext)
  }

  function testCreateContacts_WithTwoInvalidContacts(){
    _lawyerContactBuilder._contactDetails = {new ContactDetailsDTO(), new ContactDetailsDTO()}
    // Act
    var result = _lawyerContactBuilder.createContacts()
    // Assert
    assertEquals(0, result.Count)
  }
}