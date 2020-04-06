package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFClaimParticipantRole_Ext.eti;ECFClaimParticipantRole_Ext.eix;ECFClaimParticipantRole_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFClaimParticipantRole_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the BureauType field.
   * Bureau type of the insurer/reinsurer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFBureauType_Ext getBureauType();
  
  
  /**
   * Gets the value of the ECFMessageClaimResponseRq_Ext field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimResponseRq_Ext getECFMessageClaimResponseRq_Ext();
  
  
  public gw.pl.persistence.core.Key getECFMessageClaimResponseRq_ExtID();
  
  
  /**
   * Gets the value of the InitialParticipantFunction field.
   * The ParticipantFunction of the insurer or reinsurer on the most recent transaction update.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFParticipantFunction_Ext getInitialParticipantFunction();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the NewParticipantFunction field.
   * The ParticipantFunction the insurer or reinsurer will be set to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFParticipantFunction_Ext getNewParticipantFunction();
  
  
  /**
   * Gets the value of the PartyID field.
   * Coded identification of a reinsurer/insurer on the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPartyID();
  
  
  /**
   * Gets the value of the PartyName field.
   * Party Name of a reinsurer/insurer on the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPartyName();
  
  
  /**
   * Sets the value of the BureauType field.
   */
  public void setBureauType(typekey.ECFBureauType_Ext value);
  
  
  /**
   * Sets the value of the ECFMessageClaimResponseRq_Ext field.
   */
  public void setECFMessageClaimResponseRq_Ext(entity.ECFMessageClaimResponseRq_Ext value);
  
  
  public void setECFMessageClaimResponseRq_ExtID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InitialParticipantFunction field.
   */
  public void setInitialParticipantFunction(typekey.ECFParticipantFunction_Ext value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NewParticipantFunction field.
   */
  public void setNewParticipantFunction(typekey.ECFParticipantFunction_Ext value);
  
  
  /**
   * Sets the value of the PartyID field.
   */
  public void setPartyID(java.lang.String value);
  
  
  /**
   * Sets the value of the PartyName field.
   */
  public void setPartyName(java.lang.String value);
  
  
  
}