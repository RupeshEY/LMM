package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFContractMarket_Ext.eti;ECFContractMarket_Ext.eix;ECFContractMarket_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFContractMarket_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the Bureau field.
   * Bureau type of the insurer/reinsurer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFBureauType_Ext getBureau();
  
  
  /**
   * Gets the value of the ECFMessageClaimData_Ext field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimData_Ext getECFMessageClaimData_Ext();
  
  
  public gw.pl.persistence.core.Key getECFMessageClaimData_ExtID();
  
  
  /**
   * Gets the value of the InsurerSharePercentage field.
   * The percentage share this insurer holds in this message. Relates to financials in the message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getInsurerSharePercentage();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ParticipantFunction field.
   * The ParticipantFunction(a role) of the insurer or reinsurer on the claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFParticipantFunction_Ext getParticipantFunction();
  
  
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
   * Gets the value of the IsPrimaryRole field.
   * Specify a primary role in current Claim Notify message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsPrimaryRole();
  
  
  /**
   * Sets the value of the Bureau field.
   */
  public void setBureau(typekey.ECFBureauType_Ext value);
  
  
  /**
   * Sets the value of the ECFMessageClaimData_Ext field.
   */
  public void setECFMessageClaimData_Ext(entity.ECFMessageClaimData_Ext value);
  
  
  public void setECFMessageClaimData_ExtID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InsurerSharePercentage field.
   */
  public void setInsurerSharePercentage(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the IsPrimaryRole field.
   */
  public void setIsPrimaryRole(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ParticipantFunction field.
   */
  public void setParticipantFunction(typekey.ECFParticipantFunction_Ext value);
  
  
  /**
   * Sets the value of the PartyID field.
   */
  public void setPartyID(java.lang.String value);
  
  
  /**
   * Sets the value of the PartyName field.
   */
  public void setPartyName(java.lang.String value);
  
  
  
}