package entity;

/**
 * TmpCheckRptCheckGroup
 * Temp table used for recalculating CheckRpt.GrossAmount values for checks that are part of a group (i.e., primary and secondary payee checks)
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpCheckRptCheckGroup.eti;TmpCheckRptCheckGroup.eix;TmpCheckRptCheckGroup.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpCheckRptCheckGroup")
public class TmpCheckRptCheckGroup extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpCheckRptCheckGroup> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpCheckRptCheckGroup>("entity.TmpCheckRptCheckGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKGROUPID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckGroupID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RESERVINGCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReservingCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPAYMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalPayments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPAYMENTSCLAIMAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalPaymentsClaimAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPAYMENTSRESERVINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalPaymentsReservingAmount");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpCheckRptCheckGroupInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpCheckRptCheckGroup()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpCheckRptCheckGroup(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpCheckRptCheckGroup(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpCheckRptCheckGroupInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpCheckRptCheckGroupInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the CheckGroupID field.
   * The ID of the CheckGroup to which the aggregates correspond
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCheckGroupID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKGROUPID_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
  }
  
  /**
   * Gets the value of the TotalPayments field.
   * Total payments for the primary check of the CheckGroup in the Check Currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPayments() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the TotalPaymentsClaimAmount field.
   * Total payments for the primary check of the CheckGroup in the Claim Currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPaymentsClaimAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTSCLAIMAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the TotalPaymentsReservingAmount field.
   * Total payments for the primary check of the CheckGroup in the Reserving Currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPaymentsReservingAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTSRESERVINGAMOUNT_PROP.get());
  }
  
  /**
   * Sets the value of the CheckGroupID field.
   */
  public void setCheckGroupID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CHECKGROUPID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Currency field.
   */
  private void setCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  private void setReservingCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalPayments field.
   */
  public void setTotalPayments(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALPAYMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalPaymentsClaimAmount field.
   */
  public void setTotalPaymentsClaimAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALPAYMENTSCLAIMAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalPaymentsReservingAmount field.
   */
  public void setTotalPaymentsReservingAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALPAYMENTSRESERVINGAMOUNT_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpCheckRptCheckGroupInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpCheckRptCheckGroup.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the CheckGroupID field.
     * The ID of the CheckGroup to which the aggregates correspond
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getCheckGroupID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CHECKGROUPID_PROP.get());
    }
    
    /**
     * Gets the value of the Currency field.
     * The transaction currency of the checks in this group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the ReservingCurrency field.
     * The reserving currency of the checks in this group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getReservingCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
    }
    
    /**
     * Gets the value of the TotalPayments field.
     * Total payments for the primary check of the CheckGroup in the Check Currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalPayments() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the TotalPaymentsClaimAmount field.
     * Total payments for the primary check of the CheckGroup in the Claim Currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalPaymentsClaimAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTSCLAIMAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the TotalPaymentsReservingAmount field.
     * Total payments for the primary check of the CheckGroup in the Reserving Currency
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalPaymentsReservingAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTSRESERVINGAMOUNT_PROP.get());
    }
    
    /**
     * Sets the value of the CheckGroupID field.
     */
    public void setCheckGroupID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CHECKGROUPID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Currency field.
     */
    public void setCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(CURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReservingCurrency field.
     */
    public void setReservingCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalPayments field.
     */
    public void setTotalPayments(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALPAYMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalPaymentsClaimAmount field.
     */
    public void setTotalPaymentsClaimAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALPAYMENTSCLAIMAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalPaymentsReservingAmount field.
     */
    public void setTotalPaymentsReservingAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALPAYMENTSRESERVINGAMOUNT_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.check.entity.TmpCheckRptCheckGroup", "com.guidewire.cc.domain.financials.check.impl.TmpCheckRptCheckGroupImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpCheckRptCheckGroup.class, config);
    com.guidewire._generated.entity.TmpCheckRptCheckGroupInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpCheckRptCheckGroup, com.guidewire._generated.entity.TmpCheckRptCheckGroupInternal>() {
      public java.lang.Object getImplementation(entity.TmpCheckRptCheckGroup bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpCheckRptCheckGroupInternal getInternalInterface(entity.TmpCheckRptCheckGroup bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpCheckRptCheckGroup newEmptyInstance() {
        return new entity.TmpCheckRptCheckGroup((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}