package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageCrossMarketComment_Ext.eti;ECFMessageCrossMarketComment_Ext.eix;ECFMessageCrossMarketComment_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageCrossMarketComment_ExtInternal extends com.guidewire._generated.entity.ECFMessageComment_ExtInternal {
  /**
   * Gets the value of the BureauAgency field.
   * The bureau that the cross market comments are related to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFBureauType_Ext getBureauAgency();
  
  
  /**
   * Gets the value of the SyndicateName field.
   * The name of the agreement party who has made the comment on the mixed bureau claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSyndicateName();
  
  
  /**
   * Sets the value of the BureauAgency field.
   */
  public void setBureauAgency(typekey.ECFBureauType_Ext value);
  
  
  /**
   * Sets the value of the SyndicateName field.
   */
  public void setSyndicateName(java.lang.String value);
  
  
  
}