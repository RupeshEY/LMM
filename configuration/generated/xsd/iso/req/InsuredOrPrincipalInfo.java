/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class InsuredOrPrincipalInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "InsuredOrPrincipalInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipalRoleCd = new javax.xml.namespace.QName( "", "InsuredOrPrincipalRoleCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonInfo = new javax.xml.namespace.QName( "", "PersonInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessInfo = new javax.xml.namespace.QName( "", "BusinessInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrincipalInfo = new javax.xml.namespace.QName( "", "PrincipalInfo", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.InsuredOrPrincipalInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.InsuredOrPrincipalInfo" );
    }
  };

  public InsuredOrPrincipalInfo() {
    super( -1740605747, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.InsuredOrPrincipalInfo() );
  }

  public InsuredOrPrincipalInfo( xsd.iso.req.anonymous.types.complex.InsuredOrPrincipalInfo typeInstance ) {
    super( -1740605747, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private InsuredOrPrincipalInfo( gw.internal.xml.XmlElementState state ) {
    super( -1740605747, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.InsuredOrPrincipalInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.InsuredOrPrincipalInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.InsuredOrPrincipalInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.InsuredOrPrincipalInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }

  public static xsd.iso.req.InsuredOrPrincipalInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.InsuredOrPrincipalInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsuredOrPrincipalRoleCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredOrPrincipalRoleCd" );
  }


  public final void setInsuredOrPrincipalRoleCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredOrPrincipalRoleCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.InsuredOrPrincipalInfo_InsuredOrPrincipalRoleCd getInsuredOrPrincipalRoleCd_elem() {
    return (xsd.iso.req.anonymous.elements.InsuredOrPrincipalInfo_InsuredOrPrincipalRoleCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredOrPrincipalRoleCd_elem" );
  }


  public final void setInsuredOrPrincipalRoleCd_elem( xsd.iso.req.anonymous.elements.InsuredOrPrincipalInfo_InsuredOrPrincipalRoleCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredOrPrincipalRoleCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.PersonInfo getPersonInfo() {
    return (xsd.iso.req.PersonInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PersonInfo" );
  }


  public final void setPersonInfo( xsd.iso.req.PersonInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PersonInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.BusinessInfo getBusinessInfo() {
    return (xsd.iso.req.BusinessInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BusinessInfo" );
  }


  public final void setBusinessInfo( xsd.iso.req.BusinessInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BusinessInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.PrincipalInfo getPrincipalInfo() {
    return (xsd.iso.req.PrincipalInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrincipalInfo" );
  }


  public final void setPrincipalInfo( xsd.iso.req.PrincipalInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrincipalInfo", value );
  }
}