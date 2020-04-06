package entity;

/**
 * MoneyMetricDelegate
 * Delegate used by money claim, exposure, and service request metrics to store a money value
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MoneyMetricDelegate.eti;MoneyMetricDelegate.eix;MoneyMetricDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface MoneyMetricDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MoneyMetricDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MoneyMetricDelegate>("entity.MoneyMetricDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONEYVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("MoneyValue", "MoneyValue");
  
  /**
   * The currency used for this metric
   * @return a currency, never null (unless the limit is new, uncommitted and not yet initialized)
   */
  public typekey.Currency getMoneyCurrency();
  
  
  /**
   * Gets the value of the MoneyValue field.
   * Money field to store the money value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMoneyValue();
  
  
  /**
   * Sets the value of the MoneyValue field.
   */
  public void setMoneyValue(gw.api.financials.CurrencyAmount value);
  
  
  
}