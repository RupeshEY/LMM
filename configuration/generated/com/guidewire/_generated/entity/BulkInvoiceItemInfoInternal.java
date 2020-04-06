package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoiceItemInfo.eti;BulkInvoiceItemInfo.eix;BulkInvoiceItemInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BulkInvoiceItemInfoInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.bulkpay.entity.BulkInvoiceItemInfo {
  /**
   * Adds the given element to the CheckArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCheckArray(entity.Check element);
  
  
  /**
   * Gets the value of the BulkInvoiceItem field.
   * The bulk invoice that this info is referring to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItem getBulkInvoiceItem();
  
  
  public gw.pl.persistence.core.Key getBulkInvoiceItemID();
  
  
  /**
   * Gets the value of the BulkInvoiceItemPublicID field.
   * PublicID used to link back to the item
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBulkInvoiceItemPublicID();
  
  
  /**
   * Gets the value of the Check field.
   * The Check entity that was created as the associated placeholder for this BulkInvoiceItem.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check getCheck();
  
  
  /**
   * Gets the value of the CheckArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check[] getCheckArray();
  
  
  public gw.pl.persistence.core.Key getCheckID();
  
  
  /**
   * Gets the value of the Claim field.
   * The Claim for which this BulkInvoiceItem represents a payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Exposure field.
   * The Exposure, if any, for which this BulkInvoiceItem represents a payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the ReserveLineWrapper field.
   * the wrapper that contains the ReserveLine for the payment associated with this invoice item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLineWrapper getReserveLineWrapper();
  
  
  public gw.pl.persistence.core.Key getReserveLineWrapperID();
  
  
  /**
   * Removes the given element from the CheckArray array. This is achieved by marking the element for removal.
   */
  public void removeFromCheckArray(entity.Check element);
  
  
  /**
   * Removes the given element from the CheckArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCheckArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the BulkInvoiceItem field.
   */
  public void setBulkInvoiceItem(entity.BulkInvoiceItem value);
  
  
  public void setBulkInvoiceItemID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the BulkInvoiceItemPublicID field.
   */
  public void setBulkInvoiceItemPublicID(java.lang.String value);
  
  
  /**
   * Sets the value of the Check field.
   */
  public void setCheck(entity.Check value);
  
  
  /**
   * Sets the value of the CheckArray field.
   */
  public void setCheckArray(entity.Check[] value);
  
  
  public void setCheckID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ReserveLineWrapper field.
   */
  public void setReserveLineWrapper(entity.ReserveLineWrapper value);
  
  
  public void setReserveLineWrapperID(gw.pl.persistence.core.Key value);
  
  
  
}