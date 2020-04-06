package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GroupRegion.eti;GroupRegion.eix;GroupRegion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GroupRegionInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Group field.
   * Associated group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Region field.
   * Associated region.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Region getRegion();
  
  
  public gw.pl.persistence.core.Key getRegionID();
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Region field.
   */
  public void setRegion(entity.Region value);
  
  
  public void setRegionID(gw.pl.persistence.core.Key value);
  
  
  
}