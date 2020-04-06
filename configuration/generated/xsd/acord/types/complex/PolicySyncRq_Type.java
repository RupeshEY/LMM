/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PolicySyncRq_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PolicySyncRq_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionRequestDt = new javax.xml.namespace.QName( "", "TransactionRequestDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AsOfDt = new javax.xml.namespace.QName( "", "AsOfDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Producer = new javax.xml.namespace.QName( "", "Producer", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractTerm = new javax.xml.namespace.QName( "", "ContractTerm", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBCd = new javax.xml.namespace.QName( "", "LOBCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LOBSubCd = new javax.xml.namespace.QName( "", "LOBSubCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PolicySyncRq_Type" );
    }
  };

  public PolicySyncRq_Type() {
    super( -468422970, TYPE.get() );
  }

  private PolicySyncRq_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -468422970, state );
  }

  protected PolicySyncRq_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PolicySyncRq_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PolicySyncRq_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PolicySyncRq_Type get$TypeInstance() {
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
  public final java.lang.String getTransactionRequestDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TransactionRequestDt" );
  }


  public final void setTransactionRequestDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TransactionRequestDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TransactionRequestDt getTransactionRequestDt_elem() {
    return (xsd.acord.TransactionRequestDt) TYPE.get().getPropertyValue( this, "_TransactionRequestDt_elem" );
  }


  public final void setTransactionRequestDt_elem( xsd.acord.TransactionRequestDt value ) {
    TYPE.get().setPropertyValue( this, "_TransactionRequestDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAsOfDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AsOfDt" );
  }


  public final void setAsOfDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AsOfDt getAsOfDt_elem() {
    return (xsd.acord.AsOfDt) TYPE.get().getPropertyValue( this, "_AsOfDt_elem" );
  }


  public final void setAsOfDt_elem( xsd.acord.AsOfDt value ) {
    TYPE.get().setPropertyValue( this, "_AsOfDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Producer getProducer() {
    return (xsd.acord.Producer) TYPE.get().getPropertyValue( this, "_Producer" );
  }


  public final void setProducer( xsd.acord.Producer value ) {
    TYPE.get().setPropertyValue( this, "_Producer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyNumber" );
  }


  public final void setPolicyNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PolicyNumber getPolicyNumber_elem() {
    return (xsd.acord.PolicyNumber) TYPE.get().getPropertyValue( this, "_PolicyNumber_elem" );
  }


  public final void setPolicyNumber_elem( xsd.acord.PolicyNumber value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContractTerm getContractTerm() {
    return (xsd.acord.ContractTerm) TYPE.get().getPropertyValue( this, "_ContractTerm" );
  }


  public final void setContractTerm( xsd.acord.ContractTerm value ) {
    TYPE.get().setPropertyValue( this, "_ContractTerm", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LineOfBusiness getLOBCd() {
    return (xsd.acord.enums.LineOfBusiness) TYPE.get().getPropertyValue( this, "_LOBCd" );
  }


  public final void setLOBCd( xsd.acord.enums.LineOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_LOBCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LOBCd getLOBCd_elem() {
    return (xsd.acord.LOBCd) TYPE.get().getPropertyValue( this, "_LOBCd_elem" );
  }


  public final void setLOBCd_elem( xsd.acord.LOBCd value ) {
    TYPE.get().setPropertyValue( this, "_LOBCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LineOfBusinessSubCode getLOBSubCd() {
    return (xsd.acord.enums.LineOfBusinessSubCode) TYPE.get().getPropertyValue( this, "_LOBSubCd" );
  }


  public final void setLOBSubCd( xsd.acord.enums.LineOfBusinessSubCode value ) {
    TYPE.get().setPropertyValue( this, "_LOBSubCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LOBSubCd getLOBSubCd_elem() {
    return (xsd.acord.LOBSubCd) TYPE.get().getPropertyValue( this, "_LOBSubCd_elem" );
  }


  public final void setLOBSubCd_elem( xsd.acord.LOBSubCd value ) {
    TYPE.get().setPropertyValue( this, "_LOBSubCd_elem", value );
  }

}