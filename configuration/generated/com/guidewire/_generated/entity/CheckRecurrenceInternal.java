package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckRecurrence.eti;CheckRecurrence.eix;CheckRecurrence.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CheckRecurrenceInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.check.impl.CheckRecurrenceInternal, gw.cc.financials.check.entity.CheckRecurrence {
  /**
   * Adds the given element to the CheckSetArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCheckSetArray(entity.CheckSet element);
  
  
  /**
   * Gets the value of the CheckSet field.
   * The CheckSet for which this CheckRecurrence defines the recurrence schedule
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckSet getCheckSet();
  
  
  /**
   * Gets the value of the CheckSetArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckSet[] getCheckSetArray();
  
  
  public gw.pl.persistence.core.Key getCheckSetID();
  
  
  /**
   * Gets the value of the FirstDueDate field.
   * Due date of the first check in the recurrence.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFirstDueDate();
  
  
  /**
   * Gets the value of the IssuanceDateOffset field.
   * Number of days before a check is due that it should be issued.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIssuanceDateOffset();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the NumChecks field.
   * Number of checks in the recurrence.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumChecks();
  
  
  /**
   * Gets the value of the RecurrenceDay field.
   * Day of the week the check is due.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecurrenceDay getRecurrenceDay();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CheckRecurrence getSubtype();
  
  
  /**
   * Removes the given element from the CheckSetArray array. This is achieved by marking the element for removal.
   */
  public void removeFromCheckSetArray(entity.CheckSet element);
  
  
  /**
   * Removes the given element from the CheckSetArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCheckSetArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CheckSet field.
   */
  public void setCheckSet(entity.CheckSet value);
  
  
  /**
   * Sets the value of the CheckSetArray field.
   */
  public void setCheckSetArray(entity.CheckSet[] value);
  
  
  public void setCheckSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FirstDueDate field.
   */
  public void setFirstDueDate(java.util.Date value);
  
  
  /**
   * Sets the value of the IssuanceDateOffset field.
   */
  public void setIssuanceDateOffset(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumChecks field.
   */
  public void setNumChecks(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RecurrenceDay field.
   */
  public void setRecurrenceDay(typekey.RecurrenceDay value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.CheckRecurrence value);
  
  
  
}