package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactContact.eti;ContactContact.eix;ContactContact.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactContactInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.CommonContactContactInternal, com.guidewire._generated.entity.AddressBookLinkableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.OverlapTableInternal, com.guidewire.pl.domain.contact.ContactContactPublicMethods, com.guidewire.pl.domain.contact.impl.CommonContactContactImplCallback, com.guidewire.pl.system.bundle.InsertCallback, gw.api.contact.ContactRetireBean {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the RelatedContact field.
   * "RelatedContactID" is the "Relationship" of "SourceContactID".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getRelatedContact();
  
  
  public gw.pl.persistence.core.Key getRelatedContactID();
  
  
  /**
   * Gets the value of the Relationship field.
   * Relationship between the two contacts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRel getRelationship();
  
  
  /**
   * Gets the value of the SourceContact field.
   * "SourceContactID" has "RelatedContactID" as "Relationship".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getSourceContact();
  
  
  public gw.pl.persistence.core.Key getSourceContactID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the RelatedContact field.
   */
  public void setRelatedContact(entity.Contact value);
  
  
  public void setRelatedContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Relationship field.
   */
  public void setRelationship(typekey.ContactRel value);
  
  
  /**
   * Sets the value of the SourceContact field.
   */
  public void setSourceContact(entity.Contact value);
  
  
  public void setSourceContactID(gw.pl.persistence.core.Key value);
  
  
  
}