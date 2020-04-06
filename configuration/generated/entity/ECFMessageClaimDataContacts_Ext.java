package entity;

/**
 * ECFMessageClaimDataContacts_Ext
 * Entity to hold the Contact details from a ECF message containing Claim Data. These will be mapped to Claim Contact entities
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimDataContacts_Ext.eti;ECFMessageClaimDataContacts_Ext.eix;ECFMessageClaimDataContacts_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ECFMessageClaimDataContacts_Ext")
public class ECFMessageClaimDataContacts_Ext extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ECFMessageClaimDataContacts_Ext> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ECFMessageClaimDataContacts_Ext>("entity.ECFMessageClaimDataContacts_Ext");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADJUSTERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AdjusterName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADJUSTERREFERENCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AdjusterReference");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKERCONTACTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerContactName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKERCONTACTTELEPHONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerContactTelephone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKERPARTYID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerPartyId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BROKERPARTYNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BrokerPartyName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BUREAULEADINSURERCONTACTEMAIL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BureauLeadInsurerContactEmail");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BUREAULEADINSURERCONTACTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BureauLeadInsurerContactName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BUREAULEADINSURERCONTACTPHONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BureauLeadInsurerContactPhone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BUREAULEADINSURERORREINSURER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BureauLeadInsurerOrReinsurer");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERAGENCY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerAgency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSURERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsurerName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LAWYERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LawyerName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LAWYERREFERENCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LawyerReference");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REINSURERAGENCY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReinsurerAgency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REINSURERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReinsurerId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REINSURERNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReinsurerName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ECFMessageClaimDataContacts_ExtInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ECFMessageClaimDataContacts_Ext()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ECFMessageClaimDataContacts_Ext(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ECFMessageClaimDataContacts_Ext(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ECFMessageClaimDataContacts_ExtInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ECFMessageClaimDataContacts_ExtInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AdjusterName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAdjusterName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADJUSTERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the AdjusterReference field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAdjusterReference() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADJUSTERREFERENCE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the BrokerContactName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerContactName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERCONTACTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerContactTelephone field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerContactTelephone() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERCONTACTTELEPHONE_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerPartyId field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerPartyId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERPARTYID_PROP.get());
  }
  
  /**
   * Gets the value of the BrokerPartyName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrokerPartyName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERPARTYNAME_PROP.get());
  }
  
  /**
   * Gets the value of the BureauLeadInsurerContactEmail field.
   * Email for Bureau Leading Insurer Or Reinsurer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBureauLeadInsurerContactEmail() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUREAULEADINSURERCONTACTEMAIL_PROP.get());
  }
  
  /**
   * Gets the value of the BureauLeadInsurerContactName field.
   * Contact Name for Bureau Leading Insurer Or Reinsurer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBureauLeadInsurerContactName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUREAULEADINSURERCONTACTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the BureauLeadInsurerContactPhone field.
   * Contact Phone for Bureau Leading Insurer Or Reinsurer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBureauLeadInsurerContactPhone() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUREAULEADINSURERCONTACTPHONE_PROP.get());
  }
  
  /**
   * Gets the value of the BureauLeadInsurerOrReinsurer field.
   * Bureau Leading Insurer Or Reinsurer Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBureauLeadInsurerOrReinsurer() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUREAULEADINSURERORREINSURER_PROP.get());
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
  
  /**
   * Gets the value of the InsurerAgency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerAgency() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERAGENCY_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerId field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERID_PROP.get());
  }
  
  /**
   * Gets the value of the InsurerName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsurerName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the LawyerName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLawyerName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LAWYERNAME_PROP.get());
  }
  
  /**
   * Gets the value of the LawyerReference field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLawyerReference() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LAWYERREFERENCE_PROP.get());
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReinsurerAgency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReinsurerAgency() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REINSURERAGENCY_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsurerId field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReinsurerId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REINSURERID_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsurerName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReinsurerName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REINSURERNAME_PROP.get());
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
   * Sets the value of the AdjusterName field.
   */
  public void setAdjusterName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADJUSTERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AdjusterReference field.
   */
  public void setAdjusterReference(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADJUSTERREFERENCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerContactName field.
   */
  public void setBrokerContactName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKERCONTACTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerContactTelephone field.
   */
  public void setBrokerContactTelephone(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKERCONTACTTELEPHONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerPartyId field.
   */
  public void setBrokerPartyId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKERPARTYID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BrokerPartyName field.
   */
  public void setBrokerPartyName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BROKERPARTYNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BureauLeadInsurerContactEmail field.
   */
  public void setBureauLeadInsurerContactEmail(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BUREAULEADINSURERCONTACTEMAIL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BureauLeadInsurerContactName field.
   */
  public void setBureauLeadInsurerContactName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BUREAULEADINSURERCONTACTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BureauLeadInsurerContactPhone field.
   */
  public void setBureauLeadInsurerContactPhone(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BUREAULEADINSURERCONTACTPHONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BureauLeadInsurerOrReinsurer field.
   */
  public void setBureauLeadInsurerOrReinsurer(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BUREAULEADINSURERORREINSURER_PROP.get(), value);
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
   * Sets the value of the InsurerAgency field.
   */
  public void setInsurerAgency(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERAGENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerId field.
   */
  public void setInsurerId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsurerName field.
   */
  public void setInsurerName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSURERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LawyerName field.
   */
  public void setLawyerName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LAWYERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LawyerReference field.
   */
  public void setLawyerReference(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LAWYERREFERENCE_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReinsurerAgency field.
   */
  public void setReinsurerAgency(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(REINSURERAGENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsurerId field.
   */
  public void setReinsurerId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(REINSURERID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsurerName field.
   */
  public void setReinsurerName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(REINSURERNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ECFMessageClaimDataContacts_ExtInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ECFMessageClaimDataContacts_Ext.this.__getDelegateManager();
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
     * Gets the value of the AdjusterName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAdjusterName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADJUSTERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the AdjusterReference field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAdjusterReference() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADJUSTERREFERENCE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the BrokerContactName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerContactName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERCONTACTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the BrokerContactTelephone field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerContactTelephone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERCONTACTTELEPHONE_PROP.get());
    }
    
    /**
     * Gets the value of the BrokerPartyId field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerPartyId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERPARTYID_PROP.get());
    }
    
    /**
     * Gets the value of the BrokerPartyName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBrokerPartyName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BROKERPARTYNAME_PROP.get());
    }
    
    /**
     * Gets the value of the BureauLeadInsurerContactEmail field.
     * Email for Bureau Leading Insurer Or Reinsurer
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBureauLeadInsurerContactEmail() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUREAULEADINSURERCONTACTEMAIL_PROP.get());
    }
    
    /**
     * Gets the value of the BureauLeadInsurerContactName field.
     * Contact Name for Bureau Leading Insurer Or Reinsurer
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBureauLeadInsurerContactName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUREAULEADINSURERCONTACTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the BureauLeadInsurerContactPhone field.
     * Contact Phone for Bureau Leading Insurer Or Reinsurer
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBureauLeadInsurerContactPhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUREAULEADINSURERCONTACTPHONE_PROP.get());
    }
    
    /**
     * Gets the value of the BureauLeadInsurerOrReinsurer field.
     * Bureau Leading Insurer Or Reinsurer Name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBureauLeadInsurerOrReinsurer() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUREAULEADINSURERORREINSURER_PROP.get());
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
    
    /**
     * Gets the value of the InsurerAgency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerAgency() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERAGENCY_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerId field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERID_PROP.get());
    }
    
    /**
     * Gets the value of the InsurerName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsurerName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSURERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the LawyerName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLawyerName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LAWYERNAME_PROP.get());
    }
    
    /**
     * Gets the value of the LawyerReference field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLawyerReference() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LAWYERREFERENCE_PROP.get());
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReinsurerAgency field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReinsurerAgency() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REINSURERAGENCY_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsurerId field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReinsurerId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REINSURERID_PROP.get());
    }
    
    /**
     * Gets the value of the ReinsurerName field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getReinsurerName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(REINSURERNAME_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
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
     * Sets the value of the AdjusterName field.
     */
    public void setAdjusterName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADJUSTERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AdjusterReference field.
     */
    public void setAdjusterReference(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADJUSTERREFERENCE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerContactName field.
     */
    public void setBrokerContactName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKERCONTACTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerContactTelephone field.
     */
    public void setBrokerContactTelephone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKERCONTACTTELEPHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerPartyId field.
     */
    public void setBrokerPartyId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKERPARTYID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BrokerPartyName field.
     */
    public void setBrokerPartyName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BROKERPARTYNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BureauLeadInsurerContactEmail field.
     */
    public void setBureauLeadInsurerContactEmail(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BUREAULEADINSURERCONTACTEMAIL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BureauLeadInsurerContactName field.
     */
    public void setBureauLeadInsurerContactName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BUREAULEADINSURERCONTACTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BureauLeadInsurerContactPhone field.
     */
    public void setBureauLeadInsurerContactPhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BUREAULEADINSURERCONTACTPHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BureauLeadInsurerOrReinsurer field.
     */
    public void setBureauLeadInsurerOrReinsurer(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BUREAULEADINSURERORREINSURER_PROP.get(), value);
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
    
    /**
     * Sets the value of the InsurerAgency field.
     */
    public void setInsurerAgency(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERAGENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerId field.
     */
    public void setInsurerId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsurerName field.
     */
    public void setInsurerName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSURERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LawyerName field.
     */
    public void setLawyerName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LAWYERNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LawyerReference field.
     */
    public void setLawyerReference(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LAWYERREFERENCE_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReinsurerAgency field.
     */
    public void setReinsurerAgency(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(REINSURERAGENCY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsurerId field.
     */
    public void setReinsurerId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(REINSURERID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReinsurerName field.
     */
    public void setReinsurerName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(REINSURERNAME_PROP.get(), value);
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
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ECFMessageClaimDataContacts_Ext.class, config);
    com.guidewire._generated.entity.ECFMessageClaimDataContacts_ExtInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ECFMessageClaimDataContacts_Ext, com.guidewire._generated.entity.ECFMessageClaimDataContacts_ExtInternal>() {
      public java.lang.Object getImplementation(entity.ECFMessageClaimDataContacts_Ext bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ECFMessageClaimDataContacts_ExtInternal getInternalInterface(entity.ECFMessageClaimDataContacts_Ext bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ECFMessageClaimDataContacts_Ext newEmptyInstance() {
        return new entity.ECFMessageClaimDataContacts_Ext((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}