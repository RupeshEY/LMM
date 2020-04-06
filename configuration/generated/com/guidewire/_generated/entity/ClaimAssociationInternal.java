package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimAssociation.eti;ClaimAssociation.eix;ClaimAssociation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimAssociationInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.claimassoc.impl.ClaimAssociationInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.claimassoc.entity.ClaimAssociation {
  java.lang.String CLAIMASSOCIATIONADDED_EVENT = "ClaimAssociationAdded";
  
  java.lang.String CLAIMASSOCIATIONCHANGED_EVENT = "ClaimAssociationChanged";
  
  java.lang.String CLAIMASSOCIATIONREMOVED_EVENT = "ClaimAssociationRemoved";
  
  /**
   * Adds the given element to the ClaimsInAssoc array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimsInAssoc(entity.ClaimInAssociation element);
  
  
  /**
   * Gets the value of the ClaimAssocType field.
   * Type of the association among the claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimAssocType getClaimAssocType();
  
  
  /**
   * Gets the value of the ClaimsInAssoc field.
   * The claims belonging to this association.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInAssociation[] getClaimsInAssoc();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the association.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Title field.
   * A brief title for the association.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTitle();
  
  
  /**
   * Removes the given element from the ClaimsInAssoc array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimsInAssoc(entity.ClaimInAssociation element);
  
  
  /**
   * Removes the given element from the ClaimsInAssoc array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimsInAssoc(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ClaimAssocType field.
   */
  public void setClaimAssocType(typekey.ClaimAssocType value);
  
  
  /**
   * Sets the value of the ClaimsInAssoc field.
   */
  public void setClaimsInAssoc(entity.ClaimInAssociation[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Title field.
   */
  public void setTitle(java.lang.String value);
  
  
  
}