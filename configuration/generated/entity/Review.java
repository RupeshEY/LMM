package entity;

/**
 * Review
 * A service provider review, created from a given ReviewType.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Review.eti;Review.eix;Review.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Review")
public class Review extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Review> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Review>("entity.Review");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSBOOKUID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddressBookUID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CATEGORYSCORES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CategoryScores");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMPLETED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Completed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Contact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> QUESTIONANSWERSETS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "QuestionAnswerSets");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RELATEDTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RelatedTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> REVIEWTYPE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ReviewType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> REVIEWEDBY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ReviewedBy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCORE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Score");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServiceDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SERVICETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ServiceType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBCONTACT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Subcontact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ReviewInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Review()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Review(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Review(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ReviewInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ReviewInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the CategoryScores array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCategoryScores(entity.ReviewCategoryScore element) {
    __getInternalInterface().addArrayElement(CATEGORYSCORES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the QuestionAnswerSets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToQuestionAnswerSets(entity.ReviewQAnswerSet element) {
    __getInternalInterface().addArrayElement(QUESTIONANSWERSETS_PROP.get(), element);
  }
  
  public void beforeInsert() {
    ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
  }
  
  public void beforeUpdate() {
    ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
  }
  
  /**
   * <p>Completes the review. This operation will update the review scores and validate the link status of the
   * associated contact before finally setting the review status to completed.  Completing the review will update ContactCenter
   * with the information captured for this review. This will prompt ContactCenter to recalculate the aggregate scores for the vendor.</p>
   * 
   * <p>If the review had already been completed, calling this method has no effect and the return value will be false.</p>
   * @return true if the review was successfully completed or false if the review was already completed beforehand.
   */
  public boolean complete() {
    return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).complete();
  }
  
  /**
   * <p>
   * Deletes the review.  Deleting the review will update ContactCenter and remove the information captured for this review.
   * This will prompt ContactCenter to recalculate the aggregate scores for the vendor.
   * </p>
   */
  public void delete() {
    ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).delete();
  }
  
  /**
   * Gets the value of the AddressBookUID field.
   * Represents the ID of the associated ReviewSummary in Address Book. Null if the object is not linked to Address Book.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressBookUID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSBOOKUID_PROP.get());
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
   * Gets the value of the CategoryScores field.
   * List of categories and their scores, associated with this Review.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReviewCategoryScore[] getCategoryScores() {
    return (entity.ReviewCategoryScore[])__getInternalInterface().getFieldValue(CATEGORYSCORES_PROP.get());
  }
  
  /**
   * Gets the value of the Claim field.
   * Associated Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the Comments field.
   * Comments about the Review
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the Contact field.
   * Associated Contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact() {
    return (entity.Contact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
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
   * Description ofthe accident or loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
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
   * Gets the value of the Name field.
   * Short name of this review type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the QuestionAnswerSets field.
   * List of Question set/Answer Set pairs, and their assigned categories, associated with this Review.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReviewQAnswerSet[] getQuestionAnswerSets() {
    return (entity.ReviewQAnswerSet[])__getInternalInterface().getFieldValue(QUESTIONANSWERSETS_PROP.get());
  }
  
  /**
   * Gets the value of the RelatedTo field.
   * Detailed description of this review type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRelatedTo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RELATEDTO_PROP.get());
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
   * Gets the value of the ReviewType field.
   * Associated ReviewType.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReviewType getReviewType() {
    return (entity.ReviewType)__getInternalInterface().getFieldValue(REVIEWTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the ReviewedBy field.
   * User who created the review
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getReviewedBy() {
    return (entity.User)__getInternalInterface().getFieldValue(REVIEWEDBY_PROP.get());
  }
  
  /**
   * Gets the value of the Score field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getScore() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SCORE_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceDate field.
   * Date of the service being reviewed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServiceDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReviewServiceType getServiceType() {
    return (typekey.ReviewServiceType)__getInternalInterface().getFieldValue(SERVICETYPE_PROP.get());
  }
  
  /**
   * 
   * @return a sorted list of categories associated with this Review and their scores.
   */
  public entity.ReviewCategoryScore[] getSortedCategoryScores() {
    return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).getSortedCategoryScores();
  }
  
  /**
   * 
   * @return an ordered list (sorted by ElementOrder) of review question answer sets for this review
   */
  public entity.ReviewQAnswerSet[] getSortedQuestionAnswerSets() {
    return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).getSortedQuestionAnswerSets();
  }
  
  /**
   * 
   * @return The localized description of the current completion status (e.g., complete or incomplete) of the review.
   */
  public java.lang.String getStatusString() {
    return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).getStatusString();
  }
  
  /**
   * Gets the value of the Subcontact field.
   * Optionally associated sub-Contact (Service Person or similar).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubcontact() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SUBCONTACT_PROP.get());
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
   * Gets the value of the Completed field.
   * Boolean field to mark a review as completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCompleted() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(COMPLETED_PROP.get());
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
   * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
   */
  public void removeFromCategoryScores(entity.ReviewCategoryScore element) {
    __getInternalInterface().removeArrayElement(CATEGORYSCORES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCategoryScores(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CATEGORYSCORES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the QuestionAnswerSets array. This is achieved by marking the element for removal.
   */
  public void removeFromQuestionAnswerSets(entity.ReviewQAnswerSet element) {
    __getInternalInterface().removeArrayElement(QUESTIONANSWERSETS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the QuestionAnswerSets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromQuestionAnswerSets(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(QUESTIONANSWERSETS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AddressBookUID field.
   */
  public void setAddressBookUID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDRESSBOOKUID_PROP.get(), value);
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
   * Sets the value of the CategoryScores field.
   */
  public void setCategoryScores(entity.ReviewCategoryScore[] value) {
    __getInternalInterface().setFieldValue(CATEGORYSCORES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setClaim(entity.Claim value) {
    ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).setClaim(value);
  }
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Completed field.
   */
  public void setCompleted(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(COMPLETED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value) {
    __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
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
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
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
   * Sets the value of the QuestionAnswerSets field.
   */
  public void setQuestionAnswerSets(entity.ReviewQAnswerSet[] value) {
    __getInternalInterface().setFieldValue(QUESTIONANSWERSETS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RelatedTo field.
   */
  public void setRelatedTo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RELATEDTO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReviewType field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setReviewType(entity.ReviewType value) {
    ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).setReviewType(value);
  }
  
  /**
   * Sets the value of the ReviewedBy field.
   */
  public void setReviewedBy(entity.User value) {
    __getInternalInterface().setFieldValue(REVIEWEDBY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Score field.
   */
  public void setScore(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SCORE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceDate field.
   */
  public void setServiceDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SERVICEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServiceType field.
   */
  public void setServiceType(typekey.ReviewServiceType value) {
    __getInternalInterface().setFieldValue(SERVICETYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subcontact field.
   */
  public void setSubcontact(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SUBCONTACT_PROP.get(), value);
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
  
  /**
   * <p>The default scoring algorithm for reviews.</p>
   * @return the score of the review
   */
  public java.lang.Integer updateAndGetSimpleScores() {
    return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).updateAndGetSimpleScores();
  }
  
  /**
   * <p>Updates the score of the review if it is incomplete. If the review is not completed, ContactCenter will calculate
   * and update score. If the review has already been completed, the score has already been finalized and that score will
   * be returned.
   * </p>
   * @return the score of the review
   */
  public java.lang.Integer updateScores() {
    return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).updateScores();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ReviewInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Review.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the CategoryScores array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCategoryScores(entity.ReviewCategoryScore element) {
      __getInternalInterface().addArrayElement(CATEGORYSCORES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the QuestionAnswerSets array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToQuestionAnswerSets(entity.ReviewQAnswerSet element) {
      __getInternalInterface().addArrayElement(QUESTIONANSWERSETS_PROP.get(), element);
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
    
    /**
     * <p>Completes the review. This operation will update the review scores and validate the link status of the
     * associated contact before finally setting the review status to completed.  Completing the review will update ContactCenter
     * with the information captured for this review. This will prompt ContactCenter to recalculate the aggregate scores for the vendor.</p>
     * 
     * <p>If the review had already been completed, calling this method has no effect and the return value will be false.</p>
     * @return true if the review was successfully completed or false if the review was already completed beforehand.
     */
    public boolean complete() {
      return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).complete();
    }
    
    /**
     * <p>
     * Deletes the review.  Deleting the review will update ContactCenter and remove the information captured for this review.
     * This will prompt ContactCenter to recalculate the aggregate scores for the vendor.
     * </p>
     */
    public void delete() {
      ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).delete();
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
     * Gets the value of the AddressBookUID field.
     * Represents the ID of the associated ReviewSummary in Address Book. Null if the object is not linked to Address Book.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddressBookUID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSBOOKUID_PROP.get());
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
     * Gets the value of the CategoryScores field.
     * List of categories and their scores, associated with this Review.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ReviewCategoryScore[] getCategoryScores() {
      return (entity.ReviewCategoryScore[])__getInternalInterface().getFieldValue(CATEGORYSCORES_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     * Associated Claim.
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
     * Comments about the Review
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getComments() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the Contact field.
     * Associated Contact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getContact() {
      return (entity.Contact)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CONTACT_PROP.get());
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
     * Description ofthe accident or loss.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
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
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the Name field.
     * Short name of this review type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the QuestionAnswerSets field.
     * List of Question set/Answer Set pairs, and their assigned categories, associated with this Review.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ReviewQAnswerSet[] getQuestionAnswerSets() {
      return (entity.ReviewQAnswerSet[])__getInternalInterface().getFieldValue(QUESTIONANSWERSETS_PROP.get());
    }
    
    /**
     * Gets the value of the RelatedTo field.
     * Detailed description of this review type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRelatedTo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RELATEDTO_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the ReviewType field.
     * Associated ReviewType.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ReviewType getReviewType() {
      return (entity.ReviewType)__getInternalInterface().getFieldValue(REVIEWTYPE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getReviewTypeID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(REVIEWTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ReviewedBy field.
     * User who created the review
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getReviewedBy() {
      return (entity.User)__getInternalInterface().getFieldValue(REVIEWEDBY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getReviewedByID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(REVIEWEDBY_PROP.get());
    }
    
    /**
     * Gets the value of the Score field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getScore() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SCORE_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceDate field.
     * Date of the service being reviewed
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getServiceDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceType field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ReviewServiceType getServiceType() {
      return (typekey.ReviewServiceType)__getInternalInterface().getFieldValue(SERVICETYPE_PROP.get());
    }
    
    /**
     * 
     * @return a sorted list of categories associated with this Review and their scores.
     */
    public entity.ReviewCategoryScore[] getSortedCategoryScores() {
      return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).getSortedCategoryScores();
    }
    
    /**
     * 
     * @return an ordered list (sorted by ElementOrder) of review question answer sets for this review
     */
    public entity.ReviewQAnswerSet[] getSortedQuestionAnswerSets() {
      return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).getSortedQuestionAnswerSets();
    }
    
    /**
     * 
     * @return The localized description of the current completion status (e.g., complete or incomplete) of the review.
     */
    public java.lang.String getStatusString() {
      return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).getStatusString();
    }
    
    /**
     * Gets the value of the Subcontact field.
     * Optionally associated sub-Contact (Service Person or similar).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSubcontact() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SUBCONTACT_PROP.get());
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
    
    public void initializeQuestionSets() {
      ((com.guidewire.cc.domain.contact.impl.ReviewInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.contact.impl.ReviewInternal")).initializeQuestionSets();
    }
    
    /**
     * Gets the value of the Completed field.
     * Boolean field to mark a review as completed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCompleted() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(COMPLETED_PROP.get());
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
    
    /**
     * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
     */
    public void removeFromCategoryScores(entity.ReviewCategoryScore element) {
      __getInternalInterface().removeArrayElement(CATEGORYSCORES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCategoryScores(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CATEGORYSCORES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the QuestionAnswerSets array. This is achieved by marking the element for removal.
     */
    public void removeFromQuestionAnswerSets(entity.ReviewQAnswerSet element) {
      __getInternalInterface().removeArrayElement(QUESTIONANSWERSETS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the QuestionAnswerSets array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromQuestionAnswerSets(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(QUESTIONANSWERSETS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AddressBookUID field.
     */
    public void setAddressBookUID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDRESSBOOKUID_PROP.get(), value);
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
     * Sets the value of the CategoryScores field.
     */
    public void setCategoryScores(entity.ReviewCategoryScore[] value) {
      __getInternalInterface().setFieldValue(CATEGORYSCORES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setClaim(entity.Claim value) {
      ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).setClaim(value);
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
     * Sets the value of the Completed field.
     */
    public void setCompleted(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(COMPLETED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Contact field.
     */
    public void setContact(entity.Contact value) {
      __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
    }
    
    public void setContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CONTACT_PROP.get(), value);
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
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
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
     * Sets the value of the QuestionAnswerSets field.
     */
    public void setQuestionAnswerSets(entity.ReviewQAnswerSet[] value) {
      __getInternalInterface().setFieldValue(QUESTIONANSWERSETS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RelatedTo field.
     */
    public void setRelatedTo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RELATEDTO_PROP.get(), value);
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
     * Sets the value of the ReviewType field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setReviewType(entity.ReviewType value) {
      ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).setReviewType(value);
    }
    
    public void setReviewTypeID(gw.pl.persistence.core.Key value) {
      setFieldValue(REVIEWTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReviewedBy field.
     */
    public void setReviewedBy(entity.User value) {
      __getInternalInterface().setFieldValue(REVIEWEDBY_PROP.get(), value);
    }
    
    public void setReviewedByID(gw.pl.persistence.core.Key value) {
      setFieldValue(REVIEWEDBY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Score field.
     */
    public void setScore(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SCORE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceDate field.
     */
    public void setServiceDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SERVICEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServiceType field.
     */
    public void setServiceType(typekey.ReviewServiceType value) {
      __getInternalInterface().setFieldValue(SERVICETYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subcontact field.
     */
    public void setSubcontact(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SUBCONTACT_PROP.get(), value);
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
    
    /**
     * <p>The default scoring algorithm for reviews.</p>
     * @return the score of the review
     */
    public java.lang.Integer updateAndGetSimpleScores() {
      return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).updateAndGetSimpleScores();
    }
    
    /**
     * <p>Updates the score of the review if it is incomplete. If the review is not completed, ContactCenter will calculate
     * and update score. If the review has already been completed, the score has already been finalized and that score will
     * be returned.
     * </p>
     * @return the score of the review
     */
    public java.lang.Integer updateScores() {
      return ((gw.cc.contact.entity.Review)__getDelegateManager().getImplementation("gw.cc.contact.entity.Review")).updateScores();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.contact.impl.ReviewInternal", "com.guidewire.cc.domain.contact.impl.ReviewImpl");
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
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.contact.impl.ReviewImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.contact.impl.ReviewImpl");
    config.put("gw.cc.contact.entity.Review", "com.guidewire.cc.domain.contact.impl.ReviewImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Review.class, config);
    com.guidewire._generated.entity.ReviewInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Review, com.guidewire._generated.entity.ReviewInternal>() {
      public java.lang.Object getImplementation(entity.Review bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ReviewInternal getInternalInterface(entity.Review bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Review newEmptyInstance() {
        return new entity.Review((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}