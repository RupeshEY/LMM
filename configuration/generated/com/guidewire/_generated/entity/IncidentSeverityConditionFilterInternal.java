package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "IncidentSeverityConditionFilter.eti;IncidentSeverityConditionFilter.eix;IncidentSeverityConditionFilter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface IncidentSeverityConditionFilterInternal extends com.guidewire._generated.entity.ConditionFilterInternal {
  /**
   * Gets the value of the IncidentSeverity field.
   * Classification condition filter by Incident Severity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SeverityType getIncidentSeverity();
  
  
  /**
   * Sets the value of the IncidentSeverity field.
   */
  public void setIncidentSeverity(typekey.SeverityType value);
  
  
  
}