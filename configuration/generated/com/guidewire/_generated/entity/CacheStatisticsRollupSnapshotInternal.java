package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CacheStatisticsRollupSnapshot.eti;CacheStatisticsRollupSnapshot.eix;CacheStatisticsRollupSnapshot.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CacheStatisticsRollupSnapshotInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.cache2.CacheStatisticsRollupSnapshotPublicMethods, com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData {
  /**
   * Gets the value of the AverageNumHits field.
   * Average number of hits for this time slice
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAverageNumHits();
  
  
  /**
   * Gets the value of the AverageNumMisses field.
   * Average number of misses for this time slice
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAverageNumMisses();
  
  
  /**
   * Gets the value of the AverageNumMissesWhenCacheFull field.
   * Average number of misses because the item was evicted when the cache was full for this time slice
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAverageNumMissesWhenCacheFull();
  
  
  /**
   * Gets the value of the AverageSpaceRetained field.
   * Average space retained in bytes for this time slice
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAverageSpaceRetained();
  
  
  /**
   * Gets the value of the ServerId field.
   * ServerId of the host that generated the statistics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerId();
  
  
  /**
   * Gets the value of the SliceTimestamp field.
   * Lower end of this time slice, i.e 00:00:00,000 for the range 00:00:00,000 to 00:29:59,999
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSliceTimestamp();
  
  
  /**
   * Sets the value of the AverageNumHits field.
   */
  public void setAverageNumHits(java.lang.Long value);
  
  
  /**
   * Sets the value of the AverageNumMisses field.
   */
  public void setAverageNumMisses(java.lang.Long value);
  
  
  /**
   * Sets the value of the AverageNumMissesWhenCacheFull field.
   */
  public void setAverageNumMissesWhenCacheFull(java.lang.Long value);
  
  
  /**
   * Sets the value of the AverageSpaceRetained field.
   */
  public void setAverageSpaceRetained(java.lang.Long value);
  
  
  /**
   * Sets the value of the ServerId field.
   */
  public void setServerId(java.lang.String value);
  
  
  /**
   * Sets the value of the SliceTimestamp field.
   */
  public void setSliceTimestamp(java.util.Date value);
  
  
  
}