package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "StatCode.eti;StatCode.eix;StatCode.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface StatCodeInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.policy.entity.StatCode {
  /**
   * Gets the value of the BuildingNumber field.
   * Building number with which this stat line is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBuildingNumber();
  
  
  /**
   * Gets the value of the ClassCode field.
   * Workers comp class code with which this stat line is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClassCode();
  
  
  /**
   * Gets the value of the InsuranceLine field.
   * Insurance line (also known as major line or bureau).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InsuranceLine getInsuranceLine();
  
  
  /**
   * Gets the value of the InsuranceSubLine field.
   * Insurance sub-line (also known as risk group or risk unit).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InsuranceSubLine getInsuranceSubLine();
  
  
  /**
   * Gets the value of the LineNumber field.
   * Statistical data line number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLineNumber();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LocationNumber field.
   * Location number with which this stat line is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLocationNumber();
  
  
  /**
   * Gets the value of the MajorPeril field.
   * Major peril.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MajorPerils getMajorPeril();
  
  
  /**
   * Gets the value of the Notes field.
   * Description of the endorsement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNotes();
  
  
  /**
   * Gets the value of the Policy field.
   * Policy with which the statistical code is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy();
  
  
  public gw.pl.persistence.core.Key getPolicyID();
  
  
  /**
   * Gets the value of the State field.
   * State in which the statistical code applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState();
  
  
  /**
   * Gets the value of the VehicleNumber field.
   * Vehicle number with which this stat line is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVehicleNumber();
  
  
  /**
   * Sets the value of the BuildingNumber field.
   */
  public void setBuildingNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ClassCode field.
   */
  public void setClassCode(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuranceLine field.
   */
  public void setInsuranceLine(typekey.InsuranceLine value);
  
  
  /**
   * Sets the value of the InsuranceSubLine field.
   */
  public void setInsuranceSubLine(typekey.InsuranceSubLine value);
  
  
  /**
   * Sets the value of the LineNumber field.
   */
  public void setLineNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LocationNumber field.
   */
  public void setLocationNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the MajorPeril field.
   */
  public void setMajorPeril(typekey.MajorPerils value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(java.lang.String value);
  
  
  /**
   * Sets the value of the Policy field.
   */
  public void setPolicy(entity.Policy value);
  
  
  public void setPolicyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value);
  
  
  /**
   * Sets the value of the VehicleNumber field.
   */
  public void setVehicleNumber(java.lang.String value);
  
  
  
}