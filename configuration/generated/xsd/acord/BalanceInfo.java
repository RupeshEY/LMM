/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class BalanceInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BalanceInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PaymentPlanCd = new javax.xml.namespace.QName( "", "PaymentPlanCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DayMonthDue = new javax.xml.namespace.QName( "", "DayMonthDue", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinimumDueAmt = new javax.xml.namespace.QName( "", "MinimumDueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalDueAmt = new javax.xml.namespace.QName( "", "TotalDueAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PreviousBilledAmt = new javax.xml.namespace.QName( "", "PreviousBilledAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalPaidAmt = new javax.xml.namespace.QName( "", "TotalPaidAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LastPaymentAmt = new javax.xml.namespace.QName( "", "LastPaymentAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LastPaymentDt = new javax.xml.namespace.QName( "", "LastPaymentDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MinimumDueDt = new javax.xml.namespace.QName( "", "MinimumDueDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NextBillAmt = new javax.xml.namespace.QName( "", "NextBillAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NextBillDueDt = new javax.xml.namespace.QName( "", "NextBillDueDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NextBillIssueDt = new javax.xml.namespace.QName( "", "NextBillIssueDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumPayments = new javax.xml.namespace.QName( "", "NumPayments", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.BalanceInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BalanceInfo_Type" );
    }
  };

  public BalanceInfo() {
    super( -948151370, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.BalanceInfo_Type() );
  }

  public BalanceInfo( xsd.acord.types.complex.BalanceInfo_Type typeInstance ) {
    super( -948151370, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private BalanceInfo( gw.internal.xml.XmlElementState state ) {
    super( -948151370, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.BalanceInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.BalanceInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.BalanceInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.BalanceInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.BalanceInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.BalanceInfo.class );
  }

  public static xsd.acord.BalanceInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.BalanceInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getPaymentPlanCd() {
    return (xsd.acord.enums.Frequency) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PaymentPlanCd" );
  }


  public final void setPaymentPlanCd( xsd.acord.enums.Frequency value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PaymentPlanCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PaymentPlanCd getPaymentPlanCd_elem() {
    return (xsd.acord.PaymentPlanCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PaymentPlanCd_elem" );
  }


  public final void setPaymentPlanCd_elem( xsd.acord.PaymentPlanCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PaymentPlanCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getDayMonthDue() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DayMonthDue" );
  }


  public final void setDayMonthDue( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DayMonthDue", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DayMonthDue getDayMonthDue_elem() {
    return (xsd.acord.DayMonthDue) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DayMonthDue_elem" );
  }


  public final void setDayMonthDue_elem( xsd.acord.DayMonthDue value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DayMonthDue_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MinimumDueAmt getMinimumDueAmt() {
    return (xsd.acord.MinimumDueAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MinimumDueAmt" );
  }


  public final void setMinimumDueAmt( xsd.acord.MinimumDueAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MinimumDueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalDueAmt getTotalDueAmt() {
    return (xsd.acord.TotalDueAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalDueAmt" );
  }


  public final void setTotalDueAmt( xsd.acord.TotalDueAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalDueAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PreviousBilledAmt getPreviousBilledAmt() {
    return (xsd.acord.PreviousBilledAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PreviousBilledAmt" );
  }


  public final void setPreviousBilledAmt( xsd.acord.PreviousBilledAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PreviousBilledAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TotalPaidAmt getTotalPaidAmt() {
    return (xsd.acord.TotalPaidAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TotalPaidAmt" );
  }


  public final void setTotalPaidAmt( xsd.acord.TotalPaidAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TotalPaidAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LastPaymentAmt getLastPaymentAmt() {
    return (xsd.acord.LastPaymentAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LastPaymentAmt" );
  }


  public final void setLastPaymentAmt( xsd.acord.LastPaymentAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LastPaymentAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLastPaymentDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LastPaymentDt" );
  }


  public final void setLastPaymentDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LastPaymentDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LastPaymentDt getLastPaymentDt_elem() {
    return (xsd.acord.LastPaymentDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LastPaymentDt_elem" );
  }


  public final void setLastPaymentDt_elem( xsd.acord.LastPaymentDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LastPaymentDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMinimumDueDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MinimumDueDt" );
  }


  public final void setMinimumDueDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MinimumDueDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MinimumDueDt getMinimumDueDt_elem() {
    return (xsd.acord.MinimumDueDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MinimumDueDt_elem" );
  }


  public final void setMinimumDueDt_elem( xsd.acord.MinimumDueDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MinimumDueDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NextBillAmt getNextBillAmt() {
    return (xsd.acord.NextBillAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NextBillAmt" );
  }


  public final void setNextBillAmt( xsd.acord.NextBillAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NextBillAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNextBillDueDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NextBillDueDt" );
  }


  public final void setNextBillDueDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NextBillDueDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NextBillDueDt getNextBillDueDt_elem() {
    return (xsd.acord.NextBillDueDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NextBillDueDt_elem" );
  }


  public final void setNextBillDueDt_elem( xsd.acord.NextBillDueDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NextBillDueDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNextBillIssueDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NextBillIssueDt" );
  }


  public final void setNextBillIssueDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NextBillIssueDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NextBillIssueDt getNextBillIssueDt_elem() {
    return (xsd.acord.NextBillIssueDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NextBillIssueDt_elem" );
  }


  public final void setNextBillIssueDt_elem( xsd.acord.NextBillIssueDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NextBillIssueDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumPayments() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumPayments" );
  }


  public final void setNumPayments( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumPayments", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumPayments getNumPayments_elem() {
    return (xsd.acord.NumPayments) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumPayments_elem" );
  }


  public final void setNumPayments_elem( xsd.acord.NumPayments value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumPayments_elem", value );
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