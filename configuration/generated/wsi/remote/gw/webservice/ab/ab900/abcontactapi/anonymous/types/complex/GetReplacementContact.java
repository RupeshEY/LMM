/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetReplacementContact extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContactLinkID = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "contactLinkID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.GetReplacementContact" );
    }
  };

  public GetReplacementContact() {
    super( 607178026, TYPE.get() );
  }

  private GetReplacementContact( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 607178026, state );
  }

  protected GetReplacementContact( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetReplacementContact( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.GetReplacementContact> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.GetReplacementContact get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContactLinkID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ContactLinkID" );
  }


  public final void setContactLinkID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ContactLinkID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.GetReplacementContact_ContactLinkID getContactLinkID_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.GetReplacementContact_ContactLinkID) TYPE.get().getPropertyValue( this, "_ContactLinkID_elem" );
  }


  public final void setContactLinkID_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.GetReplacementContact_ContactLinkID value ) {
    TYPE.get().setPropertyValue( this, "_ContactLinkID_elem", value );
  }

}