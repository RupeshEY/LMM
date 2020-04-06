package entity;

/**
 * TmpSearchColumns
 * 
 *         Temporary table to improve performance for PopulateSearchColumnBatchProcess.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpSearchColumns.eti;TmpSearchColumns.eix;TmpSearchColumns.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpSearchColumns")
public class TmpSearchColumns extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpSearchColumns> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpSearchColumns>("entity.TmpSearchColumns");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IntValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VARCHARVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VarCharValue");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpSearchColumnsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpSearchColumns()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpSearchColumns(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpSearchColumns(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpSearchColumnsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpSearchColumnsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ID field.
   * key id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ID_PROP.get());
  }
  
  /**
   * Gets the value of the IntValue field.
   * for populate int value based search columns
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(INTVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the VarCharValue field.
   * for populate varchar based value based search columns
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVarCharValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VARCHARVALUE_PROP.get());
  }
  
  /**
   * Sets the value of the ID field.
   */
  public void setID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IntValue field.
   */
  public void setIntValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(INTVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VarCharValue field.
   */
  public void setVarCharValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VARCHARVALUE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpSearchColumnsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpSearchColumns.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the ID field.
     * key id.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ID_PROP.get());
    }
    
    /**
     * Gets the value of the IntValue field.
     * for populate int value based search columns
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getIntValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(INTVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the VarCharValue field.
     * for populate varchar based value based search columns
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getVarCharValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VARCHARVALUE_PROP.get());
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IntValue field.
     */
    public void setIntValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(INTVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VarCharValue field.
     */
    public void setVarCharValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VARCHARVALUE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpSearchColumns.class, config);
    com.guidewire._generated.entity.TmpSearchColumnsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpSearchColumns, com.guidewire._generated.entity.TmpSearchColumnsInternal>() {
      public java.lang.Object getImplementation(entity.TmpSearchColumns bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpSearchColumnsInternal getInternalInterface(entity.TmpSearchColumns bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpSearchColumns newEmptyInstance() {
        return new entity.TmpSearchColumns((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}