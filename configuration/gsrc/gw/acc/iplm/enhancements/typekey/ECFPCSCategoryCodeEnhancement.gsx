package gw.acc.iplm.enhancements.typekey

enhancement ECFPCSCategoryCodeEnhancement: ECFPCSCategoryCode_Ext {

  property get UiDisplayDescription(): String {
    return this.Code + " - " + this.Description
  }
}
