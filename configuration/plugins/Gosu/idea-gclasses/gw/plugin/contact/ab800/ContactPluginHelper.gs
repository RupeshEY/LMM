package gw.plugin.contact.ab800

uses gw.api.util.LocaleUtil
uses gw.api.webservice.exception.RequiredFieldException
uses gw.contactmapper.ab800.ContactIntegrationMapper
uses gw.contactmapper.ab800.ContactIntegrationMapperFactory
uses gw.pl.persistence.core.Bundle
uses gw.plugin.contact.ContactMatch
uses gw.plugin.contact.ContactPluginHelperBase
uses gw.plugin.contact.search.ContactSearchFilter
uses gw.plugin.contact.search.ContactSearchResult
uses gw.plugin.contact.search.DuplicateSearchResult
uses gw.webservice.contactapi.NameMapper
uses gw.webservice.contactapi.beanmodel.XmlBackedInstance
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPIFindDuplicatesResultContainer_Results_Entry
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchResultContainer_Results_Entry
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchSpec_SortColumns
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchSpec_SortColumns_Entry
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchSpec_SubtypeFilter
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPIFindDuplicatesResultContainer
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPIPendingContactChange
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPISearchResultContainer
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.ABContactAPISearchSpec
uses wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.AddressBookUIDContainer
uses entity.Contact

/**
 * This is a utility class with some methods used by the ABContactSystemPlugin and it's related classes.
 */
@Export
internal class ContactPluginHelper extends ContactPluginHelperBase {

  private var _nameMapper : NameMapper as NameMapper = ContactIntegrationMapperFactory.mapper().getNameMapper()

  private var _xmlMapper = ContactIntegrationMapperFactory.mapper()

  override property get ContactContactRelationshipBeanFieldName() : String {
    return ContactIntegrationMapper.CONTACTCONTACT_RELATIONSHIP_BEAN_FIELD_NAME
  }

  protected function getChangeContext(contact:Contact, xml : XmlBackedInstance) : ABContactAPIPendingContactChange {
    var context = new ABContactAPIPendingContactChange()
    var root = getRootEntity(contact)
    context.RootEntityID = root.PublicID
    context.RootEntityType = (typeof root).RelativeName
    context.RootEntityDisplayName = root.DisplayName
    context.Username = xml.External_UpdateUser
    context.UserDisplayName = getUserDisplayNameForUsername(context.Username)
    return context
  }


  protected function toRemoteXmlBackedInstance(xmlContact : XmlBackedInstance) : wsi.remote.gw.webservice.ab.ab801.beanmodel.XmlBackedInstance {
    return wsi.remote.gw.webservice.ab.ab801.beanmodel.XmlBackedInstance.parse(xmlContact.bytes())
  }
  
  protected function fromRemoteXmlBackedInstance(remoteXmlInstance:wsi.remote.gw.webservice.ab.ab801.beanmodel.XmlBackedInstance) : XmlBackedInstance {
    return XmlBackedInstance.parse(remoteXmlInstance.bytes())
  }
  
  protected function toSearchResult(xmlSearchResult:ABContactAPISearchResultContainer, countOnly:boolean) : ContactSearchResult {
    //if count-only
    if(countOnly) {
      return new ContactSearchResult(xmlSearchResult.TotalResults)
    }
    return new ContactSearchResult(xmlSearchResult.Results.Entry.map(\ sr -> { 
      return createContactFromSearchResult(sr)
    }))
  }
  
