/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SuretyBondSearchInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SuretyBondSearchInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartialSuretyBond = new javax.xml.namespace.QName( "", "PartialSuretyBond", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SearchCriteriaInfo = new javax.xml.namespace.QName( "", "SearchCriteriaInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SuretyBondSearchInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SuretyBondSearchInfo_Type" );
    }
  };

  public SuretyBondSearchInfo() {
    super( -1144298233, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SuretyBondSearchInfo_Type() );
  }

  public SuretyBondSearchInfo( xsd.acord.types.complex.SuretyBondSearchInfo_Type typeInstance ) {
    super( -1144298233, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SuretyBondSearchInfo( gw.internal.xml.XmlElementState state ) {
    super( -1144298233, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SuretyBondSearchInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SuretyBondSearchInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SuretyBondSearchInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SuretyBondSearchInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }

  public static xsd.acord.SuretyBondSearchInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SuretyBondSearchInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PartialSuretyBond getPartialSuretyBond() {
    return (xsd.acord.PartialSuretyBond) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartialSuretyBond" );
  }


  public final void setPartialSuretyBond( xsd.acord.PartialSuretyBond value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartialSuretyBond", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SearchCriteriaInfo> getSearchCriteriaInfo() {
    return (java.util.List<xsd.acord.SearchCriteriaInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SearchCriteriaInfo" );
  }


  public final void setSearchCriteriaInfo( java.util.List<xsd.acord.SearchCriteriaInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SearchCriteriaInfo", value );
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