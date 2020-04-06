package entity;

/**
 * BulkInvoiceSearchCriteria
 * 
 *       Encapsulates the search criteria for a Bulk Invoice search. The system does not store BulkInvoiceSearchCriteria
 *       entities; they only exist for a search and are discarded after use.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoiceSearchCriteria.eti;BulkInvoiceSearchCriteria.eix;BulkInvoiceSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "BulkInvoiceSearchCriteria")
public class BulkInvoiceSearchCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.BulkInvoiceSearchCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.BulkInvoiceSearchCriteria>("entity.BulkInvoiceSearchCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DATECRITERIONCHOICE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DateCriterionChoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> FINANCIALCRITERION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "FinancialCriterion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INVOICENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InvoiceNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> NAMECRITERIA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "NameCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PayTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.BulkInvoiceSearchCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public BulkInvoiceSearchCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public BulkInvoiceSearchCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected BulkInvoiceSearchCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.BulkInvoiceSearchCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.BulkInvoiceSearchCriteriaInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Tests whether a warning should be displayed to indicated that the search criteria have been set to only
   * search for invoices of a particular currency.  In a single-currency configuration this method always
   * returns false.
   * @return <code>true</code> if this is a multicurrency configuration and only recoveries of a single currency
   *                           are being searched for, else <code>false</code>
   */
  public boolean displaySingleCurrencyWarning() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).displaySingleCurrencyWarning();
  }
  
  /**
   * Runs a query that sums up the columns of the search result and returns the summed approved amount, as a CurrencyAmount
   * object, for use in the SummaryRow on screen. This aggregation is done in the database, which is
   * much faster than retrieving all the found invoices and adding up their amount values.
   * @return a CurrencyAmount containing the computed sum
   * @deprecated use a footerSumValue bound to BulkInvoiceSearchView.ApprovedTransactionAmount instead
   */
  public gw.api.financials.CurrencyAmount getApprovedSum() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).getApprovedSum();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CheckNumber field.
   * Match by check number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   * Match by claim number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
  }
  
  /**
   * Gets the currency for the last search.
   * @return the currency used to perform the last search, or null if none
   */
  public typekey.Currency getCurrencyForLastSearch() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).getCurrencyForLastSearch();
  }
  
  /**
   * Gets the value of the DateCriterionChoice field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateCriterionChoice getDateCriterionChoice() {
    return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(DATECRITERIONCHOICE_PROP.get());
  }
  
  /**
   * Gets the value of the FinancialCriterion field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FinancialCriterionMC getFinancialCriterion() {
    return (entity.FinancialCriterionMC)__getInternalInterface().getFieldValue(FINANCIALCRITERION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the InvoiceNumber field.
   * Match by invoice number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInvoiceNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INVOICENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the NameCriteria field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CCNameCriteria getNameCriteria() {
    return (entity.CCNameCriteria)__getInternalInterface().getFieldValue(NAMECRITERIA_PROP.get());
  }
  
  /**
   * Gets the value of the PayTo field.
   * Match by PayTo.
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
   * Runs a query that sums up the columns of the search results, for use in the SummaryRow on screen.
   * This is done in the database, which is faster than retrieving all the found bulk invoices and adding up their columns.
   * @return a QueryProcessor with one row of sums
   * @deprecated use the query result returned by performSearch instead, which includes the summary query
   */
  public gw.api.database.IQueryResult<? extends gw.pl.persistence.core.Bean, gw.api.database.QueryRow> getSummaryRow() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).getSummaryRow();
  }
  
  /**
   * Runs a query that sums up the columns of the search result and returns the summed total amount, as a CurrencyAmount
   * object, for use in the SummaryRow on screen. This aggregation is done in the database, which is
   * much faster than retrieving all the found invoices and adding up their amount values.
   * @return a CurrencyAmount containing the computed sum
   * @deprecated use a footerSumValue bound to BulkInvoiceSearchView.TotalTransactionAmount instead
   */
  public gw.api.financials.CurrencyAmount getTotalSum() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).getTotalSum();
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
   * Tests whether the sum row should be displayed.  This depends on whether the last performed search
   * was done for a specific currency.
   * @return <code>true</code> if the sum row should be displayed, else <code>true</code>
   * @deprecated use {@link #isShowSumRowForLastSearch} instead
   */
  public boolean isShowSumRow() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).isShowSumRow();
  }
  
  /**
   * Tests whether the sum row should be displayed. Returns true if in single currency mode or the previous search
   * was against a specific currency.
   * @return <code>true</code> if in single currency mode or the previous search was against a specific currency
   */
  public boolean isShowSumRowForLastSearch() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).isShowSumRowForLastSearch();
  }
  
  /**
   * Constructs the appropriate query based on the specified criteria.  The returned query includes the appropriate
   * summary row.
   * @return BulkInvoice query results including a summary row, based on the specified criteria, as BulkInvoiceSearchView objects
   */
  public gw.api.database.IQueryBeanResult<entity.BulkInvoiceSearchView> performSearch() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).performSearch();
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
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckNumber field.
   */
  public void setCheckNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CHECKNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateCriterionChoice field.
   */
  public void setDateCriterionChoice(entity.DateCriterionChoice value) {
    __getInternalInterface().setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FinancialCriterion field.
   */
  public void setFinancialCriterion(entity.FinancialCriterionMC value) {
    __getInternalInterface().setFieldValue(FINANCIALCRITERION_PROP.get(), value);
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
   * Sets the value of the NameCriteria field.
   */
  public void setNameCriteria(entity.CCNameCriteria value) {
    __getInternalInterface().setFieldValue(NAMECRITERIA_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.BulkInvoiceSearchCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.BulkInvoiceSearchCriteria.this.__getDelegateManager();
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
    
    /**
     * Tests whether a warning should be displayed to indicated that the search criteria have been set to only
     * search for invoices of a particular currency.  In a single-currency configuration this method always
     * returns false.
     * @return <code>true</code> if this is a multicurrency configuration and only recoveries of a single currency
     *                           are being searched for, else <code>false</code>
     */
    public boolean displaySingleCurrencyWarning() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).displaySingleCurrencyWarning();
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
     * Runs a query that sums up the columns of the search result and returns the summed approved amount, as a CurrencyAmount
     * object, for use in the SummaryRow on screen. This aggregation is done in the database, which is
     * much faster than retrieving all the found invoices and adding up their amount values.
     * @return a CurrencyAmount containing the computed sum
     * @deprecated use a footerSumValue bound to BulkInvoiceSearchView.ApprovedTransactionAmount instead
     */
    public gw.api.financials.CurrencyAmount getApprovedSum() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).getApprovedSum();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CheckNumber field.
     * Match by check number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCheckNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     * Match by claim number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the currency for the last search.
     * @return the currency used to perform the last search, or null if none
     */
    public typekey.Currency getCurrencyForLastSearch() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).getCurrencyForLastSearch();
    }
    
    /**
     * Gets the value of the DateCriterionChoice field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateCriterionChoice getDateCriterionChoice() {
      return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(DATECRITERIONCHOICE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDateCriterionChoiceID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DATECRITERIONCHOICE_PROP.get());
    }
    
    /**
     * Gets the value of the FinancialCriterion field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.FinancialCriterionMC getFinancialCriterion() {
      return (entity.FinancialCriterionMC)__getInternalInterface().getFieldValue(FINANCIALCRITERION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getFinancialCriterionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(FINANCIALCRITERION_PROP.get());
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
     * Gets the value of the InvoiceNumber field.
     * Match by invoice number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInvoiceNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INVOICENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the NameCriteria field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CCNameCriteria getNameCriteria() {
      return (entity.CCNameCriteria)__getInternalInterface().getFieldValue(NAMECRITERIA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getNameCriteriaID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(NAMECRITERIA_PROP.get());
    }
    
    /**
     * Gets the value of the PayTo field.
     * Match by PayTo.
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
     * Runs a query that sums up the columns of the search results, for use in the SummaryRow on screen.
     * This is done in the database, which is faster than retrieving all the found bulk invoices and adding up their columns.
     * @return a QueryProcessor with one row of sums
     * @deprecated use the query result returned by performSearch instead, which includes the summary query
     */
    public gw.api.database.IQueryResult<? extends gw.pl.persistence.core.Bean, gw.api.database.QueryRow> getSummaryRow() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).getSummaryRow();
    }
    
    /**
     * Runs a query that sums up the columns of the search result and returns the summed total amount, as a CurrencyAmount
     * object, for use in the SummaryRow on screen. This aggregation is done in the database, which is
     * much faster than retrieving all the found invoices and adding up their amount values.
     * @return a CurrencyAmount containing the computed sum
     * @deprecated use a footerSumValue bound to BulkInvoiceSearchView.TotalTransactionAmount instead
     */
    public gw.api.financials.CurrencyAmount getTotalSum() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).getTotalSum();
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
    
    /**
     * Tests whether the sum row should be displayed.  This depends on whether the last performed search
     * was done for a specific currency.
     * @return <code>true</code> if the sum row should be displayed, else <code>true</code>
     * @deprecated use {@link #isShowSumRowForLastSearch} instead
     */
    public boolean isShowSumRow() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).isShowSumRow();
    }
    
    /**
     * Tests whether the sum row should be displayed. Returns true if in single currency mode or the previous search
     * was against a specific currency.
     * @return <code>true</code> if in single currency mode or the previous search was against a specific currency
     */
    public boolean isShowSumRowForLastSearch() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).isShowSumRowForLastSearch();
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
    
    /**
     * Constructs the appropriate query based on the specified criteria.  The returned query includes the appropriate
     * summary row.
     * @return BulkInvoice query results including a summary row, based on the specified criteria, as BulkInvoiceSearchView objects
     */
    public gw.api.database.IQueryBeanResult<entity.BulkInvoiceSearchView> performSearch() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria")).performSearch();
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
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckNumber field.
     */
    public void setCheckNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CHECKNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateCriterionChoice field.
     */
    public void setDateCriterionChoice(entity.DateCriterionChoice value) {
      __getInternalInterface().setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
    }
    
    public void setDateCriterionChoiceID(gw.pl.persistence.core.Key value) {
      setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FinancialCriterion field.
     */
    public void setFinancialCriterion(entity.FinancialCriterionMC value) {
      __getInternalInterface().setFieldValue(FINANCIALCRITERION_PROP.get(), value);
    }
    
    public void setFinancialCriterionID(gw.pl.persistence.core.Key value) {
      setFieldValue(FINANCIALCRITERION_PROP.get(), value);
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
     * Sets the value of the NameCriteria field.
     */
    public void setNameCriteria(entity.CCNameCriteria value) {
      __getInternalInterface().setFieldValue(NAMECRITERIA_PROP.get(), value);
    }
    
    public void setNameCriteriaID(gw.pl.persistence.core.Key value) {
      setFieldValue(NAMECRITERIA_PROP.get(), value);
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
    
    public boolean validate() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceSearchCriteriaInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceSearchCriteriaInternal")).validate();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceSearchCriteriaInternal", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceSearchCriteriaImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceSearchCriteriaImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceSearchCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.BulkInvoiceSearchCriteria.class, config);
    com.guidewire._generated.entity.BulkInvoiceSearchCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.BulkInvoiceSearchCriteria, com.guidewire._generated.entity.BulkInvoiceSearchCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.BulkInvoiceSearchCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.BulkInvoiceSearchCriteriaInternal getInternalInterface(entity.BulkInvoiceSearchCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.BulkInvoiceSearchCriteria newEmptyInstance() {
        return new entity.BulkInvoiceSearchCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}