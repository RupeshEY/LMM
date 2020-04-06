/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class DSAKeyValue extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "DSAKeyValue", "ds" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/2000/09/xmldsig#", "ds" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_P = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "P", "ds" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Q = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "Q", "ds" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_G = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "G", "ds" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Y = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "Y", "ds" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_J = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "J", "ds" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Seed = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "Seed", "ds" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PgenCounter = new javax.xml.namespace.QName( "http://www.w3.org/2000/09/xmldsig#", "PgenCounter", "ds" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex.DSAKeyValueType" );
    }
  };

  public DSAKeyValue() {
    super( -979477200, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex.DSAKeyValueType() );
  }

  public DSAKeyValue( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex.DSAKeyValueType typeInstance ) {
    super( -979477200, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private DSAKeyValue( gw.internal.xml.XmlElementState state ) {
    super( -979477200, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex.DSAKeyValueType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex.DSAKeyValueType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.types.complex.DSAKeyValueType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.DSAKeyValue.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.BinaryData getP() {
    return (gw.xml.BinaryData) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_P" );
  }


  public final void setP( gw.xml.BinaryData value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_P", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_P getP_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_P) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_P_elem" );
  }


  public final void setP_elem( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_P value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_P_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.BinaryData getQ() {
    return (gw.xml.BinaryData) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Q" );
  }


  public final void setQ( gw.xml.BinaryData value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Q", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_Q getQ_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_Q) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Q_elem" );
  }


  public final void setQ_elem( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_Q value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Q_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.BinaryData getG() {
    return (gw.xml.BinaryData) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_G" );
  }


  public final void setG( gw.xml.BinaryData value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_G", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_G getG_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_G) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_G_elem" );
  }


  public final void setG_elem( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_G value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_G_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.BinaryData getY() {
    return (gw.xml.BinaryData) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Y" );
  }


  public final void setY( gw.xml.BinaryData value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Y", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_Y getY_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_Y) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Y_elem" );
  }


  public final void setY_elem( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_Y value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Y_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.BinaryData getJ() {
    return (gw.xml.BinaryData) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_J" );
  }


  public final void setJ( gw.xml.BinaryData value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_J", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_J getJ_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_J) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_J_elem" );
  }


  public final void setJ_elem( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_J value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_J_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.BinaryData getSeed() {
    return (gw.xml.BinaryData) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Seed" );
  }


  public final void setSeed( gw.xml.BinaryData value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Seed", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_Seed getSeed_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_Seed) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Seed_elem" );
  }


  public final void setSeed_elem( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_Seed value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Seed_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.BinaryData getPgenCounter() {
    return (gw.xml.BinaryData) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PgenCounter" );
  }


  public final void setPgenCounter( gw.xml.BinaryData value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PgenCounter", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_PgenCounter getPgenCounter_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_PgenCounter) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PgenCounter_elem" );
  }


  public final void setPgenCounter_elem( gw.acc.iplm.xsd.imr.schema_wsdl.xmldsig_core_schema.anonymous.elements.DSAKeyValueType_PgenCounter value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PgenCounter_elem", value );
  }
}