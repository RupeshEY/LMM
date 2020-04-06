package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ProfilerConfig.eti;ProfilerConfig.eix;ProfilerConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ProfilerConfigInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.persistence.core.impl.VersionableInternal {
  /**
   * Gets the value of the DbmsCounterThresholdMs field.
   * The threshold for generating a report using dbms counters for the interval (start of profiling session, end of profiling session). Use 0 to disable. Only meaningful if ProfilerEnabled is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDbmsCounterThresholdMs();
  
  
  /**
   * Gets the value of the EntryPoint field.
   * Name of entry point
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntryPoint();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ProfilerConfig getSubtype();
  
  
  /**
   * Gets the value of the DiffDbmsCounters field.
   * Whether diffing DBMS counters is enabled. Only meaningful if ProfilerEnabled and DbmsCounterThresholdMs are true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDiffDbmsCounters();
  
  
  /**
   * Gets the value of the ExtendedQueryTracing field.
   * Whether extended query tracing is enabled. Only meaningful if ProfilerEnabled is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExtendedQueryTracing();
  
  
  /**
   * Gets the value of the HiResClock field.
   * Whether to use hi-resolution clock for timing (Windows only)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isHiResClock();
  
  
  /**
   * Gets the value of the ProfilerEnabled field.
   * Whether profiling is enabled for this entry point
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isProfilerEnabled();
  
  
  /**
   * Gets the value of the QueryOptimizerTracing field.
   * Whether query optimizer tracing is enabled. Only meaningful if ProfilerEnabled is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isQueryOptimizerTracing();
  
  
  /**
   * Gets the value of the StackTraceTracking field.
   * Whether stack tracing is enabled. Only meaningful if ProfilerEnabled is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStackTraceTracking();
  
  
  /**
   * Sets the value of the DbmsCounterThresholdMs field.
   */
  public void setDbmsCounterThresholdMs(java.lang.Integer value);
  
  
  /**
   * Sets the value of the DiffDbmsCounters field.
   */
  public void setDiffDbmsCounters(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the EntryPoint field.
   */
  public void setEntryPoint(java.lang.String value);
  
  
  /**
   * Sets the value of the ExtendedQueryTracing field.
   */
  public void setExtendedQueryTracing(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the HiResClock field.
   */
  public void setHiResClock(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ProfilerEnabled field.
   */
  public void setProfilerEnabled(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the QueryOptimizerTracing field.
   */
  public void setQueryOptimizerTracing(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StackTraceTracking field.
   */
  public void setStackTraceTracking(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ProfilerConfig value);
  
  
  
}