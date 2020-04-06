package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialistService.eti;SpecialistService.eix;SpecialistService.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SpecialistServiceInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.pl.domain.vendormanagement.SpecialistServicePublicMethods {
  /**
   * Adds the given element to the ChildSpecialistServiceParents array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToChildSpecialistServiceParents(entity.SpecialistServiceParent element);
  
  
  /**
   * Adds the given element to the CompatibleIncidentTypes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCompatibleIncidentTypes(entity.SpecialistServiceCompatibleIncidentType element);
  
  
  /**
   * Adds the given element to the CompatibleKinds array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCompatibleKinds(entity.SpecialistServiceCompatibleServiceRequestKind element);
  
  
  /**
   * Adds the given element to the Description_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDescription_L10N_ARRAY(entity.SpecialistService_Description_L10N element);
  
  
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.SpecialistService_Name_L10N element);
  
  
  /**
   * Adds the given element to the SpecialistServiceParentArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSpecialistServiceParentArray(entity.SpecialistServiceParent element);
  
  
  /**
   * Gets the value of the ChildSpecialistServiceParents field.
   * Array of SpecialistServiceParents corresponding to SpecialistServices for which this is the Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistServiceParent[] getChildSpecialistServiceParents();
  
  
  /**
   * Gets the value of the Code field.
   * Unique string identifying this service.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCode();
  
  
  /**
   * Gets the value of the CompatibleIncidentTypes field.
   * The SpecialistServiceCompatibleIncidentTypes indicating the Incident types with which this service is compatible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistServiceCompatibleIncidentType[] getCompatibleIncidentTypes();
  
  
  /**
   * Gets the value of the CompatibleKinds field.
   * The SpecialistServiceCompatibleServiceRequestKinds indicating the Kinds with which this service is compatible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistServiceCompatibleServiceRequestKind[] getCompatibleKinds();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the service.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Description_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService_Description_L10N[] getDescription_L10N_ARRAY();
  
  
  /**
   * Array association for partition Description_L10N_ARRAYByLanguage on array Description_L10N_ARRAY
   */
  public entity.SpecialistService_Description_L10N getDescription_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Name field.
   * Name of the service.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.SpecialistService_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Parent field.
   * Reference to the parent SpecialistService.  Null for top level nodes, which have no parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService getParent();
  
  
  public gw.pl.persistence.core.Key getParentID();
  
  
  /**
   * Gets the value of the SpecialistServiceParentArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistServiceParent[] getSpecialistServiceParentArray();
  
  
  /**
   * Gets the value of the Active field.
   * Indicates whether the service should be used for new service requests.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActive();
  
  
  /**
   * Removes the given element from the ChildSpecialistServiceParents array. This is achieved by marking the element for removal.
   */
  public void removeFromChildSpecialistServiceParents(entity.SpecialistServiceParent element);
  
  
  /**
   * Removes the given element from the ChildSpecialistServiceParents array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromChildSpecialistServiceParents(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the CompatibleIncidentTypes array. This is achieved by marking the element for removal.
   */
  public void removeFromCompatibleIncidentTypes(entity.SpecialistServiceCompatibleIncidentType element);
  
  
  /**
   * Removes the given element from the CompatibleIncidentTypes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCompatibleIncidentTypes(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the CompatibleKinds array. This is achieved by marking the element for removal.
   */
  public void removeFromCompatibleKinds(entity.SpecialistServiceCompatibleServiceRequestKind element);
  
  
  /**
   * Removes the given element from the CompatibleKinds array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCompatibleKinds(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromDescription_L10N_ARRAY(entity.SpecialistService_Description_L10N element);
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDescription_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.SpecialistService_Name_L10N element);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SpecialistServiceParentArray array. This is achieved by marking the element for removal.
   */
  public void removeFromSpecialistServiceParentArray(entity.SpecialistServiceParent element);
  
  
  /**
   * Removes the given element from the SpecialistServiceParentArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSpecialistServiceParentArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Active field.
   */
  public void setActive(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ChildSpecialistServiceParents field.
   */
  public void setChildSpecialistServiceParents(entity.SpecialistServiceParent[] value);
  
  
  /**
   * Sets the value of the Code field.
   */
  public void setCode(java.lang.String value);
  
  
  /**
   * Sets the value of the CompatibleIncidentTypes field.
   */
  public void setCompatibleIncidentTypes(entity.SpecialistServiceCompatibleIncidentType[] value);
  
  
  /**
   * Sets the value of the CompatibleKinds field.
   */
  public void setCompatibleKinds(entity.SpecialistServiceCompatibleServiceRequestKind[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Description_L10N_ARRAY field.
   */
  public void setDescription_L10N_ARRAY(entity.SpecialistService_Description_L10N[] value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  public void setName_L10N_ARRAY(entity.SpecialistService_Name_L10N[] value);
  
  
  /**
   * Sets the value of the Parent field.
   */
  public void setParent(entity.SpecialistService value);
  
  
  public void setParentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SpecialistServiceParentArray field.
   */
  public void setSpecialistServiceParentArray(entity.SpecialistServiceParent[] value);
  
  
  
}