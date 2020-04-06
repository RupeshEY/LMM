package gw.document

uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentProduction
uses gw.plugin.document.IDocumentTemplateDescriptor

@Export
public class DocumentCCContext extends BaseDocumentApplicationContext {
  private var _claim : Claim
  private var _initBlock : block(doc : entity.Document)
  private var _relatedToReadOnly : boolean
  private var _isECFClaim : boolean as ECFClaim

  construct(claim : Claim, initBlock : block(doc : entity.Document), relatedToReadOnly : boolean) {
    _claim = claim
    _initBlock = initBlock
    _relatedToReadOnly = relatedToReadOnly
    _isECFClaim = _claim.isECFVisible()
  }

  override function createDocumentDetailsHelper(documents : Document[]): DocumentDetailsApplicationHelper {
    return new DocumentDetailsCCHelper(documents, _relatedToReadOnly);
  }

  override function createDocumentCreationInfo(documentTemplateDescriptor : IDocumentTemplateDescriptor): DocumentCreationInfo {
    var dci = DocumentsUtil.createDocumentCreationInfo(_claim, documentTemplateDescriptor)
    if (documentTemplateDescriptor != null) {
      resetTemplateBasedInfo(dci, documentTemplateDescriptor)
    } else if (_initBlock != null) {
      _initBlock(dci.Document)
    }
    return dci
  }

  override public function resetTemplateBasedInfo(documentCreationInfo : DocumentCreationInfo,
                                                  documentTemplateDescriptor : IDocumentTemplateDescriptor) {
    if (documentTemplateDescriptor != null) {
      super.resetTemplateBasedInfo(documentCreationInfo, documentTemplateDescriptor)
      if(documentTemplateDescriptor.Language == null) {
        documentCreationInfo.Document.Language = null;
      }
    }
    if (_initBlock != null) {
      _initBlock(documentCreationInfo.Document)
    }
  }

  override function generateDocument(documentCreationInfo: DocumentCreationInfo) {
    var parameters = gw.document.DocumentsUtil.getDocumentCreationParameters(documentCreationInfo)
    var documentContentsInfo = Plugins.get(IDocumentProduction).
        createDocumentSynchronously(documentCreationInfo.DocumentTemplateDescriptor,
            parameters, documentCreationInfo.Document)
    DocumentsUtilBase.outputDocumentContents(documentCreationInfo, documentContentsInfo)
  }
}
