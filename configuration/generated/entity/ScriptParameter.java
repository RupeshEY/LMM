package entity;

/**
 * ScriptParameter
 * 
 *       Global variables that can be created in Studio, then referenced in Gosu. Can be created in Guidewire Studio from the Tools menu -> Script Parameters.
 *       Created parameters can be referenced as static members off of the ScriptParameter class, for example <code>ScriptParameter.OUR_STANDARD_RATE</code>.
 *       Their values can be edited in the Guidewire applications from the Administration tab.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ScriptParameter.eti;ScriptParameter.eix;ScriptParameter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ScriptParameter")
public class ScriptParameter extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ScriptParameter> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ScriptParameter>("entity.ScriptParameter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BITVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BitValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATETIMEVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DatetimeValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> GROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Group");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IntegerValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONEYVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MoneyValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONTHLYFREQUENCYVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MonthlyfrequencyValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NONNEGATIVEINTEGERVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NonnegativeintegerValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NONNEGATIVEMONEYVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NonnegativemoneyValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PARAMETERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ParameterName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PARAMETERTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ParameterType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTAGEVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PercentageValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTAGEDECVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PercentagedecValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PHONEVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PhoneValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POSITIVEINTEGERVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PositiveintegerValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POSITIVEMONEYVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PositivemoneyValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POSTALCODEVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PostalCodeValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RISKVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RiskValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SPEEDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SpeedValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> USER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "User");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VARCHARVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "VarcharValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WEEKLYFREQUENCYVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WeeklyfrequencyValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> YEARVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "YearValue");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ScriptParameterInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ScriptParameter()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ScriptParameter(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ScriptParameter(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ScriptParameterInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ScriptParameterInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
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
   * Gets the value of the DatetimeValue field.
   * Value if the parameter type is Datetime.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDatetimeValue() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATETIMEVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the DecimalValue field.
   * Value if the parameter type is Decimal.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDecimalValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DECIMALVALUE_PROP.get());
  }
  
  /**
   * Returns localized description of the parameter
   * @return localized description of the parameter
   */
  public java.lang.String getDescription() {
    return ((com.guidewire.pl.domain.scriptparameter.ScriptParameterPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.scriptparameter.ScriptParameterPublicMethods")).getDescription();
  }
  
  /**
   * Gets the value of the Group field.
   * Group value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the IntegerValue field.
   * Value if the parameter type is Int.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(INTEGERVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the MoneyValue field.
   * Value if the parameter type is Money.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getMoneyValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(MONEYVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the MonthlyfrequencyValue field.
   * Value if the parameter type is Monthly frequency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMonthlyfrequencyValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(MONTHLYFREQUENCYVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the NonnegativeintegerValue field.
   * Value if the parameter type is a Non-negative integer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNonnegativeintegerValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NONNEGATIVEINTEGERVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the NonnegativemoneyValue field.
   * Value if the parameter type is Non-negative money.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNonnegativemoneyValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NONNEGATIVEMONEYVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the ParameterName field.
   * Name of the parameter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getParameterName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PARAMETERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ParameterType field.
   * Identifies the value type (string, integer, boolean, date, etc).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ScriptParameterType getParameterType() {
    return (typekey.ScriptParameterType)__getInternalInterface().getFieldValue(PARAMETERTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the PercentageValue field.
   * Value if the parameter type is Percentage.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPercentageValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(PERCENTAGEVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the PercentagedecValue field.
   * Value if the parameter type is Percentagedec.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentagedecValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PERCENTAGEDECVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the PhoneValue field.
   * Value if the parameter type is Phone.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPhoneValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PHONEVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the PositiveintegerValue field.
   * Value if the parameter type is Positive integer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPositiveintegerValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(POSITIVEINTEGERVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the PositivemoneyValue field.
   * Value if the parameter type is Positive money.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPositivemoneyValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(POSITIVEMONEYVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the PostalCodeValue field.
   * Value if the parameter type is PostalCode.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPostalCodeValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POSTALCODEVALUE_PROP.get());
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
   * Gets the value of the RiskValue field.
   * Value if the parameter type is Risk.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRiskValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(RISKVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the SpeedValue field.
   * Value if the parameter type is Speed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSpeedValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SPEEDVALUE_PROP.get());
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
   * Gets the value of the User field.
   * User that created the script parameter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser() {
    return (entity.User)__getInternalInterface().getFieldValue(USER_PROP.get());
  }
  
  /**
   * Gets the value of the VarcharValue field.
   * Value if the parameter type is Varchar (i.e. String).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVarcharValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VARCHARVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the WeeklyfrequencyValue field.
   * Value if the parameter type is Weekly frequency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWeeklyfrequencyValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(WEEKLYFREQUENCYVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the YearValue field.
   * Value if the parameter type is Year.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getYearValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(YEARVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the BitValue field.
   * Value if the parameter type is Bit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBitValue() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(BITVALUE_PROP.get());
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
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BitValue field.
   */
  public void setBitValue(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(BITVALUE_PROP.get(), value);
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
   * Sets the value of the DatetimeValue field.
   */
  public void setDatetimeValue(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATETIMEVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DecimalValue field.
   */
  public void setDecimalValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DECIMALVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IntegerValue field.
   */
  public void setIntegerValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(INTEGERVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MoneyValue field.
   */
  public void setMoneyValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(MONEYVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MonthlyfrequencyValue field.
   */
  public void setMonthlyfrequencyValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(MONTHLYFREQUENCYVALUE_PROP.get(), value);
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
   * Sets the value of the NonnegativeintegerValue field.
   */
  public void setNonnegativeintegerValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NONNEGATIVEINTEGERVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NonnegativemoneyValue field.
   */
  public void setNonnegativemoneyValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(NONNEGATIVEMONEYVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ParameterName field.
   */
  public void setParameterName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PARAMETERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ParameterType field.
   */
  public void setParameterType(typekey.ScriptParameterType value) {
    __getInternalInterface().setFieldValue(PARAMETERTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PercentageValue field.
   */
  public void setPercentageValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(PERCENTAGEVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PercentagedecValue field.
   */
  public void setPercentagedecValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PERCENTAGEDECVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PhoneValue field.
   */
  public void setPhoneValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PHONEVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PositiveintegerValue field.
   */
  public void setPositiveintegerValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(POSITIVEINTEGERVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PositivemoneyValue field.
   */
  public void setPositivemoneyValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(POSITIVEMONEYVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PostalCodeValue field.
   */
  public void setPostalCodeValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POSTALCODEVALUE_PROP.get(), value);
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
   * Sets the value of the RiskValue field.
   */
  public void setRiskValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(RISKVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SpeedValue field.
   */
  public void setSpeedValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SPEEDVALUE_PROP.get(), value);
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
   * Sets the value of the User field.
   */
  public void setUser(entity.User value) {
    __getInternalInterface().setFieldValue(USER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the VarcharValue field.
   */
  public void setVarcharValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VARCHARVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WeeklyfrequencyValue field.
   */
  public void setWeeklyfrequencyValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(WEEKLYFREQUENCYVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the YearValue field.
   */
  public void setYearValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(YEARVALUE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ScriptParameterInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ScriptParameter.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
    }
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
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
    
    public java.lang.String getAccessorName() {
      return ((com.guidewire.pl.domain.scriptparameter.impl.ScriptParameterInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.scriptparameter.impl.ScriptParameterInternalMethods")).getAccessorName();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
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
     * Gets the value of the DatetimeValue field.
     * Value if the parameter type is Datetime.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDatetimeValue() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATETIMEVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the DecimalValue field.
     * Value if the parameter type is Decimal.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDecimalValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DECIMALVALUE_PROP.get());
    }
    
    /**
     * Returns localized description of the parameter
     * @return localized description of the parameter
     */
    public java.lang.String getDescription() {
      return ((com.guidewire.pl.domain.scriptparameter.ScriptParameterPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.scriptparameter.ScriptParameterPublicMethods")).getDescription();
    }
    
    /**
     * Gets the value of the Group field.
     * Group value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(GROUP_PROP.get());
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
     * Gets the value of the IntegerValue field.
     * Value if the parameter type is Int.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getIntegerValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(INTEGERVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the MoneyValue field.
     * Value if the parameter type is Money.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getMoneyValue() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(MONEYVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the MonthlyfrequencyValue field.
     * Value if the parameter type is Monthly frequency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getMonthlyfrequencyValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(MONTHLYFREQUENCYVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the NonnegativeintegerValue field.
     * Value if the parameter type is a Non-negative integer.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNonnegativeintegerValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NONNEGATIVEINTEGERVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the NonnegativemoneyValue field.
     * Value if the parameter type is Non-negative money.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getNonnegativemoneyValue() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(NONNEGATIVEMONEYVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the ParameterName field.
     * Name of the parameter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getParameterName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PARAMETERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ParameterType field.
     * Identifies the value type (string, integer, boolean, date, etc).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ScriptParameterType getParameterType() {
      return (typekey.ScriptParameterType)__getInternalInterface().getFieldValue(PARAMETERTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the PercentageValue field.
     * Value if the parameter type is Percentage.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getPercentageValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(PERCENTAGEVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the PercentagedecValue field.
     * Value if the parameter type is Percentagedec.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPercentagedecValue() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PERCENTAGEDECVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the PhoneValue field.
     * Value if the parameter type is Phone.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPhoneValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PHONEVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the PositiveintegerValue field.
     * Value if the parameter type is Positive integer.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getPositiveintegerValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(POSITIVEINTEGERVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the PositivemoneyValue field.
     * Value if the parameter type is Positive money.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getPositivemoneyValue() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(POSITIVEMONEYVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the PostalCodeValue field.
     * Value if the parameter type is PostalCode.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPostalCodeValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POSTALCODEVALUE_PROP.get());
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
     * Gets the value of the RiskValue field.
     * Value if the parameter type is Risk.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getRiskValue() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(RISKVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the SpeedValue field.
     * Value if the parameter type is Speed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSpeedValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SPEEDVALUE_PROP.get());
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
     * Gets the value of the User field.
     * User that created the script parameter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUser() {
      return (entity.User)__getInternalInterface().getFieldValue(USER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(USER_PROP.get());
    }
    
    /**
     * Gets the value of the VarcharValue field.
     * Value if the parameter type is Varchar (i.e. String).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getVarcharValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VARCHARVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the WeeklyfrequencyValue field.
     * Value if the parameter type is Weekly frequency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getWeeklyfrequencyValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(WEEKLYFREQUENCYVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the YearValue field.
     * Value if the parameter type is Year.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getYearValue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(YEARVALUE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the BitValue field.
     * Value if the parameter type is Bit.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isBitValue() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(BITVALUE_PROP.get());
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
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BitValue field.
     */
    public void setBitValue(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(BITVALUE_PROP.get(), value);
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
     * Sets the value of the DatetimeValue field.
     */
    public void setDatetimeValue(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATETIMEVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DecimalValue field.
     */
    public void setDecimalValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DECIMALVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Group field.
     */
    public void setGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
    }
    
    public void setGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(GROUP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IntegerValue field.
     */
    public void setIntegerValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(INTEGERVALUE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the MoneyValue field.
     */
    public void setMoneyValue(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(MONEYVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MonthlyfrequencyValue field.
     */
    public void setMonthlyfrequencyValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(MONTHLYFREQUENCYVALUE_PROP.get(), value);
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
     * Sets the value of the NonnegativeintegerValue field.
     */
    public void setNonnegativeintegerValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NONNEGATIVEINTEGERVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NonnegativemoneyValue field.
     */
    public void setNonnegativemoneyValue(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(NONNEGATIVEMONEYVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ParameterName field.
     */
    public void setParameterName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PARAMETERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ParameterType field.
     */
    public void setParameterType(typekey.ScriptParameterType value) {
      __getInternalInterface().setFieldValue(PARAMETERTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PercentageValue field.
     */
    public void setPercentageValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(PERCENTAGEVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PercentagedecValue field.
     */
    public void setPercentagedecValue(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(PERCENTAGEDECVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PhoneValue field.
     */
    public void setPhoneValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PHONEVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PositiveintegerValue field.
     */
    public void setPositiveintegerValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(POSITIVEINTEGERVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PositivemoneyValue field.
     */
    public void setPositivemoneyValue(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(POSITIVEMONEYVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PostalCodeValue field.
     */
    public void setPostalCodeValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POSTALCODEVALUE_PROP.get(), value);
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
     * Sets the value of the RiskValue field.
     */
    public void setRiskValue(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(RISKVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SpeedValue field.
     */
    public void setSpeedValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SPEEDVALUE_PROP.get(), value);
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
     * Sets the value of the User field.
     */
    public void setUser(entity.User value) {
      __getInternalInterface().setFieldValue(USER_PROP.get(), value);
    }
    
    public void setUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(USER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the VarcharValue field.
     */
    public void setVarcharValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VARCHARVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WeeklyfrequencyValue field.
     */
    public void setWeeklyfrequencyValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(WEEKLYFREQUENCYVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the YearValue field.
     */
    public void setYearValue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(YEARVALUE_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.scriptparameter.ScriptParameterPublicMethods", "com.guidewire.pl.domain.scriptparameter.impl.ScriptParameterImpl");
    config.put("com.guidewire.pl.domain.scriptparameter.impl.ScriptParameterInternalMethods", "com.guidewire.pl.domain.scriptparameter.impl.ScriptParameterImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.pl.domain.scriptparameter.impl.ScriptParameterImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.pl.domain.scriptparameter.impl.ScriptParameterImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ScriptParameter.class, config);
    com.guidewire._generated.entity.ScriptParameterInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ScriptParameter, com.guidewire._generated.entity.ScriptParameterInternal>() {
      public java.lang.Object getImplementation(entity.ScriptParameter bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ScriptParameterInternal getInternalInterface(entity.ScriptParameter bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ScriptParameter newEmptyInstance() {
        return new entity.ScriptParameter((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}