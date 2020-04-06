package gw.acc.iplm.testutils

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Claim
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimEntry
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Contract
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Insurer
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_Insurer_Contact
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AccessControlList
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AccessParty
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Application
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentItem
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentList
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentTypeList
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileSize
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Receiver
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.SearchCriteria
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Sender
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AccessRightCdType
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.ListActionCdType
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.RepositoryOperationTypeCdType
uses gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ClaimEntry
uses gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Contract
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Id
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Insurer
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ServiceProvider
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.elements.RetrieveClaimRq_ReferredObjects
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.elements.RetrieveClaimRq_ReferredObjects_Claim
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.elements.RetrieveClaimRq_ReferredObjects_ClaimEntry
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.anonymous.elements.RetrieveClaimRq_ReferredObjects_Contract
uses gw.xml.date.XmlDateTime

uses java.io.File
uses java.text.SimpleDateFormat

/**
 * This class is a helper class for
 * building web service requests for ClaimRetrieve, ClaimResponse,
 * DocumentSearch, DocumentUpload and DocumentDownload SOAP operations.
 */
class OutboundRequestsUtility {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private static final var FILE_SIZE_UNIT = "KB"
  private static final var RESPONSE_CREATION_DATE_FORMAT: String  = "yyyy-MM-dd'T'HH:mm:ssXXX"

  /**
   * This function creates valid ECF ClaimResponse operation request
   *
   * @return the created ClaimResponseRequest object
   */
  public function createValidClaimResponseRequest(): ClaimResponseRq {
    var claimResponseRq = new ClaimResponseRq()
    claimResponseRq.setSender("insurer")
    claimResponseRq.setReceiver("serviceprovider")
    claimResponseRq.setUUId_elem(getUUid("ce22a0a9-cee6-4922-b14f-36ad5d59465b"))
    claimResponseRq.setCreationDate(getCurrentDate())
    var insurer = new ClaimResponseRq_Insurer()
    insurer.setParty(getParty("lloyds", "0011", "Name"))
    var contact = new ClaimResponseRq_Insurer_Contact()
    contact.setClassUserId("user1")
    contact.setAccountCode("1234")
    insurer.setContact(contact)
    claimResponseRq.setInsurer(insurer)
    var serviceProvider = new ServiceProvider()
    serviceProvider.setParty(getParty("DUNS_dun_and_bradstreet", "urn:duns:236196817", "Xchanging"))
    claimResponseRq.setServiceProvider(serviceProvider)
    var contract = new ClaimResponseRq_Contract()
    contract.setBrokerReference("B0001UMR")
    claimResponseRq.setContract(contract)
    var claimEntry = new ClaimResponseRq_ClaimEntry()
    claimEntry.setBrokerReference("B0001TR")
    claimResponseRq.setClaimEntry(claimEntry)
    var claim = new ClaimResponseRq_Claim()
    claim.setClaimType("000")
    claim.setBrokerReference("B0001UCR")
    claimResponseRq.setClaim(claim)
    var claimResponse = new ClaimResponseRq_ClaimResponse()
    claimResponse.setParticipantFunction("Lead")
    claimResponse.setClaimLineNo(1)
    claimResponseRq.setClaimResponse(claimResponse)
    LOGGER.debug(claimResponseRq.asUTFString())
    return claimResponseRq
  }

