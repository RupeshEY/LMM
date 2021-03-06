/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ResponseInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "ResponseInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgId = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "MsgId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AcknowledgementLevelIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "AcknowledgementLevelIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AcknowledgementStatusCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "AcknowledgementStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ErrorIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "ErrorIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ResponseDescription = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "ResponseDescription", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.ResponseInfoType" );
    }
  };

  public ResponseInfo() {
    super( 1726268646, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.ResponseInfoType() );
  }

  public ResponseInfo( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.ResponseInfoType typeInstance ) {
    super( 1726268646, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ResponseInfo( gw.internal.xml.XmlElementState state ) {
    super( 1726268646, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.ResponseInfoType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.ResponseInfoType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.ResponseInfoType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }

  public static gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMsgId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgId" );
  }


  public final void setMsgId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.MsgId getMsgId_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.MsgId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgId_elem" );
  }


  public final void setMsgId_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.MsgId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AcknowledgementLevelIndicatorType getAcknowledgementLevelIndicator() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AcknowledgementLevelIndicatorType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AcknowledgementLevelIndicator" );
  }


  public final void setAcknowledgementLevelIndicator( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AcknowledgementLevelIndicatorType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AcknowledgementLevelIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AcknowledgementLevelIndicator getAcknowledgementLevelIndicator_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AcknowledgementLevelIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AcknowledgementLevelIndicator_elem" );
  }


  public final void setAcknowledgementLevelIndicator_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AcknowledgementLevelIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AcknowledgementLevelIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AcknowledgementStatusCdType getAcknowledgementStatusCd() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AcknowledgementStatusCdType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AcknowledgementStatusCd" );
  }


  public final void setAcknowledgementStatusCd( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.AcknowledgementStatusCdType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AcknowledgementStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AcknowledgementStatusCd getAcknowledgementStatusCd_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AcknowledgementStatusCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AcknowledgementStatusCd_elem" );
  }


  public final void setAcknowledgementStatusCd_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.AcknowledgementStatusCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AcknowledgementStatusCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getErrorIndicator() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ErrorIndicator" );
  }


  public final void setErrorIndicator( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ErrorIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ErrorIndicator getErrorIndicator_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ErrorIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ErrorIndicator_elem" );
  }


  public final void setErrorIndicator_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ErrorIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ErrorIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getResponseDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ResponseDescription" );
  }


  public final void setResponseDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ResponseDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseDescription getResponseDescription_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ResponseDescription_elem" );
  }


  public final void setResponseDescription_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ResponseDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ResponseDescription_elem", value );
  }
}