  protected function toSearchSpec(searchFilter:ContactSearchFilter, includePendingCreates : boolean) : ABContactAPISearchSpec {
    var searchSpec = new ABContactAPISearchSpec()
    searchSpec.GetNumResultsOnly = searchFilter.NumResultsOnly
    searchSpec.StartRow = searchFilter.StartRow
    searchSpec.ChunkSize = searchFilter.MaxResults
    searchSpec.LocaleCode = LocaleUtil.CurrentLocale.Code
    //map excluded types
    searchSpec.SubtypeFilter = new ABContactAPISearchSpec_SubtypeFilter()
    var excludedTypes = new ArrayList<String>()
    searchFilter.ExcludedSubtypes.each(\ et -> {
      var entityName = _nameMapper.getABEntityName(et)
      var enumValue = entityName
      if (enumValue == null) {
        throw new RequiredFieldException("Invalid subtype filter ${et} mapped to ${entityName}")
      }
      excludedTypes.add(enumValue)
      _nameMapper.getAlternateABEntityNames(et)
        .each(\ code -> {
           excludedTypes.add(code)
        })
    })
    searchSpec.SubtypeFilter.Subtypes.Entry = excludedTypes
    //sort columns
    searchSpec.SortColumns = new ABContactAPISearchSpec_SortColumns()
    var sortColumns = new ArrayList<wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchSpec_SortColumns_Entry>()
    var convertToKeyword = {"Contact.LastNameDenorm", "Contact.LastNameKanji", "Contact.NameDenorm", "Contact.NameKanji"}
    var keywordAdded = false;

    for (sc in searchFilter.SortColumns) {
      var sortColumn = new ABContactAPISearchSpec_SortColumns_Entry()
      sortColumn.Ascending = sc.Ascending

      if (convertToKeyword.contains(sc.SortPath)) {
        if (!keywordAdded)  {
          sortColumn.BeanPath = translateToABEntities("Contact.Keyword")
          keywordAdded = true
          sortColumns.add(sortColumn)
        } else {
          continue
        }
      } else {
        sortColumn.BeanPath = translateToABEntities(sc.SortPath)
        sortColumns.add(sortColumn)
      }
    }

    if (sortColumns != null) {
      searchSpec.SortColumns.Entry = sortColumns
    }

    searchSpec.IncludePendingCreates = includePendingCreates
    return searchSpec
  }
  
  protected function toDuplicateSearchResult(xmlDuplicates:ABContactAPIFindDuplicatesResultContainer, countOnly:boolean) : DuplicateSearchResult {
    if(countOnly) {
      return new DuplicateSearchResult(xmlDuplicates.TotalResults)
    }
    return new DuplicateSearchResult(xmlDuplicates.Results.Entry.map(\ dr -> { 
      return createContactMatchFromResult(dr) 
    }))
  }
  
  private function createContactFromSearchResult(result:ABContactAPISearchResultContainer_Results_Entry) : Contact {
    var contact = _xmlMapper.createEntity(result.ContactType, null) as Contact
    ContactSearchResultMapper.populateContactFromSearchResult(contact, result)
    return contact
  }
  
  private function createContactMatchFromResult(result:ABContactAPIFindDuplicatesResultContainer_Results_Entry) : ContactMatch {
    var contact = _xmlMapper.createEntity(result.ContactType, null) as Contact
    ContactSearchResultMapper.populateContactFromDuplicateResult(contact, result)
    return new ContactMatch(contact, result.Exact)
  }


/**
 * Generates a map of type/public id to ABUID from the XML ABUID container.
 */
  protected function generateMapFromABUIDContainer(addressBookUIDContainer:AddressBookUIDContainer) : Map<String,String> {
    var abuidMap = new HashMap<String,String>()
    for (tuple in addressBookUIDContainer.AddressBookUIDTuples.Entry) {
      var entityName = ContactIntegrationMapperFactory.mapper().getNameMapper().getLocalEntityName(tuple.EntityType)
      var key = generateABUIDMapKey(entityName,tuple.External_PublicID)
      abuidMap[key] = tuple.LinkID
    }
    return abuidMap                                
  }

  /**
   * Creates a ContactContact in the bundle provided populated from the XmlBackedInstance
   *
   * @param xml the XmlBackedInstance for the ContactContact
   * @param bundle the bundle to create the ContactContact in
   * @returns the created ContactContact
   */
  protected function createContactContactWithRelationshipFromXML(xml : XmlBackedInstance, bundle : Bundle) : ContactContact {
    var mapper = ContactIntegrationMapperFactory.mapper()
    var xsdTypeName = mapper.getNameMapper().getABEntityName(ContactContact.Type.RelativeName)
    var cc = mapper.createEntity(xsdTypeName, bundle) as ContactContact
    mapper.populateContactContactFromContactContactXML(cc, xml)
    return cc
  }

}
