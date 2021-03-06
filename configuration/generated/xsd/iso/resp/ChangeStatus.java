/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ChangeStatus extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ChangeStatus", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ActionCd = new javax.xml.namespace.QName( "", "ActionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PreviousValue = new javax.xml.namespace.QName( "", "PreviousValue", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RefNameCd = new javax.xml.namespace.QName( "", "RefNameCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ChangeDesc = new javax.xml.namespace.QName( "", "ChangeDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.ChangeStatus" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ChangeStatus" );
    }
  };

  public ChangeStatus() {
    super( 48156850, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.iso.resp.anonymous.types.complex.ChangeStatus() );
  }

  public ChangeStatus( xsd.iso.resp.anonymous.types.complex.ChangeStatus typeInstance ) {
    super( 48156850, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ChangeStatus( gw.internal.xml.XmlElementState state ) {
    super( 48156850, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.resp.ChangeStatus> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.iso.resp.anonymous.types.complex.ChangeStatus get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.iso.resp.anonymous.types.complex.ChangeStatus.class );
  }

  public final void set$TypeInstance( xsd.iso.resp.anonymous.types.complex.ChangeStatus typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.iso.resp.ChangeStatus parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.iso.resp.ChangeStatus.class );
  }

  public static xsd.iso.resp.ChangeStatus parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.iso.resp.ChangeStatus.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ChangeStatus_ActionCd getActionCd() {
    return (xsd.iso.resp.anonymous.elements.ChangeStatus_ActionCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActionCd" );
  }


  public final void setActionCd( xsd.iso.resp.anonymous.elements.ChangeStatus_ActionCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ChangeStatus_PreviousValue getPreviousValue() {
    return (xsd.iso.resp.anonymous.elements.ChangeStatus_PreviousValue) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PreviousValue" );
  }


  public final void setPreviousValue( xsd.iso.resp.anonymous.elements.ChangeStatus_PreviousValue value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PreviousValue", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ChangeStatus_RefNameCd getRefNameCd() {
    return (xsd.iso.resp.anonymous.elements.ChangeStatus_RefNameCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RefNameCd" );
  }


  public final void setRefNameCd( xsd.iso.resp.anonymous.elements.ChangeStatus_RefNameCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RefNameCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.ChangeStatus_ChangeDesc getChangeDesc() {
    return (xsd.iso.resp.anonymous.elements.ChangeStatus_ChangeDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChangeDesc" );
  }


  public final void setChangeDesc( xsd.iso.resp.anonymous.elements.ChangeStatus_ChangeDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChangeDesc", value );
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
