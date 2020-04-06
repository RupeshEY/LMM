package entity;

/**
 * FinancialsRptUpgrade
 * Temp table used to recalculate from the batch process.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FinancialsRptUpgrade.eti;FinancialsRptUpgrade.eix;FinancialsRptUpgrade.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "FinancialsRptUpgrade")
public class FinancialsRptUpgrade extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.FinancialsRptUpgrade> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.FinancialsRptUpgrade>("entity.FinancialsRptUpgrade");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ERDNGUNAPPPMTSRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ErdngUnappPmtsRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ERODINGUNAPPRVDPMTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ErodingUnapprvdPmts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSURE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FOREXADJUSTMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ForExAdjustments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FOREXADJUSTMENTSRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ForExAdjustmentsRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FTRERODNGPMTSRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FtrErodngPmtsRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FTRNONERODNGPMTSRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FtrNonErodngPmtsRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTUREERODINGPMTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FutureErodingPmts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTURENONERODINGPMTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FutureNonErodingPmts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALERODINGPMTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalErodingPmts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALNONERODINGPMTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalNonErodingPmts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPAYMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalPayments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPAYMENTSRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalPaymentsRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRECRESERVESRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalRecReservesRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRECOVERIES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalRecoveries");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRECOVERIESRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalRecoveriesRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRECOVERYRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalRecoveryReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRESERVESRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalReservesRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTLERDNGPMTSRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotlErdngPmtsRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTLNONERDNGPMTSRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotlNonErdngPmtsRprtng");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.FinancialsRptUpgradeInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public FinancialsRptUpgrade()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public FinancialsRptUpgrade(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected FinancialsRptUpgrade(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.FinancialsRptUpgradeInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.FinancialsRptUpgradeInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the Claim field.
   * Claim id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaim() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the ErdngUnappPmtsRprtng field.
   * All pending-approval eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getErdngUnappPmtsRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(ERDNGUNAPPPMTSRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the ErodingUnapprvdPmts field.
   * All pending-approval eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getErodingUnapprvdPmts() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(ERODINGUNAPPRVDPMTS_PROP.get());
  }
  
  /**
   * Gets the value of the Exposure field.
   * Exposure id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExposure() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
  }
  
  /**
   * Gets the value of the ForExAdjustments field.
   * All foreign exchange adjustments to payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getForExAdjustments() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FOREXADJUSTMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the ForExAdjustmentsRprtng field.
   * All foreign exchange adjustments to payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getForExAdjustmentsRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FOREXADJUSTMENTSRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the FtrErodngPmtsRprtng field.
   * All FutureDated eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFtrErodngPmtsRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FTRERODNGPMTSRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the FtrNonErodngPmtsRprtng field.
   * All FutureDated non-eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFtrNonErodngPmtsRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FTRNONERODNGPMTSRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the FutureErodingPmts field.
   * All FutureDated eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFutureErodingPmts() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FUTUREERODINGPMTS_PROP.get());
  }
  
  /**
   * Gets the value of the FutureNonErodingPmts field.
   * All FutureDated non-eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFutureNonErodingPmts() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FUTURENONERODINGPMTS_PROP.get());
  }
  
  /**
   * Gets the value of the TotalErodingPmts field.
   * All awaiting-submission and committed eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalErodingPmts() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALERODINGPMTS_PROP.get());
  }
  
  /**
   * Gets the value of the TotalNonErodingPmts field.
   * All awaiting-submission and committed non-eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalNonErodingPmts() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALNONERODINGPMTS_PROP.get());
  }
  
  /**
   * Gets the value of the TotalPayments field.
   * All (eroding and non-eroding) awaiting-submission and committed payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPayments() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the TotalPaymentsRprtng field.
   * All (eroding and non-eroding) awaiting-submission and committed payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPaymentsRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTSRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the TotalRecReservesRprtng field.
   * All committed recovery-reserves
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecReservesRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECRESERVESRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the TotalRecoveries field.
   * All committed recoveries
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveries() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERIES_PROP.get());
  }
  
  /**
   * Gets the value of the TotalRecoveriesRprtng field.
   * All committed recoveries
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveriesRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERIESRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the TotalRecoveryReserves field.
   * All committed recovery-reserves
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveryReserves() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERYRESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the TotalReserves field.
   * All awaiting-submission and commited reserves
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalReserves() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the TotalReservesRprtng field.
   * All awaiting-submission and commited reserves
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalReservesRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRESERVESRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the TotlErdngPmtsRprtng field.
   * All awaiting-submission and committed eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotlErdngPmtsRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTLERDNGPMTSRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the TotlNonErdngPmtsRprtng field.
   * All awaiting-submission and committed non-eroding payments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotlNonErdngPmtsRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTLNONERDNGPMTSRPRTNG_PROP.get());
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ErdngUnappPmtsRprtng field.
   */
  public void setErdngUnappPmtsRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(ERDNGUNAPPPMTSRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ErodingUnapprvdPmts field.
   */
  public void setErodingUnapprvdPmts(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(ERODINGUNAPPRVDPMTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(java.lang.Long value) {
    __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ForExAdjustments field.
   */
  public void setForExAdjustments(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FOREXADJUSTMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ForExAdjustmentsRprtng field.
   */
  public void setForExAdjustmentsRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FOREXADJUSTMENTSRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FtrErodngPmtsRprtng field.
   */
  public void setFtrErodngPmtsRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FTRERODNGPMTSRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FtrNonErodngPmtsRprtng field.
   */
  public void setFtrNonErodngPmtsRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FTRNONERODNGPMTSRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FutureErodingPmts field.
   */
  public void setFutureErodingPmts(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FUTUREERODINGPMTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FutureNonErodingPmts field.
   */
  public void setFutureNonErodingPmts(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FUTURENONERODINGPMTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalErodingPmts field.
   */
  public void setTotalErodingPmts(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALERODINGPMTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalNonErodingPmts field.
   */
  public void setTotalNonErodingPmts(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALNONERODINGPMTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalPayments field.
   */
  public void setTotalPayments(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALPAYMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalPaymentsRprtng field.
   */
  public void setTotalPaymentsRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALPAYMENTSRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalRecReservesRprtng field.
   */
  public void setTotalRecReservesRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALRECRESERVESRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalRecoveries field.
   */
  public void setTotalRecoveries(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALRECOVERIES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalRecoveriesRprtng field.
   */
  public void setTotalRecoveriesRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALRECOVERIESRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalRecoveryReserves field.
   */
  public void setTotalRecoveryReserves(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALRECOVERYRESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalReserves field.
   */
  public void setTotalReserves(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALRESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalReservesRprtng field.
   */
  public void setTotalReservesRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALRESERVESRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotlErdngPmtsRprtng field.
   */
  public void setTotlErdngPmtsRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTLERDNGPMTSRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotlNonErdngPmtsRprtng field.
   */
  public void setTotlNonErdngPmtsRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTLNONERDNGPMTSRPRTNG_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.FinancialsRptUpgradeInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.FinancialsRptUpgrade.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the Claim field.
     * Claim id.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getClaim() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ErdngUnappPmtsRprtng field.
     * All pending-approval eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getErdngUnappPmtsRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(ERDNGUNAPPPMTSRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the ErodingUnapprvdPmts field.
     * All pending-approval eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getErodingUnapprvdPmts() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(ERODINGUNAPPRVDPMTS_PROP.get());
    }
    
    /**
     * Gets the value of the Exposure field.
     * Exposure id.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getExposure() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
    }
    
    /**
     * Gets the value of the ForExAdjustments field.
     * All foreign exchange adjustments to payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getForExAdjustments() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FOREXADJUSTMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the ForExAdjustmentsRprtng field.
     * All foreign exchange adjustments to payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getForExAdjustmentsRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FOREXADJUSTMENTSRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the FtrErodngPmtsRprtng field.
     * All FutureDated eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFtrErodngPmtsRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FTRERODNGPMTSRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the FtrNonErodngPmtsRprtng field.
     * All FutureDated non-eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFtrNonErodngPmtsRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FTRNONERODNGPMTSRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the FutureErodingPmts field.
     * All FutureDated eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFutureErodingPmts() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FUTUREERODINGPMTS_PROP.get());
    }
    
    /**
     * Gets the value of the FutureNonErodingPmts field.
     * All FutureDated non-eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFutureNonErodingPmts() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FUTURENONERODINGPMTS_PROP.get());
    }
    
    /**
     * Gets the value of the TotalErodingPmts field.
     * All awaiting-submission and committed eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalErodingPmts() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALERODINGPMTS_PROP.get());
    }
    
    /**
     * Gets the value of the TotalNonErodingPmts field.
     * All awaiting-submission and committed non-eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalNonErodingPmts() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALNONERODINGPMTS_PROP.get());
    }
    
    /**
     * Gets the value of the TotalPayments field.
     * All (eroding and non-eroding) awaiting-submission and committed payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalPayments() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the TotalPaymentsRprtng field.
     * All (eroding and non-eroding) awaiting-submission and committed payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalPaymentsRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTSRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the TotalRecReservesRprtng field.
     * All committed recovery-reserves
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalRecReservesRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECRESERVESRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the TotalRecoveries field.
     * All committed recoveries
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalRecoveries() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERIES_PROP.get());
    }
    
    /**
     * Gets the value of the TotalRecoveriesRprtng field.
     * All committed recoveries
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalRecoveriesRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERIESRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the TotalRecoveryReserves field.
     * All committed recovery-reserves
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalRecoveryReserves() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERYRESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the TotalReserves field.
     * All awaiting-submission and commited reserves
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalReserves() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the TotalReservesRprtng field.
     * All awaiting-submission and commited reserves
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalReservesRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRESERVESRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the TotlErdngPmtsRprtng field.
     * All awaiting-submission and committed eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotlErdngPmtsRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTLERDNGPMTSRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the TotlNonErdngPmtsRprtng field.
     * All awaiting-submission and committed non-eroding payments
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotlNonErdngPmtsRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTLNONERDNGPMTSRPRTNG_PROP.get());
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ErdngUnappPmtsRprtng field.
     */
    public void setErdngUnappPmtsRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(ERDNGUNAPPPMTSRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ErodingUnapprvdPmts field.
     */
    public void setErodingUnapprvdPmts(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(ERODINGUNAPPRVDPMTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exposure field.
     */
    public void setExposure(java.lang.Long value) {
      __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ForExAdjustments field.
     */
    public void setForExAdjustments(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FOREXADJUSTMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ForExAdjustmentsRprtng field.
     */
    public void setForExAdjustmentsRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FOREXADJUSTMENTSRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FtrErodngPmtsRprtng field.
     */
    public void setFtrErodngPmtsRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FTRERODNGPMTSRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FtrNonErodngPmtsRprtng field.
     */
    public void setFtrNonErodngPmtsRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FTRNONERODNGPMTSRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FutureErodingPmts field.
     */
    public void setFutureErodingPmts(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FUTUREERODINGPMTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FutureNonErodingPmts field.
     */
    public void setFutureNonErodingPmts(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FUTURENONERODINGPMTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalErodingPmts field.
     */
    public void setTotalErodingPmts(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALERODINGPMTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalNonErodingPmts field.
     */
    public void setTotalNonErodingPmts(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALNONERODINGPMTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalPayments field.
     */
    public void setTotalPayments(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALPAYMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalPaymentsRprtng field.
     */
    public void setTotalPaymentsRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALPAYMENTSRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalRecReservesRprtng field.
     */
    public void setTotalRecReservesRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALRECRESERVESRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalRecoveries field.
     */
    public void setTotalRecoveries(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALRECOVERIES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalRecoveriesRprtng field.
     */
    public void setTotalRecoveriesRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALRECOVERIESRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalRecoveryReserves field.
     */
    public void setTotalRecoveryReserves(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALRECOVERYRESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalReserves field.
     */
    public void setTotalReserves(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALRESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalReservesRprtng field.
     */
    public void setTotalReservesRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALRESERVESRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotlErdngPmtsRprtng field.
     */
    public void setTotlErdngPmtsRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTLERDNGPMTSRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotlNonErdngPmtsRprtng field.
     */
    public void setTotlNonErdngPmtsRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTLNONERDNGPMTSRPRTNG_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.entity.FinancialsRptUpgrade", "com.guidewire.cc.domain.financials.impl.FinancialsRptUpgradeImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.FinancialsRptUpgrade.class, config);
    com.guidewire._generated.entity.FinancialsRptUpgradeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.FinancialsRptUpgrade, com.guidewire._generated.entity.FinancialsRptUpgradeInternal>() {
      public java.lang.Object getImplementation(entity.FinancialsRptUpgrade bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.FinancialsRptUpgradeInternal getInternalInterface(entity.FinancialsRptUpgrade bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.FinancialsRptUpgrade newEmptyInstance() {
        return new entity.FinancialsRptUpgrade((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}