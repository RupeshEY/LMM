/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.entities.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CCContactAddress extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCContactAddress", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ccintegration", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Address = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "Address", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressBookUID = new javax.xml.namespace.QName( "", "AddressBookUID", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCContactAddress" );
    }
  };

  public CCContactAddress() {
    super( -678770426, TYPE.get() );
  }

  private CCContactAddress( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -678770426, state );
  }

  protected CCContactAddress( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CCContactAddress( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCContactAddress> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCContactAddress get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getAddress() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_Address" );
  }


  public final void setAddress( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_Address", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.CCContactAddress_Address getAddress_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.CCContactAddress_Address) TYPE.get().getPropertyValue( this, "_Address_elem" );
  }


  public final void setAddress_elem( wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.CCContactAddress_Address value ) {
    TYPE.get().setPropertyValue( this, "_Address_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressBookUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AddressBookUID" );
  }


  public final void setAddressBookUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AddressBookUID", value );
  }

}
