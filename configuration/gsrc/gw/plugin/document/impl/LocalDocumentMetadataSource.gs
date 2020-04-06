package gw.plugin.document.impl
uses gw.api.locale.DisplayKey
uses gw.plugin.document.IDocumentMetadataSource
uses gw.api.util.DisplayableException
uses java.util.Map
uses gw.plugin.util.RemotableSearchResultSpec
uses gw.plugin.InitializablePlugin
uses java.io.File
uses java.io.IOException
uses java.lang.RuntimeException
uses java.lang.Exception
uses gw.document.DocumentsUtilBase

/**
 *
 * IMPORTANT: This implementation is for Demo purpose only. Please do not modify it. Use it as an example for your
 * IDocumentMetadataSource implementation and define it in the plugin-gosu for your
 * IDocumentMetadataSource.gwp.
 *
 * IDocumentMetadataSource implementation for document management.
 *
 * This plugin assumes that the validations for the original fields of the Document entity
 * are done at the UI level outside of the plugin.
 */
@Export
class LocalDocumentMetadataSource extends BaseLocalDocumentMetadataSource  
  implements IDocumentMetadataSource, InitializablePlugin {
  var _defaultResultSpec : RemotableSearchResultSpec
  
  /** This will match the document to the criteria.  
  *
  * IMPLEMENTATION NOTE:  This should be overriden in sub classes and call super.
  */
  protected override function documentMatchesCriteria( doc : Document, criteria : DocumentSearchCriteria) : boolean  {
    if (not super.documentMatchesCriteria( doc, criteria )) {
      return false;
    }
    if (criteria.Claim != null and doc.Claim != criteria.Claim) {
      return false
    }
    if (criteria.RelatedTo != null) {
      if (criteria.RelatedTo typeis ServiceRequest and not doesDocumentMatchServiceRequest(criteria.RelatedTo, doc)) {
        return false
      } else if (criteria.RelatedTo==criteria.Claim) {
        // DocumentSearchCriteria.RelatedTo falls back to the claim if no other "related to" object is specified,
        // so rely on the earlier Claim test to check this case
      } else {
        if (doc.RelatedTo != criteria.RelatedTo) {
          return false
        }
      }
    }
    if (criteria.Claimant != null and doc.Claimant != criteria.Claimant) {
      return false
    }
    if (criteria.ClaimContact != null and doc.ClaimContact != criteria.ClaimContact) {
      return false
    }
    return true
  }
  
  override function setParameters( params: Map ) {
    _defaultResultSpec = new RemotableSearchResultSpec()
    _defaultResultSpec.GetNumResultsOnly = false
    _defaultResultSpec.IncludeTotal = true
    _defaultResultSpec.MaxResults = 1024
    _defaultResultSpec.StartRow = 0
  }

  override function linkDocumentToEntity( entity : KeyableBean, doc : Document ) {
    if (entity.New) {
      throw new DisplayableException(DisplayKey.get("DocumentAdapter.Message.NewEntity"))
    }    

    var writeLinkFile = false
    if (entity typeis Claim) {
      doc.Claim = entity
    } else if (entity typeis ClaimContact) {
      if (entity.Claimant) {
        doc.Claimant = entity.Contact
      } else {
        doc.ClaimContact = entity
      }
    } else if (entity typeis Contact) {
      doc.Claimant = entity
    } else {
      writeLinkFile = true
    }
    saveDocument(doc)
    if (writeLinkFile) {
      // don't write the file until after saveDocument, since writeFileToRecordEntityLink requires that
      // doc have a PublicID, which may not be set up until saveDocument is called
      writeFileToRecordEntityLink(entity, doc)
    }
  }

  private function writeFileToRecordEntityLink(entity : KeyableBean, doc : Document) {
    // this method must not change doc, since the doc may have already been written
    // doc must have a publicid before this method is called
    var linkFile = getFileForBeanLink(entity,doc)
    if (!linkFile.getParentFile().exists()) {
      linkFile.getParentFile().mkdirs();
    }
    try {
      linkFile.createNewFile()
    } catch (e : IOException ) {
      throw new RuntimeException(e)
    }
  }

  override function getDocumentsLinkedToEntity( entity : KeyableBean ) : DocumentSearchResult  {
    var results = new DocumentSearchResult()
    
    if (!entity.New) {
      var dsc = new DocumentSearchCriteria()
      if (entity typeis Claim) {
        dsc.Claim = entity
        results = searchDocuments( dsc, _defaultResultSpec )
      }
      else if (entity typeis ClaimContact) {
        if (entity.Claimant) {
          dsc.Claimant = entity.Contact
        } else {
          dsc.ClaimContact = entity
        }
        results =  searchDocuments( dsc, _defaultResultSpec )
      }
      else if (entity typeis Contact) {
        dsc.Claimant = entity
        results =  searchDocuments( dsc, _defaultResultSpec )
      }
      else {
        var folderPath = getFolderPathForBeanLinks(entity)
        var linkDir = new File(folderPath)
        if (linkDir.exists()) {
          var linkFiles = linkDir.listFiles();
          for (linkFile in linkFiles) {
            var linkID = linkFile.Name
            try {
              if (!new File(getFilePathForUniqueId(linkID, true)).exists()) {
                linkFile.delete()
                continue;
              }
              var doc = retrieveDocument(linkID)
              doc.setRetrievedFromIDMS()
              results.addToSummaries(doc)
            } catch (e : Exception) {
              throw new RuntimeException(e)
            }
          }
        }
      } // end getting other entities
    }
    return results
  }

  override function isDocumentLinkedToEntity( entity : KeyableBean, doc : Document ) : boolean  {
    if (!entity.New) {
      if (entity typeis Claim) {
        return doc.Claim == entity
      }
      else if (entity typeis ClaimContact) {
        if (entity.Claimant) {
          return doc.Claimant == entity.Contact
        } else {
          return doc.ClaimContact == entity
        }
      }
      else if (entity typeis Contact) {
        return doc.Claimant == entity
      } else {
        var linkFile = getFileForBeanLink(entity, doc)
        return linkFile != null  and  linkFile.exists()
      }
    }
    return false;
  }

  override function unlinkDocumentFromEntity( entity : KeyableBean, doc : Document ) {
    var changed = false
    if (entity typeis Claim) {
      if (doc.Claim == entity) {
        doc.Claim = null
        changed = true
      }
    } else if (entity typeis ClaimContact) {
      if (entity.Claimant) {
        if (doc.Claimant == entity.Contact) {
          doc.Claimant = null
          changed = true
        }
      }
      else {
        if (doc.ClaimContact == entity) {
          doc.ClaimContact = null
          changed = true
        }
      }
    } else {
      var linkFile = getFileForBeanLink(entity, doc)
      if (linkFile != null  and  linkFile.exists()) {
        linkFile.delete();
        changed = true
      }
    }
    if (changed) {
      saveDocument(doc)
    }
  }
  
  private function doesDocumentMatchServiceRequest(serviceRequest : ServiceRequest, doc : Document) : boolean {
    for (svcReqDoc in serviceRequest.DocumentLinks) {
      if (isDocumentLinkedToEntity(svcReqDoc, doc)) {
        return true
      }
    }
    return false
  }
  
  private function getFileForBeanLink(entity : KeyableBean, doc : Document) : File {
    if (doc.PublicID == null) {
      return null
    }
    var folderPath = getFolderPathForBeanLinks(entity)
    return new File(folderPath, DocumentsUtilBase.makePortableFileName(doc.PublicID))
  }

  private function getFolderPathForBeanLinks(keyableBean : KeyableBean) : String{
    var className = keyableBean.ID.Type.RelativeName
    return MetadataDir.CanonicalPath + File.separator + className + File.separator + DocumentsUtilBase.makePortableFileName(keyableBean.PublicID)
  }
}
