package gw.acc.iplm.utils

enum ECFIndicatorEnum {
  Y("Yes", "Y", true),
  N("No", "N", false),
  S("Small Claim", "S", null)

  public var _descriptiveName: String as IntegrationDisplayName
  public var _integrationCode: String as IntegrationCode
  public var _booleanValue: Boolean as BooleanValue

  private construct(descriptiveName: String, integrationCode: String, booleanValue: Boolean) {
    _descriptiveName = descriptiveName
    _integrationCode = integrationCode
    _booleanValue = booleanValue
  }

  /**
   * Finds the first matching {@link gw.acc.iplm.utils.ECFIndicatorEnum} based on
   * it's BooleanValue.
   *
   * @param {@link java.lang.Boolean} booleanValue
   * @return {@link gw.acc.iplm.utils.ECFIndicatorEnum}
   */
  static function findByBooleanValue(booleanValue: Boolean) : ECFIndicatorEnum {
    if(booleanValue == null){
      return null
    }
    return ECFIndicatorEnum.getAllValues().firstWhere(\elt -> elt.BooleanValue == booleanValue)
  }

  /**
   * Gets the boolean representation of the indicator String.
   *
   * @param {@link java.lang.String} indicatorValue
   * @return {@link boolean}
   */
  static function getBooleanValue(indicatorValue: String) : boolean {
    return indicatorValue == ECFIndicatorEnum.Y.IntegrationCode
  }

}