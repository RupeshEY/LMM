package entity;

/**
 * MetroReport
 * 
 *             MetroReport entity corresponds to the report obtained from Metropolitan Reporting Bureau. MetroReport
 *              contains some required data fields for requesting or receiving message from Metropolitan Reporting Bureau
 *              (such as loss description, sent date and status). It also has a reference to the generated document.
 *              A MetroReport is associated with a single claim.
 *             
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MetroReport.eti;MetroReport.eix;MetroReport.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "MetroReport")
public class MetroReport extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MetroReport> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MetroReport>("entity.MetroReport");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AGENTCITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AgentCity");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AGENTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AgentName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> AGENTSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AgentState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATEDEFERREDACTIVITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateDeferredActivity");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATEHOLDACTIVITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateHoldActivity");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEOFDEATH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateOfDeath");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEREPORTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateReported");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DECEASEDCONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DeceasedContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DELAYMEMOURL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DelayMemoURL");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DOC_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Doc");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DOCUMENTURL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DocumentURL");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ERRORMESSAGE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ErrorMessage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FORCEDUPLICATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ForceDuplicate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INFORMATIONURL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InformationURL");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSDESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossDescription");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> METROAGENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MetroAgency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> METROCONTROLNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MetroControlNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> METROPROCESSID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MetroProcessID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> METROREPORTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MetroReportType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> METROTRANSACTIONID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MetroTransactionID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OFFICERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OfficerName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PRECINCT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Precinct");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECEIVEDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReceivedDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPORTNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReportNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SENTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SentDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> THIRDPARTYVEHICLE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ThirdPartyVehicle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VEHICLEINCIDENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "VehicleIncident");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.MetroReportInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public MetroReport()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public MetroReport(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected MetroReport(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.MetroReportInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.MetroReportInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Associates an event with the bean, which will be fired when the bean is
   * committed. A bean with an event is considered changed.
   * @param strEventId The event id.
   */
  public void addEvent(java.lang.String strEventId) {
    ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
  }
  
  /**
   * Creates the document and associates it with the claim and the metroReport. The following
   * fields in the document are been set :
   * Name  - The default document name is been set as the reportType + file name parsed from the documentURL.
   * MimeType - The default mime type is set to Metro.DocumentMimeType defined in Metro.properties.
   * DMS - default DMS is set to true.
   * Status - default status is set to TC_FINAL.
   * Type - default Type is metro.
   * Author - default is ClaimCenter.
   * @return The newly created metro report document entity.
   */
  public void createMetroDocument() {
    ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).createMetroDocument();
  }
  
  /**
   * download the report and attached to the metroReport from the documentURL
   * in metroReport
   */
  public void downloadDocument() throws java.lang.Exception {
    ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).downloadDocument();
  }
  
  /**
   * Gets the value of the AgentCity field.
   * City of investigating agency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAgentCity() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AGENTCITY_PROP.get());
  }
  
  /**
   * Gets the value of the AgentName field.
   * Name of Investigating Agency that issued the report
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAgentName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AGENTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the AgentState field.
   * State of investigating Agency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getAgentState() {
    return (typekey.State)__getInternalInterface().getFieldValue(AGENTSTATE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Claim field.
   * The claim associated with this MetroReport.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the CreateTime field.
   * Timestamp when the object was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the CreateUser field.
   * User who created the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
  }
  
  /**
   * Gets the value of the DateOfDeath field.
   * Date of death for the deceased
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfDeath() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFDEATH_PROP.get());
  }
  
  /**
   * Gets the value of the DateReported field.
   * Date Reported
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateReported() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEREPORTED_PROP.get());
  }
  
  /**
   * Gets the value of the DeceasedContact field.
   * Contact for the deceased
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getDeceasedContact() {
    return (entity.Contact)__getInternalInterface().getFieldValue(DECEASEDCONTACT_PROP.get());
  }
  
  /**
   * Gets the value of the DelayMemoURL field.
   * The URL link to the delay memo when the status is deferred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDelayMemoURL() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DELAYMEMOURL_PROP.get());
  }
  
  /**
   * Gets the value of the Doc field.
   * The report document associated with this MetroReport, if it is stored in our database. Most users should use the Document property instead of this one, as this DocID will usually be null if the IDocumentMetadataSource plugin is in use
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document getDoc() {
    return (entity.Document)__getInternalInterface().getFieldValue(DOC_PROP.get());
  }
  
  /**
   * Return the report document attached to this Metro report or null if there is no such document.
   * This property should be used in preference to the "Doc" property because it works even if
   * a custom IDocumentMetadataSource plugin is used to store the document metadata. The Doc property
   * only works if the document metadata is stored directly in the database
   */
  public entity.Document getDocument() {
    return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).getDocument();
  }
  
  /**
   * Gets the value of the DocumentURL field.
   * The URL link to the document provided by Metro
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentURL() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTURL_PROP.get());
  }
  
  /**
   * Gets the value of the ErrorMessage field.
   * Error message return from Metro if failed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getErrorMessage() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ERRORMESSAGE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the InformationURL field.
   * The URL link to the additional information needed from the customer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInformationURL() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INFORMATIONURL_PROP.get());
  }
  
  /**
   * Gets time interval between inquiries.
   */
  public java.lang.String getInquiryWaitInterval() {
    return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).getInquiryWaitInterval();
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  /**
   * Gets the value of the LossDescription field.
   * Loss Description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSDESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the LossType field.
   * The type of the Loss (Auto, Property, .. etc)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType() {
    return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the MetroAgency field.
   * Investigating Agency Type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetroAgencyType getMetroAgency() {
    return (typekey.MetroAgencyType)__getInternalInterface().getFieldValue(METROAGENCY_PROP.get());
  }
  
  /**
   * Gets the value of the MetroControlNumber field.
   * Metro Control number assigned by Metro Reporting
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMetroControlNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(METROCONTROLNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the MetroProcessID field.
   * Metro process ID - Identifying information for MetroReporting XML Support 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMetroProcessID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(METROPROCESSID_PROP.get());
  }
  
  /**
   * Gets the value of the MetroReportType field.
   * Type of metro reports (Auto Accident, Fire-Home etc)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetroReportType getMetroReportType() {
    return (typekey.MetroReportType)__getInternalInterface().getFieldValue(METROREPORTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the MetroTransactionID field.
   * Metro transaction ID - Unique number assigned to this order
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMetroTransactionID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(METROTRANSACTIONID_PROP.get());
  }
  
  /**
   * Gets the value of the Name field.
   * Name of the metro report
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  /**
   * Gets the value of the OfficerName field.
   * The name of officer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOfficerName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OFFICERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the Precinct field.
   * Precinct, troop number or name/badge # of officer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPrecinct() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PRECINCT_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReceivedDate field.
   * The date received the report
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReceivedDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RECEIVEDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ReportNumber field.
   * Report Number assigned by issuing Police-Fire Agency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReportNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REPORTNUMBER_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the SentDate field.
   * The date sent out the order file
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSentDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SENTDATE_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   * Status of the Official Report
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetroReportStatus getStatus() {
    return (typekey.MetroReportStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Gets the value of the ThirdPartyVehicle field.
   * The third party vehicle associated with this MetroReport, for auto report types.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.VehicleIncident getThirdPartyVehicle() {
    return (entity.VehicleIncident)__getInternalInterface().getFieldValue(THIRDPARTYVEHICLE_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateTime field.
   * Timestamp when the object was last updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateUser field.
   * User who last updated the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUpdateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
  }
  
  /**
   * Gets the value of the VehicleIncident field.
   * The vehicle associated with this MetroReport, for auto report types.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.VehicleIncident getVehicleIncident() {
    return (entity.VehicleIncident)__getInternalInterface().getFieldValue(VEHICLEINCIDENT_PROP.get());
  }
  
  /**
   * Return true if there is a report document attached to this Metro report, false otherwise.
   * This property should be used in preference to testing the "Doc" property because it works even if
   * a custom IDocumentMetadataSource plugin is used to store the document metadata. The Doc property
   * only works if the document metadata is stored directly in the database
   */
  public boolean hasDocument() {
    return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).hasDocument();
  }
  
  /**
   * Gets the value of the CreateDeferredActivity field.
   * Flag to indicate if Deferred Activity should be created or not.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCreateDeferredActivity() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CREATEDEFERREDACTIVITY_PROP.get());
  }
  
  /**
   * Gets the value of the CreateHoldActivity field.
   * Flag to indicate if Hold Activity should be created or not.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCreateHoldActivity() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CREATEHOLDACTIVITY_PROP.get());
  }
  
  /**
   * Gets the value of the ForceDuplicate field.
   * Flag to indicate if a metro report should be requested regardless of a duplicate request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isForceDuplicate() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FORCEDUPLICATE_PROP.get());
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * Return true if the workflow has been started for this report and it has been running longer than
   * the "Order Timeout". If the workflow has passed the order timeout and has not yet had a successful
   * reply to the initial order request then it will finish and generate an error activity
   * @return true if the workflow has been started and has been running longer than the order timeout,
   *   false otherwise
   */
  public boolean isPastOrderTimeout() {
    return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).isPastOrderTimeout();
  }
  
  /**
   * Return true if the workflow has been started for this report and it has been running longer than
   * the "Workflow Timeout". If the workflow has passed the workflow timeout and has not yet had a successful
   * reply to the initial workflow request then it will finish and generate an error activity
   * @return true if the workflow has been started and has been running longer than the workflow timeout,
   *   false otherwise
   */
  public boolean isPastWorkflowTimeout() {
    return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).isPastWorkflowTimeout();
  }
  
  /**
   * 
   * @return True if the object has been retired from active use, false if the
   *         object is active.  Retireable objects are never deleted from a
   *         database table, instead they are retired by setting the retired
   *         column to the same value as the ID of the object.
   */
  public java.lang.Boolean isRetired() {
    return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Sets the value of the AgentCity field.
   */
  public void setAgentCity(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(AGENTCITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AgentName field.
   */
  public void setAgentName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(AGENTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AgentState field.
   */
  public void setAgentState(typekey.State value) {
    __getInternalInterface().setFieldValue(AGENTSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateDeferredActivity field.
   */
  public void setCreateDeferredActivity(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CREATEDEFERREDACTIVITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateHoldActivity field.
   */
  public void setCreateHoldActivity(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CREATEHOLDACTIVITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateOfDeath field.
   */
  public void setDateOfDeath(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEOFDEATH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateReported field.
   */
  public void setDateReported(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEREPORTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DeceasedContact field.
   */
  public void setDeceasedContact(entity.Contact value) {
    __getInternalInterface().setFieldValue(DECEASEDCONTACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DelayMemoURL field.
   */
  public void setDelayMemoURL(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DELAYMEMOURL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Doc field.
   */
  public void setDoc(entity.Document value) {
    __getInternalInterface().setFieldValue(DOC_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DocumentURL field.
   */
  public void setDocumentURL(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DOCUMENTURL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ErrorMessage field.
   */
  public void setErrorMessage(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ERRORMESSAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ForceDuplicate field.
   */
  public void setForceDuplicate(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FORCEDUPLICATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InformationURL field.
   */
  public void setInformationURL(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INFORMATIONURL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossDescription field.
   */
  public void setLossDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOSSDESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value) {
    __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MetroAgency field.
   */
  public void setMetroAgency(typekey.MetroAgencyType value) {
    __getInternalInterface().setFieldValue(METROAGENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MetroControlNumber field.
   */
  public void setMetroControlNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(METROCONTROLNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MetroProcessID field.
   */
  public void setMetroProcessID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(METROPROCESSID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MetroReportType field.
   */
  public void setMetroReportType(typekey.MetroReportType value) {
    __getInternalInterface().setFieldValue(METROREPORTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MetroTransactionID field.
   */
  public void setMetroTransactionID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(METROTRANSACTIONID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the OfficerName field.
   */
  public void setOfficerName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(OFFICERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Precinct field.
   */
  public void setPrecinct(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PRECINCT_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReceivedDate field.
   */
  public void setReceivedDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RECEIVEDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReportNumber field.
   */
  public void setReportNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(REPORTNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SentDate field.
   */
  public void setSentDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SENTDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.MetroReportStatus value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ThirdPartyVehicle field.
   */
  public void setThirdPartyVehicle(entity.VehicleIncident value) {
    __getInternalInterface().setFieldValue(THIRDPARTYVEHICLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VehicleIncident field.
   */
  public void setVehicleIncident(entity.VehicleIncident value) {
    __getInternalInterface().setFieldValue(VEHICLEINCIDENT_PROP.get(), value);
  }
  
  /**
   * Starts the workflow for this report, which will result in asking the
   * external system for the actual report.  This MetroReport must already
   * have its state = validated when this method is called.  It is an
   * error to call this method twice on the same MetroReport.
   */
  public void startReportFlow() {
    ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).startReportFlow();
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.MetroReportInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.MetroReport.this.__getDelegateManager();
    }
    
    public void addEvent(com.guidewire.pl.system.entity.BeanEvent event) {
      ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).addEvent(event);
    }
    
    /**
     * Associates an event with the bean, which will be fired when the bean is
     * committed. A bean with an event is considered changed.
     * @param strEventId The event id.
     */
    public void addEvent(java.lang.String strEventId) {
      ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
    }
    
    public void afterDatabaseWrite() {
      ((com.guidewire.pl.system.bundle.CommitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.CommitCallback")).afterDatabaseWrite();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
    }
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
    }
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * Creates the document and associates it with the claim and the metroReport. The following
     * fields in the document are been set :
     * Name  - The default document name is been set as the reportType + file name parsed from the documentURL.
     * MimeType - The default mime type is set to Metro.DocumentMimeType defined in Metro.properties.
     * DMS - default DMS is set to true.
     * Status - default status is set to TC_FINAL.
     * Type - default Type is metro.
     * Author - default is ClaimCenter.
     * @return The newly created metro report document entity.
     */
    public void createMetroDocument() {
      ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).createMetroDocument();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    /**
     * download the report and attached to the metroReport from the documentURL
     * in metroReport
     */
    public void downloadDocument() throws java.lang.Exception {
      ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).downloadDocument();
    }
    
    public java.util.List generateInsertEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateInsertEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List generateRemoveEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateRemoveEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List generateUpdateEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateUpdateEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the AgentCity field.
     * City of investigating agency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAgentCity() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AGENTCITY_PROP.get());
    }
    
    /**
     * Gets the value of the AgentName field.
     * Name of Investigating Agency that issued the report
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAgentName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AGENTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the AgentState field.
     * State of investigating Agency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getAgentState() {
      return (typekey.State)__getInternalInterface().getFieldValue(AGENTSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     * The claim associated with this MetroReport.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     * Timestamp when the object was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     * User who created the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the DateOfDeath field.
     * Date of death for the deceased
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateOfDeath() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFDEATH_PROP.get());
    }
    
    /**
     * Gets the value of the DateReported field.
     * Date Reported
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateReported() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEREPORTED_PROP.get());
    }
    
    /**
     * Gets the value of the DeceasedContact field.
     * Contact for the deceased
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getDeceasedContact() {
      return (entity.Contact)__getInternalInterface().getFieldValue(DECEASEDCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDeceasedContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DECEASEDCONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the DelayMemoURL field.
     * The URL link to the delay memo when the status is deferred
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDelayMemoURL() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DELAYMEMOURL_PROP.get());
    }
    
    /**
     * Gets the value of the Doc field.
     * The report document associated with this MetroReport, if it is stored in our database. Most users should use the Document property instead of this one, as this DocID will usually be null if the IDocumentMetadataSource plugin is in use
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Document getDoc() {
      return (entity.Document)__getInternalInterface().getFieldValue(DOC_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDocID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DOC_PROP.get());
    }
    
    /**
     * Return the report document attached to this Metro report or null if there is no such document.
     * This property should be used in preference to the "Doc" property because it works even if
     * a custom IDocumentMetadataSource plugin is used to store the document metadata. The Doc property
     * only works if the document metadata is stored directly in the database
     */
    public entity.Document getDocument() {
      return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).getDocument();
    }
    
    /**
     * Gets the value of the DocumentURL field.
     * The URL link to the document provided by Metro
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDocumentURL() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTURL_PROP.get());
    }
    
    /**
     * Gets the value of the ErrorMessage field.
     * Error message return from Metro if failed
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getErrorMessage() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ERRORMESSAGE_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the InformationURL field.
     * The URL link to the additional information needed from the customer
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInformationURL() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INFORMATIONURL_PROP.get());
    }
    
    /**
     * Gets time interval between inquiries.
     */
    public java.lang.String getInquiryWaitInterval() {
      return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).getInquiryWaitInterval();
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the LossDescription field.
     * Loss Description
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLossDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOSSDESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the LossType field.
     * The type of the Loss (Auto, Property, .. etc)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossType getLossType() {
      return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the MetroAgency field.
     * Investigating Agency Type
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MetroAgencyType getMetroAgency() {
      return (typekey.MetroAgencyType)__getInternalInterface().getFieldValue(METROAGENCY_PROP.get());
    }
    
    /**
     * Gets the value of the MetroControlNumber field.
     * Metro Control number assigned by Metro Reporting
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMetroControlNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(METROCONTROLNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the MetroProcessID field.
     * Metro process ID - Identifying information for MetroReporting XML Support 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMetroProcessID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(METROPROCESSID_PROP.get());
    }
    
    /**
     * Gets the value of the MetroReportType field.
     * Type of metro reports (Auto Accident, Fire-Home etc)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MetroReportType getMetroReportType() {
      return (typekey.MetroReportType)__getInternalInterface().getFieldValue(METROREPORTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the MetroTransactionID field.
     * Metro transaction ID - Unique number assigned to this order
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMetroTransactionID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(METROTRANSACTIONID_PROP.get());
    }
    
    /**
     * Gets the value of the Name field.
     * Name of the metro report
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    /**
     * Gets the value of the OfficerName field.
     * The name of officer
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOfficerName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OFFICERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the Precinct field.
     * Precinct, troop number or name/badge # of officer
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPrecinct() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PRECINCT_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReceivedDate field.
     * The date received the report
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReceivedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RECEIVEDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ReportNumber field.
     * Report Number assigned by issuing Police-Fire Agency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReportNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REPORTNUMBER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the SentDate field.
     * The date sent out the order file
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSentDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SENTDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     * Status of the Official Report
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.MetroReportStatus getStatus() {
      return (typekey.MetroReportStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the ThirdPartyVehicle field.
     * The third party vehicle associated with this MetroReport, for auto report types.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.VehicleIncident getThirdPartyVehicle() {
      return (entity.VehicleIncident)__getInternalInterface().getFieldValue(THIRDPARTYVEHICLE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getThirdPartyVehicleID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(THIRDPARTYVEHICLE_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     * Timestamp when the object was last updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUser field.
     * User who last updated the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUpdateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the VehicleIncident field.
     * The vehicle associated with this MetroReport, for auto report types.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.VehicleIncident getVehicleIncident() {
      return (entity.VehicleIncident)__getInternalInterface().getFieldValue(VEHICLEINCIDENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getVehicleIncidentID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(VEHICLEINCIDENT_PROP.get());
    }
    
    /**
     * Return true if there is a report document attached to this Metro report, false otherwise.
     * This property should be used in preference to testing the "Doc" property because it works even if
     * a custom IDocumentMetadataSource plugin is used to store the document metadata. The Doc property
     * only works if the document metadata is stored directly in the database
     */
    public boolean hasDocument() {
      return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).hasDocument();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the CreateDeferredActivity field.
     * Flag to indicate if Deferred Activity should be created or not.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCreateDeferredActivity() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CREATEDEFERREDACTIVITY_PROP.get());
    }
    
    /**
     * Gets the value of the CreateHoldActivity field.
     * Flag to indicate if Hold Activity should be created or not.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCreateHoldActivity() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CREATEHOLDACTIVITY_PROP.get());
    }
    
    /**
     * Gets the value of the ForceDuplicate field.
     * Flag to indicate if a metro report should be requested regardless of a duplicate request.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isForceDuplicate() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FORCEDUPLICATE_PROP.get());
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    /**
     * Return true if the workflow has been started for this report and it has been running longer than
     * the "Order Timeout". If the workflow has passed the order timeout and has not yet had a successful
     * reply to the initial order request then it will finish and generate an error activity
     * @return true if the workflow has been started and has been running longer than the order timeout,
     *   false otherwise
     */
    public boolean isPastOrderTimeout() {
      return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).isPastOrderTimeout();
    }
    
    /**
     * Return true if the workflow has been started for this report and it has been running longer than
     * the "Workflow Timeout". If the workflow has passed the workflow timeout and has not yet had a successful
     * reply to the initial workflow request then it will finish and generate an error activity
     * @return true if the workflow has been started and has been running longer than the workflow timeout,
     *   false otherwise
     */
    public boolean isPastWorkflowTimeout() {
      return ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).isPastWorkflowTimeout();
    }
    
    /**
     * 
     * @return True if the object has been retired from active use, false if the
     *         object is active.  Retireable objects are never deleted from a
     *         database table, instead they are retired by setting the retired
     *         column to the same value as the ID of the object.
     */
    public java.lang.Boolean isRetired() {
      return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AgentCity field.
     */
    public void setAgentCity(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(AGENTCITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AgentName field.
     */
    public void setAgentName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(AGENTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AgentState field.
     */
    public void setAgentState(typekey.State value) {
      __getInternalInterface().setFieldValue(AGENTSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateDeferredActivity field.
     */
    public void setCreateDeferredActivity(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CREATEDEFERREDACTIVITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateHoldActivity field.
     */
    public void setCreateHoldActivity(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CREATEHOLDACTIVITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateOfDeath field.
     */
    public void setDateOfDeath(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEOFDEATH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateReported field.
     */
    public void setDateReported(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEREPORTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeceasedContact field.
     */
    public void setDeceasedContact(entity.Contact value) {
      __getInternalInterface().setFieldValue(DECEASEDCONTACT_PROP.get(), value);
    }
    
    public void setDeceasedContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(DECEASEDCONTACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DelayMemoURL field.
     */
    public void setDelayMemoURL(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DELAYMEMOURL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Doc field.
     */
    public void setDoc(entity.Document value) {
      __getInternalInterface().setFieldValue(DOC_PROP.get(), value);
    }
    
    public void setDocID(gw.pl.persistence.core.Key value) {
      setFieldValue(DOC_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DocumentURL field.
     */
    public void setDocumentURL(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DOCUMENTURL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ErrorMessage field.
     */
    public void setErrorMessage(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ERRORMESSAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ForceDuplicate field.
     */
    public void setForceDuplicate(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FORCEDUPLICATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InformationURL field.
     */
    public void setInformationURL(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INFORMATIONURL_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossDescription field.
     */
    public void setLossDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOSSDESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossType field.
     */
    public void setLossType(typekey.LossType value) {
      __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MetroAgency field.
     */
    public void setMetroAgency(typekey.MetroAgencyType value) {
      __getInternalInterface().setFieldValue(METROAGENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MetroControlNumber field.
     */
    public void setMetroControlNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(METROCONTROLNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MetroProcessID field.
     */
    public void setMetroProcessID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(METROPROCESSID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MetroReportType field.
     */
    public void setMetroReportType(typekey.MetroReportType value) {
      __getInternalInterface().setFieldValue(METROREPORTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MetroTransactionID field.
     */
    public void setMetroTransactionID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(METROTRANSACTIONID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the OfficerName field.
     */
    public void setOfficerName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(OFFICERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Precinct field.
     */
    public void setPrecinct(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PRECINCT_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReceivedDate field.
     */
    public void setReceivedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RECEIVEDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReportNumber field.
     */
    public void setReportNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(REPORTNUMBER_PROP.get(), value);
    }
    
    public void setRetired() {
      ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).setRetired();
    }
    
    /**
     * Sets the value of the RetiredValue field.
     */
    public void setRetiredValue(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SentDate field.
     */
    public void setSentDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SENTDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.MetroReportStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ThirdPartyVehicle field.
     */
    public void setThirdPartyVehicle(entity.VehicleIncident value) {
      __getInternalInterface().setFieldValue(THIRDPARTYVEHICLE_PROP.get(), value);
    }
    
    public void setThirdPartyVehicleID(gw.pl.persistence.core.Key value) {
      setFieldValue(THIRDPARTYVEHICLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VehicleIncident field.
     */
    public void setVehicleIncident(entity.VehicleIncident value) {
      __getInternalInterface().setFieldValue(VEHICLEINCIDENT_PROP.get(), value);
    }
    
    public void setVehicleIncidentID(gw.pl.persistence.core.Key value) {
      setFieldValue(VEHICLEINCIDENT_PROP.get(), value);
    }
    
    /**
     * Starts the workflow for this report, which will result in asking the
     * external system for the actual report.  This MetroReport must already
     * have its state = validated when this method is called.  It is an
     * error to call this method twice on the same MetroReport.
     */
    public void startReportFlow() {
      ((gw.cc.claim.entity.MetroReport)__getDelegateManager().getImplementation("gw.cc.claim.entity.MetroReport")).startReportFlow();
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.cc.domain.claim.impl.MetroReportImpl");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.claim.impl.MetroReportImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.claim.impl.MetroReportImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.claim.impl.MetroReportImpl");
    config.put("gw.cc.claim.entity.MetroReport", "com.guidewire.cc.domain.claim.impl.MetroReportImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.MetroReport.class, config);
    com.guidewire._generated.entity.MetroReportInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.MetroReport, com.guidewire._generated.entity.MetroReportInternal>() {
      public java.lang.Object getImplementation(entity.MetroReport bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MetroReportInternal getInternalInterface(entity.MetroReport bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.MetroReport newEmptyInstance() {
        return new entity.MetroReport((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}