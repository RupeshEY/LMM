package entity;

/**
 * TransactionSet
 * 
 *       A set of transactions submitted for approval together. Subtypes include ReserveSet, RecoverySet, and
 *       RecoveryReserveSet, which contain the respective Transaction types. A CheckSet contains Checks and Payments.
 *       There is no PaymentSet.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionSet.eti;TransactionSet.eix;TransactionSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class TransactionSet extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Validatable, entity.Approvable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TransactionSet> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TransactionSet>("entity.TransactionSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ACTIVITIES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Activities");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPROVALDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ApprovalDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> APPROVALSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ApprovalStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DOCUMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Documents");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> REQUESTINGUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RequestingUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TransactionSetInternal _internal;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> VALIDATION_RESULTS_DYNPROP = com.guidewire.pl.domain.validation.ValidatablePublicMethods.VALIDATION_RESULTS_DYNPROP;
  
  protected TransactionSet(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.TransactionSetInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.TransactionSetInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Link the given Document to this TransactionSet.
   * @param document 
   */
  public void addLinkedDocument(entity.Document document) {
    ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).addLinkedDocument(document);
  }
  
  /**
   * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToActivities(entity.Activity element) {
    __getInternalInterface().addArrayElement(ACTIVITIES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Documents array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocuments(entity.TransactionSetDocument element) {
    __getInternalInterface().addArrayElement(DOCUMENTS_PROP.get(), element);
  }
  
  /**
   * Causes the approval activity to be sent to the supervisor of the group
   * to which the exposure is assigned, if there is exactly one exposure,
   * or the group to which the claim is assigned otherwise.
   * <p/>
   * <b>Note: This method should only be called from a rule in the Approval
   * Routing ruleset</b>.
   * @return <tt>false</tt> if the approving user would be the user who
   *         submitted the approval bean - if, for instance, the user were the
   *         supervisor of the group to which the claim/exposure is assigned, or
   *         if the claim and exposure are not yet assigned
   */
  public boolean approveByGroupSupervisor() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).approveByGroupSupervisor();
  }
  
  /**
   * Handles the use case of an approval working its way up the user's group chain.
   * <p/>
   * <b>Note: This method should only be called from a rule in the Approval
   * Routing ruleset</b>.
   * <p/>
   * Assign to the submitting user's supervisor, determined in the following manner:
   * <ul>
   * <li>First, if the submitting user is the supervisor of the root group, short
   * circuit the following and assign to the Default Owner.</li>
   * <li>Second, consider the claim or exposure's owning group:</li>
   * <ol>
   * <li>If submitting user is in the group and is not the supervisor of the group or a
   * parent group, then approval goes to the group supervisor.</li>
   * <li>If the submitting user is a supervisor of the group or a parent group, approval
   * goes to the supervisor of the group above the highest group the user supervises.
   * </ol>
   * <li>Third, if the user is neither a member of the owning group, nor a supervisor
   * of the owning group or one of its parents, consider groups the submitting user
   * belongs to. Repeat the steps above, at least one of which must now succeed.</li>
   * </ul>
   * NOTE: If the user is a member of multiple groups and assignment reaches the third
   * step, the assignment may be nondeterministic, since none of the user's groups has
   * priority, and the order in which they are returned is undefined.
   * @return <tt>false</tt> if assignment is unsuccessful
   */
  public boolean approveByUserSupervisor() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).approveByUserSupervisor();
  }
  
  /**
   * Returns the amount of the FinancialsExpression as if the Transactions in
   * this set have all reached Submitted status. Optionally, includes only those
   * ReserveLines and transactions that match the given CoverageType, CostType and CostCategory.
   * Note that offsetting Reserves in a CheckSet are left as is when evaluating the amount.
   * @param expression the FinancialsExpression to calculate. See AbstractFinancialsExpression.
   * @param coverageType can be null - in which case all coverage types are matched
   * @param costType can be null - in which case all CostTypes are matched
   * @param costCategory can be null - in which case all CostCategories are matched
   * @return amount of the financials calc. null if no transactions (in the set or
   *          preexisting) contribute to the financials calculation.
   */
  public gw.api.financials.CurrencyAmount evaluateExpressionAsIfSubmitted(gw.api.financials.FinancialsExpression expression, typekey.CoverageType coverageType, typekey.CostType costType, typekey.CostCategory costCategory) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).evaluateExpressionAsIfSubmitted(expression, coverageType, costType, costCategory);
  }
  
  /**
   * Returns the amount of the FinancialsExpression as if the Transactions in
   * this set have all reached Submitted status. Optionally, includes only those
   * ReserveLines and transactions that match the given Exposure, CostType, and CostCategory.
   * Note that offsetting Reserves in a CheckSet are left as is when evaluating the amount.
   * @param expression the FinancialsExpression to calculate. See AbstractFinancialsExpression.
   * @param exposure can be null - in which case only claim-level transactions are matched
   * @param costType can be null - in which case all CostTypes are matched
   * @param costCategory can be null - in which case all CostCategories are matched
   * @return amount of the financials calc. null if no transactions (in the set or
   *          preexisting) contribute to the financials calculation.
   */
  public gw.api.financials.CurrencyAmount evaluateExpressionByExposureAsIfSubmitted(gw.api.financials.FinancialsExpression expression, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).evaluateExpressionByExposureAsIfSubmitted(expression, exposure, costType, costCategory);
  }
  
  /**
   * Gets the value of the Activities field.
   * Set of approval / approval denial activities linked to this transaction set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities() {
    return (entity.Activity[])__getInternalInterface().getFieldValue(ACTIVITIES_PROP.get());
  }
  
  /**
   * Returns all transactions that belong to this TransactionSet.  For CheckSets,
   * this also returns any offsetting reserves and payments on add-ons.
   * <p/>
   * Subclasses need to implement this.
   */
  public entity.Transaction[] getAllTransactions() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getAllTransactions();
  }
  
  /**
   * 
   * @deprecated please use getClaimAmount instead
   * Returns the sum total of all the transactions in this set, including
   * dependent checks and offsetting reserves (where applicable).
   */
  public java.math.BigDecimal getAmount() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getAmount();
  }
  
  /**
   * Gets the value of the ApprovalDate field.
   * The date when the object was ultimately approved or rejected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getApprovalDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(APPROVALDATE_PROP.get());
  }
  
  /**
   * Retrieves all approval activities for this TransactionSet.
   * @return a List containing the Approval Activities
   */
  public java.util.List<entity.Activity> getApprovalHistory() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getApprovalHistory();
  }
  
  /**
   * Gets the value of the ApprovalStatus field.
   * The approval status of the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ApprovalStatus getApprovalStatus() {
    return (typekey.ApprovalStatus)__getInternalInterface().getFieldValue(APPROVALSTATUS_PROP.get());
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
   * Returns the sum total of all the transactions' claim amount in this set,
   * including dependent checks and offsetting reserves (where applicable).
   */
  public gw.api.financials.CurrencyAmount getClaimAmount() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getClaimAmount();
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
   * Gets the value of the Documents field.
   * Set of documents linked to this transaction set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionSetDocument[] getDocuments() {
    return (entity.TransactionSetDocument[])__getInternalInterface().getFieldValue(DOCUMENTS_PROP.get());
  }
  
  /**
   * Returns the list of exposures that the transactions in this TransactionSet
   * belong to.
   */
  public entity.Exposure[] getExposures() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getExposures();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Returns the last user who approved this TransactionSet.
   * <p/>
   * For example, if User A submits a TransactionSet for approval, then the
   * LastApprovingUser is User A.  Suppose that TransactionSet then requires
   * approval by User B.  When User B approves the TransactionSet, then the
   * LastApprovingUser becomes User B.  And so on . . .
   * <p/>
   * Note: This method should only be called from Approval and Transaction Approval
   * Rules.  If this method is called from any other rule, then returns null.
   */
  public entity.User getLastApprovingUser() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getLastApprovingUser();
  }
  
  /**
   * Returns the remaining unused amount of a given aggregate limit.
   * Specifically, this amount is equal to the limit amount minus the amount used.
   * If the difference is negative, then zero is returned.
   * @param limit An aggregate limit
   */
  public java.math.BigDecimal getLimitRemaining(entity.AggregateLimit limit) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getLimitRemaining(limit);
  }
  
  /**
   * Returns the remaining unused amount of a given aggregate limit.  The amount
   * includes all transactions in this TransactionSet based on their current status.
   * Specifically, this amount is equal to the limit amount minus the amount used.
   * If the difference is negative, then zero is returned.
   * @param limit An aggregate limit
   */
  public java.math.BigDecimal getLimitRemainingIgnoringStatus(entity.AggregateLimit limit) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getLimitRemainingIgnoringStatus(limit);
  }
  
  /**
   * Returns the amount used of a given aggregate limit.
   * @param limit An aggregate limit
   */
  public gw.api.financials.CurrencyAmount getLimitUsed(entity.AggregateLimit limit) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getLimitUsed(limit);
  }
  
  /**
   * Returns the amount used of a given aggregate limit.  The amount includes all
   * transactions in this TransactionSet regardless of their status.
   * @param limit An aggregate limit
   */
  public gw.api.financials.CurrencyAmount getLimitUsedIgnoringStatus(entity.AggregateLimit limit) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getLimitUsedIgnoringStatus(limit);
  }
  
  /**
   * Returns all transaction line items that belong to this TransactionSet.
   */
  public entity.TransactionLineItem[] getLineItems() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getLineItems();
  }
  
  /**
   * Returns the set of Documents linked to this TransactionSet.
   */
  public entity.Document[] getLinkedDocuments() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getLinkedDocuments();
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
   * Gets the value of the RequestingUser field.
   * The user submitting the object for approval
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getRequestingUser() {
    return (entity.User)__getInternalInterface().getFieldValue(REQUESTINGUSER_PROP.get());
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
  public typekey.TransactionSet getSubtype() {
    return (typekey.TransactionSet)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   * Returns all transactions that belong to this TransactionSet.  For CheckSets,
   * this only returns the payments of the primary and recurrence checks.
   * <p/>
   * Subclasses need to implement this.
   */
  public entity.Transaction[] getTransactions() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getTransactions();
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
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's Invalid flag is true.  An Invalid limit means that
   * the amount returned by aggregateLimit.LimitUsed is suspect.  An aggregate limit may become invalid in two
   * ways:
   * 1) A staging table load brings in new transactions that might fall under an existing or newly-loaded
   * aggregate limit.  When this happens the aggregate limits on the corresponding policy period are marked as invalid.
   * 
   * 2) An administrator's request to rebuild all the limit used values, which runs in the background, has not
   * proceeded all the way through the database yet.
   * 
   * If the aggregate limit is still invalid it means that the limit used value cannot be trusted to be accurate yet.  In this
   * case no guarantee is made that a transaction would either exceed or not exceed an aggregate limit.
   * 
   * A batch job called AggLimitCalc can rebuild either all or just the invalid aggregate
   * limits, depending on the parameter used when the job is run.
   * @return If this transaction set is on a claim in a policy period in which at least one aggregate limit
   * is invalid then this method returns true.  Otherwise it returns false.
   * Also returns false if the policy's policy periods have no aggregate limits.
   */
  public boolean hasInvalidAggregateLimit() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).hasInvalidAggregateLimit();
  }
  
  /**
   * Return true if the given document is linked to this transaction set.
   * @param document 
   */
  public boolean hasLinkedDocument(entity.Document document) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).hasLinkedDocument(document);
  }
  
  /**
   * Returns true if the TransactionSet is approved, i.e., its approval status
   * is {@link typekey.ApprovalStatus#TC_APPROVED}.
   */
  public boolean isApproved() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isApproved();
  }
  
  /**
   * Returns true if the TransactionSet is editable, i.e., it is unapproval or
   * rejected.
   */
  public boolean isEditable() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isEditable();
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is greater than its corresponding limit
   * amount.
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   */
  public boolean isExceedsApplicableLimit() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isExceedsApplicableLimit();
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is greater than its corresponding limit
   * amount.
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isExceedsApplicableLimit(typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isExceedsApplicableLimit(valueType);
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is greater than its corresponding limit
   * amount.  The amount used includes all transactions in this TransactionSet
   * regardless of their status.
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   */
  public boolean isExceedsApplicableLimitIgnoringStatus() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isExceedsApplicableLimitIgnoringStatus();
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is greater than its corresponding limit
   * amount.  The amount used includes all transactions in this TransactionSet
   * regardless of their status.
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isExceedsApplicableLimitIgnoringStatus(typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isExceedsApplicableLimitIgnoringStatus(valueType);
  }
  
  /**
   * Returns true if this TransactionSet, when combined with all other TransactionSets
   * for all aggregate limits that apply to the Policy of this TransactionSet's
   * claim, returns true if any limit used is greater than its corresponding
   * limit amount.<p/>
   * Defaults to Limit.
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   */
  public boolean isExceedsLimit() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isExceedsLimit();
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's
   * claim, returns true if any limit used is greater than its corresponding
   * limit amount.<p/>
   * Specify an AggregateType (Limit or Deductible).
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isExceedsLimit(typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isExceedsLimit(valueType);
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's claim,
   * returns true if any limit used is greater than its corresponding limit
   * amount.  The amount used includes all transactions in this TransactionSet
   * regardless of their status.
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   */
  public boolean isExceedsLimitIgnoringStatus() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isExceedsLimitIgnoringStatus();
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's claim,
   * returns true if any limit used is greater than its corresponding limit
   * amount.  The amount used includes all transactions in this TransactionSet
   * regardless of their status.
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isExceedsLimitIgnoringStatus(typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isExceedsLimitIgnoringStatus(valueType);
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
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is within a given amount of their
   * corresponding limit amounts.
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is set to zero.
   */
  public boolean isWithinApplicableLimit(java.math.BigDecimal amount) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinApplicableLimit(amount);
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is within a given amount of their
   * corresponding limit amounts.
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is set to zero.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isWithinApplicableLimit(java.math.BigDecimal amount, typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinApplicableLimit(amount, valueType);
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is within a given amount of their
   * corresponding limit amounts.  The amount used includes all transactions in
   * this TransactionSet regardless of their status.
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is set to zero.
   */
  public boolean isWithinApplicableLimitIgnoringStatus(java.math.BigDecimal amount) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinApplicableLimitIgnoringStatus(amount);
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is within a given amount of their
   * corresponding limit amounts.  The amount used includes all transactions in
   * this TransactionSet regardless of their status.
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is set to zero.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isWithinApplicableLimitIgnoringStatus(java.math.BigDecimal amount, typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinApplicableLimitIgnoringStatus(amount, valueType);
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's
   * claim, returns true if any limit's used amount is within a given amount of their
   * corresponding limit amounts.
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is set to zero.
   */
  public boolean isWithinLimit(java.math.BigDecimal amount) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinLimit(amount);
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's
   * claim, returns true if any limit's used amount is within a given amount of their
   * corresponding limit amounts.
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is set to zero.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isWithinLimit(java.math.BigDecimal amount, typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinLimit(amount, valueType);
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's
   * claim, returns true if any limit's used amount is within a given amount of their
   * corresponding limit amounts.  The amount used includes all transactions in
   * this TransactionSet regardless of their status.
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is set to zero.
   */
  public boolean isWithinLimitIgnoringStatus(java.math.BigDecimal amount) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinLimitIgnoringStatus(amount);
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's
   * claim, returns true if any limit's used amount is within a given amount of their
   * corresponding limit amounts.  The amount used includes all transactions in
   * this TransactionSet regardless of their status.
   * <p/>
   * For example, if the limit amount is $100 and the given amount is $20, then
   * this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param amount The amount that is subtract from the limit amounts of all applicable
   *               aggregate limits.  If amount is null, then amount is set to zero.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isWithinLimitIgnoringStatus(java.math.BigDecimal amount, typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinLimitIgnoringStatus(amount, valueType);
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is within a given percentage
   * of their corresponding limit amounts.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                percent is set to 100.
   */
  public boolean isWithinPercentOfApplicableLimit(java.math.BigDecimal percent) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinPercentOfApplicableLimit(percent);
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is within a given percentage
   * of their corresponding limit amounts.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                percent is set to 100.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isWithinPercentOfApplicableLimit(java.math.BigDecimal percent, typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinPercentOfApplicableLimit(percent, valueType);
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is within a given percentage
   * of their corresponding limit amounts.  The amount used includes all transactions
   * in this TransactionSet based on their current status.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                percent is set to 100.
   */
  public boolean isWithinPercentOfApplicableLimitIgnoringStatus(java.math.BigDecimal percent) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinPercentOfApplicableLimitIgnoringStatus(percent);
  }
  
  /**
   * For all aggregate limits that the transactions on this TransactionSet contribute
   * to, returns true if any limit's used amount is within a given percentage
   * of their corresponding limit amounts.  The amount used includes all transactions
   * in this TransactionSet based on their current status.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                percent is set to 100.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isWithinPercentOfApplicableLimitIgnoringStatus(java.math.BigDecimal percent, typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinPercentOfApplicableLimitIgnoringStatus(percent, valueType);
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's claim,
   * returns true if any limit's used amount is within a given percentage of their
   * corresponding limit amounts.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                percent is set to 100.
   */
  public boolean isWithinPercentOfLimit(java.math.BigDecimal percent) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinPercentOfLimit(percent);
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's claim,
   * returns true if any limit's used amount is within a given percentage of their
   * corresponding limit amounts.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                percent is set to 100.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isWithinPercentOfLimit(java.math.BigDecimal percent, typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinPercentOfLimit(percent, valueType);
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's claim,
   * returns true if any limit's used amount is within a given percentage of their
   * corresponding limit amounts.  The amount used includes all transactions in
   * this TransactionSet based on their current status.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                percent is set to 100.
   */
  public boolean isWithinPercentOfLimitIgnoringStatus(java.math.BigDecimal percent) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinPercentOfLimitIgnoringStatus(percent);
  }
  
  /**
   * For all aggregate limits belonging to the policy of the TransactionSet's claim,
   * returns true if any limit's used amount is within a given percentage of their
   * corresponding limit amounts.  The amount used includes all transactions in
   * this TransactionSet based on their current status.
   * <p/>
   * For example, if the limit amount is $100 and the given percentage is 20%,
   * then this method returns
   * <ul>
   * <li> false if the amount used is less than $80
   * <li> true if the amount used is greater than or equal to $80 and less than or equal to $100
   * <li> false if the amount used is greater than $100
   * </ul>
   * <p/>
   * Returns false if the policy's policy period has no aggregate limits.
   * @param percent The percent that is applied to the limit amounts of all
   *                applicable aggregate limits.  If percent is null, then the
   *                percent is set to 100.
   * @param valueType AggregateType (Limit or Deductible)
   */
  public boolean isWithinPercentOfLimitIgnoringStatus(java.math.BigDecimal percent, typekey.AggregateType valueType) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).isWithinPercentOfLimitIgnoringStatus(percent, valueType);
  }
  
  /**
   * Rebuilds the LimitUsed for all aggregate limits on the PolicyPeriod for this transactionSet's claim.
   * 
   * This method can be called from a Rule to ensure that the LimitUsed values are all up to date.
   * At the end of this method, the aggregate limits associated with the policy period will be marked as valid.
   * This could be a potentially time-consuming operation if the associated policy period
   * has many claims with many transactions per claim on them.
   * @return the number of aggregate limits rebuilt
   */
  public int rebuildAggregateLimits() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).rebuildAggregateLimits();
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
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   */
  public void removeFromActivities(entity.Activity element) {
    __getInternalInterface().removeArrayElement(ACTIVITIES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromActivities(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ACTIVITIES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Documents array. This is achieved by marking the element for removal.
   */
  public void removeFromDocuments(entity.TransactionSetDocument element) {
    __getInternalInterface().removeArrayElement(DOCUMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Documents array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDocuments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DOCUMENTS_PROP.get(), elementID);
  }
  
  /**
   * Remove the given Document from the set of Documents linked to this TransactionSet (if it is linked).
   * @param document 
   */
  public void removeLinkedDocument(entity.Document document) {
    ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).removeLinkedDocument(document);
  }
  
  /**
   * Forces this TransactionSet to require approval.
   * <p/>
   * <b>Note: This method should only be called from a rule in the Transaction
   * Approval ruleset</b>.
   * 
   * Note: This method can only be called from rules.
   * @param reason the reasons that approval is required
   */
  public boolean requireApproval(java.lang.String reason) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).requireApproval(reason);
  }
  
  /**
   * Sets the value of the Activities field.
   */
  public void setActivities(entity.Activity[] value) {
    __getInternalInterface().setFieldValue(ACTIVITIES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ApprovalDate field.
   */
  public void setApprovalDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(APPROVALDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ApprovalStatus field.
   */
  public void setApprovalStatus(typekey.ApprovalStatus value) {
    __getInternalInterface().setFieldValue(APPROVALSTATUS_PROP.get(), value);
  }
  
  /**
   * Selects a user to approve the approval activity.
   * <p/>
   * <b>Note: This method should only be called from a rule in the Approval
   * Routing ruleset</b>.
   * @param user A user
   * @param group A group
   * @return <tt>false</tt> if the user or group is null or retired;
   *         <tt>true</tt> otherwise.
   */
  public boolean setApprovingUser(entity.User user, entity.Group group) {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).setApprovingUser(user, group);
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
   * Sets the value of the Documents field.
   */
  public void setDocuments(entity.TransactionSetDocument[] value) {
    __getInternalInterface().setFieldValue(DOCUMENTS_PROP.get(), value);
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
   * Sets the value of the RequestingUser field.
   */
  public void setRequestingUser(entity.User value) {
    __getInternalInterface().setFieldValue(REQUESTINGUSER_PROP.get(), value);
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
  private void setSubtype(typekey.TransactionSet value) {
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
   * Tests whether the user's authority limits force approval to be required for this TransactionSet.
   * During initial approval, RequestingUser may be null, in which case it checks the AuthorityLimits of the current user.
   * Note: After approving an approval activity, Approval Rules are run again. At that time, RequestingUser is still the
   * previous RequestingUser, not the last approving user. In most cases you'll want to have a line like
   * "TransactionSet.RequestingUser = TransactionSet.LastApprovingUser" in your rule before calling this method.
   * @return ApprovalResult indicating whether approval is needed and if so, the reasons why
   */
  public gw.plugin.approval.ApprovalResult testAuthorityLimits() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).testAuthorityLimits();
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
   * Executes new transaction validation rules on the supplied TransactionSet,
   * and returns a validation object containing any errors (if validation was
   * successful, an empty validation object is returned).
   * @return a ValidationResult containing 0 or more errors
   */
  public gw.api.validation.ValidationResult validate() {
    return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).validate();
  }
  
  static {
    com.guidewire._generated.entity.TransactionSetInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.TransactionSet, com.guidewire._generated.entity.TransactionSetInternal>() {
      public java.lang.Object getImplementation(entity.TransactionSet bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TransactionSetInternal getInternalInterface(entity.TransactionSet bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}