  /**
   * This function creates invalid ECF ClaimResponse operation request
   *
   * @return the created ClaimResponseRequest object
   */
  public function createInvalidClaimResponseRequest(): ClaimResponseRq {
    var claimResponseRq = new ClaimResponseRq()
    claimResponseRq.setSender("12345")
    claimResponseRq.setReceiver("987654321")
    claimResponseRq.setUUId_elem(getUUid("ce22a0a9-cee6-4922-b14f-36ad5d59465b"))
    claimResponseRq.setCreationDate(getCurrentDate())
    var insurer = new ClaimResponseRq_Insurer()
    insurer.setParty(getParty("Dunnes", "0011", "Name"))
    var contact = new ClaimResponseRq_Insurer_Contact()
    contact.setClassUserId("user1")
    contact.setAccountCode("1234")
    insurer.setContact(contact)
    claimResponseRq.setInsurer(insurer)
    var serviceProvider = new ServiceProvider()
    serviceProvider.setParty(getParty("DUNS_dun_and_bradstreet", "urn:duns:236196817", "ZchanginX"))
    claimResponseRq.setServiceProvider(serviceProvider)
    var contract = new ClaimResponseRq_Contract()
    contract.setBrokerReference("B0001UMR")
    claimResponseRq.setContract(contract)
    var claimEntry = new ClaimResponseRq_ClaimEntry()
    claimEntry.setBrokerReference("B0001TR")
    claimResponseRq.setClaimEntry(claimEntry)
    var claim = new ClaimResponseRq_Claim()
    claim.setClaimType("000")
    claim.setBrokerReference("B0001UCR")
    claimResponseRq.setClaim(claim)
    var claimResponse = new ClaimResponseRq_ClaimResponse()
    claimResponse.setParticipantFunction("Lead")
    claimResponse.setClaimLineNo(1)
    claimResponseRq.setClaimResponse(claimResponse)
    LOGGER.debug(claimResponseRq.asUTFString())
    return claimResponseRq
  }

  /**
   * This function creates malformed (not created properly) ECF ClaimResponse operation request
   *
   * @return the created ClaimResponseRequest object
   */
  public function createMalformedClaimResponseRequest(): ClaimResponseRq {
    var claimResponseRq = new ClaimResponseRq()
    claimResponseRq.setCreationDate(getCurrentDate())
    var insurer = new ClaimResponseRq_Insurer()
    insurer.setParty(getParty("lloyds", "0011", "Name"))
    var contact = new ClaimResponseRq_Insurer_Contact()
    contact.setClassUserId("user1")
    contact.setAccountCode("1234")
    insurer.setContact(contact)
    claimResponseRq.setInsurer(insurer)
    var serviceProvider = new ServiceProvider()
    serviceProvider.setParty(getParty("DUNS_dun_and_bradstreet", "urn:duns:236196817", "Xchanging"))
    claimResponseRq.setServiceProvider(serviceProvider)
    var contract = new ClaimResponseRq_Contract()
    contract.setBrokerReference("B0001UMR")
    claimResponseRq.setContract(contract)
    var claimEntry = new ClaimResponseRq_ClaimEntry()
    claimEntry.setBrokerReference("B0001TR")
    claimResponseRq.setClaimEntry(claimEntry)
    var claim = new ClaimResponseRq_Claim()
    claim.setClaimType("000")
    claim.setBrokerReference("B0001UCR")
    claimResponseRq.setClaim(claim)
    var claimResponse = new ClaimResponseRq_ClaimResponse()
    claimResponse.setParticipantFunction("Lead")
    claimResponse.setClaimLineNo(1)
    claimResponseRq.setClaimResponse(claimResponse)
    return claimResponseRq
  }

  /**
   * This function creates valid ECF RetrieveClaim operation request
   *
   * @return the created RetrieveClaimRequest object
   */
  public function createValidClaimRetrieveRequest(): RetrieveClaimRq {
    var retrieveClaimRq = new RetrieveClaimRq()
    retrieveClaimRq.setSender("insurer")
    retrieveClaimRq.setReceiver("serviceprovider")
    retrieveClaimRq.setUUId_elem(getUUid("20111803-7778-5558-bbbb-1aa00005b415"))
    retrieveClaimRq.setInsurerReference("InsurerReference")
    retrieveClaimRq.setCreationDate(getCurrentDate())
    var insurer = new Insurer()
    insurer.setParty(getParty("lloyds", "0002", "Name"))
    retrieveClaimRq.setInsurer(insurer)
    var serviceProvider = new ServiceProvider()
    serviceProvider.setParty(getParty("DUNS_dun_and_bradstreet", "urn:duns:236196817", "Xchanging"))
    retrieveClaimRq.setServiceProvider(serviceProvider)
    var referredObjects = new RetrieveClaimRq_ReferredObjects()
    var contract = new RetrieveClaimRq_ReferredObjects_Contract()
    contract.setBrokerReference("B0001UMR")
    referredObjects.setContract(contract)
    var claim = new RetrieveClaimRq_ReferredObjects_Claim()
    claim.setBrokerReference("B0001UCR")
    claim.setClaimLineNumber(1)
    claim.setClaimType("001")
    referredObjects.setClaim(claim)
    var claimEntry = new RetrieveClaimRq_ReferredObjects_ClaimEntry()
    claimEntry.setBrokerReference("B0001TR")
    referredObjects.setClaimEntry(claimEntry)
    retrieveClaimRq.setReferredObjects(referredObjects)
    LOGGER.debug(retrieveClaimRq.asUTFString())
    return retrieveClaimRq
  }

