/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SuretyBondDetailInqInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SuretyBondDetailInqInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionInfo = new javax.xml.namespace.QName( "", "TransactionInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountNumberId = new javax.xml.namespace.QName( "", "AccountNumberId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuretyBond = new javax.xml.namespace.QName( "", "SuretyBond", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SuretyBondDetailInqInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SuretyBondDetailInqInfo_Type" );
    }
  };

  public SuretyBondDetailInqInfo() {
    super( -833110792, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SuretyBondDetailInqInfo_Type() );
  }

  public SuretyBondDetailInqInfo( xsd.acord.types.complex.SuretyBondDetailInqInfo_Type typeInstance ) {
    super( -833110792, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SuretyBondDetailInqInfo( gw.internal.xml.XmlElementState state ) {
    super( -833110792, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SuretyBondDetailInqInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SuretyBondDetailInqInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SuretyBondDetailInqInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SuretyBondDetailInqInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
  }

  public static xsd.acord.SuretyBondDetailInqInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SuretyBondDetailInqInfo.class );
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
  public final xsd.acord.TransactionInfo getTransactionInfo() {
    return (xsd.acord.TransactionInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionInfo" );
  }


  public final void setTransactionInfo( xsd.acord.TransactionInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionInfo", value );
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
  public final xsd.acord.SuretyBond getSuretyBond() {
    return (xsd.acord.SuretyBond) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SuretyBond" );
  }


  public final void setSuretyBond( xsd.acord.SuretyBond value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SuretyBond", value );
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