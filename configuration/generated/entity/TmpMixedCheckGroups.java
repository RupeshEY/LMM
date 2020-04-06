package entity;

/**
 * TmpMixedCheckGroups
 * Temp table used to store IDs of CheckGroups that have a mixture of canceled (i.e., voided/stopped) and non-canceled checks.  This would only happen if one or more checks in the group were reissued
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpMixedCheckGroups.eti;TmpMixedCheckGroups.eix;TmpMixedCheckGroups.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpMixedCheckGroups")
public class TmpMixedCheckGroups extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpMixedCheckGroups> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpMixedCheckGroups>("entity.TmpMixedCheckGroups");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKGROUPID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckGroupID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HASMIXEDCHECKS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HasMixedChecks");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpMixedCheckGroupsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpMixedCheckGroups()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpMixedCheckGroups(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpMixedCheckGroups(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpMixedCheckGroupsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpMixedCheckGroupsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the CheckGroupID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCheckGroupID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKGROUPID_PROP.get());
  }
  
  /**
   * Gets the value of the HasMixedChecks field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isHasMixedChecks() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(HASMIXEDCHECKS_PROP.get());
  }
  
  /**
   * Sets the value of the CheckGroupID field.
   */
  public void setCheckGroupID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CHECKGROUPID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HasMixedChecks field.
   */
  public void setHasMixedChecks(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(HASMIXEDCHECKS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpMixedCheckGroupsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpMixedCheckGroups.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the CheckGroupID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getCheckGroupID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKGROUPID_PROP.get());
    }
    
    /**
     * Gets the value of the HasMixedChecks field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isHasMixedChecks() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(HASMIXEDCHECKS_PROP.get());
    }
    
    /**
     * Sets the value of the CheckGroupID field.
     */
    public void setCheckGroupID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CHECKGROUPID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HasMixedChecks field.
     */
    public void setHasMixedChecks(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(HASMIXEDCHECKS_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.check.entity.TmpMixedCheckGroups", "com.guidewire.cc.domain.financials.check.impl.TmpMixedCheckGroupsImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpMixedCheckGroups.class, config);
    com.guidewire._generated.entity.TmpMixedCheckGroupsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpMixedCheckGroups, com.guidewire._generated.entity.TmpMixedCheckGroupsInternal>() {
      public java.lang.Object getImplementation(entity.TmpMixedCheckGroups bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpMixedCheckGroupsInternal getInternalInterface(entity.TmpMixedCheckGroups bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpMixedCheckGroups newEmptyInstance() {
        return new entity.TmpMixedCheckGroups((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}