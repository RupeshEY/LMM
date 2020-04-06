package entity;

/**
 * TmpTAccountReserveLine
 * Temp table for upgrade to taccounts populating reserve line.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountReserveLine.eti;TmpTAccountReserveLine.eix;TmpTAccountReserveLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpTAccountReserveLine")
public class TmpTAccountReserveLine extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpTAccountReserveLine> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpTAccountReserveLine>("entity.TmpTAccountReserveLine");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TACCOUNTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TAccountID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TACCOUNTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TAccountType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPNUMCONTRIBUTINGTXNS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpNumContributingTxns");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TMPRESERVELINEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TmpReserveLineID");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpTAccountReserveLineInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpTAccountReserveLine()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpTAccountReserveLine(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpTAccountReserveLine(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpTAccountReserveLineInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpTAccountReserveLineInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the TAccountID field.
   * Temp TAccount ID.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTAccountID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(TACCOUNTID_PROP.get());
  }
  
  /**
   * Gets the value of the TAccountType field.
   * type of the taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getTAccountType() {
    return (typekey.TAccountType)__getInternalInterface().getFieldValue(TACCOUNTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TmpNumContributingTxns field.
   * The number of transactions currently contributing to this taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTmpNumContributingTxns() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get());
  }
  
  /**
   * Gets the value of the TmpReserveLineID field.
   * Temp ReserveLine ID.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTmpReserveLineID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(TMPRESERVELINEID_PROP.get());
  }
  
  /**
   * Sets the value of the TAccountID field.
   */
  public void setTAccountID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(TACCOUNTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TAccountType field.
   */
  public void setTAccountType(typekey.TAccountType value) {
    __getInternalInterface().setFieldValue(TACCOUNTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TmpNumContributingTxns field.
   */
  public void setTmpNumContributingTxns(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TmpReserveLineID field.
   */
  public void setTmpReserveLineID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(TMPRESERVELINEID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpTAccountReserveLineInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpTAccountReserveLine.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the TAccountID field.
     * Temp TAccount ID.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getTAccountID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(TACCOUNTID_PROP.get());
    }
    
    /**
     * Gets the value of the TAccountType field.
     * type of the taccount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TAccountType getTAccountType() {
      return (typekey.TAccountType)__getInternalInterface().getFieldValue(TACCOUNTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TmpNumContributingTxns field.
     * The number of transactions currently contributing to this taccount
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTmpNumContributingTxns() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get());
    }
    
    /**
     * Gets the value of the TmpReserveLineID field.
     * Temp ReserveLine ID.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getTmpReserveLineID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(TMPRESERVELINEID_PROP.get());
    }
    
    /**
     * Sets the value of the TAccountID field.
     */
    public void setTAccountID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(TACCOUNTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TAccountType field.
     */
    public void setTAccountType(typekey.TAccountType value) {
      __getInternalInterface().setFieldValue(TACCOUNTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TmpNumContributingTxns field.
     */
    public void setTmpNumContributingTxns(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TMPNUMCONTRIBUTINGTXNS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TmpReserveLineID field.
     */
    public void setTmpReserveLineID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(TMPRESERVELINEID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.taccount.entity.TmpTAccountReserveLine", "com.guidewire.cc.domain.financials.taccount.impl.TmpTAccountReserveLineImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpTAccountReserveLine.class, config);
    com.guidewire._generated.entity.TmpTAccountReserveLineInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpTAccountReserveLine, com.guidewire._generated.entity.TmpTAccountReserveLineInternal>() {
      public java.lang.Object getImplementation(entity.TmpTAccountReserveLine bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpTAccountReserveLineInternal getInternalInterface(entity.TmpTAccountReserveLine bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpTAccountReserveLine newEmptyInstance() {
        return new entity.TmpTAccountReserveLine((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}