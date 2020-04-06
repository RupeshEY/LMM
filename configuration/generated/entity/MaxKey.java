package entity;

/**
 * MaxKey
 * Maximum keys for each keyable entity type, used by key generator.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MaxKey.eti;MaxKey.eix;MaxKey.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "MaxKey")
public class MaxKey extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MaxKey> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MaxKey>("entity.MaxKey");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENTITYTABLENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EntityTableName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCKINGCOLUMN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LockingColumn");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAXKEY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MaxKey");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.MaxKeyInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public MaxKey()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public MaxKey(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected MaxKey(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.MaxKeyInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.MaxKeyInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the EntityTableName field.
   * Name of table for keyable entity type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntityTableName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ENTITYTABLENAME_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
  }
  
  /**
   * Gets the value of the MaxKey field.
   * Current maximum key for the entity type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMaxKey() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(MAXKEY_PROP.get());
  }
  
  /**
   * Sets the value of the EntityTableName field.
   */
  public void setEntityTableName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ENTITYTABLENAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LockingColumn field.
   */
  private void setLockingColumn(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MaxKey field.
   */
  public void setMaxKey(java.lang.Long value) {
    __getInternalInterface().setFieldValue(MAXKEY_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.MaxKeyInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.MaxKey.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the EntityTableName field.
     * Name of table for keyable entity type
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEntityTableName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ENTITYTABLENAME_PROP.get());
    }
    
    /**
     * Gets the value of the LockingColumn field.
     * Meaningless column for locking
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLockingColumn() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
    }
    
    /**
     * Gets the value of the MaxKey field.
     * Current maximum key for the entity type
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getMaxKey() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(MAXKEY_PROP.get());
    }
    
    /**
     * Sets the value of the EntityTableName field.
     */
    public void setEntityTableName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ENTITYTABLENAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LockingColumn field.
     */
    public void setLockingColumn(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MaxKey field.
     */
    public void setMaxKey(java.lang.Long value) {
      __getInternalInterface().setFieldValue(MAXKEY_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.MaxKey.class, config);
    com.guidewire._generated.entity.MaxKeyInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.MaxKey, com.guidewire._generated.entity.MaxKeyInternal>() {
      public java.lang.Object getImplementation(entity.MaxKey bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MaxKeyInternal getInternalInterface(entity.MaxKey bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.MaxKey newEmptyInstance() {
        return new entity.MaxKey((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}