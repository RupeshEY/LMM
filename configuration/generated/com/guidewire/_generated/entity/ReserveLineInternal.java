package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReserveLine.eti;ReserveLine.eix;ReserveLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReserveLineInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountOwnerDelegateInternal, com.guidewire.cc.domain.financials.impl.ReserveLineInternal, com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.entity.ReserveLine {
  /**
   * Adds the given element to the RICodings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRICodings(entity.RICoding element);
  
  
  /**
   * Adds the given element to the RecoveryCodings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRecoveryCodings(entity.RecoveryCoding element);
  
  
  /**
   * Adds the given element to the TAccounts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTAccounts(entity.TAccount element);
  
  
  /**
   * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTransactions(entity.Transaction element);
  
  
  /**
   * Gets the value of the Claim field.
   * The related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the CostCategory field.
   * The costcategory for this transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostCategory getCostCategory();
  
  
  /**
   * Gets the value of the CostType field.
   * Type of cost (for example, LAE or claim cost).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostType getCostType();
  
  
  /**
   * Gets the value of the Exposure field.
   * The related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the RICodings field.
   * Set of RICodings that reference this ReserveLine.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RICoding[] getRICodings();
  
  
  /**
   * Gets the value of the RecoveryCodings field.
   * Set of RecoveryCodings that reference this ReserveLine.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryCoding[] getRecoveryCodings();
  
  
  /**
   * Gets the value of the ReservingCurrency field.
   * Reserving Currency of this ReserveLine. Indicates the currency in which reserves are to be set aside and eroded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency();
  
  
  /**
   * Gets the value of the TAccounts field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount[] getTAccounts();
  
  
  /**
   * Array association for partition TAccountsByTAccountType on array TAccounts
   */
  public entity.TAccount getTAccountsByTAccountType(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Transactions field.
   * Set of transactions that contribute to this ReserveLine.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction[] getTransactions();
  
  
  /**
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   */
  public void removeFromRICodings(entity.RICoding element);
  
  
  /**
   * Removes the given element from the RICodings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRICodings(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RecoveryCodings array. This is achieved by marking the element for removal.
   */
  public void removeFromRecoveryCodings(entity.RecoveryCoding element);
  
  
  /**
   * Removes the given element from the RecoveryCodings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecoveryCodings(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TAccounts array. This is achieved by marking the element for removal.
   */
  public void removeFromTAccounts(entity.TAccount element);
  
  
  /**
   * Removes the given element from the TAccounts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTAccounts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   */
  public void removeFromTransactions(entity.Transaction element);
  
  
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
   * Sets the value of the CostCategory field.
   */
  public void setCostCategory(typekey.CostCategory value);
  
  
  /**
   * Sets the value of the CostType field.
   */
  public void setCostType(typekey.CostType value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the RICodings field.
   */
  public void setRICodings(entity.RICoding[] value);
  
  
  /**
   * Sets the value of the RecoveryCodings field.
   */
  public void setRecoveryCodings(entity.RecoveryCoding[] value);
  
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the TAccounts field.
   */
  public void setTAccounts(entity.TAccount[] value);
  
  
  /**
   * Sets the value of the Transactions field.
   */
  public void setTransactions(entity.Transaction[] value);
  
  
  
}