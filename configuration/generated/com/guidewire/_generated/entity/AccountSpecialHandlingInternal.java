package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AccountSpecialHandling.eti;AccountSpecialHandling.eix;AccountSpecialHandling.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AccountSpecialHandlingInternal extends com.guidewire._generated.entity.SpecialHandlingInternal, gw.cc.specialhandling.entity.AccountSpecialHandling {
  /**
   * Gets the value of the Account field.
   * The Account that owns this instance of Special Handling.  Any Claims created for Policies associated with this Account will have these special handling instructions and triggers applied.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Account getAccount();
  
  
  public gw.pl.persistence.core.Key getAccountID();
  
  
  /**
   * Sets the value of the Account field.
   */
  public void setAccount(entity.Account value);
  
  
  public void setAccountID(gw.pl.persistence.core.Key value);
  
  
  
}