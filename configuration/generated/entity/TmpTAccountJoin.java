package entity;

/**
 * TmpTAccountJoin
 * Temp table for Athena to Nozomi upgrade - used to help with creation of new rejection taccounts
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountJoin.eti;TmpTAccountJoin.eix;TmpTAccountJoin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpTAccountJoin")
public class TmpTAccountJoin extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpTAccountJoin> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpTAccountJoin>("entity.TmpTAccountJoin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWTACCOUNTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewTAccountID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OLDTACCOUNTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OldTAccountID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> OLDTACCOUNTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "OldTAccountType");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpTAccountJoinInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpTAccountJoin()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpTAccountJoin(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpTAccountJoin(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpTAccountJoinInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpTAccountJoinInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the NewTAccountID field.
   * ID of the new taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNewTAccountID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NEWTACCOUNTID_PROP.get());
  }
  
  /**
   * Gets the value of the OldTAccountID field.
   * ID of the old taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getOldTAccountID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(OLDTACCOUNTID_PROP.get());
  }
  
  /**
   * Gets the value of the OldTAccountType field.
   * Type of the old taccount (i.e., either Reserves or RecoveryReserves)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getOldTAccountType() {
    return (typekey.TAccountType)__getInternalInterface().getFieldValue(OLDTACCOUNTTYPE_PROP.get());
  }
  
  /**
   * Sets the value of the NewTAccountID field.
   */
  public void setNewTAccountID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NEWTACCOUNTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OldTAccountID field.
   */
  public void setOldTAccountID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(OLDTACCOUNTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OldTAccountType field.
   */
  public void setOldTAccountType(typekey.TAccountType value) {
    __getInternalInterface().setFieldValue(OLDTACCOUNTTYPE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpTAccountJoinInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpTAccountJoin.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the NewTAccountID field.
     * ID of the new taccount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNewTAccountID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NEWTACCOUNTID_PROP.get());
    }
    
    /**
     * Gets the value of the OldTAccountID field.
     * ID of the old taccount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getOldTAccountID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(OLDTACCOUNTID_PROP.get());
    }
    
    /**
     * Gets the value of the OldTAccountType field.
     * Type of the old taccount (i.e., either Reserves or RecoveryReserves)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TAccountType getOldTAccountType() {
      return (typekey.TAccountType)__getInternalInterface().getFieldValue(OLDTACCOUNTTYPE_PROP.get());
    }
    
    /**
     * Sets the value of the NewTAccountID field.
     */
    public void setNewTAccountID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NEWTACCOUNTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OldTAccountID field.
     */
    public void setOldTAccountID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(OLDTACCOUNTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OldTAccountType field.
     */
    public void setOldTAccountType(typekey.TAccountType value) {
      __getInternalInterface().setFieldValue(OLDTACCOUNTTYPE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.taccount.entity.TmpTAccountJoin", "com.guidewire.cc.domain.financials.taccount.impl.TmpTAccountJoinImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpTAccountJoin.class, config);
    com.guidewire._generated.entity.TmpTAccountJoinInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpTAccountJoin, com.guidewire._generated.entity.TmpTAccountJoinInternal>() {
      public java.lang.Object getImplementation(entity.TmpTAccountJoin bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpTAccountJoinInternal getInternalInterface(entity.TmpTAccountJoin bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpTAccountJoin newEmptyInstance() {
        return new entity.TmpTAccountJoin((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}