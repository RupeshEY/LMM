/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_RawScore = new javax.xml.namespace.QName( "", "com.iso_RawScore", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_AdjustedScore = new javax.xml.namespace.QName( "", "com.iso_AdjustedScore", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumMatches = new javax.xml.namespace.QName( "", "NumMatches", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_SearchableElementCd = new javax.xml.namespace.QName( "", "com.iso_SearchableElementCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ScoredMatch = new javax.xml.namespace.QName( "", "com.iso_ScoredMatch", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport" );
    }
  };

  public ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport() {
    super( 246917814, TYPE.get() );
  }

  private ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 246917814, state );
  }

  protected ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_ComIso_RawScore getComIso_RawScore() {
    return (xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_ComIso_RawScore) TYPE.get().getPropertyValue( this, "_ComIso_RawScore" );
  }


  public final void setComIso_RawScore( xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_ComIso_RawScore value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_RawScore", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_ComIso_AdjustedScore getComIso_AdjustedScore() {
    return (xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_ComIso_AdjustedScore) TYPE.get().getPropertyValue( this, "_ComIso_AdjustedScore" );
  }


  public final void setComIso_AdjustedScore( xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_ComIso_AdjustedScore value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_AdjustedScore", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNumMatches() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NumMatches" );
  }


  public final void setNumMatches( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NumMatches", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_NumMatches getNumMatches_elem() {
    return (xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_NumMatches) TYPE.get().getPropertyValue( this, "_NumMatches_elem" );
  }


  public final void setNumMatches_elem( xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_NumMatches value ) {
    TYPE.get().setPropertyValue( this, "_NumMatches_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getComIso_SearchableElementCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_ComIso_SearchableElementCd" );
  }


  public final void setComIso_SearchableElementCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_SearchableElementCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_ComIso_SearchableElementCd> getComIso_SearchableElementCd_elem() {
    return (java.util.List<xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_ComIso_SearchableElementCd>) TYPE.get().getPropertyValue( this, "_ComIso_SearchableElementCd_elem" );
  }


  public final void setComIso_SearchableElementCd_elem( java.util.List<xsd.iso.req.anonymous.elements.ComIso_ClaimsScoringInfo_ComIso_ClaimsScoreReport_ComIso_SearchableElementCd> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_SearchableElementCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ComIso_ScoredMatch> getComIso_ScoredMatch() {
    return (java.util.List<xsd.iso.req.ComIso_ScoredMatch>) TYPE.get().getPropertyValue( this, "_ComIso_ScoredMatch" );
  }


  public final void setComIso_ScoredMatch( java.util.List<xsd.iso.req.ComIso_ScoredMatch> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_ScoredMatch", value );
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