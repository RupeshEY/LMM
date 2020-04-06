package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Recovery.eti;Recovery.eix;Recovery.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RecoveryInternal extends com.guidewire._generated.entity.TransactionInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.financials.recovery.impl.RecoveryInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.recovery.entity.Recovery {
  java.lang.String RECOVERYADDED_EVENT = "RecoveryAdded";
  
  java.lang.String RECOVERYCHANGED_EVENT = "RecoveryChanged";
  
  java.lang.String RECOVERYREMOVED_EVENT = "RecoveryRemoved";
  
  java.lang.String RECOVERYSTATUSCHANGED_EVENT = "RecoveryStatusChanged";
  
  java.lang.String RECOVERYSUBMITTED_EVENT = "RecoverySubmitted";
  
  java.lang.String RECOVERYVOIDED_EVENT = "RecoveryVoided";
  
  /**
   * Adds the given element to the RecToRecReservesArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRecToRecReservesArray(entity.RecToRecReserves element);
  
  
  /**
   * Gets the value of the ClaimContact field.
   * Person or company from whom the recovery was obtained.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  /**
   * Gets the value of the OBOClaimContact field.
   * Person or company responsible for paying.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getOBOClaimContact();
  
  
  public gw.pl.persistence.core.Key getOBOClaimContactID();
  
  
  /**
   * Gets the value of the OffsettingRecoveryReserve field.
   * The RecoveryReserve, if any, that exists as a direct offset for this Recovery.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryReserve getOffsettingRecoveryReserve();
  
  
  public gw.pl.persistence.core.Key getOffsettingRecoveryReserveID();
  
  
  /**
   * Gets the value of the PayerDenorm field.
   * Payer FK denorm.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getPayerDenorm();
  
  
  public gw.pl.persistence.core.Key getPayerDenormID();
  
  
  /**
   * Gets the value of the RecToRecReservesArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecToRecReserves[] getRecToRecReservesArray();
  
  
  /**
   * Gets the value of the RecoveryCategory field.
   * The RecoveryCategory to which this transaction is coded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecoveryCategory getRecoveryCategory();
  
  
  /**
   * Removes the given element from the RecToRecReservesArray array. This is achieved by marking the element for removal.
   */
  public void removeFromRecToRecReservesArray(entity.RecToRecReserves element);
  
  
  /**
   * Removes the given element from the RecToRecReservesArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecToRecReservesArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the OBOClaimContact field.
   */
  public void setOBOClaimContact(entity.ClaimContact value);
  
  
  public void setOBOClaimContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the OffsettingRecoveryReserve field.
   */
  public void setOffsettingRecoveryReserve(entity.RecoveryReserve value);
  
  
  public void setOffsettingRecoveryReserveID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PayerDenorm field.
   */
  public void setPayerDenorm(entity.Contact value);
  
  
  public void setPayerDenormID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RecToRecReservesArray field.
   */
  public void setRecToRecReservesArray(entity.RecToRecReserves[] value);
  
  
  /**
   * Sets the value of the RecoveryCategory field.
   */
  public void setRecoveryCategory(typekey.RecoveryCategory value);
  
  
  
}