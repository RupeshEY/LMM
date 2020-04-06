/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ComIso_ScoredMatch extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_MatchScoreRank = new javax.xml.namespace.QName( "", "com.iso_MatchScoreRank", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_MatchScore = new javax.xml.namespace.QName( "", "com.iso_MatchScore", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossDt = new javax.xml.namespace.QName( "", "LossDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageCd = new javax.xml.namespace.QName( "", "CoverageCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossCauseCd = new javax.xml.namespace.QName( "", "LossCauseCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MatchReasonCd = new javax.xml.namespace.QName( "", "MatchReasonCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_MatchRecordTypeCd = new javax.xml.namespace.QName( "", "com.iso_MatchRecordTypeCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ComIso_ScoredMatch" );
    }
  };

  public ComIso_ScoredMatch() {
    super( -119267556, TYPE.get() );
  }

  private ComIso_ScoredMatch( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -119267556, state );
  }

  protected ComIso_ScoredMatch( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ComIso_ScoredMatch( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.ComIso_ScoredMatch> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.ComIso_ScoredMatch get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_MatchScoreRank() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_MatchScoreRank" );
  }


  public final void setComIso_MatchScoreRank( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_MatchScoreRank", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_ComIso_MatchScoreRank getComIso_MatchScoreRank_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_ComIso_MatchScoreRank) TYPE.get().getPropertyValue( this, "_ComIso_MatchScoreRank_elem" );
  }


  public final void setComIso_MatchScoreRank_elem( xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_ComIso_MatchScoreRank value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_MatchScoreRank_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.resp.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.resp.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_MatchScore() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_MatchScore" );
  }


  public final void setComIso_MatchScore( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_MatchScore", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_ComIso_MatchScore getComIso_MatchScore_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_ComIso_MatchScore) TYPE.get().getPropertyValue( this, "_ComIso_MatchScore_elem" );
  }


  public final void setComIso_MatchScore_elem( xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_ComIso_MatchScore value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_MatchScore_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossDt" );
  }


  public final void setLossDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_LossDt getLossDt_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_LossDt) TYPE.get().getPropertyValue( this, "_LossDt_elem" );
  }


  public final void setLossDt_elem( xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_LossDt value ) {
    TYPE.get().setPropertyValue( this, "_LossDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoverageCd" );
  }


  public final void setCoverageCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoverageCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_CoverageCd getCoverageCd_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_CoverageCd) TYPE.get().getPropertyValue( this, "_CoverageCd_elem" );
  }


  public final void setCoverageCd_elem( xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_CoverageCd value ) {
    TYPE.get().setPropertyValue( this, "_CoverageCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLossCauseCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LossCauseCd" );
  }


  public final void setLossCauseCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_LossCauseCd getLossCauseCd_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_LossCauseCd) TYPE.get().getPropertyValue( this, "_LossCauseCd_elem" );
  }


  public final void setLossCauseCd_elem( xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_LossCauseCd value ) {
    TYPE.get().setPropertyValue( this, "_LossCauseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMatchReasonCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MatchReasonCd" );
  }


  public final void setMatchReasonCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MatchReasonCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_MatchReasonCd getMatchReasonCd_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_MatchReasonCd) TYPE.get().getPropertyValue( this, "_MatchReasonCd_elem" );
  }


  public final void setMatchReasonCd_elem( xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_MatchReasonCd value ) {
    TYPE.get().setPropertyValue( this, "_MatchReasonCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_MatchRecordTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_MatchRecordTypeCd" );
  }


  public final void setComIso_MatchRecordTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_MatchRecordTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_ComIso_MatchRecordTypeCd getComIso_MatchRecordTypeCd_elem() {
    return (xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_ComIso_MatchRecordTypeCd) TYPE.get().getPropertyValue( this, "_ComIso_MatchRecordTypeCd_elem" );
  }


  public final void setComIso_MatchRecordTypeCd_elem( xsd.iso.resp.anonymous.elements.ComIso_ScoredMatch_ComIso_MatchRecordTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_MatchRecordTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}