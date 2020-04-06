package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CoverageLineLimit.eti;CoverageLineLimit.eix;CoverageLineLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CoverageLineLimitInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.aggregatelimit.entity.CoverageLineLimit {
  /**
   * Gets the value of the AggregateLimit field.
   * The associated aggregate limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AggregateLimit getAggregateLimit();
  
  
  public gw.pl.persistence.core.Key getAggregateLimitID();
  
  
  /**
   * Gets the value of the CoverageLine field.
   * The associated coverage line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLine getCoverageLine();
  
  
  public gw.pl.persistence.core.Key getCoverageLineID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the AggregateLimit field.
   */
  public void setAggregateLimit(entity.AggregateLimit value);
  
  
  public void setAggregateLimitID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CoverageLine field.
   */
  public void setCoverageLine(entity.CoverageLine value);
  
  
  public void setCoverageLineID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}