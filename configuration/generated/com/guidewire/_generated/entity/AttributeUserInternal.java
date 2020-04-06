package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AttributeUser.eti;AttributeUser.eix;AttributeUser.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AttributeUserInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Attribute field.
   * The associated attribute.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Attribute getAttribute();
  
  
  public gw.pl.persistence.core.Key getAttributeID();
  
  
  /**
   * Gets the value of the DateField1 field.
   * General-purpose date field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateField1();
  
  
  /**
   * Gets the value of the DateField2 field.
   * General-purpose date field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateField2();
  
  
  /**
   * Gets the value of the DateField3 field.
   * General-purpose date field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateField3();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the State field.
   * The state in which this attribute is applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState();
  
  
  /**
   * Gets the value of the TextField1 field.
   * General-purpose text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTextField1();
  
  
  /**
   * Gets the value of the TextField2 field.
   * General-purpose text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTextField2();
  
  
  /**
   * Gets the value of the TextField3 field.
   * General-purpose text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTextField3();
  
  
  /**
   * Gets the value of the User field.
   * The associated user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Gets the value of the Value field.
   * The attribute value for this user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getValue();
  
  
  /**
   * Sets the value of the Attribute field.
   */
  public void setAttribute(entity.Attribute value);
  
  
  public void setAttributeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DateField1 field.
   */
  public void setDateField1(java.util.Date value);
  
  
  /**
   * Sets the value of the DateField2 field.
   */
  public void setDateField2(java.util.Date value);
  
  
  /**
   * Sets the value of the DateField3 field.
   */
  public void setDateField3(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value);
  
  
  /**
   * Sets the value of the TextField1 field.
   */
  public void setTextField1(java.lang.String value);
  
  
  /**
   * Sets the value of the TextField2 field.
   */
  public void setTextField2(java.lang.String value);
  
  
  /**
   * Sets the value of the TextField3 field.
   */
  public void setTextField3(java.lang.String value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(java.lang.Integer value);
  
  
  
}