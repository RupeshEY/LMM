/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.loginapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Logout extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SessionID = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/LoginAPI", "sessionID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.loginapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.loginapi.anonymous.types.complex.Logout" );
    }
  };

  public Logout() {
    super( -817558076, TYPE.get() );
  }

  private Logout( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -817558076, state );
  }

  protected Logout( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Logout( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.loginapi.anonymous.types.complex.Logout> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.loginapi.anonymous.types.complex.Logout get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSessionID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SessionID" );
  }


  public final void setSessionID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SessionID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.loginapi.anonymous.elements.Logout_SessionID getSessionID_elem() {
    return (wsi.local.gw.wsi.pl.loginapi.anonymous.elements.Logout_SessionID) TYPE.get().getPropertyValue( this, "_SessionID_elem" );
  }


  public final void setSessionID_elem( wsi.local.gw.wsi.pl.loginapi.anonymous.elements.Logout_SessionID value ) {
    TYPE.get().setPropertyValue( this, "_SessionID_elem", value );
  }

}