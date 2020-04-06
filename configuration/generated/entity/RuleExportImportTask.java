package entity;

/**
 * RuleExportImportTask
 * The task to export/import business rules.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleExportImportTask.eti;RuleExportImportTask.eix;RuleExportImportTask.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class RuleExportImportTask extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RuleExportImportTask> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RuleExportImportTask>("entity.RuleExportImportTask");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BATCHPROCESSCOMPLETED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BatchProcessCompleted");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BATCHPROCESSID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BatchProcessID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RULEDATA_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RuleData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RULEVERSIONTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RuleVersionType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> STARTEDBY_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "StartedBy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TERMINATIONREQUESTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TerminationRequested");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.RuleExportImportTaskInternal _internal;
  
  protected RuleExportImportTask(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.RuleExportImportTaskInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.RuleExportImportTaskInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the BatchProcessCompleted field.
   * The date the batch process processed the task.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBatchProcessCompleted() {
    return (java.util.Date)__getInternalInterface().getFieldValue(BATCHPROCESSCOMPLETED_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getBatchProcessID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(BATCHPROCESSID_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  public gw.lang.Blob getData() {
    return ((com.guidewire.bizrules.domain.RuleExportImportTaskDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleExportImportTaskDomainMethods")).getData();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  public gw.api.tools.ProcessID getProcessID() {
    return ((com.guidewire.bizrules.domain.RuleExportImportTaskDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleExportImportTaskDomainMethods")).getProcessID();
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
  public entity.RuleData getRuleData() {
    return (entity.RuleData)__getInternalInterface().getFieldValue(RULEDATA_PROP.get());
  }
  
  /**
   * Gets the value of the RuleVersionType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleVersion getRuleVersionType() {
    return (typekey.RuleVersion)__getInternalInterface().getFieldValue(RULEVERSIONTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the StartTime field.
   * The time this task started.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the StartedBy field.
   * The user who started the task.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getStartedBy() {
    return (entity.User)__getInternalInterface().getFieldValue(STARTEDBY_PROP.get());
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleExportImportTask getSubtype() {
    return (typekey.RuleExportImportTask)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TerminationRequested field.
   * The date this task requested to terminate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTerminationRequested() {
    return (java.util.Date)__getInternalInterface().getFieldValue(TERMINATIONREQUESTED_PROP.get());
  }
  
  public boolean hasData() {
    return ((com.guidewire.bizrules.domain.RuleExportImportTaskDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleExportImportTaskDomainMethods")).hasData();
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
   * Sets the value of the BatchProcessCompleted field.
   */
  public void setBatchProcessCompleted(java.util.Date value) {
    __getInternalInterface().setFieldValue(BATCHPROCESSCOMPLETED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BatchProcessID field.
   */
  private void setBatchProcessID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(BATCHPROCESSID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  public void setData(gw.lang.Blob arg0) {
    ((com.guidewire.bizrules.domain.RuleExportImportTaskDomainMethods)__getDelegateManager().getImplementation("com.guidewire.bizrules.domain.RuleExportImportTaskDomainMethods")).setData(arg0);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
   * Sets the value of the RuleData field.
   */
  private void setRuleData(entity.RuleData value) {
    __getInternalInterface().setFieldValue(RULEDATA_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RuleVersionType field.
   */
  public void setRuleVersionType(typekey.RuleVersion value) {
    __getInternalInterface().setFieldValue(RULEVERSIONTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartedBy field.
   */
  public void setStartedBy(entity.User value) {
    __getInternalInterface().setFieldValue(STARTEDBY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.RuleExportImportTask value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TerminationRequested field.
   */
  public void setTerminationRequested(java.util.Date value) {
    __getInternalInterface().setFieldValue(TERMINATIONREQUESTED_PROP.get(), value);
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
    com.guidewire._generated.entity.RuleExportImportTaskInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.RuleExportImportTask, com.guidewire._generated.entity.RuleExportImportTaskInternal>() {
      public java.lang.Object getImplementation(entity.RuleExportImportTask bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RuleExportImportTaskInternal getInternalInterface(entity.RuleExportImportTask bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}