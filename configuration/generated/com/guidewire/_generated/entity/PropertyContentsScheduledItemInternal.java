package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PropertyContentsScheduledItem.eti;PropertyContentsScheduledItem.eix;PropertyContentsScheduledItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PropertyContentsScheduledItemInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.OrderedItemDelegateInternal, gw.cc.exposure.entity.PropertyContentsScheduledItem {
  /**
   * Gets the value of the Incident field.
   * Incident that owns this scheduled item
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyContentsIncident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PropertyItem field.
   * The high value item listed on the policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyItem getPropertyItem();
  
  
  public gw.pl.persistence.core.Key getPropertyItemID();
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.PropertyContentsIncident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PropertyItem field.
   */
  public void setPropertyItem(entity.PropertyItem value);
  
  
  public void setPropertyItemID(gw.pl.persistence.core.Key value);
  
  
  
}