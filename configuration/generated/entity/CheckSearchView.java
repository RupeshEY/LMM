package entity;

/**
 * CheckSearchView
 * Aggregates the information needed to display one Check on the Payment/Check search page.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckSearchView.eti;CheckSearchView.eix;CheckSearchView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "CheckSearchView")
public class CheckSearchView extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.CheckSearchView> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.CheckSearchView>("entity.CheckSearchView");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> BULKINVOICEITEM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "BulkInvoiceItem");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BULKINVOICENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BulkInvoiceNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CHECK_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Check");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMANT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Claimant");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEOFSERVICE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateOfService");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROSSAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GrossAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROSSCLAIMAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GrossClaimAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROSSRESERVINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GrossReservingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISSUEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IssueDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PayTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RESERVINGCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReservingCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCHEDULEDSENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ScheduledSendDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEPDEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServicePdEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEPDSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServicePdStart");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.CheckSearchViewInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public CheckSearchView()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public CheckSearchView(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected CheckSearchView(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.CheckSearchViewInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.CheckSearchViewInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the BulkInvoiceItem field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItem getBulkInvoiceItem() {
    return (entity.BulkInvoiceItem)__getInternalInterface().getFieldValue(BULKINVOICEITEM_PROP.get());
  }
  
  /**
   * Gets the value of the BulkInvoiceNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBulkInvoiceNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BULKINVOICENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the Check field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check getCheck() {
    return (entity.Check)__getInternalInterface().getFieldValue(CHECK_PROP.get());
  }
  
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMCURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the Claimant field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimant() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMANT_PROP.get());
  }
  
  /**
   * Gets the value of the Currency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the DateOfService field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfService() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFSERVICE_PROP.get());
  }
  
  /**
   * Returns the invoice number of the BulkInvoice associated with the BulkInvoiceItem of this Check, or "&lt;none&gt;"
   * if this Check is not bulked.
   * @return BulkInvoice number associated with this Check
   */
  public java.lang.String getDisplayedBulkInvoiceNumber() {
    return ((gw.cc.financials.check.entity.CheckSearchView)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckSearchView")).getDisplayedBulkInvoiceNumber();
  }
  
  /**
   * Gets the value of the GrossAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the GrossClaimAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossClaimAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSCLAIMAMOUNT_PROP.get());
  }
  
  /**
   * GrossAmount property as a CurrencyAmount (to allow multicurrency display).
   * @return GrossAmount as a CurrencyAmount
   */
  public gw.api.financials.CurrencyAmountPair getGrossCurrencyAmount() {
    return ((gw.cc.financials.check.entity.CheckSearchView)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckSearchView")).getGrossCurrencyAmount();
  }
  
  /**
   * Gets the value of the GrossReservingAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossReservingAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSRESERVINGAMOUNT_PROP.get());
  }
  
  /**
   * GrossAmount of the check in the transaction currency as a CurrencyAmount so that the correct
   * currency icon is displayed.  However, even if this check was not written in the claim's currency
   * only the transaction currency amount will be displayed.
   * @return the Transaction Gross Amount as a CurrencyAmount
   */
  public gw.api.financials.CurrencyAmount getGrossTransactionCurrencyAmount() {
    return ((gw.cc.financials.check.entity.CheckSearchView)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckSearchView")).getGrossTransactionCurrencyAmount();
  }
  
  /**
   * 
   * @return Unique identifier of the object.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
  }
  
  /**
   * Gets the value of the IssueDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getIssueDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ISSUEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the PayTo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayTo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PAYTO_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReservingCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the ScheduledSendDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScheduledSendDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SCHEDULEDSENDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ServicePdEnd field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdEnd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEPDEND_PROP.get());
  }
  
  /**
   * Gets the value of the ServicePdStart field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdStart() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEPDSTART_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getStatus() {
    return (typekey.TransactionStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Tests whether this check is part of a bulk payment (i.e., it's tied to a BulkInvoiceItem).
   * @return <code>true</code> if this is a bulked check, else <code>false</code>
   */
  public boolean isBulked() {
    return ((gw.cc.financials.check.entity.CheckSearchView)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckSearchView")).isBulked();
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
   * Sets the value of the BulkInvoiceItem field.
   */
  public void setBulkInvoiceItem(entity.BulkInvoiceItem value) {
    __getInternalInterface().setFieldValue(BULKINVOICEITEM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkInvoiceNumber field.
   */
  public void setBulkInvoiceNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BULKINVOICENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Check field.
   */
  public void setCheck(entity.Check value) {
    __getInternalInterface().setFieldValue(CHECK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimCurrency field.
   */
  public void setClaimCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CLAIMCURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claimant field.
   */
  public void setClaimant(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMANT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateOfService field.
   */
  public void setDateOfService(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEOFSERVICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GrossAmount field.
   */
  public void setGrossAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(GROSSAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GrossClaimAmount field.
   */
  public void setGrossClaimAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(GROSSCLAIMAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GrossReservingAmount field.
   */
  public void setGrossReservingAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(GROSSRESERVINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IssueDate field.
   */
  public void setIssueDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ISSUEDATE_PROP.get(), value);
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
   * Sets the value of the PayTo field.
   */
  public void setPayTo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PAYTO_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScheduledSendDate field.
   */
  public void setScheduledSendDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SCHEDULEDSENDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServicePdEnd field.
   */
  public void setServicePdEnd(java.util.Date value) {
    __getInternalInterface().setFieldValue(SERVICEPDEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServicePdStart field.
   */
  public void setServicePdStart(java.util.Date value) {
    __getInternalInterface().setFieldValue(SERVICEPDSTART_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.TransactionStatus value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.CheckSearchViewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.CheckSearchView.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
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
     * Gets the value of the BulkInvoiceItem field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BulkInvoiceItem getBulkInvoiceItem() {
      return (entity.BulkInvoiceItem)__getInternalInterface().getFieldValue(BULKINVOICEITEM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getBulkInvoiceItemID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(BULKINVOICEITEM_PROP.get());
    }
    
    /**
     * Gets the value of the BulkInvoiceNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBulkInvoiceNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BULKINVOICENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the Check field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Check getCheck() {
      return (entity.Check)__getInternalInterface().getFieldValue(CHECK_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCheckID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CHECK_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimCurrency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getClaimCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CLAIMCURRENCY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the Claimant field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimant() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMANT_PROP.get());
    }
    
    /**
     * Gets the value of the Currency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the DateOfService field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateOfService() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFSERVICE_PROP.get());
    }
    
    /**
     * Returns the invoice number of the BulkInvoice associated with the BulkInvoiceItem of this Check, or "&lt;none&gt;"
     * if this Check is not bulked.
     * @return BulkInvoice number associated with this Check
     */
    public java.lang.String getDisplayedBulkInvoiceNumber() {
      return ((gw.cc.financials.check.entity.CheckSearchView)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckSearchView")).getDisplayedBulkInvoiceNumber();
    }
    
    /**
     * Gets the value of the GrossAmount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getGrossAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the GrossClaimAmount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getGrossClaimAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSCLAIMAMOUNT_PROP.get());
    }
    
    /**
     * GrossAmount property as a CurrencyAmount (to allow multicurrency display).
     * @return GrossAmount as a CurrencyAmount
     */
    public gw.api.financials.CurrencyAmountPair getGrossCurrencyAmount() {
      return ((gw.cc.financials.check.entity.CheckSearchView)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckSearchView")).getGrossCurrencyAmount();
    }
    
    /**
     * Gets the value of the GrossReservingAmount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getGrossReservingAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSRESERVINGAMOUNT_PROP.get());
    }
    
    /**
     * GrossAmount of the check in the transaction currency as a CurrencyAmount so that the correct
     * currency icon is displayed.  However, even if this check was not written in the claim's currency
     * only the transaction currency amount will be displayed.
     * @return the Transaction Gross Amount as a CurrencyAmount
     */
    public gw.api.financials.CurrencyAmount getGrossTransactionCurrencyAmount() {
      return ((gw.cc.financials.check.entity.CheckSearchView)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckSearchView")).getGrossTransactionCurrencyAmount();
    }
    
    /**
     * 
     * @return Unique identifier of the object.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the IssueDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getIssueDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ISSUEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the PayTo field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPayTo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PAYTO_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReservingCurrency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getReservingCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the ScheduledSendDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getScheduledSendDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SCHEDULEDSENDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ServicePdEnd field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getServicePdEnd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEPDEND_PROP.get());
    }
    
    /**
     * Gets the value of the ServicePdStart field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getServicePdStart() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEPDSTART_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TransactionStatus getStatus() {
      return (typekey.TransactionStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Tests whether this check is part of a bulk payment (i.e., it's tied to a BulkInvoiceItem).
     * @return <code>true</code> if this is a bulked check, else <code>false</code>
     */
    public boolean isBulked() {
      return ((gw.cc.financials.check.entity.CheckSearchView)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.CheckSearchView")).isBulked();
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
     * Sets the value of the BulkInvoiceItem field.
     */
    public void setBulkInvoiceItem(entity.BulkInvoiceItem value) {
      __getInternalInterface().setFieldValue(BULKINVOICEITEM_PROP.get(), value);
    }
    
    public void setBulkInvoiceItemID(gw.pl.persistence.core.Key value) {
      setFieldValue(BULKINVOICEITEM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkInvoiceNumber field.
     */
    public void setBulkInvoiceNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BULKINVOICENUMBER_PROP.get(), value);
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
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimCurrency field.
     */
    public void setClaimCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CLAIMCURRENCY_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claimant field.
     */
    public void setClaimant(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMANT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Currency field.
     */
    public void setCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateOfService field.
     */
    public void setDateOfService(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEOFSERVICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GrossAmount field.
     */
    public void setGrossAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(GROSSAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GrossClaimAmount field.
     */
    public void setGrossClaimAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(GROSSCLAIMAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GrossReservingAmount field.
     */
    public void setGrossReservingAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(GROSSRESERVINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IssueDate field.
     */
    public void setIssueDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ISSUEDATE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
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
     * Sets the value of the PayTo field.
     */
    public void setPayTo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PAYTO_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReservingCurrency field.
     */
    public void setReservingCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ScheduledSendDate field.
     */
    public void setScheduledSendDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SCHEDULEDSENDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServicePdEnd field.
     */
    public void setServicePdEnd(java.util.Date value) {
      __getInternalInterface().setFieldValue(SERVICEPDEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServicePdStart field.
     */
    public void setServicePdStart(java.util.Date value) {
      __getInternalInterface().setFieldValue(SERVICEPDSTART_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.TransactionStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.check.entity.CheckSearchView", "com.guidewire.cc.domain.financials.check.impl.CheckSearchViewImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.CheckSearchView.class, config);
    com.guidewire._generated.entity.CheckSearchViewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.CheckSearchView, com.guidewire._generated.entity.CheckSearchViewInternal>() {
      public java.lang.Object getImplementation(entity.CheckSearchView bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.CheckSearchViewInternal getInternalInterface(entity.CheckSearchView bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.CheckSearchView newEmptyInstance() {
        return new entity.CheckSearchView((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}