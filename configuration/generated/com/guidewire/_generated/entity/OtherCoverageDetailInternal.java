package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OtherCoverageDetail.eti;OtherCoverageDetail.eix;OtherCoverageDetail.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OtherCoverageDetailInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.OtherCoverageDetail {
  /**
   * Gets the value of the ContactName field.
   * Name of contact at insurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactName();
  
  
  /**
   * Gets the value of the ContactPhone field.
   * Phone number of contact at insurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactPhone();
  
  
  /**
   * Gets the value of the Exposure field.
   * The related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the Insurer field.
   * Name of insurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurer();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Notes field.
   * Comments/notes about the coverage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNotes();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * Policy number at insurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Sets the value of the ContactName field.
   */
  public void setContactName(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactPhone field.
   */
  public void setContactPhone(java.lang.String value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Insurer field.
   */
  public void setInsurer(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  
}