package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InboundHistory.eti;InboundHistory.eix;InboundHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface InboundHistoryInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.commons.profiler.ProfilerDataSourceInternal {
  java.lang.String INBOUNDHISTORYADDED_EVENT = "InboundHistoryAdded";
  
  java.lang.String INBOUNDHISTORYCHANGED_EVENT = "InboundHistoryChanged";
  
  java.lang.String INBOUNDHISTORYREMOVED_EVENT = "InboundHistoryRemoved";
  
  /**
   * Gets the value of the CompleteDate field.
   * The date this call completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCompleteDate();
  
  
  /**
   * Gets the value of the ProfilerData field.
   * Raw Profiler data
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getProfilerData();
  
  
  /**
   * Gets the value of the StartDate field.
   * The date this call started.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InboundHistory getSubtype();
  
  
  /**
   * Sets the value of the CompleteDate field.
   */
  public void setCompleteDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ProfilerData field.
   */
  public void setProfilerData(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.InboundHistory value);
  
  
  
}