package entity;

/**
 * TripSegment
 * Used to track the original and changed segments on the travel schedule for the insured/claimant
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripSegment.eti;TripSegment.eix;TripSegment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TripSegment")
public class TripSegment extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.TripSegmentDelegate, entity.TripExpenseCancellationDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TripSegment> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TripSegment>("entity.TripSegment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ADDNLTRIPSEGMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "AddnlTripSegments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AGENTFEES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AgentFees");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ASSESSMENT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Assessment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CANCELONLY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CancelOnly");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CANCELLATIONFEES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CancellationFees");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CARRIERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CarrierName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CARRIERNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CarrierNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OTHERFEES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OtherFees");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAIDAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PaidAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PORTOFDISEMBARKATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PortOfDisembarkation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PORTOFEMBARKATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PortOfEmbarkation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PORTOFTRANSIT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PortOfTransit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REASONFORCANCELLATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReasonForCancellation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REASONFORDENIAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReasonForDenial");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TRANSPORTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TransportType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TRIPINCIDENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TripIncident");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TripSegmentInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TripSegment()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TripSegment(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TripSegment(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TripSegmentInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TripSegmentInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the AddnlTripSegments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAddnlTripSegments(entity.AddnlTripSegment element) {
    __getInternalInterface().addArrayElement(ADDNLTRIPSEGMENTS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the AddnlTripSegments field.
   * All new/additional trip segments associated with this segment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AddnlTripSegment[] getAddnlTripSegments() {
    return (entity.AddnlTripSegment[])__getInternalInterface().getFieldValue(ADDNLTRIPSEGMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the AgentFees field.
   * Agent fees incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAgentFees() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AGENTFEES_PROP.get());
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
  
  /**
   * Gets the value of the Assessment field.
   * Approve, deny or review an expense
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssessmentAction getAssessment() {
    return (typekey.AssessmentAction)__getInternalInterface().getFieldValue(ASSESSMENT_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CancellationFees field.
   * Cancellation fees incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getCancellationFees() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(CANCELLATIONFEES_PROP.get());
  }
  
  /**
   * Gets the value of the CarrierName field.
   * Name of the airline, cruise ship, bus etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCarrierName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CARRIERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the CarrierNumber field.
   * Flight, ship, bus number etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCarrierNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CARRIERNUMBER_PROP.get());
  }
  
  /**
   * The currency related to this tripSegment.
   * @return claim's currency
   */
  public typekey.Currency getClaimCurrency() {
    return ((gw.cc.exposure.entity.TripSegment)__getDelegateManager().getImplementation("gw.cc.exposure.entity.TripSegment")).getClaimCurrency();
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
   * Gets the value of the EndDate field.
   * The ending date/time for this expense
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDDATE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
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
   * Gets the value of the OtherFees field.
   * Other fees incurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOtherFees() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OTHERFEES_PROP.get());
  }
  
  /**
   * Gets the value of the PaidAmount field.
   * Original invoiced amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPaidAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(PAIDAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the PortOfDisembarkation field.
   * Arrival airport, port, city etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPortOfDisembarkation() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PORTOFDISEMBARKATION_PROP.get());
  }
  
  /**
   * Gets the value of the PortOfEmbarkation field.
   * Boarding airport, port, city etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPortOfEmbarkation() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PORTOFEMBARKATION_PROP.get());
  }
  
  /**
   * Gets the value of the PortOfTransit field.
   * Transit airports, ports, cities etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPortOfTransit() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PORTOFTRANSIT_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReasonForCancellation field.
   * Reason for cancellation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReasonForCancellation() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REASONFORCANCELLATION_PROP.get());
  }
  
  /**
   * Gets the value of the ReasonForDenial field.
   * Reasons for denial
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReasonForDenial() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REASONFORDENIAL_PROP.get());
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
   * Gets the value of the StartDate field.
   * The starting date/time for this expense
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATE_PROP.get());
  }
  
  /**
   * Gets the value of the TransportType field.
   * Type of transport, airline, cruise ship, taxi etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransportType getTransportType() {
    return (typekey.TransportType)__getInternalInterface().getFieldValue(TRANSPORTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TripIncident field.
   * Incident this schedule is related to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TripIncident getTripIncident() {
    return (entity.TripIncident)__getInternalInterface().getFieldValue(TRIPINCIDENT_PROP.get());
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
   * Gets the value of the CancelOnly field.
   * Indicates if the expense is cancelled without the need for additional arrangements
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCancelOnly() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CANCELONLY_PROP.get());
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
   * Removes the given element from the AddnlTripSegments array. This is achieved by marking the element for removal.
   */
  public void removeFromAddnlTripSegments(entity.AddnlTripSegment element) {
    __getInternalInterface().removeArrayElement(ADDNLTRIPSEGMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the AddnlTripSegments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAddnlTripSegments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ADDNLTRIPSEGMENTS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AddnlTripSegments field.
   */
  public void setAddnlTripSegments(entity.AddnlTripSegment[] value) {
    __getInternalInterface().setFieldValue(ADDNLTRIPSEGMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AgentFees field.
   */
  public void setAgentFees(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(AGENTFEES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Assessment field.
   */
  public void setAssessment(typekey.AssessmentAction value) {
    __getInternalInterface().setFieldValue(ASSESSMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CancelOnly field.
   */
  public void setCancelOnly(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CANCELONLY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CancellationFees field.
   */
  public void setCancellationFees(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(CANCELLATIONFEES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CarrierName field.
   */
  public void setCarrierName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CARRIERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CarrierNumber field.
   */
  public void setCarrierNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CARRIERNUMBER_PROP.get(), value);
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
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
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
   * Sets the value of the OtherFees field.
   */
  public void setOtherFees(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(OTHERFEES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaidAmount field.
   */
  public void setPaidAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(PAIDAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PortOfDisembarkation field.
   */
  public void setPortOfDisembarkation(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PORTOFDISEMBARKATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PortOfEmbarkation field.
   */
  public void setPortOfEmbarkation(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PORTOFEMBARKATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PortOfTransit field.
   */
  public void setPortOfTransit(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PORTOFTRANSIT_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReasonForCancellation field.
   */
  public void setReasonForCancellation(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(REASONFORCANCELLATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReasonForDenial field.
   */
  public void setReasonForDenial(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(REASONFORDENIAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TransportType field.
   */
  public void setTransportType(typekey.TransportType value) {
    __getInternalInterface().setFieldValue(TRANSPORTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TripIncident field.
   */
  public void setTripIncident(entity.TripIncident value) {
    __getInternalInterface().setFieldValue(TRIPINCIDENT_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TripSegmentInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TripSegment.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the AddnlTripSegments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAddnlTripSegments(entity.AddnlTripSegment element) {
      __getInternalInterface().addArrayElement(ADDNLTRIPSEGMENTS_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
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
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the AddnlTripSegments field.
     * All new/additional trip segments associated with this segment
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AddnlTripSegment[] getAddnlTripSegments() {
      return (entity.AddnlTripSegment[])__getInternalInterface().getFieldValue(ADDNLTRIPSEGMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the AgentFees field.
     * Agent fees incurred
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getAgentFees() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AGENTFEES_PROP.get());
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    /**
     * Gets the value of the Assessment field.
     * Approve, deny or review an expense
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AssessmentAction getAssessment() {
      return (typekey.AssessmentAction)__getInternalInterface().getFieldValue(ASSESSMENT_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CancellationFees field.
     * Cancellation fees incurred
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getCancellationFees() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(CANCELLATIONFEES_PROP.get());
    }
    
    /**
     * Gets the value of the CarrierName field.
     * Name of the airline, cruise ship, bus etc
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCarrierName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CARRIERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the CarrierNumber field.
     * Flight, ship, bus number etc
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCarrierNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CARRIERNUMBER_PROP.get());
    }
    
    /**
     * The currency related to this tripSegment.
     * @return claim's currency
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.exposure.entity.TripSegment)__getDelegateManager().getImplementation("gw.cc.exposure.entity.TripSegment")).getClaimCurrency();
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
     * Gets the value of the EndDate field.
     * The ending date/time for this expense
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDDATE_PROP.get());
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
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the OtherFees field.
     * Other fees incurred
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getOtherFees() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OTHERFEES_PROP.get());
    }
    
    /**
     * Gets the value of the PaidAmount field.
     * Original invoiced amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getPaidAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(PAIDAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the PortOfDisembarkation field.
     * Arrival airport, port, city etc
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPortOfDisembarkation() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PORTOFDISEMBARKATION_PROP.get());
    }
    
    /**
     * Gets the value of the PortOfEmbarkation field.
     * Boarding airport, port, city etc
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPortOfEmbarkation() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PORTOFEMBARKATION_PROP.get());
    }
    
    /**
     * Gets the value of the PortOfTransit field.
     * Transit airports, ports, cities etc
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPortOfTransit() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PORTOFTRANSIT_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReasonForCancellation field.
     * Reason for cancellation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReasonForCancellation() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REASONFORCANCELLATION_PROP.get());
    }
    
    /**
     * Gets the value of the ReasonForDenial field.
     * Reasons for denial
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReasonForDenial() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REASONFORDENIAL_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the StartDate field.
     * The starting date/time for this expense
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTDATE_PROP.get());
    }
    
    /**
     * Gets the value of the TransportType field.
     * Type of transport, airline, cruise ship, taxi etc
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TransportType getTransportType() {
      return (typekey.TransportType)__getInternalInterface().getFieldValue(TRANSPORTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TripIncident field.
     * Incident this schedule is related to
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TripIncident getTripIncident() {
      return (entity.TripIncident)__getInternalInterface().getFieldValue(TRIPINCIDENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTripIncidentID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TRIPINCIDENT_PROP.get());
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
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the CancelOnly field.
     * Indicates if the expense is cancelled without the need for additional arrangements
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCancelOnly() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CANCELONLY_PROP.get());
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
    
    /**
     * Removes the given element from the AddnlTripSegments array. This is achieved by marking the element for removal.
     */
    public void removeFromAddnlTripSegments(entity.AddnlTripSegment element) {
      __getInternalInterface().removeArrayElement(ADDNLTRIPSEGMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the AddnlTripSegments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAddnlTripSegments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ADDNLTRIPSEGMENTS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AddnlTripSegments field.
     */
    public void setAddnlTripSegments(entity.AddnlTripSegment[] value) {
      __getInternalInterface().setFieldValue(ADDNLTRIPSEGMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AgentFees field.
     */
    public void setAgentFees(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(AGENTFEES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Assessment field.
     */
    public void setAssessment(typekey.AssessmentAction value) {
      __getInternalInterface().setFieldValue(ASSESSMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CancelOnly field.
     */
    public void setCancelOnly(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CANCELONLY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CancellationFees field.
     */
    public void setCancellationFees(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(CANCELLATIONFEES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CarrierName field.
     */
    public void setCarrierName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CARRIERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CarrierNumber field.
     */
    public void setCarrierNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CARRIERNUMBER_PROP.get(), value);
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
     * Sets the value of the EndDate field.
     */
    public void setEndDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the OtherFees field.
     */
    public void setOtherFees(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(OTHERFEES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaidAmount field.
     */
    public void setPaidAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(PAIDAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PortOfDisembarkation field.
     */
    public void setPortOfDisembarkation(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PORTOFDISEMBARKATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PortOfEmbarkation field.
     */
    public void setPortOfEmbarkation(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PORTOFEMBARKATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PortOfTransit field.
     */
    public void setPortOfTransit(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PORTOFTRANSIT_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReasonForCancellation field.
     */
    public void setReasonForCancellation(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(REASONFORCANCELLATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReasonForDenial field.
     */
    public void setReasonForDenial(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(REASONFORDENIAL_PROP.get(), value);
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
     * Sets the value of the StartDate field.
     */
    public void setStartDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransportType field.
     */
    public void setTransportType(typekey.TransportType value) {
      __getInternalInterface().setFieldValue(TRANSPORTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TripIncident field.
     */
    public void setTripIncident(entity.TripIncident value) {
      __getInternalInterface().setFieldValue(TRIPINCIDENT_PROP.get(), value);
    }
    
    public void setTripIncidentID(gw.pl.persistence.core.Key value) {
      setFieldValue(TRIPINCIDENT_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.exposure.entity.TripExpenseCancellationDelegate", "com.guidewire.cc.domain.exposure.impl.TripSegmentImpl");
    config.put("gw.cc.exposure.entity.TripExpenseDelegate", "com.guidewire.cc.domain.exposure.impl.TripSegmentImpl");
    config.put("gw.cc.exposure.entity.TripSegment", "com.guidewire.cc.domain.exposure.impl.TripSegmentImpl");
    config.put("gw.cc.exposure.entity.TripSegmentDelegate", "com.guidewire.cc.domain.exposure.impl.TripSegmentDelegateImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TripSegment.class, config);
    com.guidewire._generated.entity.TripSegmentInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TripSegment, com.guidewire._generated.entity.TripSegmentInternal>() {
      public java.lang.Object getImplementation(entity.TripSegment bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TripSegmentInternal getInternalInterface(entity.TripSegment bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TripSegment newEmptyInstance() {
        return new entity.TripSegment((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}