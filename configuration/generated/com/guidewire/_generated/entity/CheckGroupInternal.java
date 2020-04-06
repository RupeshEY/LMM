package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckGroup.eti;CheckGroup.eix;CheckGroup.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CheckGroupInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.check.impl.CheckGroupInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.check.entity.CheckGroup {
  /**
   * Adds the given element to the Checks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToChecks(entity.Check element);
  
  
  /**
   * Gets the value of the CheckSet field.
   * The TransactionSet that this check group belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckSet getCheckSet();
  
  
  public gw.pl.persistence.core.Key getCheckSetID();
  
  
  /**
   * Gets the value of the Checks field.
   * Check objects in the group, including the primary check. Together, these checks form a multi-payee check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check[] getChecks();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
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
   * Sets the value of the CheckSet field.
   */
  public void setCheckSet(entity.CheckSet value);
  
  
  public void setCheckSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Checks field.
   */
  public void setChecks(entity.Check[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}