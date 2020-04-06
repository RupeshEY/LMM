package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityDocument.eti;ActivityDocument.eix;ActivityDocument.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivityDocumentInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.domain.document.DocumentJoiningBean, com.guidewire.pl.system.bundle.CommitCallback, gw.cc.activity.entity.ActivityDocument {
  /**
   * Gets the value of the Activity field.
   * Parent activity for the documents.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity getActivity();
  
  
  public gw.pl.persistence.core.Key getActivityID();
  
  
  /**
   * Gets the value of the Document field.
   * A document linked to a parent activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document getDocument();
  
  
  public gw.pl.persistence.core.Key getDocumentID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the Activity field.
   */
  public void setActivity(entity.Activity value);
  
  
  public void setActivityID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Document field.
   */
  public void setDocument(entity.Document value);
  
  
  public void setDocumentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}