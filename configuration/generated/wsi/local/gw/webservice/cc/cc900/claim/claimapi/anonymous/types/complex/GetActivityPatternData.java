/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetActivityPatternData extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/claim/ClaimAPI", "publicID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex.GetActivityPatternData" );
    }
  };

  public GetActivityPatternData() {
    super( -715393097, TYPE.get() );
  }

  private GetActivityPatternData( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -715393097, state );
  }

  protected GetActivityPatternData( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetActivityPatternData( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex.GetActivityPatternData> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex.GetActivityPatternData get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPublicID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PublicID" );
  }


  public final void setPublicID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.GetActivityPatternData_PublicID getPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.GetActivityPatternData_PublicID) TYPE.get().getPropertyValue( this, "_PublicID_elem" );
  }


  public final void setPublicID_elem( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.GetActivityPatternData_PublicID value ) {
    TYPE.get().setPropertyValue( this, "_PublicID_elem", value );
  }

}