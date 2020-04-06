package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactRelationshipSpecRel.eti;ContactRelationshipSpecRel.eix;ContactRelationshipSpecRel.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactRelationshipSpecRelInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Relationship field.
   * Type of relationship.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRel getRelationship();
  
  
  /**
   * Gets the value of the Source field.
   * Source relationship.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactRelationshipSpec getSource();
  
  
  public gw.pl.persistence.core.Key getSourceID();
  
  
  /**
   * Gets the value of the Target field.
   * Target relationship.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactRelationshipSpec getTarget();
  
  
  public gw.pl.persistence.core.Key getTargetID();
  
  
  /**
   * Sets the value of the Relationship field.
   */
  public void setRelationship(typekey.ContactRel value);
  
  
  /**
   * Sets the value of the Source field.
   */
  public void setSource(entity.ContactRelationshipSpec value);
  
  
  public void setSourceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Target field.
   */
  public void setTarget(entity.ContactRelationshipSpec value);
  
  
  public void setTargetID(gw.pl.persistence.core.Key value);
  
  
  
}