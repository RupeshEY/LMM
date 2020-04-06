package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "IMEPerformed.eti;IMEPerformed.eix;IMEPerformed.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface IMEPerformedInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.IMEPerformed {
  /**
   * Gets the value of the Exposure field.
   * The related Exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the IMEDate field.
   * The date the independent medical examination was performed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getIMEDate();
  
  
  /**
   * Gets the value of the IMEType field.
   * The type of independent medical examination.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.IMEType getIMEType();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IMEDate field.
   */
  public void setIMEDate(java.util.Date value);
  
  
  /**
   * Sets the value of the IMEType field.
   */
  public void setIMEType(typekey.IMEType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}