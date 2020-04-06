package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionSetDocument.eti;TransactionSetDocument.eix;TransactionSetDocument.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionSetDocumentInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.domain.document.DocumentJoiningBean, com.guidewire.pl.system.bundle.CommitCallback, gw.cc.financials.entity.TransactionSetDocument {
  /**
   * Gets the value of the Document field.
   * Associated Document.
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
   * Gets the value of the TransactionSet field.
   * TransactionSet the document is linked to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionSet getTransactionSet();
  
  
  public gw.pl.persistence.core.Key getTransactionSetID();
  
  
  /**
   * Sets the value of the Document field.
   */
  public void setDocument(entity.Document value);
  
  
  public void setDocumentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TransactionSet field.
   */
  public void setTransactionSet(entity.TransactionSet value);
  
  
  public void setTransactionSetID(gw.pl.persistence.core.Key value);
  
  
  
}