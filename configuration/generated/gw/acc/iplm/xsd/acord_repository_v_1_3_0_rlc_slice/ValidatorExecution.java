/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ValidatorExecution extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "ValidatorExecution", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Validator = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Validator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValidatorResult = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "ValidatorResult", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.ValidatorExecutionType" );
    }
  };

  public ValidatorExecution() {
    super( -840468257, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.ValidatorExecutionType() );
  }

  public ValidatorExecution( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.ValidatorExecutionType typeInstance ) {
    super( -840468257, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ValidatorExecution( gw.internal.xml.XmlElementState state ) {
    super( -840468257, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.ValidatorExecutionType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.ValidatorExecutionType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.ValidatorExecutionType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }

  public static gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorExecution.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Validator getValidator() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Validator) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Validator" );
  }


  public final void setValidator( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Validator value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Validator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorResult> getValidatorResult() {
    return (java.util.List<gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorResult>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValidatorResult" );
  }


  public final void setValidatorResult( java.util.List<gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ValidatorResult> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValidatorResult", value );
  }

}