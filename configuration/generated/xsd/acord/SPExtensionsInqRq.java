/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SPExtensionsInqRq extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SPExtensionsInqRq", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgNameCd = new javax.xml.namespace.QName( "", "MsgNameCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPXAsDt = new javax.xml.namespace.QName( "", "SPXAsDt", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SPExtensionsInqRq" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SPExtensionsInqRq_Type" );
    }
  };

  public SPExtensionsInqRq() {
    super( -201172826, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SPExtensionsInqRq_Type() );
  }

  public SPExtensionsInqRq( xsd.acord.types.complex.SPExtensionsInqRq_Type typeInstance ) {
    super( -201172826, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SPExtensionsInqRq( gw.internal.xml.XmlElementState state ) {
    super( -201172826, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SPExtensionsInqRq> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SPExtensionsInqRq_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SPExtensionsInqRq_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SPExtensionsInqRq_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SPExtensionsInqRq parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SPExtensionsInqRq.class );
  }

  public static xsd.acord.SPExtensionsInqRq parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SPExtensionsInqRq.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRqUID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RqUID" );
  }


  public final void setRqUID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RqUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RqUID getRqUID_elem() {
    return (xsd.acord.RqUID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RqUID_elem" );
  }


  public final void setRqUID_elem( xsd.acord.RqUID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RqUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LineOfBusiness getLOBCd() {
    return (xsd.acord.enums.LineOfBusiness) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LOBCd" );
  }


  public final void setLOBCd( xsd.acord.enums.LineOfBusiness value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LOBCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LOBCd getLOBCd_elem() {
    return (xsd.acord.LOBCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LOBCd_elem" );
  }


  public final void setLOBCd_elem( xsd.acord.LOBCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LOBCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.SvcMsg> getMsgNameCd() {
    return (java.util.List<xsd.acord.enums.SvcMsg>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgNameCd" );
  }


  public final void setMsgNameCd( java.util.List<xsd.acord.enums.SvcMsg> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgNameCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MsgNameCd> getMsgNameCd_elem() {
    return (java.util.List<xsd.acord.MsgNameCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgNameCd_elem" );
  }


  public final void setMsgNameCd_elem( java.util.List<xsd.acord.MsgNameCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgNameCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSPXAsDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPXAsDt" );
  }


  public final void setSPXAsDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPXAsDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SPXAsDt getSPXAsDt_elem() {
    return (xsd.acord.SPXAsDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPXAsDt_elem" );
  }


  public final void setSPXAsDt_elem( xsd.acord.SPXAsDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPXAsDt_elem", value );
  }
}