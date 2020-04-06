package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PurgedRootInfo.eti;PurgedRootInfo.eix;PurgedRootInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PurgedRootInfoInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.EventAwareInternal {
  java.lang.String PURGEDROOTINFOADDED_EVENT = "PurgedRootInfoAdded";
  
  java.lang.String PURGEDROOTINFOCHANGED_EVENT = "PurgedRootInfoChanged";
  
  java.lang.String PURGEDROOTINFOREMOVED_EVENT = "PurgedRootInfoRemoved";
  
  /**
   * Gets the value of the PurgedEntityPublicID field.
   * The PublicID of the purged entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPurgedEntityPublicID();
  
  
  /**
   * Gets the value of the PurgedEntityType field.
   * The name of the type of the purged entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPurgedEntityType();
  
  
  /**
   * Sets the value of the PurgedEntityPublicID field.
   */
  public void setPurgedEntityPublicID(java.lang.String value);
  
  
  /**
   * Sets the value of the PurgedEntityType field.
   */
  public void setPurgedEntityType(java.lang.String value);
  
  
  
}