package entity;

/**
 * LoadErrorRow
 * Error rows found by the loader.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadErrorRow.eti;LoadErrorRow.eix;LoadErrorRow.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "LoadErrorRow")
public class LoadErrorRow extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LoadErrorRow> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LoadErrorRow>("entity.LoadErrorRow");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ERRORID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ErrorID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ERRORROWID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ErrorRowID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LUWID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LUWID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ROWNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RowNumber");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.LoadErrorRowInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public LoadErrorRow()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public LoadErrorRow(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected LoadErrorRow(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.LoadErrorRowInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.LoadErrorRowInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ErrorID field.
   * Virtual foreign key to loaderror table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorID() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ERRORID_PROP.get());
  }
  
  /**
   * Gets the value of the ErrorRowID field.
   * Load error row ID, to ensure uniqueness.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorRowID() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ERRORROWID_PROP.get());
  }
  
  /**
   * Gets the value of the LUWID field.
   * Logical Unit of Work ID, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLUWID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LUWID_PROP.get());
  }
  
  /**
   * Gets the value of the RowNumber field.
   * Row number, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRowNumber() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ROWNUMBER_PROP.get());
  }
  
  /**
   * Sets the value of the ErrorID field.
   */
  public void setErrorID(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ERRORID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ErrorRowID field.
   */
  public void setErrorRowID(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ERRORROWID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LUWID field.
   */
  public void setLUWID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LUWID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RowNumber field.
   */
  public void setRowNumber(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ROWNUMBER_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.LoadErrorRowInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.LoadErrorRow.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the ErrorID field.
     * Virtual foreign key to loaderror table
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getErrorID() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ERRORID_PROP.get());
    }
    
    /**
     * Gets the value of the ErrorRowID field.
     * Load error row ID, to ensure uniqueness.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getErrorRowID() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ERRORROWID_PROP.get());
    }
    
    /**
     * Gets the value of the LUWID field.
     * Logical Unit of Work ID, if applicable.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLUWID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LUWID_PROP.get());
    }
    
    /**
     * Gets the value of the RowNumber field.
     * Row number, if applicable.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRowNumber() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ROWNUMBER_PROP.get());
    }
    
    /**
     * Sets the value of the ErrorID field.
     */
    public void setErrorID(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ERRORID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ErrorRowID field.
     */
    public void setErrorRowID(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ERRORROWID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LUWID field.
     */
    public void setLUWID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LUWID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RowNumber field.
     */
    public void setRowNumber(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ROWNUMBER_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.LoadErrorRow.class, config);
    com.guidewire._generated.entity.LoadErrorRowInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.LoadErrorRow, com.guidewire._generated.entity.LoadErrorRowInternal>() {
      public java.lang.Object getImplementation(entity.LoadErrorRow bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.LoadErrorRowInternal getInternalInterface(entity.LoadErrorRow bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.LoadErrorRow newEmptyInstance() {
        return new entity.LoadErrorRow((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}