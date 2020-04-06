package entity;

/**
 * RollingUpgradeConfig
 * Entity to keep track of rolling upgrades.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RollingUpgradeConfig.eti;RollingUpgradeConfig.eix;RollingUpgradeConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RollingUpgradeConfig")
public class RollingUpgradeConfig extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RollingUpgradeConfig> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RollingUpgradeConfig>("entity.RollingUpgradeConfig");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONFIG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "config");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "source");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.RollingUpgradeConfigInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public RollingUpgradeConfig()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public RollingUpgradeConfig(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RollingUpgradeConfig(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.RollingUpgradeConfigInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.RollingUpgradeConfigInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the config field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getconfig() {
    return (gw.lang.Blob)__getInternalInterface().getFieldValue(CONFIG_PROP.get());
  }
  
  /**
   * Gets the value of the source field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean issource() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SOURCE_PROP.get());
  }
  
  /**
   * Sets the value of the config field.
   */
  public void setconfig(gw.lang.Blob value) {
    __getInternalInterface().setFieldValue(CONFIG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the source field.
   */
  public void setsource(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SOURCE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RollingUpgradeConfigInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RollingUpgradeConfig.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the config field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.lang.Blob getconfig() {
      return (gw.lang.Blob)__getInternalInterface().getFieldValue(CONFIG_PROP.get());
    }
    
    /**
     * Gets the value of the source field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean issource() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SOURCE_PROP.get());
    }
    
    /**
     * Sets the value of the config field.
     */
    public void setconfig(gw.lang.Blob value) {
      __getInternalInterface().setFieldValue(CONFIG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the source field.
     */
    public void setsource(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SOURCE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RollingUpgradeConfig.class, config);
    com.guidewire._generated.entity.RollingUpgradeConfigInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RollingUpgradeConfig, com.guidewire._generated.entity.RollingUpgradeConfigInternal>() {
      public java.lang.Object getImplementation(entity.RollingUpgradeConfig bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RollingUpgradeConfigInternal getInternalInterface(entity.RollingUpgradeConfig bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RollingUpgradeConfig newEmptyInstance() {
        return new entity.RollingUpgradeConfig((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}