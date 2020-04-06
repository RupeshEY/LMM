package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AssessmentLine.eti;AssessmentLine.eix;AssessmentLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AssessmentLineInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.AssessmentLine {
  /**
   * Gets the value of the AssessmentSource field.
   * Related Incident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssessmentSource getAssessmentSource();
  
  
  public gw.pl.persistence.core.Key getAssessmentSourceID();
  
  
  /**
   * Gets the value of the Event field.
   * The event of this assessment line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssessmentEvent getEvent();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Note field.
   * Notes or comments explaining the reasoning behind this event status line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNote();
  
  
  /**
   * Gets the value of the StatusDate field.
   * Date the event took place
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStatusDate();
  
  
  /**
   * Sets the value of the AssessmentSource field.
   */
  public void setAssessmentSource(entity.AssessmentSource value);
  
  
  public void setAssessmentSourceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Event field.
   */
  public void setEvent(typekey.AssessmentEvent value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Note field.
   */
  public void setNote(java.lang.String value);
  
  
  /**
   * Sets the value of the StatusDate field.
   */
  public void setStatusDate(java.util.Date value);
  
  
  
}