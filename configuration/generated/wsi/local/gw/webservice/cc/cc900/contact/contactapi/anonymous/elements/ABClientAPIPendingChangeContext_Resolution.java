/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABClientAPIPendingChangeContext_Resolution extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/webservice/contactapi/ab900/ABClientAPIPendingChangeContext", "Resolution", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/webservice/contactapi/ab900/ABClientAPIPendingChangeContext", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIPendingChangeContext_Resolution" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.simple.ContactChangeResolution" );
    }
  };

  public ABClientAPIPendingChangeContext_Resolution() {
    super( -373030891, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.simple.ContactChangeResolution() );
  }

  public ABClientAPIPendingChangeContext_Resolution( wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.simple.ContactChangeResolution typeInstance ) {
    super( -373030891, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABClientAPIPendingChangeContext_Resolution( gw.internal.xml.XmlElementState state ) {
    super( -373030891, state );
  }

  public ABClientAPIPendingChangeContext_Resolution( wsi.local.gw.webservice.cc.cc900.contact.contactapi.enums.ContactChangeResolution value ) {
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
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.ABClientAPIPendingChangeContext_Resolution> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.simple.ContactChangeResolution get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.simple.ContactChangeResolution.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.contact.contactapi.types.simple.ContactChangeResolution typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.enums.ContactChangeResolution getValue() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.enums.ContactChangeResolution) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.enums.ContactChangeResolution get$Value() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.enums.ContactChangeResolution) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "Value" );
  }

  public final void setValue( wsi.local.gw.webservice.cc.cc900.contact.contactapi.enums.ContactChangeResolution value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }

  public final void set$Value( wsi.local.gw.webservice.cc.cc900.contact.contactapi.enums.ContactChangeResolution value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "Value", value );
  }
}