/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Statement_Documents extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/Statement", "Entry", "pogo11" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.Statement_Documents" );
    }
  };

  public Statement_Documents() {
    super( 361109907, TYPE.get() );
  }

  private Statement_Documents( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 361109907, state );
  }

  protected Statement_Documents( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Statement_Documents( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.Statement_Documents> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.types.complex.Statement_Documents get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.Statement_Documents_Entry> getEntry() {
    return (java.util.List<wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.Statement_Documents_Entry>) TYPE.get().getPropertyValue( this, "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.Statement_Documents_Entry> value ) {
    TYPE.get().setPropertyValue( this, "_Entry", value );
  }


}