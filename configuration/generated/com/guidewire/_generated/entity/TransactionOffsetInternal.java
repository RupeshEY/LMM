package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionOffset.eti;TransactionOffset.eix;TransactionOffset.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionOffsetInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.financials.entity.TransactionOffset {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Offset field.
   * The offset transaction, to negate the original transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getOffset();
  
  
  public gw.pl.persistence.core.Key getOffsetID();
  
  
  /**
   * Gets the value of the Transaction field.
   * The transaction being offset.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getTransaction();
  
  
  public gw.pl.persistence.core.Key getTransactionID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Offset field.
   */
  public void setOffset(entity.Transaction value);
  
  
  public void setOffsetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Transaction field.
   */
  public void setTransaction(entity.Transaction value);
  
  
  public void setTransactionID(gw.pl.persistence.core.Key value);
  
  
  
}