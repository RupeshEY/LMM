package entity;

/**
 * FreeTextClaimSearchEntity
 * 
 *         Supports the efficient creation of claim lists returned through ClaimCenter's free text search function. This is a virtual
 *         entity and is not stored in the database.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FreeTextClaimSearchEntity.eti;FreeTextClaimSearchEntity.eix;FreeTextClaimSearchEntity.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "FreeTextClaimSearchEntity")
public class FreeTextClaimSearchEntity extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.FreeTextClaimSearchEntity> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.FreeTextClaimSearchEntity>("entity.FreeTextClaimSearchEntity");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Address");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BUSINESSNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BusinessName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CELLPHONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CellPhone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "City");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMPUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimPublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CloseDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONTACTPUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ContactPublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Date");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIRSTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FirstName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FULLNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FullName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HOMEPHONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HomePhone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LastName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LICENSENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LicenseNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PHONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Phone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POSTALCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PostalCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PRIMARYPHONEVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PrimaryPhoneValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RANK_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Rank");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPORTEDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReportedDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ROLES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Roles");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCORE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Score");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> URN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Urn");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKPHONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "WorkPhone");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.FreeTextClaimSearchEntityInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public FreeTextClaimSearchEntity()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public FreeTextClaimSearchEntity(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected FreeTextClaimSearchEntity(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.FreeTextClaimSearchEntityInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.FreeTextClaimSearchEntityInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the Address field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddress() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the BusinessName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBusinessName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUSINESSNAME_PROP.get());
  }
  
  /**
   * Gets the value of the CellPhone field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCellPhone() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CELLPHONE_PROP.get());
  }
  
  /**
   * Gets the value of the City field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCity() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CITY_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimPublicID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimPublicID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMPUBLICID_PROP.get());
  }
  
  /**
   * Gets the value of the CloseDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCloseDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CLOSEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ContactPublicID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactPublicID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONTACTPUBLICID_PROP.get());
  }
  
  /**
   * Gets the value of the CreateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the Date field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATE_PROP.get());
  }
  
  /**
   * Gets the value of the FirstName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FIRSTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the FullName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFullName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FULLNAME_PROP.get());
  }
  
  /**
   * Gets the value of the HomePhone field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getHomePhone() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(HOMEPHONE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LastName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LASTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the LicenseNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLicenseNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LICENSENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the LossDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LOSSDATE_PROP.get());
  }
  
  /**
   * Gets the value of the Phone field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPhone() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PHONE_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the PostalCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPostalCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POSTALCODE_PROP.get());
  }
  
  /**
   * Gets the value of the PrimaryPhoneValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPrimaryPhoneValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PRIMARYPHONEVALUE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Rank field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRank() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(RANK_PROP.get());
  }
  
  /**
   * Gets the value of the ReportedDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReportedDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(REPORTEDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the Roles field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRoles() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ROLES_PROP.get());
  }
  
  /**
   * Gets the value of the Score field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getScore() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(SCORE_PROP.get());
  }
  
  /**
   * Gets the value of the State field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState() {
    return (typekey.State)__getInternalInterface().getFieldValue(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStatus() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STATUS_PROP.get());
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FreeTextClaimSearchEntity getSubtype() {
    return (typekey.FreeTextClaimSearchEntity)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Urn field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUrn() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(URN_PROP.get());
  }
  
  /**
   * Gets the value of the WorkPhone field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWorkPhone() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WORKPHONE_PROP.get());
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
   * Sets the value of the Address field.
   */
  public void setAddress(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDRESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BusinessName field.
   */
  public void setBusinessName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BUSINESSNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CellPhone field.
   */
  public void setCellPhone(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CELLPHONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the City field.
   */
  public void setCity(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimPublicID field.
   */
  public void setClaimPublicID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMPUBLICID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CloseDate field.
   */
  public void setCloseDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(CLOSEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ContactPublicID field.
   */
  public void setContactPublicID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CONTACTPUBLICID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  public void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Date field.
   */
  public void setDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FirstName field.
   */
  public void setFirstName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FIRSTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FullName field.
   */
  public void setFullName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FULLNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HomePhone field.
   */
  public void setHomePhone(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(HOMEPHONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastName field.
   */
  public void setLastName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LASTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LicenseNumber field.
   */
  public void setLicenseNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LICENSENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(LOSSDATE_PROP.get(), value);
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
   * Sets the value of the Phone field.
   */
  public void setPhone(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PHONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PostalCode field.
   */
  public void setPostalCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POSTALCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PrimaryPhoneValue field.
   */
  public void setPrimaryPhoneValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PRIMARYPHONEVALUE_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Rank field.
   */
  public void setRank(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(RANK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReportedDate field.
   */
  public void setReportedDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(REPORTEDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Roles field.
   */
  public void setRoles(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ROLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Score field.
   */
  public void setScore(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(SCORE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value) {
    __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.FreeTextClaimSearchEntity value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Urn field.
   */
  public void setUrn(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(URN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the WorkPhone field.
   */
  public void setWorkPhone(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(WORKPHONE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.FreeTextClaimSearchEntityInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.FreeTextClaimSearchEntity.this.__getDelegateManager();
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
     * Gets the value of the Address field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddress() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the BusinessName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBusinessName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUSINESSNAME_PROP.get());
    }
    
    /**
     * Gets the value of the CellPhone field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCellPhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CELLPHONE_PROP.get());
    }
    
    /**
     * Gets the value of the City field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCity() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CITY_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimPublicID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimPublicID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMPUBLICID_PROP.get());
    }
    
    /**
     * Gets the value of the CloseDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCloseDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CLOSEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ContactPublicID field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getContactPublicID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CONTACTPUBLICID_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the Date field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATE_PROP.get());
    }
    
    /**
     * Gets the value of the FirstName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFirstName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FIRSTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the FullName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFullName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FULLNAME_PROP.get());
    }
    
    /**
     * Gets the value of the HomePhone field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getHomePhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(HOMEPHONE_PROP.get());
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
     * Gets the value of the LastName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLastName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LASTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the LicenseNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLicenseNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LICENSENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the LossDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLossDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LOSSDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Phone field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PHONE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the PostalCode field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPostalCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POSTALCODE_PROP.get());
    }
    
    /**
     * Gets the value of the PrimaryPhoneValue field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPrimaryPhoneValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PRIMARYPHONEVALUE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Rank field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getRank() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(RANK_PROP.get());
    }
    
    /**
     * Gets the value of the ReportedDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReportedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(REPORTEDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Roles field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRoles() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ROLES_PROP.get());
    }
    
    /**
     * Gets the value of the Score field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getScore() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(SCORE_PROP.get());
    }
    
    /**
     * Gets the value of the State field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getState() {
      return (typekey.State)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getStatus() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FreeTextClaimSearchEntity getSubtype() {
      return (typekey.FreeTextClaimSearchEntity)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Urn field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUrn() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(URN_PROP.get());
    }
    
    /**
     * Gets the value of the WorkPhone field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getWorkPhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(WORKPHONE_PROP.get());
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
     * Sets the value of the Address field.
     */
    public void setAddress(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDRESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BusinessName field.
     */
    public void setBusinessName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BUSINESSNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CellPhone field.
     */
    public void setCellPhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CELLPHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the City field.
     */
    public void setCity(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimPublicID field.
     */
    public void setClaimPublicID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMPUBLICID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CloseDate field.
     */
    public void setCloseDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CLOSEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ContactPublicID field.
     */
    public void setContactPublicID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CONTACTPUBLICID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Date field.
     */
    public void setDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FirstName field.
     */
    public void setFirstName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FIRSTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FullName field.
     */
    public void setFullName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FULLNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HomePhone field.
     */
    public void setHomePhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(HOMEPHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastName field.
     */
    public void setLastName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LASTNAME_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LicenseNumber field.
     */
    public void setLicenseNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LICENSENUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossDate field.
     */
    public void setLossDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LOSSDATE_PROP.get(), value);
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
     * Sets the value of the Phone field.
     */
    public void setPhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PostalCode field.
     */
    public void setPostalCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POSTALCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PrimaryPhoneValue field.
     */
    public void setPrimaryPhoneValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PRIMARYPHONEVALUE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Rank field.
     */
    public void setRank(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(RANK_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReportedDate field.
     */
    public void setReportedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(REPORTEDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Roles field.
     */
    public void setRoles(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ROLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Score field.
     */
    public void setScore(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(SCORE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.State value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.FreeTextClaimSearchEntity value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Urn field.
     */
    public void setUrn(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(URN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the WorkPhone field.
     */
    public void setWorkPhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(WORKPHONE_PROP.get(), value);
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
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.claim.entity.FreeTextClaimSearchEntity", "com.guidewire.cc.domain.claim.impl.FreeTextClaimSearchEntityImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.FreeTextClaimSearchEntity.class, config);
    com.guidewire._generated.entity.FreeTextClaimSearchEntityInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.FreeTextClaimSearchEntity, com.guidewire._generated.entity.FreeTextClaimSearchEntityInternal>() {
      public java.lang.Object getImplementation(entity.FreeTextClaimSearchEntity bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.FreeTextClaimSearchEntityInternal getInternalInterface(entity.FreeTextClaimSearchEntity bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.FreeTextClaimSearchEntity newEmptyInstance() {
        return new entity.FreeTextClaimSearchEntity((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}