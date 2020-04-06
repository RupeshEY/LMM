/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class WorkFolder extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "WorkFolder", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgFile = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "MsgFile", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttachmentPackages = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "AttachmentPackages", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex.WorkFolderType" );
    }
  };

  public WorkFolder() {
    super( 2121078764, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex.WorkFolderType() );
  }

  public WorkFolder( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex.WorkFolderType typeInstance ) {
    super( 2121078764, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private WorkFolder( gw.internal.xml.XmlElementState state ) {
    super( 2121078764, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex.WorkFolderType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex.WorkFolderType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex.WorkFolderType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }

  public static gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.WorkFolder.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.MsgFile getMsgFile() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.MsgFile) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MsgFile" );
  }


  public final void setMsgFile( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.MsgFile value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MsgFile", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackages getAttachmentPackages() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackages) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AttachmentPackages" );
  }


  public final void setAttachmentPackages( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackages value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AttachmentPackages", value );
  }
}