package entity;

/**
 * ExpressionFragment
 * Fragment of an expression in a Business Rule
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExpressionFragment.eti;ExpressionFragment.eix;ExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class ExpressionFragment extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable, entity.RuleVersionDependent {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ExpressionFragment> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ExpressionFragment>("entity.ExpressionFragment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INCOMMANDPARAMETER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "InCommandParameter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INCOMMANDPARAMETERARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InCommandParameterArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INFILTEREDITERABLEEXPRESSIONFRAGMENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "InFilteredIterableExpressionFragment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INFILTEREDITERABLEEXPRESSIONFRAGMENTARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InFilteredIterableExpressionFragmentArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INLEFTCONDITION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "InLeftCondition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INLEFTCONDITIONARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InLeftConditionArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INLISTEXPRESSIONFRAGMENTJOIN_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "InListExpressionFragmentJoin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INLISTEXPRESSIONFRAGMENTJOINARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InListExpressionFragmentJoinArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INRIGHTCONDITION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "InRightCondition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INRIGHTCONDITIONARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InRightConditionArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> INSUMEXPRESSIONFRAGMENT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "InSumExpressionFragment");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INSUMEXPRESSIONFRAGMENTARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InSumExpressionFragmentArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ExpressionFragmentInternal _internal;
  
  protected ExpressionFragment(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.ExpressionFragmentInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.ExpressionFragmentInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  public boolean equalsTo(entity.ExpressionFragment arg0) {
    return ((com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods")).equalsTo(arg0);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCommandParameter getInCommandParameter() {
    return (entity.RuleCommandParameter)__getInternalInterface().getFieldValue(INCOMMANDPARAMETER_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCommandParameter[] getInCommandParameterArray() {
    return (entity.RuleCommandParameter[])__getInternalInterface().getFieldValue(INCOMMANDPARAMETERARRAY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FilteredIterableExpressionFragmentJoin getInFilteredIterableExpressionFragment() {
    return (entity.FilteredIterableExpressionFragmentJoin)__getInternalInterface().getFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FilteredIterableExpressionFragmentJoin[] getInFilteredIterableExpressionFragmentArray() {
    return (entity.FilteredIterableExpressionFragmentJoin[])__getInternalInterface().getFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENTARRAY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleConditionLine getInLeftCondition() {
    return (entity.RuleConditionLine)__getInternalInterface().getFieldValue(INLEFTCONDITION_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleConditionLine[] getInLeftConditionArray() {
    return (entity.RuleConditionLine[])__getInternalInterface().getFieldValue(INLEFTCONDITIONARRAY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ListExpressionFragmentJoin getInListExpressionFragmentJoin() {
    return (entity.ListExpressionFragmentJoin)__getInternalInterface().getFieldValue(INLISTEXPRESSIONFRAGMENTJOIN_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ListExpressionFragmentJoin[] getInListExpressionFragmentJoinArray() {
    return (entity.ListExpressionFragmentJoin[])__getInternalInterface().getFieldValue(INLISTEXPRESSIONFRAGMENTJOINARRAY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleConditionLine getInRightCondition() {
    return (entity.RuleConditionLine)__getInternalInterface().getFieldValue(INRIGHTCONDITION_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleConditionLine[] getInRightConditionArray() {
    return (entity.RuleConditionLine[])__getInternalInterface().getFieldValue(INRIGHTCONDITIONARRAY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SumExpressionFragmentJoin getInSumExpressionFragment() {
    return (entity.SumExpressionFragmentJoin)__getInternalInterface().getFieldValue(INSUMEXPRESSIONFRAGMENT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SumExpressionFragmentJoin[] getInSumExpressionFragmentArray() {
    return (entity.SumExpressionFragmentJoin[])__getInternalInterface().getFieldValue(INSUMEXPRESSIONFRAGMENTARRAY_PROP.get());
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
  
  public entity.ExpressionFragment mergeOrReplace(entity.ExpressionFragment arg0) {
    return ((com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods")).mergeOrReplace(arg0);
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
  
  public void removeAndCascade() {
    ((com.guidewire.bizrules.domain.RulesCascadingRemovable)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RulesCascadingRemovable")).removeAndCascade();
  }
  
  public void renameSymbol(gw.bizrules.context.provider.RuleContextDefinitionProvider arg0, java.lang.String arg1, java.lang.String arg2, boolean arg3) {
    ((com.guidewire.bizrules.domain.RuleSymbolRenamable)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleSymbolRenamable")).renameSymbol(arg0, arg1, arg2, arg3);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InCommandParameter field.
   */
  private void setInCommandParameter(entity.RuleCommandParameter value) {
    __getInternalInterface().setFieldValue(INCOMMANDPARAMETER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InCommandParameterArray field.
   */
  private void setInCommandParameterArray(entity.RuleCommandParameter[] value) {
    __getInternalInterface().setFieldValue(INCOMMANDPARAMETERARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InFilteredIterableExpressionFragment field.
   */
  private void setInFilteredIterableExpressionFragment(entity.FilteredIterableExpressionFragmentJoin value) {
    __getInternalInterface().setFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InFilteredIterableExpressionFragmentArray field.
   */
  private void setInFilteredIterableExpressionFragmentArray(entity.FilteredIterableExpressionFragmentJoin[] value) {
    __getInternalInterface().setFieldValue(INFILTEREDITERABLEEXPRESSIONFRAGMENTARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InLeftCondition field.
   */
  private void setInLeftCondition(entity.RuleConditionLine value) {
    __getInternalInterface().setFieldValue(INLEFTCONDITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InLeftConditionArray field.
   */
  private void setInLeftConditionArray(entity.RuleConditionLine[] value) {
    __getInternalInterface().setFieldValue(INLEFTCONDITIONARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InListExpressionFragmentJoin field.
   */
  private void setInListExpressionFragmentJoin(entity.ListExpressionFragmentJoin value) {
    __getInternalInterface().setFieldValue(INLISTEXPRESSIONFRAGMENTJOIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InListExpressionFragmentJoinArray field.
   */
  private void setInListExpressionFragmentJoinArray(entity.ListExpressionFragmentJoin[] value) {
    __getInternalInterface().setFieldValue(INLISTEXPRESSIONFRAGMENTJOINARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InRightCondition field.
   */
  private void setInRightCondition(entity.RuleConditionLine value) {
    __getInternalInterface().setFieldValue(INRIGHTCONDITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InRightConditionArray field.
   */
  private void setInRightConditionArray(entity.RuleConditionLine[] value) {
    __getInternalInterface().setFieldValue(INRIGHTCONDITIONARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InSumExpressionFragment field.
   */
  private void setInSumExpressionFragment(entity.SumExpressionFragmentJoin value) {
    __getInternalInterface().setFieldValue(INSUMEXPRESSIONFRAGMENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InSumExpressionFragmentArray field.
   */
  private void setInSumExpressionFragmentArray(entity.SumExpressionFragmentJoin[] value) {
    __getInternalInterface().setFieldValue(INSUMEXPRESSIONFRAGMENTARRAY_PROP.get(), value);
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
  private void setSubtype(typekey.ExpressionFragment value) {
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
  
  static {
    com.guidewire._generated.entity.ExpressionFragmentInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.ExpressionFragment, com.guidewire._generated.entity.ExpressionFragmentInternal>() {
      public java.lang.Object getImplementation(entity.ExpressionFragment bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ExpressionFragmentInternal getInternalInterface(entity.ExpressionFragment bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}