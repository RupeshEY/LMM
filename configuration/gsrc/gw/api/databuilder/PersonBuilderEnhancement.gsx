package gw.api.databuilder
uses gw.api.contact.ContactRelationships

uses java.util.Date

@Export
enhancement PersonBuilderEnhancement : PersonBuilder {
  
  function withContactAddress(addrBuilder : AddressBuilder) : PersonBuilder {
    this.addArrayElement(Contact.Type.TypeInfo.getProperty( "ContactAddresses" ), new ContactAddressBuilder().withAddress( addrBuilder ))
    return this
  } 

  /**
   * Use this ContactBuilder to create a new related contact of the given relationship.
   * @param relationship the relationship for the new contact
   * @param contactBuilder the  
   * @return ContactBuilder
   */
  function withRelatedContact( relationship : ContactBidiRel, contactBuilder : ContactBuilder ) : PersonBuilder
  {
    var contactRel = new ContactRelationships()
    var rel = contactRel.getRelationshipType(relationship)
    if (contactRel.isForward(relationship)) {
      this.addArrayElement( Contact.Type.TypeInfo.getProperty( "TargetRelatedContacts" ), new CCContactContactBuilder().withTargetContact( rel, contactBuilder ))
    } else {
      this.addArrayElement( Contact.Type.TypeInfo.getProperty( "SourceRelatedContacts" ), new CCContactContactBuilder().withSrcContact( rel, contactBuilder ))
    }
    return this
  }

  /**
   * Sets the DateOfBirth for the Person
   * @param dob the desired value
   * @return the modified builder
   */
  function withDateOfBirth( dob : Date) : PersonBuilder {
    this.set(Person#DateOfBirth, dob)
    return this
  }

  /**
   * Sets the ClaimantIDType for the Person
   * @param claimantIDType the desired value
   * @return the modified builder
   */
  function withClaimantIDType( claimantIDType : ClaimantIDType) : PersonBuilder {
    this.set(Person#ClaimantIDType, claimantIDType)
    return this
  }

  /**
   * Sets the SSNReleaseAuthorized for the Person
   * @param sSNReleaseAuthorized the desired value
   * @return the modified builder
   */
  function withSSNReleaseAuthorized( sSNReleaseAuthorized : boolean) : PersonBuilder {
    this.set(Person#SSNReleaseAuthorized, sSNReleaseAuthorized)
    return this
  }

  /**
   * Sets the EducationLevel for the Person
   * @param educationLevel the desired value
   * @return the modified builder
   */
  function withEducationLevel( educationLevel : String) : PersonBuilder {
    this.set(Person#EducationLevel, educationLevel)
    return this
  }
}
