package entity;

/**
 * TmpAggregateLimitOracle
 * Tmp table for populating the aggregate limit denorm table, agglimitrpt.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpAggregateLimitOracle.eti;TmpAggregateLimitOracle.eix;TmpAggregateLimitOracle.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpAggregateLimitOracle")
public class TmpAggregateLimitOracle extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpAggregateLimitOracle> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpAggregateLimitOracle>("entity.TmpAggregateLimitOracle");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> AGGLIMITCALCCRITERIA_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "AggLimitCalcCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COVERAGELINEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CoverageLineID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LIMITTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LimitType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYPERIODID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyPeriodID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALUETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ValueType");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpAggregateLimitOracleInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpAggregateLimitOracle()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpAggregateLimitOracle(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpAggregateLimitOracle(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpAggregateLimitOracleInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpAggregateLimitOracleInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AggLimitCalcCriteria field.
   * Exclusions for limit used calculations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria() {
    return (typekey.AggLimitCalcCriteria)__getInternalInterface().getFieldValue(AGGLIMITCALCCRITERIA_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageLineID field.
   * A foreign key to the CoverageLine.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCoverageLineID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(COVERAGELINEID_PROP.get());
  }
  
  /**
   * Gets the value of the LimitType field.
   * Aggregate limit type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateLimitType getLimitType() {
    return (typekey.AggregateLimitType)__getInternalInterface().getFieldValue(LIMITTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyPeriodID field.
   * A foreign key to the PolicyPeriod.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getPolicyPeriodID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(POLICYPERIODID_PROP.get());
  }
  
  /**
   * Gets the value of the ValueType field.
   * Aggregate type: limit or deductible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateType getValueType() {
    return (typekey.AggregateType)__getInternalInterface().getFieldValue(VALUETYPE_PROP.get());
  }
  
  /**
   * Sets the value of the AggLimitCalcCriteria field.
   */
  public void setAggLimitCalcCriteria(typekey.AggLimitCalcCriteria value) {
    __getInternalInterface().setFieldValue(AGGLIMITCALCCRITERIA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageLineID field.
   */
  public void setCoverageLineID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(COVERAGELINEID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.AggregateLimitType value) {
    __getInternalInterface().setFieldValue(LIMITTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyPeriodID field.
   */
  public void setPolicyPeriodID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(POLICYPERIODID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValueType field.
   */
  public void setValueType(typekey.AggregateType value) {
    __getInternalInterface().setFieldValue(VALUETYPE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpAggregateLimitOracleInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpAggregateLimitOracle.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the AggLimitCalcCriteria field.
     * Exclusions for limit used calculations
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria() {
      return (typekey.AggLimitCalcCriteria)__getInternalInterface().getFieldValue(AGGLIMITCALCCRITERIA_PROP.get());
    }
    
    /**
     * Gets the value of the CoverageLineID field.
     * A foreign key to the CoverageLine.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getCoverageLineID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(COVERAGELINEID_PROP.get());
    }
    
    /**
     * Gets the value of the LimitType field.
     * Aggregate limit type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AggregateLimitType getLimitType() {
      return (typekey.AggregateLimitType)__getInternalInterface().getFieldValue(LIMITTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyPeriodID field.
     * A foreign key to the PolicyPeriod.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getPolicyPeriodID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(POLICYPERIODID_PROP.get());
    }
    
    /**
     * Gets the value of the ValueType field.
     * Aggregate type: limit or deductible.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.AggregateType getValueType() {
      return (typekey.AggregateType)__getInternalInterface().getFieldValue(VALUETYPE_PROP.get());
    }
    
    /**
     * Sets the value of the AggLimitCalcCriteria field.
     */
    public void setAggLimitCalcCriteria(typekey.AggLimitCalcCriteria value) {
      __getInternalInterface().setFieldValue(AGGLIMITCALCCRITERIA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageLineID field.
     */
    public void setCoverageLineID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(COVERAGELINEID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LimitType field.
     */
    public void setLimitType(typekey.AggregateLimitType value) {
      __getInternalInterface().setFieldValue(LIMITTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyPeriodID field.
     */
    public void setPolicyPeriodID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(POLICYPERIODID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValueType field.
     */
    public void setValueType(typekey.AggregateType value) {
      __getInternalInterface().setFieldValue(VALUETYPE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.aggregatelimit.entity.TmpAggregateLimitOracle", "com.guidewire.cc.domain.aggregatelimit.impl.TmpAggregateLimitOracleImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpAggregateLimitOracle.class, config);
    com.guidewire._generated.entity.TmpAggregateLimitOracleInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpAggregateLimitOracle, com.guidewire._generated.entity.TmpAggregateLimitOracleInternal>() {
      public java.lang.Object getImplementation(entity.TmpAggregateLimitOracle bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpAggregateLimitOracleInternal getInternalInterface(entity.TmpAggregateLimitOracle bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpAggregateLimitOracle newEmptyInstance() {
        return new entity.TmpAggregateLimitOracle((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}