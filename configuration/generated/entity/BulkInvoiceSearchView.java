package entity;

/**
 * BulkInvoiceSearchView
 * Aggregates the information needed to display a Bulk Invoice on the Bulk Invoice Search page.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoiceSearchView.eti;BulkInvoiceSearchView.eix;BulkInvoiceSearchView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "BulkInvoiceSearchView")
public class BulkInvoiceSearchView extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.BulkInvoiceSearchView> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.BulkInvoiceSearchView>("entity.BulkInvoiceSearchView");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPROVEDREPORTINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ApprovedReportingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPROVEDTRANSACTIONAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ApprovedTransactionAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> BULKINVOICE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "BulkInvoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BULKINVOICETOTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BulkInvoiceTotal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INVOICENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InvoiceNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PayTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECEIVEDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReceivedDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCHEDULEDSENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ScheduledSendDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALREPORTINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalReportingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALTRANSACTIONAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalTransactionAmount");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.BulkInvoiceSearchViewInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public BulkInvoiceSearchView()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public BulkInvoiceSearchView(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected BulkInvoiceSearchView(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.BulkInvoiceSearchViewInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.BulkInvoiceSearchViewInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * ApprovedAmount property as a CurrencyAmount (to allow multicurrency display).
   * @return ApprovedAmount as a CurrencyAmount
   */
  public gw.api.financials.CurrencyAmountPair getApprovedCurrencyAmount() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView")).getApprovedCurrencyAmount();
  }
  
  /**
   * Gets the value of the ApprovedReportingAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getApprovedReportingAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(APPROVEDREPORTINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the ApprovedTransactionAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getApprovedTransactionAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(APPROVEDTRANSACTIONAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the BulkInvoice field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoice getBulkInvoice() {
    return (entity.BulkInvoice)__getInternalInterface().getFieldValue(BULKINVOICE_PROP.get());
  }
  
  /**
   * Gets the value of the BulkInvoiceTotal field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getBulkInvoiceTotal() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(BULKINVOICETOTAL_PROP.get());
  }
  
  /**
   * Gets the value of the CheckNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the Currency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
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
   * Gets the value of the InvoiceNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInvoiceNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INVOICENUMBER_PROP.get());
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
   * Gets the value of the ReceivedDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReceivedDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RECEIVEDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ScheduledSendDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScheduledSendDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SCHEDULEDSENDDATE_PROP.get());
  }
  
  /**
   * TotalAmount property as a CurrencyAmount (to allow multicurrency display).
   * @return TotalAmount as a CurrencyAmount
   */
  public gw.api.financials.CurrencyAmountPair getTotalCurrencyAmount() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView")).getTotalCurrencyAmount();
  }
  
  /**
   * Gets the value of the TotalReportingAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalReportingAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALREPORTINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the TotalTransactionAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalTransactionAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALTRANSACTIONAMOUNT_PROP.get());
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
   * Sets the value of the ApprovedReportingAmount field.
   */
  public void setApprovedReportingAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(APPROVEDREPORTINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ApprovedTransactionAmount field.
   */
  public void setApprovedTransactionAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(APPROVEDTRANSACTIONAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkInvoice field.
   */
  public void setBulkInvoice(entity.BulkInvoice value) {
    __getInternalInterface().setFieldValue(BULKINVOICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkInvoiceTotal field.
   */
  public void setBulkInvoiceTotal(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(BULKINVOICETOTAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckNumber field.
   */
  public void setCheckNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CHECKNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InvoiceNumber field.
   */
  public void setInvoiceNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INVOICENUMBER_PROP.get(), value);
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
   * Sets the value of the ReceivedDate field.
   */
  public void setReceivedDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RECEIVEDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScheduledSendDate field.
   */
  public void setScheduledSendDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SCHEDULEDSENDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalReportingAmount field.
   */
  public void setTotalReportingAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALREPORTINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalTransactionAmount field.
   */
  public void setTotalTransactionAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALTRANSACTIONAMOUNT_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.BulkInvoiceSearchViewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.BulkInvoiceSearchView.this.__getDelegateManager();
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
     * ApprovedAmount property as a CurrencyAmount (to allow multicurrency display).
     * @return ApprovedAmount as a CurrencyAmount
     */
    public gw.api.financials.CurrencyAmountPair getApprovedCurrencyAmount() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView")).getApprovedCurrencyAmount();
    }
    
    /**
     * Gets the value of the ApprovedReportingAmount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getApprovedReportingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(APPROVEDREPORTINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ApprovedTransactionAmount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getApprovedTransactionAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(APPROVEDTRANSACTIONAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the BulkInvoice field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BulkInvoice getBulkInvoice() {
      return (entity.BulkInvoice)__getInternalInterface().getFieldValue(BULKINVOICE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getBulkInvoiceID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(BULKINVOICE_PROP.get());
    }
    
    /**
     * Gets the value of the BulkInvoiceTotal field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getBulkInvoiceTotal() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(BULKINVOICETOTAL_PROP.get());
    }
    
    /**
     * Gets the value of the CheckNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCheckNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the Currency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
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
     * Gets the value of the InvoiceNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInvoiceNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INVOICENUMBER_PROP.get());
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
     * Gets the value of the ReceivedDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReceivedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RECEIVEDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ScheduledSendDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getScheduledSendDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SCHEDULEDSENDDATE_PROP.get());
    }
    
    /**
     * TotalAmount property as a CurrencyAmount (to allow multicurrency display).
     * @return TotalAmount as a CurrencyAmount
     */
    public gw.api.financials.CurrencyAmountPair getTotalCurrencyAmount() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView")).getTotalCurrencyAmount();
    }
    
    /**
     * Gets the value of the TotalReportingAmount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalReportingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALREPORTINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the TotalTransactionAmount field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalTransactionAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALTRANSACTIONAMOUNT_PROP.get());
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
     * Sets the value of the ApprovedReportingAmount field.
     */
    public void setApprovedReportingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(APPROVEDREPORTINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ApprovedTransactionAmount field.
     */
    public void setApprovedTransactionAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(APPROVEDTRANSACTIONAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkInvoice field.
     */
    public void setBulkInvoice(entity.BulkInvoice value) {
      __getInternalInterface().setFieldValue(BULKINVOICE_PROP.get(), value);
    }
    
    public void setBulkInvoiceID(gw.pl.persistence.core.Key value) {
      setFieldValue(BULKINVOICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkInvoiceTotal field.
     */
    public void setBulkInvoiceTotal(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(BULKINVOICETOTAL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckNumber field.
     */
    public void setCheckNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CHECKNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Currency field.
     */
    public void setCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InvoiceNumber field.
     */
    public void setInvoiceNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INVOICENUMBER_PROP.get(), value);
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
     * Sets the value of the ReceivedDate field.
     */
    public void setReceivedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RECEIVEDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ScheduledSendDate field.
     */
    public void setScheduledSendDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SCHEDULEDSENDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalReportingAmount field.
     */
    public void setTotalReportingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALREPORTINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalTransactionAmount field.
     */
    public void setTotalTransactionAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALTRANSACTIONAMOUNT_PROP.get(), value);
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
    config.put("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceSearchViewImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.BulkInvoiceSearchView.class, config);
    com.guidewire._generated.entity.BulkInvoiceSearchViewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.BulkInvoiceSearchView, com.guidewire._generated.entity.BulkInvoiceSearchViewInternal>() {
      public java.lang.Object getImplementation(entity.BulkInvoiceSearchView bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.BulkInvoiceSearchViewInternal getInternalInterface(entity.BulkInvoiceSearchView bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.BulkInvoiceSearchView newEmptyInstance() {
        return new entity.BulkInvoiceSearchView((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}