package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureSynchState.eti;ExposureSynchState.eix;ExposureSynchState.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureSynchStateInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.messaging.entity.ExposureSynchState {
  /**
   * Gets the value of the Exposure field.
   * The Exposure to which the synchronization state applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the MessageSink field.
   * Identifies the message sink to which the synchronization state applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMessageSink();
  
  
  /**
   * Gets the value of the SynchState field.
   * The synchronization state of the given Exposure with respect to the given message sink.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SynchState getSynchState();
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the MessageSink field.
   */
  public void setMessageSink(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SynchState field.
   */
  public void setSynchState(typekey.SynchState value);
  
  
  
}