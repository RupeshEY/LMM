/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class WorkCompProofCoverageAddRs_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "WorkCompProofCoverageAddRs_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionResponseDt = new javax.xml.namespace.QName( "", "TransactionResponseDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionEffectiveDt = new javax.xml.namespace.QName( "", "TransactionEffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurCd = new javax.xml.namespace.QName( "", "CurCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CodeList = new javax.xml.namespace.QName( "", "CodeList", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConversionRate = new javax.xml.namespace.QName( "", "ConversionRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgStatus = new javax.xml.namespace.QName( "", "MsgStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPXEditVersionApplied = new javax.xml.namespace.QName( "", "SPXEditVersionApplied", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ACORDStandardVersionCd = new javax.xml.namespace.QName( "", "ACORDStandardVersionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionIssueDt = new javax.xml.namespace.QName( "", "TransactionIssueDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Producer = new javax.xml.namespace.QName( "", "Producer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlPolicy = new javax.xml.namespace.QName( "", "CommlPolicy", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "", "Location", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CompanyState = new javax.xml.namespace.QName( "", "CompanyState", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompLineBusiness = new javax.xml.namespace.QName( "", "WorkCompLineBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VendorReceiveDt = new javax.xml.namespace.QName( "", "VendorReceiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VendorDocumentId = new javax.xml.namespace.QName( "", "VendorDocumentId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicySummaryInfo = new javax.xml.namespace.QName( "", "PolicySummaryInfo", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.WorkCompProofCoverageAddRs_Type" );
    }
  };

  public WorkCompProofCoverageAddRs_Type() {
    super( 1194570396, TYPE.get() );
  }

  private WorkCompProofCoverageAddRs_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1194570396, state );
  }

  protected WorkCompProofCoverageAddRs_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected WorkCompProofCoverageAddRs_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.WorkCompProofCoverageAddRs_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.WorkCompProofCoverageAddRs_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRqUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RqUID" );
  }


  public final void setRqUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RqUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RqUID getRqUID_elem() {
    return (xsd.acord.RqUID) TYPE.get().getPropertyValue( this, "_RqUID_elem" );
  }


  public final void setRqUID_elem( xsd.acord.RqUID value ) {
    TYPE.get().setPropertyValue( this, "_RqUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransactionResponseDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TransactionResponseDt" );
  }


  public final void setTransactionResponseDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TransactionResponseDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransactionResponseDt getTransactionResponseDt_elem() {
    return (xsd.acord.TransactionResponseDt) TYPE.get().getPropertyValue( this, "_TransactionResponseDt_elem" );
  }


  public final void setTransactionResponseDt_elem( xsd.acord.TransactionResponseDt value ) {
    TYPE.get().setPropertyValue( this, "_TransactionResponseDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransactionEffectiveDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TransactionEffectiveDt" );
  }


  public final void setTransactionEffectiveDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TransactionEffectiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransactionEffectiveDt getTransactionEffectiveDt_elem() {
    return (xsd.acord.TransactionEffectiveDt) TYPE.get().getPropertyValue( this, "_TransactionEffectiveDt_elem" );
  }


  public final void setTransactionEffectiveDt_elem( xsd.acord.TransactionEffectiveDt value ) {
    TYPE.get().setPropertyValue( this, "_TransactionEffectiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCurCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CurCd" );
  }


  public final void setCurCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CurCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CurCd getCurCd_elem() {
    return (xsd.acord.CurCd) TYPE.get().getPropertyValue( this, "_CurCd_elem" );
  }


  public final void setCurCd_elem( xsd.acord.CurCd value ) {
    TYPE.get().setPropertyValue( this, "_CurCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CodeList> getCodeList() {
    return (java.util.List<xsd.acord.CodeList>) TYPE.get().getPropertyValue( this, "_CodeList" );
  }


  public final void setCodeList( java.util.List<xsd.acord.CodeList> value ) {
    TYPE.get().setPropertyValue( this, "_CodeList", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ConversionRate> getConversionRate() {
    return (java.util.List<xsd.acord.ConversionRate>) TYPE.get().getPropertyValue( this, "_ConversionRate" );
  }


  public final void setConversionRate( java.util.List<xsd.acord.ConversionRate> value ) {
    TYPE.get().setPropertyValue( this, "_ConversionRate", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MsgStatus getMsgStatus() {
    return (xsd.acord.MsgStatus) TYPE.get().getPropertyValue( this, "_MsgStatus" );
  }


  public final void setMsgStatus( xsd.acord.MsgStatus value ) {
    TYPE.get().setPropertyValue( this, "_MsgStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSPXEditVersionApplied() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SPXEditVersionApplied" );
  }


  public final void setSPXEditVersionApplied( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SPXEditVersionApplied", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SPXEditVersionApplied getSPXEditVersionApplied_elem() {
    return (xsd.acord.SPXEditVersionApplied) TYPE.get().getPropertyValue( this, "_SPXEditVersionApplied_elem" );
  }


  public final void setSPXEditVersionApplied_elem( xsd.acord.SPXEditVersionApplied value ) {
    TYPE.get().setPropertyValue( this, "_SPXEditVersionApplied_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ACORDStandardVersion getACORDStandardVersionCd() {
    return (xsd.acord.enums.ACORDStandardVersion) TYPE.get().getPropertyValue( this, "_ACORDStandardVersionCd" );
  }


  public final void setACORDStandardVersionCd( xsd.acord.enums.ACORDStandardVersion value ) {
    TYPE.get().setPropertyValue( this, "_ACORDStandardVersionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ACORDStandardVersionCd getACORDStandardVersionCd_elem() {
    return (xsd.acord.ACORDStandardVersionCd) TYPE.get().getPropertyValue( this, "_ACORDStandardVersionCd_elem" );
  }


  public final void setACORDStandardVersionCd_elem( xsd.acord.ACORDStandardVersionCd value ) {
    TYPE.get().setPropertyValue( this, "_ACORDStandardVersionCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransactionIssueDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TransactionIssueDt" );
  }


  public final void setTransactionIssueDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TransactionIssueDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransactionIssueDt getTransactionIssueDt_elem() {
    return (xsd.acord.TransactionIssueDt) TYPE.get().getPropertyValue( this, "_TransactionIssueDt_elem" );
  }


  public final void setTransactionIssueDt_elem( xsd.acord.TransactionIssueDt value ) {
    TYPE.get().setPropertyValue( this, "_TransactionIssueDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Producer> getProducer() {
    return (java.util.List<xsd.acord.Producer>) TYPE.get().getPropertyValue( this, "_Producer" );
  }


  public final void setProducer( java.util.List<xsd.acord.Producer> value ) {
    TYPE.get().setPropertyValue( this, "_Producer", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MiscParty getMiscParty() {
    return (xsd.acord.MiscParty) TYPE.get().getPropertyValue( this, "_MiscParty" );
  }


  public final void setMiscParty( xsd.acord.MiscParty value ) {
    TYPE.get().setPropertyValue( this, "_MiscParty", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipal> getInsuredOrPrincipal() {
    return (java.util.List<xsd.acord.InsuredOrPrincipal>) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( java.util.List<xsd.acord.InsuredOrPrincipal> value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommlPolicy getCommlPolicy() {
    return (xsd.acord.CommlPolicy) TYPE.get().getPropertyValue( this, "_CommlPolicy" );
  }


  public final void setCommlPolicy( xsd.acord.CommlPolicy value ) {
    TYPE.get().setPropertyValue( this, "_CommlPolicy", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.Location> getLocation() {
    return (java.util.List<xsd.acord.Location>) TYPE.get().getPropertyValue( this, "_Location" );
  }


  public final void setLocation( java.util.List<xsd.acord.Location> value ) {
    TYPE.get().setPropertyValue( this, "_Location", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CompanyState> getCompanyState() {
    return (java.util.List<xsd.acord.CompanyState>) TYPE.get().getPropertyValue( this, "_CompanyState" );
  }


  public final void setCompanyState( java.util.List<xsd.acord.CompanyState> value ) {
    TYPE.get().setPropertyValue( this, "_CompanyState", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WorkCompLineBusiness getWorkCompLineBusiness() {
    return (xsd.acord.WorkCompLineBusiness) TYPE.get().getPropertyValue( this, "_WorkCompLineBusiness" );
  }


  public final void setWorkCompLineBusiness( xsd.acord.WorkCompLineBusiness value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompLineBusiness", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVendorReceiveDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_VendorReceiveDt" );
  }


  public final void setVendorReceiveDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_VendorReceiveDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VendorReceiveDt getVendorReceiveDt_elem() {
    return (xsd.acord.VendorReceiveDt) TYPE.get().getPropertyValue( this, "_VendorReceiveDt_elem" );
  }


  public final void setVendorReceiveDt_elem( xsd.acord.VendorReceiveDt value ) {
    TYPE.get().setPropertyValue( this, "_VendorReceiveDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getVendorDocumentId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_VendorDocumentId" );
  }


  public final void setVendorDocumentId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_VendorDocumentId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VendorDocumentId getVendorDocumentId_elem() {
    return (xsd.acord.VendorDocumentId) TYPE.get().getPropertyValue( this, "_VendorDocumentId_elem" );
  }


  public final void setVendorDocumentId_elem( xsd.acord.VendorDocumentId value ) {
    TYPE.get().setPropertyValue( this, "_VendorDocumentId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicySummaryInfo getPolicySummaryInfo() {
    return (xsd.acord.PolicySummaryInfo) TYPE.get().getPropertyValue( this, "_PolicySummaryInfo" );
  }


  public final void setPolicySummaryInfo( xsd.acord.PolicySummaryInfo value ) {
    TYPE.get().setPropertyValue( this, "_PolicySummaryInfo", value );
  }

}
