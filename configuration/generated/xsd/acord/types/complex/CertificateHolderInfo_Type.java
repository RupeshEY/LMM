/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CertificateHolderInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CertificateHolderInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AdditionalInterest = new javax.xml.namespace.QName( "", "AdditionalInterest", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperationsDesc = new javax.xml.namespace.QName( "", "OperationsDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDaysCancel = new javax.xml.namespace.QName( "", "NumDaysCancel", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeliveryMethodCd = new javax.xml.namespace.QName( "", "DeliveryMethodCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CertificateHolderInfo_Type" );
    }
  };

  public CertificateHolderInfo_Type() {
    super( -1879748497, TYPE.get() );
  }

  private CertificateHolderInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1879748497, state );
  }

  protected CertificateHolderInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CertificateHolderInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CertificateHolderInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CertificateHolderInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AdditionalInterest getAdditionalInterest() {
    return (xsd.acord.AdditionalInterest) TYPE.get().getPropertyValue( this, "_AdditionalInterest" );
  }


  public final void setAdditionalInterest( xsd.acord.AdditionalInterest value ) {
    TYPE.get().setPropertyValue( this, "_AdditionalInterest", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOperationsDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_OperationsDesc" );
  }


  public final void setOperationsDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_OperationsDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OperationsDesc getOperationsDesc_elem() {
    return (xsd.acord.OperationsDesc) TYPE.get().getPropertyValue( this, "_OperationsDesc_elem" );
  }


  public final void setOperationsDesc_elem( xsd.acord.OperationsDesc value ) {
    TYPE.get().setPropertyValue( this, "_OperationsDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDaysCancel() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDaysCancel" );
  }


  public final void setNumDaysCancel( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDaysCancel", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDaysCancel getNumDaysCancel_elem() {
    return (xsd.acord.NumDaysCancel) TYPE.get().getPropertyValue( this, "_NumDaysCancel_elem" );
  }


  public final void setNumDaysCancel_elem( xsd.acord.NumDaysCancel value ) {
    TYPE.get().setPropertyValue( this, "_NumDaysCancel_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.DeliveryMethod getDeliveryMethodCd() {
    return (xsd.acord.enums.DeliveryMethod) TYPE.get().getPropertyValue( this, "_DeliveryMethodCd" );
  }


  public final void setDeliveryMethodCd( xsd.acord.enums.DeliveryMethod value ) {
    TYPE.get().setPropertyValue( this, "_DeliveryMethodCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DeliveryMethodCd getDeliveryMethodCd_elem() {
    return (xsd.acord.DeliveryMethodCd) TYPE.get().getPropertyValue( this, "_DeliveryMethodCd_elem" );
  }


  public final void setDeliveryMethodCd_elem( xsd.acord.DeliveryMethodCd value ) {
    TYPE.get().setPropertyValue( this, "_DeliveryMethodCd_elem", value );
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
