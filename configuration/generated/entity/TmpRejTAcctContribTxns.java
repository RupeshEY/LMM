package entity;

/**
 * TmpRejTAcctContribTxns
 * Temp table for Athena to Nozomi upgrade to use for speeding up population of the tmptacctbalancecopy table.  Aggregate contributing transaction counts here.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpRejTAcctContribTxns.eti;TmpRejTAcctContribTxns.eix;TmpRejTAcctContribTxns.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpRejTAcctContribTxns")
public class TmpRejTAcctContribTxns extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpRejTAcctContribTxns> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpRejTAcctContribTxns>("entity.TmpRejTAcctContribTxns");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMCREDITINGTXNS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumCreditingTxns");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMDEBITINGTXNS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumDebitingTxns");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TACCOUNTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TAccountID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpRejTAcctContribTxnsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpRejTAcctContribTxns()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpRejTAcctContribTxns(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpRejTAcctContribTxns(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpRejTAcctContribTxnsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpRejTAcctContribTxnsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the NumCreditingTxns field.
   * The number of transactions currently crediting this taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumCreditingTxns() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMCREDITINGTXNS_PROP.get());
  }
  
  /**
   * Gets the value of the NumDebitingTxns field.
   * The number of transactions currently debiting this taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumDebitingTxns() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMDEBITINGTXNS_PROP.get());
  }
  
  /**
   * Gets the value of the TAccountID field.
   * The ID of the t-account in question
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTAccountID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(TACCOUNTID_PROP.get());
  }
  
  /**
   * Sets the value of the NumCreditingTxns field.
   */
  public void setNumCreditingTxns(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NUMCREDITINGTXNS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumDebitingTxns field.
   */
  public void setNumDebitingTxns(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NUMDEBITINGTXNS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TAccountID field.
   */
  public void setTAccountID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(TACCOUNTID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpRejTAcctContribTxnsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpRejTAcctContribTxns.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the NumCreditingTxns field.
     * The number of transactions currently crediting this taccount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNumCreditingTxns() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMCREDITINGTXNS_PROP.get());
    }
    
    /**
     * Gets the value of the NumDebitingTxns field.
     * The number of transactions currently debiting this taccount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNumDebitingTxns() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMDEBITINGTXNS_PROP.get());
    }
    
    /**
     * Gets the value of the TAccountID field.
     * The ID of the t-account in question
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getTAccountID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(TACCOUNTID_PROP.get());
    }
    
    /**
     * Sets the value of the NumCreditingTxns field.
     */
    public void setNumCreditingTxns(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NUMCREDITINGTXNS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumDebitingTxns field.
     */
    public void setNumDebitingTxns(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NUMDEBITINGTXNS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TAccountID field.
     */
    public void setTAccountID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(TACCOUNTID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.taccount.entity.TmpRejTAcctContribTxns", "com.guidewire.cc.domain.financials.taccount.impl.TmpRejTAcctContribTxnsImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpRejTAcctContribTxns.class, config);
    com.guidewire._generated.entity.TmpRejTAcctContribTxnsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpRejTAcctContribTxns, com.guidewire._generated.entity.TmpRejTAcctContribTxnsInternal>() {
      public java.lang.Object getImplementation(entity.TmpRejTAcctContribTxns bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpRejTAcctContribTxnsInternal getInternalInterface(entity.TmpRejTAcctContribTxns bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpRejTAcctContribTxns newEmptyInstance() {
        return new entity.TmpRejTAcctContribTxns((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}