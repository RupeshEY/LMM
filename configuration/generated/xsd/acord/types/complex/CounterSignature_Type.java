/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CounterSignature_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CounterSignature_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FieldOfficeCd = new javax.xml.namespace.QName( "", "FieldOfficeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractNumber = new javax.xml.namespace.QName( "", "ContractNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommissionRatePct = new javax.xml.namespace.QName( "", "CommissionRatePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrintedDocumentsRequestedInd = new javax.xml.namespace.QName( "", "PrintedDocumentsRequestedInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CounterSignatureLicenseNumber = new javax.xml.namespace.QName( "", "CounterSignatureLicenseNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CounterSignature_Type" );
    }
  };

  public CounterSignature_Type() {
    super( -625429450, TYPE.get() );
  }

  private CounterSignature_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -625429450, state );
  }

  protected CounterSignature_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CounterSignature_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CounterSignature_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CounterSignature_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProvCd getStateProvCd_elem() {
    return (xsd.acord.StateProvCd) TYPE.get().getPropertyValue( this, "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.acord.StateProvCd value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFieldOfficeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FieldOfficeCd" );
  }


  public final void setFieldOfficeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FieldOfficeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FieldOfficeCd getFieldOfficeCd_elem() {
    return (xsd.acord.FieldOfficeCd) TYPE.get().getPropertyValue( this, "_FieldOfficeCd_elem" );
  }


  public final void setFieldOfficeCd_elem( xsd.acord.FieldOfficeCd value ) {
    TYPE.get().setPropertyValue( this, "_FieldOfficeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContractNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ContractNumber" );
  }


  public final void setContractNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ContractNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContractNumber getContractNumber_elem() {
    return (xsd.acord.ContractNumber) TYPE.get().getPropertyValue( this, "_ContractNumber_elem" );
  }


  public final void setContractNumber_elem( xsd.acord.ContractNumber value ) {
    TYPE.get().setPropertyValue( this, "_ContractNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getCommissionRatePct() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_CommissionRatePct" );
  }


  public final void setCommissionRatePct( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_CommissionRatePct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CommissionRatePct getCommissionRatePct_elem() {
    return (xsd.acord.CommissionRatePct) TYPE.get().getPropertyValue( this, "_CommissionRatePct_elem" );
  }


  public final void setCommissionRatePct_elem( xsd.acord.CommissionRatePct value ) {
    TYPE.get().setPropertyValue( this, "_CommissionRatePct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPrintedDocumentsRequestedInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_PrintedDocumentsRequestedInd" );
  }


  public final void setPrintedDocumentsRequestedInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_PrintedDocumentsRequestedInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PrintedDocumentsRequestedInd getPrintedDocumentsRequestedInd_elem() {
    return (xsd.acord.PrintedDocumentsRequestedInd) TYPE.get().getPropertyValue( this, "_PrintedDocumentsRequestedInd_elem" );
  }


  public final void setPrintedDocumentsRequestedInd_elem( xsd.acord.PrintedDocumentsRequestedInd value ) {
    TYPE.get().setPropertyValue( this, "_PrintedDocumentsRequestedInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCounterSignatureLicenseNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CounterSignatureLicenseNumber" );
  }


  public final void setCounterSignatureLicenseNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CounterSignatureLicenseNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CounterSignatureLicenseNumber getCounterSignatureLicenseNumber_elem() {
    return (xsd.acord.CounterSignatureLicenseNumber) TYPE.get().getPropertyValue( this, "_CounterSignatureLicenseNumber_elem" );
  }


  public final void setCounterSignatureLicenseNumber_elem( xsd.acord.CounterSignatureLicenseNumber value ) {
    TYPE.get().setPropertyValue( this, "_CounterSignatureLicenseNumber_elem", value );
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
