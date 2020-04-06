/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AutoInvestigationInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DeliveryDestinationDesc = new javax.xml.namespace.QName( "", "DeliveryDestinationDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RentalStatusCd = new javax.xml.namespace.QName( "", "RentalStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RentalStatusDt = new javax.xml.namespace.QName( "", "RentalStatusDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ShippedConditionDesc = new javax.xml.namespace.QName( "", "ShippedConditionDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EventInfo = new javax.xml.namespace.QName( "", "EventInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_PoliceReportNo = new javax.xml.namespace.QName( "", "com.iso_PoliceReportNo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComIso_ImpoundInfo = new javax.xml.namespace.QName( "", "com.iso_ImpoundInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ImpoundAgencyRef = new javax.xml.namespace.QName( "", "ImpoundAgencyRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ImpoundFacilityRef = new javax.xml.namespace.QName( "", "ImpoundFacilityRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PortOriginRef = new javax.xml.namespace.QName( "", "PortOriginRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.AutoInvestigationInfo" );
    }
  };

  public AutoInvestigationInfo() {
    super( 611449725, TYPE.get() );
  }

  private AutoInvestigationInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 611449725, state );
  }

  protected AutoInvestigationInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AutoInvestigationInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.AutoInvestigationInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.AutoInvestigationInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDeliveryDestinationDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DeliveryDestinationDesc" );
  }


  public final void setDeliveryDestinationDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DeliveryDestinationDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_DeliveryDestinationDesc getDeliveryDestinationDesc_elem() {
    return (xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_DeliveryDestinationDesc) TYPE.get().getPropertyValue( this, "_DeliveryDestinationDesc_elem" );
  }


  public final void setDeliveryDestinationDesc_elem( xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_DeliveryDestinationDesc value ) {
    TYPE.get().setPropertyValue( this, "_DeliveryDestinationDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRentalStatusCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RentalStatusCd" );
  }


  public final void setRentalStatusCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RentalStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_RentalStatusCd getRentalStatusCd_elem() {
    return (xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_RentalStatusCd) TYPE.get().getPropertyValue( this, "_RentalStatusCd_elem" );
  }


  public final void setRentalStatusCd_elem( xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_RentalStatusCd value ) {
    TYPE.get().setPropertyValue( this, "_RentalStatusCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRentalStatusDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RentalStatusDt" );
  }


  public final void setRentalStatusDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RentalStatusDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_RentalStatusDt getRentalStatusDt_elem() {
    return (xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_RentalStatusDt) TYPE.get().getPropertyValue( this, "_RentalStatusDt_elem" );
  }


  public final void setRentalStatusDt_elem( xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_RentalStatusDt value ) {
    TYPE.get().setPropertyValue( this, "_RentalStatusDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getShippedConditionDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ShippedConditionDesc" );
  }


  public final void setShippedConditionDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ShippedConditionDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_ShippedConditionDesc getShippedConditionDesc_elem() {
    return (xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_ShippedConditionDesc) TYPE.get().getPropertyValue( this, "_ShippedConditionDesc_elem" );
  }


  public final void setShippedConditionDesc_elem( xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_ShippedConditionDesc value ) {
    TYPE.get().setPropertyValue( this, "_ShippedConditionDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.resp.EventInfo> getEventInfo() {
    return (java.util.List<xsd.iso.resp.EventInfo>) TYPE.get().getPropertyValue( this, "_EventInfo" );
  }


  public final void setEventInfo( java.util.List<xsd.iso.resp.EventInfo> value ) {
    TYPE.get().setPropertyValue( this, "_EventInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_PoliceReportNo() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_PoliceReportNo" );
  }


  public final void setComIso_PoliceReportNo( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_PoliceReportNo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_ComIso_PoliceReportNo getComIso_PoliceReportNo_elem() {
    return (xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_ComIso_PoliceReportNo) TYPE.get().getPropertyValue( this, "_ComIso_PoliceReportNo_elem" );
  }


  public final void setComIso_PoliceReportNo_elem( xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_ComIso_PoliceReportNo value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_PoliceReportNo_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComIso_ImpoundInfo() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ComIso_ImpoundInfo" );
  }


  public final void setComIso_ImpoundInfo( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_ImpoundInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_ComIso_ImpoundInfo getComIso_ImpoundInfo_elem() {
    return (xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_ComIso_ImpoundInfo) TYPE.get().getPropertyValue( this, "_ComIso_ImpoundInfo_elem" );
  }


  public final void setComIso_ImpoundInfo_elem( xsd.iso.resp.anonymous.elements.AutoInvestigationInfo_ComIso_ImpoundInfo value ) {
    TYPE.get().setPropertyValue( this, "_ComIso_ImpoundInfo_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getImpoundAgencyRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_ImpoundAgencyRef" );
  }


  public final void setImpoundAgencyRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_ImpoundAgencyRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getImpoundFacilityRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_ImpoundFacilityRef" );
  }


  public final void setImpoundFacilityRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_ImpoundFacilityRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getPortOriginRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_PortOriginRef" );
  }


  public final void setPortOriginRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_PortOriginRef", value );
  }

}