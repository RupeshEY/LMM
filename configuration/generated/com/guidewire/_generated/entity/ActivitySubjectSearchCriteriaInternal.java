package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivitySubjectSearchCriteria.eti;ActivitySubjectSearchCriteria.eix;ActivitySubjectSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivitySubjectSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.activity.entity.ActivitySubjectSearchCriteria {
  /**
   * Gets the value of the Pattern field.
   * Activity pattern to match against
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern getPattern();
  
  
  public gw.pl.persistence.core.Key getPatternID();
  
  
  /**
   * Gets the value of the Subject field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubject();
  
  
  /**
   * Gets the value of the SubjectSearchType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivitySubjectSearchType getSubjectSearchType();
  
  
  /**
   * Sets the value of the Pattern field.
   */
  public void setPattern(entity.ActivityPattern value);
  
  
  public void setPatternID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subject field.
   */
  public void setSubject(java.lang.String value);
  
  
  /**
   * Sets the value of the SubjectSearchType field.
   */
  public void setSubjectSearchType(typekey.ActivitySubjectSearchType value);
  
  
  
}