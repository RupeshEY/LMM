package gw.plugin.document.impl

uses gw.plugin.document.IDocumentContentSource
uses java.io.InputStream
uses gw.document.DocumentContentsInfo
uses java.util.Date
uses java.io.File
uses java.lang.StringBuffer
uses java.util.Calendar
uses gw.pl.util.FileUtil

/**
 *
 * IMPORTANT: This implementation is for Demo purpose only. Please do not modify it. Use it as an example for your
 * IDocumentContentSource implementation for the Synchronous case and define it in the SynchedContentSource for your
 * IDocumentContentSource.gwp.
 *
 * IDocumentContentSource implementation for synchronous document management.
 *
 */
@Export
class LocalDocumentContentSource extends BaseLocalDocumentContentSource implements IDocumentContentSource
{
  construct()
  {
  }

  override function addDocument(documentContents : InputStream, document : Document) : boolean {
    var docInfoWrapper = new DocumentInfoWrapper(document)
    var docUID : String
    if ((documentContents == null) && isDocument(document)) {
        docUID = getDocUID(docInfoWrapper)
    } else {
        docUID = addDocument(documentContents, docInfoWrapper)
        document.DateModified = Date.CurrentDate
    }
    document.DocUID = docUID
    return false
  }
  
  override function isDocument(document : Document) : boolean {
    if (document.getDocUID() != null) {
        var docFile = getDocumentFile(document.getDocUID(), true)
        return FileUtil.isFile(docFile) && docFile.exists()
    } else {
        return isDocumentFile(new DocumentInfoWrapper(document))
    }
  }
  
  override function getDocumentContentsInfo(document : Document, includeDocumentContents : boolean) : DocumentContentsInfo {
    var dci = getDocumentContents(document.getDocUID(), includeDocumentContents)
    dci.setResponseMimeType(document.getMimeType())
    return dci
  }
  
  override function getDocumentContentsInfoForExternalUse(document : Document) : DocumentContentsInfo {
    var dci = getExternalDocumentContents(document.getDocUID());
    dci.setResponseMimeType(document.getMimeType())
    return dci
  }

  override function updateDocument(document : Document, isDocument : InputStream) : boolean {
    updateDocument(document.getDocUID(), isDocument)
    document.DateModified = Date.CurrentDate
    return false
  }
  
  override function removeDocument(document : Document) : boolean {
    removeLinkToInfo(document.getDocUID())
    return false
  }

  /**
   * Class which wraps required information into an identifying token for document contents
   */
  static class DocumentInfoWrapper implements BaseLocalDocumentContentSource.IDocumentInfoWrapper {
    private var _docName : String

    private var _claimNumber : String

    private var _exposureID : int

    private var _claimantID : int

    public construct(document : Document) {
      var claim = document.Claim
      var exposure = document.getExposure()
      var claimant = document.getClaimant()
      _docName = document.Name
      _claimNumber = claim.getClaimNumber()
      _exposureID = (exposure == null ? -1 : exposure.getID().getValue()) as int
      _claimantID = (claimant == null ? -1 : claimant.getID().getValue()) as int
    }

    override function getDocumentName() : String {
        return _docName
    }

    override function getSubDirForDocument() : String {
        var strSubDir = new StringBuffer()
        var cal = Calendar.getInstance()
        cal.setTime(Date.CurrentDate)
        strSubDir.append(cal.get(Calendar.YEAR)).append(File.separator)
        strSubDir.append(cal.get(Calendar.MONTH)).append(File.separator)
        strSubDir.append(cal.get(Calendar.DAY_OF_MONTH)).append(File.separator)
        strSubDir.append(_claimNumber).append(File.separator)
        if (_exposureID > 0) {
            strSubDir.append("Exposure").append(_exposureID).append(File.separator)
        } else if (_claimantID > 0) {
            strSubDir.append("Claimant").append(_claimantID).append(File.separator)
        }
        return strSubDir.toString()
    }
 }

}
