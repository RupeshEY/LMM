/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BillingAccountInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BillingAccountInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingAccountNumber = new javax.xml.namespace.QName( "", "BillingAccountNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingPeriod = new javax.xml.namespace.QName( "", "BillingPeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BillingMethodCd = new javax.xml.namespace.QName( "", "BillingMethodCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BillingAccountInfo_Type" );
    }
  };

  public BillingAccountInfo_Type() {
    super( 396361618, TYPE.get() );
  }

  private BillingAccountInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 396361618, state );
  }

  protected BillingAccountInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BillingAccountInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.BillingAccountInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.BillingAccountInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBillingAccountNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BillingAccountNumber" );
  }


  public final void setBillingAccountNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BillingAccountNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillingAccountNumber getBillingAccountNumber_elem() {
    return (xsd.acord.BillingAccountNumber) TYPE.get().getPropertyValue( this, "_BillingAccountNumber_elem" );
  }


  public final void setBillingAccountNumber_elem( xsd.acord.BillingAccountNumber value ) {
    TYPE.get().setPropertyValue( this, "_BillingAccountNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BillingPeriod getBillingPeriod() {
    return (xsd.acord.BillingPeriod) TYPE.get().getPropertyValue( this, "_BillingPeriod" );
  }


  public final void setBillingPeriod( xsd.acord.BillingPeriod value ) {
    TYPE.get().setPropertyValue( this, "_BillingPeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.BillingMethod> getBillingMethodCd() {
    return (java.util.List<xsd.acord.enums.BillingMethod>) TYPE.get().getPropertyValue( this, "_BillingMethodCd" );
  }


  public final void setBillingMethodCd( java.util.List<xsd.acord.enums.BillingMethod> value ) {
    TYPE.get().setPropertyValue( this, "_BillingMethodCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.BillingMethodCd> getBillingMethodCd_elem() {
    return (java.util.List<xsd.acord.BillingMethodCd>) TYPE.get().getPropertyValue( this, "_BillingMethodCd_elem" );
  }


  public final void setBillingMethodCd_elem( java.util.List<xsd.acord.BillingMethodCd> value ) {
    TYPE.get().setPropertyValue( this, "_BillingMethodCd_elem", value );
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
