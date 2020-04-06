package entity;

/**
 * EffDatedBranch
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EffDatedBranch.eti;EffDatedBranch.eix;EffDatedBranch.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface EffDatedBranch extends entity.EffDatedBase, entity.Retireable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.EffDatedBranch> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.EffDatedBranch>("entity.EffDatedBranch");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ALLOWGAPSBEFORE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AllowGapsBefore", "AllowGapsBefore");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BASEDONDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("BasedOnDate", "BasedOnDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CANCELLATIONDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CancellationDate", "CancellationDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EDITEFFECTIVEDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("EditEffectiveDate", "EditEffectiveDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTUREPERIODS_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("FuturePeriods", "FuturePeriods");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCKED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Locked", "Locked");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MODELDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ModelDate", "ModelDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MODELNUMBER_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ModelNumber", "ModelNumber");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MODELNUMBERINDEX_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ModelNumberIndex", "ModelNumberIndex");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MOSTRECENTMODEL_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("MostRecentModel", "MostRecentModel");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MOSTRECENTMODELINDEX_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("MostRecentModelIndex", "MostRecentModelIndex");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERIODEND_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PeriodEnd", "PeriodEnd");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERIODSTART_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PeriodStart", "PeriodStart");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PREEMPTED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Preempted", "Preempted");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TEMPORARYBRANCH_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("TemporaryBranch", "TemporaryBranch");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ALLOW_GAPS_BEFORE_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.ALLOW_GAPS_BEFORE_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> BASEDONID_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBasePublicMethods.BASEDONID_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BASEDON_DATE_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.BASEDON_DATE_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EDIT_EFFECTIVEDATE_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.EDIT_EFFECTIVEDATE_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FUTURE_PERIODS_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.FUTURE_PERIODS_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MODELNUMBER_INDEX_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.MODELNUMBER_INDEX_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MOST_RECENT_MODEL_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.MOST_RECENT_MODEL_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MOST_RECENT_MODEL_INDEX_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.MOST_RECENT_MODEL_INDEX_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PERIODID_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.PERIODID_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERIOD_END_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.PERIOD_END_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERIOD_START_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.PERIOD_START_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TEMPORARY_BRANCH_DYNPROP = com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch.TEMPORARY_BRANCH_DYNPROP;
  
  /**
   * Clear notification that a future bound period existed when this branch was
   * promoted.
   */
  public void clearResolveWithFuturePeriods();
  
  
  public entity.EffDatedBranch createNewBranchForPreemption();
  
  
  /**
   * Returns a sorted list of distinct effective and expiration dates that
   * exist on EffDated beans in the branch.
   * <p/>
   * Looking at every effective and expiration date of every bean in the branch to build
   * this list is expensive. Call this once then cache the result if you know
   * that the beans won't change while you use this information.
   * @return A sorted list of distinct effective and expiration dates that
   *         exists in the branch.
   */
  public java.util.List<java.util.Date> getAllEffectiveDates();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBasedOnDate();
  
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public java.lang.Integer getBeanVersion();
  
  
  /**
   * Gets the value of the CancellationDate field.
   * Date this period was canceled, or null if still active
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCancellationDate();
  
  
  /**
   * Gets the ID of the container to which this branch belongs.
   */
  public gw.pl.persistence.core.Key getContainerId();
  
  
  /**
   * Gets the container to which this branch belongs.
   */
  public entity.EffDatedContainer getContainerUntyped();
  
  
  /**
   * Gets the value of the EditEffectiveDate field.
   * Dates edits are effective
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEditEffectiveDate();
  
  
  /**
   * Get an effective date independent key for this bean. This key will include
   * the BranchId and the FixedId. This is the key for the "logical" bean.
   * <p/>
   * An EffDatedKey only really applies to EffDateds as an EffDatedBranch is
   * the same throughout its effective range (or its period range) so there is
   * no difference between the "logical" bean and the actual bean.
   */
  public gw.pl.persistence.core.effdate.EffDatedKey getEffDatedKey();
  
  
  /**
   * Get factory used to produce branch related error messages.
   * @return Factory used to produce branch related error messages.
   */
  public com.guidewire.commons.entity.effdate.EffDatedErrorMessageFactory getErrorMessageFactory();
  
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public gw.pl.persistence.core.Key getID();
  
  
  /**
   * Get the version list for an effective dated foreign key.  You need this
   * method because it's the only way to get the version list for a foreign key
   * bean if you're in window mode. You can't call this.getFKBean().getVersionListUntyped()
   * since you can't traverse the array and there are no methods on
   * EffDatedVersionList to access a FK (only arrays).
   * <p/>
   * This bean can be unsliced or sliced when this is called.
   * @param link Effective dated foreign key
   * @return Version list for an effective dated foreign key
   */
  public gw.pl.persistence.core.effdate.EffDatedVersionList getLinkVersionList(gw.entity.ILinkPropertyInfo link);
  
  
  /**
   * Gets the value of the ModelDate field.
   * Date corresponding to the model number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getModelDate();
  
  
  /**
   * Gets the value of the ModelNumber field.
   * Modelnumber.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getModelNumber();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getModelNumberIndex();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMostRecentModelIndex();
  
  
  /**
   * Returns the periods that overlap this period using the given period start
   * and end dates.
   * @param periodStart Date to use for period start (ignored the current
   *                          period start of this branch)
   * @param periodEndOrCancel Date to use for period end (ignored the current
   *                          period end of this branch)
   * @return List of bound periods that overlap
   */
  public java.util.List<entity.EffDatedBranch> getOverlappingBoundPeriods(java.util.Date periodStart, java.util.Date periodEndOrCancel);
  
  
  /**
   * Gets the value of the PeriodEnd field.
   * Upper bound of all expiration dates of this root
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPeriodEnd();
  
  
  /**
   * Every branch belongs to a period, identified by its PeriodId. When a new
   * submission or renewal is created the new branch is assigned a new PeriodId.
   * When a new branch is created in the same period as another branch (e.g. a
   * policy change) it shares the "based on" or "original" branch's PeriodId. A
   * period often has several branches associated with it, both promoted and in
   * draft, but will have only one "most recent" or "in-force" branch associated
   * with it. This in-force branch is the most recently promoted branch
   * associated with a period. The other promoted branches represent earlier
   * versions of the in-force branch in model-time. Often when we refer to the
   * "period" we're actually referring to the most recently bound branch in a
   * period, ignoring the other, "older" branches that are also associated with
   * the period.
   * <p/>
   * To find all the branches associated with a period find all branches with
   * the same PeriodId.
   * @return Period Id of this branch.
   */
  public gw.pl.persistence.core.Key getPeriodId();
  
  
  /**
   * Gets the value of the PeriodStart field.
   * Lower bound of all effective dates of this root
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPeriodStart();
  
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public java.lang.String getPublicID();
  
  
  /**
   * Date which this bean is "sliced" or viewed. If you traverse from this bean
   * to another bean or beans via a link or array, only beans that are effective
   * at this slice date will be returned. The beans that are returned will be
   * sliced at this date as well. If NULL then the bean is in "window" mode.
   * <p/>
   * In most cases a bean will be sliced, window mode is used in special cases.
   * @return Date which bean is sliced or null if in window mode.
   */
  public java.util.Date getSliceDate();
  
  
  /**
   * Slice this bean at a particular date. This bean can be unsliced or sliced
   * when this method is called. The slice date must be within the effective
   * range of this bean or an exception will be thrown. If you want to get at
   * the version of this "logical" bean at a date outside of this particular
   * bean's effective range then use this.getVersionListUntyped().getVersionAsOf(sliceDate).getSliceUntyped(sliceDate).
   * @param sliceDate Date at which to slice this bean.
   * @return Sliced version of the bean.
   */
  public entity.EffDatedBase getSliceUntyped(java.util.Date sliceDate);
  
  
  /**
   * Get the version list for this bean. An EffDatedVersionList is a
   * representation of a logical bean through its effective range. For example,
   * if a bean has changes at three separate effective dates then the version
   * list will comprise 3 versions of the bean, one for each of these dates.
   * <p/>
   * You can use an EffDatedVersionList to traverse from this bean to other
   * linked beans in window mode. Recall that in window mode you cannot traverse
   * links directly from the bean.
   * <p/>
   * Although an EffDatedBranch only has a single version throughout its
   * effective range you can still get its EffDatedVersionList in order to
   * navigate in window mode from the branch to its related EffDateds.
   * @return Version list for this bean
   */
  public gw.pl.persistence.core.effdate.EffDatedVersionList getVersionListUntyped();
  
  
  /**
   * Check if there would be a gap after his period using the given period start
   * and end dates and the existing bound periods.
   * @param periodStart Date to use for period start (ignored the current period
   *                    start of this branch)
   * @param periodEnd Date to use for period end (ignored the current period
   *                    end of this branch)
   * @return True if a gap exists between this period and the period after it
   */
  public boolean hasGapAfter(java.util.Date periodStart, java.util.Date periodEnd);
  
  
  /**
   * Check if there would be a gap before his period using the given period
   * start and end dates and the existing bound periods.
   * @param periodStart Date to use for period start (ignored the current period
   *                    start of this branch)
   * @param periodEnd Date to use for period end (ignored the current period
   *                    end of this branch)
   * @return True if a gap exists between this period and the period before it
   */
  public boolean hasGapBefore(java.util.Date periodStart, java.util.Date periodEnd);
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAllowGapsBefore();
  
  
  /**
   * Is this branch canceled?
   * @return True if this period is canceled (CancellationDate is non-null) or
   *         false if the period is not canceled (CancellationDate is null).
   */
  public boolean isCanceled();
  
  
  /**
   * Given a date, check whether it falls within this bean's effective window.
   * @param effDate Date to check
   * @return True if date is within this bean's effective window.
   */
  public boolean isEffective(java.util.Date effDate);
  
  
  /**
   * Gets the value of the FuturePeriods field.
   * True if when bound this branch had future bound periods
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFuturePeriods();
  
  
  /**
   * Gets the value of the Locked field.
   * True if this row has been locked (cannot be edited)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLocked();
  
  
  /**
   * Gets the value of the MostRecentModel field.
   * True if this branch is the most recent model (has the highest model number)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMostRecentModel();
  
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew();
  
  
  /**
   * Returns true is this branch represents a new period that is not a new
   * submission.
   * @return True is this branch represents a new period that is not a new
   *         submission.
   */
  public boolean isNewPeriod();
  
  
  /**
   * Returns true if this branch represents a new submission.
   * @return True if this branch represents a new submission.
   */
  public boolean isNewSubmission();
  
  
  /**
   * Checks if there would be an overlap between the existing bound periods and
   * this period using the given period start and end dates.
   * @param periodStart Date to use for period start (ignored the current period
   *                    start of this branch)
   * @param periodEnd Date to use for period end (ignored the current period
   *                    end of this branch)
   * @return True if an overlap would exist
   */
  public boolean isOverlappingBoundPeriods(java.util.Date periodStart, java.util.Date periodEnd);
  
  
  /**
   * Gets the value of the Preempted field.
   * True if when bound this branch has been preempted
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPreempted();
  
  
  /**
   * Check if this bean or branch has been promoted. A promoted bean is also
   * locked and cannot be changed.
   * <p/>
   * An EffDated is never promoted independent of its related
   * EffDatedBranch, meaning if the branch is promoted every bean in the graph
   * will be promoted, and if the branch is not promoted no bean in the graph
   * can be promoted.
   * @return True if promoted.
   */
  public boolean isPromoted();
  
  
  /**
   * When a branch is promoted and there exists a future bound period (or
   * periods, but multiple would be rare) then this method returns true until it
   * is cleared.
   * <p/>
   * This value can then be checked later to see if you want to apply the
   * changes on this branch to that future period. Once it's cleared you will no
   * longer have that option.
   * @return True if when promoted there exited a future bound period.
   */
  public boolean isResolveWithFuturePeriods();
  
  
  /**
   * 
   * @return True if the object has been retired from active use, false if the
   *         object is active.  Retireable objects are never deleted from a
   *         database table, instead they are retired by setting the retired
   *         column to the same value as the ID of the object.
   */
  public java.lang.Boolean isRetired();
  
  
  /**
   * Whether this bean is sliced. If a bean is sliced then you can navigate from
   * this bean to another bean or beans via a link or array, if it's unsliced
   * (in "window" mode) you cannot navigate from this bean.
   * <p/>
   * In most cases a bean will be sliced, window mode is used in special cases.
   * @return 
   */
  public boolean isSlice();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTemporaryBranch();
  
  
  /**
   * Prevents further changes from occurring on this branch or any beans within
   *  this branch's graph. A branch is always locked before it's promoted, but
   *  there are cases where a branch will be locked but not promoted. For
   *  example, a declined submission is locked but not promoted.
   *  <p/>
   *  There are some internal fields that can be changed on a locked branch but
   *  otherwise it's immutable.
   */
  public void lockBranch();
  
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh();
  
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove();
  
  
  /**
   * Sets the value of the EditEffectiveDate field.
   */
  public void setEditEffectiveDate(java.util.Date value);
  
  
  /**
   * Set a foreign key by passing in an EFfDatedKey (effectively the
   * EffDatedVersionList or FixedId of the bean). You need this method because
   * it's the only way to set a foreign key given a FixedId (and no context for
   * when that FixeId might be effective).
   * <p/>
   * This bean can be unsliced or sliced when this is called.
   * @param link Effective dated foreign key to set
   * @param key EffDatedKey of the bean (effectively the EffDatedVersionList or
   *             FixedId of the bean)
   */
  public void setLinkVersionList(gw.entity.ILinkPropertyInfo link, gw.pl.persistence.core.effdate.EffDatedKey key);
  
  
  /**
   * Set the end date of this branch's period. Equivalent to calling
   * setPeriodWindow(getPeriodStart(), endDate).
   * @param endDate New end date of this branch's period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPeriodEnd(java.util.Date endDate);
  
  
  /**
   * Set the start date of this branch's period. Equivalent to calling
   * setPeriodWindow(startDate, getPeriodEnd()).
   * @param startDate New start date of this branch's period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPeriodStart(java.util.Date startDate);
  
  
  /**
   * Set this branch's period dates. There are several restrictions to setting
   * the period dates:
   * @param newStart New start date of this branch's period.
   * @param newEnd New end date of this branch's period.
   */
  public void setPeriodWindow(java.util.Date newStart, java.util.Date newEnd);
  
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id);
  
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch();
  
  
  /**
   * Clears the cancellation date.
   */
  public void uncancel();
  
  
  
}