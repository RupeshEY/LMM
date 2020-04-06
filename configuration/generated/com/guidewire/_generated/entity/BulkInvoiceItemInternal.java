package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoiceItem.eti;BulkInvoiceItem.eix;BulkInvoiceItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BulkInvoiceItemInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.bulkpay.entity.BulkInvoiceItem {
  /**
   * Adds the given element to the BulkInvoiceItemInfoArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBulkInvoiceItemInfoArray(entity.BulkInvoiceItemInfo element);
  
  
  /**
   * Gets the value of the Amount field.
   * The amount of this invoice item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAmount();
  
  
  /**
   * Gets the value of the BulkInvoice field.
   * The bulk invoice that contains this bulk invoice item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoice getBulkInvoice();
  
  
  public gw.pl.persistence.core.Key getBulkInvoiceID();
  
  
  /**
   * Gets the value of the BulkInvoiceItemInfo field.
   * Links a BulkInvoiceItem to its info. Returns null if the associated Claim is Archived.
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
   * Gets the value of the BulkInvoiceOrder field.
   * Order of the BulkInvoiceItem on the BulkInvoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBulkInvoiceOrder();
  
  
  /**
   * Gets the value of the ClaimInfo field.
   * The ClaimInfo for which this BulkInvoiceItem represents a payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo();
  
  
  public gw.pl.persistence.core.Key getClaimInfoID();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   * Claim Number of the claim that this BulkInvoiceItem is related to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the CostCategory field.
   * The CostCategory of the payment associated with this item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostCategory getCostCategory();
  
  
  /**
   * Gets the value of the CostType field.
   * The CostType of the payment associated with this item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostType getCostType();
  
  
  /**
   * Gets the value of the DateOfService field.
   * Date that the service was performed (if this check is for a service).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfService();
  
  
  /**
   * Gets the value of the DeductionsAmount field.
   * The total amount of all deductions computed for the check associated with this bulk invoice item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getDeductionsAmount();
  
  
  /**
   * Gets the value of the Description field.
   * A comment field for the invoice item.  The contents of this field will be copied to the memo of the place-holder check that is created for this BulkInvoiceItem in ClaimCenter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Explanation field.
   * Validation warnings / errors generated for this BulkInvoiceItem during final processing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExplanation();
  
  
  /**
   * Gets the value of the PaymentType field.
   * The PaymentType for the payment associated with this item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentType getPaymentType();
  
  
  /**
   * Gets the value of the ReservingCurrency field.
   * The reserving currency of the payment associated with this item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency();
  
  
  /**
   * Gets the value of the ServicePdEnd field.
   * End date of the service period for the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdEnd();
  
  
  /**
   * Gets the value of the ServicePdStart field.
   * Start date of the service period for the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdStart();
  
  
  /**
   * Gets the value of the Status field.
   * The current business status of this item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BulkInvoiceItemStatus getStatus();
  
  
  /**
   * Gets the value of the AwaitingProcessing field.
   * Flag to indicate whether this item is waiting to be processed for invoice submission.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAwaitingProcessing();
  
  
  /**
   * Gets the value of the NonEroding field.
   * Indicates whether the associated payment should erode reserves (false) or not (true).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isNonEroding();
  
  
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
   * Sets the value of the Amount field.
   */
  public void setAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the AwaitingProcessing field.
   */
  public void setAwaitingProcessing(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the BulkInvoice field.
   */
  public void setBulkInvoice(entity.BulkInvoice value);
  
  
  public void setBulkInvoiceID(gw.pl.persistence.core.Key value);
  
  
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
   * Sets the value of the BulkInvoiceOrder field.
   */
  public void setBulkInvoiceOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value);
  
  
  public void setClaimInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CostCategory field.
   */
  public void setCostCategory(typekey.CostCategory value);
  
  
  /**
   * Sets the value of the CostType field.
   */
  public void setCostType(typekey.CostType value);
  
  
  /**
   * Sets the value of the DateOfService field.
   */
  public void setDateOfService(java.util.Date value);
  
  
  /**
   * Sets the value of the DeductionsAmount field.
   */
  public void setDeductionsAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Explanation field.
   */
  public void setExplanation(java.lang.String value);
  
  
  /**
   * Sets the value of the NonEroding field.
   */
  public void setNonEroding(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PaymentType field.
   */
  public void setPaymentType(typekey.PaymentType value);
  
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the ServicePdEnd field.
   */
  public void setServicePdEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the ServicePdStart field.
   */
  public void setServicePdStart(java.util.Date value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.BulkInvoiceItemStatus value);
  
  
  
}