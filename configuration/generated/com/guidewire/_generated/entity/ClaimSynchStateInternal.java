package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimSynchState.eti;ClaimSynchState.eix;ClaimSynchState.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimSynchStateInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.messaging.entity.ClaimSynchState {
  /**
   * Gets the value of the Claim field.
   * The Claim to which the synchronization state applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the MessageSink field.
   * Identifies the message sink to which the synchronization state applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMessageSink();
  
  
  /**
   * Gets the value of the SynchState field.
   * The synchronization state of the given Claim with respect to the given message sink.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SynchState getSynchState();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the MessageSink field.
   */
  public void setMessageSink(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SynchState field.
   */
  public void setSynchState(typekey.SynchState value);
  
  
  
}