package entity;

/**
 * TmpCheckRpt
 * temp table used for recalculating CheckRpt.GrossAmount values
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpCheckRpt.eti;TmpCheckRpt.eix;TmpCheckRpt.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpCheckRpt")
public class TmpCheckRpt extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpCheckRpt> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpCheckRpt>("entity.TmpCheckRpt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROSSAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GrossAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROSSCLAIMAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GrossClaimAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> GROSSRESERVINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "GrossReservingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RESERVINGCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReservingCurrency");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpCheckRptInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpCheckRpt()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpCheckRpt(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpCheckRpt(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpCheckRptInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpCheckRptInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the CheckID field.
   * The ID of the check to which the gross amount corresponds
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCheckID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKID_PROP.get());
  }
  
  /**
   * Gets the value of the Currency field.
   * The transaction currency of the Check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the GrossAmount field.
   * The gross amount of the check, in the check currency, to be updated to the CheckRpt table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the GrossClaimAmount field.
   * The gross amount of the check, in the claim currency, to be updated to the CheckRpt table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossClaimAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSCLAIMAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the GrossReservingAmount field.
   * The gross amount of the check, in the reserving currency, to be updated to the CheckRpt table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossReservingAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSRESERVINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the ReservingCurrency field.
   * The reserving currency of the Check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
  }
  
  /**
   * Sets the value of the CheckID field.
   */
  public void setCheckID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CHECKID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GrossAmount field.
   */
  public void setGrossAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(GROSSAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GrossClaimAmount field.
   */
  public void setGrossClaimAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(GROSSCLAIMAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GrossReservingAmount field.
   */
  public void setGrossReservingAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(GROSSRESERVINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpCheckRptInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpCheckRpt.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the CheckID field.
     * The ID of the check to which the gross amount corresponds
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getCheckID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKID_PROP.get());
    }
    
    /**
     * Gets the value of the Currency field.
     * The transaction currency of the Check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the GrossAmount field.
     * The gross amount of the check, in the check currency, to be updated to the CheckRpt table
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getGrossAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the GrossClaimAmount field.
     * The gross amount of the check, in the claim currency, to be updated to the CheckRpt table
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getGrossClaimAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSCLAIMAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the GrossReservingAmount field.
     * The gross amount of the check, in the reserving currency, to be updated to the CheckRpt table
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getGrossReservingAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(GROSSRESERVINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ReservingCurrency field.
     * The reserving currency of the Check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getReservingCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
    }
    
    /**
     * Sets the value of the CheckID field.
     */
    public void setCheckID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CHECKID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Currency field.
     */
    public void setCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GrossAmount field.
     */
    public void setGrossAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(GROSSAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GrossClaimAmount field.
     */
    public void setGrossClaimAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(GROSSCLAIMAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GrossReservingAmount field.
     */
    public void setGrossReservingAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(GROSSRESERVINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReservingCurrency field.
     */
    public void setReservingCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.check.entity.TmpCheckRpt", "com.guidewire.cc.domain.financials.check.impl.TmpCheckRptImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpCheckRpt.class, config);
    com.guidewire._generated.entity.TmpCheckRptInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpCheckRpt, com.guidewire._generated.entity.TmpCheckRptInternal>() {
      public java.lang.Object getImplementation(entity.TmpCheckRpt bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpCheckRptInternal getInternalInterface(entity.TmpCheckRpt bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpCheckRpt newEmptyInstance() {
        return new entity.TmpCheckRpt((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}