package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GroupSearchCriteria.eti;GroupSearchCriteria.eix;GroupSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GroupSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.community.GroupSearchCriteriaPublicMethods, com.guidewire.pl.domain.community.impl.GroupSearchCriteriaInternalMethods, java.io.Serializable {
  /**
   * Gets the value of the GroupName field.
   * Group name to search for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGroupName();
  
  
  /**
   * Gets the value of the GroupNameKanji field.
   * Group name to search for in kanji (used only for Japanese).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGroupNameKanji();
  
  
  /**
   * Gets the value of the GroupType field.
   * Group type to search for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GroupType getGroupType();
  
  
  /**
   * Gets the value of the Organization field.
   * Organization that the group belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Organization getOrganization();
  
  
  public gw.pl.persistence.core.Key getOrganizationID();
  
  
  /**
   * Gets the value of the ParentGroup field.
   * Group parent to search for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getParentGroup();
  
  
  public gw.pl.persistence.core.Key getParentGroupID();
  
  
  /**
   * Gets the value of the ExcludeRootGroup field.
   * Whether to exclude the root group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExcludeRootGroup();
  
  
  /**
   * Sets the value of the ExcludeRootGroup field.
   */
  public void setExcludeRootGroup(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the GroupName field.
   */
  public void setGroupName(java.lang.String value);
  
  
  /**
   * Sets the value of the GroupNameKanji field.
   */
  public void setGroupNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the GroupType field.
   */
  public void setGroupType(typekey.GroupType value);
  
  
  /**
   * Sets the value of the Organization field.
   */
  public void setOrganization(entity.Organization value);
  
  
  public void setOrganizationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ParentGroup field.
   */
  public void setParentGroup(entity.Group value);
  
  
  public void setParentGroupID(gw.pl.persistence.core.Key value);
  
  
  
}