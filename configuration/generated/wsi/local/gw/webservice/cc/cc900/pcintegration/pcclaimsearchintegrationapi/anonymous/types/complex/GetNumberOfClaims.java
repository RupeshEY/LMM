/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetNumberOfClaims extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Criteria = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/PCClaimSearchIntegrationAPI", "criteria", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.types.complex.GetNumberOfClaims" );
    }
  };

  public GetNumberOfClaims() {
    super( 472605989, TYPE.get() );
  }

  private GetNumberOfClaims( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 472605989, state );
  }

  protected GetNumberOfClaims( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetNumberOfClaims( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.types.complex.GetNumberOfClaims> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.types.complex.GetNumberOfClaims get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.GetNumberOfClaims_Criteria getCriteria() {
    return (wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.GetNumberOfClaims_Criteria) TYPE.get().getPropertyValue( this, "_Criteria" );
  }


  public final void setCriteria( wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.GetNumberOfClaims_Criteria value ) {
    TYPE.get().setPropertyValue( this, "_Criteria", value );
  }

}