  /**
   * This function creates invalid ECF RetrieveClaim operation request
   *
   * @return the created RetrieveClaimRequest object
   */
  public function createInvalidClaimRetrieveRequest(): RetrieveClaimRq {
    var retrieveClaimRq = new RetrieveClaimRq()
    retrieveClaimRq.setSender("12345")
    retrieveClaimRq.setReceiver("987654321")
    retrieveClaimRq.setUUId_elem(getUUid("20111803-7778-5558-bbbb-1aa00005b415"))
    retrieveClaimRq.setInsurerReference("InsurerReference")
    retrieveClaimRq.setCreationDate(getCurrentDate())
    var insurer = new Insurer()
    insurer.setParty(getParty("Dunnes", "0002", "Name"))
    retrieveClaimRq.setInsurer(insurer)
    var serviceProvider = new ServiceProvider()
    serviceProvider.setParty(getParty("DUNS_dun_and_bradstreet", "urn:duns:236196817", "ZchanginX"))
    retrieveClaimRq.setServiceProvider(serviceProvider)
    var referredObjects = new RetrieveClaimRq_ReferredObjects()
    var contract = new RetrieveClaimRq_ReferredObjects_Contract()
    contract.setBrokerReference("B0001UMR")
    referredObjects.setContract(contract)
    var claim = new RetrieveClaimRq_ReferredObjects_Claim()
    claim.setBrokerReference("B0001UCR")
    claim.setClaimLineNumber(1)
    claim.setClaimType("001")
    referredObjects.setClaim(claim)
    var claimEntry = new RetrieveClaimRq_ReferredObjects_ClaimEntry()
    claimEntry.setBrokerReference("B0001TR")
    referredObjects.setClaimEntry(claimEntry)
    retrieveClaimRq.setReferredObjects(referredObjects)
    LOGGER.debug(retrieveClaimRq.asUTFString())
    return retrieveClaimRq
  }

  /**
   * This function creates malformed (not created properly) ECF RetrieveClaim operation request
   *
   * @return the created RetrieveClaimRequest object
   */
  public function createMalformedClaimRetrieveRequest(): RetrieveClaimRq {
    var retrieveClaimRq = new RetrieveClaimRq()
    retrieveClaimRq.setInsurerReference("InsurerReference")
    retrieveClaimRq.setCreationDate(getCurrentDate())
    var insurer = new Insurer()
    insurer.setParty(getParty("lloyds", "0002", "Name"))
    retrieveClaimRq.setInsurer(insurer)
    var serviceProvider = new ServiceProvider()
    serviceProvider.setParty(getParty("DUNS_dun_and_bradstreet", "urn:duns:236196817", "Xchanging"))
    retrieveClaimRq.setServiceProvider(serviceProvider)
    var referredObjects = new RetrieveClaimRq_ReferredObjects()
    var contract = new RetrieveClaimRq_ReferredObjects_Contract()
    contract.setBrokerReference("B0001UMR")
    referredObjects.setContract(contract)
    var claim = new RetrieveClaimRq_ReferredObjects_Claim()
    claim.setBrokerReference("B0001UCR")
    claim.setClaimLineNumber(1)
    claim.setClaimType("001")
    referredObjects.setClaim(claim)
    var claimEntry = new RetrieveClaimRq_ReferredObjects_ClaimEntry()
    claimEntry.setBrokerReference("B0001TR")
    referredObjects.setClaimEntry(claimEntry)
    retrieveClaimRq.setReferredObjects(referredObjects)
    return retrieveClaimRq
  }

