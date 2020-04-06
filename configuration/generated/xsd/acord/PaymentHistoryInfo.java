/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PaymentHistoryInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PaymentHistoryInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GoodPaymentHistoryInd = new javax.xml.namespace.QName( "", "GoodPaymentHistoryInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumLatePayments = new javax.xml.namespace.QName( "", "NumLatePayments", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumCancRein = new javax.xml.namespace.QName( "", "NumCancRein", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DurationPeriod = new javax.xml.namespace.QName( "", "DurationPeriod", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.PaymentHistoryInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PaymentHistoryInfo_Type" );
    }
  };

  public PaymentHistoryInfo() {
    super( 346710512, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.PaymentHistoryInfo_Type() );
  }

  public PaymentHistoryInfo( xsd.acord.types.complex.PaymentHistoryInfo_Type typeInstance ) {
    super( 346710512, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PaymentHistoryInfo( gw.internal.xml.XmlElementState state ) {
    super( 346710512, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.PaymentHistoryInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.PaymentHistoryInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.PaymentHistoryInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.PaymentHistoryInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.PaymentHistoryInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.PaymentHistoryInfo.class );
  }

  public static xsd.acord.PaymentHistoryInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.PaymentHistoryInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getGoodPaymentHistoryInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GoodPaymentHistoryInd" );
  }


  public final void setGoodPaymentHistoryInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GoodPaymentHistoryInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.GoodPaymentHistoryInd getGoodPaymentHistoryInd_elem() {
    return (xsd.acord.GoodPaymentHistoryInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GoodPaymentHistoryInd_elem" );
  }


  public final void setGoodPaymentHistoryInd_elem( xsd.acord.GoodPaymentHistoryInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GoodPaymentHistoryInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumLatePayments() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLatePayments" );
  }


  public final void setNumLatePayments( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLatePayments", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumLatePayments getNumLatePayments_elem() {
    return (xsd.acord.NumLatePayments) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLatePayments_elem" );
  }


  public final void setNumLatePayments_elem( xsd.acord.NumLatePayments value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLatePayments_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumCancRein() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumCancRein" );
  }


  public final void setNumCancRein( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumCancRein", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumCancRein getNumCancRein_elem() {
    return (xsd.acord.NumCancRein) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumCancRein_elem" );
  }


  public final void setNumCancRein_elem( xsd.acord.NumCancRein value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumCancRein_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DurationPeriod getDurationPeriod() {
    return (xsd.acord.DurationPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DurationPeriod" );
  }


  public final void setDurationPeriod( xsd.acord.DurationPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DurationPeriod", value );
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