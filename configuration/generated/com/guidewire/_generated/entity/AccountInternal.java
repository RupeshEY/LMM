package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Account.eti;Account.eix;Account.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AccountInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.account.entity.Account {
  /**
   * Adds the given element to the SpecialHandlingArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSpecialHandlingArray(entity.AccountSpecialHandling element);
  
  
  /**
   * Gets the value of the AccountHolder field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getAccountHolder();
  
  
  public gw.pl.persistence.core.Key getAccountHolderID();
  
  
  /**
   * Gets the value of the AccountNumber field.
   * The account number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountNumber();
  
  
  /**
   * Gets the value of the SpecialHandling field.
   * The Special Handling instructions and notification triggers to apply to any Claims entered                     for Policies that are associated with this Account
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AccountSpecialHandling getSpecialHandling();
  
  
  /**
   * Gets the value of the SpecialHandlingArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AccountSpecialHandling[] getSpecialHandlingArray();
  
  
  public gw.pl.persistence.core.Key getSpecialHandlingID();
  
  
  /**
   * Removes the given element from the SpecialHandlingArray array. This is achieved by marking the element for removal.
   */
  public void removeFromSpecialHandlingArray(entity.AccountSpecialHandling element);
  
  
  /**
   * Removes the given element from the SpecialHandlingArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSpecialHandlingArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AccountHolder field.
   */
  public void setAccountHolder(entity.Contact value);
  
  
  public void setAccountHolderID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AccountNumber field.
   */
  public void setAccountNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the SpecialHandling field.
   */
  public void setSpecialHandling(entity.AccountSpecialHandling value);
  
  
  /**
   * Sets the value of the SpecialHandlingArray field.
   */
  public void setSpecialHandlingArray(entity.AccountSpecialHandling[] value);
  
  
  public void setSpecialHandlingID(gw.pl.persistence.core.Key value);
  
  
  
}