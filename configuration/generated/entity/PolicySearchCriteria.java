package entity;

/**
 * PolicySearchCriteria
 * 
 * Non-persistent set of criteria to use in searching for a specific policy.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicySearchCriteria.eti;PolicySearchCriteria.eix;PolicySearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "PolicySearchCriteria")
public class PolicySearchCriteria extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PolicySearchCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PolicySearchCriteria>("entity.PolicySearchCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMPANYNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CompanyName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CONTACTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ContactType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIRSTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FirstName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FIRSTNAMEKANJI_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FirstNameKanji");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCLUDEARCHIVED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncludeArchived");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INSUREDADDRESS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "InsuredAddress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LastName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTNAMEKANJI_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LastNameKanji");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOSSDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LossDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAMEKANJI_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NameKanji");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> POLICYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PolicyType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PROPERTYADDRESS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "PropertyAddress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TAXIDSTRING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TaxIdString");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VIN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Vin");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.PolicySearchCriteriaInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public PolicySearchCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public PolicySearchCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected PolicySearchCriteria(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.PolicySearchCriteriaInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.PolicySearchCriteriaInternal __getInternalInterface() {
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
   * 
   * @deprecated Use field on the InsuredAddress property instead
   */
  public java.lang.String getCity() {
    return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).getCity();
  }
  
  /**
   * Gets the value of the CompanyName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCompanyName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMPANYNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ContactType field.
   * Type of contact to search for
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SearchContactType getContactType() {
    return (typekey.SearchContactType)__getInternalInterface().getFieldValue(CONTACTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the FirstName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FIRSTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the FirstNameKanji field.
   * First name in kanji (used only for Japanese names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstNameKanji() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FIRSTNAMEKANJI_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the InsuredAddress field.
   * The address of the insured.  Supercedes the separate fields of City, State, and PostalCode.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getInsuredAddress() {
    return (entity.Address)__getInternalInterface().getFieldValue(INSUREDADDRESS_PROP.get());
  }
  
  /**
   * Gets the value of the LastName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LASTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the LastNameKanji field.
   * Last name in kanji (used only for Japanese names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastNameKanji() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LASTNAMEKANJI_PROP.get());
  }
  
  /**
   * Gets the value of the LossDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LOSSDATE_PROP.get());
  }
  
  /**
   * Gets the value of the LossType field.
   * Type of loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType() {
    return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the NameKanji field.
   * This contact's name in kanji (used only for Japanese names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEKANJI_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType() {
    return (typekey.PolicyType)__getInternalInterface().getFieldValue(POLICYTYPE_PROP.get());
  }
  
  /**
   * 
   * @deprecated Use field on the InsuredAddress property instead
   */
  public java.lang.String getPostalCode() {
    return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).getPostalCode();
  }
  
  /**
   * Gets the value of the PropertyAddress field.
   * The address of the property.  Generalizes and supercedes the existing PropertyCity field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getPropertyAddress() {
    return (entity.Address)__getInternalInterface().getFieldValue(PROPERTYADDRESS_PROP.get());
  }
  
  /**
   * 
   * @deprecated Use field on the PropertyAddress property instead
   */
  public java.lang.String getPropertyCity() {
    return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).getPropertyCity();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * 
   * @deprecated Use field on the InsuredAddress property instead
   */
  public typekey.State getState() {
    return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).getState();
  }
  
  /**
   * Gets the value of the TaxIdString field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTaxIdString() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TAXIDSTRING_PROP.get());
  }
  
  /**
   * Gets the value of the Vin field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVin() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VIN_PROP.get());
  }
  
  /**
   * Initializes the search criteria based on the supplied Claim.  This sets the loss date and loss type from the claim;
   * if the claim  has a policy, this also sets the policy type and, if the ShowCurrentPolicyNumberInSelectPolicyDialog
   * system parameter is true, sets the policy number.
   * @param claim the Claim to use in initializing the search criteria
   */
  public void initialize(entity.Claim claim) {
    ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).initialize(claim);
  }
  
  /**
   * Gets the value of the IncludeArchived field.
   * Include archived olicies in results
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeArchived() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDEARCHIVED_PROP.get());
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
   * Returns a QueryProcessor containing a set of PolicySummaries that match the search criteria.
   * @return a QueryProcessor containing a set of PolicySummaries that match the search criteria
   */
  public gw.api.database.IQueryBeanResult<entity.PolicySummary> performSearch() {
    return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).performSearch();
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
   * 
   * @param value 
   * @deprecated Use field on the InsuredAddress property instead
   */
  public void setCity(java.lang.String value) {
    ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).setCity(value);
  }
  
  /**
   * Sets the value of the CompanyName field.
   */
  public void setCompanyName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COMPANYNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ContactType field.
   */
  public void setContactType(typekey.SearchContactType value) {
    __getInternalInterface().setFieldValue(CONTACTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FirstName field.
   */
  public void setFirstName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FIRSTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FirstNameKanji field.
   */
  public void setFirstNameKanji(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FIRSTNAMEKANJI_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IncludeArchived field.
   */
  public void setIncludeArchived(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INCLUDEARCHIVED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredAddress field.
   */
  public void setInsuredAddress(entity.Address value) {
    __getInternalInterface().setFieldValue(INSUREDADDRESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastName field.
   */
  public void setLastName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LASTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastNameKanji field.
   */
  public void setLastNameKanji(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LASTNAMEKANJI_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(LOSSDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value) {
    __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAMEKANJI_PROP.get(), value);
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
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value) {
    __getInternalInterface().setFieldValue(POLICYTYPE_PROP.get(), value);
  }
  
  /**
   * 
   * @param value 
   * @deprecated Use field on the InsuredAddress property instead
   */
  public void setPostalCode(java.lang.String value) {
    ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).setPostalCode(value);
  }
  
  /**
   * Sets the value of the PropertyAddress field.
   */
  public void setPropertyAddress(entity.Address value) {
    __getInternalInterface().setFieldValue(PROPERTYADDRESS_PROP.get(), value);
  }
  
  /**
   * 
   * @param value 
   * @deprecated Use field on the PropertyAddress property instead
   */
  public void setPropertyCity(java.lang.String value) {
    ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).setPropertyCity(value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * 
   * @param value 
   * @deprecated Use field on the InsuredAddress property instead
   */
  public void setState(typekey.State value) {
    ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).setState(value);
  }
  
  /**
   * Sets the value of the TaxIdString field.
   */
  public void setTaxIdString(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TAXIDSTRING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Vin field.
   */
  public void setVin(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VIN_PROP.get(), value);
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
  
  /**
   * Validate the criteria are sufficient to do a search by checking
   * that at least one field is set.
   * @return true if valid, false if not
   */
  public boolean validateAtLeastOneFieldSet() {
    return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).validateAtLeastOneFieldSet();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.PolicySearchCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.PolicySearchCriteria.this.__getDelegateManager();
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * 
     * @deprecated Use field on the InsuredAddress property instead
     */
    public java.lang.String getCity() {
      return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).getCity();
    }
    
    /**
     * Gets the value of the CompanyName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCompanyName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMPANYNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ContactType field.
     * Type of contact to search for
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.SearchContactType getContactType() {
      return (typekey.SearchContactType)__getInternalInterface().getFieldValue(CONTACTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the FirstName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFirstName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FIRSTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the FirstNameKanji field.
     * First name in kanji (used only for Japanese names and will be null otherwise)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFirstNameKanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FIRSTNAMEKANJI_PROP.get());
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
     * Gets the value of the InsuredAddress field.
     * The address of the insured.  Supercedes the separate fields of City, State, and PostalCode.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getInsuredAddress() {
      return (entity.Address)__getInternalInterface().getFieldValue(INSUREDADDRESS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInsuredAddressID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INSUREDADDRESS_PROP.get());
    }
    
    /**
     * Gets the value of the LastName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLastName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LASTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the LastNameKanji field.
     * Last name in kanji (used only for Japanese names and will be null otherwise)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLastNameKanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LASTNAMEKANJI_PROP.get());
    }
    
    /**
     * Gets the value of the LossDate field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLossDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LOSSDATE_PROP.get());
    }
    
    /**
     * Gets the value of the LossType field.
     * Type of loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossType getLossType() {
      return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the NameKanji field.
     * This contact's name in kanji (used only for Japanese names and will be null otherwise)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNameKanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEKANJI_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyType field.
     * Type of policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicyType getPolicyType() {
      return (typekey.PolicyType)__getInternalInterface().getFieldValue(POLICYTYPE_PROP.get());
    }
    
    /**
     * 
     * @deprecated Use field on the InsuredAddress property instead
     */
    public java.lang.String getPostalCode() {
      return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).getPostalCode();
    }
    
    /**
     * Gets the value of the PropertyAddress field.
     * The address of the property.  Generalizes and supercedes the existing PropertyCity field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getPropertyAddress() {
      return (entity.Address)__getInternalInterface().getFieldValue(PROPERTYADDRESS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPropertyAddressID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PROPERTYADDRESS_PROP.get());
    }
    
    /**
     * 
     * @deprecated Use field on the PropertyAddress property instead
     */
    public java.lang.String getPropertyCity() {
      return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).getPropertyCity();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * 
     * @deprecated Use field on the InsuredAddress property instead
     */
    public typekey.State getState() {
      return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).getState();
    }
    
    /**
     * Gets the value of the TaxIdString field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTaxIdString() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TAXIDSTRING_PROP.get());
    }
    
    /**
     * Gets the value of the Vin field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getVin() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VIN_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Initializes the search criteria based on the supplied Claim.  This sets the loss date and loss type from the claim;
     * if the claim  has a policy, this also sets the policy type and, if the ShowCurrentPolicyNumberInSelectPolicyDialog
     * system parameter is true, sets the policy number.
     * @param claim the Claim to use in initializing the search criteria
     */
    public void initialize(entity.Claim claim) {
      ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).initialize(claim);
    }
    
    /**
     * Gets the value of the IncludeArchived field.
     * Include archived olicies in results
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncludeArchived() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCLUDEARCHIVED_PROP.get());
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
    
    public com.guidewire.pl.system.database.Query<entity.Policy> makeQuery() {
      return ((com.guidewire.cc.domain.policy.impl.PolicySearchCriteriaInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicySearchCriteriaInternal")).makeQuery();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    /**
     * Returns a QueryProcessor containing a set of PolicySummaries that match the search criteria.
     * @return a QueryProcessor containing a set of PolicySummaries that match the search criteria
     */
    public gw.api.database.IQueryBeanResult<entity.PolicySummary> performSearch() {
      return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).performSearch();
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
     * 
     * @param value 
     * @deprecated Use field on the InsuredAddress property instead
     */
    public void setCity(java.lang.String value) {
      ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).setCity(value);
    }
    
    /**
     * Sets the value of the CompanyName field.
     */
    public void setCompanyName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COMPANYNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ContactType field.
     */
    public void setContactType(typekey.SearchContactType value) {
      __getInternalInterface().setFieldValue(CONTACTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FirstName field.
     */
    public void setFirstName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FIRSTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FirstNameKanji field.
     */
    public void setFirstNameKanji(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FIRSTNAMEKANJI_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncludeArchived field.
     */
    public void setIncludeArchived(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCLUDEARCHIVED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredAddress field.
     */
    public void setInsuredAddress(entity.Address value) {
      __getInternalInterface().setFieldValue(INSUREDADDRESS_PROP.get(), value);
    }
    
    public void setInsuredAddressID(gw.pl.persistence.core.Key value) {
      setFieldValue(INSUREDADDRESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastName field.
     */
    public void setLastName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LASTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastNameKanji field.
     */
    public void setLastNameKanji(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LASTNAMEKANJI_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LossDate field.
     */
    public void setLossDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LOSSDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossType field.
     */
    public void setLossType(typekey.LossType value) {
      __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NameKanji field.
     */
    public void setNameKanji(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAMEKANJI_PROP.get(), value);
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
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyType field.
     */
    public void setPolicyType(typekey.PolicyType value) {
      __getInternalInterface().setFieldValue(POLICYTYPE_PROP.get(), value);
    }
    
    /**
     * 
     * @param value 
     * @deprecated Use field on the InsuredAddress property instead
     */
    public void setPostalCode(java.lang.String value) {
      ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).setPostalCode(value);
    }
    
    /**
     * Sets the value of the PropertyAddress field.
     */
    public void setPropertyAddress(entity.Address value) {
      __getInternalInterface().setFieldValue(PROPERTYADDRESS_PROP.get(), value);
    }
    
    public void setPropertyAddressID(gw.pl.persistence.core.Key value) {
      setFieldValue(PROPERTYADDRESS_PROP.get(), value);
    }
    
    /**
     * 
     * @param value 
     * @deprecated Use field on the PropertyAddress property instead
     */
    public void setPropertyCity(java.lang.String value) {
      ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).setPropertyCity(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * 
     * @param value 
     * @deprecated Use field on the InsuredAddress property instead
     */
    public void setState(typekey.State value) {
      ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).setState(value);
    }
    
    /**
     * Sets the value of the TaxIdString field.
     */
    public void setTaxIdString(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TAXIDSTRING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Vin field.
     */
    public void setVin(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VIN_PROP.get(), value);
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
    
    public boolean validate() {
      return ((com.guidewire.cc.domain.policy.impl.PolicySearchCriteriaInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.policy.impl.PolicySearchCriteriaInternal")).validate();
    }
    
    /**
     * Validate the criteria are sufficient to do a search by checking
     * that at least one field is set.
     * @return true if valid, false if not
     */
    public boolean validateAtLeastOneFieldSet() {
      return ((gw.cc.policy.entity.PolicySearchCriteria)__getDelegateManager().getImplementation("gw.cc.policy.entity.PolicySearchCriteria")).validateAtLeastOneFieldSet();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.policy.impl.PolicySearchCriteriaInternal", "com.guidewire.cc.domain.policy.impl.PolicySearchCriteriaImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.policy.entity.PolicySearchCriteria", "com.guidewire.cc.domain.policy.impl.PolicySearchCriteriaImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.cc.domain.policy.impl.PolicySearchCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.PolicySearchCriteria.class, config);
    com.guidewire._generated.entity.PolicySearchCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.PolicySearchCriteria, com.guidewire._generated.entity.PolicySearchCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.PolicySearchCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PolicySearchCriteriaInternal getInternalInterface(entity.PolicySearchCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.PolicySearchCriteria newEmptyInstance() {
        return new entity.PolicySearchCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}