  /**
   * This function creates valid IMR RepositoryOperation operation request
   *
   * @return the created RepositoryOperationRequest object
   */
  public function createValidDocumentSearchRequest(): RepositoryOperationRq {
    var repositoryOperationRq = new RepositoryOperationRq()
    repositoryOperationRq.setRepositoryOperationTypeCd(RepositoryOperationTypeCdType.RepositorySearch)
    var sender = new Sender()
    sender.setPartyId("urn:lloyds:0001")
    sender.setPartyRoleCd("Insurer")
    sender.setPartyName("writeback-carrier")
    repositoryOperationRq.setSender(sender)
    var receiver = new Receiver()
    receiver.setPartyId("urn:duns:23619681")
    receiver.setPartyRoleCd("ServiceProvider")
    receiver.setPartyName("Xchanging")
    repositoryOperationRq.setReceiver(receiver)
    repositoryOperationRq.setMsgId("20142830-42b4-0712-0061-113508251139")
    repositoryOperationRq.setCreationDtTime(getCurrentDate())
    var docApplication = new Application()
    docApplication.setApplicationCd("Jv-Ins-Reinsurance")
    docApplication.setSchemaVersion("http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2")
    repositoryOperationRq.setApplication(docApplication)
    var documentList = new ArrayList<DocumentList>()
    var document = new DocumentList()
    document.setHierarchySortIndicator(false)
    var documentItem = new DocumentItem()

    var referredObjects = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReferredObjects()
    var contract = new Contract()
    contract.setBrokerReference("B00011912UMR1")
    referredObjects.setContract(contract)

    var claim = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Claim()
    claim.setBrokerReference("B00011912UCR1")
    referredObjects.setClaim(claim)

    var claimEntry = new ClaimEntry()
    claimEntry.setBrokerReference("B00011912TR1")
    referredObjects.setClaimEntry(claimEntry)
    documentItem.setReferredObjects(referredObjects)

    var documentItemsList = new ArrayList<DocumentItem>()
    documentItemsList.add(documentItem)

    document.setDocumentItem(documentItemsList)
    documentList.add(document)

    repositoryOperationRq.setDocumentList(documentList)

    var searchCriteria = new SearchCriteria()
    searchCriteria.setSearchLimit(0)
    searchCriteria.setSearchStart(0)
    searchCriteria.setSearchStartDtTime(getCurrentXmlDate())
    searchCriteria.setSearchEndDtTime(null)
    var documentTypeList = new DocumentTypeList()

    searchCriteria.setDocumentTypeList_elem(documentTypeList)
    repositoryOperationRq.setSearchCriteria(searchCriteria)

    LOGGER.debug(repositoryOperationRq.asUTFString())
    return repositoryOperationRq
  }

