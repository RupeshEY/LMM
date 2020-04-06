package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserRegion.eti;UserRegion.eix;UserRegion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UserRegionInternal extends com.guidewire._generated.entity.VersionableInternal {
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
   * Gets the value of the User field.
   * Associated user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Region field.
   */
  public void setRegion(entity.Region value);
  
  
  public void setRegionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}