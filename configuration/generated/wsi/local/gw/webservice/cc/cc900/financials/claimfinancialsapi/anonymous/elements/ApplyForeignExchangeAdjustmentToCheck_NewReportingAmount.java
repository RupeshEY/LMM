/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount extends gw.internal.xml.simplevalues.DecimalXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/ClaimFinancialsAPI", "newReportingAmount", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/ClaimFinancialsAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount" );
    }
  };

  public ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount() {
    super( 1228827678, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Decimal() );
  }

  public ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount( gw.xsd.w3c.xmlschema.types.simple.Decimal typeInstance ) {
    super( 1228827678, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount( gw.internal.xml.XmlElementState state ) {
    super( 1228827678, state );
  }

  public ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount( java.math.BigDecimal value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.ApplyForeignExchangeAdjustmentToCheck_NewReportingAmount> get$Class() {
    return getClass();
  }
}
