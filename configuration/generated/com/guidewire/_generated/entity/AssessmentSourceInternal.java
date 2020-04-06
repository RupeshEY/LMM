package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AssessmentSource.eti;AssessmentSource.eix;AssessmentSource.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AssessmentSourceInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.AssessmentSource {
  /**
   * Adds the given element to the StatusLine array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToStatusLine(entity.AssessmentLine element);
  
  
  /**
   * Gets the value of the Assessor field.
   * The relevant assessor
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getAssessor();
  
  
  public gw.pl.persistence.core.Key getAssessorID();
  
  
  /**
   * Gets the value of the Description field.
   * Description of Assessment Source
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Incident field.
   * Related assessment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the SourceName field.
   * Assessment Source name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSourceName();
  
  
  /**
   * Gets the value of the SourceType field.
   * Assessment Source typelist
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssessmentSource getSourceType();
  
  
  /**
   * Gets the value of the StatusLine field.
   * A list of events for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssessmentLine[] getStatusLine();
  
  
  /**
   * Removes the given element from the StatusLine array. This is achieved by marking the element for removal.
   */
  public void removeFromStatusLine(entity.AssessmentLine element);
  
  
  /**
   * Removes the given element from the StatusLine array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromStatusLine(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Assessor field.
   */
  public void setAssessor(entity.Contact value);
  
  
  public void setAssessorID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.Incident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the SourceName field.
   */
  public void setSourceName(java.lang.String value);
  
  
  /**
   * Sets the value of the SourceType field.
   */
  public void setSourceType(typekey.AssessmentSource value);
  
  
  /**
   * Sets the value of the StatusLine field.
   */
  public void setStatusLine(entity.AssessmentLine[] value);
  
  
  
}