/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SvcProfInqRs extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SvcProfInqRs", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgStatus = new javax.xml.namespace.QName( "", "MsgStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustId = new javax.xml.namespace.QName( "", "CustId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UpDt = new javax.xml.namespace.QName( "", "UpDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NewUpDt = new javax.xml.namespace.QName( "", "NewUpDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BaseSvcProfInfo = new javax.xml.namespace.QName( "", "BaseSvcProfInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSvcProfInfo = new javax.xml.namespace.QName( "", "ClaimsSvcProfInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExtensionsSvcProfInfo = new javax.xml.namespace.QName( "", "ExtensionsSvcProfInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuranceSvcProfInfo = new javax.xml.namespace.QName( "", "InsuranceSvcProfInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuretySvcProfInfo = new javax.xml.namespace.QName( "", "SuretySvcProfInfo", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SvcProfInqRs" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SvcProfInqRs_Type" );
    }
  };

  public SvcProfInqRs() {
    super( -1904091032, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SvcProfInqRs_Type() );
  }

  public SvcProfInqRs( xsd.acord.types.complex.SvcProfInqRs_Type typeInstance ) {
    super( -1904091032, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SvcProfInqRs( gw.internal.xml.XmlElementState state ) {
    super( -1904091032, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SvcProfInqRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SvcProfInqRs_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SvcProfInqRs_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SvcProfInqRs_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SvcProfInqRs parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SvcProfInqRs.class );
  }

  public static xsd.acord.SvcProfInqRs parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SvcProfInqRs.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MsgStatus getMsgStatus() {
    return (xsd.acord.MsgStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgStatus" );
  }


  public final void setMsgStatus( xsd.acord.MsgStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CustId getCustId() {
    return (xsd.acord.CustId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustId" );
  }


  public final void setCustId( xsd.acord.CustId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUpDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UpDt" );
  }


  public final void setUpDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UpDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UpDt getUpDt_elem() {
    return (xsd.acord.UpDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UpDt_elem" );
  }


  public final void setUpDt_elem( xsd.acord.UpDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UpDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNewUpDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NewUpDt" );
  }


  public final void setNewUpDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NewUpDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NewUpDt getNewUpDt_elem() {
    return (xsd.acord.NewUpDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NewUpDt_elem" );
  }


  public final void setNewUpDt_elem( xsd.acord.NewUpDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NewUpDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.BaseSvcProfInfo> getBaseSvcProfInfo() {
    return (java.util.List<xsd.acord.BaseSvcProfInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BaseSvcProfInfo" );
  }


  public final void setBaseSvcProfInfo( java.util.List<xsd.acord.BaseSvcProfInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BaseSvcProfInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ClaimsSvcProfInfo> getClaimsSvcProfInfo() {
    return (java.util.List<xsd.acord.ClaimsSvcProfInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsSvcProfInfo" );
  }


  public final void setClaimsSvcProfInfo( java.util.List<xsd.acord.ClaimsSvcProfInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsSvcProfInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ExtensionsSvcProfInfo> getExtensionsSvcProfInfo() {
    return (java.util.List<xsd.acord.ExtensionsSvcProfInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExtensionsSvcProfInfo" );
  }


  public final void setExtensionsSvcProfInfo( java.util.List<xsd.acord.ExtensionsSvcProfInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExtensionsSvcProfInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuranceSvcProfInfo> getInsuranceSvcProfInfo() {
    return (java.util.List<xsd.acord.InsuranceSvcProfInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuranceSvcProfInfo" );
  }


  public final void setInsuranceSvcProfInfo( java.util.List<xsd.acord.InsuranceSvcProfInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuranceSvcProfInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SuretySvcProfInfo> getSuretySvcProfInfo() {
    return (java.util.List<xsd.acord.SuretySvcProfInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuretySvcProfInfo" );
  }


  public final void setSuretySvcProfInfo( java.util.List<xsd.acord.SuretySvcProfInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuretySvcProfInfo", value );
  }

}