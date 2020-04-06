package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountBalanceCopy.eti;TmpTAccountBalanceCopy.eix;TmpTAccountBalanceCopy.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpTAccountBalanceCopyInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.taccount.entity.TmpTAccountBalanceCopy {
  /**
   * Gets the value of the BalanceToCopy field.
   * The balance from the old t-account to copy to the new t-account
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getBalanceToCopy();
  
  
  /**
   * Gets the value of the SourceTAccountType field.
   * The type of the source taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getSourceTAccountType();
  
  
  /**
   * Gets the value of the TAccountID field.
   * The ID of the t-account to update
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTAccountID();
  
  
  /**
   * Gets the value of the TmpNumContributingTxns field.
   * The number of contributing txns to copy to the new t-account
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTmpNumContributingTxns();
  
  
  /**
   * Sets the value of the BalanceToCopy field.
   */
  public void setBalanceToCopy(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the SourceTAccountType field.
   */
  public void setSourceTAccountType(typekey.TAccountType value);
  
  
  /**
   * Sets the value of the TAccountID field.
   */
  public void setTAccountID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TmpNumContributingTxns field.
   */
  public void setTmpNumContributingTxns(java.lang.Integer value);
  
  
  
}