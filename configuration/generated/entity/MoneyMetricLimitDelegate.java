package entity;

/**
 * MoneyMetricLimitDelegate
 * Delegate used by money claim and exposure metric limits
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MoneyMetricLimitDelegate.eti;MoneyMetricLimitDelegate.eix;MoneyMetricLimitDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface MoneyMetricLimitDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MoneyMetricLimitDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MoneyMetricLimitDelegate>("entity.MoneyMetricLimitDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONEYREDVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("MoneyRedValue", "MoneyRedValue");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONEYTARGETVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("MoneyTargetValue", "MoneyTargetValue");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONEYYELLOWVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("MoneyYellowValue", "MoneyYellowValue");
  
  /**
   * The currency used for the yellow, red and target values
   * @return a currency, never null (unless the limit is new, uncommited and not yet initialized)
   */
  public typekey.Currency getMoneyCurrency();
  
  
  /**
   * Get the red money value and metric Currency as an IMoney.
   * This is for editing in the UI only.
   */
  public gw.api.financials.IMoney getMoneyRedAmountComponent();
  
  
  /**
   * Gets the value of the MoneyRedValue field.
   * Money field to store the red value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMoneyRedValue();
  
  
  /**
   * Get the target money value and metric Currency as an IMoney.
   * This is for editing in the UI only.
   */
  public gw.api.financials.IMoney getMoneyTargetAmountComponent();
  
  
  /**
   * Gets the value of the MoneyTargetValue field.
   * Money field to store the target value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMoneyTargetValue();
  
  
  /**
   * Get the yellow money value and metric Currency as an IMoney.
   * This is for editing in the UI only.
   */
  public gw.api.financials.IMoney getMoneyYellowAmountComponent();
  
  
  /**
   * Gets the value of the MoneyYellowValue field.
   * Money field to store the yellow value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMoneyYellowValue();
  
  
  /**
   * Sets the value of the MoneyRedValue field.
   */
  public void setMoneyRedValue(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the MoneyTargetValue field.
   */
  public void setMoneyTargetValue(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the MoneyYellowValue field.
   */
  public void setMoneyYellowValue(gw.api.financials.CurrencyAmount value);
  
  
  
}