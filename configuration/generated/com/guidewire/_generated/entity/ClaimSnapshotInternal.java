package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimSnapshot.eti;ClaimSnapshot.eix;ClaimSnapshot.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimSnapshotInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.ClaimSnapshot {
  /**
   * Gets the value of the Claim field.
   * Main Claim object whose snapshot is being stored.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimData field.
   * The ClaimData object, stored as XML.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimData();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the EncryptionVersion field.
   * The version of encryption
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getEncryptionVersion();
  
  
  /**
   * Gets the value of the SnapshotDate field.
   * Date on which this snapshot was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSnapshotDate();
  
  
  /**
   * Gets the value of the Compressed field.
   * Indicates whether or not the claim data is compressed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCompressed();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimData field.
   */
  public void setClaimData(java.lang.String value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Compressed field.
   */
  public void setCompressed(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the EncryptionVersion field.
   */
  public void setEncryptionVersion(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SnapshotDate field.
   */
  public void setSnapshotDate(java.util.Date value);
  
  
  
}