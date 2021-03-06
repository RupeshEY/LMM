/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrieveClaimRs extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "RetrieveClaimRs", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/retrieveClaim/rs/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CreationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredUUId = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ReferredUUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimMovement = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ClaimMovement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SupportingDocument = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "SupportingDocument", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Response = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Response", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ErrorsAndWarnings = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ErrorsAndWarnings", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInformation = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "AdditionalInformation", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Sender = new javax.xml.namespace.QName( "", "Sender", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Receiver = new javax.xml.namespace.QName( "", "Receiver", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs" );
    }
  };

  public RetrieveClaimRs() {
    super( 1586426598, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs() );
  }

  public RetrieveClaimRs( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs typeInstance ) {
    super( 1586426598, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrieveClaimRs( gw.internal.xml.XmlElementState state ) {
    super( 1586426598, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }

  public static gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUUId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UUId" );
  }


  public final void setUUId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UUId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId getUUId_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UUId_elem" );
  }


  public final void setUUId_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UUId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCreationDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreationDate" );
  }


  public final void setCreationDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreationDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CreationDate getCreationDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CreationDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CreationDate_elem" );
  }


  public final void setCreationDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CreationDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CreationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReferredUUId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReferredUUId" );
  }


  public final void setReferredUUId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReferredUUId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ReferredUUId getReferredUUId_elem() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ReferredUUId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReferredUUId_elem" );
  }


  public final void setReferredUUId_elem( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ReferredUUId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReferredUUId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement getClaimMovement() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimMovement" );
  }


  public final void setClaimMovement( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimMovement", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_SupportingDocument> getSupportingDocument() {
    return (java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_SupportingDocument>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SupportingDocument" );
  }


  public final void setSupportingDocument( java.util.List<gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_SupportingDocument> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SupportingDocument", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Response getResponse() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Response) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Response" );
  }


  public final void setResponse( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Response value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Response", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings getErrorsAndWarnings() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ErrorsAndWarnings" );
  }


  public final void setErrorsAndWarnings( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ErrorsAndWarnings value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ErrorsAndWarnings", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_AdditionalInformation getAdditionalInformation() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_AdditionalInformation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AdditionalInformation" );
  }


  public final void setAdditionalInformation( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_AdditionalInformation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AdditionalInformation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSender() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Sender" );
  }


  public final void setSender( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Sender", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReceiver() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Receiver" );
  }


  public final void setReceiver( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Receiver", value );
  }
}