  /**
   * This function creates invalid IMR RepositoryOperation operation request
   *
   * @return the created RepositoryOperationRequest object
   */
  public function createInValidDocumentSearchRequest(): RepositoryOperationRq {
    var repositoryOperationRq = new RepositoryOperationRq()
    repositoryOperationRq.setRepositoryOperationTypeCd(RepositoryOperationTypeCdType.RepositorySearch)
    var sender = new Sender()
    sender.setPartyId("urn:Dunnes:0001")
    sender.setPartyRoleCd("12345")
    sender.setPartyName("writeback-carrier")
    repositoryOperationRq.setSender(sender)
    var receiver = new Receiver()
    receiver.setPartyId("urn:duns:23619681")
    receiver.setPartyRoleCd("ServiceProvider")
    receiver.setPartyName("ZchanginX")
    repositoryOperationRq.setReceiver(receiver)
    repositoryOperationRq.setMsgId("00000000-0000-0000-0000-000000000000")
    repositoryOperationRq.setCreationDtTime(getCurrentDate())
    var docApplication = new Application()
    docApplication.setApplicationCd("Jv-Ins-Reinsurance")
    docApplication.setSchemaVersion("http://www.ACORB.org/standards/PP-Ins-Reinsurance/3005-2")
    repositoryOperationRq.setApplication(docApplication)
    var documentList = new ArrayList<DocumentList>()
    var document = new DocumentList()
    document.setHierarchySortIndicator(false)
    var documentItem = new DocumentItem()

    var referredObjects = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReferredObjects()
    var contract = new Contract()
    contract.setBrokerReference("B00011912UMR1")
    referredObjects.setContract(contract)

    var claim = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Claim()
    claim.setBrokerReference("B00011912UCR1")
    referredObjects.setClaim(claim)

    var claimEntry = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ClaimEntry()
    claimEntry.setBrokerReference("B00011912TR1")
    referredObjects.setClaimEntry(claimEntry)
    documentItem.setReferredObjects(referredObjects)

    var documentItemsList = new ArrayList<DocumentItem>()
    documentItemsList.add(documentItem)

    document.setDocumentItem(documentItemsList)
    documentList.add(document)

    repositoryOperationRq.setDocumentList(documentList)

    var searchCriteria = new SearchCriteria()
    searchCriteria.setSearchLimit(0)
    searchCriteria.setSearchStart(0)
    searchCriteria.setSearchStartDtTime(getCurrentXmlDate())
    searchCriteria.setSearchEndDtTime(null)
    var documentTypeList = new DocumentTypeList()

    searchCriteria.setDocumentTypeList_elem(documentTypeList)
    repositoryOperationRq.setSearchCriteria(searchCriteria)
    LOGGER.debug(repositoryOperationRq.asUTFString())
    return repositoryOperationRq
  }
  /**
   * This function creates malformed (not created properly) IMR RepositoryOperation operation request
   *
   * @return the created RepositoryOperationRequest object
   */
  public function createMalformedDocumentSearchRequest(): RepositoryOperationRq {
    var repositoryOperationRq = new RepositoryOperationRq()
    repositoryOperationRq.setRepositoryOperationTypeCd(RepositoryOperationTypeCdType.RepositorySearch)
    var sender = new Sender()
    sender.setPartyId("urn:lloyds:0001")
    sender.setPartyRoleCd("Insurer")
    sender.setPartyName("writeback-carrier")
    repositoryOperationRq.setSender(sender)
    var receiver = new Receiver()
    receiver.setPartyId("urn:duns:23619681")
    receiver.setPartyRoleCd("ServiceProvider")
    receiver.setPartyName("Xchanging")
    repositoryOperationRq.setReceiver(receiver)
    repositoryOperationRq.setMsgId("20142830-42b4-0712-0061-113508251139")
    repositoryOperationRq.setCreationDtTime(getCurrentDate())
    var documentList = new ArrayList<DocumentList>()
    var document = new DocumentList()
    document.setHierarchySortIndicator(false)
    var documentItem = new DocumentItem()

    var referredObjects = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReferredObjects()
    var contract = new Contract()
    contract.setBrokerReference("B00011912UMR1")
    referredObjects.setContract(contract)

    var claim = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Claim()
    claim.setBrokerReference("B00011912UCR1")
    referredObjects.setClaim(claim)

    var claimEntry = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ClaimEntry()
    claimEntry.setBrokerReference("B00011912TR1")
    referredObjects.setClaimEntry(claimEntry)
    documentItem.setReferredObjects(referredObjects)

    var documentItemsList = new ArrayList<DocumentItem>()
    documentItemsList.add(documentItem)

    document.setDocumentItem(documentItemsList)
    documentList.add(document)

    repositoryOperationRq.setDocumentList(documentList)

    var searchCriteria = new SearchCriteria()
    searchCriteria.setSearchLimit(0)
    searchCriteria.setSearchStart(0)
    searchCriteria.setSearchStartDtTime(getCurrentXmlDate())
    searchCriteria.setSearchEndDtTime(null)
    var documentTypeList = new DocumentTypeList()

    searchCriteria.setDocumentTypeList_elem(documentTypeList)
    repositoryOperationRq.setSearchCriteria(searchCriteria)
    return repositoryOperationRq
  }

