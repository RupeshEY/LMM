/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PCCREDITSURCHARGE_NumericValue extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "NumericValue", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatInteger = new javax.xml.namespace.QName( "", "FormatInteger", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatCurrencyAmt = new javax.xml.namespace.QName( "", "FormatCurrencyAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatModFactor = new javax.xml.namespace.QName( "", "FormatModFactor", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FormatPct = new javax.xml.namespace.QName( "", "FormatPct", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_NumericValue" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.PCCREDITSURCHARGE_NumericValue" );
    }
  };

  public PCCREDITSURCHARGE_NumericValue() {
    super( 1921570865, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.PCCREDITSURCHARGE_NumericValue() );
  }

  public PCCREDITSURCHARGE_NumericValue( xsd.iso.resp.anonymous.types.complex.PCCREDITSURCHARGE_NumericValue typeInstance ) {
    super( 1921570865, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PCCREDITSURCHARGE_NumericValue( gw.internal.xml.XmlElementState state ) {
    super( 1921570865, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.anonymous.elements.PCCREDITSURCHARGE_NumericValue> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.PCCREDITSURCHARGE_NumericValue get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.PCCREDITSURCHARGE_NumericValue.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.PCCREDITSURCHARGE_NumericValue typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatInteger() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatInteger" );
  }


  public final void setFormatInteger( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatInteger", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatInteger getFormatInteger_elem() {
    return (xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatInteger) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatInteger_elem" );
  }


  public final void setFormatInteger_elem( xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatInteger value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatInteger_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatCurrencyAmt getFormatCurrencyAmt() {
    return (xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatCurrencyAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatCurrencyAmt" );
  }


  public final void setFormatCurrencyAmt( xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatCurrencyAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatCurrencyAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatModFactor() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatModFactor" );
  }


  public final void setFormatModFactor( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatModFactor", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatModFactor getFormatModFactor_elem() {
    return (xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatModFactor) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatModFactor_elem" );
  }


  public final void setFormatModFactor_elem( xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatModFactor value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatModFactor_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFormatPct() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatPct" );
  }


  public final void setFormatPct( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatPct getFormatPct_elem() {
    return (xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatPct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FormatPct_elem" );
  }


  public final void setFormatPct_elem( xsd.iso.resp.anonymous.elements.FORMATTEDNUMBER_FormatPct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FormatPct_elem", value );
  }
}