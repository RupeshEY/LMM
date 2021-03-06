/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.entities.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CCPCFilteringCriteria extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "CCPCFilteringCriteria", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ccintegration", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DriverLastNames = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "DriverLastNames", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LicensePlates = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "LicensePlates", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicySystemIDs = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "PolicySystemIDs", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PostalCodes = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "PostalCodes", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VINS = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "VINS", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria" );
    }
  };

  public CCPCFilteringCriteria() {
    super( 1378577699, TYPE.get() );
  }

  private CCPCFilteringCriteria( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1378577699, state );
  }

  protected CCPCFilteringCriteria( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CCPCFilteringCriteria( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_DriverLastNames getDriverLastNames() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_DriverLastNames) TYPE.get().getPropertyValue( this, "_DriverLastNames" );
  }


  public final void setDriverLastNames( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_DriverLastNames value ) {
    TYPE.get().setPropertyValue( this, "_DriverLastNames", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_LicensePlates getLicensePlates() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_LicensePlates) TYPE.get().getPropertyValue( this, "_LicensePlates" );
  }


  public final void setLicensePlates( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_LicensePlates value ) {
    TYPE.get().setPropertyValue( this, "_LicensePlates", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PolicySystemIDs getPolicySystemIDs() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PolicySystemIDs) TYPE.get().getPropertyValue( this, "_PolicySystemIDs" );
  }


  public final void setPolicySystemIDs( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PolicySystemIDs value ) {
    TYPE.get().setPropertyValue( this, "_PolicySystemIDs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PostalCodes getPostalCodes() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PostalCodes) TYPE.get().getPropertyValue( this, "_PostalCodes" );
  }


  public final void setPostalCodes( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PostalCodes value ) {
    TYPE.get().setPropertyValue( this, "_PostalCodes", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_VINS getVINS() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_VINS) TYPE.get().getPropertyValue( this, "_VINS" );
  }


  public final void setVINS( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_VINS value ) {
    TYPE.get().setPropertyValue( this, "_VINS", value );
  }

}
