package entity;

/**
 * EncryptedColumnRegistryEntry
 * Stores metadata for each encrypted column in the database.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EncryptedColumnRegistryEntry.eti;EncryptedColumnRegistryEntry.eix;EncryptedColumnRegistryEntry.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "EncryptedColumnRegistryEntry")
public class EncryptedColumnRegistryEntry extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.EncryptedColumnRegistryEntry> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.EncryptedColumnRegistryEntry>("entity.EncryptedColumnRegistryEntry");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COLUMNNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ColumnName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TABLENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TableName");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.EncryptedColumnRegistryEntryInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public EncryptedColumnRegistryEntry()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public EncryptedColumnRegistryEntry(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected EncryptedColumnRegistryEntry(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.EncryptedColumnRegistryEntryInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.EncryptedColumnRegistryEntryInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ColumnName field.
   * Name of the column
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColumnName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COLUMNNAME_PROP.get());
  }
  
  /**
   * Gets the value of the TableName field.
   * Name of the table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TABLENAME_PROP.get());
  }
  
  /**
   * Sets the value of the ColumnName field.
   */
  public void setColumnName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COLUMNNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TABLENAME_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.EncryptedColumnRegistryEntryInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.EncryptedColumnRegistryEntry.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the ColumnName field.
     * Name of the column
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getColumnName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COLUMNNAME_PROP.get());
    }
    
    /**
     * Gets the value of the TableName field.
     * Name of the table.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTableName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TABLENAME_PROP.get());
    }
    
    /**
     * Sets the value of the ColumnName field.
     */
    public void setColumnName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COLUMNNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TableName field.
     */
    public void setTableName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TABLENAME_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.EncryptedColumnRegistryEntry.class, config);
    com.guidewire._generated.entity.EncryptedColumnRegistryEntryInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.EncryptedColumnRegistryEntry, com.guidewire._generated.entity.EncryptedColumnRegistryEntryInternal>() {
      public java.lang.Object getImplementation(entity.EncryptedColumnRegistryEntry bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.EncryptedColumnRegistryEntryInternal getInternalInterface(entity.EncryptedColumnRegistryEntry bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.EncryptedColumnRegistryEntry newEmptyInstance() {
        return new entity.EncryptedColumnRegistryEntry((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}