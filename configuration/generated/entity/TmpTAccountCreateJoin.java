package entity;

/**
 * TmpTAccountCreateJoin
 * Temp table for creation of TAccounts during staging table load.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountCreateJoin.eti;TmpTAccountCreateJoin.eix;TmpTAccountCreateJoin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpTAccountCreateJoin")
public class TmpTAccountCreateJoin extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpTAccountCreateJoin> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpTAccountCreateJoin>("entity.TmpTAccountCreateJoin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NORMALBALANCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NormalBalance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TYPE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Type");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpTAccountCreateJoinInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpTAccountCreateJoin()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpTAccountCreateJoin(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpTAccountCreateJoin(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpTAccountCreateJoinInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpTAccountCreateJoinInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the NormalBalance field.
   * Normal balance of the TAccount (i.e., Credit or Debit)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNormalBalance() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NORMALBALANCE_PROP.get());
  }
  
  /**
   * Gets the value of the Type field.
   * Type of a TAccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getType() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TYPE_PROP.get());
  }
  
  /**
   * Sets the value of the NormalBalance field.
   */
  public void setNormalBalance(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NORMALBALANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TYPE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpTAccountCreateJoinInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpTAccountCreateJoin.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the NormalBalance field.
     * Normal balance of the TAccount (i.e., Credit or Debit)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNormalBalance() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NORMALBALANCE_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     * Type of a TAccount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getType() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TYPE_PROP.get());
    }
    
    /**
     * Sets the value of the NormalBalance field.
     */
    public void setNormalBalance(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NORMALBALANCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Type field.
     */
    public void setType(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TYPE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.taccount.entity.TmpTAccountCreateJoin", "com.guidewire.cc.domain.financials.taccount.impl.TmpTAccountCreateJoinImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpTAccountCreateJoin.class, config);
    com.guidewire._generated.entity.TmpTAccountCreateJoinInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpTAccountCreateJoin, com.guidewire._generated.entity.TmpTAccountCreateJoinInternal>() {
      public java.lang.Object getImplementation(entity.TmpTAccountCreateJoin bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpTAccountCreateJoinInternal getInternalInterface(entity.TmpTAccountCreateJoin bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpTAccountCreateJoin newEmptyInstance() {
        return new entity.TmpTAccountCreateJoin((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}