/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CommlPropertyScheduleSubmitRs_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommlPropertyScheduleSubmitRs_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionEffectiveDt = new javax.xml.namespace.QName( "", "TransactionEffectiveDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurCd = new javax.xml.namespace.QName( "", "CurCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CodeList = new javax.xml.namespace.QName( "", "CodeList", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConversionRate = new javax.xml.namespace.QName( "", "ConversionRate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgStatus = new javax.xml.namespace.QName( "", "MsgStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Producer = new javax.xml.namespace.QName( "", "Producer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "", "Location", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlPropertySchedule = new javax.xml.namespace.QName( "", "CommlPropertySchedule", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RemarkText = new javax.xml.namespace.QName( "", "RemarkText", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileAttachmentInfo = new javax.xml.namespace.QName( "", "FileAttachmentInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicySummaryInfo = new javax.xml.namespace.QName( "", "PolicySummaryInfo", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommlPropertyScheduleSubmitRs_Type" );
    }
  };

  public CommlPropertyScheduleSubmitRs_Type() {
    super( -558668741, TYPE.get() );
  }

  private CommlPropertyScheduleSubmitRs_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -558668741, state );
  }

  protected CommlPropertyScheduleSubmitRs_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CommlPropertyScheduleSubmitRs_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CommlPropertyScheduleSubmitRs_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CommlPropertyScheduleSubmitRs_Type get$TypeInstance() {
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
  public final java.util.List<xsd.acord.Producer> getProducer() {
    return (java.util.List<xsd.acord.Producer>) TYPE.get().getPropertyValue( this, "_Producer" );
  }


  public final void setProducer( java.util.List<xsd.acord.Producer> value ) {
    TYPE.get().setPropertyValue( this, "_Producer", value );
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
  public final java.util.List<xsd.acord.MiscParty> getMiscParty() {
    return (java.util.List<xsd.acord.MiscParty>) TYPE.get().getPropertyValue( this, "_MiscParty" );
  }


  public final void setMiscParty( java.util.List<xsd.acord.MiscParty> value ) {
    TYPE.get().setPropertyValue( this, "_MiscParty", value );
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
  public final java.util.List<xsd.acord.CommlPropertySchedule> getCommlPropertySchedule() {
    return (java.util.List<xsd.acord.CommlPropertySchedule>) TYPE.get().getPropertyValue( this, "_CommlPropertySchedule" );
  }


  public final void setCommlPropertySchedule( java.util.List<xsd.acord.CommlPropertySchedule> value ) {
    TYPE.get().setPropertyValue( this, "_CommlPropertySchedule", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ItemIdInfo getItemIdInfo() {
    return (xsd.acord.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.acord.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
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
  public final java.util.List<xsd.acord.RemarkText> getRemarkText_elem() {
    return (java.util.List<xsd.acord.RemarkText>) TYPE.get().getPropertyValue( this, "_RemarkText_elem" );
  }


  public final void setRemarkText_elem( java.util.List<xsd.acord.RemarkText> value ) {
    TYPE.get().setPropertyValue( this, "_RemarkText_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.FileAttachmentInfo> getFileAttachmentInfo() {
    return (java.util.List<xsd.acord.FileAttachmentInfo>) TYPE.get().getPropertyValue( this, "_FileAttachmentInfo" );
  }


  public final void setFileAttachmentInfo( java.util.List<xsd.acord.FileAttachmentInfo> value ) {
    TYPE.get().setPropertyValue( this, "_FileAttachmentInfo", value );
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