package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeDatamodelInfo.eti;UpgradeDatamodelInfo.eix;UpgradeDatamodelInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpgradeDatamodelInfoInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.commons.metadata.internal.version.MetadataVersionProvider {
  /**
   * Gets the value of the ApplicationMajorVers field.
   * Application Major Schema Version at time of deployment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getApplicationMajorVers();
  
  
  /**
   * Gets the value of the ApplicationMinorVers field.
   * Application Minor Schema Version at time of deployment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getApplicationMinorVers();
  
  
  /**
   * Gets the value of the ExtensionsVers field.
   * Extensions Version at time of deployment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExtensionsVers();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PlatformMajorVers field.
   * Platform Major Schema Version at time of deployment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMajorVers();
  
  
  /**
   * Gets the value of the PlatformMinorVers field.
   * Platform Minor Schema Version at time of deployment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMinorVers();
  
  
  /**
   * Sets the value of the ApplicationMajorVers field.
   */
  public void setApplicationMajorVers(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ApplicationMinorVers field.
   */
  public void setApplicationMinorVers(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ExtensionsVers field.
   */
  public void setExtensionsVers(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PlatformMajorVers field.
   */
  public void setPlatformMajorVers(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PlatformMinorVers field.
   */
  public void setPlatformMinorVers(java.lang.Integer value);
  
  
  
}