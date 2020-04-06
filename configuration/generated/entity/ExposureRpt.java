package entity;

/**
 * ExposureRpt
 * 
 *       Denormalized financial calculations for exposures.  These values are kept
 *       up-to-date as financials are recorded in the system.  They can be recalculated
 *       if necessary through a batch process when the server is in maintenance mode.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureRpt.eti;ExposureRpt.eix;ExposureRpt.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ExposureRpt")
public class ExposureRpt extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ExposureRpt> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ExposureRpt>("entity.ExposureRpt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVAILABLERESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AvailableReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVAILABLERESERVESREPORTING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AvailableReservesReporting");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTUREPAYMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FuturePayments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTUREPAYMENTSREPORTING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FuturePaymentsReporting");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENRECOVERYRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenRecoveryReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENRECOVERYRESERVESREPORTING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenRecoveryReservesReporting");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENRESERVESREPORTING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenReservesReporting");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REMAININGRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RemainingReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REMAININGRESERVESREPORTING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RemainingReservesReporting");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPAYMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalPayments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALPAYMENTSREPORTING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalPaymentsReporting");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRECOVERIES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalRecoveries");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALRECOVERIESREPORTING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalRecoveriesReporting");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ExposureRptInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ExposureRpt()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ExposureRpt(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ExposureRpt(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ExposureRptInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ExposureRptInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  /**
   * Gets the value of the AvailableReserves field.
   * The available reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAvailableReserves() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AVAILABLERESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the AvailableReservesReporting field.
   * The available reserves on an exposure, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAvailableReservesReporting() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AVAILABLERESERVESREPORTING_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Claim field.
   * The exposure's claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Local access to the Claim.Currency value.
   * @return Claim.Currency of this ExposureRpt's Claim
   */
  public typekey.Currency getClaimCurrency() {
    return ((gw.cc.exposure.entity.ExposureRpt)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureRpt")).getClaimCurrency();
  }
  
  /**
   * Gets the value of the CreateTime field.
   * Timestamp when the object was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the CreateUser field.
   * User who created the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
  }
  
  /**
   * Gets the value of the Exposure field.
   * The exposure that the calculations are on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure() {
    return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
  }
  
  /**
   * Gets the value of the FuturePayments field.
   * The total of awaiting submission payments scheduled to be sent after today.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFuturePayments() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FUTUREPAYMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the FuturePaymentsReporting field.
   * The total of awaiting submission payments scheduled to be sent after today, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFuturePaymentsReporting() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FUTUREPAYMENTSREPORTING_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the OpenRecoveryReserves field.
   * The open recovery reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOpenRecoveryReserves() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OPENRECOVERYRESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the OpenRecoveryReservesReporting field.
   * The open recovery reserves on a claim, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOpenRecoveryReservesReporting() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OPENRECOVERYRESERVESREPORTING_PROP.get());
  }
  
  /**
   * Gets the value of the OpenReserves field.
   * The open reserves.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOpenReserves() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OPENRESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the OpenReservesReporting field.
   * The open reserves on an exposure, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOpenReservesReporting() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OPENRESERVESREPORTING_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RemainingReserves field.
   * The remaining reserves on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRemainingReserves() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REMAININGRESERVES_PROP.get());
  }
  
  /**
   * Gets the value of the RemainingReservesReporting field.
   * The remaining reserves on an exposure, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getRemainingReservesReporting() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REMAININGRESERVESREPORTING_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
  }
  
  /**
   * Returns the gross total incurred amount of an exposure.  This amount is the
   * open reserves plus total payments on the exposure.
   * @return the gross total incurred amount of an exposure
   */
  public gw.api.financials.CurrencyAmount getTotalIncurredGross() {
    return ((gw.cc.exposure.entity.ExposureRpt)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureRpt")).getTotalIncurredGross();
  }
  
  /**
   * Returns the net total incurred amount of an exposure. This amount is the
   * open reserves pluls total payments minus total recoveries on the exposure.
   * @return the net total incurred amount of an exposure
   */
  public gw.api.financials.CurrencyAmount getTotalIncurredNet() {
    return ((gw.cc.exposure.entity.ExposureRpt)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureRpt")).getTotalIncurredNet();
  }
  
  /**
   * Returns the total incurred net minus open recovery reserves on an exposure.  This amount is the
   * open reserves plus total payments minus total recoveries on the exposure (or equivalently,
   * open reserves plus total payments minus total recovery reserves).
   * @return the total incurred net minus open recovery reserves on an exposure
   */
  public gw.api.financials.CurrencyAmount getTotalIncurredNetMinusOpenRecoveryReserves() {
    return ((gw.cc.exposure.entity.ExposureRpt)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureRpt")).getTotalIncurredNetMinusOpenRecoveryReserves();
  }
  
  /**
   * Gets the value of the TotalPayments field.
   * The total payments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalPayments() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALPAYMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the TotalPaymentsReporting field.
   * The total payments on an exposure, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalPaymentsReporting() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALPAYMENTSREPORTING_PROP.get());
  }
  
  /**
   * Gets the value of the TotalRecoveries field.
   * The total recoveries on an exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalRecoveries() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALRECOVERIES_PROP.get());
  }
  
  /**
   * Gets the value of the TotalRecoveriesReporting field.
   * The total recoveries on a claim, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalRecoveriesReporting() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALRECOVERIESREPORTING_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateTime field.
   * Timestamp when the object was last updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateUser field.
   * User who last updated the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUpdateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * 
   * @return True if the object has been retired from active use, false if the
   *         object is active.  Retireable objects are never deleted from a
   *         database table, instead they are retired by setting the retired
   *         column to the same value as the ID of the object.
   */
  public java.lang.Boolean isRetired() {
    return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AvailableReserves field.
   */
  public void setAvailableReserves(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(AVAILABLERESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AvailableReservesReporting field.
   */
  public void setAvailableReservesReporting(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(AVAILABLERESERVESREPORTING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value) {
    __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FuturePayments field.
   */
  public void setFuturePayments(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(FUTUREPAYMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FuturePaymentsReporting field.
   */
  public void setFuturePaymentsReporting(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(FUTUREPAYMENTSREPORTING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the OpenRecoveryReserves field.
   */
  public void setOpenRecoveryReserves(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(OPENRECOVERYRESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenRecoveryReservesReporting field.
   */
  public void setOpenRecoveryReservesReporting(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(OPENRECOVERYRESERVESREPORTING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenReserves field.
   */
  public void setOpenReserves(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(OPENRESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenReservesReporting field.
   */
  public void setOpenReservesReporting(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(OPENRESERVESREPORTING_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RemainingReserves field.
   */
  public void setRemainingReserves(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(REMAININGRESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RemainingReservesReporting field.
   */
  public void setRemainingReservesReporting(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(REMAININGRESERVESREPORTING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalPayments field.
   */
  public void setTotalPayments(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALPAYMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalPaymentsReporting field.
   */
  public void setTotalPaymentsReporting(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALPAYMENTSREPORTING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalRecoveries field.
   */
  public void setTotalRecoveries(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALRECOVERIES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalRecoveriesReporting field.
   */
  public void setTotalRecoveriesReporting(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALRECOVERIESREPORTING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ExposureRptInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ExposureRpt.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    /**
     * Gets the value of the AvailableReserves field.
     * The available reserves on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getAvailableReserves() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AVAILABLERESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the AvailableReservesReporting field.
     * The available reserves on an exposure, in Reporting/Default Currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getAvailableReservesReporting() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AVAILABLERESERVESREPORTING_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     * The exposure's claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Local access to the Claim.Currency value.
     * @return Claim.Currency of this ExposureRpt's Claim
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.exposure.entity.ExposureRpt)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureRpt")).getClaimCurrency();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     * Timestamp when the object was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     * User who created the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the Exposure field.
     * The exposure that the calculations are on.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure getExposure() {
      return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExposureID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXPOSURE_PROP.get());
    }
    
    /**
     * Gets the value of the FuturePayments field.
     * The total of awaiting submission payments scheduled to be sent after today.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFuturePayments() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FUTUREPAYMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the FuturePaymentsReporting field.
     * The total of awaiting submission payments scheduled to be sent after today, in Reporting/Default Currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getFuturePaymentsReporting() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(FUTUREPAYMENTSREPORTING_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the OpenRecoveryReserves field.
     * The open recovery reserves on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getOpenRecoveryReserves() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OPENRECOVERYRESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the OpenRecoveryReservesReporting field.
     * The open recovery reserves on a claim, in Reporting/Default Currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getOpenRecoveryReservesReporting() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OPENRECOVERYRESERVESREPORTING_PROP.get());
    }
    
    /**
     * Gets the value of the OpenReserves field.
     * The open reserves.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getOpenReserves() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OPENRESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the OpenReservesReporting field.
     * The open reserves on an exposure, in Reporting/Default Currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getOpenReservesReporting() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OPENRESERVESREPORTING_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RemainingReserves field.
     * The remaining reserves on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getRemainingReserves() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REMAININGRESERVES_PROP.get());
    }
    
    /**
     * Gets the value of the RemainingReservesReporting field.
     * The remaining reserves on an exposure, in Reporting/Default Currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getRemainingReservesReporting() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REMAININGRESERVESREPORTING_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Returns the gross total incurred amount of an exposure.  This amount is the
     * open reserves plus total payments on the exposure.
     * @return the gross total incurred amount of an exposure
     */
    public gw.api.financials.CurrencyAmount getTotalIncurredGross() {
      return ((gw.cc.exposure.entity.ExposureRpt)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureRpt")).getTotalIncurredGross();
    }
    
    /**
     * Returns the net total incurred amount of an exposure. This amount is the
     * open reserves pluls total payments minus total recoveries on the exposure.
     * @return the net total incurred amount of an exposure
     */
    public gw.api.financials.CurrencyAmount getTotalIncurredNet() {
      return ((gw.cc.exposure.entity.ExposureRpt)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureRpt")).getTotalIncurredNet();
    }
    
    /**
     * Returns the total incurred net minus open recovery reserves on an exposure.  This amount is the
     * open reserves plus total payments minus total recoveries on the exposure (or equivalently,
     * open reserves plus total payments minus total recovery reserves).
     * @return the total incurred net minus open recovery reserves on an exposure
     */
    public gw.api.financials.CurrencyAmount getTotalIncurredNetMinusOpenRecoveryReserves() {
      return ((gw.cc.exposure.entity.ExposureRpt)__getDelegateManager().getImplementation("gw.cc.exposure.entity.ExposureRpt")).getTotalIncurredNetMinusOpenRecoveryReserves();
    }
    
    /**
     * Gets the value of the TotalPayments field.
     * The total payments.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalPayments() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALPAYMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the TotalPaymentsReporting field.
     * The total payments on an exposure, in Reporting/Default Currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalPaymentsReporting() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALPAYMENTSREPORTING_PROP.get());
    }
    
    /**
     * Gets the value of the TotalRecoveries field.
     * The total recoveries on an exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalRecoveries() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALRECOVERIES_PROP.get());
    }
    
    /**
     * Gets the value of the TotalRecoveriesReporting field.
     * The total recoveries on a claim, in Reporting/Default Currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalRecoveriesReporting() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALRECOVERIESREPORTING_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     * Timestamp when the object was last updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUser field.
     * User who last updated the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUpdateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    /**
     * 
     * @return True if the object has been retired from active use, false if the
     *         object is active.  Retireable objects are never deleted from a
     *         database table, instead they are retired by setting the retired
     *         column to the same value as the ID of the object.
     */
    public java.lang.Boolean isRetired() {
      return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AvailableReserves field.
     */
    public void setAvailableReserves(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(AVAILABLERESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AvailableReservesReporting field.
     */
    public void setAvailableReservesReporting(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(AVAILABLERESERVESREPORTING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exposure field.
     */
    public void setExposure(entity.Exposure value) {
      __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    public void setExposureID(gw.pl.persistence.core.Key value) {
      setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FuturePayments field.
     */
    public void setFuturePayments(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(FUTUREPAYMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FuturePaymentsReporting field.
     */
    public void setFuturePaymentsReporting(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(FUTUREPAYMENTSREPORTING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the OpenRecoveryReserves field.
     */
    public void setOpenRecoveryReserves(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(OPENRECOVERYRESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenRecoveryReservesReporting field.
     */
    public void setOpenRecoveryReservesReporting(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(OPENRECOVERYRESERVESREPORTING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenReserves field.
     */
    public void setOpenReserves(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(OPENRESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenReservesReporting field.
     */
    public void setOpenReservesReporting(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(OPENRESERVESREPORTING_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RemainingReserves field.
     */
    public void setRemainingReserves(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(REMAININGRESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RemainingReservesReporting field.
     */
    public void setRemainingReservesReporting(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(REMAININGRESERVESREPORTING_PROP.get(), value);
    }
    
    public void setRetired() {
      ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).setRetired();
    }
    
    /**
     * Sets the value of the RetiredValue field.
     */
    public void setRetiredValue(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalPayments field.
     */
    public void setTotalPayments(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALPAYMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalPaymentsReporting field.
     */
    public void setTotalPaymentsReporting(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALPAYMENTSREPORTING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalRecoveries field.
     */
    public void setTotalRecoveries(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALRECOVERIES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalRecoveriesReporting field.
     */
    public void setTotalRecoveriesReporting(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALRECOVERIESREPORTING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.exposure.impl.ExposureRptInternal", "com.guidewire.cc.domain.exposure.impl.ExposureRptImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.exposure.entity.ExposureRpt", "com.guidewire.cc.domain.exposure.impl.ExposureRptImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ExposureRpt.class, config);
    com.guidewire._generated.entity.ExposureRptInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ExposureRpt, com.guidewire._generated.entity.ExposureRptInternal>() {
      public java.lang.Object getImplementation(entity.ExposureRpt bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ExposureRptInternal getInternalInterface(entity.ExposureRpt bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ExposureRpt newEmptyInstance() {
        return new entity.ExposureRpt((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}