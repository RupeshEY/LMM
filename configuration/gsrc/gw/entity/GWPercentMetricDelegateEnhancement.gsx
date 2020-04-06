package gw.entity
uses gw.api.locale.DisplayKey
uses java.math.BigDecimal
uses java.text.NumberFormat
uses gw.datatype.DataTypes
uses gw.api.util.Math

@Export
enhancement GWPercentMetricDelegateEnhancement : entity.PercentMetricDelegate {

  function getApplicableDisplayValue(value : BigDecimal) : String {
    var absValue = value.abs()
    // Force scale to 2 for this last division; Java percent format only shows 2 digits
    var absRatio : Object = absValue.divide(BigDecimal.valueOf(100 as long), 2, HALF_UP)
    var percentValue = NumberFormat.getPercentInstance().format(absRatio)
    return value < 0 ? DisplayKey.get("Web.Metric.NegativeValue", percentValue) : percentValue
  }
  
  function fractionToPercentage(numerator : BigDecimal, denominator : BigDecimal) : BigDecimal {
    var type = DataTypes.get("percentagemetric", {}).asConstrainedDataType()
    var percentageDecScale = type.getScale( null, null )
    var percentageDecPrecision = type.getPrecision( null, null )
    // keep two digits beyond what the datatype allows because we'll multiply by 100 to convert the ratio to a percentage
    var ratio = numerator.divide(denominator, 2 + Math.Nz(percentageDecScale), HALF_UP)
    ratio = ratio.movePointRight( 2 )
    if (ratio.precision() > percentageDecPrecision) {
      // if the number is too large, clip it at the maximum value allowed by the field (e.g., 999999.99)
      ratio = new BigDecimal(1).movePointRight(percentageDecPrecision).subtract(1).movePointLeft(percentageDecScale)
    }
    return ratio
  }

}
