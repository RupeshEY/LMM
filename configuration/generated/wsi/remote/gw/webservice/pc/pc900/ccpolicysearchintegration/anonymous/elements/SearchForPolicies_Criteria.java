/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SearchForPolicies_Criteria extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/CCPolicySearchIntegration", "criteria", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/CCPolicySearchIntegration", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AccountNumber = new javax.xml.namespace.QName( "", "AccountNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AsOfDate = new javax.xml.namespace.QName( "", "AsOfDate", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CompanyName = new javax.xml.namespace.QName( "", "CompanyName", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CompanyNameKanji = new javax.xml.namespace.QName( "", "CompanyNameKanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FirstName = new javax.xml.namespace.QName( "", "FirstName", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_FirstNameKanji = new javax.xml.namespace.QName( "", "FirstNameKanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_IncludeArchived = new javax.xml.namespace.QName( "", "IncludeArchived", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LastName = new javax.xml.namespace.QName( "", "LastName", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LastNameKanji = new javax.xml.namespace.QName( "", "LastNameKanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NonRenewalCode = new javax.xml.namespace.QName( "", "NonRenewalCode", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicyStatus = new javax.xml.namespace.QName( "", "PolicyStatus", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PrimaryInsuredCity = new javax.xml.namespace.QName( "", "PrimaryInsuredCity", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PrimaryInsuredCityKanji = new javax.xml.namespace.QName( "", "PrimaryInsuredCityKanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PrimaryInsuredCountry = new javax.xml.namespace.QName( "", "PrimaryInsuredCountry", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PrimaryInsuredPostalCode = new javax.xml.namespace.QName( "", "PrimaryInsuredPostalCode", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PrimaryInsuredState = new javax.xml.namespace.QName( "", "PrimaryInsuredState", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ProducerCodeString = new javax.xml.namespace.QName( "", "ProducerCodeString", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ProducerString = new javax.xml.namespace.QName( "", "ProducerString", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ProductCode = new javax.xml.namespace.QName( "", "ProductCode", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_TaxID = new javax.xml.namespace.QName( "", "TaxID", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.anonymous.elements.SearchForPolicies_Criteria" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.util.SchemaAccess ).getSchemaIndex().findTypeData( "wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCSearchCriteria", "wsi.remote.gw.webservice.pc.pc900.entities" );
    }
  };

  public SearchForPolicies_Criteria() {
    super( 498111330, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCSearchCriteria() );
  }

  public SearchForPolicies_Criteria( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCSearchCriteria typeInstance ) {
    super( 498111330, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SearchForPolicies_Criteria( gw.internal.xml.XmlElementState state ) {
    super( 498111330, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.anonymous.elements.SearchForPolicies_Criteria> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCSearchCriteria get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCSearchCriteria.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCSearchCriteria typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAccountNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AccountNumber" );
  }


  public final void setAccountNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AccountNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getAsOfDate() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AsOfDate" );
  }


  public final void setAsOfDate( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AsOfDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCompanyName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CompanyName" );
  }


  public final void setCompanyName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CompanyName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCompanyNameKanji() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CompanyNameKanji" );
  }


  public final void setCompanyNameKanji( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CompanyNameKanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFirstName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FirstName" );
  }


  public final void setFirstName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FirstName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFirstNameKanji() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FirstNameKanji" );
  }


  public final void setFirstNameKanji( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FirstNameKanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getIncludeArchived() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IncludeArchived" );
  }


  public final void setIncludeArchived( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IncludeArchived", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLastName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LastName" );
  }


  public final void setLastName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LastName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLastNameKanji() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LastNameKanji" );
  }


  public final void setLastNameKanji( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LastNameKanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNonRenewalCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NonRenewalCode" );
  }


  public final void setNonRenewalCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NonRenewalCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyNumber() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyNumber" );
  }


  public final void setPolicyNumber( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyStatus() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyStatus" );
  }


  public final void setPolicyStatus( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrimaryInsuredCity() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrimaryInsuredCity" );
  }


  public final void setPrimaryInsuredCity( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrimaryInsuredCity", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrimaryInsuredCityKanji() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrimaryInsuredCityKanji" );
  }


  public final void setPrimaryInsuredCityKanji( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrimaryInsuredCityKanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrimaryInsuredCountry() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrimaryInsuredCountry" );
  }


  public final void setPrimaryInsuredCountry( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrimaryInsuredCountry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrimaryInsuredPostalCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrimaryInsuredPostalCode" );
  }


  public final void setPrimaryInsuredPostalCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrimaryInsuredPostalCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPrimaryInsuredState() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrimaryInsuredState" );
  }


  public final void setPrimaryInsuredState( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrimaryInsuredState", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProducerCodeString() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProducerCodeString" );
  }


  public final void setProducerCodeString( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProducerCodeString", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProducerString() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProducerString" );
  }


  public final void setProducerString( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProducerString", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProductCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProductCode" );
  }


  public final void setProductCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProductCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTaxID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TaxID" );
  }


  public final void setTaxID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TaxID", value );
  }
}
