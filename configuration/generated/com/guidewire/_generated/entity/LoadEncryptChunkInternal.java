package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadEncryptChunk.eti;LoadEncryptChunk.eix;LoadEncryptChunk.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadEncryptChunkInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal {
  /**
   * Gets the value of the ChunkSize field.
   * Number of statements executed in this chunk
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getChunkSize();
  
  
  /**
   * Gets the value of the LoadEncryptTable field.
   * Parent load encyrption step
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadEncryptTable getLoadEncryptTable();
  
  
  public gw.pl.persistence.core.Key getLoadEncryptTableID();
  
  
  /**
   * Sets the value of the ChunkSize field.
   */
  public void setChunkSize(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadEncryptTable field.
   */
  public void setLoadEncryptTable(entity.LoadEncryptTable value);
  
  
  public void setLoadEncryptTableID(gw.pl.persistence.core.Key value);
  
  
  
}