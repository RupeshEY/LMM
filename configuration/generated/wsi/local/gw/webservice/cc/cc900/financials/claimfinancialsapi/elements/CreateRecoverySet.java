/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CreateRecoverySet extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/ClaimFinancialsAPI", "createRecoverySet", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/ClaimFinancialsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionSetDTO = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/ClaimFinancialsAPI", "transactionSetDTO", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.CreateRecoverySet" );
    }
  };

  public CreateRecoverySet() {
    super( -1762449760, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.CreateRecoverySet() );
  }

  public CreateRecoverySet( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.CreateRecoverySet typeInstance ) {
    super( -1762449760, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CreateRecoverySet( gw.internal.xml.XmlElementState state ) {
    super( -1762449760, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.CreateRecoverySet get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.CreateRecoverySet.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.CreateRecoverySet typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }

  public static wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.elements.CreateRecoverySet.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.CreateRecoverySet_TransactionSetDTO getTransactionSetDTO() {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.CreateRecoverySet_TransactionSetDTO) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransactionSetDTO" );
  }


  public final void setTransactionSetDTO( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.CreateRecoverySet_TransactionSetDTO value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransactionSetDTO", value );
  }
}
