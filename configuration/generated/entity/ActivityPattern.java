package entity;

/**
 * ActivityPattern
 * <p>A template for an activity. An activity pattern is not assigned to a user, nor does it belong to a claim; it is used only to create new activity instances.
 *       To create a new activity, an activity pattern is first chosen, and the values in the activity pattern are used to seed the values of the new activity instance.</p>
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityPattern.eti;ActivityPattern.eix;ActivityPattern.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ActivityPattern")
public class ActivityPattern extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.DecentralizedEntity {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ActivityPattern> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ActivityPattern>("entity.ActivityPattern");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ACTIVITYCLASS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ActivityClass");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AUTOMATEDONLY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AutomatedOnly");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Category");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMLOSSTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimLossType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDCLAIMAVLBLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClosedClaimAvlble");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Code");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMAND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Command");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DESCRIPTION_L10N_ARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Description_L10N_ARRAY");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DOCUMENTTEMPLATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DocumentTemplate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EMAILTEMPLATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EmailTemplate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ESCBUSCALLOCPATH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EscBusCalLocPath");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ESCALATIONBUSCALTAG_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "EscalationBusCalTag");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ESCALATIONDAYS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EscalationDays");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ESCALATIONHOURS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EscalationHours");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ESCALATIONINCLDAYS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "EscalationInclDays");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ESCALATIONSTARTPT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "EscalationStartPt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXTERNALLYOWNED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExternallyOwned");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> IMPORTANCE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Importance");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MANDATORY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Mandatory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PRIORITY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Priority");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECURRING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Recurring");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SHORTSUBJECT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ShortSubject");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SHORTSUBJECT_L10N_ARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ShortSubject_L10N_ARRAY");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBJECT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Subject");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SUBJECT_L10N_ARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Subject_L10N_ARRAY");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETBUSCALLOCPATH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetBusCalLocPath");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TARGETBUSCALTAG_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TargetBusCalTag");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETDAYS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetDays");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TARGETHOURS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TargetHours");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TARGETINCLUDEDAYS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TargetIncludeDays");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TARGETSTARTPOINT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TargetStartPoint");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Type");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ActivityPatternInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final com.guidewire.commons.metadata.types.LinkDynPropertyInfo ORGANIZATION_DYNPROP = com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods.ORGANIZATION_DYNPROP;
  
  public static final com.guidewire.commons.metadata.types.LinkPropertyInfoCache ORGANIZATION_PROP = com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods.ORGANIZATION_PROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.api.activity.PublicActivityPatternFinder finder = com.guidewire.cc.domain.activity.impl.ActivityPatternCoreExtMethods.finder;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ActivityPattern()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ActivityPattern(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ActivityPattern(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ActivityPatternInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ActivityPatternInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ActivityClass field.
   * The class of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityClass getActivityClass() {
    return (typekey.ActivityClass)__getInternalInterface().getFieldValue(ACTIVITYCLASS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Category field.
   * Category used to organize the activity pattern.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityCategory getCategory() {
    return (typekey.ActivityCategory)__getInternalInterface().getFieldValue(CATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimLossType field.
   * Used to optionally filter activity patterns by claim loss type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getClaimLossType() {
    return (typekey.LossType)__getInternalInterface().getFieldValue(CLAIMLOSSTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Code field.
   * The concise name of the activity pattern, used to identify the pattern within rules.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CODE_PROP.get());
  }
  
  /**
   * Gets the value of the Command field.
   * A Gosu command to execute for this activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCommand() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMAND_PROP.get());
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
   * Gets the value of the Description field.
   * Description of the activity pattern.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern_Description_L10N[] getDescription_L10N_ARRAY() {
    return (entity.ActivityPattern_Description_L10N[])__getInternalInterface().getFieldValue(DESCRIPTION_L10N_ARRAY_PROP.get());
  }
  
  /**
   * Array association accessor for key en_US on array Description_L10N_ARRAY
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription_en_US() {
    return (java.lang.String)__getInternalInterface().getLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Description_en_US"));
  }
  
  /**
   * Gets the value of the DocumentTemplate field.
   * The id of an associated document template. The id gets passed to IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentTemplate() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTTEMPLATE_PROP.get());
  }
  
  /**
   * Gets the value of the EmailTemplate field.
   * The id of an associated email template. The id gets passed to IEmailTemplateSource to retrieve the EmailTemplateDescriptor.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailTemplate() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILTEMPLATE_PROP.get());
  }
  
  /**
   * Gets the value of the EscBusCalLocPath field.
   * Location bean path to use for business calendar in calculating EscalationDate, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEscBusCalLocPath() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ESCBUSCALLOCPATH_PROP.get());
  }
  
  /**
   * Gets the value of the EscalationBusCalTag field.
   * Holiday tag code to use for business calendar in calculating EscalationDate, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.HolidayTagCode getEscalationBusCalTag() {
    return (typekey.HolidayTagCode)__getInternalInterface().getFieldValue(ESCALATIONBUSCALTAG_PROP.get());
  }
  
  /**
   * Gets the escalation business calendar type (e.g. holiday tag or location bean path),
   * if applicable.
   * @return a business calendar type
   */
  public gw.api.activity.BusCalType getEscalationBusCalType() {
    return ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).getEscalationBusCalType();
  }
  
  /**
   * Gets the value of the EscalationDays field.
   * Used in conjunction with EscalationStartPoint and EscalationIncludedDays to calculate the EscalationDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getEscalationDays() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ESCALATIONDAYS_PROP.get());
  }
  
  /**
   * Gets the value of the EscalationHours field.
   * Used in conjunction with EscalationStartPoint and EscalationIncludedDays to calculate the EscalationDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getEscalationHours() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ESCALATIONHOURS_PROP.get());
  }
  
  /**
   * Gets the value of the EscalationInclDays field.
   * Which days to include in calculating the EscalationDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.IncludeDaysType getEscalationInclDays() {
    return (typekey.IncludeDaysType)__getInternalInterface().getFieldValue(ESCALATIONINCLDAYS_PROP.get());
  }
  
  /**
   * Gets the value of the EscalationStartPt field.
   * Which existing date on the activity or associated claim to use as the starting date for the EscalationDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StartPointType getEscalationStartPt() {
    return (typekey.StartPointType)__getInternalInterface().getFieldValue(ESCALATIONSTARTPT_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the Importance field.
   * The importance level of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ImportanceLevel getImportance() {
    return (typekey.ImportanceLevel)__getInternalInterface().getFieldValue(IMPORTANCE_PROP.get());
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
  public entity.Organization getOrganization() {
    return ((com.guidewire.cc.domain.activity.impl.ActivityPatternCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.activity.impl.ActivityPatternCoreExtMethods")).getOrganization();
  }
  
  public gw.pl.persistence.core.Key getOrganizationID() {
    return ((com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods")).getOrganizationID();
  }
  
  /**
   * Gets the value of the Priority field.
   * Priority of the activity with respect to other activities.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Priority getPriority() {
    return (typekey.Priority)__getInternalInterface().getFieldValue(PRIORITY_PROP.get());
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
   * Gets the value of the ShortSubject field.
   * Short subject field of the activity. For use in small areas e.g., a calendar event entry.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getShortSubject() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SHORTSUBJECT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern_ShortSubject_L10N[] getShortSubject_L10N_ARRAY() {
    return (entity.ActivityPattern_ShortSubject_L10N[])__getInternalInterface().getFieldValue(SHORTSUBJECT_L10N_ARRAY_PROP.get());
  }
  
  /**
   * Array association accessor for key en_US on array ShortSubject_L10N_ARRAY
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getShortSubject_en_US() {
    return (java.lang.String)__getInternalInterface().getLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ShortSubject_en_US"));
  }
  
  /**
   * Gets the value of the Subject field.
   * Subject field of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubject() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SUBJECT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern_Subject_L10N[] getSubject_L10N_ARRAY() {
    return (entity.ActivityPattern_Subject_L10N[])__getInternalInterface().getFieldValue(SUBJECT_L10N_ARRAY_PROP.get());
  }
  
  /**
   * Array association accessor for key en_US on array Subject_L10N_ARRAY
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubject_en_US() {
    return (java.lang.String)__getInternalInterface().getLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Subject_en_US"));
  }
  
  /**
   * Gets the value of the TargetBusCalLocPath field.
   * Location bean path to use for business calendar in calculating TargetDate, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTargetBusCalLocPath() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TARGETBUSCALLOCPATH_PROP.get());
  }
  
  /**
   * Gets the value of the TargetBusCalTag field.
   * Holiday tag code to use for business calendar in calculating TargetDate, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.HolidayTagCode getTargetBusCalTag() {
    return (typekey.HolidayTagCode)__getInternalInterface().getFieldValue(TARGETBUSCALTAG_PROP.get());
  }
  
  /**
   * Gets the target business calendar type (e.g. holiday tag or location bean path),
   * if applicable.
   * @return a business calendar type
   */
  public gw.api.activity.BusCalType getTargetBusCalType() {
    return ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).getTargetBusCalType();
  }
  
  /**
   * Gets the value of the TargetDays field.
   * Used in conjunction with TargetStartPoint and TargetIncludedDays to calculate the ActionDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetDays() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETDAYS_PROP.get());
  }
  
  /**
   * Gets the value of the TargetHours field.
   * Used in conjunction with TargetStartPoint and TargetIncludedDays to calculate the ActionDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetHours() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETHOURS_PROP.get());
  }
  
  /**
   * Gets the value of the TargetIncludeDays field.
   * Which days to include in calculating the TargetDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.IncludeDaysType getTargetIncludeDays() {
    return (typekey.IncludeDaysType)__getInternalInterface().getFieldValue(TARGETINCLUDEDAYS_PROP.get());
  }
  
  /**
   * Gets the value of the TargetStartPoint field.
   * Which existing date on the activity or associated claim to use as the starting date for the TargetDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StartPointType getTargetStartPoint() {
    return (typekey.StartPointType)__getInternalInterface().getFieldValue(TARGETSTARTPOINT_PROP.get());
  }
  
  /**
   * Gets the value of the Type field.
   * Type of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityType getType() {
    return (typekey.ActivityType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
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
   * Gets the value of the AutomatedOnly field.
   * True if the activity pattern is used only by automated additions to the workplan. If true, the pattern won't be shown as an option for users to choose in the application's interface.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAutomatedOnly() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(AUTOMATEDONLY_PROP.get());
  }
  
  /**
   * Gets the value of the ClosedClaimAvlble field.
   * True if the activity pattern is available for closed claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClosedClaimAvlble() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLOSEDCLAIMAVLBLE_PROP.get());
  }
  
  /**
   * Gets the value of the ExternallyOwned field.
   * Whether the activity is externally owned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExternallyOwned() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXTERNALLYOWNED_PROP.get());
  }
  
  /**
   * Gets the value of the Mandatory field.
   * Whether completion of the activity is mandatory.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMandatory() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(MANDATORY_PROP.get());
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
   * Gets the value of the Recurring field.
   * Whether this activity is recurring.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRecurring() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(RECURRING_PROP.get());
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
   * System patterns are a set of activity patterns known to the system and used
   * for special purposes. Users cannot add or delete system patterns, and they
   * can only edit certain fields.
   * @return Boolean.TRUE if this is a system pattern, Boolean.FALSE otherwise.
   *         Never returns null
   */
  public java.lang.Boolean isSystemPattern() {
    return ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).isSystemPattern();
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
   * Sets the value of the ActivityClass field.
   */
  public void setActivityClass(typekey.ActivityClass value) {
    __getInternalInterface().setFieldValue(ACTIVITYCLASS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AutomatedOnly field.
   */
  public void setAutomatedOnly(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(AUTOMATEDONLY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Category field.
   */
  public void setCategory(typekey.ActivityCategory value) {
    __getInternalInterface().setFieldValue(CATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimLossType field.
   */
  public void setClaimLossType(typekey.LossType value) {
    __getInternalInterface().setFieldValue(CLAIMLOSSTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClosedClaimAvlble field.
   */
  public void setClosedClaimAvlble(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CLOSEDCLAIMAVLBLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Code field.
   */
  public void setCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Command field.
   */
  public void setCommand(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COMMAND_PROP.get(), value);
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
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description_L10N_ARRAY field.
   */
  private void setDescription_L10N_ARRAY(entity.ActivityPattern_Description_L10N[] value) {
    __getInternalInterface().setFieldValue(DESCRIPTION_L10N_ARRAY_PROP.get(), value);
  }
  
  /**
   * Array association mutator for key Description_ on array Description_L10N_ARRAY
   */
  public void setDescription_en_US(java.lang.String value) {
    __getInternalInterface().setLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Description_en_US"), value);
  }
  
  /**
   * Sets the value of the DocumentTemplate field.
   */
  public void setDocumentTemplate(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DOCUMENTTEMPLATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmailTemplate field.
   */
  public void setEmailTemplate(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EMAILTEMPLATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EscBusCalLocPath field.
   */
  public void setEscBusCalLocPath(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ESCBUSCALLOCPATH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EscalationBusCalTag field.
   */
  public void setEscalationBusCalTag(typekey.HolidayTagCode value) {
    __getInternalInterface().setFieldValue(ESCALATIONBUSCALTAG_PROP.get(), value);
  }
  
  /**
   * Sets the escalation business calendar type (e.g. holiday tag or location bean path),
   * if applicable.
   * @param bct a business calendar type
   */
  public void setEscalationBusCalType(gw.api.activity.BusCalType bct) {
    ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).setEscalationBusCalType(bct);
  }
  
  /**
   * Sets the value of the EscalationDays field.
   */
  public void setEscalationDays(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ESCALATIONDAYS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EscalationHours field.
   */
  public void setEscalationHours(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ESCALATIONHOURS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EscalationInclDays field.
   */
  public void setEscalationInclDays(typekey.IncludeDaysType value) {
    __getInternalInterface().setFieldValue(ESCALATIONINCLDAYS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EscalationStartPt field.
   */
  public void setEscalationStartPt(typekey.StartPointType value) {
    __getInternalInterface().setFieldValue(ESCALATIONSTARTPT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExternallyOwned field.
   */
  public void setExternallyOwned(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EXTERNALLYOWNED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Importance field.
   */
  public void setImportance(typekey.ImportanceLevel value) {
    __getInternalInterface().setFieldValue(IMPORTANCE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Mandatory field.
   */
  public void setMandatory(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(MANDATORY_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  public void setOrganization(entity.Organization value) {
    ((com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods")).setOrganization(value);
  }
  
  public void setOrganizationID(gw.pl.persistence.core.Key value) {
    ((com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods")).setOrganizationID(value);
  }
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(typekey.Priority value) {
    __getInternalInterface().setFieldValue(PRIORITY_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Recurring field.
   */
  public void setRecurring(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(RECURRING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ShortSubject field.
   */
  public void setShortSubject(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SHORTSUBJECT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ShortSubject_L10N_ARRAY field.
   */
  private void setShortSubject_L10N_ARRAY(entity.ActivityPattern_ShortSubject_L10N[] value) {
    __getInternalInterface().setFieldValue(SHORTSUBJECT_L10N_ARRAY_PROP.get(), value);
  }
  
  /**
   * Array association mutator for key ShortSubject_ on array ShortSubject_L10N_ARRAY
   */
  public void setShortSubject_en_US(java.lang.String value) {
    __getInternalInterface().setLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("ShortSubject_en_US"), value);
  }
  
  /**
   * Sets the value of the Subject field.
   */
  public void setSubject(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SUBJECT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subject_L10N_ARRAY field.
   */
  private void setSubject_L10N_ARRAY(entity.ActivityPattern_Subject_L10N[] value) {
    __getInternalInterface().setFieldValue(SUBJECT_L10N_ARRAY_PROP.get(), value);
  }
  
  /**
   * Array association mutator for key Subject_ on array Subject_L10N_ARRAY
   */
  public void setSubject_en_US(java.lang.String value) {
    __getInternalInterface().setLocalizedFieldValueForCodeGen((com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo)TYPE.get().getTypeInfo().getProperty("Subject_en_US"), value);
  }
  
  /**
   * Sets the value of the TargetBusCalLocPath field.
   */
  public void setTargetBusCalLocPath(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TARGETBUSCALLOCPATH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetBusCalTag field.
   */
  public void setTargetBusCalTag(typekey.HolidayTagCode value) {
    __getInternalInterface().setFieldValue(TARGETBUSCALTAG_PROP.get(), value);
  }
  
  /**
   * Sets the target business calendar type (e.g. holiday tag or location bean path),
   * if applicable.
   * @param bct a business calendar type
   */
  public void setTargetBusCalType(gw.api.activity.BusCalType bct) {
    ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).setTargetBusCalType(bct);
  }
  
  /**
   * Sets the value of the TargetDays field.
   */
  public void setTargetDays(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TARGETDAYS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetHours field.
   */
  public void setTargetHours(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TARGETHOURS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetIncludeDays field.
   */
  public void setTargetIncludeDays(typekey.IncludeDaysType value) {
    __getInternalInterface().setFieldValue(TARGETINCLUDEDAYS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TargetStartPoint field.
   */
  public void setTargetStartPoint(typekey.StartPointType value) {
    __getInternalInterface().setFieldValue(TARGETSTARTPOINT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.ActivityType value) {
    __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ActivityPatternInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ActivityPattern.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the Description_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDescription_L10N_ARRAY(entity.ActivityPattern_Description_L10N element) {
      __getInternalInterface().addArrayElement(DESCRIPTION_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ShortSubject_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToShortSubject_L10N_ARRAY(entity.ActivityPattern_ShortSubject_L10N element) {
      __getInternalInterface().addArrayElement(SHORTSUBJECT_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Subject_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSubject_L10N_ARRAY(entity.ActivityPattern_Subject_L10N element) {
      __getInternalInterface().addArrayElement(SUBJECT_L10N_ARRAY_PROP.get(), element);
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
    
    /**
     * Gets the value of the ActivityClass field.
     * The class of the activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ActivityClass getActivityClass() {
      return (typekey.ActivityClass)__getInternalInterface().getFieldValue(ACTIVITYCLASS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Category field.
     * Category used to organize the activity pattern.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ActivityCategory getCategory() {
      return (typekey.ActivityCategory)__getInternalInterface().getFieldValue(CATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimLossType field.
     * Used to optionally filter activity patterns by claim loss type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossType getClaimLossType() {
      return (typekey.LossType)__getInternalInterface().getFieldValue(CLAIMLOSSTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Code field.
     * The concise name of the activity pattern, used to identify the pattern within rules.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CODE_PROP.get());
    }
    
    /**
     * Gets the value of the Command field.
     * A Gosu command to execute for this activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCommand() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMAND_PROP.get());
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
     * Gets the value of the Description field.
     * Description of the activity pattern.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the Description_L10N_ARRAY field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ActivityPattern_Description_L10N[] getDescription_L10N_ARRAY() {
      return (entity.ActivityPattern_Description_L10N[])__getInternalInterface().getFieldValue(DESCRIPTION_L10N_ARRAY_PROP.get());
    }
    
    /**
     * Array association for partition Description_L10N_ARRAYByLanguage on array Description_L10N_ARRAY
     */
    public entity.ActivityPattern_Description_L10N getDescription_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.ActivityPattern_Description_L10N)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * Gets the value of the DocumentTemplate field.
     * The id of an associated document template. The id gets passed to IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDocumentTemplate() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTTEMPLATE_PROP.get());
    }
    
    /**
     * Gets the value of the EmailTemplate field.
     * The id of an associated email template. The id gets passed to IEmailTemplateSource to retrieve the EmailTemplateDescriptor.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEmailTemplate() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILTEMPLATE_PROP.get());
    }
    
    /**
     * Gets the value of the EscBusCalLocPath field.
     * Location bean path to use for business calendar in calculating EscalationDate, if applicable.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEscBusCalLocPath() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ESCBUSCALLOCPATH_PROP.get());
    }
    
    /**
     * Gets the value of the EscalationBusCalTag field.
     * Holiday tag code to use for business calendar in calculating EscalationDate, if applicable.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.HolidayTagCode getEscalationBusCalTag() {
      return (typekey.HolidayTagCode)__getInternalInterface().getFieldValue(ESCALATIONBUSCALTAG_PROP.get());
    }
    
    /**
     * Gets the escalation business calendar type (e.g. holiday tag or location bean path),
     * if applicable.
     * @return a business calendar type
     */
    public gw.api.activity.BusCalType getEscalationBusCalType() {
      return ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).getEscalationBusCalType();
    }
    
    /**
     * Gets the value of the EscalationDays field.
     * Used in conjunction with EscalationStartPoint and EscalationIncludedDays to calculate the EscalationDate of the activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getEscalationDays() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ESCALATIONDAYS_PROP.get());
    }
    
    /**
     * Gets the value of the EscalationHours field.
     * Used in conjunction with EscalationStartPoint and EscalationIncludedDays to calculate the EscalationDate of the activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getEscalationHours() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ESCALATIONHOURS_PROP.get());
    }
    
    /**
     * Gets the value of the EscalationInclDays field.
     * Which days to include in calculating the EscalationDate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.IncludeDaysType getEscalationInclDays() {
      return (typekey.IncludeDaysType)__getInternalInterface().getFieldValue(ESCALATIONINCLDAYS_PROP.get());
    }
    
    /**
     * Gets the value of the EscalationStartPt field.
     * Which existing date on the activity or associated claim to use as the starting date for the EscalationDate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.StartPointType getEscalationStartPt() {
      return (typekey.StartPointType)__getInternalInterface().getFieldValue(ESCALATIONSTARTPT_PROP.get());
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
     * Gets the value of the Importance field.
     * The importance level of the activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ImportanceLevel getImportance() {
      return (typekey.ImportanceLevel)__getInternalInterface().getFieldValue(IMPORTANCE_PROP.get());
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
    public entity.Organization getOrganization() {
      return ((com.guidewire.cc.domain.activity.impl.ActivityPatternCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.activity.impl.ActivityPatternCoreExtMethods")).getOrganization();
    }
    
    public gw.pl.persistence.core.Key getOrganizationID() {
      return ((com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods")).getOrganizationID();
    }
    
    /**
     * Gets the value of the Priority field.
     * Priority of the activity with respect to other activities.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Priority getPriority() {
      return (typekey.Priority)__getInternalInterface().getFieldValue(PRIORITY_PROP.get());
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
     * Gets the value of the ShortSubject field.
     * Short subject field of the activity. For use in small areas e.g., a calendar event entry.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getShortSubject() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SHORTSUBJECT_PROP.get());
    }
    
    /**
     * Gets the value of the ShortSubject_L10N_ARRAY field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ActivityPattern_ShortSubject_L10N[] getShortSubject_L10N_ARRAY() {
      return (entity.ActivityPattern_ShortSubject_L10N[])__getInternalInterface().getFieldValue(SHORTSUBJECT_L10N_ARRAY_PROP.get());
    }
    
    /**
     * Array association for partition ShortSubject_L10N_ARRAYByLanguage on array ShortSubject_L10N_ARRAY
     */
    public entity.ActivityPattern_ShortSubject_L10N getShortSubject_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.ActivityPattern_ShortSubject_L10N)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * Gets the value of the Subject field.
     * Subject field of the activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSubject() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SUBJECT_PROP.get());
    }
    
    /**
     * Gets the value of the Subject_L10N_ARRAY field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ActivityPattern_Subject_L10N[] getSubject_L10N_ARRAY() {
      return (entity.ActivityPattern_Subject_L10N[])__getInternalInterface().getFieldValue(SUBJECT_L10N_ARRAY_PROP.get());
    }
    
    /**
     * Array association for partition Subject_L10N_ARRAYByLanguage on array Subject_L10N_ARRAY
     */
    public entity.ActivityPattern_Subject_L10N getSubject_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property) {
      return (entity.ActivityPattern_Subject_L10N)__getInternalInterface().getAssociativeArrayValue(property);
    }
    
    /**
     * Gets the value of the TargetBusCalLocPath field.
     * Location bean path to use for business calendar in calculating TargetDate, if applicable.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTargetBusCalLocPath() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TARGETBUSCALLOCPATH_PROP.get());
    }
    
    /**
     * Gets the value of the TargetBusCalTag field.
     * Holiday tag code to use for business calendar in calculating TargetDate, if applicable.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.HolidayTagCode getTargetBusCalTag() {
      return (typekey.HolidayTagCode)__getInternalInterface().getFieldValue(TARGETBUSCALTAG_PROP.get());
    }
    
    /**
     * Gets the target business calendar type (e.g. holiday tag or location bean path),
     * if applicable.
     * @return a business calendar type
     */
    public gw.api.activity.BusCalType getTargetBusCalType() {
      return ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).getTargetBusCalType();
    }
    
    /**
     * Gets the value of the TargetDays field.
     * Used in conjunction with TargetStartPoint and TargetIncludedDays to calculate the ActionDate of the activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTargetDays() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETDAYS_PROP.get());
    }
    
    /**
     * Gets the value of the TargetHours field.
     * Used in conjunction with TargetStartPoint and TargetIncludedDays to calculate the ActionDate of the activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTargetHours() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TARGETHOURS_PROP.get());
    }
    
    /**
     * Gets the value of the TargetIncludeDays field.
     * Which days to include in calculating the TargetDate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.IncludeDaysType getTargetIncludeDays() {
      return (typekey.IncludeDaysType)__getInternalInterface().getFieldValue(TARGETINCLUDEDAYS_PROP.get());
    }
    
    /**
     * Gets the value of the TargetStartPoint field.
     * Which existing date on the activity or associated claim to use as the starting date for the TargetDate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.StartPointType getTargetStartPoint() {
      return (typekey.StartPointType)__getInternalInterface().getFieldValue(TARGETSTARTPOINT_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     * Type of the activity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ActivityType getType() {
      return (typekey.ActivityType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
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
     * Gets the value of the AutomatedOnly field.
     * True if the activity pattern is used only by automated additions to the workplan. If true, the pattern won't be shown as an option for users to choose in the application's interface.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAutomatedOnly() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(AUTOMATEDONLY_PROP.get());
    }
    
    /**
     * Gets the value of the ClosedClaimAvlble field.
     * True if the activity pattern is available for closed claims.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isClosedClaimAvlble() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLOSEDCLAIMAVLBLE_PROP.get());
    }
    
    /**
     * Gets the value of the ExternallyOwned field.
     * Whether the activity is externally owned.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isExternallyOwned() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXTERNALLYOWNED_PROP.get());
    }
    
    /**
     * Gets the value of the Mandatory field.
     * Whether completion of the activity is mandatory.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isMandatory() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(MANDATORY_PROP.get());
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
     * Gets the value of the Recurring field.
     * Whether this activity is recurring.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isRecurring() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(RECURRING_PROP.get());
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
     * System patterns are a set of activity patterns known to the system and used
     * for special purposes. Users cannot add or delete system patterns, and they
     * can only edit certain fields.
     * @return Boolean.TRUE if this is a system pattern, Boolean.FALSE otherwise.
     *         Never returns null
     */
    public java.lang.Boolean isSystemPattern() {
      return ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).isSystemPattern();
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
    
    /**
     * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
     */
    public void removeFromDescription_L10N_ARRAY(entity.ActivityPattern_Description_L10N element) {
      __getInternalInterface().removeArrayElement(DESCRIPTION_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDescription_L10N_ARRAY(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DESCRIPTION_L10N_ARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ShortSubject_L10N_ARRAY array. This is achieved by marking the element for removal.
     */
    public void removeFromShortSubject_L10N_ARRAY(entity.ActivityPattern_ShortSubject_L10N element) {
      __getInternalInterface().removeArrayElement(SHORTSUBJECT_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ShortSubject_L10N_ARRAY array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromShortSubject_L10N_ARRAY(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SHORTSUBJECT_L10N_ARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Subject_L10N_ARRAY array. This is achieved by marking the element for removal.
     */
    public void removeFromSubject_L10N_ARRAY(entity.ActivityPattern_Subject_L10N element) {
      __getInternalInterface().removeArrayElement(SUBJECT_L10N_ARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Subject_L10N_ARRAY array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSubject_L10N_ARRAY(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SUBJECT_L10N_ARRAY_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ActivityClass field.
     */
    public void setActivityClass(typekey.ActivityClass value) {
      __getInternalInterface().setFieldValue(ACTIVITYCLASS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AutomatedOnly field.
     */
    public void setAutomatedOnly(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(AUTOMATEDONLY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Category field.
     */
    public void setCategory(typekey.ActivityCategory value) {
      __getInternalInterface().setFieldValue(CATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimLossType field.
     */
    public void setClaimLossType(typekey.LossType value) {
      __getInternalInterface().setFieldValue(CLAIMLOSSTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClosedClaimAvlble field.
     */
    public void setClosedClaimAvlble(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CLOSEDCLAIMAVLBLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Code field.
     */
    public void setCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Command field.
     */
    public void setCommand(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COMMAND_PROP.get(), value);
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
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description_L10N_ARRAY field.
     */
    public void setDescription_L10N_ARRAY(entity.ActivityPattern_Description_L10N[] value) {
      __getInternalInterface().setFieldValue(DESCRIPTION_L10N_ARRAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DocumentTemplate field.
     */
    public void setDocumentTemplate(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DOCUMENTTEMPLATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmailTemplate field.
     */
    public void setEmailTemplate(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EMAILTEMPLATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EscBusCalLocPath field.
     */
    public void setEscBusCalLocPath(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ESCBUSCALLOCPATH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EscalationBusCalTag field.
     */
    public void setEscalationBusCalTag(typekey.HolidayTagCode value) {
      __getInternalInterface().setFieldValue(ESCALATIONBUSCALTAG_PROP.get(), value);
    }
    
    /**
     * Sets the escalation business calendar type (e.g. holiday tag or location bean path),
     * if applicable.
     * @param bct a business calendar type
     */
    public void setEscalationBusCalType(gw.api.activity.BusCalType bct) {
      ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).setEscalationBusCalType(bct);
    }
    
    /**
     * Sets the value of the EscalationDays field.
     */
    public void setEscalationDays(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ESCALATIONDAYS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EscalationHours field.
     */
    public void setEscalationHours(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ESCALATIONHOURS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EscalationInclDays field.
     */
    public void setEscalationInclDays(typekey.IncludeDaysType value) {
      __getInternalInterface().setFieldValue(ESCALATIONINCLDAYS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EscalationStartPt field.
     */
    public void setEscalationStartPt(typekey.StartPointType value) {
      __getInternalInterface().setFieldValue(ESCALATIONSTARTPT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExternallyOwned field.
     */
    public void setExternallyOwned(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(EXTERNALLYOWNED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Importance field.
     */
    public void setImportance(typekey.ImportanceLevel value) {
      __getInternalInterface().setFieldValue(IMPORTANCE_PROP.get(), value);
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
     * Sets the value of the Mandatory field.
     */
    public void setMandatory(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(MANDATORY_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    public void setOrganization(entity.Organization value) {
      ((com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods")).setOrganization(value);
    }
    
    public void setOrganizationID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods")).setOrganizationID(value);
    }
    
    /**
     * Sets the value of the Priority field.
     */
    public void setPriority(typekey.Priority value) {
      __getInternalInterface().setFieldValue(PRIORITY_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Recurring field.
     */
    public void setRecurring(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(RECURRING_PROP.get(), value);
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
     * Sets the value of the ShortSubject field.
     */
    public void setShortSubject(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SHORTSUBJECT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ShortSubject_L10N_ARRAY field.
     */
    public void setShortSubject_L10N_ARRAY(entity.ActivityPattern_ShortSubject_L10N[] value) {
      __getInternalInterface().setFieldValue(SHORTSUBJECT_L10N_ARRAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subject field.
     */
    public void setSubject(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SUBJECT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subject_L10N_ARRAY field.
     */
    public void setSubject_L10N_ARRAY(entity.ActivityPattern_Subject_L10N[] value) {
      __getInternalInterface().setFieldValue(SUBJECT_L10N_ARRAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetBusCalLocPath field.
     */
    public void setTargetBusCalLocPath(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TARGETBUSCALLOCPATH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetBusCalTag field.
     */
    public void setTargetBusCalTag(typekey.HolidayTagCode value) {
      __getInternalInterface().setFieldValue(TARGETBUSCALTAG_PROP.get(), value);
    }
    
    /**
     * Sets the target business calendar type (e.g. holiday tag or location bean path),
     * if applicable.
     * @param bct a business calendar type
     */
    public void setTargetBusCalType(gw.api.activity.BusCalType bct) {
      ((com.guidewire.pl.domain.activity.ActivityPatternPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods")).setTargetBusCalType(bct);
    }
    
    /**
     * Sets the value of the TargetDays field.
     */
    public void setTargetDays(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TARGETDAYS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetHours field.
     */
    public void setTargetHours(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TARGETHOURS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetIncludeDays field.
     */
    public void setTargetIncludeDays(typekey.IncludeDaysType value) {
      __getInternalInterface().setFieldValue(TARGETINCLUDEDAYS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TargetStartPoint field.
     */
    public void setTargetStartPoint(typekey.StartPointType value) {
      __getInternalInterface().setFieldValue(TARGETSTARTPOINT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Type field.
     */
    public void setType(typekey.ActivityType value) {
      __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.activity.impl.ActivityPatternCoreExtMethods", "com.guidewire.cc.domain.activity.impl.ActivityPatternCoreExtMethodsImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.activity.ActivityPatternPublicMethods", "com.guidewire.pl.domain.activity.impl.ActivityPatternImpl");
    config.put("com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods", "com.guidewire.cc.domain.activity.impl.ActivityPatternCoreExtMethodsImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.pl.domain.activity.impl.ActivityPatternImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.pl.domain.activity.impl.ActivityPatternImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ActivityPattern.class, config);
    com.guidewire._generated.entity.ActivityPatternInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ActivityPattern, com.guidewire._generated.entity.ActivityPatternInternal>() {
      public java.lang.Object getImplementation(entity.ActivityPattern bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ActivityPatternInternal getInternalInterface(entity.ActivityPattern bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ActivityPattern newEmptyInstance() {
        return new entity.ActivityPattern((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}