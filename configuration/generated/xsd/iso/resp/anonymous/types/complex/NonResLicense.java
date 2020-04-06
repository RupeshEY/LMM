/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class NonResLicense extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonResProducerLicenseNumber = new javax.xml.namespace.QName( "", "NonResProducerLicenseNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NonResProducerLicenseExpirationDt = new javax.xml.namespace.QName( "", "NonResProducerLicenseExpirationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.NonResLicense" );
    }
  };

  public NonResLicense() {
    super( 1246507210, TYPE.get() );
  }

  private NonResLicense( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1246507210, state );
  }

  protected NonResLicense( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected NonResLicense( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.NonResLicense> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.NonResLicense get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNonResProducerLicenseNumber() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NonResProducerLicenseNumber" );
  }


  public final void setNonResProducerLicenseNumber( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NonResProducerLicenseNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.NonResLicense_NonResProducerLicenseNumber getNonResProducerLicenseNumber_elem() {
    return (xsd.iso.resp.anonymous.elements.NonResLicense_NonResProducerLicenseNumber) TYPE.get().getPropertyValue( this, "_NonResProducerLicenseNumber_elem" );
  }


  public final void setNonResProducerLicenseNumber_elem( xsd.iso.resp.anonymous.elements.NonResLicense_NonResProducerLicenseNumber value ) {
    TYPE.get().setPropertyValue( this, "_NonResProducerLicenseNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNonResProducerLicenseExpirationDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NonResProducerLicenseExpirationDt" );
  }


  public final void setNonResProducerLicenseExpirationDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NonResProducerLicenseExpirationDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.NonResLicense_NonResProducerLicenseExpirationDt getNonResProducerLicenseExpirationDt_elem() {
    return (xsd.iso.resp.anonymous.elements.NonResLicense_NonResProducerLicenseExpirationDt) TYPE.get().getPropertyValue( this, "_NonResProducerLicenseExpirationDt_elem" );
  }


  public final void setNonResProducerLicenseExpirationDt_elem( xsd.iso.resp.anonymous.elements.NonResLicense_NonResProducerLicenseExpirationDt value ) {
    TYPE.get().setPropertyValue( this, "_NonResProducerLicenseExpirationDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.NonResLicense_StateProvCd getStateProvCd_elem() {
    return (xsd.iso.resp.anonymous.elements.NonResLicense_StateProvCd) TYPE.get().getPropertyValue( this, "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.iso.resp.anonymous.elements.NonResLicense_StateProvCd value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}