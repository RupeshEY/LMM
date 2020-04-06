package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityTeamView.eti;ActivityTeamView.eix;ActivityTeamView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivityTeamViewInternal extends com.guidewire._generated.entity.ActivityViewInternal, gw.cc.activity.entity.ActivityTeamView {
  /**
   * Gets the value of the AssignedUserName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignedUserName();
  
  
  /**
   * Gets the value of the ClaimInsured field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getClaimInsured();
  
  
  public gw.pl.persistence.core.Key getClaimInsuredID();
  
  
  /**
   * Sets the value of the AssignedUserName field.
   */
  public void setAssignedUserName(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimInsured field.
   */
  public void setClaimInsured(entity.Contact value);
  
  
  public void setClaimInsuredID(gw.pl.persistence.core.Key value);
  
  
  
}