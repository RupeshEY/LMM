/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RetrieveClaimRs_ClaimMovement_Extension_Contract_ClaimSettlingAgent extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Location = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Location", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_ClaimSettlingAgent" );
    }
  };

  public RetrieveClaimRs_ClaimMovement_Extension_Contract_ClaimSettlingAgent() {
    super( 2044496973, TYPE.get() );
  }

  private RetrieveClaimRs_ClaimMovement_Extension_Contract_ClaimSettlingAgent( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 2044496973, state );
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_Contract_ClaimSettlingAgent( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RetrieveClaimRs_ClaimMovement_Extension_Contract_ClaimSettlingAgent( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_ClaimSettlingAgent> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_ClaimMovement_Extension_Contract_ClaimSettlingAgent get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Location getLocation() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Location) TYPE.get().getPropertyValue( this, "_Location" );
  }


  public final void setLocation( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Location value ) {
    TYPE.get().setPropertyValue( this, "_Location", value );
  }

}