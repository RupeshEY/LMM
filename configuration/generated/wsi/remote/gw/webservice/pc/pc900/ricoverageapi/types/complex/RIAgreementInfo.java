/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.ricoverageapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RIAgreementInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "RIAgreementInfo", "pogo2" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AgreementNumber = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "AgreementNumber", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttachmentPoint = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "AttachmentPoint", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttachmentPointIndexed = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "AttachmentPointIndexed", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CededShare = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "CededShare", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Comments = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "Comments", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Currency = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "Currency", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Draft = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "Draft", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDate = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "EffectiveDate", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExpirationDate = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "ExpirationDate", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Name = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "Name", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NotificationThreshold = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "NotificationThreshold", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProportionalPercentage = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "ProportionalPercentage", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RecoveryLimit = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "RecoveryLimit", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TopOfLayer = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "TopOfLayer", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TopOfLayerIndexed = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "TopOfLayerIndexed", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Type = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/reinsurance/RIAgreementInfo", "Type", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.ricoverageapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.ricoverageapi.types.complex.RIAgreementInfo" );
    }
  };

  public RIAgreementInfo() {
    super( -1120667634, TYPE.get() );
  }

  private RIAgreementInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1120667634, state );
  }

  protected RIAgreementInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RIAgreementInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.ricoverageapi.types.complex.RIAgreementInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc900.ricoverageapi.types.complex.RIAgreementInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAgreementNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AgreementNumber" );
  }


  public final void setAgreementNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AgreementNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_AgreementNumber getAgreementNumber_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_AgreementNumber) TYPE.get().getPropertyValue( this, "_AgreementNumber_elem" );
  }


  public final void setAgreementNumber_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_AgreementNumber value ) {
    TYPE.get().setPropertyValue( this, "_AgreementNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.pl.currency.MonetaryAmount getAttachmentPoint() {
    return (gw.pl.currency.MonetaryAmount) TYPE.get().getPropertyValue( this, "_AttachmentPoint" );
  }


  public final void setAttachmentPoint( gw.pl.currency.MonetaryAmount value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentPoint", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_AttachmentPoint getAttachmentPoint_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_AttachmentPoint) TYPE.get().getPropertyValue( this, "_AttachmentPoint_elem" );
  }


  public final void setAttachmentPoint_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_AttachmentPoint value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentPoint_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAttachmentPointIndexed() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_AttachmentPointIndexed" );
  }


  public final void setAttachmentPointIndexed( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentPointIndexed", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_AttachmentPointIndexed getAttachmentPointIndexed_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_AttachmentPointIndexed) TYPE.get().getPropertyValue( this, "_AttachmentPointIndexed_elem" );
  }


  public final void setAttachmentPointIndexed_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_AttachmentPointIndexed value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentPointIndexed_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getCededShare() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_CededShare" );
  }


  public final void setCededShare( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_CededShare", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_CededShare getCededShare_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_CededShare) TYPE.get().getPropertyValue( this, "_CededShare_elem" );
  }


  public final void setCededShare_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_CededShare value ) {
    TYPE.get().setPropertyValue( this, "_CededShare_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getComments() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Comments" );
  }


  public final void setComments( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Comments", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Comments getComments_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Comments) TYPE.get().getPropertyValue( this, "_Comments_elem" );
  }


  public final void setComments_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Comments value ) {
    TYPE.get().setPropertyValue( this, "_Comments_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.enums.Currency getCurrency() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.enums.Currency) TYPE.get().getPropertyValue( this, "_Currency" );
  }


  public final void setCurrency( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.enums.Currency value ) {
    TYPE.get().setPropertyValue( this, "_Currency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Currency getCurrency_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Currency) TYPE.get().getPropertyValue( this, "_Currency_elem" );
  }


  public final void setCurrency_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Currency value ) {
    TYPE.get().setPropertyValue( this, "_Currency_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getDraft() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_Draft" );
  }


  public final void setDraft( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_Draft", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Draft getDraft_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Draft) TYPE.get().getPropertyValue( this, "_Draft_elem" );
  }


  public final void setDraft_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Draft value ) {
    TYPE.get().setPropertyValue( this, "_Draft_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getEffectiveDate() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_EffectiveDate" );
  }


  public final void setEffectiveDate( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_EffectiveDate getEffectiveDate_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_EffectiveDate) TYPE.get().getPropertyValue( this, "_EffectiveDate_elem" );
  }


  public final void setEffectiveDate_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_EffectiveDate value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getExpirationDate() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_ExpirationDate" );
  }


  public final void setExpirationDate( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_ExpirationDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_ExpirationDate getExpirationDate_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_ExpirationDate) TYPE.get().getPropertyValue( this, "_ExpirationDate_elem" );
  }


  public final void setExpirationDate_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_ExpirationDate value ) {
    TYPE.get().setPropertyValue( this, "_ExpirationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Name" );
  }


  public final void setName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Name", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Name getName_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Name) TYPE.get().getPropertyValue( this, "_Name_elem" );
  }


  public final void setName_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Name value ) {
    TYPE.get().setPropertyValue( this, "_Name_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.pl.currency.MonetaryAmount getNotificationThreshold() {
    return (gw.pl.currency.MonetaryAmount) TYPE.get().getPropertyValue( this, "_NotificationThreshold" );
  }


  public final void setNotificationThreshold( gw.pl.currency.MonetaryAmount value ) {
    TYPE.get().setPropertyValue( this, "_NotificationThreshold", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_NotificationThreshold getNotificationThreshold_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_NotificationThreshold) TYPE.get().getPropertyValue( this, "_NotificationThreshold_elem" );
  }


  public final void setNotificationThreshold_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_NotificationThreshold value ) {
    TYPE.get().setPropertyValue( this, "_NotificationThreshold_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getProportionalPercentage() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_ProportionalPercentage" );
  }


  public final void setProportionalPercentage( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_ProportionalPercentage", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_ProportionalPercentage getProportionalPercentage_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_ProportionalPercentage) TYPE.get().getPropertyValue( this, "_ProportionalPercentage_elem" );
  }


  public final void setProportionalPercentage_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_ProportionalPercentage value ) {
    TYPE.get().setPropertyValue( this, "_ProportionalPercentage_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.pl.currency.MonetaryAmount getRecoveryLimit() {
    return (gw.pl.currency.MonetaryAmount) TYPE.get().getPropertyValue( this, "_RecoveryLimit" );
  }


  public final void setRecoveryLimit( gw.pl.currency.MonetaryAmount value ) {
    TYPE.get().setPropertyValue( this, "_RecoveryLimit", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_RecoveryLimit getRecoveryLimit_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_RecoveryLimit) TYPE.get().getPropertyValue( this, "_RecoveryLimit_elem" );
  }


  public final void setRecoveryLimit_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_RecoveryLimit value ) {
    TYPE.get().setPropertyValue( this, "_RecoveryLimit_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.pl.currency.MonetaryAmount getTopOfLayer() {
    return (gw.pl.currency.MonetaryAmount) TYPE.get().getPropertyValue( this, "_TopOfLayer" );
  }


  public final void setTopOfLayer( gw.pl.currency.MonetaryAmount value ) {
    TYPE.get().setPropertyValue( this, "_TopOfLayer", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_TopOfLayer getTopOfLayer_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_TopOfLayer) TYPE.get().getPropertyValue( this, "_TopOfLayer_elem" );
  }


  public final void setTopOfLayer_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_TopOfLayer value ) {
    TYPE.get().setPropertyValue( this, "_TopOfLayer_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getTopOfLayerIndexed() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_TopOfLayerIndexed" );
  }


  public final void setTopOfLayerIndexed( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_TopOfLayerIndexed", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_TopOfLayerIndexed getTopOfLayerIndexed_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_TopOfLayerIndexed) TYPE.get().getPropertyValue( this, "_TopOfLayerIndexed_elem" );
  }


  public final void setTopOfLayerIndexed_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_TopOfLayerIndexed value ) {
    TYPE.get().setPropertyValue( this, "_TopOfLayerIndexed_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.enums.RIAgreement getType() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.enums.RIAgreement) TYPE.get().getPropertyValue( this, "_Type" );
  }


  public final void setType( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.enums.RIAgreement value ) {
    TYPE.get().setPropertyValue( this, "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Type getType_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Type) TYPE.get().getPropertyValue( this, "_Type_elem" );
  }


  public final void setType_elem( wsi.remote.gw.webservice.pc.pc900.ricoverageapi.anonymous.elements.RIAgreementInfo_Type value ) {
    TYPE.get().setPropertyValue( this, "_Type_elem", value );
  }

}
