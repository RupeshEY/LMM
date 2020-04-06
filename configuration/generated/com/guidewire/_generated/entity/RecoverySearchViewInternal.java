package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoverySearchView.eti;RecoverySearchView.eix;RecoverySearchView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RecoverySearchViewInternal extends com.guidewire._generated.entity.TransactionSearchViewInternal, gw.cc.financials.recovery.entity.RecoverySearchView {
  /**
   * Gets the value of the ClaimContact field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  /**
   * Gets the value of the ClaimContactName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimContactName();
  
  
  /**
   * Gets the value of the Recovery field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Recovery getRecovery();
  
  
  /**
   * Gets the value of the RecoveryCategory field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecoveryCategory getRecoveryCategory();
  
  
  public gw.pl.persistence.core.Key getRecoveryID();
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.Contact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimContactName field.
   */
  public void setClaimContactName(java.lang.String value);
  
  
  /**
   * Sets the value of the Recovery field.
   */
  public void setRecovery(entity.Recovery value);
  
  
  /**
   * Sets the value of the RecoveryCategory field.
   */
  public void setRecoveryCategory(typekey.RecoveryCategory value);
  
  
  public void setRecoveryID(gw.pl.persistence.core.Key value);
  
  
  
}