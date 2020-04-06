package entity;

/**
 * ISOReportable
 * 
 *       Common fields used to track communication with ISO about a Claim or Exposure.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ISOReportable.eti;ISOReportable.eix;ISOReportable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface ISOReportable extends entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ISOReportable> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ISOReportable>("entity.ISOReportable");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISOKNOWN_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ISOKnown", "ISOKnown");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISORECEIVEDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ISOReceiveDate", "ISOReceiveDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISOSENDDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ISOSendDate", "ISOSendDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ISOSTATUS_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("ISOStatus", "ISOStatus");
  
  /**
   * Add a new match report to the array of match reports on this Claim/Exposure
   * @return the newly created match report
   */
  public entity.ISOMatchReport addNewISOMatchReport();
  
  
  /**
   * Add the given match report to the array of match reports on this Claim/Exposure
   * @param report the report to be added
   */
  public void addToISOMatchReports(entity.ISOMatchReport report);
  
  
  /**
   * The claim associated with this Claim/Exposure. For a Claim, just returns itself, for an
   * exposure, returns the exposure's Claim.
   * @return the Claim
   */
  public entity.Claim getISOClaim();
  
  
  /**
   * Error message if most recent ISO ClaimSearch request failed. Otherwise <code>null</code>.
   * @return the error message, or null
   */
  public java.lang.String getISOErrorMessage();
  
  
  /**
   * If this is an exposure, returns itself, otherwise returns null
   * @return the Exposure, or null
   */
  public entity.Exposure getISOExposure();
  
  
  /**
   * Returns an array of the match reports associated with this Claim/Exposure, in random order
   * @return a non null array of match reports
   */
  public entity.ISOMatchReport[] getISOMatchReports();
  
  
  /**
   * Gets the value of the ISOReceiveDate field.
   * The last time a response was received from ISO for this object. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getISOReceiveDate();
  
  
  /**
   * Gets the value of the ISOSendDate field.
   * The last time a search request was sent to ISO. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getISOSendDate();
  
  
  /**
   * Gets the value of the ISOStatus field.
   * Status of exposure with ISO - for example checked, not of interest.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ISOStatus getISOStatus();
  
  
  /**
   * Gets the value of the ISOKnown field.
   * Has a search request for this object been successfully received by ISO?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isISOKnown();
  
  
  /**
   * Remove the given match report form the array of match reports on this Claim/Exposure
   * @param report the report to be removed
   */
  public void removeFromISOMatchReports(entity.ISOMatchReport report);
  
  
  /**
   * Set error message if most recent ISO ClaimSearch request failed.
   * @param isoErrorMessage the new error message
   */
  public void setISOErrorMessage(java.lang.String isoErrorMessage);
  
  
  /**
   * Sets the value of the ISOKnown field.
   */
  public void setISOKnown(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ISOReceiveDate field.
   */
  public void setISOReceiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ISOSendDate field.
   */
  public void setISOSendDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ISOStatus field.
   */
  public void setISOStatus(typekey.ISOStatus value);
  
  
  
}