package entity;

/**
 * TmpCheckRptIgnorePmts
 * Temp table used to store IDs of offsetting payments for voided/stopped checks, which should not be included in checkrpt grossamount values
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpCheckRptIgnorePmts.eti;TmpCheckRptIgnorePmts.eix;TmpCheckRptIgnorePmts.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpCheckRptIgnorePmts")
public class TmpCheckRptIgnorePmts extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpCheckRptIgnorePmts> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpCheckRptIgnorePmts>("entity.TmpCheckRptIgnorePmts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OFFSETPAYMENTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OffsetPaymentID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpCheckRptIgnorePmtsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpCheckRptIgnorePmts()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpCheckRptIgnorePmts(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpCheckRptIgnorePmts(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpCheckRptIgnorePmtsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpCheckRptIgnorePmtsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the CheckID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCheckID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKID_PROP.get());
  }
  
  /**
   * Gets the value of the OffsetPaymentID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getOffsetPaymentID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(OFFSETPAYMENTID_PROP.get());
  }
  
  /**
   * Sets the value of the CheckID field.
   */
  public void setCheckID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CHECKID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OffsetPaymentID field.
   */
  public void setOffsetPaymentID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(OFFSETPAYMENTID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpCheckRptIgnorePmtsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpCheckRptIgnorePmts.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the CheckID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getCheckID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKID_PROP.get());
    }
    
    /**
     * Gets the value of the OffsetPaymentID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getOffsetPaymentID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(OFFSETPAYMENTID_PROP.get());
    }
    
    /**
     * Sets the value of the CheckID field.
     */
    public void setCheckID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CHECKID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OffsetPaymentID field.
     */
    public void setOffsetPaymentID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(OFFSETPAYMENTID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.check.entity.TmpCheckRptIgnorePmts", "com.guidewire.cc.domain.financials.check.impl.TmpCheckRptIgnorePmtsImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpCheckRptIgnorePmts.class, config);
    com.guidewire._generated.entity.TmpCheckRptIgnorePmtsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpCheckRptIgnorePmts, com.guidewire._generated.entity.TmpCheckRptIgnorePmtsInternal>() {
      public java.lang.Object getImplementation(entity.TmpCheckRptIgnorePmts bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpCheckRptIgnorePmtsInternal getInternalInterface(entity.TmpCheckRptIgnorePmts bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpCheckRptIgnorePmts newEmptyInstance() {
        return new entity.TmpCheckRptIgnorePmts((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}