package entity;

/**
 * LoadExclusion
 * LUWIDs to be excluded by the loader.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadExclusion.eti;LoadExclusion.eix;LoadExclusion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "LoadExclusion")
public class LoadExclusion extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LoadExclusion> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LoadExclusion>("entity.LoadExclusion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LUWID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LUWID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.LoadExclusionInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public LoadExclusion()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public LoadExclusion(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected LoadExclusion(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.LoadExclusionInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.LoadExclusionInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the LUWID field.
   * Logical Unit of Work ID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLUWID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LUWID_PROP.get());
  }
  
  /**
   * Sets the value of the LUWID field.
   */
  public void setLUWID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LUWID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.LoadExclusionInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.LoadExclusion.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the LUWID field.
     * Logical Unit of Work ID
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLUWID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LUWID_PROP.get());
    }
    
    /**
     * Sets the value of the LUWID field.
     */
    public void setLUWID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LUWID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.LoadExclusion.class, config);
    com.guidewire._generated.entity.LoadExclusionInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.LoadExclusion, com.guidewire._generated.entity.LoadExclusionInternal>() {
      public java.lang.Object getImplementation(entity.LoadExclusion bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.LoadExclusionInternal getInternalInterface(entity.LoadExclusion bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.LoadExclusion newEmptyInstance() {
        return new entity.LoadExclusion((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}