package entity;

/**
 * EmploymentData
 * Employment information for an exposure on a workers' comp claim.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EmploymentData.eti;EmploymentData.eix;EmploymentData.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "EmploymentData")
public class EmploymentData extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.EmploymentData> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.EmploymentData>("entity.EmploymentData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLASSCODE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClassCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DAYSWORKEDWEEK_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DaysWorkedWeek");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEPARTMENTCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DepartmentCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> EMPLOYMENTSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "EmploymentStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HIREDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HireDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> HIRESTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "HireState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INJURYSTARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InjuryStartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTWORKEDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LastWorkedDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTYEARINCOME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LastYearIncome");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMDAYSWORKED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumDaysWorked");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMHOURSWORKED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumHoursWorked");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OCCUPATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Occupation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OVERTIMERATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OvertimeRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAIDFULL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PaidFull");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PAYPERIOD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PayPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SSBENEFITS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SSBenefits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SSBENEFITSAMNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SSBenefitsAmnt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCNDINJRYFND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ScndInjryFnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCNDINJRYFNDAMNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ScndInjryFndAmnt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCNDINJRYFNDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ScndInjryFndDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAGEAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WageAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAGEAMOUNTPOSTINJURY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WageAmountPostInjury");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WAGEPAYMENTCONT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WagePaymentCont");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> WORKSTATUSCHANGES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "WorkStatusChanges");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.EmploymentDataInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public EmploymentData()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public EmploymentData(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected EmploymentData(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.EmploymentDataInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.EmploymentDataInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the WorkStatusChanges array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToWorkStatusChanges(entity.WorkStatus element) {
    __getInternalInterface().addArrayElement(WORKSTATUSCHANGES_PROP.get(), element);
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
   * The Claim that owns this EmploymentData
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the ClassCode field.
   * Classification of employee, based on state codes or NCCI codes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClassCode getClassCode() {
    return (entity.ClassCode)__getInternalInterface().getFieldValue(CLASSCODE_PROP.get());
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
   * Gets the value of the DaysWorkedWeek field.
   * Text description of the days the employee normally works. For example, Monday-Friday or MWF.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDaysWorkedWeek() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DAYSWORKEDWEEK_PROP.get());
  }
  
  /**
   * Gets the value of the DepartmentCode field.
   * Code of department in which employee was working.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDepartmentCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DEPARTMENTCODE_PROP.get());
  }
  
  /**
   * Gets the value of the EmploymentStatus field.
   * Status of employment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.EmploymentStatusType getEmploymentStatus() {
    return (typekey.EmploymentStatusType)__getInternalInterface().getFieldValue(EMPLOYMENTSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the HireDate field.
   * Employee's date of hire.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getHireDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(HIREDATE_PROP.get());
  }
  
  /**
   * Gets the value of the HireState field.
   * State in which the employee was hired.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getHireState() {
    return (typekey.State)__getInternalInterface().getFieldValue(HIRESTATE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the InjuryStartTime field.
   * Start time on day of injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getInjuryStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(INJURYSTARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the LastWorkedDate field.
   * Date employee last worked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastWorkedDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LASTWORKEDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the LastYearIncome field.
   * Income in the last calendar year.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLastYearIncome() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LASTYEARINCOME_PROP.get());
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  /**
   * Gets the value of the NumDaysWorked field.
   * Number of days worked per week.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNumDaysWorked() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NUMDAYSWORKED_PROP.get());
  }
  
  /**
   * Gets the value of the NumHoursWorked field.
   * Number of hours worked per day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNumHoursWorked() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NUMHOURSWORKED_PROP.get());
  }
  
  /**
   * Gets the value of the Occupation field.
   * Description of the employee's job.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOccupation() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OCCUPATION_PROP.get());
  }
  
  /**
   * Gets the value of the OvertimeRate field.
   * Overtime wage rate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOvertimeRate() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OVERTIMERATE_PROP.get());
  }
  
  /**
   * Gets the value of the PayPeriod field.
   * Pay period of employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PayPeriodType getPayPeriod() {
    return (typekey.PayPeriodType)__getInternalInterface().getFieldValue(PAYPERIOD_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
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
   * Gets the value of the SSBenefitsAmnt field.
   * Amount of Social Security benefits.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSSBenefitsAmnt() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SSBENEFITSAMNT_PROP.get());
  }
  
  /**
   * Gets the value of the ScndInjryFndAmnt field.
   * Amount of second injury fund benefits.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getScndInjryFndAmnt() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SCNDINJRYFNDAMNT_PROP.get());
  }
  
  /**
   * Gets the value of the ScndInjryFndDate field.
   * Date of initial notice to second injury fund.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScndInjryFndDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SCNDINJRYFNDDATE_PROP.get());
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
   * Gets the value of the WageAmount field.
   * Amount of wages per pay period pre-injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getWageAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(WAGEAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the WageAmountPostInjury field.
   * Amount of wages per pay period post-injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getWageAmountPostInjury() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(WAGEAMOUNTPOSTINJURY_PROP.get());
  }
  
  /**
   * Gets the value of the WorkStatusChanges field.
   * Periods of time employee returned to work.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkStatus[] getWorkStatusChanges() {
    return (entity.WorkStatus[])__getInternalInterface().getFieldValue(WORKSTATUSCHANGES_PROP.get());
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
   * Gets the value of the PaidFull field.
   * Whether the employee was paid full wages for the day of injury or last day worked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPaidFull() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PAIDFULL_PROP.get());
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
   * Gets the value of the SSBenefits field.
   * Whether Social Security benefits apply.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSSBenefits() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SSBENEFITS_PROP.get());
  }
  
  /**
   * Gets the value of the ScndInjryFnd field.
   * Whether second injury fund benefits apply.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isScndInjryFnd() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SCNDINJRYFND_PROP.get());
  }
  
  /**
   * Gets the value of the WagePaymentCont field.
   * Whether claimant's salary was continued.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWagePaymentCont() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(WAGEPAYMENTCONT_PROP.get());
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
   * Removes the given element from the WorkStatusChanges array. This is achieved by marking the element for removal.
   */
  public void removeFromWorkStatusChanges(entity.WorkStatus element) {
    __getInternalInterface().removeArrayElement(WORKSTATUSCHANGES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the WorkStatusChanges array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromWorkStatusChanges(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(WORKSTATUSCHANGES_PROP.get(), elementID);
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
   * Sets the value of the ClassCode field.
   */
  public void setClassCode(entity.ClassCode value) {
    __getInternalInterface().setFieldValue(CLASSCODE_PROP.get(), value);
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
   * Sets the value of the DaysWorkedWeek field.
   */
  public void setDaysWorkedWeek(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DAYSWORKEDWEEK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DepartmentCode field.
   */
  public void setDepartmentCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DEPARTMENTCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmploymentStatus field.
   */
  public void setEmploymentStatus(typekey.EmploymentStatusType value) {
    __getInternalInterface().setFieldValue(EMPLOYMENTSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HireDate field.
   */
  public void setHireDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(HIREDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HireState field.
   */
  public void setHireState(typekey.State value) {
    __getInternalInterface().setFieldValue(HIRESTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InjuryStartTime field.
   */
  public void setInjuryStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(INJURYSTARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastWorkedDate field.
   */
  public void setLastWorkedDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(LASTWORKEDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastYearIncome field.
   */
  public void setLastYearIncome(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(LASTYEARINCOME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
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
   * Sets the value of the NumDaysWorked field.
   */
  public void setNumDaysWorked(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(NUMDAYSWORKED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumHoursWorked field.
   */
  public void setNumHoursWorked(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(NUMHOURSWORKED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Occupation field.
   */
  public void setOccupation(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(OCCUPATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OvertimeRate field.
   */
  public void setOvertimeRate(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(OVERTIMERATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaidFull field.
   */
  public void setPaidFull(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PAIDFULL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PayPeriod field.
   */
  public void setPayPeriod(typekey.PayPeriodType value) {
    __getInternalInterface().setFieldValue(PAYPERIOD_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SSBenefits field.
   */
  public void setSSBenefits(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SSBENEFITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SSBenefitsAmnt field.
   */
  public void setSSBenefitsAmnt(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(SSBENEFITSAMNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScndInjryFnd field.
   */
  public void setScndInjryFnd(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SCNDINJRYFND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScndInjryFndAmnt field.
   */
  public void setScndInjryFndAmnt(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(SCNDINJRYFNDAMNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScndInjryFndDate field.
   */
  public void setScndInjryFndDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SCNDINJRYFNDDATE_PROP.get(), value);
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
   * Sets the value of the WageAmount field.
   */
  public void setWageAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(WAGEAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WageAmountPostInjury field.
   */
  public void setWageAmountPostInjury(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(WAGEAMOUNTPOSTINJURY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WagePaymentCont field.
   */
  public void setWagePaymentCont(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(WAGEPAYMENTCONT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkStatusChanges field.
   */
  public void setWorkStatusChanges(entity.WorkStatus[] value) {
    __getInternalInterface().setFieldValue(WORKSTATUSCHANGES_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.EmploymentDataInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.EmploymentData.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the WorkStatusChanges array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToWorkStatusChanges(entity.WorkStatus element) {
      __getInternalInterface().addArrayElement(WORKSTATUSCHANGES_PROP.get(), element);
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
     * The Claim that owns this EmploymentData
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClassCode field.
     * Classification of employee, based on state codes or NCCI codes.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClassCode getClassCode() {
      return (entity.ClassCode)__getInternalInterface().getFieldValue(CLASSCODE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClassCodeID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLASSCODE_PROP.get());
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
     * Gets the value of the DaysWorkedWeek field.
     * Text description of the days the employee normally works. For example, Monday-Friday or MWF.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDaysWorkedWeek() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DAYSWORKEDWEEK_PROP.get());
    }
    
    /**
     * Gets the value of the DepartmentCode field.
     * Code of department in which employee was working.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDepartmentCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DEPARTMENTCODE_PROP.get());
    }
    
    /**
     * Gets the value of the EmploymentStatus field.
     * Status of employment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.EmploymentStatusType getEmploymentStatus() {
      return (typekey.EmploymentStatusType)__getInternalInterface().getFieldValue(EMPLOYMENTSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the HireDate field.
     * Employee's date of hire.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getHireDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(HIREDATE_PROP.get());
    }
    
    /**
     * Gets the value of the HireState field.
     * State in which the employee was hired.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getHireState() {
      return (typekey.State)__getInternalInterface().getFieldValue(HIRESTATE_PROP.get());
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
     * Gets the value of the InjuryStartTime field.
     * Start time on day of injury.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getInjuryStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(INJURYSTARTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the LastWorkedDate field.
     * Date employee last worked.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLastWorkedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LASTWORKEDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the LastYearIncome field.
     * Income in the last calendar year.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getLastYearIncome() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(LASTYEARINCOME_PROP.get());
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the NumDaysWorked field.
     * Number of days worked per week.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getNumDaysWorked() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NUMDAYSWORKED_PROP.get());
    }
    
    /**
     * Gets the value of the NumHoursWorked field.
     * Number of hours worked per day.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getNumHoursWorked() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NUMHOURSWORKED_PROP.get());
    }
    
    /**
     * Gets the value of the Occupation field.
     * Description of the employee's job.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOccupation() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OCCUPATION_PROP.get());
    }
    
    /**
     * Gets the value of the OvertimeRate field.
     * Overtime wage rate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getOvertimeRate() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(OVERTIMERATE_PROP.get());
    }
    
    /**
     * Gets the value of the PayPeriod field.
     * Pay period of employee.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PayPeriodType getPayPeriod() {
      return (typekey.PayPeriodType)__getInternalInterface().getFieldValue(PAYPERIOD_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the SSBenefitsAmnt field.
     * Amount of Social Security benefits.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getSSBenefitsAmnt() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SSBENEFITSAMNT_PROP.get());
    }
    
    /**
     * Gets the value of the ScndInjryFndAmnt field.
     * Amount of second injury fund benefits.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getScndInjryFndAmnt() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(SCNDINJRYFNDAMNT_PROP.get());
    }
    
    /**
     * Gets the value of the ScndInjryFndDate field.
     * Date of initial notice to second injury fund.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getScndInjryFndDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SCNDINJRYFNDDATE_PROP.get());
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
     * Gets the value of the WageAmount field.
     * Amount of wages per pay period pre-injury.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getWageAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(WAGEAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the WageAmountPostInjury field.
     * Amount of wages per pay period post-injury.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getWageAmountPostInjury() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(WAGEAMOUNTPOSTINJURY_PROP.get());
    }
    
    /**
     * Gets the value of the WorkStatusChanges field.
     * Periods of time employee returned to work.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.WorkStatus[] getWorkStatusChanges() {
      return (entity.WorkStatus[])__getInternalInterface().getFieldValue(WORKSTATUSCHANGES_PROP.get());
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
     * Gets the value of the PaidFull field.
     * Whether the employee was paid full wages for the day of injury or last day worked.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPaidFull() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PAIDFULL_PROP.get());
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
     * Gets the value of the SSBenefits field.
     * Whether Social Security benefits apply.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSSBenefits() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SSBENEFITS_PROP.get());
    }
    
    /**
     * Gets the value of the ScndInjryFnd field.
     * Whether second injury fund benefits apply.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isScndInjryFnd() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SCNDINJRYFND_PROP.get());
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the WagePaymentCont field.
     * Whether claimant's salary was continued.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isWagePaymentCont() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(WAGEPAYMENTCONT_PROP.get());
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
    
    /**
     * Removes the given element from the WorkStatusChanges array. This is achieved by marking the element for removal.
     */
    public void removeFromWorkStatusChanges(entity.WorkStatus element) {
      __getInternalInterface().removeArrayElement(WORKSTATUSCHANGES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the WorkStatusChanges array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromWorkStatusChanges(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(WORKSTATUSCHANGES_PROP.get(), elementID);
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
     * Sets the value of the ClassCode field.
     */
    public void setClassCode(entity.ClassCode value) {
      __getInternalInterface().setFieldValue(CLASSCODE_PROP.get(), value);
    }
    
    public void setClassCodeID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLASSCODE_PROP.get(), value);
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
     * Sets the value of the DaysWorkedWeek field.
     */
    public void setDaysWorkedWeek(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DAYSWORKEDWEEK_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DepartmentCode field.
     */
    public void setDepartmentCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DEPARTMENTCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmploymentStatus field.
     */
    public void setEmploymentStatus(typekey.EmploymentStatusType value) {
      __getInternalInterface().setFieldValue(EMPLOYMENTSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HireDate field.
     */
    public void setHireDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(HIREDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HireState field.
     */
    public void setHireState(typekey.State value) {
      __getInternalInterface().setFieldValue(HIRESTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InjuryStartTime field.
     */
    public void setInjuryStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(INJURYSTARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastWorkedDate field.
     */
    public void setLastWorkedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LASTWORKEDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastYearIncome field.
     */
    public void setLastYearIncome(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(LASTYEARINCOME_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
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
     * Sets the value of the NumDaysWorked field.
     */
    public void setNumDaysWorked(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(NUMDAYSWORKED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumHoursWorked field.
     */
    public void setNumHoursWorked(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(NUMHOURSWORKED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Occupation field.
     */
    public void setOccupation(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(OCCUPATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OvertimeRate field.
     */
    public void setOvertimeRate(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(OVERTIMERATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaidFull field.
     */
    public void setPaidFull(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PAIDFULL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PayPeriod field.
     */
    public void setPayPeriod(typekey.PayPeriodType value) {
      __getInternalInterface().setFieldValue(PAYPERIOD_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
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
     * Sets the value of the SSBenefits field.
     */
    public void setSSBenefits(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SSBENEFITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SSBenefitsAmnt field.
     */
    public void setSSBenefitsAmnt(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(SSBENEFITSAMNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ScndInjryFnd field.
     */
    public void setScndInjryFnd(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SCNDINJRYFND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ScndInjryFndAmnt field.
     */
    public void setScndInjryFndAmnt(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(SCNDINJRYFNDAMNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ScndInjryFndDate field.
     */
    public void setScndInjryFndDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SCNDINJRYFNDDATE_PROP.get(), value);
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
     * Sets the value of the WageAmount field.
     */
    public void setWageAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(WAGEAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WageAmountPostInjury field.
     */
    public void setWageAmountPostInjury(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(WAGEAMOUNTPOSTINJURY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WagePaymentCont field.
     */
    public void setWagePaymentCont(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(WAGEPAYMENTCONT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkStatusChanges field.
     */
    public void setWorkStatusChanges(entity.WorkStatus[] value) {
      __getInternalInterface().setFieldValue(WORKSTATUSCHANGES_PROP.get(), value);
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
    config.put("gw.cc.exposure.entity.EmploymentData", "com.guidewire.cc.domain.exposure.impl.EmploymentDataImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.EmploymentData.class, config);
    com.guidewire._generated.entity.EmploymentDataInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.EmploymentData, com.guidewire._generated.entity.EmploymentDataInternal>() {
      public java.lang.Object getImplementation(entity.EmploymentData bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.EmploymentDataInternal getInternalInterface(entity.EmploymentData bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.EmploymentData newEmptyInstance() {
        return new entity.EmploymentData((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}