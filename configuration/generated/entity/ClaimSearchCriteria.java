package entity;

/**
 * ClaimSearchCriteria
 * 
 *         Encapsulates the search criteria for a Claim search. The system does not store ClaimSearchCriteria entities,
 *         they are exist only for a search and are discarded after use.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimSearchCriteria.eti;ClaimSearchCriteria.eix;ClaimSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClaimSearchCriteria")
public class ClaimSearchCriteria extends entity.ClaimInfoCriteria implements java.io.Serializable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClaimSearchCriteria> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClaimSearchCriteria>("entity.ClaimSearchCriteria");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ARCHIVEDATECRITERIONCHOICE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ArchiveDateCriterionChoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDTOGROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedToGroup");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ASSIGNEDTOUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "AssignedToUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CATASTROPHE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Catastrophe");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMINDICATORCRITERION_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimIndicatorCriterion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CLAIMSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ClaimState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COVERAGEINQUESTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CoverageInQuestion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEDBYUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreatedByUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DATECRITERIONCHOICE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DateCriterionChoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FAULT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Fault");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> FINANCIALCRITERION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "FinancialCriterion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> FLAGGEDTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "FlaggedType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCIDENTREPORT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IncidentReport");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> JURISDICTIONSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "JurisdictionState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOBCODE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LOBCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LITIGATIONSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LitigationStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REINSURANCEREPORTABLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReinsuranceReportable");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LICENSEPLATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "licensePlate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PENDINGASSIGNMENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "pendingAssignment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VINNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "vinNumber");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClaimSearchCriteria()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClaimSearchCriteria(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClaimSearchCriteria(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.ClaimSearchCriteriaInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.ClaimSearchCriteriaInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.ClaimSearchCriteriaInternal)super.__getInternalInterface();
  }
  
  /**
   * Adds the given element to the ClaimIndicatorCriterion array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimIndicatorCriterion(entity.ClaimIndicatorCriterion element) {
    __getInternalInterface().addArrayElement(CLAIMINDICATORCRITERION_PROP.get(), element);
  }
  
  /**
   * Returns true if the search criteria allow searching archived Claims.
   * @return True if search criteria can search archived Claims
   */
  public boolean canSearchArchive() {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).canSearchArchive();
  }
  
  /**
   * Gets the value of the ArchiveDateCriterionChoice field.
   * Match claim by specific date criteria for archived claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateCriterionChoice getArchiveDateCriterionChoice() {
    return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(ARCHIVEDATECRITERIONCHOICE_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedToGroup field.
   * Match by claim group assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupSearchCriterion getAssignedToGroup() {
    return (entity.GroupSearchCriterion)__getInternalInterface().getFieldValue(ASSIGNEDTOGROUP_PROP.get());
  }
  
  /**
   * Gets the value of the AssignedToUser field.
   * Match by claim user assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedToUser() {
    return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDTOUSER_PROP.get());
  }
  
  /**
   * Gets the value of the Catastrophe field.
   * Match by catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe getCatastrophe() {
    return (entity.Catastrophe)__getInternalInterface().getFieldValue(CATASTROPHE_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimIndicatorCriterion field.
   * Match claim by specific claim indicator criteria
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicatorCriterion[] getClaimIndicatorCriterion() {
    return (entity.ClaimIndicatorCriterion[])__getInternalInterface().getFieldValue(CLAIMINDICATORCRITERION_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimState field.
   * Match by state of claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimState getClaimState() {
    return (typekey.ClaimState)__getInternalInterface().getFieldValue(CLAIMSTATE_PROP.get());
  }
  
  /**
   * Gets the value of the CreatedByUser field.
   * Match by claim creator.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreatedByUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEDBYUSER_PROP.get());
  }
  
  /**
   * Gets the value of the DateCriterionChoice field.
   * Match claim by specific date criteria.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateCriterionChoice getDateCriterionChoice() {
    return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(DATECRITERIONCHOICE_PROP.get());
  }
  
  /**
   * Gets the value of the Fault field.
   * Insured's probable percentage of fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFault() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FAULT_PROP.get());
  }
  
  /**
   * Gets the value of the FinancialCriterion field.
   * Match claim by specific financials criteria.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FinancialCriterionMC getFinancialCriterion() {
    return (entity.FinancialCriterionMC)__getInternalInterface().getFieldValue(FINANCIALCRITERION_PROP.get());
  }
  
  /**
   * Gets the value of the FlaggedType field.
   * Match by flagged status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FlaggedType getFlaggedType() {
    return (typekey.FlaggedType)__getInternalInterface().getFieldValue(FLAGGEDTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the JurisdictionState field.
   * Match by jurisdiction. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState() {
    return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(JURISDICTIONSTATE_PROP.get());
  }
  
  /**
   * Gets the value of the LOBCode field.
   * Match by line of business.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLOBCode() {
    return (typekey.LOBCode)__getInternalInterface().getFieldValue(LOBCODE_PROP.get());
  }
  
  /**
   * Gets the value of the LitigationStatus field.
   * Match by litigation status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LitigationStatus getLitigationStatus() {
    return (typekey.LitigationStatus)__getInternalInterface().getFieldValue(LITIGATIONSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the LossType field.
   * Match by loss type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType() {
    return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
  }
  
  /**
   */
  public gw.api.database.IQueryResult<? extends gw.pl.persistence.core.Bean, gw.api.database.QueryRow> getSummaryRow() {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).getSummaryRow();
  }
  
  /**
   * Gets the value of the licensePlate field.
   * Match by car license plate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getlicensePlate() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LICENSEPLATE_PROP.get());
  }
  
  /**
   * Gets the value of the vinNumber field.
   * Match by car VIN number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getvinNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VINNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the CoverageInQuestion field.
   * Match by coverage in question status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCoverageInQuestion() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(COVERAGEINQUESTION_PROP.get());
  }
  
  /**
   * Gets the value of the IncidentReport field.
   * Match by incident report.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncidentReport() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCIDENTREPORT_PROP.get());
  }
  
  /**
   * Gets the value of the ReinsuranceReportable field.
   * Match claims that are resinsurance reportable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReinsuranceReportable() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(REINSURANCEREPORTABLE_PROP.get());
  }
  
  /**
   * Gets the value of the pendingAssignment field.
   * Match claims that are pending assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean ispendingAssignment() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PENDINGASSIGNMENT_PROP.get());
  }
  
  /**
   * Returns a Claim query to find all claims that match this criteria.
   * When run, the resulting query will return {@link entity.Claim} entities.
   */
  public com.guidewire.pl.system.database.Query makeQuery() {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).makeQuery();
  }
  
  /**
   * Returns a Claim query to find all claims that match this criteria.
   * When run, the resulting query will return {@link entity.ClaimSearchView}
   * entities.
   */
  public com.guidewire.pl.system.database.Query makeViewQuery() {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).makeViewQuery();
  }
  
  /**
   * Performs the search based on the criteria that have been established.
   * @return A QueryProcessorWithSummaryQuery containing the results of the query, including the appropriate summary row
   */
  public gw.api.search.ClaimSearchResults performAdvancedSearch() {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performAdvancedSearch();
  }
  
  /**
   * Performs the search based on the criteria that have been established.
   * @return A ClaimSearchResults containing the results of the query, without any summary row
   */
  public gw.api.search.ClaimSearchResults performAdvancedSearchWithoutSummary() {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performAdvancedSearchWithoutSummary();
  }
  
  /**
   * Performs the search based on the criteria that have been established.
   * @param searchArchive 
   * @return A FreeTextClaimSearchResults containing the results of the query, without any summary row
   */
  public gw.api.search.FreeTextClaimSearchResults performFreeTextSearch(boolean searchArchive) {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performFreeTextSearch(searchArchive);
  }
  
  /**
   * Performs the search based on the criteria that have been established.
   * @return the results of the query, including the appropriate summary row
   * @deprecated This method has been deprecated in ClaimCenter v5.0.  Use performAdvancedSearch() instead
   */
  @gw.lang.Deprecated(value = "This method has been deprecated in ClaimCenter v5.0.  Use performAdvancedSearch() instead")
  public gw.api.database.StandardQueryBeanResultWithSummary<gw.pl.persistence.core.Bean> performSearch() {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performSearch();
  }
  
  /**
   * Performs the simple claim search based on the criteria that have been established.
   * @return A QueryProcessorWithSummaryQuery containing the results of the query, including the appropriate summary row
   */
  public gw.api.database.StandardQueryBeanResultWithSummary<gw.pl.persistence.core.Bean> performSimpleSearch() {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performSimpleSearch();
  }
  
  /**
   * Performs the simple claim search based on the criteria that have been established.
   * @return A QueryProcessor containing the results of the query, without any summary row
   */
  public gw.api.database.IQueryBeanResult<entity.ClaimSearchView> performSimpleSearchWithoutSummary() {
    return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performSimpleSearchWithoutSummary();
  }
  
  /**
   * Removes the given element from the ClaimIndicatorCriterion array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimIndicatorCriterion(entity.ClaimIndicatorCriterion element) {
    __getInternalInterface().removeArrayElement(CLAIMINDICATORCRITERION_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimIndicatorCriterion array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimIndicatorCriterion(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMINDICATORCRITERION_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the ArchiveDateCriterionChoice field.
   */
  public void setArchiveDateCriterionChoice(entity.DateCriterionChoice value) {
    __getInternalInterface().setFieldValue(ARCHIVEDATECRITERIONCHOICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedToGroup field.
   */
  public void setAssignedToGroup(entity.GroupSearchCriterion value) {
    __getInternalInterface().setFieldValue(ASSIGNEDTOGROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignedToUser field.
   */
  public void setAssignedToUser(entity.User value) {
    __getInternalInterface().setFieldValue(ASSIGNEDTOUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Catastrophe field.
   */
  public void setCatastrophe(entity.Catastrophe value) {
    __getInternalInterface().setFieldValue(CATASTROPHE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimIndicatorCriterion field.
   */
  public void setClaimIndicatorCriterion(entity.ClaimIndicatorCriterion[] value) {
    __getInternalInterface().setFieldValue(CLAIMINDICATORCRITERION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimState field.
   */
  public void setClaimState(typekey.ClaimState value) {
    __getInternalInterface().setFieldValue(CLAIMSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CoverageInQuestion field.
   */
  public void setCoverageInQuestion(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(COVERAGEINQUESTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreatedByUser field.
   */
  public void setCreatedByUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEDBYUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateCriterionChoice field.
   */
  public void setDateCriterionChoice(entity.DateCriterionChoice value) {
    __getInternalInterface().setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Fault field.
   */
  public void setFault(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(FAULT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FinancialCriterion field.
   */
  public void setFinancialCriterion(entity.FinancialCriterionMC value) {
    __getInternalInterface().setFieldValue(FINANCIALCRITERION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FlaggedType field.
   */
  public void setFlaggedType(typekey.FlaggedType value) {
    __getInternalInterface().setFieldValue(FLAGGEDTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IncidentReport field.
   */
  public void setIncidentReport(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INCIDENTREPORT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value) {
    __getInternalInterface().setFieldValue(JURISDICTIONSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LOBCode field.
   */
  public void setLOBCode(typekey.LOBCode value) {
    __getInternalInterface().setFieldValue(LOBCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LitigationStatus field.
   */
  public void setLitigationStatus(typekey.LitigationStatus value) {
    __getInternalInterface().setFieldValue(LITIGATIONSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value) {
    __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReinsuranceReportable field.
   */
  public void setReinsuranceReportable(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(REINSURANCEREPORTABLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the licensePlate field.
   */
  public void setlicensePlate(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LICENSEPLATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the pendingAssignment field.
   */
  public void setpendingAssignment(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PENDINGASSIGNMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the vinNumber field.
   */
  public void setvinNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VINNUMBER_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClaimSearchCriteriaInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClaimSearchCriteria.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the ClaimIndicatorCriterion array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimIndicatorCriterion(entity.ClaimIndicatorCriterion element) {
      __getInternalInterface().addArrayElement(CLAIMINDICATORCRITERION_PROP.get(), element);
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
    
    /**
     * Returns true if the search criteria allow searching archived Claims.
     * @return True if search criteria can search archived Claims
     */
    public boolean canSearchArchive() {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).canSearchArchive();
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
     * Gets the value of the AddressCriteria field.
     * Set of criteria to match by address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getAddressCriteria() {
      return (entity.Address)__getInternalInterface().getFieldValue(ADDRESSCRITERIA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAddressCriteriaID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ADDRESSCRITERIA_PROP.get());
    }
    
    /**
     * Gets the value of the ArchiveDateCriterionChoice field.
     * Match claim by specific date criteria for archived claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateCriterionChoice getArchiveDateCriterionChoice() {
      return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(ARCHIVEDATECRITERIONCHOICE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getArchiveDateCriterionChoiceID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ARCHIVEDATECRITERIONCHOICE_PROP.get());
    }
    
    /**
     * Get the number of archived claims
     * @return 
     * @deprecated Use gw.cc.claim.archiving.entity.ClaimInfoCriteria#hasArchivedClaims() instead.
     */
    public int getArchivedCount() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).getArchivedCount();
    }
    
    /**
     * Gets the value of the AssignedToGroup field.
     * Match by claim group assignment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.GroupSearchCriterion getAssignedToGroup() {
      return (entity.GroupSearchCriterion)__getInternalInterface().getFieldValue(ASSIGNEDTOGROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedToGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDTOGROUP_PROP.get());
    }
    
    /**
     * Gets the value of the AssignedToUser field.
     * Match by claim user assignment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getAssignedToUser() {
      return (entity.User)__getInternalInterface().getFieldValue(ASSIGNEDTOUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAssignedToUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ASSIGNEDTOUSER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Catastrophe field.
     * Match by catastrophe.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Catastrophe getCatastrophe() {
      return (entity.Catastrophe)__getInternalInterface().getFieldValue(CATASTROPHE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCatastropheID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CATASTROPHE_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimIndicatorCriterion field.
     * Match claim by specific claim indicator criteria
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimIndicatorCriterion[] getClaimIndicatorCriterion() {
      return (entity.ClaimIndicatorCriterion[])__getInternalInterface().getFieldValue(CLAIMINDICATORCRITERION_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     * Match by claim number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CLAIMNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimSearchType field.
     * The type of claim search to perform.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimSearchType getClaimSearchType() {
      return (typekey.ClaimSearchType)__getInternalInterface().getFieldValue(CLAIMSEARCHTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimState field.
     * Match by state of claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimState getClaimState() {
      return (typekey.ClaimState)__getInternalInterface().getFieldValue(CLAIMSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the CreatedByUser field.
     * Match by claim creator.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreatedByUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEDBYUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreatedByUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEDBYUSER_PROP.get());
    }
    
    /**
     * Gets the value of the DateCriterionChoice field.
     * Match claim by specific date criteria.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateCriterionChoice getDateCriterionChoice() {
      return (entity.DateCriterionChoice)__getInternalInterface().getFieldValue(DATECRITERIONCHOICE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDateCriterionChoiceID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DATECRITERIONCHOICE_PROP.get());
    }
    
    /**
     * Gets the value of the Fault field.
     * Insured's probable percentage of fault.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getFault() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(FAULT_PROP.get());
    }
    
    /**
     * Gets the value of the FinancialCriterion field.
     * Match claim by specific financials criteria.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.FinancialCriterionMC getFinancialCriterion() {
      return (entity.FinancialCriterionMC)__getInternalInterface().getFieldValue(FINANCIALCRITERION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getFinancialCriterionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(FINANCIALCRITERION_PROP.get());
    }
    
    /**
     * Gets the value of the FlaggedType field.
     * Match by flagged status.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FlaggedType getFlaggedType() {
      return (typekey.FlaggedType)__getInternalInterface().getFieldValue(FLAGGEDTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the FreeTextClaimSearchType field.
     * The type of claim search to perform.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FreeTextClaimSearchType getFreeTextClaimSearchType() {
      return (typekey.FreeTextClaimSearchType)__getInternalInterface().getFieldValue(FREETEXTCLAIMSEARCHTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the FreeTextNameSearchType field.
     * Type of name search for claim search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.FreTxtClmSrchNameSrchTyp getFreeTextNameSearchType() {
      return (typekey.FreTxtClmSrchNameSrchTyp)__getInternalInterface().getFieldValue(FREETEXTNAMESEARCHTYPE_PROP.get());
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
     * Gets the value of the JurisdictionState field.
     * Match by jurisdiction. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Jurisdiction getJurisdictionState() {
      return (typekey.Jurisdiction)__getInternalInterface().getFieldValue(JURISDICTIONSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the LOBCode field.
     * Match by line of business.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LOBCode getLOBCode() {
      return (typekey.LOBCode)__getInternalInterface().getFieldValue(LOBCODE_PROP.get());
    }
    
    /**
     * Gets the value of the LitigationStatus field.
     * Match by litigation status.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LitigationStatus getLitigationStatus() {
      return (typekey.LitigationStatus)__getInternalInterface().getFieldValue(LITIGATIONSTATUS_PROP.get());
    }
    
    /**
     * Gets the value of the LossType field.
     * Match by loss type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossType getLossType() {
      return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the NameCriteria field.
     * Set of criteria to match by name.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CCNameCriteria getNameCriteria() {
      return (entity.CCNameCriteria)__getInternalInterface().getFieldValue(NAMECRITERIA_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getNameCriteriaID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(NAMECRITERIA_PROP.get());
    }
    
    /**
     * Gets the value of the NameSearchType field.
     * Type of name search for claim search.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimSearchNameSearchType getNameSearchType() {
      return (typekey.ClaimSearchNameSearchType)__getInternalInterface().getFieldValue(NAMESEARCHTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     * Match by policy number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ClaimInfoCriteria getSubtype() {
      return (typekey.ClaimInfoCriteria)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     */
    public gw.api.database.IQueryResult<? extends gw.pl.persistence.core.Bean, gw.api.database.QueryRow> getSummaryRow() {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).getSummaryRow();
    }
    
    /**
     * Gets the value of the UCR_Ext field.
     * A Unique Claim Reference (UCR) Number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUCR_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UCR_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the UMR_Ext field.
     * A Unique Market Reference (UMR) Number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUMR_Ext() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UMR_EXT_PROP.get());
    }
    
    /**
     * Gets the value of the licensePlate field.
     * Match by car license plate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getlicensePlate() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LICENSEPLATE_PROP.get());
    }
    
    /**
     * Gets the value of the vinNumber field.
     * Match by car VIN number.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getvinNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VINNUMBER_PROP.get());
    }
    
    /**
     * 
     * @return true if there are archived claims that match the search criteria
     */
    public boolean hasArchivedClaims() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).hasArchivedClaims();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * 
     * @return true if the claim search is for live claims only.
     */
    public boolean isActiveSearch() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).isActiveSearch();
    }
    
    /**
     * 
     * @return true if the claim search is for archived claims only.
     */
    public boolean isArchivedSearch() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).isArchivedSearch();
    }
    
    /**
     * Gets the value of the CoverageInQuestion field.
     * Match by coverage in question status.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCoverageInQuestion() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(COVERAGEINQUESTION_PROP.get());
    }
    
    /**
     * Gets the value of the IncidentReport field.
     * Match by incident report.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncidentReport() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCIDENTREPORT_PROP.get());
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
     * Gets the value of the ReinsuranceReportable field.
     * Match claims that are resinsurance reportable.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isReinsuranceReportable() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(REINSURANCEREPORTABLE_PROP.get());
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the pendingAssignment field.
     * Match claims that are pending assignment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean ispendingAssignment() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PENDINGASSIGNMENT_PROP.get());
    }
    
    /**
     * Returns a Claim query to find all claims that match this criteria.
     * When run, the resulting query will return {@link entity.Claim} entities.
     */
    public com.guidewire.pl.system.database.Query makeQuery() {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).makeQuery();
    }
    
    /**
     * Returns a Claim query to find all claims that match this criteria.
     * When run, the resulting query will return {@link entity.ClaimSearchView}
     * entities.
     */
    public com.guidewire.pl.system.database.Query makeViewQuery() {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).makeViewQuery();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    /**
     * Performs the search based on the criteria that have been established.
     * @return A QueryProcessorWithSummaryQuery containing the results of the query, including the appropriate summary row
     */
    public gw.api.search.ClaimSearchResults performAdvancedSearch() {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performAdvancedSearch();
    }
    
    /**
     * Performs the search based on the criteria that have been established.
     * @return A ClaimSearchResults containing the results of the query, without any summary row
     */
    public gw.api.search.ClaimSearchResults performAdvancedSearchWithoutSummary() {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performAdvancedSearchWithoutSummary();
    }
    
    /**
     * Performs the search based on the criteria that have been established.
     * @param searchArchive 
     * @return A FreeTextClaimSearchResults containing the results of the query, without any summary row
     */
    public gw.api.search.FreeTextClaimSearchResults performFreeTextSearch(boolean searchArchive) {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performFreeTextSearch(searchArchive);
    }
    
    /**
     * Performs the search based on the criteria that have been established.
     * @return A QueryProcessorWithSummaryQuery containing the results of the query, including the appropriate summary row
     */
    public gw.api.database.StandardQueryBeanResultWithSummary<gw.pl.persistence.core.Bean> performInfoSearch() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).performInfoSearch();
    }
    
    /**
     * Performs the search based on the criteria that have been established.
     * @return A QueryProcessor containing the results of the query, without any summary row
     */
    public gw.api.database.IQueryBeanResult<entity.ClaimInfoSearchView> performInfoSearchWithoutSummary() {
      return ((gw.cc.claim.archiving.entity.ClaimInfoCriteria)__getDelegateManager().getImplementation("gw.cc.claim.archiving.entity.ClaimInfoCriteria")).performInfoSearchWithoutSummary();
    }
    
    /**
     * Performs the search based on the criteria that have been established.
     * @return the results of the query, including the appropriate summary row
     * @deprecated This method has been deprecated in ClaimCenter v5.0.  Use performAdvancedSearch() instead
     */
    @gw.lang.Deprecated(value = "This method has been deprecated in ClaimCenter v5.0.  Use performAdvancedSearch() instead")
    public gw.api.database.StandardQueryBeanResultWithSummary<gw.pl.persistence.core.Bean> performSearch() {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performSearch();
    }
    
    /**
     * Performs the simple claim search based on the criteria that have been established.
     * @return A QueryProcessorWithSummaryQuery containing the results of the query, including the appropriate summary row
     */
    public gw.api.database.StandardQueryBeanResultWithSummary<gw.pl.persistence.core.Bean> performSimpleSearch() {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performSimpleSearch();
    }
    
    /**
     * Performs the simple claim search based on the criteria that have been established.
     * @return A QueryProcessor containing the results of the query, without any summary row
     */
    public gw.api.database.IQueryBeanResult<entity.ClaimSearchView> performSimpleSearchWithoutSummary() {
      return ((gw.cc.claim.entity.ClaimSearchCriteria)__getDelegateManager().getImplementation("gw.cc.claim.entity.ClaimSearchCriteria")).performSimpleSearchWithoutSummary();
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
     * Removes the given element from the ClaimIndicatorCriterion array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimIndicatorCriterion(entity.ClaimIndicatorCriterion element) {
      __getInternalInterface().removeArrayElement(CLAIMINDICATORCRITERION_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimIndicatorCriterion array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimIndicatorCriterion(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMINDICATORCRITERION_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AddressCriteria field.
     */
    public void setAddressCriteria(entity.Address value) {
      __getInternalInterface().setFieldValue(ADDRESSCRITERIA_PROP.get(), value);
    }
    
    public void setAddressCriteriaID(gw.pl.persistence.core.Key value) {
      setFieldValue(ADDRESSCRITERIA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchiveDateCriterionChoice field.
     */
    public void setArchiveDateCriterionChoice(entity.DateCriterionChoice value) {
      __getInternalInterface().setFieldValue(ARCHIVEDATECRITERIONCHOICE_PROP.get(), value);
    }
    
    public void setArchiveDateCriterionChoiceID(gw.pl.persistence.core.Key value) {
      setFieldValue(ARCHIVEDATECRITERIONCHOICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedToGroup field.
     */
    public void setAssignedToGroup(entity.GroupSearchCriterion value) {
      __getInternalInterface().setFieldValue(ASSIGNEDTOGROUP_PROP.get(), value);
    }
    
    public void setAssignedToGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(ASSIGNEDTOGROUP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignedToUser field.
     */
    public void setAssignedToUser(entity.User value) {
      __getInternalInterface().setFieldValue(ASSIGNEDTOUSER_PROP.get(), value);
    }
    
    public void setAssignedToUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(ASSIGNEDTOUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Catastrophe field.
     */
    public void setCatastrophe(entity.Catastrophe value) {
      __getInternalInterface().setFieldValue(CATASTROPHE_PROP.get(), value);
    }
    
    public void setCatastropheID(gw.pl.persistence.core.Key value) {
      setFieldValue(CATASTROPHE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimIndicatorCriterion field.
     */
    public void setClaimIndicatorCriterion(entity.ClaimIndicatorCriterion[] value) {
      __getInternalInterface().setFieldValue(CLAIMINDICATORCRITERION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimSearchType field.
     */
    public void setClaimSearchType(typekey.ClaimSearchType value) {
      __getInternalInterface().setFieldValue(CLAIMSEARCHTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimState field.
     */
    public void setClaimState(typekey.ClaimState value) {
      __getInternalInterface().setFieldValue(CLAIMSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CoverageInQuestion field.
     */
    public void setCoverageInQuestion(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(COVERAGEINQUESTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreatedByUser field.
     */
    public void setCreatedByUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEDBYUSER_PROP.get(), value);
    }
    
    public void setCreatedByUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEDBYUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateCriterionChoice field.
     */
    public void setDateCriterionChoice(entity.DateCriterionChoice value) {
      __getInternalInterface().setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
    }
    
    public void setDateCriterionChoiceID(gw.pl.persistence.core.Key value) {
      setFieldValue(DATECRITERIONCHOICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Fault field.
     */
    public void setFault(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(FAULT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FinancialCriterion field.
     */
    public void setFinancialCriterion(entity.FinancialCriterionMC value) {
      __getInternalInterface().setFieldValue(FINANCIALCRITERION_PROP.get(), value);
    }
    
    public void setFinancialCriterionID(gw.pl.persistence.core.Key value) {
      setFieldValue(FINANCIALCRITERION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FlaggedType field.
     */
    public void setFlaggedType(typekey.FlaggedType value) {
      __getInternalInterface().setFieldValue(FLAGGEDTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FreeTextClaimSearchType field.
     */
    public void setFreeTextClaimSearchType(typekey.FreeTextClaimSearchType value) {
      __getInternalInterface().setFieldValue(FREETEXTCLAIMSEARCHTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FreeTextNameSearchType field.
     */
    public void setFreeTextNameSearchType(typekey.FreTxtClmSrchNameSrchTyp value) {
      __getInternalInterface().setFieldValue(FREETEXTNAMESEARCHTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IncidentReport field.
     */
    public void setIncidentReport(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCIDENTREPORT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the JurisdictionState field.
     */
    public void setJurisdictionState(typekey.Jurisdiction value) {
      __getInternalInterface().setFieldValue(JURISDICTIONSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LOBCode field.
     */
    public void setLOBCode(typekey.LOBCode value) {
      __getInternalInterface().setFieldValue(LOBCODE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LitigationStatus field.
     */
    public void setLitigationStatus(typekey.LitigationStatus value) {
      __getInternalInterface().setFieldValue(LITIGATIONSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossType field.
     */
    public void setLossType(typekey.LossType value) {
      __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NameCriteria field.
     */
    public void setNameCriteria(entity.CCNameCriteria value) {
      __getInternalInterface().setFieldValue(NAMECRITERIA_PROP.get(), value);
    }
    
    public void setNameCriteriaID(gw.pl.persistence.core.Key value) {
      setFieldValue(NAMECRITERIA_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NameSearchType field.
     */
    public void setNameSearchType(typekey.ClaimSearchNameSearchType value) {
      __getInternalInterface().setFieldValue(NAMESEARCHTYPE_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReinsuranceReportable field.
     */
    public void setReinsuranceReportable(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(REINSURANCEREPORTABLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ClaimInfoCriteria value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UCR_Ext field.
     */
    public void setUCR_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UCR_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UMR_Ext field.
     */
    public void setUMR_Ext(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UMR_EXT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the licensePlate field.
     */
    public void setlicensePlate(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LICENSEPLATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the pendingAssignment field.
     */
    public void setpendingAssignment(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PENDINGASSIGNMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the vinNumber field.
     */
    public void setvinNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VINNUMBER_PROP.get(), value);
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
    config.put("gw.cc.claim.archiving.entity.ClaimInfoCriteria", "com.guidewire.cc.domain.claim.impl.ClaimSearchCriteriaImpl");
    config.put("gw.cc.claim.entity.ClaimSearchCriteria", "com.guidewire.cc.domain.claim.impl.ClaimSearchCriteriaImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.io.Serializable", "com.guidewire.cc.domain.claim.impl.ClaimSearchCriteriaImpl");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClaimSearchCriteria.class, config);
    com.guidewire._generated.entity.ClaimSearchCriteriaInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClaimSearchCriteria, com.guidewire._generated.entity.ClaimSearchCriteriaInternal>() {
      public java.lang.Object getImplementation(entity.ClaimSearchCriteria bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClaimSearchCriteriaInternal getInternalInterface(entity.ClaimSearchCriteria bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClaimSearchCriteria newEmptyInstance() {
        return new entity.ClaimSearchCriteria((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}