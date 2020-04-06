package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Versionable.eti;Versionable.eix;Versionable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface VersionableInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.persistence.core.VersionablePublicMethods, com.guidewire.pl.domain.persistence.core.impl.VersionableInternal {
  /**
   * Gets the value of the BeanVersion field.
   * Auto-incremented object version
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion();
  
  
  /**
   * Sets the value of the BeanVersion field.
   */
  public void setBeanVersion(java.lang.Integer value);
  
  
  
}