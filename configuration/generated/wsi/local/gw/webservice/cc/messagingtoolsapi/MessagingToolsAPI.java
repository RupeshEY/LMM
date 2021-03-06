/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public final class MessagingToolsAPI extends gw.internal.xml.ws.WsdlPortImpl {

  public static final javax.xml.namespace.QName PORT_QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "MessagingToolsAPISoap12Port", "" );
  public static final javax.xml.namespace.QName SERVICE_QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "MessagingToolsAPI", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.ws.WsdlPortTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.ws.WsdlPortTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.ws.WsdlPortTypeDataImpl init() {
      return (gw.internal.xml.ws.WsdlPortTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.MessagingToolsAPI" );
    }
  };
  public static final java.net.URI ADDRESS;

  static {
    try {
      ADDRESS = new java.net.URI( "local:///gw/webservice/cc/MessagingToolsAPI" );
    }
    catch ( java.net.URISyntaxException ex ) {
      throw gw.internal.xml.util.ExceptionUtil.forceThrow( ex );
    }
  }

  public MessagingToolsAPI() {
    super( TYPE.get(), new gw.xml.ws.WsdlConfig() );
  }

  public MessagingToolsAPI( gw.xml.ws.WsdlConfig config ) {
    super( TYPE.get(), config );
  }


  public final gw.xml.XmlElement document_literal( gw.xml.XmlElement document ) {
    return (gw.xml.XmlElement) invoke( "document_literal", new java.lang.Object[] { document } );
  }

  public final gw.xml.ws.AsyncResponse<gw.xml.XmlElement,gw.xsd.w3c.soap12_envelope.Envelope> async_document_literal( gw.xml.XmlElement document ) {
    return (gw.xml.ws.AsyncResponse<gw.xml.XmlElement,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "document_literal", new java.lang.Object[] { document } );
  }


  public final void resyncClaim( int destID, java.lang.String claimID ) {
    invoke( "resyncClaim", new java.lang.Object[] { destID, claimID } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_resyncClaim( int destID, java.lang.String claimID ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "resyncClaim", new java.lang.Object[] { destID, claimID } );
  }


  public final void resyncClaim( int destID, java.lang.String claimID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.ResyncClaimHeaders soapHeaders ) {
    invoke( "resyncClaim", new java.lang.Object[] { destID, claimID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_resyncClaim( int destID, java.lang.String claimID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.ResyncClaimHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "resyncClaim", new java.lang.Object[] { destID, claimID, soapHeaders } );
  }


  public final void purgeCompletedMessages( java.util.Date cutoff ) {
    invoke( "purgeCompletedMessages", new java.lang.Object[] { cutoff } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_purgeCompletedMessages( java.util.Date cutoff ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "purgeCompletedMessages", new java.lang.Object[] { cutoff } );
  }


  public final void purgeCompletedMessages( java.util.Date cutoff, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.PurgeCompletedMessagesHeaders soapHeaders ) {
    invoke( "purgeCompletedMessages", new java.lang.Object[] { cutoff, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_purgeCompletedMessages( java.util.Date cutoff, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.PurgeCompletedMessagesHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "purgeCompletedMessages", new java.lang.Object[] { cutoff, soapHeaders } );
  }


  public final void suspendDestinationBothDirections( int destID ) {
    invoke( "suspendDestinationBothDirections", new java.lang.Object[] { destID } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_suspendDestinationBothDirections( int destID ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "suspendDestinationBothDirections", new java.lang.Object[] { destID } );
  }


  public final void suspendDestinationBothDirections( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.SuspendDestinationBothDirectionsHeaders soapHeaders ) {
    invoke( "suspendDestinationBothDirections", new java.lang.Object[] { destID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_suspendDestinationBothDirections( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.SuspendDestinationBothDirectionsHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "suspendDestinationBothDirections", new java.lang.Object[] { destID, soapHeaders } );
  }


  public final void resumeDestinationBothDirections( int destID ) {
    invoke( "resumeDestinationBothDirections", new java.lang.Object[] { destID } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_resumeDestinationBothDirections( int destID ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "resumeDestinationBothDirections", new java.lang.Object[] { destID } );
  }


  public final void resumeDestinationBothDirections( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.ResumeDestinationBothDirectionsHeaders soapHeaders ) {
    invoke( "resumeDestinationBothDirections", new java.lang.Object[] { destID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_resumeDestinationBothDirections( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.ResumeDestinationBothDirectionsHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "resumeDestinationBothDirections", new java.lang.Object[] { destID, soapHeaders } );
  }


  public final void configureDestination( int destID, int timeToWaitInSec, java.lang.Integer maxretries, java.lang.Long initialretryinterval, java.lang.Integer retrybackoffmultiplier, java.lang.Integer pollinterval, java.lang.Integer numsenderthreads, java.lang.Integer chunksize ) {
    invoke( "configureDestination", new java.lang.Object[] { destID, timeToWaitInSec, maxretries, initialretryinterval, retrybackoffmultiplier, pollinterval, numsenderthreads, chunksize } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_configureDestination( int destID, int timeToWaitInSec, java.lang.Integer maxretries, java.lang.Long initialretryinterval, java.lang.Integer retrybackoffmultiplier, java.lang.Integer pollinterval, java.lang.Integer numsenderthreads, java.lang.Integer chunksize ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "configureDestination", new java.lang.Object[] { destID, timeToWaitInSec, maxretries, initialretryinterval, retrybackoffmultiplier, pollinterval, numsenderthreads, chunksize } );
  }


  public final void configureDestination( int destID, int timeToWaitInSec, java.lang.Integer maxretries, java.lang.Long initialretryinterval, java.lang.Integer retrybackoffmultiplier, java.lang.Integer pollinterval, java.lang.Integer numsenderthreads, java.lang.Integer chunksize, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.ConfigureDestinationHeaders soapHeaders ) {
    invoke( "configureDestination", new java.lang.Object[] { destID, timeToWaitInSec, maxretries, initialretryinterval, retrybackoffmultiplier, pollinterval, numsenderthreads, chunksize, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope> async_configureDestination( int destID, int timeToWaitInSec, java.lang.Integer maxretries, java.lang.Long initialretryinterval, java.lang.Integer retrybackoffmultiplier, java.lang.Integer pollinterval, java.lang.Integer numsenderthreads, java.lang.Integer chunksize, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.ConfigureDestinationHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Void,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "configureDestination", new java.lang.Object[] { destID, timeToWaitInSec, maxretries, initialretryinterval, retrybackoffmultiplier, pollinterval, numsenderthreads, chunksize, soapHeaders } );
  }


  public final wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.ExternalDestinationConfig getConfiguration( int destID ) {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.ExternalDestinationConfig) invoke( "getConfiguration", new java.lang.Object[] { destID } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.ExternalDestinationConfig,gw.xsd.w3c.soap12_envelope.Envelope> async_getConfiguration( int destID ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.ExternalDestinationConfig,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getConfiguration", new java.lang.Object[] { destID } );
  }


  public final wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.ExternalDestinationConfig getConfiguration( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetConfigurationHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.ExternalDestinationConfig) invoke( "getConfiguration", new java.lang.Object[] { destID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.ExternalDestinationConfig,gw.xsd.w3c.soap12_envelope.Envelope> async_getConfiguration( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetConfigurationHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.ExternalDestinationConfig,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getConfiguration", new java.lang.Object[] { destID, soapHeaders } );
  }


  public final long getMessageId( java.lang.String senderRefID, int destID ) {
    return (java.lang.Long) invoke( "getMessageId", new java.lang.Object[] { senderRefID, destID } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Long,gw.xsd.w3c.soap12_envelope.Envelope> async_getMessageId( java.lang.String senderRefID, int destID ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Long,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getMessageId", new java.lang.Object[] { senderRefID, destID } );
  }


  public final long getMessageId( java.lang.String senderRefID, int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetMessageIdHeaders soapHeaders ) {
    return (java.lang.Long) invoke( "getMessageId", new java.lang.Object[] { senderRefID, destID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Long,gw.xsd.w3c.soap12_envelope.Envelope> async_getMessageId( java.lang.String senderRefID, int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetMessageIdHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Long,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getMessageId", new java.lang.Object[] { senderRefID, destID, soapHeaders } );
  }


  public final java.lang.Long getMessageIdBySenderRefId( java.lang.String senderRefID, int destID ) {
    return (java.lang.Long) invoke( "getMessageIdBySenderRefId", new java.lang.Object[] { senderRefID, destID } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Long,gw.xsd.w3c.soap12_envelope.Envelope> async_getMessageIdBySenderRefId( java.lang.String senderRefID, int destID ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Long,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getMessageIdBySenderRefId", new java.lang.Object[] { senderRefID, destID } );
  }


  public final java.lang.Long getMessageIdBySenderRefId( java.lang.String senderRefID, int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetMessageIdBySenderRefIdHeaders soapHeaders ) {
    return (java.lang.Long) invoke( "getMessageIdBySenderRefId", new java.lang.Object[] { senderRefID, destID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Long,gw.xsd.w3c.soap12_envelope.Envelope> async_getMessageIdBySenderRefId( java.lang.String senderRefID, int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetMessageIdBySenderRefIdHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Long,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getMessageIdBySenderRefId", new java.lang.Object[] { senderRefID, destID, soapHeaders } );
  }


  public final boolean ackMessage( wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement ack ) {
    return (java.lang.Boolean) invoke( "ackMessage", new java.lang.Object[] { ack } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_ackMessage( wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement ack ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "ackMessage", new java.lang.Object[] { ack } );
  }


  public final boolean ackMessage( wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement ack, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.AckMessageHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "ackMessage", new java.lang.Object[] { ack, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_ackMessage( wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement ack, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.AckMessageHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "ackMessage", new java.lang.Object[] { ack, soapHeaders } );
  }


  public final boolean retryMessage( long messageID ) {
    return (java.lang.Boolean) invoke( "retryMessage", new java.lang.Object[] { messageID } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_retryMessage( long messageID ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "retryMessage", new java.lang.Object[] { messageID } );
  }


  public final boolean retryMessage( long messageID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.RetryMessageHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "retryMessage", new java.lang.Object[] { messageID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_retryMessage( long messageID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.RetryMessageHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "retryMessage", new java.lang.Object[] { messageID, soapHeaders } );
  }


  public final boolean skipMessage( long messageID ) {
    return (java.lang.Boolean) invoke( "skipMessage", new java.lang.Object[] { messageID } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_skipMessage( long messageID ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "skipMessage", new java.lang.Object[] { messageID } );
  }


  public final boolean skipMessage( long messageID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.SkipMessageHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "skipMessage", new java.lang.Object[] { messageID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_skipMessage( long messageID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.SkipMessageHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "skipMessage", new java.lang.Object[] { messageID, soapHeaders } );
  }


  public final boolean retryRetryableErrorMessages( int destID ) {
    return (java.lang.Boolean) invoke( "retryRetryableErrorMessages", new java.lang.Object[] { destID } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_retryRetryableErrorMessages( int destID ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "retryRetryableErrorMessages", new java.lang.Object[] { destID } );
  }


  public final boolean retryRetryableErrorMessages( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.RetryRetryableErrorMessagesHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "retryRetryableErrorMessages", new java.lang.Object[] { destID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_retryRetryableErrorMessages( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.RetryRetryableErrorMessagesHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "retryRetryableErrorMessages", new java.lang.Object[] { destID, soapHeaders } );
  }


  public final boolean retryRetryableSomeErrorMessages( int destID, int retryLimit ) {
    return (java.lang.Boolean) invoke( "retryRetryableSomeErrorMessages", new java.lang.Object[] { destID, retryLimit } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_retryRetryableSomeErrorMessages( int destID, int retryLimit ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "retryRetryableSomeErrorMessages", new java.lang.Object[] { destID, retryLimit } );
  }


  public final boolean retryRetryableSomeErrorMessages( int destID, int retryLimit, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.RetryRetryableSomeErrorMessagesHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "retryRetryableSomeErrorMessages", new java.lang.Object[] { destID, retryLimit, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_retryRetryableSomeErrorMessages( int destID, int retryLimit, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.RetryRetryableSomeErrorMessagesHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "retryRetryableSomeErrorMessages", new java.lang.Object[] { destID, retryLimit, soapHeaders } );
  }


  public final boolean retryRetryableErrorMessagesForCategory( int destID, java.lang.String category ) {
    return (java.lang.Boolean) invoke( "retryRetryableErrorMessagesForCategory", new java.lang.Object[] { destID, category } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_retryRetryableErrorMessagesForCategory( int destID, java.lang.String category ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "retryRetryableErrorMessagesForCategory", new java.lang.Object[] { destID, category } );
  }


  public final boolean retryRetryableErrorMessagesForCategory( int destID, java.lang.String category, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.RetryRetryableErrorMessagesForCategoryHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "retryRetryableErrorMessagesForCategory", new java.lang.Object[] { destID, category, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_retryRetryableErrorMessagesForCategory( int destID, java.lang.String category, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.RetryRetryableErrorMessagesForCategoryHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "retryRetryableErrorMessagesForCategory", new java.lang.Object[] { destID, category, soapHeaders } );
  }


  public final wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData getMessageStatisticsForSafeOrderedObject( int destID, java.lang.String safeOrderedObjectId ) {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData) invoke( "getMessageStatisticsForSafeOrderedObject", new java.lang.Object[] { destID, safeOrderedObjectId } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData,gw.xsd.w3c.soap12_envelope.Envelope> async_getMessageStatisticsForSafeOrderedObject( int destID, java.lang.String safeOrderedObjectId ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getMessageStatisticsForSafeOrderedObject", new java.lang.Object[] { destID, safeOrderedObjectId } );
  }


  public final wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData getMessageStatisticsForSafeOrderedObject( int destID, java.lang.String safeOrderedObjectId, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetMessageStatisticsForSafeOrderedObjectHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData) invoke( "getMessageStatisticsForSafeOrderedObject", new java.lang.Object[] { destID, safeOrderedObjectId, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData,gw.xsd.w3c.soap12_envelope.Envelope> async_getMessageStatisticsForSafeOrderedObject( int destID, java.lang.String safeOrderedObjectId, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetMessageStatisticsForSafeOrderedObjectHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getMessageStatisticsForSafeOrderedObject", new java.lang.Object[] { destID, safeOrderedObjectId, soapHeaders } );
  }


  public final wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData getTotalStatistics( int destID ) {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData) invoke( "getTotalStatistics", new java.lang.Object[] { destID } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData,gw.xsd.w3c.soap12_envelope.Envelope> async_getTotalStatistics( int destID ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getTotalStatistics", new java.lang.Object[] { destID } );
  }


  public final wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData getTotalStatistics( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetTotalStatisticsHeaders soapHeaders ) {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData) invoke( "getTotalStatistics", new java.lang.Object[] { destID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData,gw.xsd.w3c.soap12_envelope.Envelope> async_getTotalStatistics( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetTotalStatisticsHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.MessageStatisticsData,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getTotalStatistics", new java.lang.Object[] { destID, soapHeaders } );
  }


  public final boolean suspendDestination( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction ) {
    return (java.lang.Boolean) invoke( "suspendDestination", new java.lang.Object[] { destID, direction } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_suspendDestination( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "suspendDestination", new java.lang.Object[] { destID, direction } );
  }


  public final boolean suspendDestination( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.SuspendDestinationHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "suspendDestination", new java.lang.Object[] { destID, direction, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_suspendDestination( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.SuspendDestinationHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "suspendDestination", new java.lang.Object[] { destID, direction, soapHeaders } );
  }


  public final boolean resumeDestination( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction ) {
    return (java.lang.Boolean) invoke( "resumeDestination", new java.lang.Object[] { destID, direction } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_resumeDestination( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "resumeDestination", new java.lang.Object[] { destID, direction } );
  }


  public final boolean resumeDestination( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.ResumeDestinationHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "resumeDestination", new java.lang.Object[] { destID, direction, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_resumeDestination( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.ResumeDestinationHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "resumeDestination", new java.lang.Object[] { destID, direction, soapHeaders } );
  }


  public final boolean isSuspended( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction ) {
    return (java.lang.Boolean) invoke( "isSuspended", new java.lang.Object[] { destID, direction } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_isSuspended( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "isSuspended", new java.lang.Object[] { destID, direction } );
  }


  public final boolean isSuspended( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.IsSuspendedHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "isSuspended", new java.lang.Object[] { destID, direction, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_isSuspended( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.IsSuspendedHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "isSuspended", new java.lang.Object[] { destID, direction, soapHeaders } );
  }


  public final boolean isResumed( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction ) {
    return (java.lang.Boolean) invoke( "isResumed", new java.lang.Object[] { destID, direction } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_isResumed( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "isResumed", new java.lang.Object[] { destID, direction } );
  }


  public final boolean isResumed( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.IsResumedHeaders soapHeaders ) {
    return (java.lang.Boolean) invoke( "isResumed", new java.lang.Object[] { destID, direction, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope> async_isResumed( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.enums.MessageProcessingDirection direction, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.IsResumedHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.Boolean,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "isResumed", new java.lang.Object[] { destID, direction, soapHeaders } );
  }


  public final java.lang.String getDestinationStatus( int destID ) {
    return (java.lang.String) invoke( "getDestinationStatus", new java.lang.Object[] { destID } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap12_envelope.Envelope> async_getDestinationStatus( int destID ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getDestinationStatus", new java.lang.Object[] { destID } );
  }


  public final java.lang.String getDestinationStatus( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetDestinationStatusHeaders soapHeaders ) {
    return (java.lang.String) invoke( "getDestinationStatus", new java.lang.Object[] { destID, soapHeaders } );
  }

  public final gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap12_envelope.Envelope> async_getDestinationStatus( int destID, wsi.local.gw.webservice.cc.messagingtoolsapi.soapheaders.GetDestinationStatusHeaders soapHeaders ) {
    return (gw.xml.ws.AsyncResponse<java.lang.String,gw.xsd.w3c.soap12_envelope.Envelope>) invokeAsync( "getDestinationStatus", new java.lang.Object[] { destID, soapHeaders } );
  }

}
