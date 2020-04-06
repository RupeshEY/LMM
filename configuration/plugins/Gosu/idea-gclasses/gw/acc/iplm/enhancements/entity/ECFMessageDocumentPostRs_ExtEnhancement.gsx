package gw.acc.iplm.enhancements.entity

uses gw.api.database.Query
uses gw.api.database.Relop

enhancement ECFMessageDocumentPostRs_ExtEnhancement: ECFMessageDocumentPostRs_Ext {

  /**
   * Looks for the IMR document message that triggered this Post Rs.
   * The reason for this to be a property was that storing this as a field would cause a data model circular reference error.
   * @return ECFMessage_Ext - Message that triggered this Post Rs
   */
  property get ReferredMessage() : ECFDocumentMessage_Ext {
    return Query.make(ECFDocumentMessage_Ext).compare(ECFDocumentMessage_Ext#UUID, Relop.Equals, this.ReferredUUID).select().AtMostOneRow
  }

}
