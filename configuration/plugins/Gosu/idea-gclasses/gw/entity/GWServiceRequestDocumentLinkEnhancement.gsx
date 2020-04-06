package gw.entity

@Export
enhancement GWServiceRequestDocumentLinkEnhancement : entity.ServiceRequestDocumentLink {

  property get Unlinkable() : boolean {
    return this.DateSpecialistNotified == null and not this.StatementDocumentLinks.HasElements
  }

}
