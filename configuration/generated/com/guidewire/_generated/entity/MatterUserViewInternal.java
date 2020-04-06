package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MatterUserView.eti;MatterUserView.eix;MatterUserView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MatterUserViewInternal extends com.guidewire._generated.entity.MatterViewInternal, gw.cc.matter.entity.MatterUserView {
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  
}