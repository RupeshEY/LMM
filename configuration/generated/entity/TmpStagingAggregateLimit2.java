package entity;

/**
 * TmpStagingAggregateLimit2
 * Temporary table for setting rows as invalid in the aggregate limit denorm table, agglimitrpt, from the staging tables.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpStagingAggregateLimit2.eti;TmpStagingAggregateLimit2.eix;TmpStagingAggregateLimit2.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpStagingAggregateLimit2")
public class TmpStagingAggregateLimit2 extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpStagingAggregateLimit2> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpStagingAggregateLimit2>("entity.TmpStagingAggregateLimit2");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DENORMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DenormId");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpStagingAggregateLimit2Internal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpStagingAggregateLimit2()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpStagingAggregateLimit2(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpStagingAggregateLimit2(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpStagingAggregateLimit2Internal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpStagingAggregateLimit2Internal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the DenormId field.
   * Id of the denorm row in aggregatelimitrpt.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getDenormId() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(DENORMID_PROP.get());
  }
  
  /**
   * Sets the value of the DenormId field.
   */
  public void setDenormId(java.lang.Long value) {
    __getInternalInterface().setFieldValue(DENORMID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpStagingAggregateLimit2Internal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpStagingAggregateLimit2.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the DenormId field.
     * Id of the denorm row in aggregatelimitrpt.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getDenormId() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(DENORMID_PROP.get());
    }
    
    /**
     * Sets the value of the DenormId field.
     */
    public void setDenormId(java.lang.Long value) {
      __getInternalInterface().setFieldValue(DENORMID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.aggregatelimit.entity.TmpStagingAggregateLimit2", "com.guidewire.cc.domain.aggregatelimit.impl.TmpStagingAggregateLimit2Impl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpStagingAggregateLimit2.class, config);
    com.guidewire._generated.entity.TmpStagingAggregateLimit2InternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpStagingAggregateLimit2, com.guidewire._generated.entity.TmpStagingAggregateLimit2Internal>() {
      public java.lang.Object getImplementation(entity.TmpStagingAggregateLimit2 bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpStagingAggregateLimit2Internal getInternalInterface(entity.TmpStagingAggregateLimit2 bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpStagingAggregateLimit2 newEmptyInstance() {
        return new entity.TmpStagingAggregateLimit2((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}