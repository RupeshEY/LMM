/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClientApp extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ClientApp", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Org = new javax.xml.namespace.QName( "", "Org", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Name = new javax.xml.namespace.QName( "", "Name", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Version = new javax.xml.namespace.QName( "", "Version", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ClientApp" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ClientApp_Type" );
    }
  };

  public ClientApp() {
    super( 289827682, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ClientApp_Type() );
  }

  public ClientApp( xsd.acord.types.complex.ClientApp_Type typeInstance ) {
    super( 289827682, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClientApp( gw.internal.xml.XmlElementState state ) {
    super( 289827682, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ClientApp> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ClientApp_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ClientApp_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ClientApp_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ClientApp parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ClientApp.class );
  }

  public static xsd.acord.ClientApp parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ClientApp.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOrg() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Org" );
  }


  public final void setOrg( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Org", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Org getOrg_elem() {
    return (xsd.acord.Org) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Org_elem" );
  }


  public final void setOrg_elem( xsd.acord.Org value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Org_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Name" );
  }


  public final void setName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Name", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Name getName_elem() {
    return (xsd.acord.Name) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Name_elem" );
  }


  public final void setName_elem( xsd.acord.Name value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Name_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVersion() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Version" );
  }


  public final void setVersion( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Version", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Version getVersion_elem() {
    return (xsd.acord.Version) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Version_elem" );
  }


  public final void setVersion_elem( xsd.acord.Version value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Version_elem", value );
  }
}