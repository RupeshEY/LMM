package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WQProfilerConfig.eti;WQProfilerConfig.eix;WQProfilerConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WQProfilerConfigInternal extends com.guidewire._generated.entity.ProfilerConfigInternal {
  /**
   * Gets the value of the IndividualStacks field.
   * True to capture individual stacks; null or false to aggregate the stacks
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIndividualStacks();
  
  
  /**
   * Sets the value of the IndividualStacks field.
   */
  public void setIndividualStacks(java.lang.Boolean value);
  
  
  
}