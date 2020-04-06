package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Organization.eti;Organization.eix;Organization.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OrganizationInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.community.impl.OrganizationCoreExtMethods, com.guidewire.pl.domain.community.OrganizationPublicMethods, com.guidewire.pl.domain.community.impl.OrganizationInternalMethods, com.guidewire.pl.system.bundle.RemoveCallback {
  java.lang.String ORGANIZATIONADDED_EVENT = "OrganizationAdded";
  
  java.lang.String ORGANIZATIONCHANGED_EVENT = "OrganizationChanged";
  
  java.lang.String ORGANIZATIONREMOVED_EVENT = "OrganizationRemoved";
  
  /**
   * Adds the given element to the OrggroupArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOrggroupArray(entity.Orggroup element);
  
  
  /**
   * Adds the given element to the ZonesToAdmin array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToZonesToAdmin(entity.OrganizationZoneAdmin element);
  
  
  /**
   * Gets the value of the Contact field.
   * Contact entry related to the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the Name field.
   * The name of the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the NameDenorm field.
   * denorm field for Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameDenorm();
  
  
  /**
   * Gets the value of the NameKanji field.
   * The kanji name of the organization. Used only for Japanese and will be null otherwise.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji();
  
  
  /**
   * Gets the value of the OrggroupArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Orggroup[] getOrggroupArray();
  
  
  /**
   * Gets the value of the RootGroup field.
   * The organization's root group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getRootGroup();
  
  
  public gw.pl.persistence.core.Key getRootGroupID();
  
  
  /**
   * Gets the value of the Type field.
   * The type of the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BusinessType getType();
  
  
  /**
   * Gets the value of the ZonesToAdmin field.
   * Link to joiner table for zones to admin.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OrganizationZoneAdmin[] getZonesToAdmin();
  
  
  /**
   * Gets the value of the Carrier field.
   * Flag indicating whether this organization corresponds to the carrier itself.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCarrier();
  
  
  /**
   * Gets the value of the MasterAdmin field.
   * Flag indicating whether this organization is the superuser organization with admin powers over all organizations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMasterAdmin();
  
  
  /**
   * Removes the given element from the OrggroupArray array. This is achieved by marking the element for removal.
   */
  public void removeFromOrggroupArray(entity.Orggroup element);
  
  
  /**
   * Removes the given element from the OrggroupArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOrggroupArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ZonesToAdmin array. This is achieved by marking the element for removal.
   */
  public void removeFromZonesToAdmin(entity.OrganizationZoneAdmin element);
  
  
  /**
   * Removes the given element from the ZonesToAdmin array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromZonesToAdmin(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Carrier field.
   */
  public void setCarrier(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the MasterAdmin field.
   */
  public void setMasterAdmin(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the NameDenorm field.
   */
  public void setNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the OrggroupArray field.
   */
  public void setOrggroupArray(entity.Orggroup[] value);
  
  
  /**
   * Sets the value of the RootGroup field.
   */
  public void setRootGroup(entity.Group value);
  
  
  public void setRootGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.BusinessType value);
  
  
  /**
   * Sets the value of the ZonesToAdmin field.
   */
  public void setZonesToAdmin(entity.OrganizationZoneAdmin[] value);
  
  
  
}