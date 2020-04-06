/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class EmployeePay extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "EmployeePay", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayKindCd = new javax.xml.namespace.QName( "", "PayKindCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AvgAmt = new javax.xml.namespace.QName( "", "AvgAmt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnits = new javax.xml.namespace.QName( "", "NumUnits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayFrequencyCd = new javax.xml.namespace.QName( "", "PayFrequencyCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PayDeterminationCd = new javax.xml.namespace.QName( "", "PayDeterminationCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.EmployeePay" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.EmployeePay" );
    }
  };

  public EmployeePay() {
    super( 364431402, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.EmployeePay() );
  }

  public EmployeePay( xsd.iso.resp.anonymous.types.complex.EmployeePay typeInstance ) {
    super( 364431402, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private EmployeePay( gw.internal.xml.XmlElementState state ) {
    super( 364431402, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.EmployeePay> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.EmployeePay get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.EmployeePay.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.EmployeePay typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.resp.EmployeePay parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.resp.EmployeePay.class );
  }

  public static xsd.iso.resp.EmployeePay parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.resp.EmployeePay.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPayKindCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PayKindCd" );
  }


  public final void setPayKindCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PayKindCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.EmployeePay_PayKindCd getPayKindCd_elem() {
    return (xsd.iso.resp.anonymous.elements.EmployeePay_PayKindCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PayKindCd_elem" );
  }


  public final void setPayKindCd_elem( xsd.iso.resp.anonymous.elements.EmployeePay_PayKindCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PayKindCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.EmployeePay_AvgAmt getAvgAmt() {
    return (xsd.iso.resp.anonymous.elements.EmployeePay_AvgAmt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AvgAmt" );
  }


  public final void setAvgAmt( xsd.iso.resp.anonymous.elements.EmployeePay_AvgAmt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AvgAmt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNumUnits() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits" );
  }


  public final void setNumUnits( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.EmployeePay_NumUnits getNumUnits_elem() {
    return (xsd.iso.resp.anonymous.elements.EmployeePay_NumUnits) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits_elem" );
  }


  public final void setNumUnits_elem( xsd.iso.resp.anonymous.elements.EmployeePay_NumUnits value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPayFrequencyCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PayFrequencyCd" );
  }


  public final void setPayFrequencyCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PayFrequencyCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.EmployeePay_PayFrequencyCd getPayFrequencyCd_elem() {
    return (xsd.iso.resp.anonymous.elements.EmployeePay_PayFrequencyCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PayFrequencyCd_elem" );
  }


  public final void setPayFrequencyCd_elem( xsd.iso.resp.anonymous.elements.EmployeePay_PayFrequencyCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PayFrequencyCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPayDeterminationCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PayDeterminationCd" );
  }


  public final void setPayDeterminationCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PayDeterminationCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.EmployeePay_PayDeterminationCd getPayDeterminationCd_elem() {
    return (xsd.iso.resp.anonymous.elements.EmployeePay_PayDeterminationCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PayDeterminationCd_elem" );
  }


  public final void setPayDeterminationCd_elem( xsd.iso.resp.anonymous.elements.EmployeePay_PayDeterminationCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PayDeterminationCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}