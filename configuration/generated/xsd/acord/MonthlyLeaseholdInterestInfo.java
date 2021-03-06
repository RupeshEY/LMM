/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MonthlyLeaseholdInterestInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "MonthlyLeaseholdInterestInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BonusAmt = new javax.xml.namespace.QName( "", "BonusAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ImprovementsAndBettermentsAmt = new javax.xml.namespace.QName( "", "ImprovementsAndBettermentsAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrepaidRentAmt = new javax.xml.namespace.QName( "", "PrepaidRentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentDt = new javax.xml.namespace.QName( "", "PaymentDt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.MonthlyLeaseholdInterestInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.MonthlyLeaseholdInterestInfo_Type" );
    }
  };

  public MonthlyLeaseholdInterestInfo() {
    super( -130053864, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.MonthlyLeaseholdInterestInfo_Type() );
  }

  public MonthlyLeaseholdInterestInfo( xsd.acord.types.complex.MonthlyLeaseholdInterestInfo_Type typeInstance ) {
    super( -130053864, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MonthlyLeaseholdInterestInfo( gw.internal.xml.XmlElementState state ) {
    super( -130053864, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.MonthlyLeaseholdInterestInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.MonthlyLeaseholdInterestInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.MonthlyLeaseholdInterestInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.MonthlyLeaseholdInterestInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }

  public static xsd.acord.MonthlyLeaseholdInterestInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.MonthlyLeaseholdInterestInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BonusAmt getBonusAmt() {
    return (xsd.acord.BonusAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BonusAmt" );
  }


  public final void setBonusAmt( xsd.acord.BonusAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BonusAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ImprovementsAndBettermentsAmt getImprovementsAndBettermentsAmt() {
    return (xsd.acord.ImprovementsAndBettermentsAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ImprovementsAndBettermentsAmt" );
  }


  public final void setImprovementsAndBettermentsAmt( xsd.acord.ImprovementsAndBettermentsAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ImprovementsAndBettermentsAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PrepaidRentAmt getPrepaidRentAmt() {
    return (xsd.acord.PrepaidRentAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrepaidRentAmt" );
  }


  public final void setPrepaidRentAmt( xsd.acord.PrepaidRentAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrepaidRentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPaymentDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PaymentDt" );
  }


  public final void setPaymentDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PaymentDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaymentDt getPaymentDt_elem() {
    return (xsd.acord.PaymentDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PaymentDt_elem" );
  }


  public final void setPaymentDt_elem( xsd.acord.PaymentDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PaymentDt_elem", value );
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
