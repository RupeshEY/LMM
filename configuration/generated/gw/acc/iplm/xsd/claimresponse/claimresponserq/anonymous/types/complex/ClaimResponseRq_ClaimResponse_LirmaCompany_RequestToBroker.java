/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Request = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "Request", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponserq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker" );
    }
  };

  public ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker() {
    super( 1419263700, TYPE.get() );
  }

  private ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1419263700, state );
  }

  protected ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRequest() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Request" );
  }


  public final void setRequest( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Request", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker_Request getRequest_elem() {
    return (gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker_Request) TYPE.get().getPropertyValue( this, "_Request_elem" );
  }


  public final void setRequest_elem( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LirmaCompany_RequestToBroker_Request value ) {
    TYPE.get().setPropertyValue( this, "_Request_elem", value );
  }

}
