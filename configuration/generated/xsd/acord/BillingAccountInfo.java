/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BillingAccountInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BillingAccountInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingAccountNumber = new javax.xml.namespace.QName( "", "BillingAccountNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingPeriod = new javax.xml.namespace.QName( "", "BillingPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingMethodCd = new javax.xml.namespace.QName( "", "BillingMethodCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.BillingAccountInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BillingAccountInfo_Type" );
    }
  };

  public BillingAccountInfo() {
    super( 1305622388, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.BillingAccountInfo_Type() );
  }

  public BillingAccountInfo( xsd.acord.types.complex.BillingAccountInfo_Type typeInstance ) {
    super( 1305622388, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BillingAccountInfo( gw.internal.xml.XmlElementState state ) {
    super( 1305622388, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.BillingAccountInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.BillingAccountInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.BillingAccountInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.BillingAccountInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.BillingAccountInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.BillingAccountInfo.class );
  }

  public static xsd.acord.BillingAccountInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.BillingAccountInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBillingAccountNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingAccountNumber" );
  }


  public final void setBillingAccountNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingAccountNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillingAccountNumber getBillingAccountNumber_elem() {
    return (xsd.acord.BillingAccountNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingAccountNumber_elem" );
  }


  public final void setBillingAccountNumber_elem( xsd.acord.BillingAccountNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingAccountNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillingPeriod getBillingPeriod() {
    return (xsd.acord.BillingPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingPeriod" );
  }


  public final void setBillingPeriod( xsd.acord.BillingPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.BillingMethod> getBillingMethodCd() {
    return (java.util.List<xsd.acord.enums.BillingMethod>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingMethodCd" );
  }


  public final void setBillingMethodCd( java.util.List<xsd.acord.enums.BillingMethod> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingMethodCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.BillingMethodCd> getBillingMethodCd_elem() {
    return (java.util.List<xsd.acord.BillingMethodCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingMethodCd_elem" );
  }


  public final void setBillingMethodCd_elem( java.util.List<xsd.acord.BillingMethodCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingMethodCd_elem", value );
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
