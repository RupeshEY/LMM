package entity;

/**
 * DateExpressionFragment
 * ExpressionFragment for arbitrary date expression
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateExpressionFragment.eti;DateExpressionFragment.eix;DateExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DateExpressionFragment")
public class DateExpressionFragment extends entity.ExpressionFragment {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DateExpressionFragment> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DateExpressionFragment>("entity.DateExpressionFragment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateValue");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DateExpressionFragment()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DateExpressionFragment(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DateExpressionFragment(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.DateExpressionFragmentInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.DateExpressionFragmentInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.DateExpressionFragmentInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the DateValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateValue() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEVALUE_PROP.get());
  }
  
  /**
   * Sets the value of the DateValue field.
   */
  public void setDateValue(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEVALUE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DateExpressionFragmentInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DateExpressionFragment.this.__getDelegateManager();
    }
    
    public void accept(com.guidewire.bizrules.codegenerator.RuleGraphVisitor arg0) {
      ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).accept(arg0);
    }
    
    /**
     * Adds the given element to the InCommandParameterArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToInCommandParameterArray(entity.RuleCommandParameter element) {
      __getInternalInterface().addArrayElement(INCOMMANDPARAMETERARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the InFilteredIterableExpressionFragmentArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToInFilteredIterableExpressionFragmentArray(entity.FilteredIterableExpressionFragmentJoin element) {
      __getInternalInterface().addArrayElement(INFILTEREDITERABLEEXPRESSIONFRAGMENTARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the InLeftConditionArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToInLeftConditionArray(entity.RuleConditionLine element) {
      __getInternalInterface().addArrayElement(INLEFTCONDITIONARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the InListExpressionFragmentJoinArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToInListExpressionFragmentJoinArray(entity.ListExpressionFragmentJoin element) {
      __getInternalInterface().addArrayElement(INLISTEXPRESSIONFRAGMENTJOINARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the InRightConditionArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToInRightConditionArray(entity.RuleConditionLine element) {
      __getInternalInterface().addArrayElement(INRIGHTCONDITIONARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the InSumExpressionFragmentArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToInSumExpressionFragmentArray(entity.SumExpressionFragmentJoin element) {
      __getInternalInterface().addArrayElement(INSUMEXPRESSIONFRAGMENTARRAY_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void assignUniquePublicId() {
      ((com.guidewire.bizrules.management.RuleVersionAwareInternal)__getDelegateManager().getImplementation("com.guidewire.bizrules.management.RuleVersionAwareInternal")).assignUniquePublicId();
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
    }
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
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
    
    public boolean countsAsEmptyForValidation() {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).countsAsEmptyForValidation();
    }
    
    public java.util.List<java.lang.String> deepValidate(gw.bizrules.context.provider.RuleContextDefinitionProvider arg0) {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).deepValidate(arg0);
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public boolean equalsTo(entity.ExpressionFragment arg0) {
      return ((com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods")).equalsTo(arg0);
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
    
    public entity.KeyableBean getBean() {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).getBean();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the DateValue field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateValue() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEVALUE_PROP.get());
    }
    
    public java.lang.String getDisplayText() {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).getDisplayText();
    }
    
    public gw.lang.reflect.IType getExpressionType() {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).getExpressionType();
    }
    
    public java.lang.String getFormattedDisplayText() {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).getFormattedDisplayText();
    }
    
    public java.lang.String getGosuText() {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).getGosuText();
    }
    
    public java.lang.String getHtmlText(entity.ConditionExpressionFragment arg0) {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).getHtmlText(arg0);
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
     * Gets the value of the InCommandParameter field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleCommandParameter getInCommandParameter() {
      return (entity.RuleCommandParameter)__getInternalInterface().getFieldValue(INCOMMANDPARAMETER_PROP.get());
    }
    
    /**
     * Gets the value of the InCommandParameterArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleCommandParameter[] getInCommandParameterArray() {
      return (entity.RuleCommandParameter[])__getInternalInterface().getFieldValue(INCOMMANDPARAMETERARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInCommandParameterID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INCOMMANDPARAMETER_PROP.get());
    }
    
    /**
     * Gets the value of the InFilteredIterableExpressionFragment field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.FilteredIterableExpressionFragmentJoin getInFilteredIterableExpressionFragment() {
      return (entity.FilteredIterableExpressionFragmentJoin)__getInternalInterface().getFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENT_PROP.get());
    }
    
    /**
     * Gets the value of the InFilteredIterableExpressionFragmentArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.FilteredIterableExpressionFragmentJoin[] getInFilteredIterableExpressionFragmentArray() {
      return (entity.FilteredIterableExpressionFragmentJoin[])__getInternalInterface().getFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENTARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInFilteredIterableExpressionFragmentID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENT_PROP.get());
    }
    
    /**
     * Gets the value of the InLeftCondition field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleConditionLine getInLeftCondition() {
      return (entity.RuleConditionLine)__getInternalInterface().getFieldValue(INLEFTCONDITION_PROP.get());
    }
    
    /**
     * Gets the value of the InLeftConditionArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleConditionLine[] getInLeftConditionArray() {
      return (entity.RuleConditionLine[])__getInternalInterface().getFieldValue(INLEFTCONDITIONARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInLeftConditionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INLEFTCONDITION_PROP.get());
    }
    
    /**
     * Gets the value of the InListExpressionFragmentJoin field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ListExpressionFragmentJoin getInListExpressionFragmentJoin() {
      return (entity.ListExpressionFragmentJoin)__getInternalInterface().getFieldValue(INLISTEXPRESSIONFRAGMENTJOIN_PROP.get());
    }
    
    /**
     * Gets the value of the InListExpressionFragmentJoinArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ListExpressionFragmentJoin[] getInListExpressionFragmentJoinArray() {
      return (entity.ListExpressionFragmentJoin[])__getInternalInterface().getFieldValue(INLISTEXPRESSIONFRAGMENTJOINARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInListExpressionFragmentJoinID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INLISTEXPRESSIONFRAGMENTJOIN_PROP.get());
    }
    
    /**
     * Gets the value of the InRightCondition field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleConditionLine getInRightCondition() {
      return (entity.RuleConditionLine)__getInternalInterface().getFieldValue(INRIGHTCONDITION_PROP.get());
    }
    
    /**
     * Gets the value of the InRightConditionArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RuleConditionLine[] getInRightConditionArray() {
      return (entity.RuleConditionLine[])__getInternalInterface().getFieldValue(INRIGHTCONDITIONARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInRightConditionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INRIGHTCONDITION_PROP.get());
    }
    
    /**
     * Gets the value of the InSumExpressionFragment field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SumExpressionFragmentJoin getInSumExpressionFragment() {
      return (entity.SumExpressionFragmentJoin)__getInternalInterface().getFieldValue(INSUMEXPRESSIONFRAGMENT_PROP.get());
    }
    
    /**
     * Gets the value of the InSumExpressionFragmentArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.SumExpressionFragmentJoin[] getInSumExpressionFragmentArray() {
      return (entity.SumExpressionFragmentJoin[])__getInternalInterface().getFieldValue(INSUMEXPRESSIONFRAGMENTARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getInSumExpressionFragmentID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(INSUMEXPRESSIONFRAGMENT_PROP.get());
    }
    
    public gw.lang.reflect.IType getListOrArrayElementType(gw.bizrules.context.provider.RuleContextDefinitionProvider arg0) {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).getListOrArrayElementType(arg0);
    }
    
    public java.lang.Iterable<? extends entity.RuleVersionAware> getOwners() {
      return ((gw.bizrules.domain.RuleVersionDependent)__getDelegateManager().getImplementation("gw.bizrules.domain.RuleVersionDependent")).getOwners();
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
    public typekey.ExpressionFragment getSubtype() {
      return (typekey.ExpressionFragment)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isEmpty() {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).isEmpty();
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
    
    public entity.ExpressionFragment mergeOrReplace(entity.ExpressionFragment arg0) {
      return ((com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods")).mergeOrReplace(arg0);
    }
    
    public void onPreInit() {
      ((com.guidewire.pl.system.entity.PreInitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.entity.PreInitCallback")).onPreInit();
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
    
    public void removeAndCascade() {
      ((com.guidewire.bizrules.domain.RulesCascadingRemovable)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RulesCascadingRemovable")).removeAndCascade();
    }
    
    /**
     * Removes the given element from the InCommandParameterArray array. This is achieved by marking the element for removal.
     */
    public void removeFromInCommandParameterArray(entity.RuleCommandParameter element) {
      __getInternalInterface().removeArrayElement(INCOMMANDPARAMETERARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the InCommandParameterArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInCommandParameterArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INCOMMANDPARAMETERARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the InFilteredIterableExpressionFragmentArray array. This is achieved by marking the element for removal.
     */
    public void removeFromInFilteredIterableExpressionFragmentArray(entity.FilteredIterableExpressionFragmentJoin element) {
      __getInternalInterface().removeArrayElement(INFILTEREDITERABLEEXPRESSIONFRAGMENTARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the InFilteredIterableExpressionFragmentArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInFilteredIterableExpressionFragmentArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INFILTEREDITERABLEEXPRESSIONFRAGMENTARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the InLeftConditionArray array. This is achieved by marking the element for removal.
     */
    public void removeFromInLeftConditionArray(entity.RuleConditionLine element) {
      __getInternalInterface().removeArrayElement(INLEFTCONDITIONARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the InLeftConditionArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInLeftConditionArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INLEFTCONDITIONARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the InListExpressionFragmentJoinArray array. This is achieved by marking the element for removal.
     */
    public void removeFromInListExpressionFragmentJoinArray(entity.ListExpressionFragmentJoin element) {
      __getInternalInterface().removeArrayElement(INLISTEXPRESSIONFRAGMENTJOINARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the InListExpressionFragmentJoinArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInListExpressionFragmentJoinArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INLISTEXPRESSIONFRAGMENTJOINARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the InRightConditionArray array. This is achieved by marking the element for removal.
     */
    public void removeFromInRightConditionArray(entity.RuleConditionLine element) {
      __getInternalInterface().removeArrayElement(INRIGHTCONDITIONARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the InRightConditionArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInRightConditionArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INRIGHTCONDITIONARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the InSumExpressionFragmentArray array. This is achieved by marking the element for removal.
     */
    public void removeFromInSumExpressionFragmentArray(entity.SumExpressionFragmentJoin element) {
      __getInternalInterface().removeArrayElement(INSUMEXPRESSIONFRAGMENTARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the InSumExpressionFragmentArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInSumExpressionFragmentArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INSUMEXPRESSIONFRAGMENTARRAY_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    public void renameSymbol(gw.bizrules.context.provider.RuleContextDefinitionProvider arg0, java.lang.String arg1, java.lang.String arg2, boolean arg3) {
      ((com.guidewire.bizrules.domain.RuleSymbolRenamable)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleSymbolRenamable")).renameSymbol(arg0, arg1, arg2, arg3);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateValue field.
     */
    public void setDateValue(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEVALUE_PROP.get(), value);
    }
    
    public void setExpressionType(gw.lang.reflect.IType arg0) {
      ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).setExpressionType(arg0);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InCommandParameter field.
     */
    public void setInCommandParameter(entity.RuleCommandParameter value) {
      __getInternalInterface().setFieldValue(INCOMMANDPARAMETER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InCommandParameterArray field.
     */
    public void setInCommandParameterArray(entity.RuleCommandParameter[] value) {
      __getInternalInterface().setFieldValue(INCOMMANDPARAMETERARRAY_PROP.get(), value);
    }
    
    public void setInCommandParameterID(gw.pl.persistence.core.Key value) {
      setFieldValue(INCOMMANDPARAMETER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InFilteredIterableExpressionFragment field.
     */
    public void setInFilteredIterableExpressionFragment(entity.FilteredIterableExpressionFragmentJoin value) {
      __getInternalInterface().setFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InFilteredIterableExpressionFragmentArray field.
     */
    public void setInFilteredIterableExpressionFragmentArray(entity.FilteredIterableExpressionFragmentJoin[] value) {
      __getInternalInterface().setFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENTARRAY_PROP.get(), value);
    }
    
    public void setInFilteredIterableExpressionFragmentID(gw.pl.persistence.core.Key value) {
      setFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InLeftCondition field.
     */
    public void setInLeftCondition(entity.RuleConditionLine value) {
      __getInternalInterface().setFieldValue(INLEFTCONDITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InLeftConditionArray field.
     */
    public void setInLeftConditionArray(entity.RuleConditionLine[] value) {
      __getInternalInterface().setFieldValue(INLEFTCONDITIONARRAY_PROP.get(), value);
    }
    
    public void setInLeftConditionID(gw.pl.persistence.core.Key value) {
      setFieldValue(INLEFTCONDITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InListExpressionFragmentJoin field.
     */
    public void setInListExpressionFragmentJoin(entity.ListExpressionFragmentJoin value) {
      __getInternalInterface().setFieldValue(INLISTEXPRESSIONFRAGMENTJOIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InListExpressionFragmentJoinArray field.
     */
    public void setInListExpressionFragmentJoinArray(entity.ListExpressionFragmentJoin[] value) {
      __getInternalInterface().setFieldValue(INLISTEXPRESSIONFRAGMENTJOINARRAY_PROP.get(), value);
    }
    
    public void setInListExpressionFragmentJoinID(gw.pl.persistence.core.Key value) {
      setFieldValue(INLISTEXPRESSIONFRAGMENTJOIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InRightCondition field.
     */
    public void setInRightCondition(entity.RuleConditionLine value) {
      __getInternalInterface().setFieldValue(INRIGHTCONDITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InRightConditionArray field.
     */
    public void setInRightConditionArray(entity.RuleConditionLine[] value) {
      __getInternalInterface().setFieldValue(INRIGHTCONDITIONARRAY_PROP.get(), value);
    }
    
    public void setInRightConditionID(gw.pl.persistence.core.Key value) {
      setFieldValue(INRIGHTCONDITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InSumExpressionFragment field.
     */
    public void setInSumExpressionFragment(entity.SumExpressionFragmentJoin value) {
      __getInternalInterface().setFieldValue(INSUMEXPRESSIONFRAGMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InSumExpressionFragmentArray field.
     */
    public void setInSumExpressionFragmentArray(entity.SumExpressionFragmentJoin[] value) {
      __getInternalInterface().setFieldValue(INSUMEXPRESSIONFRAGMENTARRAY_PROP.get(), value);
    }
    
    public void setInSumExpressionFragmentID(gw.pl.persistence.core.Key value) {
      setFieldValue(INSUMEXPRESSIONFRAGMENT_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
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
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.ExpressionFragment value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
    
    public java.util.List<java.lang.String> validate(gw.bizrules.context.provider.RuleContextDefinitionProvider arg0) {
      return ((com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>)__getDelegateManager().getImplementation("com.guidewire.bizrules.codegenerator.GosuTextBuilder")).validate(arg0);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.bizrules.codegenerator.GosuTextBuilder", "com.guidewire.bizrules.codegenerator.DateExpressionFragmentGosuTextBuilder");
    config.put("com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods", "com.guidewire.bizrules.domain.DateExpressionFragmentImpl");
    config.put("com.guidewire.bizrules.domain.RuleSymbolRenamable", "com.guidewire.bizrules.domain.DateExpressionFragmentImpl");
    config.put("com.guidewire.bizrules.domain.RulesCascadingRemovable", "com.guidewire.bizrules.domain.DateExpressionFragmentImpl");
    config.put("com.guidewire.bizrules.management.RuleVersionAwareInternal", "com.guidewire.bizrules.management.RuleVersionDependentImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.bizrules.management.RuleVersionDependentImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.bizrules.management.RuleVersionDependentImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.bizrules.management.RuleVersionDependentImpl");
    config.put("com.guidewire.pl.system.entity.PreInitCallback", "com.guidewire.bizrules.management.RuleVersionDependentImpl");
    config.put("gw.bizrules.domain.RuleVersionDependent", "com.guidewire.bizrules.domain.ExpressionFragmentImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DateExpressionFragment.class, config);
    com.guidewire._generated.entity.DateExpressionFragmentInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DateExpressionFragment, com.guidewire._generated.entity.DateExpressionFragmentInternal>() {
      public java.lang.Object getImplementation(entity.DateExpressionFragment bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DateExpressionFragmentInternal getInternalInterface(entity.DateExpressionFragment bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DateExpressionFragment newEmptyInstance() {
        return new entity.DateExpressionFragment((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}