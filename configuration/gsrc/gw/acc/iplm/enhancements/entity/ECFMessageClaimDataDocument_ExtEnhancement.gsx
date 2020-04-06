package gw.acc.iplm.enhancements.entity

enhancement ECFMessageClaimDataDocument_ExtEnhancement: ECFMessageClaimDataDocument_Ext {

  /**
   * Size property, combining the file size with the unit of measure
   */
  property get Size(): String {
    return (this.FileSize == null ? "" : this.FileSize.toString())
        + (this.FileSizeUnit == null ? "" : ' ' + this.FileSizeUnit.DisplayName.toString())
  }
}
