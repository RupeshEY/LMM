/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetDtoForExposure extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExposureID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "exposureID", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.GetDtoForExposure" );
    }
  };

  public GetDtoForExposure() {
    super( -1134088636, TYPE.get() );
  }

  private GetDtoForExposure( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1134088636, state );
  }

  protected GetDtoForExposure( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetDtoForExposure( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.GetDtoForExposure> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.GetDtoForExposure get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getExposureID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ExposureID" );
  }


  public final void setExposureID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ExposureID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.GetDtoForExposure_ExposureID getExposureID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.GetDtoForExposure_ExposureID) TYPE.get().getPropertyValue( this, "_ExposureID_elem" );
  }


  public final void setExposureID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.GetDtoForExposure_ExposureID value ) {
    TYPE.get().setPropertyValue( this, "_ExposureID_elem", value );
  }

}