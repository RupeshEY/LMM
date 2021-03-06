/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PCCREDITSURCHARGE_NoID extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PCCREDITSURCHARGE_NoID", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditSurchargeDt = new javax.xml.namespace.QName( "", "CreditSurchargeDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditSurchargeCd = new javax.xml.namespace.QName( "", "CreditSurchargeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumericValue = new javax.xml.namespace.QName( "", "NumericValue", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SecondaryCd = new javax.xml.namespace.QName( "", "SecondaryCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PCCREDITSURCHARGE_NoID" );
    }
  };

  public PCCREDITSURCHARGE_NoID() {
    super( 963796298, TYPE.get() );
  }

  private PCCREDITSURCHARGE_NoID( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 963796298, state );
  }

  protected PCCREDITSURCHARGE_NoID( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PCCREDITSURCHARGE_NoID( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PCCREDITSURCHARGE_NoID> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PCCREDITSURCHARGE_NoID get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCreditSurchargeDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CreditSurchargeDt" );
  }


  public final void setCreditSurchargeDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CreditSurchargeDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CreditSurchargeDt getCreditSurchargeDt_elem() {
    return (xsd.acord.CreditSurchargeDt) TYPE.get().getPropertyValue( this, "_CreditSurchargeDt_elem" );
  }


  public final void setCreditSurchargeDt_elem( xsd.acord.CreditSurchargeDt value ) {
    TYPE.get().setPropertyValue( this, "_CreditSurchargeDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Coverages getCreditSurchargeCd() {
    return (xsd.acord.enums.Coverages) TYPE.get().getPropertyValue( this, "_CreditSurchargeCd" );
  }


  public final void setCreditSurchargeCd( xsd.acord.enums.Coverages value ) {
    TYPE.get().setPropertyValue( this, "_CreditSurchargeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CreditSurchargeCd getCreditSurchargeCd_elem() {
    return (xsd.acord.CreditSurchargeCd) TYPE.get().getPropertyValue( this, "_CreditSurchargeCd_elem" );
  }


  public final void setCreditSurchargeCd_elem( xsd.acord.CreditSurchargeCd value ) {
    TYPE.get().setPropertyValue( this, "_CreditSurchargeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.NumericValue> getNumericValue() {
    return (java.util.List<xsd.acord.NumericValue>) TYPE.get().getPropertyValue( this, "_NumericValue" );
  }


  public final void setNumericValue( java.util.List<xsd.acord.NumericValue> value ) {
    TYPE.get().setPropertyValue( this, "_NumericValue", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSecondaryCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SecondaryCd" );
  }


  public final void setSecondaryCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SecondaryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SecondaryCd getSecondaryCd_elem() {
    return (xsd.acord.SecondaryCd) TYPE.get().getPropertyValue( this, "_SecondaryCd_elem" );
  }


  public final void setSecondaryCd_elem( xsd.acord.SecondaryCd value ) {
    TYPE.get().setPropertyValue( this, "_SecondaryCd_elem", value );
  }

}
