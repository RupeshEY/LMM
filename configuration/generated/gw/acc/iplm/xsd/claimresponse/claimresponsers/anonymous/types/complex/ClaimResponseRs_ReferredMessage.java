/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimResponseRs_ReferredMessage extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsurerTransactionReference = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rs/1", "InsurerTransactionReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReinsurerTransactionReference = new javax.xml.namespace.QName( "http://www.xchanging.com/claimResponse/rs/1", "ReinsurerTransactionReference", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimresponse.claimresponsers.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.complex.ClaimResponseRs_ReferredMessage" );
    }
  };

  public ClaimResponseRs_ReferredMessage() {
    super( 1405078400, TYPE.get() );
  }

  private ClaimResponseRs_ReferredMessage( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1405078400, state );
  }

  protected ClaimResponseRs_ReferredMessage( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimResponseRs_ReferredMessage( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.complex.ClaimResponseRs_ReferredMessage> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.types.complex.ClaimResponseRs_ReferredMessage get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUUId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_UUId" );
  }


  public final void setUUId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_UUId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId getUUId_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId) TYPE.get().getPropertyValue( this, "_UUId_elem" );
  }


  public final void setUUId_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId value ) {
    TYPE.get().setPropertyValue( this, "_UUId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsurerTransactionReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InsurerTransactionReference" );
  }


  public final void setInsurerTransactionReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InsurerTransactionReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.elements.ClaimResponseRs_ReferredMessage_InsurerTransactionReference getInsurerTransactionReference_elem() {
    return (gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.elements.ClaimResponseRs_ReferredMessage_InsurerTransactionReference) TYPE.get().getPropertyValue( this, "_InsurerTransactionReference_elem" );
  }


  public final void setInsurerTransactionReference_elem( gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.elements.ClaimResponseRs_ReferredMessage_InsurerTransactionReference value ) {
    TYPE.get().setPropertyValue( this, "_InsurerTransactionReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReinsurerTransactionReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReinsurerTransactionReference" );
  }


  public final void setReinsurerTransactionReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReinsurerTransactionReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.elements.ClaimResponseRs_ReferredMessage_ReinsurerTransactionReference getReinsurerTransactionReference_elem() {
    return (gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.elements.ClaimResponseRs_ReferredMessage_ReinsurerTransactionReference) TYPE.get().getPropertyValue( this, "_ReinsurerTransactionReference_elem" );
  }


  public final void setReinsurerTransactionReference_elem( gw.acc.iplm.xsd.claimresponse.claimresponsers.anonymous.elements.ClaimResponseRs_ReferredMessage_ReinsurerTransactionReference value ) {
    TYPE.get().setPropertyValue( this, "_ReinsurerTransactionReference_elem", value );
  }

}
