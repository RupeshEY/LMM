package entity;

/**
 * TmpTAcctContribTxns
 * Temp table for setting the Number of contributing transactions for each taccount during 4.0 to Nozomi upgrade
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAcctContribTxns.eti;TmpTAcctContribTxns.eix;TmpTAcctContribTxns.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpTAcctContribTxns")
public class TmpTAcctContribTxns extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpTAcctContribTxns> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpTAcctContribTxns>("entity.TmpTAcctContribTxns");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TACCOUNTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TAccountID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPNUMCONTRIBUTINGTXNS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpNumContributingTxns");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpTAcctContribTxnsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpTAcctContribTxns()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpTAcctContribTxns(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpTAcctContribTxns(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpTAcctContribTxnsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpTAcctContribTxnsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the TAccountID field.
   * primary key of the taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTAccountID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(TACCOUNTID_PROP.get());
  }
  
  /**
   * Gets the value of the TmpNumContributingTxns field.
   * count of the # of contributing txns
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTmpNumContributingTxns() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get());
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpTAcctContribTxnsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpTAcctContribTxns.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the TAccountID field.
     * primary key of the taccount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getTAccountID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(TACCOUNTID_PROP.get());
    }
    
    /**
     * Gets the value of the TmpNumContributingTxns field.
     * count of the # of contributing txns
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTmpNumContributingTxns() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get());
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
    config.put("gw.cc.financials.taccount.entity.TmpTAcctContribTxns", "com.guidewire.cc.domain.financials.taccount.impl.TmpTAcctContribTxnsImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpTAcctContribTxns.class, config);
    com.guidewire._generated.entity.TmpTAcctContribTxnsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpTAcctContribTxns, com.guidewire._generated.entity.TmpTAcctContribTxnsInternal>() {
      public java.lang.Object getImplementation(entity.TmpTAcctContribTxns bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpTAcctContribTxnsInternal getInternalInterface(entity.TmpTAcctContribTxns bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpTAcctContribTxns newEmptyInstance() {
        return new entity.TmpTAcctContribTxns((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}