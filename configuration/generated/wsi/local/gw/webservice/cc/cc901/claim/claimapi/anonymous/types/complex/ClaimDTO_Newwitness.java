/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimDTO_Newwitness extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimDTO", "Entry", "pogo6" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.ClaimDTO_Newwitness" );
    }
  };

  public ClaimDTO_Newwitness() {
    super( -1416097294, TYPE.get() );
  }

  private ClaimDTO_Newwitness( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1416097294, state );
  }

  protected ClaimDTO_Newwitness( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimDTO_Newwitness( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.ClaimDTO_Newwitness> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.ClaimDTO_Newwitness get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_Newwitness_Entry> getEntry() {
    return (java.util.List<wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_Newwitness_Entry>) TYPE.get().getPropertyValue( this, "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimDTO_Newwitness_Entry> value ) {
    TYPE.get().setPropertyValue( this, "_Entry", value );
  }


}
