package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExpressionFragment.eti;ExpressionFragment.eix;ExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExpressionFragmentInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Adds the given element to the InCommandParameterArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInCommandParameterArray(entity.RuleCommandParameter element);
  
  
  /**
   * Adds the given element to the InFilteredIterableExpressionFragmentArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInFilteredIterableExpressionFragmentArray(entity.FilteredIterableExpressionFragmentJoin element);
  
  
  /**
   * Adds the given element to the InLeftConditionArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInLeftConditionArray(entity.RuleConditionLine element);
  
  
  /**
   * Adds the given element to the InListExpressionFragmentJoinArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInListExpressionFragmentJoinArray(entity.ListExpressionFragmentJoin element);
  
  
  /**
   * Adds the given element to the InRightConditionArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInRightConditionArray(entity.RuleConditionLine element);
  
  
  /**
   * Adds the given element to the InSumExpressionFragmentArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInSumExpressionFragmentArray(entity.SumExpressionFragmentJoin element);
  
  
  /**
   * Gets the value of the InCommandParameter field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCommandParameter getInCommandParameter();
  
  
  /**
   * Gets the value of the InCommandParameterArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleCommandParameter[] getInCommandParameterArray();
  
  
  public gw.pl.persistence.core.Key getInCommandParameterID();
  
  
  /**
   * Gets the value of the InFilteredIterableExpressionFragment field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FilteredIterableExpressionFragmentJoin getInFilteredIterableExpressionFragment();
  
  
  /**
   * Gets the value of the InFilteredIterableExpressionFragmentArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FilteredIterableExpressionFragmentJoin[] getInFilteredIterableExpressionFragmentArray();
  
  
  public gw.pl.persistence.core.Key getInFilteredIterableExpressionFragmentID();
  
  
  /**
   * Gets the value of the InLeftCondition field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleConditionLine getInLeftCondition();
  
  
  /**
   * Gets the value of the InLeftConditionArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleConditionLine[] getInLeftConditionArray();
  
  
  public gw.pl.persistence.core.Key getInLeftConditionID();
  
  
  /**
   * Gets the value of the InListExpressionFragmentJoin field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ListExpressionFragmentJoin getInListExpressionFragmentJoin();
  
  
  /**
   * Gets the value of the InListExpressionFragmentJoinArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ListExpressionFragmentJoin[] getInListExpressionFragmentJoinArray();
  
  
  public gw.pl.persistence.core.Key getInListExpressionFragmentJoinID();
  
  
  /**
   * Gets the value of the InRightCondition field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleConditionLine getInRightCondition();
  
  
  /**
   * Gets the value of the InRightConditionArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleConditionLine[] getInRightConditionArray();
  
  
  public gw.pl.persistence.core.Key getInRightConditionID();
  
  
  /**
   * Gets the value of the InSumExpressionFragment field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SumExpressionFragmentJoin getInSumExpressionFragment();
  
  
  /**
   * Gets the value of the InSumExpressionFragmentArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SumExpressionFragmentJoin[] getInSumExpressionFragmentArray();
  
  
  public gw.pl.persistence.core.Key getInSumExpressionFragmentID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExpressionFragment getSubtype();
  
  
  /**
   * Removes the given element from the InCommandParameterArray array. This is achieved by marking the element for removal.
   */
  public void removeFromInCommandParameterArray(entity.RuleCommandParameter element);
  
  
  /**
   * Removes the given element from the InCommandParameterArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInCommandParameterArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the InFilteredIterableExpressionFragmentArray array. This is achieved by marking the element for removal.
   */
  public void removeFromInFilteredIterableExpressionFragmentArray(entity.FilteredIterableExpressionFragmentJoin element);
  
  
  /**
   * Removes the given element from the InFilteredIterableExpressionFragmentArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInFilteredIterableExpressionFragmentArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the InLeftConditionArray array. This is achieved by marking the element for removal.
   */
  public void removeFromInLeftConditionArray(entity.RuleConditionLine element);
  
  
  /**
   * Removes the given element from the InLeftConditionArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInLeftConditionArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the InListExpressionFragmentJoinArray array. This is achieved by marking the element for removal.
   */
  public void removeFromInListExpressionFragmentJoinArray(entity.ListExpressionFragmentJoin element);
  
  
  /**
   * Removes the given element from the InListExpressionFragmentJoinArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInListExpressionFragmentJoinArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the InRightConditionArray array. This is achieved by marking the element for removal.
   */
  public void removeFromInRightConditionArray(entity.RuleConditionLine element);
  
  
  /**
   * Removes the given element from the InRightConditionArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInRightConditionArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the InSumExpressionFragmentArray array. This is achieved by marking the element for removal.
   */
  public void removeFromInSumExpressionFragmentArray(entity.SumExpressionFragmentJoin element);
  
  
  /**
   * Removes the given element from the InSumExpressionFragmentArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInSumExpressionFragmentArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the InCommandParameter field.
   */
  public void setInCommandParameter(entity.RuleCommandParameter value);
  
  
  /**
   * Sets the value of the InCommandParameterArray field.
   */
  public void setInCommandParameterArray(entity.RuleCommandParameter[] value);
  
  
  public void setInCommandParameterID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InFilteredIterableExpressionFragment field.
   */
  public void setInFilteredIterableExpressionFragment(entity.FilteredIterableExpressionFragmentJoin value);
  
  
  /**
   * Sets the value of the InFilteredIterableExpressionFragmentArray field.
   */
  public void setInFilteredIterableExpressionFragmentArray(entity.FilteredIterableExpressionFragmentJoin[] value);
  
  
  public void setInFilteredIterableExpressionFragmentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InLeftCondition field.
   */
  public void setInLeftCondition(entity.RuleConditionLine value);
  
  
  /**
   * Sets the value of the InLeftConditionArray field.
   */
  public void setInLeftConditionArray(entity.RuleConditionLine[] value);
  
  
  public void setInLeftConditionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InListExpressionFragmentJoin field.
   */
  public void setInListExpressionFragmentJoin(entity.ListExpressionFragmentJoin value);
  
  
  /**
   * Sets the value of the InListExpressionFragmentJoinArray field.
   */
  public void setInListExpressionFragmentJoinArray(entity.ListExpressionFragmentJoin[] value);
  
  
  public void setInListExpressionFragmentJoinID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InRightCondition field.
   */
  public void setInRightCondition(entity.RuleConditionLine value);
  
  
  /**
   * Sets the value of the InRightConditionArray field.
   */
  public void setInRightConditionArray(entity.RuleConditionLine[] value);
  
  
  public void setInRightConditionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InSumExpressionFragment field.
   */
  public void setInSumExpressionFragment(entity.SumExpressionFragmentJoin value);
  
  
  /**
   * Sets the value of the InSumExpressionFragmentArray field.
   */
  public void setInSumExpressionFragmentArray(entity.SumExpressionFragmentJoin[] value);
  
  
  public void setInSumExpressionFragmentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ExpressionFragment value);
  
  
  
}