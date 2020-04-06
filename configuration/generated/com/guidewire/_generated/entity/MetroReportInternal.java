package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MetroReport.eti;MetroReport.eix;MetroReport.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MetroReportInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.pl.system.bundle.CommitCallback, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.claim.entity.MetroReport {
  java.lang.String METROREPORTADDED_EVENT = "MetroReportAdded";
  
  java.lang.String METROREPORTCHANGED_EVENT = "MetroReportChanged";
  
  java.lang.String METROREPORTREMOVED_EVENT = "MetroReportRemoved";
  
  /**
   * Gets the value of the AgentCity field.
   * City of investigating agency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAgentCity();
  
  
  /**
   * Gets the value of the AgentName field.
   * Name of Investigating Agency that issued the report
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAgentName();
  
  
  /**
   * Gets the value of the AgentState field.
   * State of investigating Agency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getAgentState();
  
  
  /**
   * Gets the value of the Claim field.
   * The claim associated with this MetroReport.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the DateOfDeath field.
   * Date of death for the deceased
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfDeath();
  
  
  /**
   * Gets the value of the DateReported field.
   * Date Reported
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateReported();
  
  
  /**
   * Gets the value of the DeceasedContact field.
   * Contact for the deceased
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getDeceasedContact();
  
  
  public gw.pl.persistence.core.Key getDeceasedContactID();
  
  
  /**
   * Gets the value of the DelayMemoURL field.
   * The URL link to the delay memo when the status is deferred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDelayMemoURL();
  
  
  /**
   * Gets the value of the Doc field.
   * The report document associated with this MetroReport, if it is stored in our database. Most users should use the Document property instead of this one, as this DocID will usually be null if the IDocumentMetadataSource plugin is in use
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document getDoc();
  
  
  public gw.pl.persistence.core.Key getDocID();
  
  
  /**
   * Gets the value of the DocumentURL field.
   * The URL link to the document provided by Metro
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentURL();
  
  
  /**
   * Gets the value of the ErrorMessage field.
   * Error message return from Metro if failed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getErrorMessage();
  
  
  /**
   * Gets the value of the InformationURL field.
   * The URL link to the additional information needed from the customer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInformationURL();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossDescription field.
   * Loss Description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossDescription();
  
  
  /**
   * Gets the value of the LossType field.
   * The type of the Loss (Auto, Property, .. etc)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
  /**
   * Gets the value of the MetroAgency field.
   * Investigating Agency Type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetroAgencyType getMetroAgency();
  
  
  /**
   * Gets the value of the MetroControlNumber field.
   * Metro Control number assigned by Metro Reporting
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMetroControlNumber();
  
  
  /**
   * Gets the value of the MetroProcessID field.
   * Metro process ID - Identifying information for MetroReporting XML Support 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMetroProcessID();
  
  
  /**
   * Gets the value of the MetroReportType field.
   * Type of metro reports (Auto Accident, Fire-Home etc)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetroReportType getMetroReportType();
  
  
  /**
   * Gets the value of the MetroTransactionID field.
   * Metro transaction ID - Unique number assigned to this order
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMetroTransactionID();
  
  
  /**
   * Gets the value of the Name field.
   * Name of the metro report
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the OfficerName field.
   * The name of officer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOfficerName();
  
  
  /**
   * Gets the value of the Precinct field.
   * Precinct, troop number or name/badge # of officer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPrecinct();
  
  
  /**
   * Gets the value of the ReceivedDate field.
   * The date received the report
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReceivedDate();
  
  
  /**
   * Gets the value of the ReportNumber field.
   * Report Number assigned by issuing Police-Fire Agency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReportNumber();
  
  
  /**
   * Gets the value of the SentDate field.
   * The date sent out the order file
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSentDate();
  
  
  /**
   * Gets the value of the Status field.
   * Status of the Official Report
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetroReportStatus getStatus();
  
  
  /**
   * Gets the value of the ThirdPartyVehicle field.
   * The third party vehicle associated with this MetroReport, for auto report types.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.VehicleIncident getThirdPartyVehicle();
  
  
  public gw.pl.persistence.core.Key getThirdPartyVehicleID();
  
  
  /**
   * Gets the value of the VehicleIncident field.
   * The vehicle associated with this MetroReport, for auto report types.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.VehicleIncident getVehicleIncident();
  
  
  public gw.pl.persistence.core.Key getVehicleIncidentID();
  
  
  /**
   * Gets the value of the CreateDeferredActivity field.
   * Flag to indicate if Deferred Activity should be created or not.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCreateDeferredActivity();
  
  
  /**
   * Gets the value of the CreateHoldActivity field.
   * Flag to indicate if Hold Activity should be created or not.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCreateHoldActivity();
  
  
  /**
   * Gets the value of the ForceDuplicate field.
   * Flag to indicate if a metro report should be requested regardless of a duplicate request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isForceDuplicate();
  
  
  /**
   * Sets the value of the AgentCity field.
   */
  public void setAgentCity(java.lang.String value);
  
  
  /**
   * Sets the value of the AgentName field.
   */
  public void setAgentName(java.lang.String value);
  
  
  /**
   * Sets the value of the AgentState field.
   */
  public void setAgentState(typekey.State value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CreateDeferredActivity field.
   */
  public void setCreateDeferredActivity(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CreateHoldActivity field.
   */
  public void setCreateHoldActivity(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DateOfDeath field.
   */
  public void setDateOfDeath(java.util.Date value);
  
  
  /**
   * Sets the value of the DateReported field.
   */
  public void setDateReported(java.util.Date value);
  
  
  /**
   * Sets the value of the DeceasedContact field.
   */
  public void setDeceasedContact(entity.Contact value);
  
  
  public void setDeceasedContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DelayMemoURL field.
   */
  public void setDelayMemoURL(java.lang.String value);
  
  
  /**
   * Sets the value of the Doc field.
   */
  public void setDoc(entity.Document value);
  
  
  public void setDocID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DocumentURL field.
   */
  public void setDocumentURL(java.lang.String value);
  
  
  /**
   * Sets the value of the ErrorMessage field.
   */
  public void setErrorMessage(java.lang.String value);
  
  
  /**
   * Sets the value of the ForceDuplicate field.
   */
  public void setForceDuplicate(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the InformationURL field.
   */
  public void setInformationURL(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LossDescription field.
   */
  public void setLossDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the MetroAgency field.
   */
  public void setMetroAgency(typekey.MetroAgencyType value);
  
  
  /**
   * Sets the value of the MetroControlNumber field.
   */
  public void setMetroControlNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the MetroProcessID field.
   */
  public void setMetroProcessID(java.lang.String value);
  
  
  /**
   * Sets the value of the MetroReportType field.
   */
  public void setMetroReportType(typekey.MetroReportType value);
  
  
  /**
   * Sets the value of the MetroTransactionID field.
   */
  public void setMetroTransactionID(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the OfficerName field.
   */
  public void setOfficerName(java.lang.String value);
  
  
  /**
   * Sets the value of the Precinct field.
   */
  public void setPrecinct(java.lang.String value);
  
  
  /**
   * Sets the value of the ReceivedDate field.
   */
  public void setReceivedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ReportNumber field.
   */
  public void setReportNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the SentDate field.
   */
  public void setSentDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.MetroReportStatus value);
  
  
  /**
   * Sets the value of the ThirdPartyVehicle field.
   */
  public void setThirdPartyVehicle(entity.VehicleIncident value);
  
  
  public void setThirdPartyVehicleID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the VehicleIncident field.
   */
  public void setVehicleIncident(entity.VehicleIncident value);
  
  
  public void setVehicleIncidentID(gw.pl.persistence.core.Key value);
  
  
  
}