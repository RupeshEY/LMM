/* Generated by Guidewire XML Code Generator */

package gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ISOLogin extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://tempuri.org/", "ISOLogin", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://tempuri.org/", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UserName = new javax.xml.namespace.QName( "http://tempuri.org/", "userName", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Password = new javax.xml.namespace.QName( "http://tempuri.org/", "password", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.types.complex.ISOLogin" );
    }
  };

  public ISOLogin() {
    super( -906581943, TYPE.get() );
  }

  private ISOLogin( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -906581943, state );
  }

  protected ISOLogin( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ISOLogin( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.types.complex.ISOLogin> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.types.complex.ISOLogin get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUserName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_UserName" );
  }


  public final void setUserName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_UserName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.anonymous.elements.ISOLogin_UserName getUserName_elem() {
    return (gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.anonymous.elements.ISOLogin_UserName) TYPE.get().getPropertyValue( this, "_UserName_elem" );
  }


  public final void setUserName_elem( gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.anonymous.elements.ISOLogin_UserName value ) {
    TYPE.get().setPropertyValue( this, "_UserName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPassword() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Password" );
  }


  public final void setPassword( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Password", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.anonymous.elements.ISOLogin_Password getPassword_elem() {
    return (gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.anonymous.elements.ISOLogin_Password) TYPE.get().getPropertyValue( this, "_Password_elem" );
  }


  public final void setPassword_elem( gw.webservice.cc.system.integration.messaging.isoxmlwebservice.xmlsoap_xsd1.anonymous.elements.ISOLogin_Password value ) {
    TYPE.get().setPropertyValue( this, "_Password_elem", value );
  }

}
