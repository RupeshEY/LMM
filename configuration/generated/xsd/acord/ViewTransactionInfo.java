/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ViewTransactionInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ViewTransactionInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionEffectiveDt = new javax.xml.namespace.QName( "", "TransactionEffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartialPolicy = new javax.xml.namespace.QName( "", "PartialPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartialSuretyBond = new javax.xml.namespace.QName( "", "PartialSuretyBond", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingAccountNumber = new javax.xml.namespace.QName( "", "BillingAccountNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ViewTransactionInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ViewTransactionInfo_Type" );
    }
  };

  public ViewTransactionInfo() {
    super( -510238381, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ViewTransactionInfo_Type() );
  }

  public ViewTransactionInfo( xsd.acord.types.complex.ViewTransactionInfo_Type typeInstance ) {
    super( -510238381, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ViewTransactionInfo( gw.internal.xml.XmlElementState state ) {
    super( -510238381, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ViewTransactionInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ViewTransactionInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ViewTransactionInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ViewTransactionInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ViewTransactionInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ViewTransactionInfo.class );
  }

  public static xsd.acord.ViewTransactionInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ViewTransactionInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransactionEffectiveDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionEffectiveDt" );
  }


  public final void setTransactionEffectiveDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionEffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransactionEffectiveDt getTransactionEffectiveDt_elem() {
    return (xsd.acord.TransactionEffectiveDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionEffectiveDt_elem" );
  }


  public final void setTransactionEffectiveDt_elem( xsd.acord.TransactionEffectiveDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionEffectiveDt_elem", value );
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
  public final xsd.acord.PartialSuretyBond getPartialSuretyBond() {
    return (xsd.acord.PartialSuretyBond) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PartialSuretyBond" );
  }


  public final void setPartialSuretyBond( xsd.acord.PartialSuretyBond value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PartialSuretyBond", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBillingAccountNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingAccountNumber" );
  }


  public final void setBillingAccountNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingAccountNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillingAccountNumber getBillingAccountNumber_elem() {
    return (xsd.acord.BillingAccountNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BillingAccountNumber_elem" );
  }


  public final void setBillingAccountNumber_elem( xsd.acord.BillingAccountNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BillingAccountNumber_elem", value );
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