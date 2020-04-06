package entity;

/**
 * ISOMatchReport
 * 
 *       Details of a match for a Claim or Exposure as returned by the Insurance Office Services (ISO) ClaimSearch
 *       service. If ISO ClaimSearch integration is enabled then descriptions of new or changed Claims or Exposures
 *       are sent to the ISO ClaimSearch service to see if any suspiciously similar claims have been filed at other
 *       companies. If ISO ClaimSearch returns a "match report", indicating that one or more similar claims have been
 *       filed, then the report is added to the claim as a document and the most important information from
 *       each reported match is stored in an ISOMatchReport entity.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ISOMatchReport.eti;ISOMatchReport.eix;ISOMatchReport.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface ISOMatchReport extends entity.Retireable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ISOMatchReport> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ISOMatchReport>("entity.ISOMatchReport");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ClaimNumber", "ClaimNumber");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEOFLOSS_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("DateOfLoss", "DateOfLoss");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESS1_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("InsurerAddress1", "InsurerAddress1");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESS2_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("InsurerAddress2", "InsurerAddress2");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESS3_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("InsurerAddress3", "InsurerAddress3");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESSCITY_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("InsurerAddressCity", "InsurerAddressCity");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESSPOSTALCODE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("InsurerAddressPostalCode", "InsurerAddressPostalCode");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERADDRESSSTATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("InsurerAddressState", "InsurerAddressState");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERPHONE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("InsurerPhone", "InsurerPhone");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURINGCOMPANY_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("InsuringCompany", "InsuringCompany");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MATCHREASONS_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("MatchReasons", "MatchReasons");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PolicyNumber", "PolicyNumber");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYTYPE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PolicyType", "PolicyType");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECEIVEDDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ReceivedDate", "ReceivedDate");
  
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
   * The claim associated with this match report
   * @return the Claim
   */
  public entity.Claim getISOClaim();
  
  
  /**
   * The exposure associated with this match report, or null if this is a claim level match
   * report
   * @return the Exposure, or null
   */
  public entity.Exposure getISOExposure();
  
  
  /**
   * The ISOReportable object (Claim or Exposure) that owns this match report
   * @return the owning ISOReportable object
   */
  public entity.ISOReportable getISOReportable();
  
  
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
   * Returns the address of the insurer, with all parts of the address joined
   * by commas.
   * @return the address of the insurer
   */
  public java.lang.String getInsurerAddressForDisplay();
  
  
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
   * Returns the reasons for the match report, formatted suitably for display
   * to the user.
   * @return the reasons for the match report
   */
  public java.lang.String getMatchReasonsForDisplay();
  
  
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
   * Returns the policy type in the match report, formatted suitably for display
   * to the user.
   * @return the policy type in the match report
   */
  public java.lang.String getPolicyTypeForDisplay();
  
  
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