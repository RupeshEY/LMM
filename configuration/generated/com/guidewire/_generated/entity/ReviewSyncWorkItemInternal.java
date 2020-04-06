package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReviewSyncWorkItem.eti;ReviewSyncWorkItem.eix;ReviewSyncWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReviewSyncWorkItemInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.WorkItemInternal, gw.cc.contact.entity.ReviewSyncWorkItem {
  /**
   * Gets the value of the Review field.
   * Review to be transmitted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Review getReview();
  
  
  public gw.pl.persistence.core.Key getReviewID();
  
  
  /**
   * Sets the value of the Review field.
   */
  public void setReview(entity.Review value);
  
  
  public void setReviewID(gw.pl.persistence.core.Key value);
  
  
  
}