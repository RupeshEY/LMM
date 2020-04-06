package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityPattern.eti;ActivityPattern.eix;ActivityPattern.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivityPatternInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.DecentralizedEntityInternal, com.guidewire.cc.domain.activity.impl.ActivityPatternCoreExtMethods, com.guidewire.pl.domain.activity.ActivityPatternPublicMethods, com.guidewire.pl.domain.admin.DecentralizedEntityPublicMethods, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback {
  /**
   * Adds the given element to the Description_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDescription_L10N_ARRAY(entity.ActivityPattern_Description_L10N element);
  
  
  /**
   * Adds the given element to the ShortSubject_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToShortSubject_L10N_ARRAY(entity.ActivityPattern_ShortSubject_L10N element);
  
  
  /**
   * Adds the given element to the Subject_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSubject_L10N_ARRAY(entity.ActivityPattern_Subject_L10N element);
  
  
  /**
   * Gets the value of the ActivityClass field.
   * The class of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityClass getActivityClass();
  
  
  /**
   * Gets the value of the Category field.
   * Category used to organize the activity pattern.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityCategory getCategory();
  
  
  /**
   * Gets the value of the ClaimLossType field.
   * Used to optionally filter activity patterns by claim loss type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getClaimLossType();
  
  
  /**
   * Gets the value of the Code field.
   * The concise name of the activity pattern, used to identify the pattern within rules.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCode();
  
  
  /**
   * Gets the value of the Command field.
   * A Gosu command to execute for this activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCommand();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the activity pattern.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Description_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern_Description_L10N[] getDescription_L10N_ARRAY();
  
  
  /**
   * Array association for partition Description_L10N_ARRAYByLanguage on array Description_L10N_ARRAY
   */
  public entity.ActivityPattern_Description_L10N getDescription_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the DocumentTemplate field.
   * The id of an associated document template. The id gets passed to IDocumentTemplateSource to retrieve the DocumentTemplateDescriptor.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentTemplate();
  
  
  /**
   * Gets the value of the EmailTemplate field.
   * The id of an associated email template. The id gets passed to IEmailTemplateSource to retrieve the EmailTemplateDescriptor.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailTemplate();
  
  
  /**
   * Gets the value of the EscBusCalLocPath field.
   * Location bean path to use for business calendar in calculating EscalationDate, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEscBusCalLocPath();
  
  
  /**
   * Gets the value of the EscalationBusCalTag field.
   * Holiday tag code to use for business calendar in calculating EscalationDate, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.HolidayTagCode getEscalationBusCalTag();
  
  
  /**
   * Gets the value of the EscalationDays field.
   * Used in conjunction with EscalationStartPoint and EscalationIncludedDays to calculate the EscalationDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getEscalationDays();
  
  
  /**
   * Gets the value of the EscalationHours field.
   * Used in conjunction with EscalationStartPoint and EscalationIncludedDays to calculate the EscalationDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getEscalationHours();
  
  
  /**
   * Gets the value of the EscalationInclDays field.
   * Which days to include in calculating the EscalationDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.IncludeDaysType getEscalationInclDays();
  
  
  /**
   * Gets the value of the EscalationStartPt field.
   * Which existing date on the activity or associated claim to use as the starting date for the EscalationDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StartPointType getEscalationStartPt();
  
  
  /**
   * Gets the value of the Importance field.
   * The importance level of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ImportanceLevel getImportance();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Priority field.
   * Priority of the activity with respect to other activities.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Priority getPriority();
  
  
  /**
   * Gets the value of the ShortSubject field.
   * Short subject field of the activity. For use in small areas e.g., a calendar event entry.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getShortSubject();
  
  
  /**
   * Gets the value of the ShortSubject_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern_ShortSubject_L10N[] getShortSubject_L10N_ARRAY();
  
  
  /**
   * Array association for partition ShortSubject_L10N_ARRAYByLanguage on array ShortSubject_L10N_ARRAY
   */
  public entity.ActivityPattern_ShortSubject_L10N getShortSubject_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Subject field.
   * Subject field of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubject();
  
  
  /**
   * Gets the value of the Subject_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern_Subject_L10N[] getSubject_L10N_ARRAY();
  
  
  /**
   * Array association for partition Subject_L10N_ARRAYByLanguage on array Subject_L10N_ARRAY
   */
  public entity.ActivityPattern_Subject_L10N getSubject_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the TargetBusCalLocPath field.
   * Location bean path to use for business calendar in calculating TargetDate, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTargetBusCalLocPath();
  
  
  /**
   * Gets the value of the TargetBusCalTag field.
   * Holiday tag code to use for business calendar in calculating TargetDate, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.HolidayTagCode getTargetBusCalTag();
  
  
  /**
   * Gets the value of the TargetDays field.
   * Used in conjunction with TargetStartPoint and TargetIncludedDays to calculate the ActionDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetDays();
  
  
  /**
   * Gets the value of the TargetHours field.
   * Used in conjunction with TargetStartPoint and TargetIncludedDays to calculate the ActionDate of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTargetHours();
  
  
  /**
   * Gets the value of the TargetIncludeDays field.
   * Which days to include in calculating the TargetDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.IncludeDaysType getTargetIncludeDays();
  
  
  /**
   * Gets the value of the TargetStartPoint field.
   * Which existing date on the activity or associated claim to use as the starting date for the TargetDate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StartPointType getTargetStartPoint();
  
  
  /**
   * Gets the value of the Type field.
   * Type of the activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityType getType();
  
  
  /**
   * Gets the value of the AutomatedOnly field.
   * True if the activity pattern is used only by automated additions to the workplan. If true, the pattern won't be shown as an option for users to choose in the application's interface.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAutomatedOnly();
  
  
  /**
   * Gets the value of the ClosedClaimAvlble field.
   * True if the activity pattern is available for closed claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClosedClaimAvlble();
  
  
  /**
   * Gets the value of the ExternallyOwned field.
   * Whether the activity is externally owned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExternallyOwned();
  
  
  /**
   * Gets the value of the Mandatory field.
   * Whether completion of the activity is mandatory.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMandatory();
  
  
  /**
   * Gets the value of the Recurring field.
   * Whether this activity is recurring.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRecurring();
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromDescription_L10N_ARRAY(entity.ActivityPattern_Description_L10N element);
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDescription_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ShortSubject_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromShortSubject_L10N_ARRAY(entity.ActivityPattern_ShortSubject_L10N element);
  
  
  /**
   * Removes the given element from the ShortSubject_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromShortSubject_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Subject_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromSubject_L10N_ARRAY(entity.ActivityPattern_Subject_L10N element);
  
  
  /**
   * Removes the given element from the Subject_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSubject_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ActivityClass field.
   */
  public void setActivityClass(typekey.ActivityClass value);
  
  
  /**
   * Sets the value of the AutomatedOnly field.
   */
  public void setAutomatedOnly(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Category field.
   */
  public void setCategory(typekey.ActivityCategory value);
  
  
  /**
   * Sets the value of the ClaimLossType field.
   */
  public void setClaimLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the ClosedClaimAvlble field.
   */
  public void setClosedClaimAvlble(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Code field.
   */
  public void setCode(java.lang.String value);
  
  
  /**
   * Sets the value of the Command field.
   */
  public void setCommand(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Description_L10N_ARRAY field.
   */
  public void setDescription_L10N_ARRAY(entity.ActivityPattern_Description_L10N[] value);
  
  
  /**
   * Sets the value of the DocumentTemplate field.
   */
  public void setDocumentTemplate(java.lang.String value);
  
  
  /**
   * Sets the value of the EmailTemplate field.
   */
  public void setEmailTemplate(java.lang.String value);
  
  
  /**
   * Sets the value of the EscBusCalLocPath field.
   */
  public void setEscBusCalLocPath(java.lang.String value);
  
  
  /**
   * Sets the value of the EscalationBusCalTag field.
   */
  public void setEscalationBusCalTag(typekey.HolidayTagCode value);
  
  
  /**
   * Sets the value of the EscalationDays field.
   */
  public void setEscalationDays(java.lang.Integer value);
  
  
  /**
   * Sets the value of the EscalationHours field.
   */
  public void setEscalationHours(java.lang.Integer value);
  
  
  /**
   * Sets the value of the EscalationInclDays field.
   */
  public void setEscalationInclDays(typekey.IncludeDaysType value);
  
  
  /**
   * Sets the value of the EscalationStartPt field.
   */
  public void setEscalationStartPt(typekey.StartPointType value);
  
  
  /**
   * Sets the value of the ExternallyOwned field.
   */
  public void setExternallyOwned(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Importance field.
   */
  public void setImportance(typekey.ImportanceLevel value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Mandatory field.
   */
  public void setMandatory(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(typekey.Priority value);
  
  
  /**
   * Sets the value of the Recurring field.
   */
  public void setRecurring(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ShortSubject field.
   */
  public void setShortSubject(java.lang.String value);
  
  
  /**
   * Sets the value of the ShortSubject_L10N_ARRAY field.
   */
  public void setShortSubject_L10N_ARRAY(entity.ActivityPattern_ShortSubject_L10N[] value);
  
  
  /**
   * Sets the value of the Subject field.
   */
  public void setSubject(java.lang.String value);
  
  
  /**
   * Sets the value of the Subject_L10N_ARRAY field.
   */
  public void setSubject_L10N_ARRAY(entity.ActivityPattern_Subject_L10N[] value);
  
  
  /**
   * Sets the value of the TargetBusCalLocPath field.
   */
  public void setTargetBusCalLocPath(java.lang.String value);
  
  
  /**
   * Sets the value of the TargetBusCalTag field.
   */
  public void setTargetBusCalTag(typekey.HolidayTagCode value);
  
  
  /**
   * Sets the value of the TargetDays field.
   */
  public void setTargetDays(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TargetHours field.
   */
  public void setTargetHours(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TargetIncludeDays field.
   */
  public void setTargetIncludeDays(typekey.IncludeDaysType value);
  
  
  /**
   * Sets the value of the TargetStartPoint field.
   */
  public void setTargetStartPoint(typekey.StartPointType value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.ActivityType value);
  
  
  
}