/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PendingUpdateApproved extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Context = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/contact/ContactAPI", "context", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AbuidContainer = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/contact/ContactAPI", "abuidContainer", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.PendingUpdateApproved" );
    }
  };

  public PendingUpdateApproved() {
    super( -1768306067, TYPE.get() );
  }

  private PendingUpdateApproved( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1768306067, state );
  }

  protected PendingUpdateApproved( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PendingUpdateApproved( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.PendingUpdateApproved> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.PendingUpdateApproved get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_Context getContext() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_Context) TYPE.get().getPropertyValue( this, "_Context" );
  }


  public final void setContext( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_Context value ) {
    TYPE.get().setPropertyValue( this, "_Context", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_AbuidContainer getAbuidContainer() {
    return (wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_AbuidContainer) TYPE.get().getPropertyValue( this, "_AbuidContainer" );
  }


  public final void setAbuidContainer( wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.elements.PendingUpdateApproved_AbuidContainer value ) {
    TYPE.get().setPropertyValue( this, "_AbuidContainer", value );
  }

}