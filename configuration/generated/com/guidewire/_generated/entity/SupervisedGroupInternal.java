package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SupervisedGroup.eti;SupervisedGroup.eix;SupervisedGroup.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SupervisedGroupInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.community.entity.SupervisedGroup {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the SupervisedGroup field.
   * Group supervised by the owner of the cache
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getSupervisedGroup();
  
  
  public gw.pl.persistence.core.Key getSupervisedGroupID();
  
  
  /**
   * Gets the value of the SuperviseeCache field.
   * Backpointer to the cache
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SuperviseesCache getSuperviseeCache();
  
  
  public gw.pl.persistence.core.Key getSuperviseeCacheID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the SupervisedGroup field.
   */
  public void setSupervisedGroup(entity.Group value);
  
  
  public void setSupervisedGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SuperviseeCache field.
   */
  public void setSuperviseeCache(entity.SuperviseesCache value);
  
  
  public void setSuperviseeCacheID(gw.pl.persistence.core.Key value);
  
  
  
}