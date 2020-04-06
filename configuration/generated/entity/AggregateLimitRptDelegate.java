package entity;

/**
 * AggregateLimitRptDelegate
 * 
 *     Common state and behavior shared by both the AggregateLimitRpt and ClaimAggregateLimitRpt entities. These
 *     entities contain denormalized AggregateLimit amount used values
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AggregateLimitRptDelegate.eti;AggregateLimitRptDelegate.eix;AggregateLimitRptDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface AggregateLimitRptDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AggregateLimitRptDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AggregateLimitRptDelegate>("entity.AggregateLimitRptDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> AGGLIMITCALCCRITERIA_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("AggLimitCalcCriteria", "AggLimitCalcCriteria");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> COVERAGELINE_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("CoverageLine", "CoverageLineID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LIMITTYPE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("LimitType", "LimitType");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LIMITUSED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("LimitUsed", "LimitUsed");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> POLICYPERIOD_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("PolicyPeriod", "PolicyPeriodID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VALID_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Valid", "Valid");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> VALUETYPE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("ValueType", "ValueType");
  
  /**
   * Gets the value of the AggLimitCalcCriteria field.
   * Exclusions for limit used calculations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggLimitCalcCriteria getAggLimitCalcCriteria();
  
  
  /**
   * Returns the currency specified by the policy period's claim currency property. All claims in a policy period
   * are guaranteed to have the same currency.
   * @return a currency, possibly null
   */
  public typekey.Currency getClaimCurrency();
  
  
  /**
   * Gets the value of the CoverageLine field.
   * The associated coverage line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLine getCoverageLine();
  
  
  /**
   * Gets the value of the LimitType field.
   * Aggregate limit type: by loss date or by reported date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateLimitType getLimitType();
  
  
  /**
   * Gets the value of the LimitUsed field.
   * The amount of the limit that has been used that is tracked within ClaimCenter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLimitUsed();
  
  
  /**
   * Gets the value of the PolicyPeriod field.
   * PolicyPeriod with which the aggregate limit is associated. This property exists because CoverageLine may be null; when CoverageLine is not null, it must equal CoverageLine.PolicyPeriodID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyPeriod getPolicyPeriod();
  
  
  /**
   * Gets the value of the ValueType field.
   * Aggregate type: limit or deductible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AggregateType getValueType();
  
  
  /**
   * Gets the value of the Valid field.
   * Indicates if the limit used is up-to-date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isValid();
  
  
  /**
   * Sets the value of the AggLimitCalcCriteria field.
   */
  public void setAggLimitCalcCriteria(typekey.AggLimitCalcCriteria value);
  
  
  /**
   * Sets the value of the CoverageLine field.
   */
  public void setCoverageLine(entity.CoverageLine value);
  
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.AggregateLimitType value);
  
  
  /**
   * Sets the value of the PolicyPeriod field.
   */
  public void setPolicyPeriod(entity.PolicyPeriod value);
  
  
  /**
   * Sets the value of the Valid field.
   */
  public void setValid(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ValueType field.
   */
  public void setValueType(typekey.AggregateType value);
  
  
  
}