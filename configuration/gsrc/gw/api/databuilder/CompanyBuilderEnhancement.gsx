package gw.api.databuilder

uses gw.api.contact.ContactRelationships

@Export
enhancement CompanyBuilderEnhancement : CompanyBuilder
{
  
  /**
   * Use this ContactBuilder to create a new related contact of the given relationship.
   * @param relationship the relationship for the new contact
   * @param contactBuilder the  
   * @return ContactBuilder
   */
  function withMyRelatedContact( relationship : ContactBidiRel, contactBuilder : ContactBuilder ) : CompanyBuilder
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
}
