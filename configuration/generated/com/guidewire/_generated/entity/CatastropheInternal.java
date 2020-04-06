package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Catastrophe.eti;Catastrophe.eix;Catastrophe.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CatastropheInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.EventAwareInternal, gw.cc.catastrophe.entity.Catastrophe {
  java.lang.String CATASTROPHEADDED_EVENT = "CatastropheAdded";
  
  java.lang.String CATASTROPHECHANGED_EVENT = "CatastropheChanged";
  
  java.lang.String CATASTROPHEREMOVED_EVENT = "CatastropheRemoved";
  
  /**
   * Adds the given element to the CatastropheZones array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCatastropheZones(entity.CatastropheZone element);
  
  
  /**
   * Adds the given element to the ClaimsHistory array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimsHistory(entity.CatastropheClaimsHistory element);
  
  
  /**
   * Adds the given element to the Description_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDescription_L10N_ARRAY(entity.Catastrophe_Description_L10N element);
  
  
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.Catastrophe_Name_L10N element);
  
  
  /**
   * Adds the given element to the Perils array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPerils(entity.CatastrophePeril element);
  
  
  /**
   * Gets the value of the BottomRightLatitude field.
   * Latitude for the bottom right point of the area of interest, in degrees.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getBottomRightLatitude();
  
  
  /**
   * Gets the value of the BottomRightLongitude field.
   * Longitude for the bottom right point of the area of interest, in degrees.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getBottomRightLongitude();
  
  
  /**
   * Gets the value of the CatastropheNumber field.
   * Catastrophe number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCatastropheNumber();
  
  
  /**
   * Gets the value of the CatastropheValidFrom field.
   * Start date when this catastrophe is valid
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCatastropheValidFrom();
  
  
  /**
   * Gets the value of the CatastropheValidTo field.
   * Date when this catastrophe is no longer valid
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCatastropheValidTo();
  
  
  /**
   * Gets the value of the CatastropheZones field.
   * The zones that define this catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CatastropheZone[] getCatastropheZones();
  
  
  /**
   * Gets the value of the ClaimsHistory field.
   * History of the matched claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CatastropheClaimsHistory[] getClaimsHistory();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments regarding the Catastrophe
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Description_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe_Description_L10N[] getDescription_L10N_ARRAY();
  
  
  /**
   * Array association for partition Description_L10N_ARRAYByLanguage on array Description_L10N_ARRAY
   */
  public entity.Catastrophe_Description_L10N getDescription_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the LCOCode field.
   * Lloyd's Claim Office (LCO) catastrophe code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLCOCode();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * Name of the catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.Catastrophe_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the PCSCatastropheNumber field.
   * PCS catastrophe number from ISO data feed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPCSCatastropheNumber();
  
  
  /**
   * Gets the value of the Perils field.
   * Details of perils associated with a catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CatastrophePeril[] getPerils();
  
  
  /**
   * Gets the value of the PolicyEffectiveDate field.
   * Effective date for retrieving policy locations from the policy system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPolicyEffectiveDate();
  
  
  /**
   * Gets the value of the PolicyRetrievalCompletionTime field.
   * Time when last policy retrieval location was completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPolicyRetrievalCompletionTime();
  
  
  /**
   * Gets the value of the PolicyRetrievalSetTime field.
   * Time when policy location retrieval parameters were last set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPolicyRetrievalSetTime();
  
  
  /**
   * Gets the value of the TopLeftLatitude field.
   * Latitude for the top left  point of the area of interest, in degrees.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTopLeftLatitude();
  
  
  /**
   * Gets the value of the TopLeftLongitude field.
   * Longitude for the top left point of the area of interest, in degrees.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTopLeftLongitude();
  
  
  /**
   * Gets the value of the Type field.
   * Type of the catastrophe (for example, ISO or internal).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CatastropheType getType();
  
  
  /**
   * Gets the value of the Active field.
   * True if a catastrophe can be assigned to a new claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActive();
  
  
  /**
   * Gets the value of the ScheduleBatch field.
   * Boolean field to mark a catastrophe to be run in the CatastropheClaimFinder batch process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isScheduleBatch();
  
  
  /**
   * Removes the given element from the CatastropheZones array. This is achieved by marking the element for removal.
   */
  public void removeFromCatastropheZones(entity.CatastropheZone element);
  
  
  /**
   * Removes the given element from the CatastropheZones array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCatastropheZones(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimsHistory array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimsHistory(entity.CatastropheClaimsHistory element);
  
  
  /**
   * Removes the given element from the ClaimsHistory array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimsHistory(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromDescription_L10N_ARRAY(entity.Catastrophe_Description_L10N element);
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDescription_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.Catastrophe_Name_L10N element);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Perils array. This is achieved by marking the element for removal.
   */
  public void removeFromPerils(entity.CatastrophePeril element);
  
  
  /**
   * Removes the given element from the Perils array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPerils(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Active field.
   */
  public void setActive(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the BottomRightLatitude field.
   */
  public void setBottomRightLatitude(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the BottomRightLongitude field.
   */
  public void setBottomRightLongitude(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CatastropheNumber field.
   */
  public void setCatastropheNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CatastropheValidFrom field.
   */
  public void setCatastropheValidFrom(java.util.Date value);
  
  
  /**
   * Sets the value of the CatastropheValidTo field.
   */
  public void setCatastropheValidTo(java.util.Date value);
  
  
  /**
   * Sets the value of the CatastropheZones field.
   */
  public void setCatastropheZones(entity.CatastropheZone[] value);
  
  
  /**
   * Sets the value of the ClaimsHistory field.
   */
  public void setClaimsHistory(entity.CatastropheClaimsHistory[] value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Description_L10N_ARRAY field.
   */
  public void setDescription_L10N_ARRAY(entity.Catastrophe_Description_L10N[] value);
  
  
  /**
   * Sets the value of the LCOCode field.
   */
  public void setLCOCode(java.lang.String value);
  
  
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
  public void setName_L10N_ARRAY(entity.Catastrophe_Name_L10N[] value);
  
  
  /**
   * Sets the value of the PCSCatastropheNumber field.
   */
  public void setPCSCatastropheNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Perils field.
   */
  public void setPerils(entity.CatastrophePeril[] value);
  
  
  /**
   * Sets the value of the PolicyEffectiveDate field.
   */
  public void setPolicyEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PolicyRetrievalCompletionTime field.
   */
  public void setPolicyRetrievalCompletionTime(java.util.Date value);
  
  
  /**
   * Sets the value of the PolicyRetrievalSetTime field.
   */
  public void setPolicyRetrievalSetTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ScheduleBatch field.
   */
  public void setScheduleBatch(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TopLeftLatitude field.
   */
  public void setTopLeftLatitude(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TopLeftLongitude field.
   */
  public void setTopLeftLongitude(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.CatastropheType value);
  
  
  
}