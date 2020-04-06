/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BankInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BankInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BankId = new javax.xml.namespace.QName( "", "BankId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BranchId = new javax.xml.namespace.QName( "", "BranchId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.BankInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.BankInfo" );
    }
  };

  public BankInfo() {
    super( -805708294, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.BankInfo() );
  }

  public BankInfo( xsd.iso.resp.anonymous.types.complex.BankInfo typeInstance ) {
    super( -805708294, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BankInfo( gw.internal.xml.XmlElementState state ) {
    super( -805708294, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.BankInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.BankInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.BankInfo.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.BankInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.resp.BankInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.resp.BankInfo.class );
  }

  public static xsd.iso.resp.BankInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.resp.BankInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBankId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BankId" );
  }


  public final void setBankId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BankId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.BankInfo_BankId getBankId_elem() {
    return (xsd.iso.resp.anonymous.elements.BankInfo_BankId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BankId_elem" );
  }


  public final void setBankId_elem( xsd.iso.resp.anonymous.elements.BankInfo_BankId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BankId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBranchId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BranchId" );
  }


  public final void setBranchId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BranchId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.BankInfo_BranchId getBranchId_elem() {
    return (xsd.iso.resp.anonymous.elements.BankInfo_BranchId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BranchId_elem" );
  }


  public final void setBranchId_elem( xsd.iso.resp.anonymous.elements.BankInfo_BranchId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BranchId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.MiscParty> getMiscParty() {
    return (java.util.List<xsd.iso.resp.MiscParty>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MiscParty" );
  }


  public final void setMiscParty( java.util.List<xsd.iso.resp.MiscParty> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MiscParty", value );
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