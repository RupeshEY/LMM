package entity;

/**
 * ServiceRequestChange
 * 
 *     An instance of this type records a change to its service request. Properties with names following the "New_" and "_Chg"
 *     naming conventions are populated automatically by ServiceRequest.recordChange.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestChange.eti;ServiceRequestChange.eix;ServiceRequestChange.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ServiceRequestChange")
public class ServiceRequestChange extends com.guidewire.pl.persistence.code.BeanBase implements entity.Editable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ServiceRequestChange> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ServiceRequestChange>("entity.ServiceRequestChange");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPECTEDQUOTECOMPLETIONDATE_CHG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpectedQuoteCompletionDate_Chg");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPECTEDSERVICECOMPLETIONDATE_CHG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpectedServiceCompletionDate_Chg");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INITIATOR_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Initiator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSTRUCTION_CHG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Instruction_Chg");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEW_EXPECTEDQUOTECOMPLETIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "New_ExpectedQuoteCompletionDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEW_EXPECTEDSERVICECOMPLETIONDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "New_ExpectedServiceCompletionDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> NEW_INSTRUCTION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "New_Instruction");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> NEW_PROGRESS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "New_Progress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> NEW_QUOTESTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "New_QuoteStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> OPERATION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Operation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROGRESS_CHG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Progress_Chg");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> QUOTESTATUS_CHG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "QuoteStatus_Chg");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RELATEDSTATEMENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RelatedStatement");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SEQUENCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Sequence");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SERVICEREQUEST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ServiceRequest");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TIMESTAMP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Timestamp");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ServiceRequestChangeInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ServiceRequestChange()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ServiceRequestChange(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ServiceRequestChange(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ServiceRequestChangeInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ServiceRequestChangeInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
   * Gets the value of the Description field.
   * An optional explanation for this change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Initiator field.
   * The user who initiated this change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getInitiator() {
    return (entity.Contact)__getInternalInterface().getFieldValue(INITIATOR_PROP.get());
  }
  
  /**
   * Gets the value of the New_ExpectedQuoteCompletionDate field.
   * The new value of ServiceRequest.ExpectedQuoteCompletionDate, or null if ExpectedQuoteCompletionDate did not change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNew_ExpectedQuoteCompletionDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(NEW_EXPECTEDQUOTECOMPLETIONDATE_PROP.get());
  }
  
  /**
   * Gets the value of the New_ExpectedServiceCompletionDate field.
   * The new value of ServiceRequest.ExpectedServiceCompletionDate, or null if ExpectedServiceCompletionDate did not change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNew_ExpectedServiceCompletionDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(NEW_EXPECTEDSERVICECOMPLETIONDATE_PROP.get());
  }
  
  /**
   * Gets the value of the New_Instruction field.
   * The new value of ServiceRequest.Instruction, or null if Instruction did not change. Note that it is expected that ServiceRequest.Instruction will only start referring to a particular instruction once -- there should be at most one ServiceRequestChange on a ServiceRequest referring to a particular ServiceRequestInstruction with this foreign key.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestInstruction getNew_Instruction() {
    return (entity.ServiceRequestInstruction)__getInternalInterface().getFieldValue(NEW_INSTRUCTION_PROP.get());
  }
  
  /**
   * Gets the value of the New_Progress field.
   * The new value of ServiceRequest.Progress, or null if Progress did not change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestProgress getNew_Progress() {
    return (typekey.ServiceRequestProgress)__getInternalInterface().getFieldValue(NEW_PROGRESS_PROP.get());
  }
  
  /**
   * Gets the value of the New_QuoteStatus field.
   * The new value of ServiceRequest.QuoteStatus, or null if Quote Status did not change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestQuoteStatus getNew_QuoteStatus() {
    return (typekey.ServiceRequestQuoteStatus)__getInternalInterface().getFieldValue(NEW_QUOTESTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the Operation field.
   * The operation performed during this change
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestOperation getOperation() {
    return (typekey.ServiceRequestOperation)__getInternalInterface().getFieldValue(OPERATION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RelatedStatement field.
   * The service request statement that is related to this change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestStatement getRelatedStatement() {
    return (entity.ServiceRequestStatement)__getInternalInterface().getFieldValue(RELATEDSTATEMENT_PROP.get());
  }
  
  /**
   * Gets the value of the Sequence field.
   * The sequence of this change on the ServiceRequest. ServiceRequestChanges are ordered consecutively starting with Sequence of 1.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSequence() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SEQUENCE_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequest field.
   * The related service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest() {
    return (entity.ServiceRequest)__getInternalInterface().getFieldValue(SERVICEREQUEST_PROP.get());
  }
  
  /**
   * Gets the value of the Timestamp field.
   * The time at which this change was applied. This timestamp is stored for informational purposes, but it may be possible for the relative timestamps of two instances to incorrectly or ambiguously indicate the relative order of two instances. For reliable ordering, use the Sequence property instead.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTimestamp() {
    return (java.util.Date)__getInternalInterface().getFieldValue(TIMESTAMP_PROP.get());
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
   * Gets the value of the ExpectedQuoteCompletionDate_Chg field.
   * True if ExpectedQuoteCompletionDate is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExpectedQuoteCompletionDate_Chg() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXPECTEDQUOTECOMPLETIONDATE_CHG_PROP.get());
  }
  
  /**
   * Gets the value of the ExpectedServiceCompletionDate_Chg field.
   * True if ExpectedServiceCompletionDate is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExpectedServiceCompletionDate_Chg() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXPECTEDSERVICECOMPLETIONDATE_CHG_PROP.get());
  }
  
  /**
   * Gets the value of the Instruction_Chg field.
   * True if Instruction is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInstruction_Chg() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INSTRUCTION_CHG_PROP.get());
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
   * Gets the value of the Progress_Chg field.
   * True if Progress is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isProgress_Chg() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PROGRESS_CHG_PROP.get());
  }
  
  /**
   * Gets the value of the QuoteStatus_Chg field.
   * True if Quote Status is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isQuoteStatus_Chg() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(QUOTESTATUS_CHG_PROP.get());
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
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpectedQuoteCompletionDate_Chg field.
   */
  public void setExpectedQuoteCompletionDate_Chg(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EXPECTEDQUOTECOMPLETIONDATE_CHG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpectedServiceCompletionDate_Chg field.
   */
  public void setExpectedServiceCompletionDate_Chg(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EXPECTEDSERVICECOMPLETIONDATE_CHG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Initiator field.
   */
  public void setInitiator(entity.Contact value) {
    __getInternalInterface().setFieldValue(INITIATOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Instruction_Chg field.
   */
  public void setInstruction_Chg(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INSTRUCTION_CHG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the New_ExpectedQuoteCompletionDate field.
   */
  public void setNew_ExpectedQuoteCompletionDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(NEW_EXPECTEDQUOTECOMPLETIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the New_ExpectedServiceCompletionDate field.
   */
  public void setNew_ExpectedServiceCompletionDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(NEW_EXPECTEDSERVICECOMPLETIONDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the New_Instruction field.
   */
  public void setNew_Instruction(entity.ServiceRequestInstruction value) {
    __getInternalInterface().setFieldValue(NEW_INSTRUCTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the New_Progress field.
   */
  public void setNew_Progress(typekey.ServiceRequestProgress value) {
    __getInternalInterface().setFieldValue(NEW_PROGRESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the New_QuoteStatus field.
   */
  public void setNew_QuoteStatus(typekey.ServiceRequestQuoteStatus value) {
    __getInternalInterface().setFieldValue(NEW_QUOTESTATUS_PROP.get(), value);
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
   * Sets the value of the Operation field.
   */
  public void setOperation(typekey.ServiceRequestOperation value) {
    __getInternalInterface().setFieldValue(OPERATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Progress_Chg field.
   */
  public void setProgress_Chg(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PROGRESS_CHG_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the QuoteStatus_Chg field.
   */
  public void setQuoteStatus_Chg(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(QUOTESTATUS_CHG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RelatedStatement field.
   */
  public void setRelatedStatement(entity.ServiceRequestStatement value) {
    __getInternalInterface().setFieldValue(RELATEDSTATEMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Sequence field.
   */
  private void setSequence(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SEQUENCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  private void setServiceRequest(entity.ServiceRequest value) {
    __getInternalInterface().setFieldValue(SERVICEREQUEST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Timestamp field.
   */
  private void setTimestamp(java.util.Date value) {
    __getInternalInterface().setFieldValue(TIMESTAMP_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ServiceRequestChangeInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ServiceRequestChange.this.__getDelegateManager();
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
     * Gets the value of the Description field.
     * An optional explanation for this change.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
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
     * Gets the value of the Initiator field.
     * The user who initiated this change.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getInitiator() {
      return (entity.Contact)__getInternalInterface().getFieldValue(INITIATOR_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInitiatorID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INITIATOR_PROP.get());
    }
    
    /**
     * Gets the value of the New_ExpectedQuoteCompletionDate field.
     * The new value of ServiceRequest.ExpectedQuoteCompletionDate, or null if ExpectedQuoteCompletionDate did not change.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getNew_ExpectedQuoteCompletionDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(NEW_EXPECTEDQUOTECOMPLETIONDATE_PROP.get());
    }
    
    /**
     * Gets the value of the New_ExpectedServiceCompletionDate field.
     * The new value of ServiceRequest.ExpectedServiceCompletionDate, or null if ExpectedServiceCompletionDate did not change.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getNew_ExpectedServiceCompletionDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(NEW_EXPECTEDSERVICECOMPLETIONDATE_PROP.get());
    }
    
    /**
     * Gets the value of the New_Instruction field.
     * The new value of ServiceRequest.Instruction, or null if Instruction did not change. Note that it is expected that ServiceRequest.Instruction will only start referring to a particular instruction once -- there should be at most one ServiceRequestChange on a ServiceRequest referring to a particular ServiceRequestInstruction with this foreign key.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequestInstruction getNew_Instruction() {
      return (entity.ServiceRequestInstruction)__getInternalInterface().getFieldValue(NEW_INSTRUCTION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getNew_InstructionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(NEW_INSTRUCTION_PROP.get());
    }
    
    /**
     * Gets the value of the New_Progress field.
     * The new value of ServiceRequest.Progress, or null if Progress did not change.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestProgress getNew_Progress() {
      return (typekey.ServiceRequestProgress)__getInternalInterface().getFieldValue(NEW_PROGRESS_PROP.get());
    }
    
    /**
     * Gets the value of the New_QuoteStatus field.
     * The new value of ServiceRequest.QuoteStatus, or null if Quote Status did not change.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestQuoteStatus getNew_QuoteStatus() {
      return (typekey.ServiceRequestQuoteStatus)__getInternalInterface().getFieldValue(NEW_QUOTESTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Operation field.
     * The operation performed during this change
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestOperation getOperation() {
      return (typekey.ServiceRequestOperation)__getInternalInterface().getFieldValue(OPERATION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RelatedStatement field.
     * The service request statement that is related to this change.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequestStatement getRelatedStatement() {
      return (entity.ServiceRequestStatement)__getInternalInterface().getFieldValue(RELATEDSTATEMENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRelatedStatementID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RELATEDSTATEMENT_PROP.get());
    }
    
    /**
     * Gets the value of the Sequence field.
     * The sequence of this change on the ServiceRequest. ServiceRequestChanges are ordered consecutively starting with Sequence of 1.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSequence() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SEQUENCE_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequest field.
     * The related service request.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequest getServiceRequest() {
      return (entity.ServiceRequest)__getInternalInterface().getFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getServiceRequestID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    /**
     * Gets the value of the Timestamp field.
     * The time at which this change was applied. This timestamp is stored for informational purposes, but it may be possible for the relative timestamps of two instances to incorrectly or ambiguously indicate the relative order of two instances. For reliable ordering, use the Sequence property instead.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getTimestamp() {
      return (java.util.Date)__getInternalInterface().getFieldValue(TIMESTAMP_PROP.get());
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
     * Gets the value of the ExpectedQuoteCompletionDate_Chg field.
     * True if ExpectedQuoteCompletionDate is changing.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isExpectedQuoteCompletionDate_Chg() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXPECTEDQUOTECOMPLETIONDATE_CHG_PROP.get());
    }
    
    /**
     * Gets the value of the ExpectedServiceCompletionDate_Chg field.
     * True if ExpectedServiceCompletionDate is changing.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isExpectedServiceCompletionDate_Chg() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXPECTEDSERVICECOMPLETIONDATE_CHG_PROP.get());
    }
    
    /**
     * Gets the value of the Instruction_Chg field.
     * True if Instruction is changing.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isInstruction_Chg() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INSTRUCTION_CHG_PROP.get());
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
     * Gets the value of the Progress_Chg field.
     * True if Progress is changing.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isProgress_Chg() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PROGRESS_CHG_PROP.get());
    }
    
    /**
     * Gets the value of the QuoteStatus_Chg field.
     * True if Quote Status is changing.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isQuoteStatus_Chg() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(QUOTESTATUS_CHG_PROP.get());
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
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpectedQuoteCompletionDate_Chg field.
     */
    public void setExpectedQuoteCompletionDate_Chg(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EXPECTEDQUOTECOMPLETIONDATE_CHG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpectedServiceCompletionDate_Chg field.
     */
    public void setExpectedServiceCompletionDate_Chg(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EXPECTEDSERVICECOMPLETIONDATE_CHG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Initiator field.
     */
    public void setInitiator(entity.Contact value) {
      __getInternalInterface().setFieldValue(INITIATOR_PROP.get(), value);
    }
    
    public void setInitiatorID(gw.pl.persistence.core.Key value) {
      setFieldValue(INITIATOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Instruction_Chg field.
     */
    public void setInstruction_Chg(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INSTRUCTION_CHG_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the New_ExpectedQuoteCompletionDate field.
     */
    public void setNew_ExpectedQuoteCompletionDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(NEW_EXPECTEDQUOTECOMPLETIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the New_ExpectedServiceCompletionDate field.
     */
    public void setNew_ExpectedServiceCompletionDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(NEW_EXPECTEDSERVICECOMPLETIONDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the New_Instruction field.
     */
    public void setNew_Instruction(entity.ServiceRequestInstruction value) {
      __getInternalInterface().setFieldValue(NEW_INSTRUCTION_PROP.get(), value);
    }
    
    public void setNew_InstructionID(gw.pl.persistence.core.Key value) {
      setFieldValue(NEW_INSTRUCTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the New_Progress field.
     */
    public void setNew_Progress(typekey.ServiceRequestProgress value) {
      __getInternalInterface().setFieldValue(NEW_PROGRESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the New_QuoteStatus field.
     */
    public void setNew_QuoteStatus(typekey.ServiceRequestQuoteStatus value) {
      __getInternalInterface().setFieldValue(NEW_QUOTESTATUS_PROP.get(), value);
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
     * Sets the value of the Operation field.
     */
    public void setOperation(typekey.ServiceRequestOperation value) {
      __getInternalInterface().setFieldValue(OPERATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Progress_Chg field.
     */
    public void setProgress_Chg(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PROGRESS_CHG_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the QuoteStatus_Chg field.
     */
    public void setQuoteStatus_Chg(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(QUOTESTATUS_CHG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RelatedStatement field.
     */
    public void setRelatedStatement(entity.ServiceRequestStatement value) {
      __getInternalInterface().setFieldValue(RELATEDSTATEMENT_PROP.get(), value);
    }
    
    public void setRelatedStatementID(gw.pl.persistence.core.Key value) {
      setFieldValue(RELATEDSTATEMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Sequence field.
     */
    public void setSequence(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SEQUENCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceRequest field.
     */
    public void setServiceRequest(entity.ServiceRequest value) {
      __getInternalInterface().setFieldValue(SERVICEREQUEST_PROP.get(), value);
    }
    
    public void setServiceRequestID(gw.pl.persistence.core.Key value) {
      setFieldValue(SERVICEREQUEST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Timestamp field.
     */
    public void setTimestamp(java.util.Date value) {
      __getInternalInterface().setFieldValue(TIMESTAMP_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.vendormanagement.impl.ServiceRequestChangeImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.vendormanagement.impl.ServiceRequestChangeImpl");
    config.put("gw.cc.vendormanagement.entity.ServiceRequestChange", "com.guidewire.cc.domain.vendormanagement.impl.ServiceRequestChangeImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ServiceRequestChange.class, config);
    com.guidewire._generated.entity.ServiceRequestChangeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ServiceRequestChange, com.guidewire._generated.entity.ServiceRequestChangeInternal>() {
      public java.lang.Object getImplementation(entity.ServiceRequestChange bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ServiceRequestChangeInternal getInternalInterface(entity.ServiceRequestChange bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ServiceRequestChange newEmptyInstance() {
        return new entity.ServiceRequestChange((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}