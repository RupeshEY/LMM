/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimResponseRq_ClaimResponse_LeadResponse_IluLead extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IluResponse = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "IluResponse", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrivateComments = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "PrivateComments", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PublicComments = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rq/1", "PublicComments", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponserq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead" );
    }
  };

  public ClaimResponseRq_ClaimResponse_LeadResponse_IluLead() {
    super( 1422357896, TYPE.get() );
  }

  private ClaimResponseRq_ClaimResponse_LeadResponse_IluLead( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1422357896, state );
  }

  protected ClaimResponseRq_ClaimResponse_LeadResponse_IluLead( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimResponseRq_ClaimResponse_LeadResponse_IluLead( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.types.complex.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getIluResponse() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_IluResponse" );
  }


  public final void setIluResponse( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_IluResponse", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_IluResponse getIluResponse_elem() {
    return (gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_IluResponse) TYPE.get().getPropertyValue( this, "_IluResponse_elem" );
  }


  public final void setIluResponse_elem( gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_IluResponse value ) {
    TYPE.get().setPropertyValue( this, "_IluResponse_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PrivateComments> getPrivateComments() {
    return (java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PrivateComments>) TYPE.get().getPropertyValue( this, "_PrivateComments" );
  }


  public final void setPrivateComments( java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PrivateComments> value ) {
    TYPE.get().setPropertyValue( this, "_PrivateComments", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PublicComments> getPublicComments() {
    return (java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PublicComments>) TYPE.get().getPropertyValue( this, "_PublicComments" );
  }


  public final void setPublicComments( java.util.List<gw.acc.iplm.xsd.claimresponse.claimresponserq.anonymous.elements.ClaimResponseRq_ClaimResponse_LeadResponse_IluLead_PublicComments> value ) {
    TYPE.get().setPropertyValue( this, "_PublicComments", value );
  }


}
