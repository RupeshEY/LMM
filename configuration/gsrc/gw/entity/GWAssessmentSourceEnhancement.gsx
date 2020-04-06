package gw.entity;

@Export
enhancement GWAssessmentSourceEnhancement : entity.AssessmentSource
{
  function ensureContactIsClaimContact(mycontact : Contact) {
    
     if (not this.Incident.Claim.Contacts.toList().hasMatch(\ contact -> contact.Contact == mycontact)) {
        var newClaimContact = new ClaimContact( mycontact );  
        newClaimContact.Claim = this.Incident.Claim ;
        newClaimContact.Contact = mycontact ;
        var element = new ClaimContactRole( mycontact );
        // Will need to add a new role
        element.Role = TC_ASSESSOR;
        element.Incident = this.Incident;
        newClaimContact.addToRoles( element );
     }  
  }
  
}
