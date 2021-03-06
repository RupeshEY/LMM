/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class EmployeePay_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "EmployeePay_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayKindCd = new javax.xml.namespace.QName( "", "PayKindCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AvgAmt = new javax.xml.namespace.QName( "", "AvgAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnits = new javax.xml.namespace.QName( "", "NumUnits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayFrequencyCd = new javax.xml.namespace.QName( "", "PayFrequencyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayDeterminationCd = new javax.xml.namespace.QName( "", "PayDeterminationCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.EmployeePay_Type" );
    }
  };

  public EmployeePay_Type() {
    super( -1243033306, TYPE.get() );
  }

  private EmployeePay_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1243033306, state );
  }

  protected EmployeePay_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected EmployeePay_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.EmployeePay_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.EmployeePay_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PayKind getPayKindCd() {
    return (xsd.acord.enums.PayKind) TYPE.get().getPropertyValue( this, "_PayKindCd" );
  }


  public final void setPayKindCd( xsd.acord.enums.PayKind value ) {
    TYPE.get().setPropertyValue( this, "_PayKindCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PayKindCd getPayKindCd_elem() {
    return (xsd.acord.PayKindCd) TYPE.get().getPropertyValue( this, "_PayKindCd_elem" );
  }


  public final void setPayKindCd_elem( xsd.acord.PayKindCd value ) {
    TYPE.get().setPropertyValue( this, "_PayKindCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AvgAmt getAvgAmt() {
    return (xsd.acord.AvgAmt) TYPE.get().getPropertyValue( this, "_AvgAmt" );
  }


  public final void setAvgAmt( xsd.acord.AvgAmt value ) {
    TYPE.get().setPropertyValue( this, "_AvgAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNumUnits() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_NumUnits" );
  }


  public final void setNumUnits( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_NumUnits", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumUnits getNumUnits_elem() {
    return (xsd.acord.NumUnits) TYPE.get().getPropertyValue( this, "_NumUnits_elem" );
  }


  public final void setNumUnits_elem( xsd.acord.NumUnits value ) {
    TYPE.get().setPropertyValue( this, "_NumUnits_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Frequency getPayFrequencyCd() {
    return (xsd.acord.enums.Frequency) TYPE.get().getPropertyValue( this, "_PayFrequencyCd" );
  }


  public final void setPayFrequencyCd( xsd.acord.enums.Frequency value ) {
    TYPE.get().setPropertyValue( this, "_PayFrequencyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PayFrequencyCd getPayFrequencyCd_elem() {
    return (xsd.acord.PayFrequencyCd) TYPE.get().getPropertyValue( this, "_PayFrequencyCd_elem" );
  }


  public final void setPayFrequencyCd_elem( xsd.acord.PayFrequencyCd value ) {
    TYPE.get().setPropertyValue( this, "_PayFrequencyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.PayDetermination getPayDeterminationCd() {
    return (xsd.acord.enums.PayDetermination) TYPE.get().getPropertyValue( this, "_PayDeterminationCd" );
  }


  public final void setPayDeterminationCd( xsd.acord.enums.PayDetermination value ) {
    TYPE.get().setPropertyValue( this, "_PayDeterminationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PayDeterminationCd getPayDeterminationCd_elem() {
    return (xsd.acord.PayDeterminationCd) TYPE.get().getPropertyValue( this, "_PayDeterminationCd_elem" );
  }


  public final void setPayDeterminationCd_elem( xsd.acord.PayDeterminationCd value ) {
    TYPE.get().setPropertyValue( this, "_PayDeterminationCd_elem", value );
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
