/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FORMATTEDNUMBER_NoID extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FORMATTEDNUMBER_NoID", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatInteger = new javax.xml.namespace.QName( "", "FormatInteger", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatCurrencyAmt = new javax.xml.namespace.QName( "", "FormatCurrencyAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatModFactor = new javax.xml.namespace.QName( "", "FormatModFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatPct = new javax.xml.namespace.QName( "", "FormatPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatText = new javax.xml.namespace.QName( "", "FormatText", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.FORMATTEDNUMBER_NoID" );
    }
  };

  public FORMATTEDNUMBER_NoID() {
    super( 1069392893, TYPE.get() );
  }

  private FORMATTEDNUMBER_NoID( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1069392893, state );
  }

  protected FORMATTEDNUMBER_NoID( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FORMATTEDNUMBER_NoID( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.FORMATTEDNUMBER_NoID> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.FORMATTEDNUMBER_NoID get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getFormatInteger() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_FormatInteger" );
  }


  public final void setFormatInteger( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_FormatInteger", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormatInteger getFormatInteger_elem() {
    return (xsd.acord.FormatInteger) TYPE.get().getPropertyValue( this, "_FormatInteger_elem" );
  }


  public final void setFormatInteger_elem( xsd.acord.FormatInteger value ) {
    TYPE.get().setPropertyValue( this, "_FormatInteger_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormatCurrencyAmt getFormatCurrencyAmt() {
    return (xsd.acord.FormatCurrencyAmt) TYPE.get().getPropertyValue( this, "_FormatCurrencyAmt" );
  }


  public final void setFormatCurrencyAmt( xsd.acord.FormatCurrencyAmt value ) {
    TYPE.get().setPropertyValue( this, "_FormatCurrencyAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getFormatModFactor() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_FormatModFactor" );
  }


  public final void setFormatModFactor( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_FormatModFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormatModFactor getFormatModFactor_elem() {
    return (xsd.acord.FormatModFactor) TYPE.get().getPropertyValue( this, "_FormatModFactor_elem" );
  }


  public final void setFormatModFactor_elem( xsd.acord.FormatModFactor value ) {
    TYPE.get().setPropertyValue( this, "_FormatModFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getFormatPct() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_FormatPct" );
  }


  public final void setFormatPct( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_FormatPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormatPct getFormatPct_elem() {
    return (xsd.acord.FormatPct) TYPE.get().getPropertyValue( this, "_FormatPct_elem" );
  }


  public final void setFormatPct_elem( xsd.acord.FormatPct value ) {
    TYPE.get().setPropertyValue( this, "_FormatPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatText() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FormatText" );
  }


  public final void setFormatText( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FormatText", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FormatText getFormatText_elem() {
    return (xsd.acord.FormatText) TYPE.get().getPropertyValue( this, "_FormatText_elem" );
  }


  public final void setFormatText_elem( xsd.acord.FormatText value ) {
    TYPE.get().setPropertyValue( this, "_FormatText_elem", value );
  }

}