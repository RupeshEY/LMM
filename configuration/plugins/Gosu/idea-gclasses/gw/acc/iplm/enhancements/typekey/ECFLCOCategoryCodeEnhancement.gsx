package gw.acc.iplm.enhancements.typekey

enhancement ECFLCOCategoryCodeEnhancement: ECFLCOCategoryCode_Ext {

  property get UiDisplayDescription(): String {
    return this.Code + " - " + this.Description
  }
}
