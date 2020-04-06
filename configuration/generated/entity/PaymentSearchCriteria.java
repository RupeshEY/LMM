package entity;

/**
 * PaymentSearchCriteria
 * Non-persistent set of criteria to use in searching for a specific Payment.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PaymentSearchCriteria.eti;PaymentSearchCriteria.eix;PaymentSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "PaymentSearchCriteria")
public class PaymentSearchCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PaymentSearchCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PaymentSearchCriteria>("entity.PaymentSearchCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> APPROVEDBYGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ApprovedByGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> APPROVEDBYUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ApprovedByUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CHECKSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CheckStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEDBYUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreatedByUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DATECRITERIONCHOICE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DateCriterionChoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> FINANCIALCRITERION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "FinancialCriterion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INVOICENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InvoiceNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> NAMECRITERIA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "NameCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PayTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.PaymentSearchCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public PaymentSearchCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public PaymentSearchCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected PaymentSearchCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.PaymentSearchCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.PaymentSearchCriteriaInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Tests whether a warning should be displayed to indicated that the search criteria have been set to only
   * search for payments of a particular currency.  In a single-currency configuration this method always
   * returns false.
   * @return <code>true</code> if this is a multicurrency configuration and only payments of a single currency
   *                           are being searched for, else <code>false</code>
   */
  public boolean displaySingleCurrencyWarning() {
    return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).displaySingleCurrencyWarning();
  }
  
  /**
   * Gets the value of the ApprovedByGroup field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupSearchCriterion getApprovedByGroup() {
    return (entity.GroupSearchCriterion)__getInternalInterface().getFieldValue(APPROVEDBYGROUP_PROP.get());
  }
  
  /**
   * Gets the value of the ApprovedByUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getApprovedByUser() {
    return (entity.User)__getInternalInterface().getFieldValue(APPROVEDBYUSER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CheckNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the CheckStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getCheckStatus() {
    return (typekey.TransactionStatus)__getInternalInterface().getFieldValue(CHECKSTATUS_PROP.get());
  }
  
  /**
   * Transaction statuses valid for a Check.
   * @deprecated instead, do this in gscript: <code>TransactionStatus.Type.getTypeFilter("check").Includes</code>
   */
  public gw.entity.TypeKey[] getCheckStatusList() {
    return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).getCheckStatusList();
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   * Claim number to search for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the CreatedByUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreatedByUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEDBYUSER_PROP.get());
  }
  
  /**
   * Gets the currency for the last search.
   * @return the currency used to perform the last search, or null if none
   */
  public typekey.Currency getCurrencyForLastSearch() {
    return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).getCurrencyForLastSearch();
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
   * Runs a query that sums up the columns of the search result and returns the summed amount, as a CurrencyAmount
   * object, for use in the SummaryRow on screen.  This aggregation is done in the database, which is
   * much faster than retrieving all the found checks and adding up their amount values.
   * @return a CurrencyAmount containing the computed sum
   * @deprecated use a footerSumValue bound to CheckSearchView.GrossAmount instead
   */
  public gw.api.financials.CurrencyAmount getSum() {
    return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).getSum();
  }
  
  /**
   * Runs a query that sums up the columns of the search results, for use in the SummaryRow on screen.
   * This is done in the database, which is faster than retrieving all the found Checks and adding up their columns.
   * @return a QueryProcessor with one row of sums
   * @deprecated use the query result returned by performSearch instead, which includes the summary query
   */
  public gw.api.database.IQueryResult<? extends gw.pl.persistence.core.Bean, gw.api.database.QueryRow> getSummaryRow() {
    return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).getSummaryRow();
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
    return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).isShowSumRow();
  }
  
  /**
   * Tests whether the sum row should be displayed. Returns true if in single currency mode or the previous search
   * was against a specific currency.
   * @return <code>true</code> if in single currency mode or the previous search was against a specific currency
   */
  public boolean isShowSumRowForLastSearch() {
    return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).isShowSumRowForLastSearch();
  }
  
  /**
   * Performs the search and returns the set of Payments that match the specified criteria.
   * @return a query containing the set of Payments that match the specified search criteria
   */
  public gw.api.database.IQueryBeanResult<entity.CheckSearchView> performSearch() {
    return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).performSearch();
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
   * Sets the value of the ApprovedByGroup field.
   */
  public void setApprovedByGroup(entity.GroupSearchCriterion value) {
    __getInternalInterface().setFieldValue(APPROVEDBYGROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ApprovedByUser field.
   */
  public void setApprovedByUser(entity.User value) {
    __getInternalInterface().setFieldValue(APPROVEDBYUSER_PROP.get(), value);
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
   * Sets the value of the CheckStatus field.
   */
  public void setCheckStatus(typekey.TransactionStatus value) {
    __getInternalInterface().setFieldValue(CHECKSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreatedByUser field.
   */
  public void setCreatedByUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEDBYUSER_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.PaymentSearchCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.PaymentSearchCriteria.this.__getDelegateManager();
    }
    
    public void addCriteria(com.guidewire.pl.system.database.TableObject checkTableObject) {
      ((com.guidewire.cc.domain.financials.impl.PaymentSearchCriteriaInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.PaymentSearchCriteriaInternal")).addCriteria(checkTableObject);
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
     * search for payments of a particular currency.  In a single-currency configuration this method always
     * returns false.
     * @return <code>true</code> if this is a multicurrency configuration and only payments of a single currency
     *                           are being searched for, else <code>false</code>
     */
    public boolean displaySingleCurrencyWarning() {
      return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).displaySingleCurrencyWarning();
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
     * Gets the value of the ApprovedByGroup field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.GroupSearchCriterion getApprovedByGroup() {
      return (entity.GroupSearchCriterion)__getInternalInterface().getFieldValue(APPROVEDBYGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getApprovedByGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(APPROVEDBYGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the ApprovedByUser field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getApprovedByUser() {
      return (entity.User)__getInternalInterface().getFieldValue(APPROVEDBYUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getApprovedByUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(APPROVEDBYUSER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CheckNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCheckNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the CheckStatus field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TransactionStatus getCheckStatus() {
      return (typekey.TransactionStatus)__getInternalInterface().getFieldValue(CHECKSTATUS_PROP.get());
    }
    
    /**
     * Transaction statuses valid for a Check.
     * @deprecated instead, do this in gscript: <code>TransactionStatus.Type.getTypeFilter("check").Includes</code>
     */
    public gw.entity.TypeKey[] getCheckStatusList() {
      return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).getCheckStatusList();
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     * Claim number to search for.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the CreatedByUser field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreatedByUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEDBYUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreatedByUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEDBYUSER_PROP.get());
    }
    
    /**
     * Gets the currency for the last search.
     * @return the currency used to perform the last search, or null if none
     */
    public typekey.Currency getCurrencyForLastSearch() {
      return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).getCurrencyForLastSearch();
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
     * Runs a query that sums up the columns of the search result and returns the summed amount, as a CurrencyAmount
     * object, for use in the SummaryRow on screen.  This aggregation is done in the database, which is
     * much faster than retrieving all the found checks and adding up their amount values.
     * @return a CurrencyAmount containing the computed sum
     * @deprecated use a footerSumValue bound to CheckSearchView.GrossAmount instead
     */
    public gw.api.financials.CurrencyAmount getSum() {
      return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).getSum();
    }
    
    /**
     * Runs a query that sums up the columns of the search results, for use in the SummaryRow on screen.
     * This is done in the database, which is faster than retrieving all the found Checks and adding up their columns.
     * @return a QueryProcessor with one row of sums
     * @deprecated use the query result returned by performSearch instead, which includes the summary query
     */
    public gw.api.database.IQueryResult<? extends gw.pl.persistence.core.Bean, gw.api.database.QueryRow> getSummaryRow() {
      return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).getSummaryRow();
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
      return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).isShowSumRow();
    }
    
    /**
     * Tests whether the sum row should be displayed. Returns true if in single currency mode or the previous search
     * was against a specific currency.
     * @return <code>true</code> if in single currency mode or the previous search was against a specific currency
     */
    public boolean isShowSumRowForLastSearch() {
      return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).isShowSumRowForLastSearch();
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
     * Performs the search and returns the set of Payments that match the specified criteria.
     * @return a query containing the set of Payments that match the specified search criteria
     */
    public gw.api.database.IQueryBeanResult<entity.CheckSearchView> performSearch() {
      return ((gw.cc.financials.entity.PaymentSearchCriteria)__getDelegateManager().getImplementation("gw.cc.financials.entity.PaymentSearchCriteria")).performSearch();
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
     * Sets the value of the ApprovedByGroup field.
     */
    public void setApprovedByGroup(entity.GroupSearchCriterion value) {
      __getInternalInterface().setFieldValue(APPROVEDBYGROUP_PROP.get(), value);
    }
    
    public void setApprovedByGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(APPROVEDBYGROUP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ApprovedByUser field.
     */
    public void setApprovedByUser(entity.User value) {
      __getInternalInterface().setFieldValue(APPROVEDBYUSER_PROP.get(), value);
    }
    
    public void setApprovedByUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(APPROVEDBYUSER_PROP.get(), value);
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
     * Sets the value of the CheckStatus field.
     */
    public void setCheckStatus(typekey.TransactionStatus value) {
      __getInternalInterface().setFieldValue(CHECKSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreatedByUser field.
     */
    public void setCreatedByUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEDBYUSER_PROP.get(), value);
    }
    
    public void setCreatedByUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEDBYUSER_PROP.get(), value);
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
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.impl.PaymentSearchCriteriaInternal", "com.guidewire.cc.domain.financials.impl.PaymentSearchCriteriaImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.entity.PaymentSearchCriteria", "com.guidewire.cc.domain.financials.impl.PaymentSearchCriteriaImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.cc.domain.financials.impl.PaymentSearchCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.PaymentSearchCriteria.class, config);
    com.guidewire._generated.entity.PaymentSearchCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.PaymentSearchCriteria, com.guidewire._generated.entity.PaymentSearchCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.PaymentSearchCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PaymentSearchCriteriaInternal getInternalInterface(entity.PaymentSearchCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.PaymentSearchCriteria newEmptyInstance() {
        return new entity.PaymentSearchCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}