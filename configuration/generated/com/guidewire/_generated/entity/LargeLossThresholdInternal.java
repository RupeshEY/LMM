package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LargeLossThreshold.eti;LargeLossThreshold.eix;LargeLossThreshold.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LargeLossThresholdInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.claim.entity.LargeLossThreshold {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the NotificationType field.
   * Type of notification.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LargeLossNotificationType getNotificationType();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the ThresholdValue field.
   * Large Loss threshold value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getThresholdValue();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NotificationType field.
   */
  public void setNotificationType(typekey.LargeLossNotificationType value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the ThresholdValue field.
   */
  public void setThresholdValue(java.math.BigDecimal value);
  
  
  
}