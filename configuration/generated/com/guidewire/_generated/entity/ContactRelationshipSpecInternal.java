package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactRelationshipSpec.eti;ContactRelationshipSpec.eix;ContactRelationshipSpec.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactRelationshipSpecInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.contact.impl.ContactRelationshipSpecInternalMethods {
  /**
   * Adds the given element to the SourceRelationships array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSourceRelationships(entity.ContactRelationshipSpecRel element);
  
  
  /**
   * Adds the given element to the TargetRelationships array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTargetRelationships(entity.ContactRelationshipSpecRel element);
  
  
  /**
   * Gets the value of the SourceRelationships field.
   * Relationships that the contact is on the source side.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactRelationshipSpecRel[] getSourceRelationships();
  
  
  /**
   * Gets the value of the TargetRelationships field.
   * Relationships that the contact is on the target side.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactRelationshipSpecRel[] getTargetRelationships();
  
  
  /**
   * Removes the given element from the SourceRelationships array. This is achieved by marking the element for removal.
   */
  public void removeFromSourceRelationships(entity.ContactRelationshipSpecRel element);
  
  
  /**
   * Removes the given element from the SourceRelationships array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSourceRelationships(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TargetRelationships array. This is achieved by marking the element for removal.
   */
  public void removeFromTargetRelationships(entity.ContactRelationshipSpecRel element);
  
  
  /**
   * Removes the given element from the TargetRelationships array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTargetRelationships(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the SourceRelationships field.
   */
  public void setSourceRelationships(entity.ContactRelationshipSpecRel[] value);
  
  
  /**
   * Sets the value of the TargetRelationships field.
   */
  public void setTargetRelationships(entity.ContactRelationshipSpecRel[] value);
  
  
  
}