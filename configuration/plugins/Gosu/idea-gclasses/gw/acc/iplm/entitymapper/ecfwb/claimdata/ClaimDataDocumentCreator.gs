package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_SupportingDocument
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_SupportingDocument

class ClaimDataDocumentCreator {

  public static function createDocuments(final ecfMessage: ECFMessageClaimData_Ext, claimMessageDTO: ClaimMessageDTO) {
    if (claimMessageDTO.ClaimNotifyEventRq != null) {
      claimMessageDTO.ClaimNotifyEventRq.SupportingDocument.each(\xmlDoc -> {
        var doc = convertDocument(xmlDoc, null)
        doc.ECFMsg = ecfMessage
      })
    }

    if (claimMessageDTO.ClaimRetrieveRs != null) {
      claimMessageDTO.ClaimRetrieveRs.SupportingDocument.each(\xmlDoc -> {
        var doc = convertDocument(null, xmlDoc)
        doc.ECFMsg = ecfMessage
      })
    }
  }

  private static function convertDocument(final claimNotifyDoc: ClaimNotifyEventRqType_SupportingDocument,
                                          final retrieveClaimRsDoc: RetrieveClaimRs_SupportingDocument): ECFMessageClaimDataDocument_Ext {
    final var doc = new ECFMessageClaimDataDocument_Ext()
    doc.Version = claimNotifyDoc.DocumentVersion?:retrieveClaimRsDoc.DocumentVersion
    doc.DocumentId = claimNotifyDoc.DocumentId?:retrieveClaimRsDoc.DocumentId
    doc.Reference = claimNotifyDoc.DocumentReference?:retrieveClaimRsDoc.DocumentReference
    doc.Description = claimNotifyDoc.Description?:retrieveClaimRsDoc.Description
    doc.VersionDate = (claimNotifyDoc.DocumentVersionDtTime?.toCalendar().getTime())?:(retrieveClaimRsDoc.DocumentVersionDtTime?.toCalendar().getTime())
    doc.DocType = IMRDocumentType_Ext.AllTypeKeys.firstWhere(\elt -> elt.Name == (claimNotifyDoc.DocumentTypeCd?:retrieveClaimRsDoc.DocumentTypeCd))
    doc.FileFormat = ECFFileFormat_Ext.AllTypeKeys.firstWhere(\elt -> elt.Name == (claimNotifyDoc.FileFormatCd?:retrieveClaimRsDoc.FileFormatCd))
    doc.FileSizeUnit = ECFMsgNotifRqDocSizeUnit_Ext.get((claimNotifyDoc?.FileSize?.UnitMeasurementCd?.toLowerCase())
        ?:(retrieveClaimRsDoc?.FileSize?.UnitMeasurementCd?.toLowerCase()))
    doc.FileSize = claimNotifyDoc?.FileSize.NumUnits?:retrieveClaimRsDoc?.FileSize.NumUnits
    return doc
  }
}