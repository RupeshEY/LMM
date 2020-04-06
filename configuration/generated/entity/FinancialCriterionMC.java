package entity;

/**
 * FinancialCriterionMC
 * Special subclass of FinancialsCriterionChoice to be used for multicurrency-enabled searches
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FinancialCriterionMC.eti;FinancialCriterionMC.eix;FinancialCriterionMC.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "FinancialCriterionMC")
public class FinancialCriterionMC extends entity.FinancialCriterion {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.FinancialCriterionMC> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.FinancialCriterionMC>("entity.FinancialCriterionMC");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public FinancialCriterionMC()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public FinancialCriterionMC(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected FinancialCriterionMC(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.FinancialCriterionMCInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.FinancialCriterionMCInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.FinancialCriterionMCInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the Currency field.
   * The currency to match for the search, if any.  If no currency is chosen, and system is in multicurrency mode then the search will happen against claim currency amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.FinancialCriterionMCInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.FinancialCriterionMC.this.__getDelegateManager();
    }
    
    public void addToRestriction(com.guidewire.pl.system.database.Restriction restriction, gw.entity.IQueryColumn queryColumn) {
      ((com.guidewire.pl.system.service.search.SearchCriterionChoice)__getDelegateManager().getImplementation("com.guidewire.pl.system.service.search.SearchCriterionChoice")).addToRestriction(restriction, queryColumn);
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
     * Gets the value of the AmountEnd field.
     * The high end (inclusive) of the allowable range of money values.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getAmountEnd() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AMOUNTEND_PROP.get());
    }
    
    /**
     * Gets the value of the AmountStart field.
     * The low end (inclusive) of the allowable range of money values.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getAmountStart() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AMOUNTSTART_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the ChosenOption field.
     * The chosen configurable search option, specifies the money field to be restricted.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getChosenOption() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHOSENOPTION_PROP.get());
    }
    
    /**
     * Gets the value of the Currency field.
     * The currency to match for the search, if any.  If no currency is chosen, and system is in multicurrency mode then the search will happen against claim currency amount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
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
     * The list of options specifying which field to search. This list is populated by the
     * configurable search mechanism. Each option is described by a display key name, as
     * given in the search-config.xml file.
     * @return an array of display key names
     */
    public java.lang.String[] getOptions() {
      return ((com.guidewire.pl.domain.custom.FinancialCriterionPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.FinancialCriterionPublicMethods")).getOptions();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    public gw.api.database.Range<? extends java.lang.Object> getRange(gw.entity.IQueryColumn queryColumn) {
      return ((com.guidewire.pl.domain.custom.impl.FinancialCriterionInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.FinancialCriterionInternalMethods")).getRange(queryColumn);
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FinancialCriterion getSubtype() {
      return (typekey.FinancialCriterion)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isCurrencySet() {
      return ((com.guidewire.cc.domain.financials.impl.FinancialCriterionMCInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.FinancialCriterionMCInternal")).isCurrencySet();
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
    
    public boolean isRangeSet() {
      return ((com.guidewire.cc.domain.financials.impl.FinancialCriterionMCInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.FinancialCriterionMCInternal")).isRangeSet();
    }
    
    /**
     * True if any of the fields in this criteria object are set. False if no fields are set, so the
     * criteria should not affect the search.
     */
    public boolean isSet() {
      return ((com.guidewire.pl.domain.custom.FinancialCriterionPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.FinancialCriterionPublicMethods")).isSet();
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
     * Sets the value of the AmountEnd field.
     */
    public void setAmountEnd(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(AMOUNTEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AmountStart field.
     */
    public void setAmountStart(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(AMOUNTSTART_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ChosenOption field.
     */
    public void setChosenOption(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CHOSENOPTION_PROP.get(), value);
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
    
    public void setOptions(java.lang.String[] options) {
      ((com.guidewire.pl.system.service.search.SearchCriterionChoice)__getDelegateManager().getImplementation("com.guidewire.pl.system.service.search.SearchCriterionChoice")).setOptions(options);
    }
    
    public void setOptionsInternal(java.lang.String[] options) {
      ((com.guidewire.pl.domain.custom.impl.FinancialCriterionInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.custom.impl.FinancialCriterionInternalMethods")).setOptionsInternal(options);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.FinancialCriterion value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.financials.impl.FinancialCriterionMCInternal", "com.guidewire.cc.domain.financials.impl.FinancialCriterionMCImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.custom.FinancialCriterionPublicMethods", "com.guidewire.cc.domain.financials.impl.FinancialCriterionMCImpl");
    config.put("com.guidewire.pl.domain.custom.impl.FinancialCriterionInternalMethods", "com.guidewire.cc.domain.financials.impl.FinancialCriterionMCImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.service.search.SearchCriterionChoice", "com.guidewire.cc.domain.financials.impl.FinancialCriterionMCImpl");
    config.put("gw.cc.financials.entity.FinancialCriterionMC", "com.guidewire.cc.domain.financials.impl.FinancialCriterionMCImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.FinancialCriterionMC.class, config);
    com.guidewire._generated.entity.FinancialCriterionMCInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.FinancialCriterionMC, com.guidewire._generated.entity.FinancialCriterionMCInternal>() {
      public java.lang.Object getImplementation(entity.FinancialCriterionMC bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.FinancialCriterionMCInternal getInternalInterface(entity.FinancialCriterionMC bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.FinancialCriterionMC newEmptyInstance() {
        return new entity.FinancialCriterionMC((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}