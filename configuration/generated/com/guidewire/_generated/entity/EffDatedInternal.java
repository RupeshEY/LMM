package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EffDated.eti;EffDated.eix;EffDated.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface EffDatedInternal extends com.guidewire._generated.entity.EffDatedBaseInternal, com.guidewire.pl.domain.persistence.core.effdate.EffDatedBasePublicMethods, com.guidewire.pl.domain.persistence.core.effdate.EffDatedPublicMethods, com.guidewire.pl.domain.persistence.core.effdate.impl.EffDatedBaseInternalMethods, com.guidewire.pl.domain.persistence.core.effdate.impl.EffDatedInternalMethods, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback {
  /**
   * Gets the value of the ChangeType field.
   * Type of change made to this row
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.EffDatedChangeType getChangeType();
  
  
  /**
   * Gets the value of the EffectiveDate field.
   * Effective date of this row.  A value of NULL in the database indicates that this row's effective date is equal to the Period Start.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate();
  
  
  /**
   * Gets the value of the ExpirationDate field.
   * Expiration date of this row.  A value of NULL in the database indicates that this row's expiration date is equal to the Period End.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpirationDate();
  
  
  /**
   * Sets the value of the ChangeType field.
   */
  public void setChangeType(typekey.EffDatedChangeType value);
  
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExpirationDate field.
   */
  public void setExpirationDate(java.util.Date value);
  
  
  
}