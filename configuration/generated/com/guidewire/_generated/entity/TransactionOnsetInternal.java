package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionOnset.eti;TransactionOnset.eix;TransactionOnset.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionOnsetInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.impl.TransactionOnsetInternal, gw.cc.financials.entity.TransactionOnset {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Onset field.
   * The onset (recode or transfer) transaction, same as the original but on the new ReserveLine/Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getOnset();
  
  
  public gw.pl.persistence.core.Key getOnsetID();
  
  
  /**
   * Gets the value of the OnsetPublicID field.
   * PublicID of the onset, used when the FK to the onset has been severed for archiving.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOnsetPublicID();
  
  
  /**
   * Gets the value of the Transaction field.
   * The transaction being onset.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getTransaction();
  
  
  public gw.pl.persistence.core.Key getTransactionID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Onset field.
   */
  public void setOnset(entity.Transaction value);
  
  
  public void setOnsetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the OnsetPublicID field.
   */
  public void setOnsetPublicID(java.lang.String value);
  
  
  /**
   * Sets the value of the Transaction field.
   */
  public void setTransaction(entity.Transaction value);
  
  
  public void setTransactionID(gw.pl.persistence.core.Key value);
  
  
  
}