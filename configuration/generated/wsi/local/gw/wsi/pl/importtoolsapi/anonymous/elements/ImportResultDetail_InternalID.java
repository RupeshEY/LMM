/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ImportResultDetail_InternalID extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/importTools", "InternalID", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/webservice/importTools", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultDetail_InternalID" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.importtoolsapi.util.SchemaAccess ).getSchemaIndex().findTypeData( "gw.xsd.w3c.xmlschema.types.simple.Long", "gw.xsd.w3c.xmlschema" );
    }
  };

  public ImportResultDetail_InternalID() {
    super( -368855935, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Long() );
  }

  public ImportResultDetail_InternalID( gw.xsd.w3c.xmlschema.types.simple.Long typeInstance ) {
    super( -368855935, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ImportResultDetail_InternalID( gw.internal.xml.XmlElementState state ) {
    super( -368855935, state );
  }

  public ImportResultDetail_InternalID( java.lang.Long value ) {
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
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.importtoolsapi.anonymous.elements.ImportResultDetail_InternalID> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.xsd.w3c.xmlschema.types.simple.Long get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.xsd.w3c.xmlschema.types.simple.Long.class );
  }

  public final void set$TypeInstance( gw.xsd.w3c.xmlschema.types.simple.Long typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getValue() {
    return (java.lang.Long) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long get$Value() {
    return (java.lang.Long) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( java.lang.Long value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( java.lang.Long value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}