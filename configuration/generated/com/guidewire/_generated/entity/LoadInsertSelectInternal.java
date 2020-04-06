package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadInsertSelect.eti;LoadInsertSelect.eix;LoadInsertSelect.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadInsertSelectInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal, com.guidewire._generated.entity.OrdereddLoaderObjectInternal, com.guidewire.pl.domain.staging.LoadInsertSelectPublicMethods {
  /**
   * Gets the value of the AffectedRowCount field.
   * Number of rows affected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAffectedRowCount();
  
  
  /**
   * Gets the value of the FKEnablingDuration field.
   * Duration of Re-enabling FK.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getFKEnablingDuration();
  
  
  /**
   * Gets the value of the LoadCommand field.
   * Denorm FK for unique index.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand();
  
  
  public gw.pl.persistence.core.Key getLoadCommandID();
  
  
  /**
   * Gets the value of the LoadOperation field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadOperation getLoadOperation();
  
  
  public gw.pl.persistence.core.Key getLoadOperationID();
  
  
  /**
   * Gets the value of the Query field.
   * insert/select.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQuery();
  
  
  /**
   * Sets the value of the AffectedRowCount field.
   */
  public void setAffectedRowCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the FKEnablingDuration field.
   */
  public void setFKEnablingDuration(java.lang.Long value);
  
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value);
  
  
  public void setLoadCommandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadOperation field.
   */
  public void setLoadOperation(entity.LoadOperation value);
  
  
  public void setLoadOperationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Query field.
   */
  public void setQuery(java.lang.String value);
  
  
  
}