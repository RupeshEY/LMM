package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ICDCode.eti;ICDCode.eix;ICDCode.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ICDCodeInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.exposure.entity.ICDCode {
  /**
   * Adds the given element to the CodeDesc_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCodeDesc_L10N_ARRAY(entity.ICDCode_CodeDesc_L10N element);
  
  
  /**
   * Gets the value of the AvailabilityDate field.
   * The date this code becomes available
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAvailabilityDate();
  
  
  /**
   * Gets the value of the BodySystem field.
   * Broad classification of diagnosis types
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ICDBodySystem getBodySystem();
  
  
  /**
   * Gets the value of the Code field.
   * ICD 9 or 10 Code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCode();
  
  
  /**
   * Gets the value of the CodeDesc field.
   * ICD code description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCodeDesc();
  
  
  /**
   * Gets the value of the CodeDesc_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ICDCode_CodeDesc_L10N[] getCodeDesc_L10N_ARRAY();
  
  
  /**
   * Array association for partition CodeDesc_L10N_ARRAYByLanguage on array CodeDesc_L10N_ARRAY
   */
  public entity.ICDCode_CodeDesc_L10N getCodeDesc_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the ExpiryDate field.
   * The date this code expires
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpiryDate();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Chronic field.
   * Is the condition chronic
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isChronic();
  
  
  /**
   * Removes the given element from the CodeDesc_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromCodeDesc_L10N_ARRAY(entity.ICDCode_CodeDesc_L10N element);
  
  
  /**
   * Removes the given element from the CodeDesc_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCodeDesc_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AvailabilityDate field.
   */
  public void setAvailabilityDate(java.util.Date value);
  
  
  /**
   * Sets the value of the BodySystem field.
   */
  public void setBodySystem(typekey.ICDBodySystem value);
  
  
  /**
   * Sets the value of the Chronic field.
   */
  public void setChronic(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Code field.
   */
  public void setCode(java.lang.String value);
  
  
  /**
   * Sets the value of the CodeDesc field.
   */
  public void setCodeDesc(java.lang.String value);
  
  
  /**
   * Sets the value of the CodeDesc_L10N_ARRAY field.
   */
  public void setCodeDesc_L10N_ARRAY(entity.ICDCode_CodeDesc_L10N[] value);
  
  
  /**
   * Sets the value of the ExpiryDate field.
   */
  public void setExpiryDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}