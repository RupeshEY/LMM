package entity;

/**
 * ServiceRequestInvoice
 * An invoice received from a specialist for a Service Request.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestInvoice.eti;ServiceRequestInvoice.eix;ServiceRequestInvoice.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ServiceRequestInvoice")
public class ServiceRequestInvoice extends entity.ServiceRequestStatement implements entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ServiceRequestInvoice> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ServiceRequestInvoice>("entity.ServiceRequestInvoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CHECK_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Check");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PAIDBY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PaidBy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYMENTDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PaymentDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ServiceRequestInvoice()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ServiceRequestInvoice(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ServiceRequestInvoice(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ServiceRequestInvoiceInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ServiceRequestInvoiceInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ServiceRequestInvoiceInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the Check field.
   * The check that paid this invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check getCheck() {
    return (entity.Check)__getInternalInterface().getFieldValue(CHECK_PROP.get());
  }
  
  /**
   * Gets the value of the PaidBy field.
   * The user who paid this invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getPaidBy() {
    return (entity.User)__getInternalInterface().getFieldValue(PAIDBY_PROP.get());
  }
  
  /**
   * Gets the value of the PaymentDate field.
   * The time at which this invoice was paid.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPaymentDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(PAYMENTDATE_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   * The current invoice status
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestInvoiceStatus getStatus() {
    return (typekey.ServiceRequestInvoiceStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Sets the value of the Check field.
   */
  public void setCheck(entity.Check value) {
    __getInternalInterface().setFieldValue(CHECK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaidBy field.
   */
  public void setPaidBy(entity.User value) {
    __getInternalInterface().setFieldValue(PAIDBY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaymentDate field.
   */
  public void setPaymentDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(PAYMENTDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.ServiceRequestInvoiceStatus value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ServiceRequestInvoiceInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ServiceRequestInvoice.this.__getDelegateManager();
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
    
    /**
     * Adds the given element to the LineItems array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToLineItems(entity.ServiceRequestStatementLineItem element) {
      __getInternalInterface().addArrayElement(LINEITEMS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the StatementDocumentLinks array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToStatementDocumentLinks(entity.ServiceRequestStatementDocumentLink element) {
      __getInternalInterface().addArrayElement(STATEMENTDOCUMENTLINKS_PROP.get(), element);
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
     * Returns the sum of the amounts of all Line items on this statement
     * @return the total amount
     */
    public gw.api.financials.CurrencyAmount getAmount() {
      return ((gw.cc.vendormanagement.entity.ServiceRequestStatement)__getDelegateManager().getImplementation("gw.cc.vendormanagement.entity.ServiceRequestStatement")).getAmount();
    }
    
    /**
     * Gets the value of the ApprovalDate field.
     * The time at which this statement was approved.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getApprovalDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(APPROVALDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ApprovedBy field.
     * The user who approved this statement.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getApprovedBy() {
      return (entity.User)__getInternalInterface().getFieldValue(APPROVEDBY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getApprovedByID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(APPROVEDBY_PROP.get());
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
     * Gets the value of the Check field.
     * The check that paid this invoice.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Check getCheck() {
      return (entity.Check)__getInternalInterface().getFieldValue(CHECK_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCheckID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CHECK_PROP.get());
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
     * Gets the value of the DeclinedReason field.
     * The reason the statement was declined. When the state changes this value is recalculated, as the previous value not longer makes sense.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDeclinedReason() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DECLINEDREASON_PROP.get());
    }
    
    /**
     * Gets the value of the Description field.
     * The description for the statement
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Return the list of documents linked to the statement that the current user has permission to view
     * @return list of documents linked to the statement
     */
    public java.util.Collection<entity.Document> getDocuments() {
      return ((gw.cc.vendormanagement.entity.ServiceRequestStatement)__getDelegateManager().getImplementation("gw.cc.vendormanagement.entity.ServiceRequestStatement")).getDocuments();
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
     * Gets the value of the LineItems field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequestStatementLineItem[] getLineItems() {
      return (entity.ServiceRequestStatementLineItem[])__getInternalInterface().getFieldValue(LINEITEMS_PROP.get());
    }
    
    /**
     * Return the ServiceRequestStatementDocumentLink on this ServiceRequestStatement that links to the given Document.
     * @param document to match
     * @return the matching ServiceRequestStatementDocumentLink
     */
    public entity.ServiceRequestStatementDocumentLink getMatchingServiceRequestStatementDocumentLink(entity.Document document) {
      return ((gw.cc.vendormanagement.entity.ServiceRequestStatement)__getDelegateManager().getImplementation("gw.cc.vendormanagement.entity.ServiceRequestStatement")).getMatchingServiceRequestStatementDocumentLink(document);
    }
    
    /**
     * Gets the value of the PaidBy field.
     * The user who paid this invoice.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getPaidBy() {
      return (entity.User)__getInternalInterface().getFieldValue(PAIDBY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPaidByID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PAIDBY_PROP.get());
    }
    
    /**
     * Gets the value of the PaymentDate field.
     * The time at which this invoice was paid.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getPaymentDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(PAYMENTDATE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReferenceNumber field.
     * A string identifier assigned to this ServiceRequestStatement by the specialist. The value of this field may only be meaningful to the specialist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReferenceNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REFERENCENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequest field.
     * Service Request the statement is linked to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequest getServiceRequest() {
      return (entity.ServiceRequest)__getInternalInterface().getFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    /**
     * Gets the currency of the associated ServiceRequest, or null if there is none.
     * @return the ServiceRequest's currency
     */
    public typekey.Currency getServiceRequestCurrency() {
      return ((gw.cc.vendormanagement.entity.ServiceRequestStatement)__getDelegateManager().getImplementation("gw.cc.vendormanagement.entity.ServiceRequestStatement")).getServiceRequestCurrency();
    }
    
    public gw.pl.persistence.core.Key getServiceRequestID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(SERVICEREQUEST_PROP.get());
    }
    
    /**
     * Gets the value of the Source field.
     * The external system from which this data comes 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.StatementSource getSource() {
      return (typekey.StatementSource)__getInternalInterface().getFieldValue(SOURCE_PROP.get());
    }
    
    /**
     * Gets the value of the StatementCreationTime field.
     * The time at which this statement was created.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStatementCreationTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STATEMENTCREATIONTIME_PROP.get());
    }
    
    /**
     * Gets the value of the StatementDocumentLinks field.
     * The join entity that holds the information for documents associated with this statement
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequestStatementDocumentLink[] getStatementDocumentLinks() {
      return (entity.ServiceRequestStatementDocumentLink[])__getInternalInterface().getFieldValue(STATEMENTDOCUMENTLINKS_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     * The current invoice status
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestInvoiceStatus getStatus() {
      return (typekey.ServiceRequestInvoiceStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ServiceRequestStatement getSubtype() {
      return (typekey.ServiceRequestStatement)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
     * Gets the validation result.
     * @return The validation result.
     */
    public gw.api.validation.ValidationResult getValidationResult() {
      return ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).getValidationResult();
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
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Link the document to the Service Request Statement using the ServiceRequestStatementDocumentLink join entity;
     * if this statement is already linked to the document, the existing ServiceRequestStatementDocumentLink is returned
     * @param document to link to the service request statement
     * @return the ServiceRequestStatementDocumentLink linking this statement to the document
     */
    public entity.ServiceRequestStatementDocumentLink linkDocument(entity.Document document) {
      return ((gw.cc.vendormanagement.entity.ServiceRequestStatement)__getDelegateManager().getImplementation("gw.cc.vendormanagement.entity.ServiceRequestStatement")).linkDocument(document);
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
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void reject(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).reject(errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectField(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectField(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectFieldWithFlowStep(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectFieldWithFlowStep(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectSubField(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubField(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * Note that this is the fullest version of "reject"; all the others are
     * overloaded for easier use.
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectSubFieldWithFlowStep(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubFieldWithFlowStep(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectWithFlowStep(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectWithFlowStep(errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
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
     * Removes the given element from the LineItems array. This is achieved by marking the element for removal.
     */
    public void removeFromLineItems(entity.ServiceRequestStatementLineItem element) {
      __getInternalInterface().removeArrayElement(LINEITEMS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the LineItems array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromLineItems(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(LINEITEMS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the StatementDocumentLinks array. This is achieved by marking the element for removal.
     */
    public void removeFromStatementDocumentLinks(entity.ServiceRequestStatementDocumentLink element) {
      __getInternalInterface().removeArrayElement(STATEMENTDOCUMENTLINKS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the StatementDocumentLinks array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromStatementDocumentLinks(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(STATEMENTDOCUMENTLINKS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ApprovalDate field.
     */
    public void setApprovalDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(APPROVALDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ApprovedBy field.
     */
    public void setApprovedBy(entity.User value) {
      __getInternalInterface().setFieldValue(APPROVEDBY_PROP.get(), value);
    }
    
    public void setApprovedByID(gw.pl.persistence.core.Key value) {
      setFieldValue(APPROVEDBY_PROP.get(), value);
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
     * Sets the value of the Check field.
     */
    public void setCheck(entity.Check value) {
      __getInternalInterface().setFieldValue(CHECK_PROP.get(), value);
    }
    
    public void setCheckID(gw.pl.persistence.core.Key value) {
      setFieldValue(CHECK_PROP.get(), value);
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
     * Sets the value of the DeclinedReason field.
     */
    public void setDeclinedReason(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DECLINEDREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
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
     * Sets the value of the LineItems field.
     */
    public void setLineItems(entity.ServiceRequestStatementLineItem[] value) {
      __getInternalInterface().setFieldValue(LINEITEMS_PROP.get(), value);
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
     * Sets the value of the PaidBy field.
     */
    public void setPaidBy(entity.User value) {
      __getInternalInterface().setFieldValue(PAIDBY_PROP.get(), value);
    }
    
    public void setPaidByID(gw.pl.persistence.core.Key value) {
      setFieldValue(PAIDBY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaymentDate field.
     */
    public void setPaymentDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(PAYMENTDATE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReferenceNumber field.
     */
    public void setReferenceNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(REFERENCENUMBER_PROP.get(), value);
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
     * Sets the value of the Source field.
     */
    public void setSource(typekey.StatementSource value) {
      __getInternalInterface().setFieldValue(SOURCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StatementCreationTime field.
     */
    public void setStatementCreationTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STATEMENTCREATIONTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StatementDocumentLinks field.
     */
    public void setStatementDocumentLinks(entity.ServiceRequestStatementDocumentLink[] value) {
      __getInternalInterface().setFieldValue(STATEMENTDOCUMENTLINKS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.ServiceRequestInvoiceStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ServiceRequestStatement value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
    
    public void setValidationResult(gw.api.validation.ValidationResult result) {
      ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).setValidationResult(result);
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
    
    /**
     * Unlink the document from the Service Request Statement by removing the entry in the ServiceRequestStatementDocumentLink join array
     * @param document to unlink from service request statement
     */
    public void unlinkDocument(entity.Document document) {
      ((gw.cc.vendormanagement.entity.ServiceRequestStatement)__getDelegateManager().getImplementation("gw.cc.vendormanagement.entity.ServiceRequestStatement")).unlinkDocument(document);
    }
    
    public gw.api.validation.ValidationResult validate() {
      return ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).validate();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.pl.domain.validation.impl.ValidatableImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.pl.domain.validation.impl.ValidatableImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.vendormanagement.entity.ServiceRequestStatement", "com.guidewire.cc.domain.vendormanagement.impl.ServiceRequestStatementImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ServiceRequestInvoice.class, config);
    com.guidewire._generated.entity.ServiceRequestInvoiceInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ServiceRequestInvoice, com.guidewire._generated.entity.ServiceRequestInvoiceInternal>() {
      public java.lang.Object getImplementation(entity.ServiceRequestInvoice bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ServiceRequestInvoiceInternal getInternalInterface(entity.ServiceRequestInvoice bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ServiceRequestInvoice newEmptyInstance() {
        return new entity.ServiceRequestInvoice((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}