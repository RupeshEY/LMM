package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RICoding.eti;RICoding.eix;RICoding.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RICodingInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountOwnerDelegateInternal, com.guidewire.cc.domain.financials.impl.RICodingInternal, com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.entity.RICoding {
  /**
   * Adds the given element to the RITAccounts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRITAccounts(entity.RITAccount element);
  
  
  /**
   * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTransactions(entity.RITransaction element);
  
  
  /**
   * Gets the value of the Claim field.
   * The related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the RIAgreement field.
   * The related RIAgreement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RIAgreement getRIAgreement();
  
  
  public gw.pl.persistence.core.Key getRIAgreementID();
  
  
  /**
   * Gets the value of the RITAccounts field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccount[] getRITAccounts();
  
  
  /**
   * Array association for partition RITAccountsByTAccountType on array RITAccounts
   */
  public entity.RITAccount getRITAccountsByTAccountType(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the ReserveLine field.
   * The related ReserveLine.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine getReserveLine();
  
  
  public gw.pl.persistence.core.Key getReserveLineID();
  
  
  /**
   * Gets the value of the Transactions field.
   * Set of transactions that coded to this RICoding.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITransaction[] getTransactions();
  
  
  /**
   * Removes the given element from the RITAccounts array. This is achieved by marking the element for removal.
   */
  public void removeFromRITAccounts(entity.RITAccount element);
  
  
  /**
   * Removes the given element from the RITAccounts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRITAccounts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   */
  public void removeFromTransactions(entity.RITransaction element);
  
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTransactions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RIAgreement field.
   */
  public void setRIAgreement(entity.RIAgreement value);
  
  
  public void setRIAgreementID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RITAccounts field.
   */
  public void setRITAccounts(entity.RITAccount[] value);
  
  
  /**
   * Sets the value of the ReserveLine field.
   */
  public void setReserveLine(entity.ReserveLine value);
  
  
  public void setReserveLineID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Transactions field.
   */
  public void setTransactions(entity.RITransaction[] value);
  
  
  
}