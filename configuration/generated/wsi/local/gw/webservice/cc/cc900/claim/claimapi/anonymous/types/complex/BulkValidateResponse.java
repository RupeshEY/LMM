/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BulkValidateResponse extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Return = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/claim/ClaimAPI", "return", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex.BulkValidateResponse" );
    }
  };

  public BulkValidateResponse() {
    super( 33094475, TYPE.get() );
  }

  private BulkValidateResponse( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 33094475, state );
  }

  protected BulkValidateResponse( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BulkValidateResponse( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex.BulkValidateResponse> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex.BulkValidateResponse get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getReturn() {
    return (java.lang.Long) TYPE.get().getPropertyValue( this, "_Return" );
  }


  public final void setReturn( java.lang.Long value ) {
    TYPE.get().setPropertyValue( this, "_Return", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.BulkValidateResponse_Return getReturn_elem() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.BulkValidateResponse_Return) TYPE.get().getPropertyValue( this, "_Return_elem" );
  }


  public final void setReturn_elem( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.BulkValidateResponse_Return value ) {
    TYPE.get().setPropertyValue( this, "_Return_elem", value );
  }

}
