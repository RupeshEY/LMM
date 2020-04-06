package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SegmentationResult.eti;SegmentationResult.eix;SegmentationResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SegmentationResultInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.segmentation.entity.SegmentationResult {
  /**
   * Gets the value of the SegmentType field.
   * The type of segment for a claim.<br> For example: <tt>auto_low</tt> means "Auto - low complexity"
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSegmentType();
  
  
  /**
   * Gets the value of the StrategyType field.
   * The type of strategy for a claim.<br> For example: <tt>auto_fast</t> means "Auto - Fast Track"
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStrategyType();
  
  
  /**
   * Sets the value of the SegmentType field.
   */
  public void setSegmentType(java.lang.String value);
  
  
  /**
   * Sets the value of the StrategyType field.
   */
  public void setStrategyType(java.lang.String value);
  
  
  
}