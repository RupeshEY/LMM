package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RITAccount.eti;RITAccount.eix;RITAccount.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RITAccountInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountDelegateInternal, com.guidewire.cc.domain.financials.taccount.TAccountDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal, gw.cc.financials.taccount.entity.RITAccount {
  /**
   * Adds the given element to the RITAccountLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRITAccountLineItems(entity.RITAccountLineItem element);
  
  
  /**
   * Gets the value of the RICoding field.
   * FK to the RICoding that this TAccount is assoicated with.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RICoding getRICoding();
  
  
  public gw.pl.persistence.core.Key getRICodingID();
  
  
  /**
   * Gets the value of the RITAccountLineItems field.
   * Line items for this RITAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccountLineItem[] getRITAccountLineItems();
  
  
  /**
   * Removes the given element from the RITAccountLineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromRITAccountLineItems(entity.RITAccountLineItem element);
  
  
  /**
   * Removes the given element from the RITAccountLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRITAccountLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the RICoding field.
   */
  public void setRICoding(entity.RICoding value);
  
  
  public void setRICodingID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RITAccountLineItems field.
   */
  public void setRITAccountLineItems(entity.RITAccountLineItem[] value);
  
  
  
}