package entity;

/**
 * MoneyClaimMetric
 * Money based claim metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MoneyClaimMetric.eti;MoneyClaimMetric.eix;MoneyClaimMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class MoneyClaimMetric extends entity.ClaimMetric implements entity.MoneyMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MoneyClaimMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MoneyClaimMetric>("entity.MoneyClaimMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONEYVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MoneyValue");
  
  protected MoneyClaimMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.MoneyClaimMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.MoneyClaimMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.MoneyClaimMetricInternal)super.__getInternalInterface();
  }
  
  /**
   * The currency used for this metric
   * @return a currency, never null (unless the limit is new, uncommitted and not yet initialized)
   */
  public typekey.Currency getMoneyCurrency() {
    return ((gw.cc.metric.entity.MoneyMetricDelegate)__getDelegateManager().getImplementation("gw.cc.metric.entity.MoneyMetricDelegate")).getMoneyCurrency();
  }
  
  /**
   * Gets the value of the MoneyValue field.
   * Money field to store the money value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMoneyValue() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(MONEYVALUE_PROP.get());
  }
  
  /**
   * Sets the value of the MoneyValue field.
   */
  public void setMoneyValue(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(MONEYVALUE_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.MoneyClaimMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.MoneyClaimMetric, com.guidewire._generated.entity.MoneyClaimMetricInternal>() {
      public java.lang.Object getImplementation(entity.MoneyClaimMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MoneyClaimMetricInternal getInternalInterface(entity.MoneyClaimMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}