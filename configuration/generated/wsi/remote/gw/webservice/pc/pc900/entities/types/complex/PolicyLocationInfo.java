/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.entities.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PolicyLocationInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "PolicyLocationInfo", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ccintegration", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyLocationAddress = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "PolicyLocationAddress", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PNIAddressFields = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "PNIAddressFields", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TotalInsuredValues = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "TotalInsuredValues", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicyNumber = new javax.xml.namespace.QName( "", "PolicyNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_ProductCode = new javax.xml.namespace.QName( "", "ProductCode", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicyLocationLatitude = new javax.xml.namespace.QName( "", "PolicyLocationLatitude", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicyLocationLongitude = new javax.xml.namespace.QName( "", "PolicyLocationLongitude", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicyLocationGeocodeStatus = new javax.xml.namespace.QName( "", "PolicyLocationGeocodeStatus", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicyLocationPolicySystemID = new javax.xml.namespace.QName( "", "PolicyLocationPolicySystemID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PNIName = new javax.xml.namespace.QName( "", "PNIName", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PNIPhoneCountry = new javax.xml.namespace.QName( "", "PNIPhoneCountry", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PNIPhoneNumber = new javax.xml.namespace.QName( "", "PNIPhoneNumber", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PNIPhoneExtension = new javax.xml.namespace.QName( "", "PNIPhoneExtension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PNIEmail = new javax.xml.namespace.QName( "", "PNIEmail", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.entities.types.complex.PolicyLocationInfo" );
    }
  };

  public PolicyLocationInfo() {
    super( -1221994680, TYPE.get() );
  }

  private PolicyLocationInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1221994680, state );
  }

  protected PolicyLocationInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PolicyLocationInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.entities.types.complex.PolicyLocationInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc900.entities.types.complex.PolicyLocationInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_PolicyLocationAddress getPolicyLocationAddress() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_PolicyLocationAddress) TYPE.get().getPropertyValue( this, "_PolicyLocationAddress" );
  }


  public final void setPolicyLocationAddress( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_PolicyLocationAddress value ) {
    TYPE.get().setPropertyValue( this, "_PolicyLocationAddress", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_PNIAddressFields getPNIAddressFields() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_PNIAddressFields) TYPE.get().getPropertyValue( this, "_PNIAddressFields" );
  }


  public final void setPNIAddressFields( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_PNIAddressFields value ) {
    TYPE.get().setPropertyValue( this, "_PNIAddressFields", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_TotalInsuredValues> getTotalInsuredValues() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_TotalInsuredValues>) TYPE.get().getPropertyValue( this, "_TotalInsuredValues" );
  }


  public final void setTotalInsuredValues( java.util.List<wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.PolicyLocationInfo_TotalInsuredValues> value ) {
    TYPE.get().setPropertyValue( this, "_TotalInsuredValues", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyNumber" );
  }


  public final void setPolicyNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProductCode() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProductCode" );
  }


  public final void setProductCode( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProductCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyLocationLatitude() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyLocationLatitude" );
  }


  public final void setPolicyLocationLatitude( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyLocationLatitude", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyLocationLongitude() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyLocationLongitude" );
  }


  public final void setPolicyLocationLongitude( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyLocationLongitude", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyLocationGeocodeStatus() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyLocationGeocodeStatus" );
  }


  public final void setPolicyLocationGeocodeStatus( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyLocationGeocodeStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicyLocationPolicySystemID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PolicyLocationPolicySystemID" );
  }


  public final void setPolicyLocationPolicySystemID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PolicyLocationPolicySystemID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPNIName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PNIName" );
  }


  public final void setPNIName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PNIName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPNIPhoneCountry() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PNIPhoneCountry" );
  }


  public final void setPNIPhoneCountry( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PNIPhoneCountry", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPNIPhoneNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PNIPhoneNumber" );
  }


  public final void setPNIPhoneNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PNIPhoneNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPNIPhoneExtension() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PNIPhoneExtension" );
  }


  public final void setPNIPhoneExtension( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PNIPhoneExtension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPNIEmail() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PNIEmail" );
  }


  public final void setPNIEmail( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PNIEmail", value );
  }

}
