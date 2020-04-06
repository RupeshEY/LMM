/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CloseExposure extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExposureID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "exposureID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Outcome = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "outcome", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Reason = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/claim/ClaimAPI", "reason", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CloseExposure" );
    }
  };

  public CloseExposure() {
    super( 926312796, TYPE.get() );
  }

  private CloseExposure( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 926312796, state );
  }

  protected CloseExposure( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CloseExposure( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CloseExposure> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.types.complex.CloseExposure get$TypeInstance() {
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
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CloseExposure_ExposureID getExposureID_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CloseExposure_ExposureID) TYPE.get().getPropertyValue( this, "_ExposureID_elem" );
  }


  public final void setExposureID_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CloseExposure_ExposureID value ) {
    TYPE.get().setPropertyValue( this, "_ExposureID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ExposureClosedOutcomeType getOutcome() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ExposureClosedOutcomeType) TYPE.get().getPropertyValue( this, "_Outcome" );
  }


  public final void setOutcome( wsi.local.gw.webservice.cc.cc901.claim.claimapi.enums.ExposureClosedOutcomeType value ) {
    TYPE.get().setPropertyValue( this, "_Outcome", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CloseExposure_Outcome getOutcome_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CloseExposure_Outcome) TYPE.get().getPropertyValue( this, "_Outcome_elem" );
  }


  public final void setOutcome_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CloseExposure_Outcome value ) {
    TYPE.get().setPropertyValue( this, "_Outcome_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReason() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Reason" );
  }


  public final void setReason( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Reason", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CloseExposure_Reason getReason_elem() {
    return (wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CloseExposure_Reason) TYPE.get().getPropertyValue( this, "_Reason_elem" );
  }


  public final void setReason_elem( wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.CloseExposure_Reason value ) {
    TYPE.get().setPropertyValue( this, "_Reason_elem", value );
  }

}