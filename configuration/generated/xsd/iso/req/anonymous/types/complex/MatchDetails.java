/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class MatchDetails extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Producer = new javax.xml.namespace.QName( "", "Producer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Policy = new javax.xml.namespace.QName( "", "Policy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsOccurrence = new javax.xml.namespace.QName( "", "ClaimsOccurrence", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsParty = new javax.xml.namespace.QName( "", "ClaimsParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsPartyRelationship = new javax.xml.namespace.QName( "", "ClaimsPartyRelationship", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_SIUParty = new javax.xml.namespace.QName( "", "com.iso_SIUParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdjusterParty = new javax.xml.namespace.QName( "", "AdjusterParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AutoLossInfo = new javax.xml.namespace.QName( "", "AutoLossInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LiabilityLossInfo = new javax.xml.namespace.QName( "", "LiabilityLossInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyLossInfo = new javax.xml.namespace.QName( "", "PropertyLossInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompLossInfo = new javax.xml.namespace.QName( "", "WorkCompLossInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LitigationInfo = new javax.xml.namespace.QName( "", "LitigationInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsPayment = new javax.xml.namespace.QName( "", "ClaimsPayment", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RemarkText = new javax.xml.namespace.QName( "", "RemarkText", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileAttachmentInfo = new javax.xml.namespace.QName( "", "FileAttachmentInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MatchReasonInfo = new javax.xml.namespace.QName( "", "MatchReasonInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_SumReasonInfo = new javax.xml.namespace.QName( "", "com.iso_SumReasonInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_KeyReasonInfo = new javax.xml.namespace.QName( "", "com.iso_KeyReasonInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InvestigationInfo = new javax.xml.namespace.QName( "", "InvestigationInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.MatchDetails" );
    }
  };

  public MatchDetails() {
    super( 706707823, TYPE.get() );
  }

  private MatchDetails( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 706707823, state );
  }

  protected MatchDetails( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected MatchDetails( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.MatchDetails> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.MatchDetails get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Producer getProducer() {
    return (xsd.iso.req.Producer) TYPE.get().getPropertyValue( this, "_Producer" );
  }


  public final void setProducer( xsd.iso.req.Producer value ) {
    TYPE.get().setPropertyValue( this, "_Producer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.InsuredOrPrincipal getInsuredOrPrincipal() {
    return (xsd.iso.req.InsuredOrPrincipal) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( xsd.iso.req.InsuredOrPrincipal value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipal", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Policy getPolicy() {
    return (xsd.iso.req.Policy) TYPE.get().getPropertyValue( this, "_Policy" );
  }


  public final void setPolicy( xsd.iso.req.Policy value ) {
    TYPE.get().setPropertyValue( this, "_Policy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ClaimsOccurrence getClaimsOccurrence() {
    return (xsd.iso.req.ClaimsOccurrence) TYPE.get().getPropertyValue( this, "_ClaimsOccurrence" );
  }


  public final void setClaimsOccurrence( xsd.iso.req.ClaimsOccurrence value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsOccurrence", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ClaimsParty> getClaimsParty() {
    return (java.util.List<xsd.iso.req.ClaimsParty>) TYPE.get().getPropertyValue( this, "_ClaimsParty" );
  }


  public final void setClaimsParty( java.util.List<xsd.iso.req.ClaimsParty> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsParty", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ClaimsPartyRelationship> getClaimsPartyRelationship() {
    return (java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ClaimsPartyRelationship>) TYPE.get().getPropertyValue( this, "_ClaimsPartyRelationship" );
  }


  public final void setClaimsPartyRelationship( java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ClaimsPartyRelationship> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPartyRelationship", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty> getComIso_SIUParty() {
    return (java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty>) TYPE.get().getPropertyValue( this, "_ComIso_SIUParty" );
  }


  public final void setComIso_SIUParty( java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SIUParty> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_SIUParty", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.AdjusterParty> getAdjusterParty() {
    return (java.util.List<xsd.iso.req.AdjusterParty>) TYPE.get().getPropertyValue( this, "_AdjusterParty" );
  }


  public final void setAdjusterParty( java.util.List<xsd.iso.req.AdjusterParty> value ) {
    TYPE.get().setPropertyValue( this, "_AdjusterParty", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.AutoLossInfo> getAutoLossInfo() {
    return (java.util.List<xsd.iso.req.AutoLossInfo>) TYPE.get().getPropertyValue( this, "_AutoLossInfo" );
  }


  public final void setAutoLossInfo( java.util.List<xsd.iso.req.AutoLossInfo> value ) {
    TYPE.get().setPropertyValue( this, "_AutoLossInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.LiabilityLossInfo> getLiabilityLossInfo() {
    return (java.util.List<xsd.iso.req.LiabilityLossInfo>) TYPE.get().getPropertyValue( this, "_LiabilityLossInfo" );
  }


  public final void setLiabilityLossInfo( java.util.List<xsd.iso.req.LiabilityLossInfo> value ) {
    TYPE.get().setPropertyValue( this, "_LiabilityLossInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.PropertyLossInfo> getPropertyLossInfo() {
    return (java.util.List<xsd.iso.req.PropertyLossInfo>) TYPE.get().getPropertyValue( this, "_PropertyLossInfo" );
  }


  public final void setPropertyLossInfo( java.util.List<xsd.iso.req.PropertyLossInfo> value ) {
    TYPE.get().setPropertyValue( this, "_PropertyLossInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.WorkCompLossInfo> getWorkCompLossInfo() {
    return (java.util.List<xsd.iso.req.WorkCompLossInfo>) TYPE.get().getPropertyValue( this, "_WorkCompLossInfo" );
  }


  public final void setWorkCompLossInfo( java.util.List<xsd.iso.req.WorkCompLossInfo> value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompLossInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.LitigationInfo> getLitigationInfo() {
    return (java.util.List<xsd.iso.req.LitigationInfo>) TYPE.get().getPropertyValue( this, "_LitigationInfo" );
  }


  public final void setLitigationInfo( java.util.List<xsd.iso.req.LitigationInfo> value ) {
    TYPE.get().setPropertyValue( this, "_LitigationInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ClaimsPayment> getClaimsPayment() {
    return (java.util.List<xsd.iso.req.ClaimsPayment>) TYPE.get().getPropertyValue( this, "_ClaimsPayment" );
  }


  public final void setClaimsPayment( java.util.List<xsd.iso.req.ClaimsPayment> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsPayment", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getRemarkText() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_RemarkText" );
  }


  public final void setRemarkText( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_RemarkText", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.RemarkText> getRemarkText_elem() {
    return (java.util.List<xsd.iso.req.RemarkText>) TYPE.get().getPropertyValue( this, "_RemarkText_elem" );
  }


  public final void setRemarkText_elem( java.util.List<xsd.iso.req.RemarkText> value ) {
    TYPE.get().setPropertyValue( this, "_RemarkText_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.FileAttachmentInfo> getFileAttachmentInfo() {
    return (java.util.List<xsd.iso.req.FileAttachmentInfo>) TYPE.get().getPropertyValue( this, "_FileAttachmentInfo" );
  }


  public final void setFileAttachmentInfo( java.util.List<xsd.iso.req.FileAttachmentInfo> value ) {
    TYPE.get().setPropertyValue( this, "_FileAttachmentInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.MatchReasonInfo> getMatchReasonInfo() {
    return (java.util.List<xsd.iso.req.MatchReasonInfo>) TYPE.get().getPropertyValue( this, "_MatchReasonInfo" );
  }


  public final void setMatchReasonInfo( java.util.List<xsd.iso.req.MatchReasonInfo> value ) {
    TYPE.get().setPropertyValue( this, "_MatchReasonInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SumReasonInfo> getComIso_SumReasonInfo() {
    return (java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SumReasonInfo>) TYPE.get().getPropertyValue( this, "_ComIso_SumReasonInfo" );
  }


  public final void setComIso_SumReasonInfo( java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_SumReasonInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_SumReasonInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_KeyReasonInfo> getComIso_KeyReasonInfo() {
    return (java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_KeyReasonInfo>) TYPE.get().getPropertyValue( this, "_ComIso_KeyReasonInfo" );
  }


  public final void setComIso_KeyReasonInfo( java.util.List<xsd.iso.req.anonymous.elements.MatchDetails_ComIso_KeyReasonInfo> value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_KeyReasonInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.InvestigationInfo> getInvestigationInfo() {
    return (java.util.List<xsd.iso.req.InvestigationInfo>) TYPE.get().getPropertyValue( this, "_InvestigationInfo" );
  }


  public final void setInvestigationInfo( java.util.List<xsd.iso.req.InvestigationInfo> value ) {
    TYPE.get().setPropertyValue( this, "_InvestigationInfo", value );
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
