package entity;

/**
 * TmpTAccountBalanceCopy
 * Temp table for Athena to Nozomi upgrade to support copying of balances from old taccount to new taccount
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountBalanceCopy.eti;TmpTAccountBalanceCopy.eix;TmpTAccountBalanceCopy.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpTAccountBalanceCopy")
public class TmpTAccountBalanceCopy extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpTAccountBalanceCopy> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpTAccountBalanceCopy>("entity.TmpTAccountBalanceCopy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BALANCETOCOPY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BalanceToCopy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SOURCETACCOUNTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SourceTAccountType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TACCOUNTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TAccountID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPNUMCONTRIBUTINGTXNS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpNumContributingTxns");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpTAccountBalanceCopyInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpTAccountBalanceCopy()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpTAccountBalanceCopy(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpTAccountBalanceCopy(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpTAccountBalanceCopyInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpTAccountBalanceCopyInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the BalanceToCopy field.
   * The balance from the old t-account to copy to the new t-account
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getBalanceToCopy() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(BALANCETOCOPY_PROP.get());
  }
  
  /**
   * Gets the value of the SourceTAccountType field.
   * The type of the source taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getSourceTAccountType() {
    return (typekey.TAccountType)__getInternalInterface().getFieldValue(SOURCETACCOUNTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TAccountID field.
   * The ID of the t-account to update
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTAccountID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(TACCOUNTID_PROP.get());
  }
  
  /**
   * Gets the value of the TmpNumContributingTxns field.
   * The number of contributing txns to copy to the new t-account
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTmpNumContributingTxns() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get());
  }
  
  /**
   * Sets the value of the BalanceToCopy field.
   */
  public void setBalanceToCopy(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(BALANCETOCOPY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourceTAccountType field.
   */
  public void setSourceTAccountType(typekey.TAccountType value) {
    __getInternalInterface().setFieldValue(SOURCETACCOUNTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TAccountID field.
   */
  public void setTAccountID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(TACCOUNTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TmpNumContributingTxns field.
   */
  public void setTmpNumContributingTxns(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpTAccountBalanceCopyInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpTAccountBalanceCopy.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the BalanceToCopy field.
     * The balance from the old t-account to copy to the new t-account
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getBalanceToCopy() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(BALANCETOCOPY_PROP.get());
    }
    
    /**
     * Gets the value of the SourceTAccountType field.
     * The type of the source taccount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TAccountType getSourceTAccountType() {
      return (typekey.TAccountType)__getInternalInterface().getFieldValue(SOURCETACCOUNTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TAccountID field.
     * The ID of the t-account to update
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getTAccountID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(TACCOUNTID_PROP.get());
    }
    
    /**
     * Gets the value of the TmpNumContributingTxns field.
     * The number of contributing txns to copy to the new t-account
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTmpNumContributingTxns() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get());
    }
    
    /**
     * Sets the value of the BalanceToCopy field.
     */
    public void setBalanceToCopy(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(BALANCETOCOPY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceTAccountType field.
     */
    public void setSourceTAccountType(typekey.TAccountType value) {
      __getInternalInterface().setFieldValue(SOURCETACCOUNTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TAccountID field.
     */
    public void setTAccountID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(TACCOUNTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TmpNumContributingTxns field.
     */
    public void setTmpNumContributingTxns(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.taccount.entity.TmpTAccountBalanceCopy", "com.guidewire.cc.domain.financials.taccount.impl.TmpTAccountBalanceCopyImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpTAccountBalanceCopy.class, config);
    com.guidewire._generated.entity.TmpTAccountBalanceCopyInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpTAccountBalanceCopy, com.guidewire._generated.entity.TmpTAccountBalanceCopyInternal>() {
      public java.lang.Object getImplementation(entity.TmpTAccountBalanceCopy bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpTAccountBalanceCopyInternal getInternalInterface(entity.TmpTAccountBalanceCopy bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpTAccountBalanceCopy newEmptyInstance() {
        return new entity.TmpTAccountBalanceCopy((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}