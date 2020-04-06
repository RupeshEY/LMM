package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MatterExposure.eti;MatterExposure.eix;MatterExposure.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MatterExposureInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.matter.entity.MatterExposure {
  /**
   * Gets the value of the Exposure field.
   * Related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Matter field.
   * Related matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
  
}