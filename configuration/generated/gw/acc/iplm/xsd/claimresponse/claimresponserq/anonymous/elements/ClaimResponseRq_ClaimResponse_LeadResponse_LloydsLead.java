/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "LloydsLead", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimResponse/rq/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_XcsToAgreeIndicator = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "XcsToAgreeIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LloydsResponse = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "LloydsResponse", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_QueryReason = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "QueryReason", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OutstandingAmountQualifier = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "OutstandingAmountQualifier", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CauseOfLoss = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CauseOfLoss", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrivateComments = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "PrivateComments", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PublicComments = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "PublicComments", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponserq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponserq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead" );
    }
  };

  public ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead() {
    super( -644247393, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead() );
  }

  public ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead typeInstance ) {
    super( -644247393, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead( gw.internal.xml.XmlElementState state ) {
    super( -644247393, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getXcsToAgreeIndicator() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_XcsToAgreeIndicator" );
  }


  public final void setXcsToAgreeIndicator( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_XcsToAgreeIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_XcsToAgreeIndicator getXcsToAgreeIndicator_elem() {
    return (gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_XcsToAgreeIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_XcsToAgreeIndicator_elem" );
  }


  public final void setXcsToAgreeIndicator_elem( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_XcsToAgreeIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_XcsToAgreeIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLloydsResponse() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LloydsResponse" );
  }


  public final void setLloydsResponse( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LloydsResponse", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_LloydsResponse getLloydsResponse_elem() {
    return (gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_LloydsResponse) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LloydsResponse_elem" );
  }


  public final void setLloydsResponse_elem( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_LloydsResponse value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LloydsResponse_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getQueryReason() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_QueryReason" );
  }


  public final void setQueryReason( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_QueryReason", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_QueryReason> getQueryReason_elem() {
    return (java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_QueryReason>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_QueryReason_elem" );
  }


  public final void setQueryReason_elem( java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_QueryReason> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_QueryReason_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOutstandingAmountQualifier() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OutstandingAmountQualifier" );
  }


  public final void setOutstandingAmountQualifier( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OutstandingAmountQualifier", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_OutstandingAmountQualifier getOutstandingAmountQualifier_elem() {
    return (gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_OutstandingAmountQualifier) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OutstandingAmountQualifier_elem" );
  }


  public final void setOutstandingAmountQualifier_elem( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_OutstandingAmountQualifier value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OutstandingAmountQualifier_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCauseOfLoss() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CauseOfLoss" );
  }


  public final void setCauseOfLoss( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CauseOfLoss", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CauseOfLoss getCauseOfLoss_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CauseOfLoss) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CauseOfLoss_elem" );
  }


  public final void setCauseOfLoss_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CauseOfLoss value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CauseOfLoss_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PrivateComments> getPrivateComments() {
    return (java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PrivateComments>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrivateComments" );
  }


  public final void setPrivateComments( java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PrivateComments> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrivateComments", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PublicComments> getPublicComments() {
    return (java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PublicComments>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PublicComments" );
  }


  public final void setPublicComments( java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_LloydsLead_PublicComments> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PublicComments", value );
  }

}
