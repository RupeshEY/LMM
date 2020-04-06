package entity;

/**
 * RITransactionSet
 * 
 *       A set of RI transactions created at the same time.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RITransactionSet.eti;RITransactionSet.eix;RITransactionSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RITransactionSet")
public class RITransactionSet extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Validatable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RITransactionSet> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RITransactionSet>("entity.RITransactionSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RITRANSACTIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RITransactions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.RITransactionSetInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VALIDATION_RESULTS_DYNPROP = com.guidewire.pl.domain.validation.ValidatablePublicMethods.VALIDATION_RESULTS_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public RITransactionSet()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public RITransactionSet(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RITransactionSet(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.RITransactionSetInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.RITransactionSetInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the RITransactions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRITransactions(entity.RITransaction element) {
    __getInternalInterface().addArrayElement(RITRANSACTIONS_PROP.get(), element);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Claim field.
   * The claim entity to which this TransactionSet belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the Comments field.
   * Comments about the RI Transaction Set.  Typically, comments give some sense of why the transactions were created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RITransactions field.
   * RITransactions in the set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITransaction[] getRITransactions() {
    return (entity.RITransaction[])__getInternalInterface().getFieldValue(RITRANSACTIONS_PROP.get());
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
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RITransactionSet getSubtype() {
    return (typekey.RITransactionSet)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
   * Gets the validation result.
   * @return The validation result.
   */
  public gw.api.validation.ValidationResult getValidationResult() {
    return ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).getValidationResult();
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
   * Adds a new RICededReserve to this RITransactionSet. It will:
   * <ul>
   * <li>be on the specified RIAgreement and Exposure
   * <li>have its Claim set up based on the Exposure
   * <li>have the specified CostType and CostCategory. (ReservingCurrency is implicitly assumed to be same as ClaimCurrency)
   * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
   * <li>have the specified ClaimAmount
   * <li>have a ClaimToReportingExchangeRate selected from the current market rates, or null if server in single-currency mode
   * <li>have a ReportingAmount calculated based on the ClaimAmount and selected exchange rate, or copied from the ClaimAmount in single-currency mode
   * <li>have the specified "adjustment" flag value
   * <li>have a Status of Submitting
   * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
   * </ul>
   * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. None of the
   * arguments may be null.
   * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
   *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
   * @param exposure the Exposure of the transaction to be created; this must be in the same bundle as this
   *                  RITransactionSet; this must be on the agreement's RIAgreementGroup
   * @param costType the CostType of the transaction to be created
   * @param costCategory the CostCategory of the transaction to be created
   * @param claimAmount the ClaimAmount of the transaction to be created; the ReportingAmount will be
   *                     based on this
   * @param isAdjustment the value of the Adjustment flag for the transaction to be created
   * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
   *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
   *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
   *                                  or if claimAmount's amount has too much precision for its Currency
   *                                  or if any of the arguments are null
   * @return the new RICededReserve
   * @deprecated As of release 8.0. Replaced by {@link #newCededReserve(entity.RIAgreement, entity.ReserveLine, java.math.BigDecimal, boolean)}.
   */
  @java.lang.Deprecated
  public entity.RICededReserve newCededReserve(entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal claimAmount, boolean isAdjustment) {
    return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newCededReserve(agreement, exposure, costType, costCategory, claimAmount, isAdjustment);
  }
  
  /**
   * Adds a new RICededReserve to this RITransactionSet. It will:
   * <ul>
   * <li>be on the specified RIAgreement and Exposure
   * <li>have its Claim set up based on the Exposure
   * <li>have the specified CostType and CostCategory. (ReservingCurrency is implicitly assumed to be same as ClaimCurrency)
   * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
   * <li>have the specified ClaimAmount
   * <li>have the specified ClaimToReportingExchangeRate
   * <li>have the specified ReportingAmount (if the specified ReportingAmount is null, then ReportingAmount is
   *     calculated from the ClaimAmount and ClaimToReportingExchangeRate)
   * <li>have the specified "adjustment" flag value
   * <li>have a Status of Submitting
   * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
   * </ul>
   * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. Apart from
   * reportingAmount, none of the arguments may be null. This method may only be called when the server is running in
   * multicurrency mode.
   * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
   *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
   * @param exposure the Exposure of the transaction to be created; this must be in the same bundle as this
   *                  RITransactionSet; this must be on the agreement's RIAgreementGroup
   * @param costType the CostType of the transaction to be created
   * @param costCategory the CostCategory of the transaction to be created
   * @param claimAmount the ClaimAmount of the transaction to be created
   * @param isAdjustment the value of the Adjustment flag for the transaction to be created
   * @param claimToReportingExchangeRate the ClaimToReportingExchangeRate of the transaction to be created; the base
   *                                      and price currencies of this ExchangeRate must be the claim and reporting
   *                                      currencies
   * @param reportingAmount the ReportingAmount of the transaction to be created; this argument may be null, in which
   *                         case a ReportingAmount is computed using claimAmount and claimToReportingExchangeRate
   * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
   *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
   *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
   *                                  or if either of the amount arguments have too much precision for its Currency
   *                                  or if claimToReportingExchangeRate has incorrect currencies
   *                                  or if any of the arguments (other than reportingAmount) are null
   * @throws IllegalStateException if the server is running in single-currency mode
   * @return the new RICededReserve
   * @deprecated As of release 8.0. Replaced by {@link #newCededReserve(entity.RIAgreement, entity.ReserveLine, java.math.BigDecimal, boolean, entity.ExchangeRate, java.math.BigDecimal)}.
   */
  @java.lang.Deprecated
  public entity.RICededReserve newCededReserve(entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal claimAmount, boolean isAdjustment, entity.ExchangeRate claimToReportingExchangeRate, java.math.BigDecimal reportingAmount) {
    return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newCededReserve(agreement, exposure, costType, costCategory, claimAmount, isAdjustment, claimToReportingExchangeRate, reportingAmount);
  }
  
  /**
   * Adds a new RICededReserve to this RITransactionSet. It will:
   * <ul>
   * <li>be on the specified RIAgreement
   * <li>be on the Exposure of the specified ReserveLine
   * <li>have its Claim set up based on the Exposure
   * <li>have the CostType, CostCategory and ReservingCurrency of the specified ReserveLine
   * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
   * <li>have the specified ClaimAmount
   * <li>have a ClaimToReportingExchangeRate selected from the current market rates, or null if server in single-currency mode
   * <li>have a ReportingAmount calculated based on the ClaimAmount and selected exchange rate, or copied from the ClaimAmount in single-currency mode
   * <li>have the specified "adjustment" flag value
   * <li>have a Status of Submitting
   * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
   * </ul>
   * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. None of the
   * arguments may be null.
   * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
   *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
   * @param reserveLine the transaction to be created will have it's Exposure, CostType, CostCategory and
   *                    ReservingCurrency properties set to those of this ReserveLine. The Exposure must
   *                    be in the same bundle as this RITransactionSet and also must be on the agreement's
   *                    RIAgreementGroup
   * @param claimAmount the ClaimAmount of the transaction to be created; the ReportingAmount will be
   *                     based on this
   * @param isAdjustment the value of the Adjustment flag for the transaction to be created
   * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
   *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
   *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
   *                                  or if claimAmount's amount has too much precision for its Currency
   *                                  or if any of the arguments are null
   * @return the new RICededReserve
   */
  public entity.RICededReserve newCededReserve(entity.RIAgreement agreement, entity.ReserveLine reserveLine, java.math.BigDecimal claimAmount, boolean isAdjustment) {
    return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newCededReserve(agreement, reserveLine, claimAmount, isAdjustment);
  }
  
  /**
   * Adds a new RICededReserve to this RITransactionSet. It will:
   * <ul>
   * <li>be on the specified RIAgreement
   * <li>be on the Exposure of the specified ReserveLine
   * <li>have its Claim set up based on the Exposure
   * <li>have the CostType, CostCategory and ReservingCurrency of the specified ReserveLine
   * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
   * <li>have the specified ClaimAmount
   * <li>have the specified ClaimToReportingExchangeRate
   * <li>have the specified ReportingAmount (if the specified ReportingAmount is null, then ReportingAmount is
   *     calculated from the ClaimAmount and ClaimToReportingExchangeRate)
   * <li>have the specified "adjustment" flag value
   * <li>have a Status of Submitting
   * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
   * </ul>
   * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. Apart from
   * reportingAmount, none of the arguments may be null. This method may only be called when the server is running in
   * multicurrency mode.
   * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
   *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
   * @param reserveLine the transaction to be created will have it's Exposure, CostType, CostCategory and
   *                    ReservingCurrency properties set to those of this ReserveLine. The Exposure must
   *                    be in the same bundle as this RITransactionSet and also must be on the agreement's
   *                    RIAgreementGroup
   * @param claimAmount the ClaimAmount of the transaction to be created
   * @param isAdjustment the value of the Adjustment flag for the transaction to be created
   * @param claimToReportingExchangeRate the ClaimToReportingExchangeRate of the transaction to be created; the base
   *                                      and price currencies of this ExchangeRate must be the claim and reporting
   *                                      currencies
   * @param reportingAmount the ReportingAmount of the transaction to be created; this argument may be null, in which
   *                         case a ReportingAmount is computed using claimAmount and claimToReportingExchangeRate
   * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
   *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
   *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
   *                                  or if either of the amount arguments have too much precision for its Currency
   *                                  or if claimToReportingExchangeRate has incorrect currencies
   *                                  or if any of the arguments (other than reportingAmount) are null
   * @throws IllegalStateException if the server is running in single-currency mode
   * @return the new RICededReserve
   */
  public entity.RICededReserve newCededReserve(entity.RIAgreement agreement, entity.ReserveLine reserveLine, java.math.BigDecimal claimAmount, boolean isAdjustment, entity.ExchangeRate claimToReportingExchangeRate, java.math.BigDecimal reportingAmount) {
    return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newCededReserve(agreement, reserveLine, claimAmount, isAdjustment, claimToReportingExchangeRate, reportingAmount);
  }
  
  /**
   * Adds a new RIRecoverable to this RITransactionSet. It will:
   * <ul>
   * <li>be on the specified RIAgreement and Exposure
   * <li>have its Claim set up based on the Exposure
   * <li>have the specified CostType and CostCategory. (ReservingCurrency is implicitly assumed to be same as ClaimCurrency)
   * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
   * <li>have the specified ClaimAmount
   * <li>have a ClaimToReportingExchangeRate selected from the current market rates, or null if server in single-currency mode
   * <li>have a ReportingAmount calculated based on the ClaimAmount and selected exchange rate, or copied from the ClaimAmount in single-currency mode
   * <li>have the specified "adjustment" flag value
   * <li>have a Status of Submitting
   * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
   * </ul>
   * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. None of the
   * arguments may be null.
   * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
   *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
   * @param exposure the Exposure of the transaction to be created; this must be in the same bundle as this
   *                  RITransactionSet; this must be on the agreement's RIAgreementGroup
   * @param costType the CostType of the transaction to be created
   * @param costCategory the CostCategory of the transaction to be created
   * @param claimAmount the ClaimAmount of the transaction to be created; the ReportingAmount will be
   *                     based on this
   * @param isAdjustment the value of the Adjustment flag for the transaction to be created
   * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
   *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
   *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
   *                                  or if claimAmount's amount has too much precision for its Currency
   *                                  or if any of the arguments are null
   * @return the new RIRecoverable
   * @deprecated As of release 8.0. Replaced by {@link #newRecoverable(entity.RIAgreement, entity.ReserveLine, java.math.BigDecimal, boolean)}.
   */
  @java.lang.Deprecated
  public entity.RIRecoverable newRecoverable(entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal claimAmount, boolean isAdjustment) {
    return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newRecoverable(agreement, exposure, costType, costCategory, claimAmount, isAdjustment);
  }
  
  /**
   * Adds a new RIRecoverable to this RITransactionSet. It will:
   * <ul>
   * <li>be on the specified RIAgreement and Exposure
   * <li>have its Claim set up based on the Exposure
   * <li>have the specified CostType and CostCategory. (ReservingCurrency is implicitly assumed to be same as ClaimCurrency)
   * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
   * <li>have the specified ClaimAmount
   * <li>have the specified ClaimToReportingExchangeRate
   * <li>have the specified ReportingAmount (if the specified ReportingAmount is null, then ReportingAmount is
   *     calculated from the ClaimAmount and ClaimToReportingExchangeRate)
   * <li>have the specified "adjustment" flag value
   * <li>have a Status of Submitting
   * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
   * </ul>
   * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. Apart from
   * reportingAmount, none of the arguments may be null. This method may only be called when the server is running in
   * multicurrency mode.
   * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
   *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
   * @param exposure the Exposure of the transaction to be created; this must be in the same bundle as this
   *                  RITransactionSet; this must be on the agreement's RIAgreementGroup
   * @param costType the CostType of the transaction to be created
   * @param costCategory the CostCategory of the transaction to be created
   * @param claimAmount the ClaimAmount of the transaction to be created
   * @param isAdjustment the value of the Adjustment flag for the transaction to be created
   * @param claimToReportingExchangeRate the ClaimToReportingExchangeRate of the transaction to be created; the base
   *                                      and price currencies of this ExchangeRate must be the claim and reporting
   *                                      currencies
   * @param reportingAmount the ReportingAmount of the transaction to be created; this argument may be null, in which
   *                         case a ReportingAmount is computed using claimAmount and claimToReportingExchangeRate
   * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
   *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
   *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
   *                                  or if either of the amount arguments have too much precision for its Currency
   *                                  or if claimToReportingExchangeRate has incorrect currencies
   *                                  or if any of the arguments (other than reportingAmount) are null
   * @throws IllegalStateException if the server is running in single-currency mode
   * @return the new RIRecoverable
   * @deprecated As of release 8.0. Replaced by {@link #newRecoverable(entity.RIAgreement, entity.ReserveLine, java.math.BigDecimal, boolean, entity.ExchangeRate, java.math.BigDecimal)}.
   */
  @java.lang.Deprecated
  public entity.RIRecoverable newRecoverable(entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal claimAmount, boolean isAdjustment, entity.ExchangeRate claimToReportingExchangeRate, java.math.BigDecimal reportingAmount) {
    return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newRecoverable(agreement, exposure, costType, costCategory, claimAmount, isAdjustment, claimToReportingExchangeRate, reportingAmount);
  }
  
  /**
   * Adds a new RIRecoverable to this RITransactionSet. It will:
   * <ul>
   * <li>be on the specified RIAgreement
   * <li>be on the Exposure of the specified ReserveLine
   * <li>have its Claim set up based on the Exposure
   * <li>have the CostType, CostCategory and ReservingCurrency of the specified ReserveLine
   * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
   * <li>have the specified ClaimAmount
   * <li>have a ClaimToReportingExchangeRate selected from the current market rates, or null if server in single-currency mode
   * <li>have a ReportingAmount calculated based on the ClaimAmount and selected exchange rate, or copied from the ClaimAmount in single-currency mode
   * <li>have the specified "adjustment" flag value
   * <li>have a Status of Submitting
   * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
   * </ul>
   * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. None of the
   * arguments may be null.
   * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
   *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
   * @param reserveLine the transaction to be created will have it's Exposure, CostType, CostCategory and
   *                    ReservingCurrency properties set to those of this ReserveLine. The Exposure must
   *                    be in the same bundle as this RITransactionSet and also must be on the agreement's
   *                    RIAgreementGroup
   * @param claimAmount the ClaimAmount of the transaction to be created; the ReportingAmount will be
   *                     based on this
   * @param isAdjustment the value of the Adjustment flag for the transaction to be created
   * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
   *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
   *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
   *                                  or if claimAmount's amount has too much precision for its Currency
   *                                  or if any of the arguments are null
   * @return the new RIRecoverable
   */
  public entity.RIRecoverable newRecoverable(entity.RIAgreement agreement, entity.ReserveLine reserveLine, java.math.BigDecimal claimAmount, boolean isAdjustment) {
    return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newRecoverable(agreement, reserveLine, claimAmount, isAdjustment);
  }
  
  /**
   * Adds a new RIRecoverable to this RITransactionSet. It will:
   * <ul>
   * <li>be on the specified RIAgreement
   * <li>be on the Exposure of the specified ReserveLine
   * <li>have its Claim set up based on the Exposure
   * <li>have the CostType, CostCategory and ReservingCurrency of the specified ReserveLine
   * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
   * <li>have the specified ClaimAmount
   * <li>have the specified ClaimToReportingExchangeRate
   * <li>have the specified ReportingAmount (if the specified ReportingAmount is null, then ReportingAmount is
   *     calculated from the ClaimAmount and ClaimToReportingExchangeRate)
   * <li>have the specified "adjustment" flag value
   * <li>have a Status of Submitting
   * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
   * </ul>
   * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. Apart from
   * reportingAmount, none of the arguments may be null. This method may only be called when the server is running in
   * multicurrency mode.
   * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
   *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
   * @param reserveLine the transaction to be created will have it's Exposure, CostType, CostCategory and
   *                    ReservingCurrency properties set to those of this ReserveLine. The Exposure must
   *                    be in the same bundle as this RITransactionSet and also must be on the agreement's
   *                    RIAgreementGroup
   * @param claimAmount the ClaimAmount of the transaction to be created
   * @param isAdjustment the value of the Adjustment flag for the transaction to be created
   * @param claimToReportingExchangeRate the ClaimToReportingExchangeRate of the transaction to be created; the base
   *                                      and price currencies of this ExchangeRate must be the claim and reporting
   *                                      currencies
   * @param reportingAmount the ReportingAmount of the transaction to be created; this argument may be null, in which
   *                         case a ReportingAmount is computed using claimAmount and claimToReportingExchangeRate
   * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
   *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
   *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
   *                                  or if either of the amount arguments have too much precision for its Currency
   *                                  or if claimToReportingExchangeRate has incorrect currencies
   *                                  or if any of the arguments (other than reportingAmount) are null
   * @throws IllegalStateException if the server is running in single-currency mode
   * @return the new RIRecoverable
   */
  public entity.RIRecoverable newRecoverable(entity.RIAgreement agreement, entity.ReserveLine reserveLine, java.math.BigDecimal claimAmount, boolean isAdjustment, entity.ExchangeRate claimToReportingExchangeRate, java.math.BigDecimal reportingAmount) {
    return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newRecoverable(agreement, reserveLine, claimAmount, isAdjustment, claimToReportingExchangeRate, reportingAmount);
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
   * Rejects the root bean w/ a global message
   * <p/>
   * Note the reason why the bean failed validation shouldn't refer to a particular
   * field in the entity. To do that, use the rejectField() method.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   */
  public void reject(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).reject(errorLevel, strErrorReason, warningLevel, strWarningReason);
  }
  
  /**
   * Rejects a particular field or field path on the root bean.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   */
  public void rejectField(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectField(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
  }
  
  /**
   * Rejects a particular field or field path on the root bean.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   * @param flowStepId The process FlowStep that this error applies to, if any
   */
  public void rejectFieldWithFlowStep(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectFieldWithFlowStep(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
  }
  
  /**
   * Reject a particular field of field path on a bean related to the root
   * bean, e.g. an array element of the bean such as an Exposure of a Claim.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param relatedBean Bean related to the root bean
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   */
  public void rejectSubField(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubField(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
  }
  
  /**
   * Reject a particular field of field path on a bean related to the root
   * bean, e.g. an array element of the bean such as an Exposure of a Claim.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * Note that this is the fullest version of "reject"; all the others are
   * overloaded for easier use.
   * @param relatedBean Bean related to the root bean
   * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   * @param flowStepId The process FlowStep that this error applies to, if any
   */
  public void rejectSubFieldWithFlowStep(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubFieldWithFlowStep(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
  }
  
  /**
   * Rejects the root bean w/ a global message
   * <p/>
   * Note the reason why the bean failed validation shouldn't refer to a particular
   * field in the entity. To do that, use the rejectField() method.
   * <p/>
   * Note you can indicate failure as both an error and a warning simultaneously.
   * However, if the failure is both an error and a warning, the failure should
   * have different error and warning levels.
   * <p/>
   * @param errorLevel The corresponding level effected by the validation error.
   * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
   * @param warningLevel The corresponding level effected by the validation warning.
   * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
   * @param flowStepId The process FlowStep that this error applies to, if any
   */
  public void rejectWithFlowStep(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
    ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectWithFlowStep(errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
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
   * Removes the given element from the RITransactions array. This is achieved by marking the element for removal.
   */
  public void removeFromRITransactions(entity.RITransaction element) {
    __getInternalInterface().removeArrayElement(RITRANSACTIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the RITransactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRITransactions(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RITRANSACTIONS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
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
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RITransactions field.
   */
  public void setRITransactions(entity.RITransaction[] value) {
    __getInternalInterface().setFieldValue(RITRANSACTIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.RITransactionSet value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RITransactionSetInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RITransactionSet.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the RITransactions array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRITransactions(entity.RITransaction element) {
      __getInternalInterface().addArrayElement(RITRANSACTIONS_PROP.get(), element);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     * The claim entity to which this TransactionSet belongs.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the Comments field.
     * Comments about the RI Transaction Set.  Typically, comments give some sense of why the transactions were created.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getComments() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RITransactions field.
     * RITransactions in the set.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RITransaction[] getRITransactions() {
      return (entity.RITransaction[])__getInternalInterface().getFieldValue(RITRANSACTIONS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RITransactionSet getSubtype() {
      return (typekey.RITransactionSet)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
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
    
    /**
     * Gets the validation result.
     * @return The validation result.
     */
    public gw.api.validation.ValidationResult getValidationResult() {
      return ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).getValidationResult();
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
    
    /**
     * Adds a new RICededReserve to this RITransactionSet. It will:
     * <ul>
     * <li>be on the specified RIAgreement and Exposure
     * <li>have its Claim set up based on the Exposure
     * <li>have the specified CostType and CostCategory. (ReservingCurrency is implicitly assumed to be same as ClaimCurrency)
     * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
     * <li>have the specified ClaimAmount
     * <li>have a ClaimToReportingExchangeRate selected from the current market rates, or null if server in single-currency mode
     * <li>have a ReportingAmount calculated based on the ClaimAmount and selected exchange rate, or copied from the ClaimAmount in single-currency mode
     * <li>have the specified "adjustment" flag value
     * <li>have a Status of Submitting
     * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
     * </ul>
     * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. None of the
     * arguments may be null.
     * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
     *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
     * @param exposure the Exposure of the transaction to be created; this must be in the same bundle as this
     *                  RITransactionSet; this must be on the agreement's RIAgreementGroup
     * @param costType the CostType of the transaction to be created
     * @param costCategory the CostCategory of the transaction to be created
     * @param claimAmount the ClaimAmount of the transaction to be created; the ReportingAmount will be
     *                     based on this
     * @param isAdjustment the value of the Adjustment flag for the transaction to be created
     * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
     *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
     *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
     *                                  or if claimAmount's amount has too much precision for its Currency
     *                                  or if any of the arguments are null
     * @return the new RICededReserve
     * @deprecated As of release 8.0. Replaced by {@link #newCededReserve(entity.RIAgreement, entity.ReserveLine, java.math.BigDecimal, boolean)}.
     */
    @java.lang.Deprecated
    public entity.RICededReserve newCededReserve(entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal claimAmount, boolean isAdjustment) {
      return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newCededReserve(agreement, exposure, costType, costCategory, claimAmount, isAdjustment);
    }
    
    /**
     * Adds a new RICededReserve to this RITransactionSet. It will:
     * <ul>
     * <li>be on the specified RIAgreement and Exposure
     * <li>have its Claim set up based on the Exposure
     * <li>have the specified CostType and CostCategory. (ReservingCurrency is implicitly assumed to be same as ClaimCurrency)
     * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
     * <li>have the specified ClaimAmount
     * <li>have the specified ClaimToReportingExchangeRate
     * <li>have the specified ReportingAmount (if the specified ReportingAmount is null, then ReportingAmount is
     *     calculated from the ClaimAmount and ClaimToReportingExchangeRate)
     * <li>have the specified "adjustment" flag value
     * <li>have a Status of Submitting
     * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
     * </ul>
     * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. Apart from
     * reportingAmount, none of the arguments may be null. This method may only be called when the server is running in
     * multicurrency mode.
     * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
     *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
     * @param exposure the Exposure of the transaction to be created; this must be in the same bundle as this
     *                  RITransactionSet; this must be on the agreement's RIAgreementGroup
     * @param costType the CostType of the transaction to be created
     * @param costCategory the CostCategory of the transaction to be created
     * @param claimAmount the ClaimAmount of the transaction to be created
     * @param isAdjustment the value of the Adjustment flag for the transaction to be created
     * @param claimToReportingExchangeRate the ClaimToReportingExchangeRate of the transaction to be created; the base
     *                                      and price currencies of this ExchangeRate must be the claim and reporting
     *                                      currencies
     * @param reportingAmount the ReportingAmount of the transaction to be created; this argument may be null, in which
     *                         case a ReportingAmount is computed using claimAmount and claimToReportingExchangeRate
     * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
     *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
     *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
     *                                  or if either of the amount arguments have too much precision for its Currency
     *                                  or if claimToReportingExchangeRate has incorrect currencies
     *                                  or if any of the arguments (other than reportingAmount) are null
     * @throws IllegalStateException if the server is running in single-currency mode
     * @return the new RICededReserve
     * @deprecated As of release 8.0. Replaced by {@link #newCededReserve(entity.RIAgreement, entity.ReserveLine, java.math.BigDecimal, boolean, entity.ExchangeRate, java.math.BigDecimal)}.
     */
    @java.lang.Deprecated
    public entity.RICededReserve newCededReserve(entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal claimAmount, boolean isAdjustment, entity.ExchangeRate claimToReportingExchangeRate, java.math.BigDecimal reportingAmount) {
      return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newCededReserve(agreement, exposure, costType, costCategory, claimAmount, isAdjustment, claimToReportingExchangeRate, reportingAmount);
    }
    
    /**
     * Adds a new RICededReserve to this RITransactionSet. It will:
     * <ul>
     * <li>be on the specified RIAgreement
     * <li>be on the Exposure of the specified ReserveLine
     * <li>have its Claim set up based on the Exposure
     * <li>have the CostType, CostCategory and ReservingCurrency of the specified ReserveLine
     * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
     * <li>have the specified ClaimAmount
     * <li>have a ClaimToReportingExchangeRate selected from the current market rates, or null if server in single-currency mode
     * <li>have a ReportingAmount calculated based on the ClaimAmount and selected exchange rate, or copied from the ClaimAmount in single-currency mode
     * <li>have the specified "adjustment" flag value
     * <li>have a Status of Submitting
     * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
     * </ul>
     * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. None of the
     * arguments may be null.
     * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
     *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
     * @param reserveLine the transaction to be created will have it's Exposure, CostType, CostCategory and
     *                    ReservingCurrency properties set to those of this ReserveLine. The Exposure must
     *                    be in the same bundle as this RITransactionSet and also must be on the agreement's
     *                    RIAgreementGroup
     * @param claimAmount the ClaimAmount of the transaction to be created; the ReportingAmount will be
     *                     based on this
     * @param isAdjustment the value of the Adjustment flag for the transaction to be created
     * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
     *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
     *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
     *                                  or if claimAmount's amount has too much precision for its Currency
     *                                  or if any of the arguments are null
     * @return the new RICededReserve
     */
    public entity.RICededReserve newCededReserve(entity.RIAgreement agreement, entity.ReserveLine reserveLine, java.math.BigDecimal claimAmount, boolean isAdjustment) {
      return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newCededReserve(agreement, reserveLine, claimAmount, isAdjustment);
    }
    
    /**
     * Adds a new RICededReserve to this RITransactionSet. It will:
     * <ul>
     * <li>be on the specified RIAgreement
     * <li>be on the Exposure of the specified ReserveLine
     * <li>have its Claim set up based on the Exposure
     * <li>have the CostType, CostCategory and ReservingCurrency of the specified ReserveLine
     * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
     * <li>have the specified ClaimAmount
     * <li>have the specified ClaimToReportingExchangeRate
     * <li>have the specified ReportingAmount (if the specified ReportingAmount is null, then ReportingAmount is
     *     calculated from the ClaimAmount and ClaimToReportingExchangeRate)
     * <li>have the specified "adjustment" flag value
     * <li>have a Status of Submitting
     * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
     * </ul>
     * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. Apart from
     * reportingAmount, none of the arguments may be null. This method may only be called when the server is running in
     * multicurrency mode.
     * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
     *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
     * @param reserveLine the transaction to be created will have it's Exposure, CostType, CostCategory and
     *                    ReservingCurrency properties set to those of this ReserveLine. The Exposure must
     *                    be in the same bundle as this RITransactionSet and also must be on the agreement's
     *                    RIAgreementGroup
     * @param claimAmount the ClaimAmount of the transaction to be created
     * @param isAdjustment the value of the Adjustment flag for the transaction to be created
     * @param claimToReportingExchangeRate the ClaimToReportingExchangeRate of the transaction to be created; the base
     *                                      and price currencies of this ExchangeRate must be the claim and reporting
     *                                      currencies
     * @param reportingAmount the ReportingAmount of the transaction to be created; this argument may be null, in which
     *                         case a ReportingAmount is computed using claimAmount and claimToReportingExchangeRate
     * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
     *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
     *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
     *                                  or if either of the amount arguments have too much precision for its Currency
     *                                  or if claimToReportingExchangeRate has incorrect currencies
     *                                  or if any of the arguments (other than reportingAmount) are null
     * @throws IllegalStateException if the server is running in single-currency mode
     * @return the new RICededReserve
     */
    public entity.RICededReserve newCededReserve(entity.RIAgreement agreement, entity.ReserveLine reserveLine, java.math.BigDecimal claimAmount, boolean isAdjustment, entity.ExchangeRate claimToReportingExchangeRate, java.math.BigDecimal reportingAmount) {
      return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newCededReserve(agreement, reserveLine, claimAmount, isAdjustment, claimToReportingExchangeRate, reportingAmount);
    }
    
    /**
     * Adds a new RIRecoverable to this RITransactionSet. It will:
     * <ul>
     * <li>be on the specified RIAgreement and Exposure
     * <li>have its Claim set up based on the Exposure
     * <li>have the specified CostType and CostCategory. (ReservingCurrency is implicitly assumed to be same as ClaimCurrency)
     * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
     * <li>have the specified ClaimAmount
     * <li>have a ClaimToReportingExchangeRate selected from the current market rates, or null if server in single-currency mode
     * <li>have a ReportingAmount calculated based on the ClaimAmount and selected exchange rate, or copied from the ClaimAmount in single-currency mode
     * <li>have the specified "adjustment" flag value
     * <li>have a Status of Submitting
     * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
     * </ul>
     * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. None of the
     * arguments may be null.
     * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
     *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
     * @param exposure the Exposure of the transaction to be created; this must be in the same bundle as this
     *                  RITransactionSet; this must be on the agreement's RIAgreementGroup
     * @param costType the CostType of the transaction to be created
     * @param costCategory the CostCategory of the transaction to be created
     * @param claimAmount the ClaimAmount of the transaction to be created; the ReportingAmount will be
     *                     based on this
     * @param isAdjustment the value of the Adjustment flag for the transaction to be created
     * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
     *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
     *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
     *                                  or if claimAmount's amount has too much precision for its Currency
     *                                  or if any of the arguments are null
     * @return the new RIRecoverable
     * @deprecated As of release 8.0. Replaced by {@link #newRecoverable(entity.RIAgreement, entity.ReserveLine, java.math.BigDecimal, boolean)}.
     */
    @java.lang.Deprecated
    public entity.RIRecoverable newRecoverable(entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal claimAmount, boolean isAdjustment) {
      return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newRecoverable(agreement, exposure, costType, costCategory, claimAmount, isAdjustment);
    }
    
    /**
     * Adds a new RIRecoverable to this RITransactionSet. It will:
     * <ul>
     * <li>be on the specified RIAgreement and Exposure
     * <li>have its Claim set up based on the Exposure
     * <li>have the specified CostType and CostCategory. (ReservingCurrency is implicitly assumed to be same as ClaimCurrency)
     * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
     * <li>have the specified ClaimAmount
     * <li>have the specified ClaimToReportingExchangeRate
     * <li>have the specified ReportingAmount (if the specified ReportingAmount is null, then ReportingAmount is
     *     calculated from the ClaimAmount and ClaimToReportingExchangeRate)
     * <li>have the specified "adjustment" flag value
     * <li>have a Status of Submitting
     * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
     * </ul>
     * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. Apart from
     * reportingAmount, none of the arguments may be null. This method may only be called when the server is running in
     * multicurrency mode.
     * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
     *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
     * @param exposure the Exposure of the transaction to be created; this must be in the same bundle as this
     *                  RITransactionSet; this must be on the agreement's RIAgreementGroup
     * @param costType the CostType of the transaction to be created
     * @param costCategory the CostCategory of the transaction to be created
     * @param claimAmount the ClaimAmount of the transaction to be created
     * @param isAdjustment the value of the Adjustment flag for the transaction to be created
     * @param claimToReportingExchangeRate the ClaimToReportingExchangeRate of the transaction to be created; the base
     *                                      and price currencies of this ExchangeRate must be the claim and reporting
     *                                      currencies
     * @param reportingAmount the ReportingAmount of the transaction to be created; this argument may be null, in which
     *                         case a ReportingAmount is computed using claimAmount and claimToReportingExchangeRate
     * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
     *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
     *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
     *                                  or if either of the amount arguments have too much precision for its Currency
     *                                  or if claimToReportingExchangeRate has incorrect currencies
     *                                  or if any of the arguments (other than reportingAmount) are null
     * @throws IllegalStateException if the server is running in single-currency mode
     * @return the new RIRecoverable
     * @deprecated As of release 8.0. Replaced by {@link #newRecoverable(entity.RIAgreement, entity.ReserveLine, java.math.BigDecimal, boolean, entity.ExchangeRate, java.math.BigDecimal)}.
     */
    @java.lang.Deprecated
    public entity.RIRecoverable newRecoverable(entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, java.math.BigDecimal claimAmount, boolean isAdjustment, entity.ExchangeRate claimToReportingExchangeRate, java.math.BigDecimal reportingAmount) {
      return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newRecoverable(agreement, exposure, costType, costCategory, claimAmount, isAdjustment, claimToReportingExchangeRate, reportingAmount);
    }
    
    /**
     * Adds a new RIRecoverable to this RITransactionSet. It will:
     * <ul>
     * <li>be on the specified RIAgreement
     * <li>be on the Exposure of the specified ReserveLine
     * <li>have its Claim set up based on the Exposure
     * <li>have the CostType, CostCategory and ReservingCurrency of the specified ReserveLine
     * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
     * <li>have the specified ClaimAmount
     * <li>have a ClaimToReportingExchangeRate selected from the current market rates, or null if server in single-currency mode
     * <li>have a ReportingAmount calculated based on the ClaimAmount and selected exchange rate, or copied from the ClaimAmount in single-currency mode
     * <li>have the specified "adjustment" flag value
     * <li>have a Status of Submitting
     * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
     * </ul>
     * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. None of the
     * arguments may be null.
     * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
     *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
     * @param reserveLine the transaction to be created will have it's Exposure, CostType, CostCategory and
     *                    ReservingCurrency properties set to those of this ReserveLine. The Exposure must
     *                    be in the same bundle as this RITransactionSet and also must be on the agreement's
     *                    RIAgreementGroup
     * @param claimAmount the ClaimAmount of the transaction to be created; the ReportingAmount will be
     *                     based on this
     * @param isAdjustment the value of the Adjustment flag for the transaction to be created
     * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
     *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
     *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
     *                                  or if claimAmount's amount has too much precision for its Currency
     *                                  or if any of the arguments are null
     * @return the new RIRecoverable
     */
    public entity.RIRecoverable newRecoverable(entity.RIAgreement agreement, entity.ReserveLine reserveLine, java.math.BigDecimal claimAmount, boolean isAdjustment) {
      return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newRecoverable(agreement, reserveLine, claimAmount, isAdjustment);
    }
    
    /**
     * Adds a new RIRecoverable to this RITransactionSet. It will:
     * <ul>
     * <li>be on the specified RIAgreement
     * <li>be on the Exposure of the specified ReserveLine
     * <li>have its Claim set up based on the Exposure
     * <li>have the CostType, CostCategory and ReservingCurrency of the specified ReserveLine
     * <li>be set up with an RICoding matching those values, which will either be found in the db or bundle or be created
     * <li>have the specified ClaimAmount
     * <li>have the specified ClaimToReportingExchangeRate
     * <li>have the specified ReportingAmount (if the specified ReportingAmount is null, then ReportingAmount is
     *     calculated from the ClaimAmount and ClaimToReportingExchangeRate)
     * <li>have the specified "adjustment" flag value
     * <li>have a Status of Submitting
     * <li>have its LifeCycleState transitioned from New to Committed, creating corresponding RITAccountTransactions
     * </ul>
     * The bundle and claim of the arguments must match the bundle and claim of this RITransactionSet. Apart from
     * reportingAmount, none of the arguments may be null. This method may only be called when the server is running in
     * multicurrency mode.
     * @param agreement the RIAgreement of the transaction to be created; this must be in the same bundle as this
     *                   RITransactionSet; this must be in the same RIAgreementGroup as the exposure
     * @param reserveLine the transaction to be created will have it's Exposure, CostType, CostCategory and
     *                    ReservingCurrency properties set to those of this ReserveLine. The Exposure must
     *                    be in the same bundle as this RITransactionSet and also must be on the agreement's
     *                    RIAgreementGroup
     * @param claimAmount the ClaimAmount of the transaction to be created
     * @param isAdjustment the value of the Adjustment flag for the transaction to be created
     * @param claimToReportingExchangeRate the ClaimToReportingExchangeRate of the transaction to be created; the base
     *                                      and price currencies of this ExchangeRate must be the claim and reporting
     *                                      currencies
     * @param reportingAmount the ReportingAmount of the transaction to be created; this argument may be null, in which
     *                         case a ReportingAmount is computed using claimAmount and claimToReportingExchangeRate
     * @throws IllegalArgumentException if agreement and exposure are not in this RITransactionSet's bundle
     *                                  or if the RIAgreementGroup doesn't have the same Claim as this RITransactionSet
     *                                  or if the Exposure doesn't have the same Claim as this RITransactionSet
     *                                  or if either of the amount arguments have too much precision for its Currency
     *                                  or if claimToReportingExchangeRate has incorrect currencies
     *                                  or if any of the arguments (other than reportingAmount) are null
     * @throws IllegalStateException if the server is running in single-currency mode
     * @return the new RIRecoverable
     */
    public entity.RIRecoverable newRecoverable(entity.RIAgreement agreement, entity.ReserveLine reserveLine, java.math.BigDecimal claimAmount, boolean isAdjustment, entity.ExchangeRate claimToReportingExchangeRate, java.math.BigDecimal reportingAmount) {
      return ((gw.cc.financials.entity.RITransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransactionSet")).newRecoverable(agreement, reserveLine, claimAmount, isAdjustment, claimToReportingExchangeRate, reportingAmount);
    }
    
    public <T extends entity.RITransaction> T newTransaction(gw.pl.persistence.type.EntityTypeReference<T> type, entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, typekey.Currency reservingCurrency, java.math.BigDecimal claimAmount, boolean isAdjustment) {
      return ((com.guidewire.cc.domain.financials.impl.RITransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.RITransactionSetInternal")).newTransaction(type, agreement, exposure, costType, costCategory, reservingCurrency, claimAmount, isAdjustment);
    }
    
    public <T extends entity.RITransaction> T newTransaction(gw.pl.persistence.type.EntityTypeReference<T> type, entity.RIAgreement agreement, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, typekey.Currency reservingCurrency, java.math.BigDecimal claimAmount, boolean isAdjustment, entity.ExchangeRate marketClaimToReportingExchangeRate, java.math.BigDecimal reportingAmount) {
      return ((com.guidewire.cc.domain.financials.impl.RITransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.RITransactionSetInternal")).newTransaction(type, agreement, exposure, costType, costCategory, reservingCurrency, claimAmount, isAdjustment, marketClaimToReportingExchangeRate, reportingAmount);
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
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void reject(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).reject(errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectField(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectField(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectFieldWithFlowStep(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectFieldWithFlowStep(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectSubField(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubField(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * Note that this is the fullest version of "reject"; all the others are
     * overloaded for easier use.
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectSubFieldWithFlowStep(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubFieldWithFlowStep(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectWithFlowStep(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectWithFlowStep(errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
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
    
    /**
     * Removes the given element from the RITransactions array. This is achieved by marking the element for removal.
     */
    public void removeFromRITransactions(entity.RITransaction element) {
      __getInternalInterface().removeArrayElement(RITRANSACTIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the RITransactions array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRITransactions(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RITRANSACTIONS_PROP.get(), elementID);
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
     * Sets the value of the Comments field.
     */
    public void setComments(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RITransactions field.
     */
    public void setRITransactions(entity.RITransaction[] value) {
      __getInternalInterface().setFieldValue(RITRANSACTIONS_PROP.get(), value);
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
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.RITransactionSet value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
    
    public void setValidationResult(gw.api.validation.ValidationResult result) {
      ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).setValidationResult(result);
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
    
    public gw.api.validation.ValidationResult validate() {
      return ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).validate();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.impl.RITransactionSetInternal", "com.guidewire.cc.domain.financials.impl.RITransactionSetImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.pl.domain.validation.impl.ValidatableImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.pl.domain.validation.impl.ValidatableImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.financials.entity.RITransactionSet", "com.guidewire.cc.domain.financials.impl.RITransactionSetImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RITransactionSet.class, config);
    com.guidewire._generated.entity.RITransactionSetInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RITransactionSet, com.guidewire._generated.entity.RITransactionSetInternal>() {
      public java.lang.Object getImplementation(entity.RITransactionSet bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RITransactionSetInternal getInternalInterface(entity.RITransactionSet bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RITransactionSet newEmptyInstance() {
        return new entity.RITransactionSet((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}