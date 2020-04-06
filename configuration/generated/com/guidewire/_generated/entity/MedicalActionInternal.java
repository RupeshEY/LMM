package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MedicalAction.eti;MedicalAction.eix;MedicalAction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MedicalActionInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.MedicalAction {
  /**
   * Gets the value of the ActionDate field.
   * Date of action.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getActionDate();
  
  
  /**
   * Gets the value of the Exposure field.
   * The related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the FutureActionReq field.
   * Type of medical action required in the future.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FutureMedicalActionType getFutureActionReq();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MedicalActionType field.
   * Type of action.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MedicalActionType getMedicalActionType();
  
  
  /**
   * Gets the value of the NextAppointment field.
   * Date of next appointment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNextAppointment();
  
  
  /**
   * Gets the value of the Note field.
   * Additional notes on the action.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNote();
  
  
  /**
   * Gets the value of the ProviderName field.
   * Name of medical provider.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getProviderName();
  
  
  /**
   * Sets the value of the ActionDate field.
   */
  public void setActionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FutureActionReq field.
   */
  public void setFutureActionReq(typekey.FutureMedicalActionType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MedicalActionType field.
   */
  public void setMedicalActionType(typekey.MedicalActionType value);
  
  
  /**
   * Sets the value of the NextAppointment field.
   */
  public void setNextAppointment(java.util.Date value);
  
  
  /**
   * Sets the value of the Note field.
   */
  public void setNote(java.lang.String value);
  
  
  /**
   * Sets the value of the ProviderName field.
   */
  public void setProviderName(java.lang.String value);
  
  
  
}