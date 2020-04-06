package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimDataCarrier_Ext.eti;ECFMessageClaimDataCarrier_Ext.eix;ECFMessageClaimDataCarrier_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageClaimDataCarrier_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Adds the given element to the MarketFinancialAmounts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMarketFinancialAmounts(entity.ECFMarketFinancialAmount_Ext element);
  
  
  /**
   * Gets the value of the ClaimLineNumber field.
   * Claim Line Number - in CLASS (needed for non-uniqueness of Company/Syndicate participation)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimLineNumber();
  
  
  /**
   * Gets the value of the Code field.
   * The Managing Agent Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCode();
  
  
  /**
   * Gets the value of the Consortium field.
   * The consortium number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getConsortium();
  
  
  /**
   * Gets the value of the Contact field.
   * The name of the person to contact at the insurer/reinsurer organisation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContact();
  
  
  /**
   * Gets the value of the ECFMsg field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimData_Ext getECFMsg();
  
  
  public gw.pl.persistence.core.Key getECFMsgID();
  
  
  /**
   * Gets the value of the Email field.
   * The email address of the insurer/reinsurer contact person
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmail();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Market field.
   * Coded identification of a reinsurer/insurer on the claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMarket();
  
  
  /**
   * Gets the value of the MarketFinancialAmounts field.
   * ECF ClaimNotify Request Message MarketFinancialAmounts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMarketFinancialAmount_Ext[] getMarketFinancialAmounts();
  
  
  /**
   * Gets the value of the Name field.
   * Name of the insurer/reinsurer in text format
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Phone field.
   * The phone number of the person to contact at the insurer/reinsurer organisation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPhone();
  
  
  /**
   * Gets the value of the Reference1 field.
   * The insurer or reinsurer claim reference number 1
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReference1();
  
  
  /**
   * Gets the value of the Reference2 field.
   * The insurer or reinsurer claim reference number 2
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReference2();
  
  
  /**
   * Gets the value of the Role field.
   * The insurer or reinsurer participant function
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFParticipantFunction_Ext getRole();
  
  
  /**
   * Gets the value of the Share field.
   * The insurer share percentage
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getShare();
  
  
  /**
   * Removes the given element from the MarketFinancialAmounts array. This is achieved by marking the element for removal.
   */
  public void removeFromMarketFinancialAmounts(entity.ECFMarketFinancialAmount_Ext element);
  
  
  /**
   * Removes the given element from the MarketFinancialAmounts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMarketFinancialAmounts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ClaimLineNumber field.
   */
  public void setClaimLineNumber(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Code field.
   */
  public void setCode(java.lang.String value);
  
  
  /**
   * Sets the value of the Consortium field.
   */
  public void setConsortium(java.lang.String value);
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(java.lang.String value);
  
  
  /**
   * Sets the value of the ECFMsg field.
   */
  public void setECFMsg(entity.ECFMessageClaimData_Ext value);
  
  
  public void setECFMsgID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Email field.
   */
  public void setEmail(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Market field.
   */
  public void setMarket(java.lang.String value);
  
  
  /**
   * Sets the value of the MarketFinancialAmounts field.
   */
  public void setMarketFinancialAmounts(entity.ECFMarketFinancialAmount_Ext[] value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Phone field.
   */
  public void setPhone(java.lang.String value);
  
  
  /**
   * Sets the value of the Reference1 field.
   */
  public void setReference1(java.lang.String value);
  
  
  /**
   * Sets the value of the Reference2 field.
   */
  public void setReference2(java.lang.String value);
  
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(typekey.ECFParticipantFunction_Ext value);
  
  
  /**
   * Sets the value of the Share field.
   */
  public void setShare(java.math.BigDecimal value);
  
  
  
}