package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CatastropheClaimsHistory.eti;CatastropheClaimsHistory.eix;CatastropheClaimsHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CatastropheClaimsHistoryInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.catastrophe.entity.CatastropheClaimsHistory {
  /**
   * Gets the value of the Catastrophe field.
   * The catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe getCatastrophe();
  
  
  public gw.pl.persistence.core.Key getCatastropheID();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the history event.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EventTimestamp field.
   * Timestamp when the event occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEventTimestamp();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the Catastrophe field.
   */
  public void setCatastrophe(entity.Catastrophe value);
  
  
  public void setCatastropheID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EventTimestamp field.
   */
  public void setEventTimestamp(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}