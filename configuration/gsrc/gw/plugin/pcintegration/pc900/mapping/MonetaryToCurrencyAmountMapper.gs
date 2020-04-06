package gw.plugin.pcintegration.pc900.mapping

uses gw.plugin.integration.mapping.IFieldMapper
uses gw.api.util.mapping.ObjectConverter
uses gw.lang.reflect.IPropertyInfo
uses gw.pl.currency.MonetaryAmount
uses gw.api.financials.CurrencyAmount
uses java.lang.IllegalArgumentException
uses gw.xml.XmlElement
uses java.lang.RuntimeException

/**
 * Mapper for mapping <code>gw.pl.currency.MonetaryAmount</code> to
 * <code>gw.api.financials.CurrencyAmount</code>
 */
@Export
class MonetaryToCurrencyAmountMapper implements IFieldMapper {

  override function mapField(converter : ObjectConverter,
                             source : Object,
                             target : Object,
                             sourceProperty : IPropertyInfo) {

    if(not gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(MonetaryAmount.Type, sourceProperty.FeatureType)) {
      throw new IllegalArgumentException("Source property ${sourceProperty.Name} of type ${sourceProperty.FeatureType} is not a ${typeof MonetaryAmount}")
    }
    var sourceVal = getMonetaryAmtFromSrc(source, sourceProperty.Name)
    var targetProperty = (typeof target).TypeInfo.getProperty(sourceProperty.Name)
    if(not gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(gw.api.financials.CurrencyAmount.Type, targetProperty.FeatureType)) {
      throw new IllegalArgumentException("Target property ${sourceProperty.Name} of type ${sourceProperty.FeatureType} is not a ${typeof MonetaryAmount}")
    }
    if(sourceVal!=null) {
      var currencyAmount = new CurrencyAmount(sourceVal.Amount, sourceVal.Currency)
      target[sourceProperty.Name] = currencyAmount
    }
  }

  private function getMonetaryAmtFromSrc(source:Object, propertyName:String) : MonetaryAmount {
    var monetaryAmt:MonetaryAmount = null
    var prop = (typeof source).TypeInfo.getProperty(propertyName)
    if(prop!=null and gw.api.util.TypeUtil.isNominallyOrStructurallyAssignable(MonetaryAmount.Type, prop.FeatureType)) {
      monetaryAmt = prop.Accessor.getValue(source) as MonetaryAmount
    } else if(source typeis XmlElement) {
      var valStr = source.getAttributeValue(propertyName)
      if(valStr!=null) {
         monetaryAmt = new MonetaryAmount(valStr)
      }
    } else {
      throw new RuntimeException("Unable to get ${MonetaryAmount} value from ${typeof source} and property ${propertyName}")
    }
    return monetaryAmt
  }
}