package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Note.eti;Note.eix;Note.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface NoteInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.note.impl.NoteCoreExtMethods, com.guidewire.cc.domain.relatedto.RelatedToBean, com.guidewire.pl.domain.note.NotePublicMethods, com.guidewire.pl.domain.note.impl.NoteInternalMethods {
  java.lang.String NOTEADDED_EVENT = "NoteAdded";
  
  java.lang.String NOTECHANGED_EVENT = "NoteChanged";
  
  java.lang.String NOTEREMOVED_EVENT = "NoteRemoved";
  
  /**
   * Gets the value of the Activity field.
   * The activity associated with the note.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity getActivity();
  
  
  public gw.pl.persistence.core.Key getActivityID();
  
  
  /**
   * Gets the value of the Author field.
   * User who wrote the note.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAuthor();
  
  
  public gw.pl.persistence.core.Key getAuthorID();
  
  
  /**
   * Gets the value of the AuthoringDate field.
   * Date on which the note was originally authored.  If null, the CreateTime seves this purpose.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAuthoringDate();
  
  
  /**
   * Gets the value of the Body field.
   * Body of the note.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBody();
  
  
  /**
   * Gets the value of the Claim field.
   * Associated claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimContact field.
   * Associated Claim Contact (either a person or a company).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Exposure field.
   * Associated exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the Language field.
   * The language in which this note is created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Matter field.
   * Associated matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Gets the value of the SecurityType field.
   * Type of note; used for access-restriction purposes
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NoteSecurityType getSecurityType();
  
  
  /**
   * Gets the value of the ServiceRequest field.
   * Associated service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest();
  
  
  public gw.pl.persistence.core.Key getServiceRequestID();
  
  
  /**
   * Gets the value of the Subject field.
   * Subject or summary of the note.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubject();
  
  
  /**
   * Gets the value of the Topic field.
   * Topic to which the note belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NoteTopicType getTopic();
  
  
  /**
   * Gets the value of the Confidential field.
   * Whether the note is confidential.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isConfidential();
  
  
  /**
   * Sets the value of the Activity field.
   */
  public void setActivity(entity.Activity value);
  
  
  public void setActivityID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Author field.
   */
  public void setAuthor(entity.User value);
  
  
  public void setAuthorID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AuthoringDate field.
   */
  public void setAuthoringDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Body field.
   */
  public void setBody(java.lang.String value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Confidential field.
   */
  public void setConfidential(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SecurityType field.
   */
  public void setSecurityType(typekey.NoteSecurityType value);
  
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value);
  
  
  public void setServiceRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subject field.
   */
  public void setSubject(java.lang.String value);
  
  
  /**
   * Sets the value of the Topic field.
   */
  public void setTopic(typekey.NoteTopicType value);
  
  
  
}