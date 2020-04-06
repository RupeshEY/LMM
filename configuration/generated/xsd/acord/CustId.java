/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CustId extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CustId", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPName = new javax.xml.namespace.QName( "", "SPName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustPermId = new javax.xml.namespace.QName( "", "CustPermId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustLoginId = new javax.xml.namespace.QName( "", "CustLoginId", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CustId" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CustId_Type" );
    }
  };

  public CustId() {
    super( 796953922, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CustId_Type() );
  }

  public CustId( xsd.acord.types.complex.CustId_Type typeInstance ) {
    super( 796953922, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CustId( gw.internal.xml.XmlElementState state ) {
    super( 796953922, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CustId> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CustId_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CustId_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CustId_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CustId parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CustId.class );
  }

  public static xsd.acord.CustId parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CustId.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSPName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPName" );
  }


  public final void setSPName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SPName getSPName_elem() {
    return (xsd.acord.SPName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPName_elem" );
  }


  public final void setSPName_elem( xsd.acord.SPName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCustPermId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustPermId" );
  }


  public final void setCustPermId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustPermId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CustPermId getCustPermId_elem() {
    return (xsd.acord.CustPermId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustPermId_elem" );
  }


  public final void setCustPermId_elem( xsd.acord.CustPermId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustPermId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCustLoginId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustLoginId" );
  }


  public final void setCustLoginId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustLoginId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CustLoginId getCustLoginId_elem() {
    return (xsd.acord.CustLoginId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustLoginId_elem" );
  }


  public final void setCustLoginId_elem( xsd.acord.CustLoginId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustLoginId_elem", value );
  }
}