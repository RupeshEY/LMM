package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CatastrophePeril.eti;CatastrophePeril.eix;CatastrophePeril.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CatastrophePerilInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.catastrophe.entity.CatastrophePeril {
  /**
   * Gets the value of the Catastrophe field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe getCatastrophe();
  
  
  public gw.pl.persistence.core.Key getCatastropheID();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments regarding the peril
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossCause field.
   * The loss cause associated to the peril
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossCause getLossCause();
  
  
  /**
   * Gets the value of the LossType field.
   * High level claim type (for example, Auto or Property).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
  /**
   * Sets the value of the Catastrophe field.
   */
  public void setCatastrophe(entity.Catastrophe value);
  
  
  public void setCatastropheID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LossCause field.
   */
  public void setLossCause(typekey.LossCause value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  
}