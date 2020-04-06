package gw.acc.iplm.enhancements


enhancement ECFBlobEnhancement: Blob {

  property get ContentString(): String {
    return this.toInputStream().TextContent
  }
}
