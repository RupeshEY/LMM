/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.ports;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class ServiceRequestAPI_Soap11Port extends gw.internal.xml.ws.WsdlPortImpl {

  public static final javax.xml.namespace.QName PORT_QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI", "ServiceRequestAPISoap11Port", "" );
  public static final javax.xml.namespace.QName SERVICE_QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI", "ServiceRequestAPI", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.ws.WsdlPortTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.ws.WsdlPortTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.ws.WsdlPortTypeDataImpl init() {
      return (gw.internal.xml.ws.WsdlPortTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.ports.ServiceRequestAPI_Soap11Port" );
    }
  };
  public static final java.net.URI ADDRESS;

  static {
    try {
      ADDRESS = new java.net.URI( "local:///gw/webservice/cc/cc800/vendormanagement/ServiceRequestAPI/soap11" );
    }
    catch ( java.net.URISyntaxException ex ) {
      throw gw.internal.xml.util.ExceptionUtil.forceThrow( ex );
    }
  }

  public ServiceRequestAPI_Soap11Port() {
    super( TYPE.get(), new gw.xml.ws.WsdlConfig() );
  }

  public ServiceRequestAPI_Soap11Port( gw.xml.ws.WsdlConfig config ) {
    super( TYPE.get(), config );
  }


  public final gw.xml.XmlElement document_literal( gw.xml.XmlElement document ) {
    return (gw.xml.XmlElement) invoke( "document_literal", new java.lang.Object[] { document } );
  }

  public final gw.xml.ws.AsyncResponse<gw.xml.XmlElement,gw.xsd.w3c.soap11_envelope.Envelope> async_document_literal( gw.xml.XmlElement document ) {
    return (gw.xml.ws.AsyncResponse<gw.xml.XmlElement,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "document_literal", new java.lang.Object[] { document } );
  }


  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchResults searchForServiceRequests( java.lang.String specialistId, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchCriteria searchCriteria ) {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchResults) invoke( "searchForServiceRequests", new java.lang.Object[] { specialistId, searchCriteria } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchResults,gw.xsd.w3c.soap11_envelope.Envelope> async_searchForServiceRequests( java.lang.String specialistId, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchCriteria searchCriteria ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchResults,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "searchForServiceRequests", new java.lang.Object[] { specialistId, searchCriteria } );
  }


  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchResults searchForServiceRequests( java.lang.String specialistId, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchCriteria searchCriteria, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.SearchForServiceRequestsHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchResults) invoke( "searchForServiceRequests", new java.lang.Object[] { specialistId, searchCriteria, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchResults,gw.xsd.w3c.soap11_envelope.Envelope> async_searchForServiceRequests( java.lang.String specialistId, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchCriteria searchCriteria, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.SearchForServiceRequestsHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestSearchResults,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "searchForServiceRequests", new java.lang.Object[] { specialistId, searchCriteria, soapHeaders } );
  }


  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestDetails getServiceRequest( java.lang.String specialistId, java.lang.String serviceRequestNumber ) {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestDetails) invoke( "getServiceRequest", new java.lang.Object[] { specialistId, serviceRequestNumber } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestDetails,gw.xsd.w3c.soap11_envelope.Envelope> async_getServiceRequest( java.lang.String specialistId, java.lang.String serviceRequestNumber ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestDetails,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "getServiceRequest", new java.lang.Object[] { specialistId, serviceRequestNumber } );
  }


  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestDetails getServiceRequest( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.GetServiceRequestHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestDetails) invoke( "getServiceRequest", new java.lang.Object[] { specialistId, serviceRequestNumber, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestDetails,gw.xsd.w3c.soap11_envelope.Envelope> async_getServiceRequest( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.GetServiceRequestHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.ServiceRequestDetails,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "getServiceRequest", new java.lang.Object[] { specialistId, serviceRequestNumber, soapHeaders } );
  }


  public final void updateServiceRequestReferenceNumber( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String newReferenceNumber ) {
    invoke( "updateServiceRequestReferenceNumber", new java.lang.Object[] { specialistId, serviceRequestNumber, newReferenceNumber } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_updateServiceRequestReferenceNumber( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String newReferenceNumber ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateServiceRequestReferenceNumber", new java.lang.Object[] { specialistId, serviceRequestNumber, newReferenceNumber } );
  }


  public final void updateServiceRequestReferenceNumber( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String newReferenceNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.UpdateServiceRequestReferenceNumberHeaders soapHeaders ) {
    invoke( "updateServiceRequestReferenceNumber", new java.lang.Object[] { specialistId, serviceRequestNumber, newReferenceNumber, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_updateServiceRequestReferenceNumber( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String newReferenceNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.UpdateServiceRequestReferenceNumberHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateServiceRequestReferenceNumber", new java.lang.Object[] { specialistId, serviceRequestNumber, newReferenceNumber, soapHeaders } );
  }


  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentWithContent getDocumentContent( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String documentPublicId ) {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentWithContent) invoke( "getDocumentContent", new java.lang.Object[] { specialistId, serviceRequestNumber, documentPublicId } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentWithContent,gw.xsd.w3c.soap11_envelope.Envelope> async_getDocumentContent( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String documentPublicId ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentWithContent,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "getDocumentContent", new java.lang.Object[] { specialistId, serviceRequestNumber, documentPublicId } );
  }


  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentWithContent getDocumentContent( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String documentPublicId, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.GetDocumentContentHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentWithContent) invoke( "getDocumentContent", new java.lang.Object[] { specialistId, serviceRequestNumber, documentPublicId, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentWithContent,gw.xsd.w3c.soap11_envelope.Envelope> async_getDocumentContent( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String documentPublicId, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.GetDocumentContentHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentWithContent,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "getDocumentContent", new java.lang.Object[] { specialistId, serviceRequestNumber, documentPublicId, soapHeaders } );
  }


  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.MessagesForSpecialistResults getMessagesForSpecialist( java.lang.String specialistId ) {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.MessagesForSpecialistResults) invoke( "getMessagesForSpecialist", new java.lang.Object[] { specialistId } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.MessagesForSpecialistResults,gw.xsd.w3c.soap11_envelope.Envelope> async_getMessagesForSpecialist( java.lang.String specialistId ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.MessagesForSpecialistResults,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "getMessagesForSpecialist", new java.lang.Object[] { specialistId } );
  }


  public final wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.MessagesForSpecialistResults getMessagesForSpecialist( java.lang.String specialistId, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.GetMessagesForSpecialistHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.MessagesForSpecialistResults) invoke( "getMessagesForSpecialist", new java.lang.Object[] { specialistId, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.MessagesForSpecialistResults,gw.xsd.w3c.soap11_envelope.Envelope> async_getMessagesForSpecialist( java.lang.String specialistId, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.GetMessagesForSpecialistHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.MessagesForSpecialistResults,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "getMessagesForSpecialist", new java.lang.Object[] { specialistId, soapHeaders } );
  }


  public final void sendMessage( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String title, java.lang.String body, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestMessageType type ) {
    invoke( "sendMessage", new java.lang.Object[] { specialistId, serviceRequestNumber, title, body, type } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_sendMessage( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String title, java.lang.String body, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestMessageType type ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "sendMessage", new java.lang.Object[] { specialistId, serviceRequestNumber, title, body, type } );
  }


  public final void sendMessage( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String title, java.lang.String body, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestMessageType type, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.SendMessageHeaders soapHeaders ) {
    invoke( "sendMessage", new java.lang.Object[] { specialistId, serviceRequestNumber, title, body, type, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_sendMessage( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String title, java.lang.String body, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.enums.ServiceRequestMessageType type, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.SendMessageHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "sendMessage", new java.lang.Object[] { specialistId, serviceRequestNumber, title, body, type, soapHeaders } );
  }


  public final java.lang.String addOrReplaceQuote( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions creationInstructions ) {
    return (java.lang.String) invoke( "addOrReplaceQuote", new java.lang.Object[] { specialistId, serviceRequestNumber, creationInstructions } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope> async_addOrReplaceQuote( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions creationInstructions ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "addOrReplaceQuote", new java.lang.Object[] { specialistId, serviceRequestNumber, creationInstructions } );
  }


  public final java.lang.String addOrReplaceQuote( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions creationInstructions, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.AddOrReplaceQuoteHeaders soapHeaders ) {
    return (java.lang.String) invoke( "addOrReplaceQuote", new java.lang.Object[] { specialistId, serviceRequestNumber, creationInstructions, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope> async_addOrReplaceQuote( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions creationInstructions, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.AddOrReplaceQuoteHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "addOrReplaceQuote", new java.lang.Object[] { specialistId, serviceRequestNumber, creationInstructions, soapHeaders } );
  }


  public final java.lang.String addInvoice( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions creationInstructions ) {
    return (java.lang.String) invoke( "addInvoice", new java.lang.Object[] { specialistId, serviceRequestNumber, creationInstructions } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope> async_addInvoice( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions creationInstructions ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "addInvoice", new java.lang.Object[] { specialistId, serviceRequestNumber, creationInstructions } );
  }


  public final java.lang.String addInvoice( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions creationInstructions, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.AddInvoiceHeaders soapHeaders ) {
    return (java.lang.String) invoke( "addInvoice", new java.lang.Object[] { specialistId, serviceRequestNumber, creationInstructions, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope> async_addInvoice( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.StatementCreationInstructions creationInstructions, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.AddInvoiceHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "addInvoice", new java.lang.Object[] { specialistId, serviceRequestNumber, creationInstructions, soapHeaders } );
  }


  public final void updateExpectedQuoteCompletionDate( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, java.lang.String changeReason ) {
    invoke( "updateExpectedQuoteCompletionDate", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, changeReason } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_updateExpectedQuoteCompletionDate( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, java.lang.String changeReason ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateExpectedQuoteCompletionDate", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, changeReason } );
  }


  public final void updateExpectedQuoteCompletionDate( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, java.lang.String changeReason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.UpdateExpectedQuoteCompletionDateHeaders soapHeaders ) {
    invoke( "updateExpectedQuoteCompletionDate", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, changeReason, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_updateExpectedQuoteCompletionDate( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, java.lang.String changeReason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.UpdateExpectedQuoteCompletionDateHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateExpectedQuoteCompletionDate", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, changeReason, soapHeaders } );
  }


  public final void updateExpectedServiceCompletionDate( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, java.lang.String changeReason ) {
    invoke( "updateExpectedServiceCompletionDate", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, changeReason } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_updateExpectedServiceCompletionDate( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, java.lang.String changeReason ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateExpectedServiceCompletionDate", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, changeReason } );
  }


  public final void updateExpectedServiceCompletionDate( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, java.lang.String changeReason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.UpdateExpectedServiceCompletionDateHeaders soapHeaders ) {
    invoke( "updateExpectedServiceCompletionDate", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, changeReason, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_updateExpectedServiceCompletionDate( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, java.lang.String changeReason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.UpdateExpectedServiceCompletionDateHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "updateExpectedServiceCompletionDate", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, changeReason, soapHeaders } );
  }


  public final java.lang.String addDocument( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentContent documentToUpload, java.lang.String documentToUploadName ) {
    return (java.lang.String) invoke( "addDocument", new java.lang.Object[] { specialistId, serviceRequestNumber, documentToUpload, documentToUploadName } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope> async_addDocument( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentContent documentToUpload, java.lang.String documentToUploadName ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "addDocument", new java.lang.Object[] { specialistId, serviceRequestNumber, documentToUpload, documentToUploadName } );
  }


  public final java.lang.String addDocument( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentContent documentToUpload, java.lang.String documentToUploadName, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.AddDocumentHeaders soapHeaders ) {
    return (java.lang.String) invoke( "addDocument", new java.lang.Object[] { specialistId, serviceRequestNumber, documentToUpload, documentToUploadName, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope> async_addDocument( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.types.complex.DocumentContent documentToUpload, java.lang.String documentToUploadName, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.AddDocumentHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "addDocument", new java.lang.Object[] { specialistId, serviceRequestNumber, documentToUpload, documentToUploadName, soapHeaders } );
  }


  public final void acceptWork( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate ) {
    invoke( "acceptWork", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_acceptWork( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "acceptWork", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate } );
  }


  public final void acceptWork( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.AcceptWorkHeaders soapHeaders ) {
    invoke( "acceptWork", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_acceptWork( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.util.Date expectedCompletionDate, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.AcceptWorkHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "acceptWork", new java.lang.Object[] { specialistId, serviceRequestNumber, expectedCompletionDate, soapHeaders } );
  }


  public final void declineWork( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason ) {
    invoke( "declineWork", new java.lang.Object[] { specialistId, serviceRequestNumber, reason } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_declineWork( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "declineWork", new java.lang.Object[] { specialistId, serviceRequestNumber, reason } );
  }


  public final void declineWork( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.DeclineWorkHeaders soapHeaders ) {
    invoke( "declineWork", new java.lang.Object[] { specialistId, serviceRequestNumber, reason, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_declineWork( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.DeclineWorkHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "declineWork", new java.lang.Object[] { specialistId, serviceRequestNumber, reason, soapHeaders } );
  }


  public final void recordWorkResumed( java.lang.String specialistId, java.lang.String serviceRequestNumber ) {
    invoke( "recordWorkResumed", new java.lang.Object[] { specialistId, serviceRequestNumber } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_recordWorkResumed( java.lang.String specialistId, java.lang.String serviceRequestNumber ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "recordWorkResumed", new java.lang.Object[] { specialistId, serviceRequestNumber } );
  }


  public final void recordWorkResumed( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.RecordWorkResumedHeaders soapHeaders ) {
    invoke( "recordWorkResumed", new java.lang.Object[] { specialistId, serviceRequestNumber, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_recordWorkResumed( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.RecordWorkResumedHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "recordWorkResumed", new java.lang.Object[] { specialistId, serviceRequestNumber, soapHeaders } );
  }


  public final void recordWaiting( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason ) {
    invoke( "recordWaiting", new java.lang.Object[] { specialistId, serviceRequestNumber, reason } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_recordWaiting( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "recordWaiting", new java.lang.Object[] { specialistId, serviceRequestNumber, reason } );
  }


  public final void recordWaiting( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.RecordWaitingHeaders soapHeaders ) {
    invoke( "recordWaiting", new java.lang.Object[] { specialistId, serviceRequestNumber, reason, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_recordWaiting( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.RecordWaitingHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "recordWaiting", new java.lang.Object[] { specialistId, serviceRequestNumber, reason, soapHeaders } );
  }


  public final void recordWorkCompleted( java.lang.String specialistId, java.lang.String serviceRequestNumber ) {
    invoke( "recordWorkCompleted", new java.lang.Object[] { specialistId, serviceRequestNumber } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_recordWorkCompleted( java.lang.String specialistId, java.lang.String serviceRequestNumber ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "recordWorkCompleted", new java.lang.Object[] { specialistId, serviceRequestNumber } );
  }


  public final void recordWorkCompleted( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.RecordWorkCompletedHeaders soapHeaders ) {
    invoke( "recordWorkCompleted", new java.lang.Object[] { specialistId, serviceRequestNumber, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_recordWorkCompleted( java.lang.String specialistId, java.lang.String serviceRequestNumber, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.RecordWorkCompletedHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "recordWorkCompleted", new java.lang.Object[] { specialistId, serviceRequestNumber, soapHeaders } );
  }


  public final void cancelServiceRequest( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason ) {
    invoke( "cancelServiceRequest", new java.lang.Object[] { specialistId, serviceRequestNumber, reason } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_cancelServiceRequest( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "cancelServiceRequest", new java.lang.Object[] { specialistId, serviceRequestNumber, reason } );
  }


  public final void cancelServiceRequest( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.CancelServiceRequestHeaders soapHeaders ) {
    invoke( "cancelServiceRequest", new java.lang.Object[] { specialistId, serviceRequestNumber, reason, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_cancelServiceRequest( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String reason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.CancelServiceRequestHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "cancelServiceRequest", new java.lang.Object[] { specialistId, serviceRequestNumber, reason, soapHeaders } );
  }


  public final void withdrawInvoice( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String invoicePublicID, java.lang.String reason ) {
    invoke( "withdrawInvoice", new java.lang.Object[] { specialistId, serviceRequestNumber, invoicePublicID, reason } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_withdrawInvoice( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String invoicePublicID, java.lang.String reason ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "withdrawInvoice", new java.lang.Object[] { specialistId, serviceRequestNumber, invoicePublicID, reason } );
  }


  public final void withdrawInvoice( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String invoicePublicID, java.lang.String reason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.WithdrawInvoiceHeaders soapHeaders ) {
    invoke( "withdrawInvoice", new java.lang.Object[] { specialistId, serviceRequestNumber, invoicePublicID, reason, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope> async_withdrawInvoice( java.lang.String specialistId, java.lang.String serviceRequestNumber, java.lang.String invoicePublicID, java.lang.String reason, wsi.local.gw.webservice.cc.cc800.vendormanagement.servicerequestapi.soapheaders.WithdrawInvoiceHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap11_envelope.Envelope>) invokeAsync( "withdrawInvoice", new java.lang.Object[] { specialistId, serviceRequestNumber, invoicePublicID, reason, soapHeaders } );
  }

}
