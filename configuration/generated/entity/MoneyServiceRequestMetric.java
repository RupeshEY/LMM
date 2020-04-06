package entity;

/**
 * MoneyServiceRequestMetric
 * Money based service request metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MoneyServiceRequestMetric.eti;MoneyServiceRequestMetric.eix;MoneyServiceRequestMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class MoneyServiceRequestMetric extends entity.ServiceRequestMetric implements entity.MoneyMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MoneyServiceRequestMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MoneyServiceRequestMetric>("entity.MoneyServiceRequestMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MONEYVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MoneyValue");
  
  protected MoneyServiceRequestMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.MoneyServiceRequestMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.MoneyServiceRequestMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.MoneyServiceRequestMetricInternal)super.__getInternalInterface();
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
    com.guidewire._generated.entity.MoneyServiceRequestMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.MoneyServiceRequestMetric, com.guidewire._generated.entity.MoneyServiceRequestMetricInternal>() {
      public java.lang.Object getImplementation(entity.MoneyServiceRequestMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MoneyServiceRequestMetricInternal getInternalInterface(entity.MoneyServiceRequestMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}