package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "StartablePluginHistory.eti;StartablePluginHistory.eix;StartablePluginHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface StartablePluginHistoryInternal extends com.guidewire._generated.entity.InboundHistoryInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.commons.profiler.ProfilerDataSourceInternal {
  java.lang.String STARTABLEPLUGINHISTORYADDED_EVENT = "StartablePluginHistoryAdded";
  
  java.lang.String STARTABLEPLUGINHISTORYCHANGED_EVENT = "StartablePluginHistoryChanged";
  
  java.lang.String STARTABLEPLUGINHISTORYREMOVED_EVENT = "StartablePluginHistoryRemoved";
  
  /**
   * Gets the value of the PluginName field.
   * The name of the plugin.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPluginName();
  
  
  /**
   * Sets the value of the PluginName field.
   */
  public void setPluginName(java.lang.String value);
  
  
  
}