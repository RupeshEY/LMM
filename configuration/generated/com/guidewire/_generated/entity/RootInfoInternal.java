package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RootInfo.eti;RootInfo.eix;RootInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RootInfoInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.commons.metadata.internal.version.MetadataVersionProvider, com.guidewire.pl.domain.extract.RootInfoPublicMethods, com.guidewire.pl.domain.extract.impl.RootInfoInternalMethods {
  /**
   * Gets the value of the ArchiveDate field.
   * When archiving was attempted on the root. Null if we never attempted to archive it.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getArchiveDate();
  
  
  /**
   * Gets the value of the ArchiveFailure field.
   * Short version of the reason for a failure to archive
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ArchiveFailure getArchiveFailure();
  
  
  /**
   * Gets the value of the ArchiveFailureDetails field.
   * Full details of archive failure
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ArchiveFailureDetails getArchiveFailureDetails();
  
  
  public gw.pl.persistence.core.Key getArchiveFailureDetailsID();
  
  
  public gw.pl.persistence.core.Key getArchiveFailureID();
  
  
  /**
   * Gets the value of the ArchiveSchemaInfo field.
   * Schema version at which the root was archived or null if it was not archived
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDatamodelInfo getArchiveSchemaInfo();
  
  
  public gw.pl.persistence.core.Key getArchiveSchemaInfoID();
  
  
  /**
   * Gets the value of the ArchiveState field.
   * The archive state of the graph
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ArchiveState getArchiveState();
  
  
  /**
   * Gets the value of the ExcludeReason field.
   * Reason for excluding or skipping the entity from archiving. If the ExcludeFromArchive bit is set, this gives the reason for excluding. Else, if this is not null, it is the reason for skipping.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExcludeReason();
  
  
  /**
   * Gets the value of the ExcludedFromArchive field.
   * Indicate if this entity should be excluded from archiving
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExcludedFromArchive();
  
  
  /**
   * Sets the value of the ArchiveDate field.
   */
  public void setArchiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ArchiveFailure field.
   */
  public void setArchiveFailure(entity.ArchiveFailure value);
  
  
  /**
   * Sets the value of the ArchiveFailureDetails field.
   */
  public void setArchiveFailureDetails(entity.ArchiveFailureDetails value);
  
  
  public void setArchiveFailureDetailsID(gw.pl.persistence.core.Key value);
  
  
  public void setArchiveFailureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ArchiveSchemaInfo field.
   */
  public void setArchiveSchemaInfo(entity.UpgradeDatamodelInfo value);
  
  
  public void setArchiveSchemaInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ArchiveState field.
   */
  public void setArchiveState(typekey.ArchiveState value);
  
  
  /**
   * Sets the value of the ExcludeReason field.
   */
  public void setExcludeReason(java.lang.String value);
  
  
  /**
   * Sets the value of the ExcludedFromArchive field.
   */
  public void setExcludedFromArchive(java.lang.Boolean value);
  
  
  
}