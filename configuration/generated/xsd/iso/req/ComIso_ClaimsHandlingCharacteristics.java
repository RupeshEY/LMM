/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ComIso_ClaimsHandlingCharacteristics extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "com.iso_ClaimsHandlingCharacteristics", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_CharacteristicCd = new javax.xml.namespace.QName( "", "com.iso_CharacteristicCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_CharacteristicText = new javax.xml.namespace.QName( "", "com.iso_CharacteristicText", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.ComIso_ClaimsHandlingCharacteristics" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ComIso_ClaimsHandlingCharacteristics" );
    }
  };

  public ComIso_ClaimsHandlingCharacteristics() {
    super( -693720897, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.ComIso_ClaimsHandlingCharacteristics() );
  }

  public ComIso_ClaimsHandlingCharacteristics( xsd.iso.req.anonymous.types.complex.ComIso_ClaimsHandlingCharacteristics typeInstance ) {
    super( -693720897, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ComIso_ClaimsHandlingCharacteristics( gw.internal.xml.XmlElementState state ) {
    super( -693720897, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.ComIso_ClaimsHandlingCharacteristics> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.ComIso_ClaimsHandlingCharacteristics get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.ComIso_ClaimsHandlingCharacteristics typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }

  public static xsd.iso.req.ComIso_ClaimsHandlingCharacteristics parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.ComIso_ClaimsHandlingCharacteristics.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_CharacteristicCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_CharacteristicCd" );
  }


  public final void setComIso_CharacteristicCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_CharacteristicCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_ClaimsHandlingCharacteristics_ComIso_CharacteristicCd getComIso_CharacteristicCd_elem() {
    return (xsd.iso.req.anonymous.elements.ComIso_ClaimsHandlingCharacteristics_ComIso_CharacteristicCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_CharacteristicCd_elem" );
  }


  public final void setComIso_CharacteristicCd_elem( xsd.iso.req.anonymous.elements.ComIso_ClaimsHandlingCharacteristics_ComIso_CharacteristicCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_CharacteristicCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_CharacteristicText() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_CharacteristicText" );
  }


  public final void setComIso_CharacteristicText( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_CharacteristicText", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_ClaimsHandlingCharacteristics_ComIso_CharacteristicText getComIso_CharacteristicText_elem() {
    return (xsd.iso.req.anonymous.elements.ComIso_ClaimsHandlingCharacteristics_ComIso_CharacteristicText) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ComIso_CharacteristicText_elem" );
  }


  public final void setComIso_CharacteristicText_elem( xsd.iso.req.anonymous.elements.ComIso_ClaimsHandlingCharacteristics_ComIso_CharacteristicText value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ComIso_CharacteristicText_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}