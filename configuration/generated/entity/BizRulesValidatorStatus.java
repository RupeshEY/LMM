package entity;

/**
 * BizRulesValidatorStatus
 * Entity to keep track of status of Business Rule validation
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BizRulesValidatorStatus.eti;BizRulesValidatorStatus.eix;BizRulesValidatorStatus.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "BizRulesValidatorStatus")
public class BizRulesValidatorStatus extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.BizRulesValidatorStatus> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.BizRulesValidatorStatus>("entity.BizRulesValidatorStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONFIGFP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ConfigFP");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VALIDATEPID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ValidatePID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.BizRulesValidatorStatusInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public BizRulesValidatorStatus()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public BizRulesValidatorStatus(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected BizRulesValidatorStatus(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.BizRulesValidatorStatusInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.BizRulesValidatorStatusInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ConfigFP field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getConfigFP() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONFIGFP_PROP.get());
  }
  
  /**
   * Gets the value of the ValidatePID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getValidatePID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(VALIDATEPID_PROP.get());
  }
  
  /**
   * Sets the value of the ConfigFP field.
   */
  public void setConfigFP(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CONFIGFP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValidatePID field.
   */
  public void setValidatePID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(VALIDATEPID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.BizRulesValidatorStatusInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.BizRulesValidatorStatus.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the ConfigFP field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getConfigFP() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONFIGFP_PROP.get());
    }
    
    /**
     * Gets the value of the ValidatePID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getValidatePID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(VALIDATEPID_PROP.get());
    }
    
    /**
     * Sets the value of the ConfigFP field.
     */
    public void setConfigFP(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CONFIGFP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValidatePID field.
     */
    public void setValidatePID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(VALIDATEPID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.BizRulesValidatorStatus.class, config);
    com.guidewire._generated.entity.BizRulesValidatorStatusInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.BizRulesValidatorStatus, com.guidewire._generated.entity.BizRulesValidatorStatusInternal>() {
      public java.lang.Object getImplementation(entity.BizRulesValidatorStatus bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.BizRulesValidatorStatusInternal getInternalInterface(entity.BizRulesValidatorStatus bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.BizRulesValidatorStatus newEmptyInstance() {
        return new entity.BizRulesValidatorStatus((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}