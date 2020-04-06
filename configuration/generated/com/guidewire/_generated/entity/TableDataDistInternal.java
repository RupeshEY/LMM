package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TableDataDist.eti;TableDataDist.eix;TableDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TableDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.TableDataDistPublicMethods, com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods {
  /**
   * Adds the given element to the ArrayDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToArrayDataDists(entity.ArrayDataDist element);
  
  
  /**
   * Adds the given element to the AssignableForKeyDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAssignableForKeyDataDists(entity.AssignableForKeyDataDist element);
  
  
  /**
   * Adds the given element to the BeanVersionDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBeanVersionDataDists(entity.BeanVersionDataDist element);
  
  
  /**
   * Adds the given element to the BlobColDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBlobColDataDists(entity.BlobColDataDist element);
  
  
  /**
   * Adds the given element to the BooleanColDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBooleanColDataDists(entity.BooleanColDataDist element);
  
  
  /**
   * Adds the given element to the ClobColDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClobColDataDists(entity.ClobColDataDist element);
  
  
  /**
   * Adds the given element to the CustomDataDistRequests array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCustomDataDistRequests(entity.CustomDataDistRequest element);
  
  
  /**
   * Adds the given element to the DateAnalysisDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDateAnalysisDataDists(entity.DateAnalysisDataDist element);
  
  
  /**
   * Adds the given element to the DateBinnedDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDateBinnedDataDists(entity.DateBinnedDataDist element);
  
  
  /**
   * Adds the given element to the DateSpanDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDateSpanDataDists(entity.DateSpanDataDist element);
  
  
  /**
   * Adds the given element to the ForKeyDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToForKeyDataDists(entity.ForKeyDataDist element);
  
  
  /**
   * Adds the given element to the GenericGroupDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToGenericGroupDataDists(entity.GenericGroupDataDist element);
  
  
  /**
   * Adds the given element to the HourAnalysisDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHourAnalysisDataDists(entity.HourAnalysisDataDist element);
  
  
  /**
   * Adds the given element to the NullableColumnDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNullableColumnDataDists(entity.NullableColumnDataDist element);
  
  
  /**
   * Adds the given element to the TableDataDistParentArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTableDataDistParentArray(entity.TableDataDistParent element);
  
  
  /**
   * Adds the given element to the TypeKeyDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTypeKeyDataDists(entity.TypeKeyDataDist element);
  
  
  /**
   * Gets the value of the ArrayDataDists field.
   * Collection of ArrayDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ArrayDataDist[] getArrayDataDists();
  
  
  /**
   * Gets the value of the AssignableForKeyDataDists field.
   * Collection of AssignableForKeyDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableForKeyDataDist[] getAssignableForKeyDataDists();
  
  
  /**
   * Gets the value of the BeanVersionDataDists field.
   * Collection of BeanVersionDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BeanVersionDataDist[] getBeanVersionDataDists();
  
  
  /**
   * Gets the value of the BlobColDataDists field.
   * Collection of BlobColDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BlobColDataDist[] getBlobColDataDists();
  
  
  /**
   * Gets the value of the BooleanColDataDists field.
   * Collection of BooleanColDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BooleanColDataDist[] getBooleanColDataDists();
  
  
  /**
   * Gets the value of the ClobColDataDists field.
   * Collection of ClobColDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClobColDataDist[] getClobColDataDists();
  
  
  /**
   * Gets the value of the CustomDataDistRequests field.
   * Collection of CustomDataDistRequests linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CustomDataDistRequest[] getCustomDataDistRequests();
  
  
  /**
   * Gets the value of the DatabaseDataDist field.
   * DatabaseDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DatabaseDataDist getDatabaseDataDist();
  
  
  public gw.pl.persistence.core.Key getDatabaseDataDistID();
  
  
  /**
   * Gets the value of the DateAnalysisDataDists field.
   * Collection of DateAnalysisDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateAnalysisDataDist[] getDateAnalysisDataDists();
  
  
  /**
   * Gets the value of the DateBinnedDataDists field.
   * Collection of DateBinnedDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateBinnedDataDist[] getDateBinnedDataDists();
  
  
  /**
   * Gets the value of the DateSpanDataDists field.
   * Collection of min and max dates for all date columns in this table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateSpanDataDist[] getDateSpanDataDists();
  
  
  /**
   * Gets the value of the EntityName field.
   * Name of entity.  Can be subtype entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntityName();
  
  
  /**
   * Gets the value of the ForKeyDataDists field.
   * Collection of ForKeyDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ForKeyDataDist[] getForKeyDataDists();
  
  
  /**
   * Gets the value of the GenericGroupDataDists field.
   * Collection of GenericGroupDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GenericGroupDataDist[] getGenericGroupDataDists();
  
  
  /**
   * Gets the value of the HourAnalysisDataDists field.
   * Collection of HourAnalysisDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.HourAnalysisDataDist[] getHourAnalysisDataDists();
  
  
  /**
   * Gets the value of the NullableColumnDataDists field.
   * Collection of NullableColumnDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.NullableColumnDataDist[] getNullableColumnDataDists();
  
  
  /**
   * Gets the value of the NumLoadedThruStagingTables field.
   * Count of # of rows loaded through the staging tables. (null if non-loadable)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumLoadedThruStagingTables();
  
  
  /**
   * Gets the value of the NumRetiredRows field.
   * Count of # of retired rows. (null if non-retireable)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumRetiredRows();
  
  
  /**
   * Gets the value of the NumRows field.
   * Count of # of rows.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumRows();
  
  
  /**
   * Gets the value of the NumUpdatedRows field.
   * Count of # of updated rows.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumUpdatedRows();
  
  
  /**
   * Gets the value of the NumUpdates field.
   * Count of # of total updates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumUpdates();
  
  
  /**
   * Gets the value of the ParentTableDataDist field.
   * For subtype tables, points to the parent table's data distribution.  Otherwise, this is null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getParentTableDataDist();
  
  
  public gw.pl.persistence.core.Key getParentTableDataDistID();
  
  
  /**
   * Gets the value of the TableDataDistParentArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDistParent[] getTableDataDistParentArray();
  
  
  /**
   * Gets the value of the TableName field.
   * Name of table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Gets the value of the TypeKeyDataDists field.
   * Collection of TypeKeyDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TypeKeyDataDist[] getTypeKeyDataDists();
  
  
  /**
   * Gets the value of the AdminTable field.
   * True if admin table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAdminTable();
  
  
  /**
   * Gets the value of the PlatformTable field.
   * True if platform table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPlatformTable();
  
  
  /**
   * Gets the value of the StagingTableDist field.
   * True if staging table distribution
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStagingTableDist();
  
  
  /**
   * Gets the value of the TypeListTableDist field.
   * True if type list table distribution
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTypeListTableDist();
  
  
  /**
   * Removes the given element from the ArrayDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromArrayDataDists(entity.ArrayDataDist element);
  
  
  /**
   * Removes the given element from the ArrayDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromArrayDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the AssignableForKeyDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromAssignableForKeyDataDists(entity.AssignableForKeyDataDist element);
  
  
  /**
   * Removes the given element from the AssignableForKeyDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAssignableForKeyDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the BeanVersionDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromBeanVersionDataDists(entity.BeanVersionDataDist element);
  
  
  /**
   * Removes the given element from the BeanVersionDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBeanVersionDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the BlobColDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromBlobColDataDists(entity.BlobColDataDist element);
  
  
  /**
   * Removes the given element from the BlobColDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBlobColDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the BooleanColDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromBooleanColDataDists(entity.BooleanColDataDist element);
  
  
  /**
   * Removes the given element from the BooleanColDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBooleanColDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClobColDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromClobColDataDists(entity.ClobColDataDist element);
  
  
  /**
   * Removes the given element from the ClobColDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClobColDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the CustomDataDistRequests array. This is achieved by marking the element for removal.
   */
  public void removeFromCustomDataDistRequests(entity.CustomDataDistRequest element);
  
  
  /**
   * Removes the given element from the CustomDataDistRequests array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCustomDataDistRequests(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the DateAnalysisDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromDateAnalysisDataDists(entity.DateAnalysisDataDist element);
  
  
  /**
   * Removes the given element from the DateAnalysisDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDateAnalysisDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the DateBinnedDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromDateBinnedDataDists(entity.DateBinnedDataDist element);
  
  
  /**
   * Removes the given element from the DateBinnedDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDateBinnedDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the DateSpanDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromDateSpanDataDists(entity.DateSpanDataDist element);
  
  
  /**
   * Removes the given element from the DateSpanDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDateSpanDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ForKeyDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromForKeyDataDists(entity.ForKeyDataDist element);
  
  
  /**
   * Removes the given element from the ForKeyDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromForKeyDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the GenericGroupDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromGenericGroupDataDists(entity.GenericGroupDataDist element);
  
  
  /**
   * Removes the given element from the GenericGroupDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromGenericGroupDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the HourAnalysisDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromHourAnalysisDataDists(entity.HourAnalysisDataDist element);
  
  
  /**
   * Removes the given element from the HourAnalysisDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHourAnalysisDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the NullableColumnDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromNullableColumnDataDists(entity.NullableColumnDataDist element);
  
  
  /**
   * Removes the given element from the NullableColumnDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromNullableColumnDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TableDataDistParentArray array. This is achieved by marking the element for removal.
   */
  public void removeFromTableDataDistParentArray(entity.TableDataDistParent element);
  
  
  /**
   * Removes the given element from the TableDataDistParentArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTableDataDistParentArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TypeKeyDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromTypeKeyDataDists(entity.TypeKeyDataDist element);
  
  
  /**
   * Removes the given element from the TypeKeyDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTypeKeyDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AdminTable field.
   */
  public void setAdminTable(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ArrayDataDists field.
   */
  public void setArrayDataDists(entity.ArrayDataDist[] value);
  
  
  /**
   * Sets the value of the AssignableForKeyDataDists field.
   */
  public void setAssignableForKeyDataDists(entity.AssignableForKeyDataDist[] value);
  
  
  /**
   * Sets the value of the BeanVersionDataDists field.
   */
  public void setBeanVersionDataDists(entity.BeanVersionDataDist[] value);
  
  
  /**
   * Sets the value of the BlobColDataDists field.
   */
  public void setBlobColDataDists(entity.BlobColDataDist[] value);
  
  
  /**
   * Sets the value of the BooleanColDataDists field.
   */
  public void setBooleanColDataDists(entity.BooleanColDataDist[] value);
  
  
  /**
   * Sets the value of the ClobColDataDists field.
   */
  public void setClobColDataDists(entity.ClobColDataDist[] value);
  
  
  /**
   * Sets the value of the CustomDataDistRequests field.
   */
  public void setCustomDataDistRequests(entity.CustomDataDistRequest[] value);
  
  
  /**
   * Sets the value of the DatabaseDataDist field.
   */
  public void setDatabaseDataDist(entity.DatabaseDataDist value);
  
  
  public void setDatabaseDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DateAnalysisDataDists field.
   */
  public void setDateAnalysisDataDists(entity.DateAnalysisDataDist[] value);
  
  
  /**
   * Sets the value of the DateBinnedDataDists field.
   */
  public void setDateBinnedDataDists(entity.DateBinnedDataDist[] value);
  
  
  /**
   * Sets the value of the DateSpanDataDists field.
   */
  public void setDateSpanDataDists(entity.DateSpanDataDist[] value);
  
  
  /**
   * Sets the value of the EntityName field.
   */
  public void setEntityName(java.lang.String value);
  
  
  /**
   * Sets the value of the ForKeyDataDists field.
   */
  public void setForKeyDataDists(entity.ForKeyDataDist[] value);
  
  
  /**
   * Sets the value of the GenericGroupDataDists field.
   */
  public void setGenericGroupDataDists(entity.GenericGroupDataDist[] value);
  
  
  /**
   * Sets the value of the HourAnalysisDataDists field.
   */
  public void setHourAnalysisDataDists(entity.HourAnalysisDataDist[] value);
  
  
  /**
   * Sets the value of the NullableColumnDataDists field.
   */
  public void setNullableColumnDataDists(entity.NullableColumnDataDist[] value);
  
  
  /**
   * Sets the value of the NumLoadedThruStagingTables field.
   */
  public void setNumLoadedThruStagingTables(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumRetiredRows field.
   */
  public void setNumRetiredRows(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumRows field.
   */
  public void setNumRows(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumUpdatedRows field.
   */
  public void setNumUpdatedRows(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumUpdates field.
   */
  public void setNumUpdates(java.lang.Long value);
  
  
  /**
   * Sets the value of the ParentTableDataDist field.
   */
  public void setParentTableDataDist(entity.TableDataDist value);
  
  
  public void setParentTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PlatformTable field.
   */
  public void setPlatformTable(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StagingTableDist field.
   */
  public void setStagingTableDist(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TableDataDistParentArray field.
   */
  public void setTableDataDistParentArray(entity.TableDataDistParent[] value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the TypeKeyDataDists field.
   */
  public void setTypeKeyDataDists(entity.TypeKeyDataDist[] value);
  
  
  /**
   * Sets the value of the TypeListTableDist field.
   */
  public void setTypeListTableDist(java.lang.Boolean value);
  
  
  
}