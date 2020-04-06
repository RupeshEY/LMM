package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Incident.eti;Incident.eix;Incident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface IncidentInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.ClaimContactRoleOwnerInternal, com.guidewire.cc.domain.claim.ClaimContactRoleOwner, com.guidewire.pl.system.bundle.CommitCallback, gw.cc.exposure.entity.Incident {
  /**
   * Adds the given element to the ContentItemLine array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToContentItemLine(entity.AssessmentContentItem element);
  
  
  /**
   * Adds the given element to the Exposures array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposures(entity.Exposure element);
  
  
  /**
   * Adds the given element to the ItemLine array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToItemLine(entity.AssessmentItem element);
  
  
  /**
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoles(entity.ClaimContactRole element);
  
  
  /**
   * Adds the given element to the ServiceRequests array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequests(entity.ServiceRequest element);
  
  
  /**
   * Adds the given element to the SourceLine array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSourceLine(entity.AssessmentSource element);
  
  
  /**
   * Gets the value of the AssessmentCloseDate field.
   * Date when this Assessment is complete
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAssessmentCloseDate();
  
  
  /**
   * Gets the value of the AssessmentComment field.
   * Assessment Comment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssessmentComment();
  
  
  /**
   * Gets the value of the AssessmentName field.
   * The name or subject of this negotiation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssessmentName();
  
  
  /**
   * Gets the value of the AssessmentStatus field.
   * AssessmentStatus
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssessmentStatus getAssessmentStatus();
  
  
  /**
   * Gets the value of the AssessmentTargetCloseDate field.
   * Date when this Assessment is expected to be complete
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAssessmentTargetCloseDate();
  
  
  /**
   * Gets the value of the AssessmentType field.
   * AssessmentType
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssessmentType getAssessmentType();
  
  
  /**
   * Gets the value of the Claim field.
   * Claim to which this incident is related.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ContentItemLine field.
   * A list of line items for this assessment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssessmentContentItem[] getContentItemLine();
  
  
  /**
   * Gets the value of the Description field.
   * General description of the incident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Exposures field.
   * A list of exposures for this incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure[] getExposures();
  
  
  /**
   * Gets the value of the InternalUser field.
   * Internal User
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getInternalUser();
  
  
  public gw.pl.persistence.core.Key getInternalUserID();
  
  
  /**
   * Gets the value of the ItemLine field.
   * A list of line items for this assessment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssessmentItem[] getItemLine();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossEstimate field.
   * Estimated cost of the loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLossEstimate();
  
  
  /**
   * Gets the value of the Roles field.
   * The contacts and their roles associated with this incident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContactRole[] getRoles();
  
  
  /**
   * Gets the value of the ServiceRequests field.
   * Service requests associated with this incident.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest[] getServiceRequests();
  
  
  /**
   * Gets the value of the Severity field.
   * Severity of the loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SeverityType getSeverity();
  
  
  /**
   * Gets the value of the SourceLine field.
   * A source for this assessment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssessmentSource[] getSourceLine();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Incident getSubtype();
  
  
  /**
   * Gets the value of the IncludeContentLineItems field.
   * Boolean field to indicate if assessmentcontentitems are utilized
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeContentLineItems();
  
  
  /**
   * Gets the value of the IncludeLineItems field.
   * Boolean field to indicate if assessmentitems are utilized
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeLineItems();
  
  
  /**
   * Removes the given element from the ContentItemLine array. This is achieved by marking the element for removal.
   */
  public void removeFromContentItemLine(entity.AssessmentContentItem element);
  
  
  /**
   * Removes the given element from the ContentItemLine array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromContentItemLine(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   */
  public void removeFromExposures(entity.Exposure element);
  
  
  /**
   * Removes the given element from the Exposures array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposures(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ItemLine array. This is achieved by marking the element for removal.
   */
  public void removeFromItemLine(entity.AssessmentItem element);
  
  
  /**
   * Removes the given element from the ItemLine array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromItemLine(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   */
  public void removeFromRoles(entity.ClaimContactRole element);
  
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRoles(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
   */
  public void removeFromServiceRequests(entity.ServiceRequest element);
  
  
  /**
   * Removes the given element from the ServiceRequests array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServiceRequests(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SourceLine array. This is achieved by marking the element for removal.
   */
  public void removeFromSourceLine(entity.AssessmentSource element);
  
  
  /**
   * Removes the given element from the SourceLine array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSourceLine(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AssessmentCloseDate field.
   */
  public void setAssessmentCloseDate(java.util.Date value);
  
  
  /**
   * Sets the value of the AssessmentComment field.
   */
  public void setAssessmentComment(java.lang.String value);
  
  
  /**
   * Sets the value of the AssessmentName field.
   */
  public void setAssessmentName(java.lang.String value);
  
  
  /**
   * Sets the value of the AssessmentStatus field.
   */
  public void setAssessmentStatus(typekey.AssessmentStatus value);
  
  
  /**
   * Sets the value of the AssessmentTargetCloseDate field.
   */
  public void setAssessmentTargetCloseDate(java.util.Date value);
  
  
  /**
   * Sets the value of the AssessmentType field.
   */
  public void setAssessmentType(typekey.AssessmentType value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ContentItemLine field.
   */
  public void setContentItemLine(entity.AssessmentContentItem[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Exposures field.
   */
  public void setExposures(entity.Exposure[] value);
  
  
  /**
   * Sets the value of the IncludeContentLineItems field.
   */
  public void setIncludeContentLineItems(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the IncludeLineItems field.
   */
  public void setIncludeLineItems(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the InternalUser field.
   */
  public void setInternalUser(entity.User value);
  
  
  public void setInternalUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ItemLine field.
   */
  public void setItemLine(entity.AssessmentItem[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LossEstimate field.
   */
  public void setLossEstimate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Roles field.
   */
  public void setRoles(entity.ClaimContactRole[] value);
  
  
  /**
   * Sets the value of the ServiceRequests field.
   */
  public void setServiceRequests(entity.ServiceRequest[] value);
  
  
  /**
   * Sets the value of the Severity field.
   */
  public void setSeverity(typekey.SeverityType value);
  
  
  /**
   * Sets the value of the SourceLine field.
   */
  public void setSourceLine(entity.AssessmentSource[] value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.Incident value);
  
  
  
}