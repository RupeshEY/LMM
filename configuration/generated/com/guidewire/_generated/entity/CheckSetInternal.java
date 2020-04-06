package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckSet.eti;CheckSet.eix;CheckSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CheckSetInternal extends com.guidewire._generated.entity.TransactionSetInternal, com.guidewire.cc.domain.financials.check.impl.CheckSetInternal, gw.api.financials.CheckCreatorProvider, gw.cc.financials.check.entity.CheckSet {
  /**
   * Adds the given element to the CheckGroups array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCheckGroups(entity.CheckGroup element);
  
  
  /**
   * Adds the given element to the Checks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToChecks(entity.Check element);
  
  
  /**
   * Adds the given element to the RecurringChecks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRecurringChecks(entity.RecurringCheck element);
  
  
  /**
   * Adds the given element to the Reserves array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReserves(entity.CheckSetReserve element);
  
  
  /**
   * Gets the value of the CheckGroups field.
   * The check groups of multi-payee checks contained in the check set, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckGroup[] getCheckGroups();
  
  
  /**
   * Gets the value of the Checks field.
   * All checks contained in the check set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check[] getChecks();
  
  
  /**
   * Gets the value of the Recurrence field.
   * The recurrence schedule for the check set, if it has one.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckRecurrence getRecurrence();
  
  
  public gw.pl.persistence.core.Key getRecurrenceID();
  
  
  /**
   * Gets the value of the RecurringChecks field.
   * Recurring checks (if any) that make up this check set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecurringCheck[] getRecurringChecks();
  
  
  /**
   * Gets the value of the Reserves field.
   * Reserves that should be approved or rejected along with the set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckSetReserve[] getReserves();
  
  
  /**
   * Removes the given element from the CheckGroups array. This is achieved by marking the element for removal.
   */
  public void removeFromCheckGroups(entity.CheckGroup element);
  
  
  /**
   * Removes the given element from the CheckGroups array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCheckGroups(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Checks array. This is achieved by marking the element for removal.
   */
  public void removeFromChecks(entity.Check element);
  
  
  /**
   * Removes the given element from the Checks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromChecks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RecurringChecks array. This is achieved by marking the element for removal.
   */
  public void removeFromRecurringChecks(entity.RecurringCheck element);
  
  
  /**
   * Removes the given element from the RecurringChecks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecurringChecks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Reserves array. This is achieved by marking the element for removal.
   */
  public void removeFromReserves(entity.CheckSetReserve element);
  
  
  /**
   * Removes the given element from the Reserves array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromReserves(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CheckGroups field.
   */
  public void setCheckGroups(entity.CheckGroup[] value);
  
  
  /**
   * Sets the value of the Checks field.
   */
  public void setChecks(entity.Check[] value);
  
  
  /**
   * Sets the value of the Recurrence field.
   */
  public void setRecurrence(entity.CheckRecurrence value);
  
  
  public void setRecurrenceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RecurringChecks field.
   */
  public void setRecurringChecks(entity.RecurringCheck[] value);
  
  
  /**
   * Sets the value of the Reserves field.
   */
  public void setReserves(entity.CheckSetReserve[] value);
  
  
  
}