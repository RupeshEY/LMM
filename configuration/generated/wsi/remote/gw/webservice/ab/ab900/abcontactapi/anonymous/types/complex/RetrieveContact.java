/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RetrieveContact extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LinkID = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "linkID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RetrieveContact" );
    }
  };

  public RetrieveContact() {
    super( 1403236938, TYPE.get() );
  }

  private RetrieveContact( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1403236938, state );
  }

  protected RetrieveContact( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RetrieveContact( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RetrieveContact> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RetrieveContact get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLinkID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_LinkID" );
  }


  public final void setLinkID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_LinkID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveContact_LinkID getLinkID_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveContact_LinkID) TYPE.get().getPropertyValue( this, "_LinkID_elem" );
  }


  public final void setLinkID_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveContact_LinkID value ) {
    TYPE.get().setPropertyValue( this, "_LinkID_elem", value );
  }

}