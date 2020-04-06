package entity;

/**
 * TmpCheckSet
 * Temp table for upgrade to 3.1 checksets.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpCheckSet.eti;TmpCheckSet.eix;TmpCheckSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpCheckSet")
public class TmpCheckSet extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpCheckSet> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpCheckSet>("entity.TmpCheckSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TRANSACTIONSETID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TransactionSetID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpCheckSetInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpCheckSet()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpCheckSet(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpCheckSet(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpCheckSetInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpCheckSetInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the CheckID field.
   * Check id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCheckID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKID_PROP.get());
  }
  
  /**
   * Gets the value of the TransactionSetID field.
   * TransactionSet id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTransactionSetID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(TRANSACTIONSETID_PROP.get());
  }
  
  /**
   * Sets the value of the CheckID field.
   */
  public void setCheckID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CHECKID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TransactionSetID field.
   */
  public void setTransactionSetID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(TRANSACTIONSETID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpCheckSetInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpCheckSet.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the CheckID field.
     * Check id.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getCheckID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKID_PROP.get());
    }
    
    /**
     * Gets the value of the TransactionSetID field.
     * TransactionSet id.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getTransactionSetID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(TRANSACTIONSETID_PROP.get());
    }
    
    /**
     * Sets the value of the CheckID field.
     */
    public void setCheckID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CHECKID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransactionSetID field.
     */
    public void setTransactionSetID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(TRANSACTIONSETID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.check.entity.TmpCheckSet", "com.guidewire.cc.domain.financials.check.impl.TmpCheckSetImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpCheckSet.class, config);
    com.guidewire._generated.entity.TmpCheckSetInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpCheckSet, com.guidewire._generated.entity.TmpCheckSetInternal>() {
      public java.lang.Object getImplementation(entity.TmpCheckSet bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpCheckSetInternal getInternalInterface(entity.TmpCheckSet bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpCheckSet newEmptyInstance() {
        return new entity.TmpCheckSet((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}