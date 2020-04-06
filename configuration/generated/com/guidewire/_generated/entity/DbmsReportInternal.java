package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DbmsReport.eti;DbmsReport.eix;DbmsReport.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DbmsReportInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the CaptureDate field.
   * The datetime this was captured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCaptureDate();
  
  
  /**
   * Gets the value of the ZippedReport field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getZippedReport();
  
  
  /**
   * Sets the value of the CaptureDate field.
   */
  public void setCaptureDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ZippedReport field.
   */
  public void setZippedReport(gw.lang.Blob value);
  
  
  
}