package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LitStatusTypeLine.eti;LitStatusTypeLine.eix;LitStatusTypeLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LitStatusTypeLineInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.matter.entity.LitStatusTypeLine {
  /**
   * Gets the value of the CompletionDate field.
   * Date the matter completed this status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCompletionDate();
  
  
  /**
   * Gets the value of the LitigationStatus field.
   * The current state of litigation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterStatus getLitigationStatus();
  
  
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
   * Gets the value of the StartDate field.
   * Date the matter entered this status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Sets the value of the CompletionDate field.
   */
  public void setCompletionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LitigationStatus field.
   */
  public void setLitigationStatus(typekey.MatterStatus value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  
}