package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AuthorityLimitProfile.eti;AuthorityLimitProfile.eix;AuthorityLimitProfile.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AuthorityLimitProfileInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.community.impl.AuthorityLimitProfileInternal, gw.cc.community.entity.AuthorityLimitProfile {
  java.lang.String AUTHORITYLIMITPROFILEADDED_EVENT = "AuthorityLimitProfileAdded";
  
  java.lang.String AUTHORITYLIMITPROFILECHANGED_EVENT = "AuthorityLimitProfileChanged";
  
  java.lang.String AUTHORITYLIMITPROFILEREMOVED_EVENT = "AuthorityLimitProfileRemoved";
  
  /**
   * Adds the given element to the Description_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDescription_L10N_ARRAY(entity.AuthorityLimitProfile_Description_L10N element);
  
  
  /**
   * Adds the given element to the Limits array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLimits(entity.AuthorityLimit element);
  
  
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.AuthorityLimitProfile_Name_L10N element);
  
  
  /**
   * Gets the value of the Currency field.
   * The currency in which the profile's limits are defined.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Description_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AuthorityLimitProfile_Description_L10N[] getDescription_L10N_ARRAY();
  
  
  /**
   * Array association for partition Description_L10N_ARRAYByLanguage on array Description_L10N_ARRAY
   */
  public entity.AuthorityLimitProfile_Description_L10N getDescription_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Limits field.
   * Limits contained in the profile.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AuthorityLimit[] getLimits();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * Name that identifies the profile.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AuthorityLimitProfile_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.AuthorityLimitProfile_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Custom field.
   * Is this a custom limit, used by a single user?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCustom();
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromDescription_L10N_ARRAY(entity.AuthorityLimitProfile_Description_L10N element);
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDescription_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Limits array. This is achieved by marking the element for removal.
   */
  public void removeFromLimits(entity.AuthorityLimit element);
  
  
  /**
   * Removes the given element from the Limits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLimits(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.AuthorityLimitProfile_Name_L10N element);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the Custom field.
   */
  public void setCustom(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Description_L10N_ARRAY field.
   */
  public void setDescription_L10N_ARRAY(entity.AuthorityLimitProfile_Description_L10N[] value);
  
  
  /**
   * Sets the value of the Limits field.
   */
  public void setLimits(entity.AuthorityLimit[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  public void setName_L10N_ARRAY(entity.AuthorityLimitProfile_Name_L10N[] value);
  
  
  
}