package entity;

/**
 * RecoverySet
 * A TransactionSet of one or more Recoveries created and submitted together for approval.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoverySet.eti;RecoverySet.eix;RecoverySet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RecoverySet")
public class RecoverySet extends entity.TransactionSet {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RecoverySet> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RecoverySet>("entity.RecoverySet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RECOVERIES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Recoveries");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public RecoverySet()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public RecoverySet(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RecoverySet(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.RecoverySetInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.RecoverySetInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.RecoverySetInternal)super.__getInternalInterface();
  }
  
  /**
   * Adds the given element to the Recoveries array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRecoveries(entity.Recovery element) {
    __getInternalInterface().addArrayElement(RECOVERIES_PROP.get(), element);
  }
  
  /**
   * Gets the value of the Recoveries field.
   * The recoveries in the set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Recovery[] getRecoveries() {
    return (entity.Recovery[])__getInternalInterface().getFieldValue(RECOVERIES_PROP.get());
  }
  
  /**
   * Creates a new Recovery with a status of draft, adds it to this RecoverySet and returns it. The ReserveLine of this
   * new Recovery is specified by the provided Exposure, CostType, CostCategory and ReservingCurrency. A NULL Exposure
   * indicates that this is a claim-level Recovery. Also, the Transaction Currency of the new Recovery will be set to the
   * same as Reserving Currency (or Claim Currency, if Reserving Currency is null).
   * @param exposure The Exposure of this new Recovery - can be NULL, in which case this will be a
   *                 claim-level Transaction
   * @param costType The CostType of this new Recovery - cannot be NULL.
   * @param costCategory The CostCategory of this new Recovery - cannot be NULL.
   * @param recoveryCategory The RecoveryCategory of this new Recovery - cannot be NULL.
   * @param reservingCurrency The Reserving Currency of this new Recovery - can be NULL (defaults to Claim Currency).
   * @return the new Recovery.
   */
  public entity.Recovery newRecovery(entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.Currency reservingCurrency) {
    return ((gw.cc.financials.recovery.entity.RecoverySet)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoverySet")).newRecovery(exposure, costType, costCategory, recoveryCategory, reservingCurrency);
  }
  
  /**
   * Saves a RecoverySet and returns the committed RecoverySet after optionally running the
   * pre-setup rules.  The RecoverySet should contain only one recovery.  Any recovery
   * line items with amount equal to zero will not be saved.
   * <p/>
   * Also submits the RecoverySet is for approval.  Note that currently the
   * approve engine automatically approves all RecoverySets.
   * <p/>
   * If the 'UseRecoveryReserves' parameter is true and the recovery amount
   * exceeds open recovery reserves, then an offsetting recovery reserve
   * will be created for the same exposure/costtype as the recovery.
   * For each recovery line item that exceeds open recovery reserves for that
   * cost category, a line item with the samecost category will be created for
   * the offsetting recovery reserve with an amount equal to the difference of
   * the line item amount and open recovery reserves (for the cost category).
   * @return an {@link gw.plugin.approval.ApprovalResult} representing the result of the approval submission
   */
  public gw.plugin.approval.ApprovalResult prepareForCommit() {
    return ((gw.cc.financials.recovery.entity.RecoverySet)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoverySet")).prepareForCommit();
  }
  
  /**
   * Removes the given element from the Recoveries array. This is achieved by marking the element for removal.
   */
  public void removeFromRecoveries(entity.Recovery element) {
    __getInternalInterface().removeArrayElement(RECOVERIES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Recoveries array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecoveries(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(RECOVERIES_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the Recoveries field.
   */
  public void setRecoveries(entity.Recovery[] value) {
    __getInternalInterface().setFieldValue(RECOVERIES_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RecoverySetInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RecoverySet.this.__getDelegateManager();
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
     * Adds the given element to the Recoveries array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRecoveries(entity.Recovery element) {
      __getInternalInterface().addArrayElement(RECOVERIES_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
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
    
    public void createOffsetRecoveryReserves() throws com.guidewire.pl.system.exception.WorkflowValidationException {
      ((com.guidewire.cc.domain.financials.recovery.impl.RecoverySetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.recovery.impl.RecoverySetInternal")).createOffsetRecoveryReserves();
    }
    
    public void delete() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).delete();
    }
    
    public void deleteApprovalActivities() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).deleteApprovalActivities();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
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
    
    public void executePostSetup() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).executePostSetup();
    }
    
    public void executePreSetup() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).executePreSetup();
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
    
    public com.guidewire.pl.system.approval.ApprovalHandler getApprovalHandler() {
      return ((com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods")).getApprovalHandler();
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
    
    public gw.plugin.approval.UserGroupPair getApprovingUser(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods")).getApprovingUser(userId);
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
    
    /**
     * Returns the sum total of all the transactions' claim amount in this set,
     * including dependent checks and offsetting reserves (where applicable).
     */
    public gw.api.financials.CurrencyAmount getClaimAmount() {
      return ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).getClaimAmount();
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
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
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
    
    public gw.api.financials.CurrencyAmount getLimitUsed(entity.AggregateLimit limit, boolean ignoreStatus, boolean testApplicable) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).getLimitUsed(limit, ignoreStatus, testApplicable);
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
     * Gets the value of the Recoveries field.
     * The recoveries in the set.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Recovery[] getRecoveries() {
      return (entity.Recovery[])__getInternalInterface().getFieldValue(RECOVERIES_PROP.get());
    }
    
    /**
     * Gets the value of the RequestingUser field.
     * The user submitting the object for approval
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getRequestingUser() {
      return (entity.User)__getInternalInterface().getFieldValue(REQUESTINGUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRequestingUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(REQUESTINGUSER_PROP.get());
    }
    
    public entity.ReserveLine[] getReserveLines() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).getReserveLines();
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
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
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
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    public boolean isRejected() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).isRejected();
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
    
    public boolean isUnapproved() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).isUnapproved();
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
    
    public void logDelete() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).logDelete();
    }
    
    public void logSave() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).logSave();
    }
    
    public void markAsApproved() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).markAsApproved();
    }
    
    public void markAsPendingApproval() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).markAsPendingApproval();
    }
    
    public void markAsRejected() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).markAsRejected();
    }
    
    /**
     * Creates a new Recovery with a status of draft, adds it to this RecoverySet and returns it. The ReserveLine of this
     * new Recovery is specified by the provided Exposure, CostType, CostCategory and ReservingCurrency. A NULL Exposure
     * indicates that this is a claim-level Recovery. Also, the Transaction Currency of the new Recovery will be set to the
     * same as Reserving Currency (or Claim Currency, if Reserving Currency is null).
     * @param exposure The Exposure of this new Recovery - can be NULL, in which case this will be a
     *                 claim-level Transaction
     * @param costType The CostType of this new Recovery - cannot be NULL.
     * @param costCategory The CostCategory of this new Recovery - cannot be NULL.
     * @param recoveryCategory The RecoveryCategory of this new Recovery - cannot be NULL.
     * @param reservingCurrency The Reserving Currency of this new Recovery - can be NULL (defaults to Claim Currency).
     * @return the new Recovery.
     */
    public entity.Recovery newRecovery(entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, typekey.RecoveryCategory recoveryCategory, typekey.Currency reservingCurrency) {
      return ((gw.cc.financials.recovery.entity.RecoverySet)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoverySet")).newRecovery(exposure, costType, costCategory, recoveryCategory, reservingCurrency);
    }
    
    public entity.Transaction newTransaction() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).newTransaction();
    }
    
    public entity.Transaction newTransaction(entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).newTransaction(exposure, costType, costCategory);
    }
    
    public entity.Transaction newTransaction(entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, typekey.Currency reservingCurrency) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).newTransaction(exposure, costType, costCategory, reservingCurrency);
    }
    
    public entity.Transaction newTransaction(gw.entity.IEntityType transactionType, entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory, typekey.Currency reservingCurrency, boolean setReserveLine) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).newTransaction(transactionType, exposure, costType, costCategory, reservingCurrency, setReserveLine);
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    /**
     * Saves a RecoverySet and returns the committed RecoverySet after optionally running the
     * pre-setup rules.  The RecoverySet should contain only one recovery.  Any recovery
     * line items with amount equal to zero will not be saved.
     * <p/>
     * Also submits the RecoverySet is for approval.  Note that currently the
     * approve engine automatically approves all RecoverySets.
     * <p/>
     * If the 'UseRecoveryReserves' parameter is true and the recovery amount
     * exceeds open recovery reserves, then an offsetting recovery reserve
     * will be created for the same exposure/costtype as the recovery.
     * For each recovery line item that exceeds open recovery reserves for that
     * cost category, a line item with the samecost category will be created for
     * the offsetting recovery reserve with an amount equal to the difference of
     * the line item amount and open recovery reserves (for the cost category).
     * @return an {@link gw.plugin.approval.ApprovalResult} representing the result of the approval submission
     */
    public gw.plugin.approval.ApprovalResult prepareForCommit() {
      return ((gw.cc.financials.recovery.entity.RecoverySet)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoverySet")).prepareForCommit();
    }
    
    public gw.plugin.approval.ApprovalResult prepareForSave(boolean runPreSetupRules) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.InsufficientPermissionException, com.guidewire.cc.system.exception.MultipleLineItemsNotAllowedException, com.guidewire.cc.system.exception.NoTransactionLineItemsException {
      return ((com.guidewire.cc.domain.financials.recovery.impl.RecoverySetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.recovery.impl.RecoverySetInternal")).prepareForSave(runPreSetupRules);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
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
    
    public void removeEmptyTransactions() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).removeEmptyTransactions();
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
     * Removes the given element from the Recoveries array. This is achieved by marking the element for removal.
     */
    public void removeFromRecoveries(entity.Recovery element) {
      __getInternalInterface().removeArrayElement(RECOVERIES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Recoveries array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRecoveries(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RECOVERIES_PROP.get(), elementID);
    }
    
    public void removeFromTransactions(entity.Transaction transaction) {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).removeFromTransactions(transaction);
    }
    
    /**
     * Remove the given Document from the set of Documents linked to this TransactionSet (if it is linked).
     * @param document 
     */
    public void removeLinkedDocument(entity.Document document) {
      ((gw.cc.financials.entity.TransactionSet)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionSet")).removeLinkedDocument(document);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
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
    
    public gw.plugin.approval.ApprovalResult requiresApproval(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods")).requiresApproval(userId);
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
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    public void setAsUnapproved() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).setAsUnapproved();
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
     * Sets the value of the Documents field.
     */
    public void setDocuments(entity.TransactionSetDocument[] value) {
      __getInternalInterface().setFieldValue(DOCUMENTS_PROP.get(), value);
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
     * Sets the value of the Recoveries field.
     */
    public void setRecoveries(entity.Recovery[] value) {
      __getInternalInterface().setFieldValue(RECOVERIES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RequestingUser field.
     */
    public void setRequestingUser(entity.User value) {
      __getInternalInterface().setFieldValue(REQUESTINGUSER_PROP.get(), value);
    }
    
    public void setRequestingUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(REQUESTINGUSER_PROP.get(), value);
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
    public void setSubtype(typekey.TransactionSet value) {
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
    
    public java.util.Collection<com.guidewire.cc.domain.financials.impl.SimulatedTAccountOwner> simulateTransitionsToNewState(typekey.TransactionLifeCycleState newState) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).simulateTransitionsToNewState(newState);
    }
    
    public java.util.List<? extends entity.TAccountOwnerDelegate> simulateTransitionsToNewState(typekey.TransactionLifeCycleState newState, java.util.List<? extends entity.TAccountOwnerDelegate> applicableCodings) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).simulateTransitionsToNewState(newState, applicableCodings);
    }
    
    public gw.plugin.approval.ApprovalResult submitForApproval() throws com.guidewire.pl.system.exception.WorkflowValidationException, com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.InsufficientPermissionException {
      return ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).submitForApproval();
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
    
    public void verifyHasAtMostOneRecovery() {
      ((com.guidewire.cc.domain.financials.recovery.impl.RecoverySetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.recovery.impl.RecoverySetInternal")).verifyHasAtMostOneRecovery();
    }
    
    public void verifyHasTransactions() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).verifyHasTransactions();
    }
    
    public void verifyStatusUnchanged() {
      ((com.guidewire.cc.domain.financials.impl.TransactionSetInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionSetInternal")).verifyStatusUnchanged();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.impl.TransactionSetInternal", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySetImpl");
    config.put("com.guidewire.cc.domain.financials.recovery.impl.RecoverySetInternal", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySetImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySetImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySetImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySetImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySetImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySetImpl");
    config.put("gw.cc.financials.entity.TransactionSet", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySetImpl");
    config.put("gw.cc.financials.recovery.entity.RecoverySet", "com.guidewire.cc.domain.financials.recovery.impl.RecoverySetImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RecoverySet.class, config);
    com.guidewire._generated.entity.RecoverySetInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RecoverySet, com.guidewire._generated.entity.RecoverySetInternal>() {
      public java.lang.Object getImplementation(entity.RecoverySet bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RecoverySetInternal getInternalInterface(entity.RecoverySet bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RecoverySet newEmptyInstance() {
        return new entity.RecoverySet((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}