package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Citation.eti;Citation.eix;Citation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CitationInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.Citation {
  /**
   * Gets the value of the CitationAuthority field.
   * Authority who issued the citation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCitationAuthority();
  
  
  /**
   * Gets the value of the CitationCode field.
   * Citation code.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCitationCode();
  
  
  /**
   * Gets the value of the CitationNumber field.
   * The ticket number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCitationNumber();
  
  
  /**
   * Gets the value of the CitationType field.
   * The type of citation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CitationType getCitationType();
  
  
  /**
   * Gets the value of the Incident field.
   * The incident to which this Citation belongs.
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
   * Sets the value of the CitationAuthority field.
   */
  public void setCitationAuthority(java.lang.String value);
  
  
  /**
   * Sets the value of the CitationCode field.
   */
  public void setCitationCode(java.lang.String value);
  
  
  /**
   * Sets the value of the CitationNumber field.
   */
  public void setCitationNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CitationType field.
   */
  public void setCitationType(typekey.CitationType value);
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.Incident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}