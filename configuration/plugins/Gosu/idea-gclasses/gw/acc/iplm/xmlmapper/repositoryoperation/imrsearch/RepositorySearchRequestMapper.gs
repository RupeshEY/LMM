package gw.acc.iplm.xmlmapper.repositoryoperation.imrsearch

uses gw.acc.iplm.xmlmapper.repositoryoperation.RepositoryOperationRqMapper
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.RepositoryOperationTypeCdType

/**
 * Mapping from ECFMessageDocumentSearchRq_Ext to RepositoryOperationRq for RepositorySearch request to IMR
 */
class RepositorySearchRequestMapper extends RepositoryOperationRqMapper<ECFMessageDocumentSearchRq_Ext> {

  /**
   * @param entity the entity to map from
   */
  public construct(entity: ECFMessageDocumentSearchRq_Ext) {
    super(entity)
  }

  protected function addRepositoryOperationTypeCd() {
    _xml.RepositoryOperationTypeCd = RepositoryOperationTypeCdType.RepositorySearch
  }

  protected function addDocumentItemDetails() {
    _documentItem.ReferredObjects.Contract.BrokerReference = _entity.UMR

    if (_entity.UCR != null) {
      _documentItem.ReferredObjects.Claim.BrokerReference = _entity.UCR
    }

    if (_entity.TR != null) {
      _documentItem.ReferredObjects.ClaimEntry.BrokerReference = _entity.TR
    }
  }

  protected function addOperationSpecificContent() {
    _xml.SearchCriteria.SearchLimit = 0L
    _xml.SearchCriteria.SearchStart = 0L
  }
}