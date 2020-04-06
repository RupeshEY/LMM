package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionSet.eti;TransactionSet.eix;TransactionSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionSetInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.ApprovableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.impl.TransactionSetInternal, gw.cc.financials.entity.TransactionSet {
  /**
   * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToActivities(entity.Activity element);
  
  
  /**
   * Adds the given element to the Documents array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocuments(entity.TransactionSetDocument element);
  
  
  /**
   * Gets the value of the Activities field.
   * Set of approval / approval denial activities linked to this transaction set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities();
  
  
  /**
   * Gets the value of the Claim field.
   * The claim entity to which this TransactionSet belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Documents field.
   * Set of documents linked to this transaction set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionSetDocument[] getDocuments();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionSet getSubtype();
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   */
  public void removeFromActivities(entity.Activity element);
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromActivities(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Documents array. This is achieved by marking the element for removal.
   */
  public void removeFromDocuments(entity.TransactionSetDocument element);
  
  
  /**
   * Removes the given element from the Documents array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDocuments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Activities field.
   */
  public void setActivities(entity.Activity[] value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Documents field.
   */
  public void setDocuments(entity.TransactionSetDocument[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.TransactionSet value);
  
  
  
}