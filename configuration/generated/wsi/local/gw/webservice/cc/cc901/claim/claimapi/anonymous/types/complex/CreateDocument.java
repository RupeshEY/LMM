/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CreateDocument extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Dto = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "dto", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateDocument" );
    }
  };

  public CreateDocument() {
    super( -142983270, TYPE.get() );
  }

  private CreateDocument( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -142983270, state );
  }

  protected CreateDocument( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CreateDocument( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateDocument> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CreateDocument get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateDocument_Dto getDto() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateDocument_Dto) TYPE.get().getPropertyValue( this, "_Dto" );
  }


  public final void setDto( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CreateDocument_Dto value ) {
    TYPE.get().setPropertyValue( this, "_Dto", value );
  }

}
