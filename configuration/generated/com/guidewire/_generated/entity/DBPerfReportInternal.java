package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DBPerfReport.eti;DBPerfReport.eix;DBPerfReport.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DBPerfReportInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EndTime field.
   * End time of data distribution process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the ErrorMessages field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getErrorMessages();
  
  
  /**
   * Gets the value of the PerfDownload field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getPerfDownload();
  
  
  /**
   * Gets the value of the StartTime field.
   * Start time of data distribution process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the Status field.
   * 0 for STARTED, 1 for SUCCESSFULLY_COMPLETED, 2 for FAILED
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getStatus();
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ErrorMessages field.
   */
  public void setErrorMessages(java.lang.String value);
  
  
  /**
   * Sets the value of the PerfDownload field.
   */
  public void setPerfDownload(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(java.lang.Integer value);
  
  
  
}