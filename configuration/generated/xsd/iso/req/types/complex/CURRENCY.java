/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CURRENCY extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CURRENCY", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Amt = new javax.xml.namespace.QName( "", "Amt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CurCd = new javax.xml.namespace.QName( "", "CurCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ConversionRateRef = new javax.xml.namespace.QName( "", "ConversionRateRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.types.complex.CURRENCY" );
    }
  };

  public CURRENCY() {
    super( -1762611070, TYPE.get() );
  }

  private CURRENCY( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1762611070, state );
  }

  protected CURRENCY( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CURRENCY( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.types.complex.CURRENCY> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.types.complex.CURRENCY get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAmt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Amt" );
  }


  public final void setAmt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Amt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.CURRENCY_Amt getAmt_elem() {
    return (xsd.iso.req.anonymous.elements.CURRENCY_Amt) TYPE.get().getPropertyValue( this, "_Amt_elem" );
  }


  public final void setAmt_elem( xsd.iso.req.anonymous.elements.CURRENCY_Amt value ) {
    TYPE.get().setPropertyValue( this, "_Amt_elem", value );
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
  public final xsd.iso.req.anonymous.elements.CURRENCY_CurCd getCurCd_elem() {
    return (xsd.iso.req.anonymous.elements.CURRENCY_CurCd) TYPE.get().getPropertyValue( this, "_CurCd_elem" );
  }


  public final void setCurCd_elem( xsd.iso.req.anonymous.elements.CURRENCY_CurCd value ) {
    TYPE.get().setPropertyValue( this, "_CurCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getConversionRateRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_ConversionRateRef" );
  }


  public final void setConversionRateRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_ConversionRateRef", value );
  }

}