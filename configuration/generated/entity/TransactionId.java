package entity;

/**
 * TransactionId
 * Transaction ids sent to create the illusion of idempotency
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionId.eti;TransactionId.eix;TransactionId.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TransactionId")
public class TransactionId extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TransactionId> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TransactionId>("entity.TransactionId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATIONTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreationTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "tid");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TransactionIdInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TransactionId()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TransactionId(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TransactionId(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TransactionIdInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TransactionIdInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the CreationTime field.
   * Time of creating the transaction id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreationTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATIONTIME_PROP.get());
  }
  
  /**
   * Gets the value of the tid field.
   * Unique transaction id
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String gettid() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TID_PROP.get());
  }
  
  /**
   * Sets the value of the CreationTime field.
   */
  private void setCreationTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATIONTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the tid field.
   */
  public void settid(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TransactionIdInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TransactionId.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the CreationTime field.
     * Time of creating the transaction id.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreationTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATIONTIME_PROP.get());
    }
    
    /**
     * Gets the value of the tid field.
     * Unique transaction id
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String gettid() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TID_PROP.get());
    }
    
    /**
     * Sets the value of the CreationTime field.
     */
    public void setCreationTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATIONTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the tid field.
     */
    public void settid(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TransactionId.class, config);
    com.guidewire._generated.entity.TransactionIdInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TransactionId, com.guidewire._generated.entity.TransactionIdInternal>() {
      public java.lang.Object getImplementation(entity.TransactionId bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TransactionIdInternal getInternalInterface(entity.TransactionId bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TransactionId newEmptyInstance() {
        return new entity.TransactionId((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}