/* Generated by Guidewire XML Code Generator */

package xsd.iso.ak.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ACORD_ClaimsSvcRs_ClaimInvestigationAddRs extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionResponseDt = new javax.xml.namespace.QName( "", "TransactionResponseDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurCd = new javax.xml.namespace.QName( "", "CurCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgStatus = new javax.xml.namespace.QName( "", "MsgStatus", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.ak.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.ak.anonymous.types.complex.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs" );
    }
  };

  public ACORD_ClaimsSvcRs_ClaimInvestigationAddRs() {
    super( 259290429, TYPE.get() );
  }

  private ACORD_ClaimsSvcRs_ClaimInvestigationAddRs( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 259290429, state );
  }

  protected ACORD_ClaimsSvcRs_ClaimInvestigationAddRs( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ACORD_ClaimsSvcRs_ClaimInvestigationAddRs( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.ak.anonymous.types.complex.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.ak.anonymous.types.complex.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs get$TypeInstance() {
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
  public final xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_RqUID getRqUID_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_RqUID) TYPE.get().getPropertyValue( this, "_RqUID_elem" );
  }


  public final void setRqUID_elem( xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_RqUID value ) {
    TYPE.get().setPropertyValue( this, "_RqUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_TransactionResponseDt getTransactionResponseDt() {
    return (xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_TransactionResponseDt) TYPE.get().getPropertyValue( this, "_TransactionResponseDt" );
  }


  public final void setTransactionResponseDt( xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_TransactionResponseDt value ) {
    TYPE.get().setPropertyValue( this, "_TransactionResponseDt", value );
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
  public final xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_CurCd getCurCd_elem() {
    return (xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_CurCd) TYPE.get().getPropertyValue( this, "_CurCd_elem" );
  }


  public final void setCurCd_elem( xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_CurCd value ) {
    TYPE.get().setPropertyValue( this, "_CurCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus getMsgStatus() {
    return (xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus) TYPE.get().getPropertyValue( this, "_MsgStatus" );
  }


  public final void setMsgStatus( xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus value ) {
    TYPE.get().setPropertyValue( this, "_MsgStatus", value );
  }

}