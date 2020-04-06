package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DatabaseDataDist.eti;DatabaseDataDist.eix;DatabaseDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DatabaseDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods {
  /**
   * Adds the given element to the DataDistQueryExecs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDataDistQueryExecs(entity.DataDistQueryExec element);
  
  
  /**
   * Adds the given element to the TableDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTableDataDists(entity.TableDataDist element);
  
  
  /**
   * Gets the value of the DataDistQueryExecs field.
   * Collection of DataDistQueryExecs linked to this DatabaseDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DataDistQueryExec[] getDataDistQueryExecs();
  
  
  /**
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EndTime field.
   * End time of data distribution process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the MajorSchemaVersion field.
   * Major Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMajorSchemaVersion();
  
  
  /**
   * Gets the value of the MinorSchemaVersion field.
   * Minor Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMinorSchemaVersion();
  
  
  /**
   * Gets the value of the NumThreads field.
   * Number of threads configured to collect data distribution
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumThreads();
  
  
  /**
   * Gets the value of the PlatformMajorSchemaVersion field.
   * Platform Major Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMajorSchemaVersion();
  
  
  /**
   * Gets the value of the PlatformMinorSchemaVersion field.
   * Platform Minor Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMinorSchemaVersion();
  
  
  /**
   * Gets the value of the StartTime field.
   * Start time of data distribution process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the TableDataDists field.
   * Collection of TableDataDists linked to this DatabaseDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist[] getTableDataDists();
  
  
  /**
   * Gets the value of the AdHocDistsCollected field.
   * Ad hoc data distributions collected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAdHocDistsCollected();
  
  
  /**
   * Gets the value of the AllTablesCollected field.
   * All tables data distributions collected.  If false, a subset was specified.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAllTablesCollected();
  
  
  /**
   * Gets the value of the AppSpecificDistsCollected field.
   * Application specific data distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppSpecificDistsCollected();
  
  
  /**
   * Gets the value of the ArrayDistsCollected field.
   * Array distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isArrayDistsCollected();
  
  
  /**
   * Gets the value of the AssignableDistsByDateCollected field.
   * Assignable data distributions by date collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAssignableDistsByDateCollected();
  
  
  /**
   * Gets the value of the AssignableForKeyDistsCollected field.
   * Assignable Foreign Key distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAssignableForKeyDistsCollected();
  
  
  /**
   * Gets the value of the BeanDistsCollected field.
   * Bean distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBeanDistsCollected();
  
  
  /**
   * Gets the value of the BlobDistsCollected field.
   * Blob distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBlobDistsCollected();
  
  
  /**
   * Gets the value of the BooleanColDistsCollected field.
   * Boolean column data distributions collected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBooleanColDistsCollected();
  
  
  /**
   * Gets the value of the ClobDistsCollected field.
   * Clob distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClobDistsCollected();
  
  
  /**
   * Gets the value of the ForKeyDistsCollected field.
   * ForeignKey distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isForKeyDistsCollected();
  
  
  /**
   * Gets the value of the StagingTableDistsCollected field.
   * Staging table data distributions collected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStagingTableDistsCollected();
  
  
  /**
   * Gets the value of the TypeKeyDistsCollected field.
   * TypeKey  distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTypeKeyDistsCollected();
  
  
  /**
   * Gets the value of the TypeListTableDistsCollected field.
   * Typelist table data distributions collected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTypeListTableDistsCollected();
  
  
  /**
   * Removes the given element from the DataDistQueryExecs array. This is achieved by marking the element for removal.
   */
  public void removeFromDataDistQueryExecs(entity.DataDistQueryExec element);
  
  
  /**
   * Removes the given element from the DataDistQueryExecs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDataDistQueryExecs(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TableDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromTableDataDists(entity.TableDataDist element);
  
  
  /**
   * Removes the given element from the TableDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTableDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AdHocDistsCollected field.
   */
  public void setAdHocDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AllTablesCollected field.
   */
  public void setAllTablesCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AppSpecificDistsCollected field.
   */
  public void setAppSpecificDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ArrayDistsCollected field.
   */
  public void setArrayDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AssignableDistsByDateCollected field.
   */
  public void setAssignableDistsByDateCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AssignableForKeyDistsCollected field.
   */
  public void setAssignableForKeyDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the BeanDistsCollected field.
   */
  public void setBeanDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the BlobDistsCollected field.
   */
  public void setBlobDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the BooleanColDistsCollected field.
   */
  public void setBooleanColDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ClobDistsCollected field.
   */
  public void setClobDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DataDistQueryExecs field.
   */
  public void setDataDistQueryExecs(entity.DataDistQueryExec[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ForKeyDistsCollected field.
   */
  public void setForKeyDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MajorSchemaVersion field.
   */
  public void setMajorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MinorSchemaVersion field.
   */
  public void setMinorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumThreads field.
   */
  public void setNumThreads(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PlatformMajorSchemaVersion field.
   */
  public void setPlatformMajorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PlatformMinorSchemaVersion field.
   */
  public void setPlatformMinorSchemaVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StagingTableDistsCollected field.
   */
  public void setStagingTableDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the TableDataDists field.
   */
  public void setTableDataDists(entity.TableDataDist[] value);
  
  
  /**
   * Sets the value of the TypeKeyDistsCollected field.
   */
  public void setTypeKeyDistsCollected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TypeListTableDistsCollected field.
   */
  public void setTypeListTableDistsCollected(java.lang.Boolean value);
  
  
  
}