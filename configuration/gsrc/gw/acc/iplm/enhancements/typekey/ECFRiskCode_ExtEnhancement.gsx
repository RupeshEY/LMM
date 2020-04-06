package gw.acc.iplm.enhancements.typekey

/**
 * Enhancements for the ECFRiskCode_Ext typelist
 */
enhancement ECFRiskCode_ExtEnhancement : ECFRiskCode_Ext{

  property get UiDisplayDescription(): String {
    return this.Code + " - " + this.Description
  }

  /**
   * Returns all typekeys that belong to the provided ECFClassOfBusiness_Ext category.
   * If one is not provided, returns all typekeys.
   * @param cob The ECFClassOfBusiness_Ext to match the category
   * @return A List of all typekeys that either matched the category provided or all if no category given
   */
  public static function riskCodesByCOB(cob: ECFClassOfBusiness_Ext): List<ECFRiskCode_Ext> {
    if(cob != null){
      return typekey.ECFRiskCode_Ext.getTypeKeys(false).where(\riskCode -> riskCode.Categories.contains(cob))
    } else {
      return typekey.ECFRiskCode_Ext.getTypeKeys(false)
    }
  }
}