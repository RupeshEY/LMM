/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FORMATTEDNUMBER extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FORMATTEDNUMBER", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatInteger = new javax.xml.namespace.QName( "", "FormatInteger", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatCurrencyAmt = new javax.xml.namespace.QName( "", "FormatCurrencyAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatModFactor = new javax.xml.namespace.QName( "", "FormatModFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatPct = new javax.xml.namespace.QName( "", "FormatPct", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.types.complex.FORMATTEDNUMBER" );
    }
  };

  public FORMATTEDNUMBER() {
    super( -1638487724, TYPE.get() );
  }

  private FORMATTEDNUMBER( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1638487724, state );
  }

  protected FORMATTEDNUMBER( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FORMATTEDNUMBER( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.types.complex.FORMATTEDNUMBER> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.types.complex.FORMATTEDNUMBER get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatInteger() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormatInteger" );
  }


  public final void setFormatInteger( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormatInteger", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatInteger getFormatInteger_elem() {
    return (xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatInteger) TYPE.get().getPropertyValue( this, "_FormatInteger_elem" );
  }


  public final void setFormatInteger_elem( xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatInteger value ) {
    TYPE.get().setPropertyValue( this, "_FormatInteger_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatCurrencyAmt getFormatCurrencyAmt() {
    return (xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatCurrencyAmt) TYPE.get().getPropertyValue( this, "_FormatCurrencyAmt" );
  }


  public final void setFormatCurrencyAmt( xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatCurrencyAmt value ) {
    TYPE.get().setPropertyValue( this, "_FormatCurrencyAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatModFactor() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormatModFactor" );
  }


  public final void setFormatModFactor( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormatModFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatModFactor getFormatModFactor_elem() {
    return (xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatModFactor) TYPE.get().getPropertyValue( this, "_FormatModFactor_elem" );
  }


  public final void setFormatModFactor_elem( xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatModFactor value ) {
    TYPE.get().setPropertyValue( this, "_FormatModFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatPct() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormatPct" );
  }


  public final void setFormatPct( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormatPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatPct getFormatPct_elem() {
    return (xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatPct) TYPE.get().getPropertyValue( this, "_FormatPct_elem" );
  }


  public final void setFormatPct_elem( xsd.iso.req.anonymous.elements.FORMATTEDNUMBER_FormatPct value ) {
    TYPE.get().setPropertyValue( this, "_FormatPct_elem", value );
  }

}