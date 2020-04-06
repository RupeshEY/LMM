package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MetroReportWorkflow.eti;MetroReportWorkflow.eix;MetroReportWorkflow.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MetroReportWorkflowInternal extends com.guidewire._generated.entity.ClaimWorkflowInternal, gw.cc.workflow.entity.MetroReportWorkflow {
  /**
   * Gets the value of the MetroReport field.
   * The Metro Report with which this workflow is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.MetroReport getMetroReport();
  
  
  public gw.pl.persistence.core.Key getMetroReportID();
  
  
  /**
   * Sets the value of the MetroReport field.
   */
  public void setMetroReport(entity.MetroReport value);
  
  
  public void setMetroReportID(gw.pl.persistence.core.Key value);
  
  
  
}