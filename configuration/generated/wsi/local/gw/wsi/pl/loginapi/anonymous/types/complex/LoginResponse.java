/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.loginapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class LoginResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Return = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/LoginAPI", "return", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.loginapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.loginapi.anonymous.types.complex.LoginResponse" );
    }
  };

  public LoginResponse() {
    super( 1991909712, TYPE.get() );
  }

  private LoginResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1991909712, state );
  }

  protected LoginResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected LoginResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.loginapi.anonymous.types.complex.LoginResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.loginapi.anonymous.types.complex.LoginResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReturn() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Return" );
  }


  public final void setReturn( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Return", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.loginapi.anonymous.elements.LoginResponse_Return getReturn_elem() {
    return (wsi.local.gw.wsi.pl.loginapi.anonymous.elements.LoginResponse_Return) TYPE.get().getPropertyValue( this, "_Return_elem" );
  }


  public final void setReturn_elem( wsi.local.gw.wsi.pl.loginapi.anonymous.elements.LoginResponse_Return value ) {
    TYPE.get().setPropertyValue( this, "_Return_elem", value );
  }

}