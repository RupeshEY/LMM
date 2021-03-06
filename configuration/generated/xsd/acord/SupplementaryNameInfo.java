/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SupplementaryNameInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SupplementaryNameInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SupplementaryNameCd = new javax.xml.namespace.QName( "", "SupplementaryNameCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SupplementaryName = new javax.xml.namespace.QName( "", "SupplementaryName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BranchId = new javax.xml.namespace.QName( "", "BranchId", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SupplementaryNameInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SupplementaryNameInfo_Type" );
    }
  };

  public SupplementaryNameInfo() {
    super( -1487242988, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SupplementaryNameInfo_Type() );
  }

  public SupplementaryNameInfo( xsd.acord.types.complex.SupplementaryNameInfo_Type typeInstance ) {
    super( -1487242988, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SupplementaryNameInfo( gw.internal.xml.XmlElementState state ) {
    super( -1487242988, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SupplementaryNameInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SupplementaryNameInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SupplementaryNameInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SupplementaryNameInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SupplementaryNameInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SupplementaryNameInfo.class );
  }

  public static xsd.acord.SupplementaryNameInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SupplementaryNameInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SupplementaryNameType getSupplementaryNameCd() {
    return (xsd.acord.enums.SupplementaryNameType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SupplementaryNameCd" );
  }


  public final void setSupplementaryNameCd( xsd.acord.enums.SupplementaryNameType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SupplementaryNameCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SupplementaryNameCd getSupplementaryNameCd_elem() {
    return (xsd.acord.SupplementaryNameCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SupplementaryNameCd_elem" );
  }


  public final void setSupplementaryNameCd_elem( xsd.acord.SupplementaryNameCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SupplementaryNameCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSupplementaryName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SupplementaryName" );
  }


  public final void setSupplementaryName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SupplementaryName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SupplementaryName getSupplementaryName_elem() {
    return (xsd.acord.SupplementaryName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SupplementaryName_elem" );
  }


  public final void setSupplementaryName_elem( xsd.acord.SupplementaryName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SupplementaryName_elem", value );
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
  public final xsd.acord.BranchId getBranchId_elem() {
    return (xsd.acord.BranchId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BranchId_elem" );
  }


  public final void setBranchId_elem( xsd.acord.BranchId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BranchId_elem", value );
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
