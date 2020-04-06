package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs

enhancement ECFRepositoryOperationRsEnhancement: RepositoryOperationRs {
  property get UCR(): String {
    return this.DocumentList?.first()?.DocumentItem?.first()?.ReferredObjects?.Claim?.BrokerReference
  }

  property get TR(): String {
    return this.DocumentList?.first()?.DocumentItem?.first()?.ReferredObjects?.ClaimEntry?.BrokerReference
  }

  property get UMR(): String {
    return this.DocumentList?.first()?.DocumentItem?.first()?.ReferredObjects?.Contract?.BrokerReference
  }

  /**
   * For Download and Upload, this returns the Document from the message
   * For Search, this returns the <b>First</b> Document from the message
   */
  property get Document() : gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document {
    return this.DocumentList?.first()?.DocumentItem?.first()?.Document
  }

}
