package entity;

/**
 * SubroAdverseParty
 * A subrogations Adverse Parties
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SubroAdverseParty.eti;SubroAdverseParty.eix;SubroAdverseParty.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "SubroAdverseParty")
public class SubroAdverseParty extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.SubroAdverseParty> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.SubroAdverseParty>("entity.SubroAdverseParty");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ADVERSEPARTY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AdverseParty");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLASSIFICATION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Classification");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPECTEDRECOVERY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpectedRecovery");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FAULT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Fault");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> MAINCONTACTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "MainContactType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NOTERECEIVED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NoteReceived");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NOTESENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NoteSent");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCHEDULERECOVERY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ScheduleRecovery");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SCHEDULERECOVERYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ScheduleRecoveryType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SCHEDULEDPAYMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ScheduledPayments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STRATEGY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Strategy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBROGOVERNMENTINVOLVED_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SubroGovernmentInvolved");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> SUBROGATIONSUMMARY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "SubrogationSummary");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.SubroAdversePartyInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public SubroAdverseParty()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public SubroAdverseParty(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected SubroAdverseParty(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.SubroAdversePartyInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.SubroAdversePartyInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the ScheduledPayments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToScheduledPayments(entity.SubroPaymentSchedule element) {
    __getInternalInterface().addArrayElement(SCHEDULEDPAYMENTS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the AdverseParty field.
   * The Adverse Party related to the Subrogation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getAdverseParty() {
    return (entity.Contact)__getInternalInterface().getFieldValue(ADVERSEPARTY_PROP.get());
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
   * 
   * @return The related claim.
   */
  public entity.Claim getClaim() {
    return ((gw.cc.claim.entity.SubroAdverseParty)__getDelegateManager().getImplementation("gw.cc.claim.entity.SubroAdverseParty")).getClaim();
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   * Claim number at insurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the Classification field.
   * Classification of the Adverse Party
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubroClassification getClassification() {
    return (typekey.SubroClassification)__getInternalInterface().getFieldValue(CLASSIFICATION_PROP.get());
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
   * Gets the value of the ExpectedRecovery field.
   * Expected recovery percentage from this Contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExpectedRecovery() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(EXPECTEDRECOVERY_PROP.get());
  }
  
  /**
   * Gets the value of the Fault field.
   * Contact's probable percentage of fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFault() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FAULT_PROP.get());
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
   * Gets the value of the MainContactType field.
   * Relationship of the main contact to the Adverse Party
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getMainContactType() {
    return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(MAINCONTACTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the NoteReceived field.
   * Date the prommisory note was received
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNoteReceived() {
    return (java.util.Date)__getInternalInterface().getFieldValue(NOTERECEIVED_PROP.get());
  }
  
  /**
   * Gets the value of the NoteSent field.
   * Date the prommisory note was sent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNoteSent() {
    return (java.util.Date)__getInternalInterface().getFieldValue(NOTESENT_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyNumber field.
   * Policy number at insurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
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
   * Gets the value of the ScheduleRecoveryType field.
   * Type of scheduled recovery such as Promissory Note
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubroSchedRecoveryType getScheduleRecoveryType() {
    return (typekey.SubroSchedRecoveryType)__getInternalInterface().getFieldValue(SCHEDULERECOVERYTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the ScheduledPayments field.
   * A list of applicable PaymentPlans for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubroPaymentSchedule[] getScheduledPayments() {
    return (entity.SubroPaymentSchedule[])__getInternalInterface().getFieldValue(SCHEDULEDPAYMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the Strategy field.
   * Strategy for the Adverse Party
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubroStrategy getStrategy() {
    return (typekey.SubroStrategy)__getInternalInterface().getFieldValue(STRATEGY_PROP.get());
  }
  
  /**
   * Gets the value of the SubroGovernmentInvolved field.
   * For Subrogation - Government entity involved as an Adverse Party
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubroGovernmentInvolved getSubroGovernmentInvolved() {
    return (typekey.SubroGovernmentInvolved)__getInternalInterface().getFieldValue(SUBROGOVERNMENTINVOLVED_PROP.get());
  }
  
  /**
   * Gets the value of the SubrogationSummary field.
   * Related Subrogation Summary
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary getSubrogationSummary() {
    return (entity.SubrogationSummary)__getInternalInterface().getFieldValue(SUBROGATIONSUMMARY_PROP.get());
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
   * Gets the value of the ScheduleRecovery field.
   * If the adverse party has agreed to make payments aka Subro Recovery
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isScheduleRecovery() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SCHEDULERECOVERY_PROP.get());
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
   * Removes the given element from the ScheduledPayments array. This is achieved by marking the element for removal.
   */
  public void removeFromScheduledPayments(entity.SubroPaymentSchedule element) {
    __getInternalInterface().removeArrayElement(SCHEDULEDPAYMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ScheduledPayments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromScheduledPayments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(SCHEDULEDPAYMENTS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AdverseParty field.
   */
  public void setAdverseParty(entity.Contact value) {
    __getInternalInterface().setFieldValue(ADVERSEPARTY_PROP.get(), value);
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
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Classification field.
   */
  public void setClassification(typekey.SubroClassification value) {
    __getInternalInterface().setFieldValue(CLASSIFICATION_PROP.get(), value);
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
   * Sets the value of the ExpectedRecovery field.
   */
  public void setExpectedRecovery(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(EXPECTEDRECOVERY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Fault field.
   */
  public void setFault(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FAULT_PROP.get(), value);
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
   * Sets the value of the MainContactType field.
   */
  public void setMainContactType(typekey.PersonRelationType value) {
    __getInternalInterface().setFieldValue(MAINCONTACTTYPE_PROP.get(), value);
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
   * Sets the value of the NoteReceived field.
   */
  public void setNoteReceived(java.util.Date value) {
    __getInternalInterface().setFieldValue(NOTERECEIVED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NoteSent field.
   */
  public void setNoteSent(java.util.Date value) {
    __getInternalInterface().setFieldValue(NOTESENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScheduleRecovery field.
   */
  public void setScheduleRecovery(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SCHEDULERECOVERY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScheduleRecoveryType field.
   */
  public void setScheduleRecoveryType(typekey.SubroSchedRecoveryType value) {
    __getInternalInterface().setFieldValue(SCHEDULERECOVERYTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScheduledPayments field.
   */
  public void setScheduledPayments(entity.SubroPaymentSchedule[] value) {
    __getInternalInterface().setFieldValue(SCHEDULEDPAYMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Strategy field.
   */
  public void setStrategy(typekey.SubroStrategy value) {
    __getInternalInterface().setFieldValue(STRATEGY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubroGovernmentInvolved field.
   */
  public void setSubroGovernmentInvolved(typekey.SubroGovernmentInvolved value) {
    __getInternalInterface().setFieldValue(SUBROGOVERNMENTINVOLVED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubrogationSummary field.
   */
  public void setSubrogationSummary(entity.SubrogationSummary value) {
    __getInternalInterface().setFieldValue(SUBROGATIONSUMMARY_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.SubroAdversePartyInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.SubroAdverseParty.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the ScheduledPayments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToScheduledPayments(entity.SubroPaymentSchedule element) {
      __getInternalInterface().addArrayElement(SCHEDULEDPAYMENTS_PROP.get(), element);
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
     * Gets the value of the AdverseParty field.
     * The Adverse Party related to the Subrogation
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getAdverseParty() {
      return (entity.Contact)__getInternalInterface().getFieldValue(ADVERSEPARTY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAdversePartyID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ADVERSEPARTY_PROP.get());
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
     * 
     * @return The related claim.
     */
    public entity.Claim getClaim() {
      return ((gw.cc.claim.entity.SubroAdverseParty)__getDelegateManager().getImplementation("gw.cc.claim.entity.SubroAdverseParty")).getClaim();
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     * Claim number at insurer.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the Classification field.
     * Classification of the Adverse Party
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SubroClassification getClassification() {
      return (typekey.SubroClassification)__getInternalInterface().getFieldValue(CLASSIFICATION_PROP.get());
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
     * Gets the value of the ExpectedRecovery field.
     * Expected recovery percentage from this Contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getExpectedRecovery() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(EXPECTEDRECOVERY_PROP.get());
    }
    
    /**
     * Gets the value of the Fault field.
     * Contact's probable percentage of fault.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFault() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FAULT_PROP.get());
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
     * Gets the value of the MainContactType field.
     * Relationship of the main contact to the Adverse Party
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PersonRelationType getMainContactType() {
      return (typekey.PersonRelationType)__getInternalInterface().getFieldValue(MAINCONTACTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the NoteReceived field.
     * Date the prommisory note was received
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getNoteReceived() {
      return (java.util.Date)__getInternalInterface().getFieldValue(NOTERECEIVED_PROP.get());
    }
    
    /**
     * Gets the value of the NoteSent field.
     * Date the prommisory note was sent
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getNoteSent() {
      return (java.util.Date)__getInternalInterface().getFieldValue(NOTESENT_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     * Policy number at insurer.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the ScheduleRecoveryType field.
     * Type of scheduled recovery such as Promissory Note
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SubroSchedRecoveryType getScheduleRecoveryType() {
      return (typekey.SubroSchedRecoveryType)__getInternalInterface().getFieldValue(SCHEDULERECOVERYTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ScheduledPayments field.
     * A list of applicable PaymentPlans for this claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SubroPaymentSchedule[] getScheduledPayments() {
      return (entity.SubroPaymentSchedule[])__getInternalInterface().getFieldValue(SCHEDULEDPAYMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the Strategy field.
     * Strategy for the Adverse Party
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SubroStrategy getStrategy() {
      return (typekey.SubroStrategy)__getInternalInterface().getFieldValue(STRATEGY_PROP.get());
    }
    
    /**
     * Gets the value of the SubroGovernmentInvolved field.
     * For Subrogation - Government entity involved as an Adverse Party
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SubroGovernmentInvolved getSubroGovernmentInvolved() {
      return (typekey.SubroGovernmentInvolved)__getInternalInterface().getFieldValue(SUBROGOVERNMENTINVOLVED_PROP.get());
    }
    
    /**
     * Gets the value of the SubrogationSummary field.
     * Related Subrogation Summary
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SubrogationSummary getSubrogationSummary() {
      return (entity.SubrogationSummary)__getInternalInterface().getFieldValue(SUBROGATIONSUMMARY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getSubrogationSummaryID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SUBROGATIONSUMMARY_PROP.get());
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
    
    /**
     * Gets the value of the ScheduleRecovery field.
     * If the adverse party has agreed to make payments aka Subro Recovery
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isScheduleRecovery() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SCHEDULERECOVERY_PROP.get());
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
     * Removes the given element from the ScheduledPayments array. This is achieved by marking the element for removal.
     */
    public void removeFromScheduledPayments(entity.SubroPaymentSchedule element) {
      __getInternalInterface().removeArrayElement(SCHEDULEDPAYMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ScheduledPayments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromScheduledPayments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SCHEDULEDPAYMENTS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AdverseParty field.
     */
    public void setAdverseParty(entity.Contact value) {
      __getInternalInterface().setFieldValue(ADVERSEPARTY_PROP.get(), value);
    }
    
    public void setAdversePartyID(gw.pl.persistence.core.Key value) {
      setFieldValue(ADVERSEPARTY_PROP.get(), value);
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
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Classification field.
     */
    public void setClassification(typekey.SubroClassification value) {
      __getInternalInterface().setFieldValue(CLASSIFICATION_PROP.get(), value);
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
     * Sets the value of the ExpectedRecovery field.
     */
    public void setExpectedRecovery(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(EXPECTEDRECOVERY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Fault field.
     */
    public void setFault(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FAULT_PROP.get(), value);
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
     * Sets the value of the MainContactType field.
     */
    public void setMainContactType(typekey.PersonRelationType value) {
      __getInternalInterface().setFieldValue(MAINCONTACTTYPE_PROP.get(), value);
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
     * Sets the value of the NoteReceived field.
     */
    public void setNoteReceived(java.util.Date value) {
      __getInternalInterface().setFieldValue(NOTERECEIVED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NoteSent field.
     */
    public void setNoteSent(java.util.Date value) {
      __getInternalInterface().setFieldValue(NOTESENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
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
     * Sets the value of the ScheduleRecovery field.
     */
    public void setScheduleRecovery(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SCHEDULERECOVERY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ScheduleRecoveryType field.
     */
    public void setScheduleRecoveryType(typekey.SubroSchedRecoveryType value) {
      __getInternalInterface().setFieldValue(SCHEDULERECOVERYTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ScheduledPayments field.
     */
    public void setScheduledPayments(entity.SubroPaymentSchedule[] value) {
      __getInternalInterface().setFieldValue(SCHEDULEDPAYMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Strategy field.
     */
    public void setStrategy(typekey.SubroStrategy value) {
      __getInternalInterface().setFieldValue(STRATEGY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubroGovernmentInvolved field.
     */
    public void setSubroGovernmentInvolved(typekey.SubroGovernmentInvolved value) {
      __getInternalInterface().setFieldValue(SUBROGOVERNMENTINVOLVED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubrogationSummary field.
     */
    public void setSubrogationSummary(entity.SubrogationSummary value) {
      __getInternalInterface().setFieldValue(SUBROGATIONSUMMARY_PROP.get(), value);
    }
    
    public void setSubrogationSummaryID(gw.pl.persistence.core.Key value) {
      setFieldValue(SUBROGATIONSUMMARY_PROP.get(), value);
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
    config.put("gw.cc.claim.entity.SubroAdverseParty", "com.guidewire.cc.domain.claim.impl.SubroAdversePartyImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.SubroAdverseParty.class, config);
    com.guidewire._generated.entity.SubroAdversePartyInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.SubroAdverseParty, com.guidewire._generated.entity.SubroAdversePartyInternal>() {
      public java.lang.Object getImplementation(entity.SubroAdverseParty bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.SubroAdversePartyInternal getInternalInterface(entity.SubroAdverseParty bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.SubroAdverseParty newEmptyInstance() {
        return new entity.SubroAdverseParty((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}