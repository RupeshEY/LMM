package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Review.eti;Review.eix;Review.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReviewInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.contact.impl.ReviewInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.contact.entity.Review {
  /**
   * Adds the given element to the CategoryScores array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCategoryScores(entity.ReviewCategoryScore element);
  
  
  /**
   * Adds the given element to the QuestionAnswerSets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToQuestionAnswerSets(entity.ReviewQAnswerSet element);
  
  
  /**
   * Gets the value of the AddressBookUID field.
   * Represents the ID of the associated ReviewSummary in Address Book. Null if the object is not linked to Address Book.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressBookUID();
  
  
  /**
   * Gets the value of the CategoryScores field.
   * List of categories and their scores, associated with this Review.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReviewCategoryScore[] getCategoryScores();
  
  
  /**
   * Gets the value of the Claim field.
   * Associated Claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments about the Review
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the Contact field.
   * Associated Contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the Description field.
   * Description ofthe accident or loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * Short name of this review type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the QuestionAnswerSets field.
   * List of Question set/Answer Set pairs, and their assigned categories, associated with this Review.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReviewQAnswerSet[] getQuestionAnswerSets();
  
  
  /**
   * Gets the value of the RelatedTo field.
   * Detailed description of this review type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRelatedTo();
  
  
  /**
   * Gets the value of the ReviewType field.
   * Associated ReviewType.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReviewType getReviewType();
  
  
  public gw.pl.persistence.core.Key getReviewTypeID();
  
  
  /**
   * Gets the value of the ReviewedBy field.
   * User who created the review
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getReviewedBy();
  
  
  public gw.pl.persistence.core.Key getReviewedByID();
  
  
  /**
   * Gets the value of the Score field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getScore();
  
  
  /**
   * Gets the value of the ServiceDate field.
   * Date of the service being reviewed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServiceDate();
  
  
  /**
   * Gets the value of the ServiceType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReviewServiceType getServiceType();
  
  
  /**
   * Gets the value of the Subcontact field.
   * Optionally associated sub-Contact (Service Person or similar).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubcontact();
  
  
  /**
   * Gets the value of the Completed field.
   * Boolean field to mark a review as completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCompleted();
  
  
  /**
   * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
   */
  public void removeFromCategoryScores(entity.ReviewCategoryScore element);
  
  
  /**
   * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCategoryScores(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the QuestionAnswerSets array. This is achieved by marking the element for removal.
   */
  public void removeFromQuestionAnswerSets(entity.ReviewQAnswerSet element);
  
  
  /**
   * Removes the given element from the QuestionAnswerSets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromQuestionAnswerSets(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AddressBookUID field.
   */
  public void setAddressBookUID(java.lang.String value);
  
  
  /**
   * Sets the value of the CategoryScores field.
   */
  public void setCategoryScores(entity.ReviewCategoryScore[] value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the Completed field.
   */
  public void setCompleted(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the QuestionAnswerSets field.
   */
  public void setQuestionAnswerSets(entity.ReviewQAnswerSet[] value);
  
  
  /**
   * Sets the value of the RelatedTo field.
   */
  public void setRelatedTo(java.lang.String value);
  
  
  /**
   * Sets the value of the ReviewType field.
   */
  public void setReviewType(entity.ReviewType value);
  
  
  public void setReviewTypeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ReviewedBy field.
   */
  public void setReviewedBy(entity.User value);
  
  
  public void setReviewedByID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Score field.
   */
  public void setScore(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ServiceDate field.
   */
  public void setServiceDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ServiceType field.
   */
  public void setServiceType(typekey.ReviewServiceType value);
  
  
  /**
   * Sets the value of the Subcontact field.
   */
  public void setSubcontact(java.lang.String value);
  
  
  
}