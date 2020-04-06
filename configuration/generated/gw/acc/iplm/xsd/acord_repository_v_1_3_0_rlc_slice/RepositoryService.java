/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RepositoryService extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "RepositoryService", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceAddress = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "ServiceAddress", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceName = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "ServiceName", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.RepositoryServiceType" );
    }
  };

  public RepositoryService() {
    super( 348412914, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.RepositoryServiceType() );
  }

  public RepositoryService( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.RepositoryServiceType typeInstance ) {
    super( 348412914, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RepositoryService( gw.internal.xml.XmlElementState state ) {
    super( 348412914, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.RepositoryServiceType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.RepositoryServiceType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.RepositoryServiceType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceAddress() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceAddress" );
  }


  public final void setServiceAddress( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceAddress", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ServiceAddress getServiceAddress_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ServiceAddress) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceAddress_elem" );
  }


  public final void setServiceAddress_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ServiceAddress value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceAddress_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceName" );
  }


  public final void setServiceName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ServiceName getServiceName_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ServiceName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServiceName_elem" );
  }


  public final void setServiceName_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ServiceName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServiceName_elem", value );
  }
}