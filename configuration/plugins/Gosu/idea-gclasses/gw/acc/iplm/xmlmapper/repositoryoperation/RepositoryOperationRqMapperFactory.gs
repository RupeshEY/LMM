package gw.acc.iplm.xmlmapper.repositoryoperation

uses gw.acc.iplm.xmlmapper.repositoryoperation.imrdownload.RepositoryDownloadRequestMapper
uses gw.acc.iplm.xmlmapper.repositoryoperation.imrsearch.RepositorySearchRequestMapper
uses gw.acc.iplm.xmlmapper.repositoryoperation.imrupload.RepositoryUploadRequestMapper

/**
 * Factory for RepositoryOperationRqMapper, to get the correct mapper for the subclass of ECFDocumentMessage_Ext
 */
class RepositoryOperationRqMapperFactory {

  /**
   * @param repositoryOperationEntity the entity to get a mapper for
   * @return the RepositoryOperationRqMapper subtype instance constructed using the repositoryOperationEntity
   * If no mapper found for this ECFDocumentMessage_Ext subtype, null is returned
   */
  public function getMapper(repositoryOperationEntity: ECFDocumentMessage_Ext): RepositoryOperationRqMapper {
    switch (repositoryOperationEntity.MessageType) {
      case ECFMessageType_Ext.TC_REPOSITORYSEARCH:
        return new RepositorySearchRequestMapper(repositoryOperationEntity as ECFMessageDocumentSearchRq_Ext)
      case ECFMessageType_Ext.TC_REPOSITORYDOWNLOAD:
        return new RepositoryDownloadRequestMapper(repositoryOperationEntity as ECFMessageDocumentDownloadRq_Ext)
      case ECFMessageType_Ext.TC_REPOSITORYUPLOAD:
        return new RepositoryUploadRequestMapper(repositoryOperationEntity as ECFMessageDocumentUploadRq_Ext)
    }

    return null
  }

}