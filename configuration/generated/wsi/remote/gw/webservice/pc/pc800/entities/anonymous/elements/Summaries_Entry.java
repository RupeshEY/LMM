/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class Summaries_Entry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "Entry", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ccintegration", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Properties = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "Properties", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Vehicles = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "Vehicles", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Address = new javax.xml.namespace.QName( "", "Address", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressLine1 = new javax.xml.namespace.QName( "", "AddressLine1", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressLine1Kanji = new javax.xml.namespace.QName( "", "AddressLine1Kanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressLine2 = new javax.xml.namespace.QName( "", "AddressLine2", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_AddressLine2Kanji = new javax.xml.namespace.QName( "", "AddressLine2Kanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_City = new javax.xml.namespace.QName( "", "City", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CityKanji = new javax.xml.namespace.QName( "", "CityKanji", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_EffectiveDate = new javax.xml.namespace.QName( "", "EffectiveDate", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ExpirationDate = new javax.xml.namespace.QName( "", "ExpirationDate", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_InsuredName = new javax.xml.namespace.QName( "", "InsuredName", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_IsArchived = new javax.xml.namespace.QName( "", "IsArchived", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicyType = new javax.xml.namespace.QName( "", "PolicyType", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PostalCode = new javax.xml.namespace.QName( "", "PostalCode", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CEDEX = new javax.xml.namespace.QName( "", "CEDEX", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_CEDEXBureau = new javax.xml.namespace.QName( "", "CEDEXBureau", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ProducerCode = new javax.xml.namespace.QName( "", "ProducerCode", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_State = new javax.xml.namespace.QName( "", "State", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Status = new javax.xml.namespace.QName( "", "Status", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Summaries_Entry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCPolicySummary" );
    }
  };

  public Summaries_Entry() {
    super( -1376834976, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCPolicySummary() );
  }

  public Summaries_Entry( wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCPolicySummary typeInstance ) {
    super( -1376834976, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private Summaries_Entry( gw.internal.xml.XmlElementState state ) {
    super( -1376834976, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.Summaries_Entry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCPolicySummary get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCPolicySummary.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.pc.pc800.entities.types.complex.CCPolicySummary typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.CCPolicySummary_Properties> getProperties() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.CCPolicySummary_Properties>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Properties" );
  }


  public final void setProperties( java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.CCPolicySummary_Properties> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Properties", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.CCPolicySummary_Vehicles> getVehicles() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.CCPolicySummary_Vehicles>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Vehicles" );
  }


  public final void setVehicles( java.util.List<wsi.remote.gw.webservice.pc.pc800.entities.anonymous.elements.CCPolicySummary_Vehicles> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Vehicles", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddress() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Address" );
  }


  public final void setAddress( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Address", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressLine1() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AddressLine1" );
  }


  public final void setAddressLine1( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AddressLine1", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressLine1Kanji() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AddressLine1Kanji" );
  }


  public final void setAddressLine1Kanji( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AddressLine1Kanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressLine2() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AddressLine2" );
  }


  public final void setAddressLine2( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AddressLine2", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAddressLine2Kanji() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AddressLine2Kanji" );
  }


  public final void setAddressLine2Kanji( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AddressLine2Kanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCity() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_City" );
  }


  public final void setCity( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_City", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCityKanji() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CityKanji" );
  }


  public final void setCityKanji( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CityKanji", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getEffectiveDate() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EffectiveDate" );
  }


  public final void setEffectiveDate( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EffectiveDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getExpirationDate() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExpirationDate" );
  }


  public final void setExpirationDate( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExpirationDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsuredName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_InsuredName" );
  }


  public final void setInsuredName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_InsuredName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getIsArchived() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_IsArchived" );
  }


  public final void setIsArchived( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_IsArchived", value );
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
  public final java.lang.String getPolicyType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicyType" );
  }


  public final void setPolicyType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicyType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPostalCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PostalCode" );
  }


  public final void setPostalCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PostalCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getCEDEX() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CEDEX" );
  }


  public final void setCEDEX( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CEDEX", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCEDEXBureau() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CEDEXBureau" );
  }


  public final void setCEDEXBureau( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CEDEXBureau", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProducerCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ProducerCode" );
  }


  public final void setProducerCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ProducerCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getState() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_State" );
  }


  public final void setState( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_State", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStatus() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Status" );
  }


  public final void setStatus( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Status", value );
  }
}
