/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CreateActivityFromPattern extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "createActivityFromPattern", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "claimID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PatternID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "patternID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateActivityFromPattern" );
    }
  };

  public CreateActivityFromPattern() {
    super( 756218323, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateActivityFromPattern() );
  }

  public CreateActivityFromPattern( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateActivityFromPattern typeInstance ) {
    super( 756218323, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CreateActivityFromPattern( gw.internal.xml.XmlElementState state ) {
    super( 756218323, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateActivityFromPattern get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateActivityFromPattern.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateActivityFromPattern typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }

  public static wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.cc901.claim.claimapi.elements.CreateActivityFromPattern.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimID" );
  }


  public final void setClaimID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateActivityFromPattern_ClaimID getClaimID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateActivityFromPattern_ClaimID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimID_elem" );
  }


  public final void setClaimID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateActivityFromPattern_ClaimID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPatternID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PatternID" );
  }


  public final void setPatternID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PatternID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateActivityFromPattern_PatternID getPatternID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateActivityFromPattern_PatternID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PatternID_elem" );
  }


  public final void setPatternID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateActivityFromPattern_PatternID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PatternID_elem", value );
  }
}