  /**
   * This function creates valid IMR RepositoryOperation Download request
   *
   * @return the created RepositoryOperationRequest object
   */
  public function createValidDocumentDownloadRequest(): RepositoryOperationRq {
    var repositoryOperationRq = new RepositoryOperationRq()
    repositoryOperationRq.setRepositoryOperationTypeCd(RepositoryOperationTypeCdType.RepositoryDownload)
    var sender = new Sender()
    sender.setPartyId("urn:lloyds:2007")
    sender.setPartyRoleCd("Insurer")
    sender.setPartyName("Novae")
    repositoryOperationRq.setSender(sender)
    var receiver = new Receiver()
    receiver.setPartyId("urn:duns:236196817")
    receiver.setPartyRoleCd("ServiceProvider")
    receiver.setPartyName("Xchanging")
    repositoryOperationRq.setReceiver(receiver)
    repositoryOperationRq.setMsgId("E972D91E-912C-42D4-A998-050D09CED856")
    repositoryOperationRq.setCreationDtTime(getCurrentDate())
    var docApplication = new Application()
    docApplication.setApplicationCd("Jv-Ins-Reinsurance")
    docApplication.setSchemaVersion("http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2")
    repositoryOperationRq.setApplication(docApplication)

    /// documentList start
    var documentList = new ArrayList<DocumentList>()

    var document = new DocumentList()
    document.setHierarchySortIndicator(false)


    var documentItem = new DocumentItem()
    documentItem.Document.DocumentId = "8f63fc2d-31f4-4fba-a6b3-679e1864f2c2"
    documentItem.Document.DocumentVersion = "1"

    var referredObjects = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReferredObjects()
    var serviceProvider = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ServiceProvider()
    var party = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Party()
    party.setName("Xchanging")
    serviceProvider.setParty(party)


    var contact = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Contact()
    contact.setDescription("B0001UMR001-B0001UCR001-B0001TR0001")
    serviceProvider.setContact(contact)
    referredObjects.setServiceProvider(serviceProvider)
    documentItem.setReferredObjects(referredObjects)


    var documentItemsList = new ArrayList<DocumentItem>()
    documentItemsList.add(documentItem)

    document.setDocumentItem(documentItemsList)
    documentList.add(document)

    repositoryOperationRq.setDocumentList(documentList)
    /// documentList end

    LOGGER.debug(repositoryOperationRq.asUTFString())
    return repositoryOperationRq
  }

