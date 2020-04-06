package entity;

/**
 * TmpStagingAggregateLimit
 * Temporary table for populating the aggregate limit denorm table, agglimitrpt, from the staging tables.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpStagingAggregateLimit.eti;TmpStagingAggregateLimit.eix;TmpStagingAggregateLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpStagingAggregateLimit")
public class TmpStagingAggregateLimit extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpStagingAggregateLimit> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpStagingAggregateLimit>("entity.TmpStagingAggregateLimit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AGGLIMITCALCCRITERIA_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AggLimitCalcCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COVERAGELINEID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CoverageLineID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LIMITTYPE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LimitType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYPERIODID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyPeriodID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VALUETYPE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ValueType");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpStagingAggregateLimitInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpStagingAggregateLimit()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpStagingAggregateLimit(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpStagingAggregateLimit(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpStagingAggregateLimitInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpStagingAggregateLimitInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AggLimitCalcCriteria field.
   * Exclusions for limit used calculations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAggLimitCalcCriteria() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AGGLIMITCALCCRITERIA_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageLineID field.
   * Publicid of the CoverageLine.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCoverageLineID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COVERAGELINEID_PROP.get());
  }
  
  /**
   * Gets the value of the LimitType field.
   * Aggregate limit type code.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLimitType() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LIMITTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyPeriodID field.
   * Publicid of the PolicyPeriod.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyPeriodID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYPERIODID_PROP.get());
  }
  
  /**
   * Gets the value of the ValueType field.
   * Aggregate type code: limit or deductible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValueType() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VALUETYPE_PROP.get());
  }
  
  /**
   * Sets the value of the AggLimitCalcCriteria field.
   */
  public void setAggLimitCalcCriteria(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(AGGLIMITCALCCRITERIA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageLineID field.
   */
  public void setCoverageLineID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COVERAGELINEID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LIMITTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyPeriodID field.
   */
  public void setPolicyPeriodID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYPERIODID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValueType field.
   */
  public void setValueType(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VALUETYPE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpStagingAggregateLimitInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpStagingAggregateLimit.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the AggLimitCalcCriteria field.
     * Exclusions for limit used calculations.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAggLimitCalcCriteria() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AGGLIMITCALCCRITERIA_PROP.get());
    }
    
    /**
     * Gets the value of the CoverageLineID field.
     * Publicid of the CoverageLine.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCoverageLineID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COVERAGELINEID_PROP.get());
    }
    
    /**
     * Gets the value of the LimitType field.
     * Aggregate limit type code.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLimitType() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LIMITTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyPeriodID field.
     * Publicid of the PolicyPeriod.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyPeriodID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYPERIODID_PROP.get());
    }
    
    /**
     * Gets the value of the ValueType field.
     * Aggregate type code: limit or deductible.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getValueType() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VALUETYPE_PROP.get());
    }
    
    /**
     * Sets the value of the AggLimitCalcCriteria field.
     */
    public void setAggLimitCalcCriteria(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(AGGLIMITCALCCRITERIA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageLineID field.
     */
    public void setCoverageLineID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COVERAGELINEID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LimitType field.
     */
    public void setLimitType(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LIMITTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyPeriodID field.
     */
    public void setPolicyPeriodID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYPERIODID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValueType field.
     */
    public void setValueType(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VALUETYPE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.aggregatelimit.entity.TmpStagingAggregateLimit", "com.guidewire.cc.domain.aggregatelimit.impl.TmpStagingAggregateLimitImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpStagingAggregateLimit.class, config);
    com.guidewire._generated.entity.TmpStagingAggregateLimitInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpStagingAggregateLimit, com.guidewire._generated.entity.TmpStagingAggregateLimitInternal>() {
      public java.lang.Object getImplementation(entity.TmpStagingAggregateLimit bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpStagingAggregateLimitInternal getInternalInterface(entity.TmpStagingAggregateLimit bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpStagingAggregateLimit newEmptyInstance() {
        return new entity.TmpStagingAggregateLimit((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}