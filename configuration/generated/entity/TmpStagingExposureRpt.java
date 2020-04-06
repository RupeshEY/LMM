package entity;

/**
 * TmpStagingExposureRpt
 * Temp table with final calcs, utilized during the population of the production ExposureRpt table from staging tables.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpStagingExposureRpt.eti;TmpStagingExposureRpt.eix;TmpStagingExposureRpt.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TmpStagingExposureRpt")
public class TmpStagingExposureRpt extends com.guidewire.pl.persistence.code.BeanBase implements gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TmpStagingExposureRpt> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TmpStagingExposureRpt>("entity.TmpStagingExposureRpt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVAILABLERESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AvailableReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVAILABLERESRVRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AvailableResrvRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMPUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimPublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMRPTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimRptID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMRPTPUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimRptPublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSUREID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSUREPUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposurePublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSURERPTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureRptID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSURERPTPUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureRptPublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTUREPAYMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FuturePayments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTUREPAYMENTSRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FuturePaymentsRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENRECOVERYRESRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenRecoveryResRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENRECOVERYRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenRecoveryReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENRESERVESRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenReservesRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REMAININGRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RemainingReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REMAININGRESRVRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RemainingResrvRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPAYMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalPayments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPAYMENTSRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalPaymentsRprtng");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRECOVERIES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalRecoveries");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRECOVERIESRPRTNG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalRecoveriesRprtng");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TmpStagingExposureRptInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TmpStagingExposureRpt()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TmpStagingExposureRpt(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TmpStagingExposureRpt(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TmpStagingExposureRptInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TmpStagingExposureRptInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AvailableReserves field.
   * The available reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAvailableReserves() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AVAILABLERESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the AvailableResrvRprtng field.
   * The available reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAvailableResrvRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AVAILABLERESRVRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimID field.
   * This exposure's claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMID_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimPublicID field.
   * The public ID for the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimPublicID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMPUBLICID_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimRptID field.
   * The ID for the ClaimRpt record being inserted
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimRptID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMRPTID_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimRptPublicID field.
   * The public ID for the ClaimRpt record being inserted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimRptPublicID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMRPTPUBLICID_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureID field.
   * The exposure that the calculations are on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExposureID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(EXPOSUREID_PROP.get());
  }
  
  /**
   * Gets the value of the ExposurePublicID field.
   * The public ID for the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposurePublicID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSUREPUBLICID_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureRptID field.
   * The ID for the ExposureRpt record being inserted
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExposureRptID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(EXPOSURERPTID_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureRptPublicID field.
   * The public ID for the ExposureRpt record being inserted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExposureRptPublicID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSURERPTPUBLICID_PROP.get());
  }
  
  /**
   * Gets the value of the FuturePayments field.
   * The total of awaiting submission payments scheduled to be sent after today.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFuturePayments() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FUTUREPAYMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the FuturePaymentsRprtng field.
   * The total of awaiting submission payments scheduled to be sent after today.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFuturePaymentsRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FUTUREPAYMENTSRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the OpenRecoveryResRprtng field.
   * The open recovery reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenRecoveryResRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPENRECOVERYRESRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the OpenRecoveryReserves field.
   * The open recovery reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenRecoveryReserves() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPENRECOVERYRESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the OpenReserves field.
   * The open reserves.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenReserves() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPENRESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the OpenReservesRprtng field.
   * The open reserves.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenReservesRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPENRESERVESRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the RemainingReserves field.
   * The remaining reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRemainingReserves() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REMAININGRESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the RemainingResrvRprtng field.
   * The remaining reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRemainingResrvRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REMAININGRESRVRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the TotalPayments field.
   * The total payments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPayments() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the TotalPaymentsRprtng field.
   * The total payments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPaymentsRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTSRPRTNG_PROP.get());
  }
  
  /**
   * Gets the value of the TotalRecoveries field.
   * The total recoveries on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveries() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERIES_PROP.get());
  }
  
  /**
   * Gets the value of the TotalRecoveriesRprtng field.
   * The total recoveries on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalRecoveriesRprtng() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERIESRPRTNG_PROP.get());
  }
  
  /**
   * Sets the value of the AvailableReserves field.
   */
  public void setAvailableReserves(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(AVAILABLERESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AvailableResrvRprtng field.
   */
  public void setAvailableResrvRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(AVAILABLERESRVRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimID field.
   */
  public void setClaimID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CLAIMID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimPublicID field.
   */
  public void setClaimPublicID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMPUBLICID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimRptID field.
   */
  public void setClaimRptID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CLAIMRPTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimRptPublicID field.
   */
  public void setClaimRptPublicID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMRPTPUBLICID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureID field.
   */
  public void setExposureID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(EXPOSUREID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposurePublicID field.
   */
  public void setExposurePublicID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXPOSUREPUBLICID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureRptID field.
   */
  public void setExposureRptID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(EXPOSURERPTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureRptPublicID field.
   */
  public void setExposureRptPublicID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXPOSURERPTPUBLICID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FuturePayments field.
   */
  public void setFuturePayments(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FUTUREPAYMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FuturePaymentsRprtng field.
   */
  public void setFuturePaymentsRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FUTUREPAYMENTSRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenRecoveryResRprtng field.
   */
  public void setOpenRecoveryResRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(OPENRECOVERYRESRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenRecoveryReserves field.
   */
  public void setOpenRecoveryReserves(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(OPENRECOVERYRESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenReserves field.
   */
  public void setOpenReserves(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(OPENRESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenReservesRprtng field.
   */
  public void setOpenReservesRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(OPENRESERVESRPRTNG_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RemainingReserves field.
   */
  public void setRemainingReserves(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(REMAININGRESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RemainingResrvRprtng field.
   */
  public void setRemainingResrvRprtng(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(REMAININGRESRVRPRTNG_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TmpStagingExposureRptInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TmpStagingExposureRpt.this.__getDelegateManager();
    }
    
    /**
     * Gets the value of the AvailableReserves field.
     * The available reserves on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getAvailableReserves() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AVAILABLERESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the AvailableResrvRprtng field.
     * The available reserves on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getAvailableResrvRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AVAILABLERESRVRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimID field.
     * This exposure's claim
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getClaimID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMID_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimPublicID field.
     * The public ID for the claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimPublicID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMPUBLICID_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimRptID field.
     * The ID for the ClaimRpt record being inserted
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getClaimRptID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CLAIMRPTID_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimRptPublicID field.
     * The public ID for the ClaimRpt record being inserted.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimRptPublicID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMRPTPUBLICID_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureID field.
     * The exposure that the calculations are on.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getExposureID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(EXPOSUREID_PROP.get());
    }
    
    /**
     * Gets the value of the ExposurePublicID field.
     * The public ID for the exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExposurePublicID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSUREPUBLICID_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureRptID field.
     * The ID for the ExposureRpt record being inserted
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getExposureRptID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(EXPOSURERPTID_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureRptPublicID field.
     * The public ID for the ExposureRpt record being inserted.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExposureRptPublicID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPOSURERPTPUBLICID_PROP.get());
    }
    
    /**
     * Gets the value of the FuturePayments field.
     * The total of awaiting submission payments scheduled to be sent after today.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFuturePayments() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FUTUREPAYMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the FuturePaymentsRprtng field.
     * The total of awaiting submission payments scheduled to be sent after today.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFuturePaymentsRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FUTUREPAYMENTSRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the OpenRecoveryResRprtng field.
     * The open recovery reserves on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getOpenRecoveryResRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPENRECOVERYRESRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the OpenRecoveryReserves field.
     * The open recovery reserves on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getOpenRecoveryReserves() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPENRECOVERYRESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the OpenReserves field.
     * The open reserves.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getOpenReserves() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPENRESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the OpenReservesRprtng field.
     * The open reserves.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getOpenReservesRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPENRESERVESRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the RemainingReserves field.
     * The remaining reserves on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getRemainingReserves() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REMAININGRESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the RemainingResrvRprtng field.
     * The remaining reserves on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getRemainingResrvRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REMAININGRESRVRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the TotalPayments field.
     * The total payments.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalPayments() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the TotalPaymentsRprtng field.
     * The total payments.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalPaymentsRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALPAYMENTSRPRTNG_PROP.get());
    }
    
    /**
     * Gets the value of the TotalRecoveries field.
     * The total recoveries on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalRecoveries() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERIES_PROP.get());
    }
    
    /**
     * Gets the value of the TotalRecoveriesRprtng field.
     * The total recoveries on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalRecoveriesRprtng() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(TOTALRECOVERIESRPRTNG_PROP.get());
    }
    
    /**
     * Sets the value of the AvailableReserves field.
     */
    public void setAvailableReserves(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(AVAILABLERESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AvailableResrvRprtng field.
     */
    public void setAvailableResrvRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(AVAILABLERESRVRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimID field.
     */
    public void setClaimID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CLAIMID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimPublicID field.
     */
    public void setClaimPublicID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMPUBLICID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimRptID field.
     */
    public void setClaimRptID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CLAIMRPTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimRptPublicID field.
     */
    public void setClaimRptPublicID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMRPTPUBLICID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureID field.
     */
    public void setExposureID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(EXPOSUREID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposurePublicID field.
     */
    public void setExposurePublicID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXPOSUREPUBLICID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureRptID field.
     */
    public void setExposureRptID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(EXPOSURERPTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureRptPublicID field.
     */
    public void setExposureRptPublicID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXPOSURERPTPUBLICID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FuturePayments field.
     */
    public void setFuturePayments(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FUTUREPAYMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FuturePaymentsRprtng field.
     */
    public void setFuturePaymentsRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FUTUREPAYMENTSRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenRecoveryResRprtng field.
     */
    public void setOpenRecoveryResRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(OPENRECOVERYRESRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenRecoveryReserves field.
     */
    public void setOpenRecoveryReserves(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(OPENRECOVERYRESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenReserves field.
     */
    public void setOpenReserves(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(OPENRESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenReservesRprtng field.
     */
    public void setOpenReservesRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(OPENRESERVESRPRTNG_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RemainingReserves field.
     */
    public void setRemainingReserves(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(REMAININGRESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RemainingResrvRprtng field.
     */
    public void setRemainingResrvRprtng(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(REMAININGRESRVRPRTNG_PROP.get(), value);
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
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.impl.TmpStagingExposureRptInternal", "com.guidewire.cc.domain.financials.impl.TmpStagingExposureRptImpl");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.entity.TmpStagingExposureRpt", "com.guidewire.cc.domain.financials.impl.TmpStagingExposureRptImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TmpStagingExposureRpt.class, config);
    com.guidewire._generated.entity.TmpStagingExposureRptInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TmpStagingExposureRpt, com.guidewire._generated.entity.TmpStagingExposureRptInternal>() {
      public java.lang.Object getImplementation(entity.TmpStagingExposureRpt bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TmpStagingExposureRptInternal getInternalInterface(entity.TmpStagingExposureRpt bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TmpStagingExposureRpt newEmptyInstance() {
        return new entity.TmpStagingExposureRpt((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}