  /**
   * This function creates valid IMR RepositoryOperation Upload request
   *
   * @return the created RepositoryOperationRequest object
   */
  public function createValidDocumentUploadRequest(file: File): RepositoryOperationRq {
    var repositoryOperationRq = new RepositoryOperationRq()
    repositoryOperationRq.setRepositoryOperationTypeCd(RepositoryOperationTypeCdType.RepositoryUpload)
    var sender = new Sender()
    sender.setPartyId("urn:lloyds:0001")
    sender.setPartyRoleCd("Insurer")
    sender.setPartyName("writeback-carrier")
    repositoryOperationRq.setSender(sender)
    var receiver = new Receiver()
    receiver.setPartyId("urn:duns:236196817")
    receiver.setPartyRoleCd("ServiceProvider")
    receiver.setPartyName("Xchanging")
    repositoryOperationRq.setReceiver(receiver)
    repositoryOperationRq.setMsgId("20142830-42b4-0712-0061-113508251139")
    repositoryOperationRq.setCreationDtTime(getCurrentDate())
    var docApplication = new Application()
    docApplication.setApplicationCd("Jv-Ins-Reinsurance")
    docApplication.setSchemaVersion("http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2")
    repositoryOperationRq.setApplication(docApplication)

    /// documentList start
    var documentList = new ArrayList<DocumentList>()
    var document = new DocumentList()
    document.setHierarchySortIndicator(false)

    var documentItem = new DocumentItem()
    documentItem.Document.DocumentId = "20112809-42b4-0709-111D-010001121171"
    documentItem.Document.DocumentVersion = "1"
    documentItem.Document.DocumentVersionDtTime = getCurrentXmlDate()
    documentItem.Document.FileId = file.getName()

    var extension = ""
    var i = file.getName().lastIndexOf('.')
    if (i > 0) {
      extension = file.getName().substring(i + 1)
    }

    var fileFormatCd = ""
    if (extension.equalsIgnoreCase("jpeg") or extension.equalsIgnoreCase("jpg") or extension.equalsIgnoreCase("png")) {
      fileFormatCd = "image/" + extension
    } else {
      fileFormatCd = "other/" + extension
    }

    documentItem.Document.FileFormatCd = fileFormatCd

    var fileSize = new FileSize()
    fileSize.NumUnits = getFileSize(file)
    fileSize.UnitMeasurementCd = FILE_SIZE_UNIT
    documentItem.Document.FileSize = fileSize
    documentItem.Document.DocumentTypeCd = "form_correction"
    documentItem.Document.Description = "MYTest"

    var documentItemList = new ArrayList<DocumentItem>()
    documentItemList.add(documentItem)
    document.setDocumentItem(documentItemList)

    var accessControlList = new AccessControlList()
    var accessParty = new AccessParty()
    accessParty.ListActionCd = ListActionCdType.Remove
    accessParty.AccessRightCd = AccessRightCdType.Read
    accessParty.PartyId = "urn:lloyds:0001"
    accessParty.PartyRoleCd = "Broker"
    accessParty.PartyName = null


    var accessPartyList = new ArrayList<AccessParty>()
    accessPartyList.add(accessParty)

    accessControlList.AccessParty = accessPartyList
    documentItem.AccessControlList = accessControlList

    var referredObjects = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReferredObjects()
    var contract = new Contract()
    contract.setBrokerReference("B00011912UMR1")
    referredObjects.setContract(contract)

    var claim = new gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Claim()
    claim.setBrokerReference("B00011912UCR1")
    referredObjects.setClaim(claim)

    var claimEntry = new ClaimEntry()
    claimEntry.setBrokerReference("B00011912TR1")
    referredObjects.setClaimEntry(claimEntry)
    documentItem.setReferredObjects(referredObjects)

    var documentItemsList = new ArrayList<DocumentItem>()
    documentItemsList.add(documentItem)

    document.setDocumentItem(documentItemsList)
    documentList.add(document)

    repositoryOperationRq.setDocumentList(documentList)
    /// documentList end

    LOGGER.debug(repositoryOperationRq.asUTFString())
    return repositoryOperationRq
  }

  private function getCurrentDate(): String {
    var outputDateFormat = new SimpleDateFormat(RESPONSE_CREATION_DATE_FORMAT)
    var creationDate = outputDateFormat.format(Date.Now)
    return creationDate
  }

  private function getCurrentXmlDate(): XmlDateTime {
    return new XmlDateTime()
  }

  private function getParty(agency: String, idValue: String, name: String): Party {
    var party = new Party()
    party.setName(name)
    var id = new Id()
    id.setAgency(agency)
    id.setValue(idValue)
    party.setId_elem({id})
    return party
  }

  private function getUUid(uuidVal: String): UUId {
    var newUUidElem = new UUId()
    newUUidElem.setValue(uuidVal)
    return newUUidElem
  }

  private function getFileSize(file: File): long {
    var size = file.length()
    if (size < (1024 * 1024)) {
      size = size / 1024
    } else if (size > (1024 * 1024)) {
      while (size > (1024 * 1024)) {
        size = size / 1024
      }
    }
    return size
  }

}