/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GetNumberOfClaims_Criteria extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/PCClaimSearchIntegrationAPI", "criteria", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/PCClaimSearchIntegrationAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BeginDate = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaimSearchCriteria", "BeginDate", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndDate = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaimSearchCriteria", "EndDate", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Lob = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaimSearchCriteria", "Lob", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumbers = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaimSearchCriteria", "PolicyNumbers", "pogo" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaimSearchCriteria", "Status", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.GetNumberOfClaims_Criteria" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria" );
    }
  };

  public GetNumberOfClaims_Criteria() {
    super( -1668984301, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria() );
  }

  public GetNumberOfClaims_Criteria( wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria typeInstance ) {
    super( -1668984301, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GetNumberOfClaims_Criteria( gw.internal.xml.XmlElementState state ) {
    super( -1668984301, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.GetNumberOfClaims_Criteria> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.types.complex.PCClaimSearchCriteria typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getBeginDate() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BeginDate" );
  }


  public final void setBeginDate( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BeginDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_BeginDate getBeginDate_elem() {
    return (wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_BeginDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BeginDate_elem" );
  }


  public final void setBeginDate_elem( wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_BeginDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BeginDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getEndDate() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndDate" );
  }


  public final void setEndDate( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_EndDate getEndDate_elem() {
    return (wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_EndDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EndDate_elem" );
  }


  public final void setEndDate_elem( wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_EndDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EndDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLob() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Lob" );
  }


  public final void setLob( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Lob", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_Lob getLob_elem() {
    return (wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_Lob) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Lob_elem" );
  }


  public final void setLob_elem( wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_Lob value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Lob_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_PolicyNumbers getPolicyNumbers() {
    return (wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_PolicyNumbers) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyNumbers" );
  }


  public final void setPolicyNumbers( wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_PolicyNumbers value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyNumbers", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStatus() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Status" );
  }


  public final void setStatus( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_Status getStatus_elem() {
    return (wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_Status) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Status_elem" );
  }


  public final void setStatus_elem( wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_Status value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Status_elem", value );
  }
}
