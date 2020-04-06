/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CalculationLoadingOperation extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CalculationLoadingOperation", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OperatorIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "OperatorIndicator", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.CalculationLoadingOperationType" );
    }
  };

  public CalculationLoadingOperation() {
    super( 978917061, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.CalculationLoadingOperationType() );
  }

  public CalculationLoadingOperation( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.CalculationLoadingOperationType typeInstance ) {
    super( 978917061, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CalculationLoadingOperation( gw.internal.xml.XmlElementState state ) {
    super( 978917061, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.CalculationLoadingOperationType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.CalculationLoadingOperationType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.CalculationLoadingOperationType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.CalculationLoadingOperation.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getOperatorIndicator() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperatorIndicator" );
  }


  public final void setOperatorIndicator( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperatorIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.OperatorIndicator getOperatorIndicator_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.OperatorIndicator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OperatorIndicator_elem" );
  }


  public final void setOperatorIndicator_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.OperatorIndicator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OperatorIndicator_elem", value );
  }
}