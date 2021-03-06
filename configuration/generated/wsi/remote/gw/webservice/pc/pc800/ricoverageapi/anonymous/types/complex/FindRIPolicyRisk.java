/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FindRIPolicyRisk extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicyNumber = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/reinsurance/RICoverageAPI", "policyNumber", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CoverageCode = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/reinsurance/RICoverageAPI", "coverageCode", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Date = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/reinsurance/RICoverageAPI", "date", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc800.ricoverageapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.complex.FindRIPolicyRisk" );
    }
  };

  public FindRIPolicyRisk() {
    super( -2023011834, TYPE.get() );
  }

  private FindRIPolicyRisk( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -2023011834, state );
  }

  protected FindRIPolicyRisk( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FindRIPolicyRisk( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.complex.FindRIPolicyRisk> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.types.complex.FindRIPolicyRisk get$TypeInstance() {
    return this;
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
  public final wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIPolicyRisk_PolicyNumber getPolicyNumber_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIPolicyRisk_PolicyNumber) TYPE.get().getPropertyValue( this, "_PolicyNumber_elem" );
  }


  public final void setPolicyNumber_elem( wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIPolicyRisk_PolicyNumber value ) {
    TYPE.get().setPropertyValue( this, "_PolicyNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCoverageCode() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CoverageCode" );
  }


  public final void setCoverageCode( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CoverageCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIPolicyRisk_CoverageCode getCoverageCode_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIPolicyRisk_CoverageCode) TYPE.get().getPropertyValue( this, "_CoverageCode_elem" );
  }


  public final void setCoverageCode_elem( wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIPolicyRisk_CoverageCode value ) {
    TYPE.get().setPropertyValue( this, "_CoverageCode_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getDate() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_Date" );
  }


  public final void setDate( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_Date", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIPolicyRisk_Date getDate_elem() {
    return (wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIPolicyRisk_Date) TYPE.get().getPropertyValue( this, "_Date_elem" );
  }


  public final void setDate_elem( wsi.remote.gw.webservice.pc.pc800.ricoverageapi.anonymous.elements.FindRIPolicyRisk_Date value ) {
    TYPE.get().setPropertyValue( this, "_Date_elem", value );
  }

}
