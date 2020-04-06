package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ArchiveFailure.eti;ArchiveFailure.eix;ArchiveFailure.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ArchiveFailureInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.archiving.ArchiveFailurePublicMethods, com.guidewire.pl.domain.archiving.impl.ArchiveFailureInternalMethods {
  /**
   * Gets the value of the ArchiveFailure field.
   * Short version of the reason for a failure to archive
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArchiveFailure();
  
  
  /**
   * Sets the value of the ArchiveFailure field.
   */
  public void setArchiveFailure(java.lang.String value);
  
  
  
}