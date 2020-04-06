/* Generated by Guidewire XML Code Generator */

package xsd.iso.req;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ACORD extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ACORD", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonRq = new javax.xml.namespace.QName( "", "SignonRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuppressNotificationInd = new javax.xml.namespace.QName( "", "SuppressNotificationInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BaseSvcRq = new javax.xml.namespace.QName( "", "BaseSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSvcRq = new javax.xml.namespace.QName( "", "ClaimsSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignoffRq = new javax.xml.namespace.QName( "", "SignoffRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "", "Status", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonRs = new javax.xml.namespace.QName( "", "SignonRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PendingResponseInfo = new javax.xml.namespace.QName( "", "PendingResponseInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BaseSvcRs = new javax.xml.namespace.QName( "", "BaseSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSvcRs = new javax.xml.namespace.QName( "", "ClaimsSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignoffRs = new javax.xml.namespace.QName( "", "SignoffRs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.ACORD" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ACORD" );
    }
  };

  public ACORD() {
    super( 1052776321, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.req.anonymous.types.complex.ACORD() );
  }

  public ACORD( xsd.iso.req.anonymous.types.complex.ACORD typeInstance ) {
    super( 1052776321, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ACORD( gw.internal.xml.XmlElementState state ) {
    super( 1052776321, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.req.ACORD> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.req.anonymous.types.complex.ACORD get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.req.anonymous.types.complex.ACORD.class );
  }

  public final void set$TypeInstance( xsd.iso.req.anonymous.types.complex.ACORD typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.req.ACORD parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.req.ACORD.class );
  }

  public static xsd.iso.req.ACORD parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.req.ACORD.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.SignonRq getSignonRq() {
    return (xsd.iso.req.SignonRq) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignonRq" );
  }


  public final void setSignonRq( xsd.iso.req.SignonRq value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignonRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSuppressNotificationInd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuppressNotificationInd" );
  }


  public final void setSuppressNotificationInd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuppressNotificationInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.SuppressNotificationInd getSuppressNotificationInd_elem() {
    return (xsd.iso.req.SuppressNotificationInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuppressNotificationInd_elem" );
  }


  public final void setSuppressNotificationInd_elem( xsd.iso.req.SuppressNotificationInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuppressNotificationInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ACORD_BaseSvcRq getBaseSvcRq() {
    return (xsd.iso.req.anonymous.elements.ACORD_BaseSvcRq) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BaseSvcRq" );
  }


  public final void setBaseSvcRq( xsd.iso.req.anonymous.elements.ACORD_BaseSvcRq value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BaseSvcRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ClaimsSvcRq> getClaimsSvcRq() {
    return (java.util.List<xsd.iso.req.ClaimsSvcRq>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsSvcRq" );
  }


  public final void setClaimsSvcRq( java.util.List<xsd.iso.req.ClaimsSvcRq> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ACORD_SignoffRq getSignoffRq() {
    return (xsd.iso.req.anonymous.elements.ACORD_SignoffRq) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignoffRq" );
  }


  public final void setSignoffRq( xsd.iso.req.anonymous.elements.ACORD_SignoffRq value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignoffRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Status getStatus() {
    return (xsd.iso.req.Status) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Status" );
  }


  public final void setStatus( xsd.iso.req.Status value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.SignonRs getSignonRs() {
    return (xsd.iso.req.SignonRs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignonRs" );
  }


  public final void setSignonRs( xsd.iso.req.SignonRs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignonRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.PendingResponseInfo> getPendingResponseInfo() {
    return (java.util.List<xsd.iso.req.PendingResponseInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PendingResponseInfo" );
  }


  public final void setPendingResponseInfo( java.util.List<xsd.iso.req.PendingResponseInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PendingResponseInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ACORD_BaseSvcRs getBaseSvcRs() {
    return (xsd.iso.req.anonymous.elements.ACORD_BaseSvcRs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BaseSvcRs" );
  }


  public final void setBaseSvcRs( xsd.iso.req.anonymous.elements.ACORD_BaseSvcRs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BaseSvcRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ClaimsSvcRs> getClaimsSvcRs() {
    return (java.util.List<xsd.iso.req.ClaimsSvcRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsSvcRs" );
  }


  public final void setClaimsSvcRs( java.util.List<xsd.iso.req.ClaimsSvcRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.SignoffRs getSignoffRs() {
    return (xsd.iso.req.SignoffRs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SignoffRs" );
  }


  public final void setSignoffRs( xsd.iso.req.SignoffRs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SignoffRs", value );
  }
}