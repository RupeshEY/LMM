package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Payment.eti;Payment.eix;Payment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PaymentInternal extends com.guidewire._generated.entity.TransactionInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.financials.payment.impl.PaymentInternal, gw.api.financials.PaymentMethods, gw.api.financials.PaymentTransferMethods, gw.cc.financials.payment.entity.Payment {
  java.lang.String PAYMENTADDED_EVENT = "PaymentAdded";
  
  java.lang.String PAYMENTCHANGED_EVENT = "PaymentChanged";
  
  java.lang.String PAYMENTRECODED_EVENT = "PaymentRecoded";
  
  java.lang.String PAYMENTREMOVED_EVENT = "PaymentRemoved";
  
  java.lang.String PAYMENTSTATUSCHANGED_EVENT = "PaymentStatusChanged";
  
  /**
   * Adds the given element to the OffsettingReserves array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOffsettingReserves(entity.PaymentReserve element);
  
  
  /**
   * Gets the value of the Check field.
   * Check that paid this payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check getCheck();
  
  
  public gw.pl.persistence.core.Key getCheckID();
  
  
  /**
   * Gets the value of the Matter field.
   * Foreign key to Matter
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Gets the value of the OffsettingReserves field.
   * The reserve created to offset this payment, whether to zero reserves or keep reserves from becoming negative.  Should only be one.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PaymentReserve[] getOffsettingReserves();
  
  
  /**
   * Gets the value of the PaymentType field.
   * Type of the payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentType getPaymentType();
  
  
  /**
   * Gets the value of the CloseClaim field.
   * If this transaction is a final payment, this indicates whether it should or did close its associated claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCloseClaim();
  
  
  /**
   * Gets the value of the CloseExposure field.
   * If this transaction is a final payment, this indicates whether it should or did close its associated exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCloseExposure();
  
  
  /**
   * Gets the value of the DoesNotErodeReserves field.
   * Indicates whether this payment should not erode reserves for its ReserveLine.  This field can only be set in the CheckWizard UI.  Otherwise, one of the setAsEroding() or setAsNonEroding() methods must be called from a rule to change whether a payment erodes reserves.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDoesNotErodeReserves();
  
  
  /**
   * Removes the given element from the OffsettingReserves array. This is achieved by marking the element for removal.
   */
  public void removeFromOffsettingReserves(entity.PaymentReserve element);
  
  
  /**
   * Removes the given element from the OffsettingReserves array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOffsettingReserves(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Check field.
   */
  public void setCheck(entity.Check value);
  
  
  public void setCheckID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CloseClaim field.
   */
  public void setCloseClaim(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CloseExposure field.
   */
  public void setCloseExposure(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DoesNotErodeReserves field.
   */
  public void setDoesNotErodeReserves(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the OffsettingReserves field.
   */
  public void setOffsettingReserves(entity.PaymentReserve[] value);
  
  
  /**
   * Sets the value of the PaymentType field.
   */
  public void setPaymentType(typekey.PaymentType value);
  
  
  
}