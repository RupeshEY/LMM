/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ImportXmlDataAsByteArray_XmlData extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "xmlData", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/ImportToolsAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXmlDataAsByteArray_XmlData" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().findTypeData( "gw.xsd.w3c.xmlschema.types.simple.HexBinary", "gw.xsd.w3c.xmlschema" );
    }
  };

  public ImportXmlDataAsByteArray_XmlData() {
    super( -1663284408, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.HexBinary() );
  }

  public ImportXmlDataAsByteArray_XmlData( gw.xsd.w3c.xmlschema.types.simple.HexBinary typeInstance ) {
    super( -1663284408, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ImportXmlDataAsByteArray_XmlData( gw.internal.xml.XmlElementState state ) {
    super( -1663284408, state );
  }

  public ImportXmlDataAsByteArray_XmlData( byte[] value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportXmlDataAsByteArray_XmlData> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.xsd.w3c.xmlschema.types.simple.HexBinary get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.xsd.w3c.xmlschema.types.simple.HexBinary.class );
  }

  public final void set$TypeInstance( gw.xsd.w3c.xmlschema.types.simple.HexBinary typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final byte[] getValue() {
    return (byte[]) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final byte[] get$Value() {
    return (byte[]) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( byte[] value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( byte[] value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}