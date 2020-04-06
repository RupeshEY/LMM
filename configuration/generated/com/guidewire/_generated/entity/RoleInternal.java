package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Role.eti;Role.eix;Role.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RoleInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.DecentralizedEntityInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.pl.domain.security.RolePublicMethods, com.guidewire.pl.domain.security.impl.RoleInternalMethods {
  java.lang.String ROLEADDED_EVENT = "RoleAdded";
  
  java.lang.String ROLECHANGED_EVENT = "RoleChanged";
  
  java.lang.String ROLEREMOVED_EVENT = "RoleRemoved";
  
  /**
   * Adds the given element to the Description_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDescription_L10N_ARRAY(entity.Role_Description_L10N element);
  
  
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.Role_Name_L10N element);
  
  
  /**
   * Adds the given element to the Privileges array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPrivileges(entity.RolePrivilege element);
  
  
  /**
   * Gets the value of the Description field.
   * An optional, more detailed description of the role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Description_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Role_Description_L10N[] getDescription_L10N_ARRAY();
  
  
  /**
   * Array association for partition Description_L10N_ARRAYByLanguage on array Description_L10N_ARRAY
   */
  public entity.Role_Description_L10N getDescription_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Name field.
   * Displayable name of the role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Role_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.Role_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Privileges field.
   * Privileges granted by membership in this role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RolePrivilege[] getPrivileges();
  
  
  /**
   * Gets the value of the RoleType field.
   * Type of the role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RoleType getRoleType();
  
  
  /**
   * Gets the value of the CarrierInternalRole field.
   * If true, this role is applicable to users internal to the carrier organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCarrierInternalRole();
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromDescription_L10N_ARRAY(entity.Role_Description_L10N element);
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDescription_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.Role_Name_L10N element);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Privileges array. This is achieved by marking the element for removal.
   */
  public void removeFromPrivileges(entity.RolePrivilege element);
  
  
  /**
   * Removes the given element from the Privileges array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPrivileges(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CarrierInternalRole field.
   */
  public void setCarrierInternalRole(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Description_L10N_ARRAY field.
   */
  public void setDescription_L10N_ARRAY(entity.Role_Description_L10N[] value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  public void setName_L10N_ARRAY(entity.Role_Name_L10N[] value);
  
  
  /**
   * Sets the value of the Privileges field.
   */
  public void setPrivileges(entity.RolePrivilege[] value);
  
  
  /**
   * Sets the value of the RoleType field.
   */
  public void setRoleType(typekey.RoleType value);
  
  
  
}