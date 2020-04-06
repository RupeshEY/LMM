package entity;

/**
 * UpgradeSchemaVersion
 * Stores version number of upgrade instrumentation schema to control upgrading these tables.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeSchemaVersion.eti;UpgradeSchemaVersion.eix;UpgradeSchemaVersion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "UpgradeSchemaVersion")
public class UpgradeSchemaVersion extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.UpgradeSchemaVersion> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.UpgradeSchemaVersion>("entity.UpgradeSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPGRADESCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpgradeSchemaVersion");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.UpgradeSchemaVersionInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public UpgradeSchemaVersion()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public UpgradeSchemaVersion(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected UpgradeSchemaVersion(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.UpgradeSchemaVersionInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.UpgradeSchemaVersionInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the Name field.
   * Column for unique index
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  /**
   * Gets the value of the UpgradeSchemaVersion field.
   * Upgrade instrumentation schema version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getUpgradeSchemaVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(UPGRADESCHEMAVERSION_PROP.get());
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpgradeSchemaVersion field.
   */
  public void setUpgradeSchemaVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(UPGRADESCHEMAVERSION_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.UpgradeSchemaVersionInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.UpgradeSchemaVersion.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the Name field.
     * Column for unique index
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    /**
     * Gets the value of the UpgradeSchemaVersion field.
     * Upgrade instrumentation schema version.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getUpgradeSchemaVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(UPGRADESCHEMAVERSION_PROP.get());
    }
    
    /**
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpgradeSchemaVersion field.
     */
    public void setUpgradeSchemaVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(UPGRADESCHEMAVERSION_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.UpgradeSchemaVersion.class, config);
    com.guidewire._generated.entity.UpgradeSchemaVersionInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.UpgradeSchemaVersion, com.guidewire._generated.entity.UpgradeSchemaVersionInternal>() {
      public java.lang.Object getImplementation(entity.UpgradeSchemaVersion bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.UpgradeSchemaVersionInternal getInternalInterface(entity.UpgradeSchemaVersion bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.UpgradeSchemaVersion newEmptyInstance() {
        return new entity.UpgradeSchemaVersion((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}