package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckSetReserve.eti;CheckSetReserve.eix;CheckSetReserve.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CheckSetReserveInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.financials.check.entity.CheckSetReserve {
  /**
   * Gets the value of the CheckSet field.
   * The check set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckSet getCheckSet();
  
  
  public gw.pl.persistence.core.Key getCheckSetID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Reserve field.
   * The automatically-generated reserve.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Reserve getReserve();
  
  
  public gw.pl.persistence.core.Key getReserveID();
  
  
  /**
   * Sets the value of the CheckSet field.
   */
  public void setCheckSet(entity.CheckSet value);
  
  
  public void setCheckSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Reserve field.
   */
  public void setReserve(entity.Reserve value);
  
  
  public void setReserveID(gw.pl.persistence.core.Key value);
  
  
  
}