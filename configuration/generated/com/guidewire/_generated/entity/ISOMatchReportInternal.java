package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ISOMatchReport.eti;ISOMatchReport.eix;ISOMatchReport.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ISOMatchReportInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.cc.domain.iso.impl.ISOMatchReportInternal, gw.cc.iso.entity.ISOMatchReport {
  /**
   * Gets the value of the ClaimNumber field.
   * Claim number of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the DateOfLoss field.
   * Loss date of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfLoss();
  
  
  /**
   * Gets the value of the InsurerAddress1 field.
   * 1st line of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddress1();
  
  
  /**
   * Gets the value of the InsurerAddress2 field.
   * 2nd line of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddress2();
  
  
  /**
   * Gets the value of the InsurerAddress3 field.
   * 3rd line of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddress3();
  
  
  /**
   * Gets the value of the InsurerAddressCity field.
   * City of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddressCity();
  
  
  /**
   * Gets the value of the InsurerAddressPostalCode field.
   * Postal code of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddressPostalCode();
  
  
  /**
   * Gets the value of the InsurerAddressState field.
   * State of insuring company address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAddressState();
  
  
  /**
   * Gets the value of the InsurerPhone field.
   * Phone number of insuring company.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerPhone();
  
  
  /**
   * Gets the value of the InsuringCompany field.
   * Insuring company of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuringCompany();
  
  
  /**
   * Gets the value of the MatchReasons field.
   * Reasons why claim/exposure matched at ISO.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMatchReasons();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * Policy number of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Policy type of matching claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyType();
  
  
  /**
   * Gets the value of the ReceivedDate field.
   * Time match report was received.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReceivedDate();
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the DateOfLoss field.
   */
  public void setDateOfLoss(java.util.Date value);
  
  
  /**
   * Sets the value of the InsurerAddress1 field.
   */
  public void setInsurerAddress1(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerAddress2 field.
   */
  public void setInsurerAddress2(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerAddress3 field.
   */
  public void setInsurerAddress3(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerAddressCity field.
   */
  public void setInsurerAddressCity(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerAddressPostalCode field.
   */
  public void setInsurerAddressPostalCode(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerAddressState field.
   */
  public void setInsurerAddressState(java.lang.String value);
  
  
  /**
   * Sets the value of the InsurerPhone field.
   */
  public void setInsurerPhone(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuringCompany field.
   */
  public void setInsuringCompany(java.lang.String value);
  
  
  /**
   * Sets the value of the MatchReasons field.
   */
  public void setMatchReasons(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(java.lang.String value);
  
  
  /**
   * Sets the value of the ReceivedDate field.
   */
  public void setReceivedDate(java.util.Date value);
  
  
  
}