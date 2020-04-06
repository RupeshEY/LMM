/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ApplyForeignExchangeAdjustmentToCheck extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CheckPublicID = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/ClaimFinancialsAPI", "checkPublicID", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NewClaimAmount = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/ClaimFinancialsAPI", "newClaimAmount", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NewReportingAmount = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/ClaimFinancialsAPI", "newReportingAmount", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.ApplyForeignExchangeAdjustmentToCheck" );
    }
  };

  public ApplyForeignExchangeAdjustmentToCheck() {
    super( 1267518461, TYPE.get() );
  }

  private ApplyForeignExchangeAdjustmentToCheck( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1267518461, state );
  }

  protected ApplyForeignExchangeAdjustmentToCheck( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ApplyForeignExchangeAdjustmentToCheck( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.ApplyForeignExchangeAdjustmentToCheck> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.types.complex.ApplyForeignExchangeAdjustmentToCheck get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCheckPublicID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CheckPublicID" );
  }


  public final void setCheckPublicID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CheckPublicID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_CheckPublicID getCheckPublicID_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_CheckPublicID) TYPE.get().getPropertyValue( this, "_CheckPublicID_elem" );
  }


  public final void setCheckPublicID_elem( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_CheckPublicID value ) {
    TYPE.get().setPropertyValue( this, "_CheckPublicID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNewClaimAmount() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_NewClaimAmount" );
  }


  public final void setNewClaimAmount( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_NewClaimAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_NewClaimAmount getNewClaimAmount_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_NewClaimAmount) TYPE.get().getPropertyValue( this, "_NewClaimAmount_elem" );
  }


  public final void setNewClaimAmount_elem( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_NewClaimAmount value ) {
    TYPE.get().setPropertyValue( this, "_NewClaimAmount_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNewReportingAmount() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_NewReportingAmount" );
  }


  public final void setNewReportingAmount( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_NewReportingAmount", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount getNewReportingAmount_elem() {
    return (wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount) TYPE.get().getPropertyValue( this, "_NewReportingAmount_elem" );
  }


  public final void setNewReportingAmount_elem( wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount value ) {
    TYPE.get().setPropertyValue( this, "_NewReportingAmount_elem", value );
  }

}