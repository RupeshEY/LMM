package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BudgetLine.eti;BudgetLine.eix;BudgetLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BudgetLineInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.matter.entity.BudgetLine {
  /**
   * Gets the value of the BudgetLineType field.
   * Budget line type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LineCategory getBudgetLineType();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Matter field.
   * Related matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Gets the value of the OriginalEstimate field.
   * Original budget estimate
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOriginalEstimate();
  
  
  /**
   * Sets the value of the BudgetLineType field.
   */
  public void setBudgetLineType(typekey.LineCategory value);
  
  
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
   * Sets the value of the OriginalEstimate field.
   */
  public void setOriginalEstimate(gw.api.financials.CurrencyAmount value);
  
  
  
}