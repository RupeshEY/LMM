/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.ports;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class PCClaimSearchIntegrationAPI_Soap12Port extends gw.internal.xml.ws.WsdlPortImpl {

  public static final javax.xml.namespace.QName PORT_QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/PCClaimSearchIntegrationAPI", "PCClaimSearchIntegrationAPISoap12Port", "" );
  public static final javax.xml.namespace.QName SERVICE_QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/PCClaimSearchIntegrationAPI", "PCClaimSearchIntegrationAPI", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.ws.WsdlPortTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.ws.WsdlPortTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.ws.WsdlPortTypeDataImpl init() {
      return (gw.internal.xml.ws.WsdlPortTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.ports.PCClaimSearchIntegrationAPI_Soap12Port" );
    }
  };
  public static final java.net.URI ADDRESS;

  static {
    try {
      ADDRESS = new java.net.URI( "local:///gw/webservice/cc/cc800/pcintegration/PCClaimSearchIntegrationAPI" );
    }
    catch ( java.net.URISyntaxException ex ) {
      throw gw.internal.xml.util.ExceptionUtil.forceThrow( ex );
    }
  }

  public PCClaimSearchIntegrationAPI_Soap12Port() {
    super( TYPE.get(), new gw.xml.ws.WsdlConfig() );
  }

  public PCClaimSearchIntegrationAPI_Soap12Port( gw.xml.ws.WsdlConfig config ) {
    super( TYPE.get(), config );
  }


  public final gw.xml.XmlElement document_literal( gw.xml.XmlElement document ) {
    return (gw.xml.XmlElement) invoke( "document_literal", new java.lang.Object[] { document } );
  }

  public final gw.xml.ws.AsyncResponse<gw.xml.XmlElement,gw.xsd.w3c.soap12_envelope.Envelope> async_document_literal( gw.xml.XmlElement document ) {
    return (gw.xml.ws.AsyncResponse<gw.xml.XmlElement,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "document_literal", new java.lang.Object[] { document } );
  }


  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[] searchForClaims( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria criteria ) {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[]) invoke( "searchForClaims", new java.lang.Object[] { criteria } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[],gw.xsd.w3c.soap12_envelope.Envelope> async_searchForClaims( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria criteria ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[],gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "searchForClaims", new java.lang.Object[] { criteria } );
  }


  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[] searchForClaims( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria criteria, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.SearchForClaimsHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[]) invoke( "searchForClaims", new java.lang.Object[] { criteria, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[],gw.xsd.w3c.soap12_envelope.Envelope> async_searchForClaims( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria criteria, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.SearchForClaimsHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[],gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "searchForClaims", new java.lang.Object[] { criteria, soapHeaders } );
  }


  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[] searchForClaimsMultiCriteria( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria[] criteria ) {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[]) invoke( "searchForClaimsMultiCriteria", new java.lang.Object[] { criteria } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[],gw.xsd.w3c.soap12_envelope.Envelope> async_searchForClaimsMultiCriteria( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria[] criteria ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[],gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "searchForClaimsMultiCriteria", new java.lang.Object[] { criteria } );
  }


  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[] searchForClaimsMultiCriteria( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria[] criteria, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.SearchForClaimsMultiCriteriaHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[]) invoke( "searchForClaimsMultiCriteria", new java.lang.Object[] { criteria, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[],gw.xsd.w3c.soap12_envelope.Envelope> async_searchForClaimsMultiCriteria( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria[] criteria, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.SearchForClaimsMultiCriteriaHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaim[],gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "searchForClaimsMultiCriteria", new java.lang.Object[] { criteria, soapHeaders } );
  }


  public final java.lang.Integer getNumberOfClaims( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria criteria ) {
    return (java.lang.Integer) invoke( "getNumberOfClaims", new java.lang.Object[] { criteria } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap12_envelope.Envelope> async_getNumberOfClaims( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria criteria ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getNumberOfClaims", new java.lang.Object[] { criteria } );
  }


  public final java.lang.Integer getNumberOfClaims( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria criteria, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.GetNumberOfClaimsHeaders soapHeaders ) {
    return (java.lang.Integer) invoke( "getNumberOfClaims", new java.lang.Object[] { criteria, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap12_envelope.Envelope> async_getNumberOfClaims( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria criteria, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.GetNumberOfClaimsHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getNumberOfClaims", new java.lang.Object[] { criteria, soapHeaders } );
  }


  public final java.lang.Integer getNumberOfClaimsMultiCriteria( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria[] criteria ) {
    return (java.lang.Integer) invoke( "getNumberOfClaimsMultiCriteria", new java.lang.Object[] { criteria } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap12_envelope.Envelope> async_getNumberOfClaimsMultiCriteria( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria[] criteria ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getNumberOfClaimsMultiCriteria", new java.lang.Object[] { criteria } );
  }


  public final java.lang.Integer getNumberOfClaimsMultiCriteria( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria[] criteria, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.GetNumberOfClaimsMultiCriteriaHeaders soapHeaders ) {
    return (java.lang.Integer) invoke( "getNumberOfClaimsMultiCriteria", new java.lang.Object[] { criteria, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap12_envelope.Envelope> async_getNumberOfClaimsMultiCriteria( wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria[] criteria, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.GetNumberOfClaimsMultiCriteriaHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Integer,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getNumberOfClaimsMultiCriteria", new java.lang.Object[] { criteria, soapHeaders } );
  }


  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimDetail getClaimByClaimNumber( java.lang.String claimNumber ) {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimDetail) invoke( "getClaimByClaimNumber", new java.lang.Object[] { claimNumber } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimDetail,gw.xsd.w3c.soap12_envelope.Envelope> async_getClaimByClaimNumber( java.lang.String claimNumber ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimDetail,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getClaimByClaimNumber", new java.lang.Object[] { claimNumber } );
  }


  public final wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimDetail getClaimByClaimNumber( java.lang.String claimNumber, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.GetClaimByClaimNumberHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimDetail) invoke( "getClaimByClaimNumber", new java.lang.Object[] { claimNumber, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimDetail,gw.xsd.w3c.soap12_envelope.Envelope> async_getClaimByClaimNumber( java.lang.String claimNumber, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.GetClaimByClaimNumberHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimDetail,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getClaimByClaimNumber", new java.lang.Object[] { claimNumber, soapHeaders } );
  }


  public final void giveUserClaimViewPermission( java.lang.String claimPublicID, java.lang.String userName ) {
    invoke( "giveUserClaimViewPermission", new java.lang.Object[] { claimPublicID, userName } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_giveUserClaimViewPermission( java.lang.String claimPublicID, java.lang.String userName ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "giveUserClaimViewPermission", new java.lang.Object[] { claimPublicID, userName } );
  }


  public final void giveUserClaimViewPermission( java.lang.String claimPublicID, java.lang.String userName, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.GiveUserClaimViewPermissionHeaders soapHeaders ) {
    invoke( "giveUserClaimViewPermission", new java.lang.Object[] { claimPublicID, userName, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_giveUserClaimViewPermission( java.lang.String claimPublicID, java.lang.String userName, wsi.local.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.soapheaders.GiveUserClaimViewPermissionHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "giveUserClaimViewPermission", new java.lang.Object[] { claimPublicID, userName, soapHeaders } );
  }

}
