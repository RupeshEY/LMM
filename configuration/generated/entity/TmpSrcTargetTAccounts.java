package entity;

/**
 * TmpSrcTargetTAccounts
 * Temp table for Athena to Nozomi upgrade to change which t-account certain taccountlineitems are pointing to
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpSrcTargetTAccounts.eti;TmpSrcTargetTAccounts.eix;TmpSrcTargetTAccounts.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpSrcTargetTAccounts")
public class TmpSrcTargetTAccounts extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpSrcTargetTAccounts> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpSrcTargetTAccounts>("entity.TmpSrcTargetTAccounts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LINEITEMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LineItemID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETTACCOUNTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetTAccountID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpSrcTargetTAccountsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpSrcTargetTAccounts()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpSrcTargetTAccounts(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpSrcTargetTAccounts(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpSrcTargetTAccountsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpSrcTargetTAccountsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the LineItemID field.
   * The taccountlineitem to update
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLineItemID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LINEITEMID_PROP.get());
  }
  
  /**
   * Gets the value of the TargetTAccountID field.
   * The ID of the new TAccount to set into the lineitem
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTargetTAccountID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(TARGETTACCOUNTID_PROP.get());
  }
  
  /**
   * Sets the value of the LineItemID field.
   */
  public void setLineItemID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LINEITEMID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetTAccountID field.
   */
  public void setTargetTAccountID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(TARGETTACCOUNTID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpSrcTargetTAccountsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpSrcTargetTAccounts.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the LineItemID field.
     * The taccountlineitem to update
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLineItemID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LINEITEMID_PROP.get());
    }
    
    /**
     * Gets the value of the TargetTAccountID field.
     * The ID of the new TAccount to set into the lineitem
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getTargetTAccountID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(TARGETTACCOUNTID_PROP.get());
    }
    
    /**
     * Sets the value of the LineItemID field.
     */
    public void setLineItemID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LINEITEMID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetTAccountID field.
     */
    public void setTargetTAccountID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(TARGETTACCOUNTID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.taccount.entity.TmpSrcTargetTAccounts", "com.guidewire.cc.domain.financials.taccount.impl.TmpSrcTargetTAccountsImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpSrcTargetTAccounts.class, config);
    com.guidewire._generated.entity.TmpSrcTargetTAccountsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpSrcTargetTAccounts, com.guidewire._generated.entity.TmpSrcTargetTAccountsInternal>() {
      public java.lang.Object getImplementation(entity.TmpSrcTargetTAccounts bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpSrcTargetTAccountsInternal getInternalInterface(entity.TmpSrcTargetTAccounts bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpSrcTargetTAccounts newEmptyInstance() {
        return new entity.TmpSrcTargetTAccounts((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}