/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PolicyInqInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PolicyInqInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartialPolicy = new javax.xml.namespace.QName( "", "PartialPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SearchInfo = new javax.xml.namespace.QName( "", "SearchInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountNumberId = new javax.xml.namespace.QName( "", "AccountNumberId", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.PolicyInqInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PolicyInqInfo_Type" );
    }
  };

  public PolicyInqInfo() {
    super( -142852044, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.PolicyInqInfo_Type() );
  }

  public PolicyInqInfo( xsd.acord.types.complex.PolicyInqInfo_Type typeInstance ) {
    super( -142852044, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PolicyInqInfo( gw.internal.xml.XmlElementState state ) {
    super( -142852044, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.PolicyInqInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.PolicyInqInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.PolicyInqInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.PolicyInqInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.PolicyInqInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.PolicyInqInfo.class );
  }

  public static xsd.acord.PolicyInqInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.PolicyInqInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipal> getInsuredOrPrincipal() {
    return (java.util.List<xsd.acord.InsuredOrPrincipal>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( java.util.List<xsd.acord.InsuredOrPrincipal> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredOrPrincipal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PartialPolicy> getPartialPolicy() {
    return (java.util.List<xsd.acord.PartialPolicy>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartialPolicy" );
  }


  public final void setPartialPolicy( java.util.List<xsd.acord.PartialPolicy> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartialPolicy", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SearchInfo> getSearchInfo() {
    return (java.util.List<xsd.acord.SearchInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SearchInfo" );
  }


  public final void setSearchInfo( java.util.List<xsd.acord.SearchInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SearchInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAccountNumberId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AccountNumberId" );
  }


  public final void setAccountNumberId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AccountNumberId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AccountNumberId getAccountNumberId_elem() {
    return (xsd.acord.AccountNumberId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AccountNumberId_elem" );
  }


  public final void setAccountNumberId_elem( xsd.acord.AccountNumberId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AccountNumberId_elem", value );
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