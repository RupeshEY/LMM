/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RemoveContact extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AddressBookUID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/contact/ContactAPI", "addressBookUID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc800.contact.contactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.types.complex.RemoveContact" );
    }
  };

  public RemoveContact() {
    super( -528273421, TYPE.get() );
  }

  private RemoveContact( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -528273421, state );
  }

  protected RemoveContact( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RemoveContact( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.types.complex.RemoveContact> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.types.complex.RemoveContact get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressBookUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AddressBookUID" );
  }


  public final void setAddressBookUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AddressBookUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.RemoveContact_AddressBookUID getAddressBookUID_elem() {
    return (wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.RemoveContact_AddressBookUID) TYPE.get().getPropertyValue( this, "_AddressBookUID_elem" );
  }


  public final void setAddressBookUID_elem( wsi.local.gw.webservice.cc.cc800.contact.contactapi.anonymous.elements.RemoveContact_AddressBookUID value ) {
    TYPE.get().setPropertyValue( this, "_AddressBookUID_elem", value );
  }

}