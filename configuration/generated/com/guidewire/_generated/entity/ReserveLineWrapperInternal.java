package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReserveLineWrapper.eti;ReserveLineWrapper.eix;ReserveLineWrapper.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReserveLineWrapperInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.bulkpay.impl.ReserveLineWrapperInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.bulkpay.entity.ReserveLineWrapper {
  /**
   * Adds the given element to the BulkInvoiceItemInfoArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBulkInvoiceItemInfoArray(entity.BulkInvoiceItemInfo element);
  
  
  /**
   * Gets the value of the BulkInvoiceItemInfo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItemInfo getBulkInvoiceItemInfo();
  
  
  /**
   * Gets the value of the BulkInvoiceItemInfoArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItemInfo[] getBulkInvoiceItemInfoArray();
  
  
  public gw.pl.persistence.core.Key getBulkInvoiceItemInfoID();
  
  
  /**
   * Gets the value of the ReserveLine field.
   * The ReserveLine wrapped by this ReserveLineWrapper.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine getReserveLine();
  
  
  public gw.pl.persistence.core.Key getReserveLineID();
  
  
  /**
   * Removes the given element from the BulkInvoiceItemInfoArray array. This is achieved by marking the element for removal.
   */
  public void removeFromBulkInvoiceItemInfoArray(entity.BulkInvoiceItemInfo element);
  
  
  /**
   * Removes the given element from the BulkInvoiceItemInfoArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBulkInvoiceItemInfoArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the BulkInvoiceItemInfo field.
   */
  public void setBulkInvoiceItemInfo(entity.BulkInvoiceItemInfo value);
  
  
  /**
   * Sets the value of the BulkInvoiceItemInfoArray field.
   */
  public void setBulkInvoiceItemInfoArray(entity.BulkInvoiceItemInfo[] value);
  
  
  public void setBulkInvoiceItemInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ReserveLine field.
   */
  public void setReserveLine(entity.ReserveLine value);
  
  
  public void setReserveLineID(gw.pl.persistence.core.Key value);
  
  
  
}