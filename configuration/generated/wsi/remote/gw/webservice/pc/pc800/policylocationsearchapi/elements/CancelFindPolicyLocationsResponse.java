/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CancelFindPolicyLocationsResponse extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "cancelFindPolicyLocationsResponse", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/PolicyLocationSearchAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.CancelFindPolicyLocationsResponse" );
    }
  };

  public CancelFindPolicyLocationsResponse() {
    super( -1483653900, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.CancelFindPolicyLocationsResponse() );
  }

  public CancelFindPolicyLocationsResponse( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.CancelFindPolicyLocationsResponse typeInstance ) {
    super( -1483653900, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CancelFindPolicyLocationsResponse( gw.internal.xml.XmlElementState state ) {
    super( -1483653900, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.CancelFindPolicyLocationsResponse get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.CancelFindPolicyLocationsResponse.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.anonymous.types.complex.CancelFindPolicyLocationsResponse typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }

  public static wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.elements.CancelFindPolicyLocationsResponse.class );
  }
}
