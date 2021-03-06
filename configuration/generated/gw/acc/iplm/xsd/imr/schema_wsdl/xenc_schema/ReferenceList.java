/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ReferenceList extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2001/04/xmlenc#", "ReferenceList", "xenc" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.w3.org/2001/04/xmlenc#", "xenc" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DataReference = new javax.xml.namespace.QName( "http://www.w3.org/2001/04/xmlenc#", "DataReference", "xenc" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_KeyReference = new javax.xml.namespace.QName( "http://www.w3.org/2001/04/xmlenc#", "KeyReference", "xenc" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.types.complex.ReferenceList" );
    }
  };

  public ReferenceList() {
    super( 1588359853, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.types.complex.ReferenceList() );
  }

  public ReferenceList( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.types.complex.ReferenceList typeInstance ) {
    super( 1588359853, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ReferenceList( gw.internal.xml.XmlElementState state ) {
    super( 1588359853, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.types.complex.ReferenceList get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.types.complex.ReferenceList.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.types.complex.ReferenceList typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.ReferenceList.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.elements.ReferenceList_DataReference> getDataReference() {
    return (java.util.List<gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.elements.ReferenceList_DataReference>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DataReference" );
  }


  public final void setDataReference( java.util.List<gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.elements.ReferenceList_DataReference> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DataReference", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.elements.ReferenceList_KeyReference> getKeyReference() {
    return (java.util.List<gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.elements.ReferenceList_KeyReference>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_KeyReference" );
  }


  public final void setKeyReference( java.util.List<gw.acc.iplm.xsd.imr.schema_wsdl.xenc_schema.anonymous.elements.ReferenceList_KeyReference> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_KeyReference", value );
  }

}
