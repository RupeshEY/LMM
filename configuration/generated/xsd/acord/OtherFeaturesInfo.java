/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class OtherFeaturesInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "OtherFeaturesInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherFeaturesDesc = new javax.xml.namespace.QName( "", "OtherFeaturesDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OtherFeaturesAmt = new javax.xml.namespace.QName( "", "OtherFeaturesAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalArea = new javax.xml.namespace.QName( "", "TotalArea", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.OtherFeaturesInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.OtherFeaturesInfo_Type" );
    }
  };

  public OtherFeaturesInfo() {
    super( 1188444871, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.OtherFeaturesInfo_Type() );
  }

  public OtherFeaturesInfo( xsd.acord.types.complex.OtherFeaturesInfo_Type typeInstance ) {
    super( 1188444871, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private OtherFeaturesInfo( gw.internal.xml.XmlElementState state ) {
    super( 1188444871, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.OtherFeaturesInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.OtherFeaturesInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.OtherFeaturesInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.OtherFeaturesInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.OtherFeaturesInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.OtherFeaturesInfo.class );
  }

  public static xsd.acord.OtherFeaturesInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.OtherFeaturesInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOtherFeaturesDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherFeaturesDesc" );
  }


  public final void setOtherFeaturesDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherFeaturesDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherFeaturesDesc getOtherFeaturesDesc_elem() {
    return (xsd.acord.OtherFeaturesDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherFeaturesDesc_elem" );
  }


  public final void setOtherFeaturesDesc_elem( xsd.acord.OtherFeaturesDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherFeaturesDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OtherFeaturesAmt getOtherFeaturesAmt() {
    return (xsd.acord.OtherFeaturesAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherFeaturesAmt" );
  }


  public final void setOtherFeaturesAmt( xsd.acord.OtherFeaturesAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherFeaturesAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalArea getTotalArea() {
    return (xsd.acord.TotalArea) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalArea" );
  }


  public final void setTotalArea( xsd.acord.TotalArea value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalArea", value );
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