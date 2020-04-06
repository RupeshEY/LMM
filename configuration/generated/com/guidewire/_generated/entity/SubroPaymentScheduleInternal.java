package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SubroPaymentSchedule.eti;SubroPaymentSchedule.eix;SubroPaymentSchedule.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SubroPaymentScheduleInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.SubroPaymentSchedule {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PaymentExpDate field.
   * Date on which payment against prommisory note is expected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPaymentExpDate();
  
  
  /**
   * Gets the value of the SubroAdverseParty field.
   * Related SubroPaymentPlan
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubroAdverseParty getSubroAdverseParty();
  
  
  public gw.pl.persistence.core.Key getSubroAdversePartyID();
  
  
  /**
   * Gets the value of the SubroInstallmentAmount field.
   * Total Amount of this Installment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSubroInstallmentAmount();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PaymentExpDate field.
   */
  public void setPaymentExpDate(java.util.Date value);
  
  
  /**
   * Sets the value of the SubroAdverseParty field.
   */
  public void setSubroAdverseParty(entity.SubroAdverseParty value);
  
  
  public void setSubroAdversePartyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SubroInstallmentAmount field.
   */
  public void setSubroInstallmentAmount(gw.api.financials.CurrencyAmount value);
  
  
  
}