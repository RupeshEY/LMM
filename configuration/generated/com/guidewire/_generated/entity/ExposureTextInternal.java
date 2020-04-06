package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureText.eti;ExposureText.eix;ExposureText.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureTextInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.ExposureText {
  /**
   * Gets the value of the Exposure field.
   * Related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Text field.
   * The text associated with the exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getText();
  
  
  /**
   * Gets the value of the TextType field.
   * Meaning of the text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureTextType getTextType();
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(java.lang.String value);
  
  
  /**
   * Sets the value of the TextType field.
   */
  public void setTextType(typekey.ExposureTextType value);
  
  
  
}