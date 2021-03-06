/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class LossRunInqInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "LossRunInqInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EvaluationPeriod = new javax.xml.namespace.QName( "", "EvaluationPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDt = new javax.xml.namespace.QName( "", "AsOfDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EventCd = new javax.xml.namespace.QName( "", "EventCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsParty = new javax.xml.namespace.QName( "", "ClaimsParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Policy = new javax.xml.namespace.QName( "", "Policy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageCd = new javax.xml.namespace.QName( "", "CoverageCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "", "Location", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AllLocationInd = new javax.xml.namespace.QName( "", "AllLocationInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossDt = new javax.xml.namespace.QName( "", "LossDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimStatusCd = new javax.xml.namespace.QName( "", "ClaimStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimStatusDt = new javax.xml.namespace.QName( "", "ClaimStatusDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClosureMethodCd = new javax.xml.namespace.QName( "", "ClosureMethodCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossCauseCd = new javax.xml.namespace.QName( "", "LossCauseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DetailPaymentInd = new javax.xml.namespace.QName( "", "DetailPaymentInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.LossRunInqInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.LossRunInqInfo_Type" );
    }
  };

  public LossRunInqInfo() {
    super( 1219902374, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.LossRunInqInfo_Type() );
  }

  public LossRunInqInfo( xsd.acord.types.complex.LossRunInqInfo_Type typeInstance ) {
    super( 1219902374, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private LossRunInqInfo( gw.internal.xml.XmlElementState state ) {
    super( 1219902374, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.LossRunInqInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.LossRunInqInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.LossRunInqInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.LossRunInqInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.LossRunInqInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.LossRunInqInfo.class );
  }

  public static xsd.acord.LossRunInqInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.LossRunInqInfo.class );
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
  public final xsd.acord.EvaluationPeriod getEvaluationPeriod() {
    return (xsd.acord.EvaluationPeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EvaluationPeriod" );
  }


  public final void setEvaluationPeriod( xsd.acord.EvaluationPeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EvaluationPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAsOfDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AsOfDt" );
  }


  public final void setAsOfDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AsOfDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AsOfDt getAsOfDt_elem() {
    return (xsd.acord.AsOfDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AsOfDt_elem" );
  }


  public final void setAsOfDt_elem( xsd.acord.AsOfDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AsOfDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.Event> getEventCd() {
    return (java.util.List<xsd.acord.enums.Event>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EventCd" );
  }


  public final void setEventCd( java.util.List<xsd.acord.enums.Event> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EventCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.EventCd> getEventCd_elem() {
    return (java.util.List<xsd.acord.EventCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EventCd_elem" );
  }


  public final void setEventCd_elem( java.util.List<xsd.acord.EventCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EventCd_elem", value );
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
  public final java.util.List<xsd.acord.ClaimsParty> getClaimsParty() {
    return (java.util.List<xsd.acord.ClaimsParty>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimsParty" );
  }


  public final void setClaimsParty( java.util.List<xsd.acord.ClaimsParty> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimsParty", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Policy> getPolicy() {
    return (java.util.List<xsd.acord.Policy>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Policy" );
  }


  public final void setPolicy( java.util.List<xsd.acord.Policy> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Policy", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.Coverages> getCoverageCd() {
    return (java.util.List<xsd.acord.enums.Coverages>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageCd" );
  }


  public final void setCoverageCd( java.util.List<xsd.acord.enums.Coverages> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CoverageCd> getCoverageCd_elem() {
    return (java.util.List<xsd.acord.CoverageCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CoverageCd_elem" );
  }


  public final void setCoverageCd_elem( java.util.List<xsd.acord.CoverageCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CoverageCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Location> getLocation() {
    return (java.util.List<xsd.acord.Location>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Location" );
  }


  public final void setLocation( java.util.List<xsd.acord.Location> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Location", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAllLocationInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllLocationInd" );
  }


  public final void setAllLocationInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllLocationInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AllLocationInd getAllLocationInd_elem() {
    return (xsd.acord.AllLocationInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AllLocationInd_elem" );
  }


  public final void setAllLocationInd_elem( xsd.acord.AllLocationInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AllLocationInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossDt" );
  }


  public final void setLossDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LossDt getLossDt_elem() {
    return (xsd.acord.LossDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossDt_elem" );
  }


  public final void setLossDt_elem( xsd.acord.LossDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ClaimStatus getClaimStatusCd() {
    return (xsd.acord.enums.ClaimStatus) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusCd" );
  }


  public final void setClaimStatusCd( xsd.acord.enums.ClaimStatus value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClaimStatusCd getClaimStatusCd_elem() {
    return (xsd.acord.ClaimStatusCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusCd_elem" );
  }


  public final void setClaimStatusCd_elem( xsd.acord.ClaimStatusCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getClaimStatusDt() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusDt" );
  }


  public final void setClaimStatusDt( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClaimStatusDt getClaimStatusDt_elem() {
    return (xsd.acord.ClaimStatusDt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClaimStatusDt_elem" );
  }


  public final void setClaimStatusDt_elem( xsd.acord.ClaimStatusDt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClaimStatusDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ClosureMethod getClosureMethodCd() {
    return (xsd.acord.enums.ClosureMethod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClosureMethodCd" );
  }


  public final void setClosureMethodCd( xsd.acord.enums.ClosureMethod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClosureMethodCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ClosureMethodCd getClosureMethodCd_elem() {
    return (xsd.acord.ClosureMethodCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClosureMethodCd_elem" );
  }


  public final void setClosureMethodCd_elem( xsd.acord.ClosureMethodCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClosureMethodCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getLossCauseCd() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossCauseCd" );
  }


  public final void setLossCauseCd( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossCauseCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.LossCauseCd> getLossCauseCd_elem() {
    return (java.util.List<xsd.acord.LossCauseCd>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LossCauseCd_elem" );
  }


  public final void setLossCauseCd_elem( java.util.List<xsd.acord.LossCauseCd> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LossCauseCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getDetailPaymentInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DetailPaymentInd" );
  }


  public final void setDetailPaymentInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DetailPaymentInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DetailPaymentInd getDetailPaymentInd_elem() {
    return (xsd.acord.DetailPaymentInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DetailPaymentInd_elem" );
  }


  public final void setDetailPaymentInd_elem( xsd.acord.DetailPaymentInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DetailPaymentInd_elem", value );
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
