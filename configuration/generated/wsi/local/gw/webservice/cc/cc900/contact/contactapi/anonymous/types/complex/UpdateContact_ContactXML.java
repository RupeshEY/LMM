/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class UpdateContact_ContactXML extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_XmlBackedInstance = new javax.xml.namespace.QName( "http://guidewire.com/ctc/beanmodel", "xmlBackedInstance", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.UpdateContact_ContactXML" );
    }
  };

  public UpdateContact_ContactXML() {
    super( 933045257, TYPE.get() );
  }

  private UpdateContact_ContactXML( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 933045257, state );
  }

  protected UpdateContact_ContactXML( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected UpdateContact_ContactXML( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.UpdateContact_ContactXML> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.contact.contactapi.anonymous.types.complex.UpdateContact_ContactXML get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.webservice.contactapi.beanmodel.XmlBackedInstance getXmlBackedInstance() {
    return (gw.webservice.contactapi.beanmodel.XmlBackedInstance) TYPE.get().getPropertyValue( this, "_XmlBackedInstance" );
  }


  public final void setXmlBackedInstance( gw.webservice.contactapi.beanmodel.XmlBackedInstance value ) {
    TYPE.get().setPropertyValue( this, "_XmlBackedInstance", value );
  }

}