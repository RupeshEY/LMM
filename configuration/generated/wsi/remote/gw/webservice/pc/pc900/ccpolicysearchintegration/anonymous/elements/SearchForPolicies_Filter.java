/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SearchForPolicies_Filter extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/CCPolicySearchIntegration", "filter", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/CCPolicySearchIntegration", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DriverLastNames = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "DriverLastNames", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LicensePlates = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "LicensePlates", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PolicySystemIDs = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "PolicySystemIDs", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PostalCodes = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "PostalCodes", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VINS = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "VINS", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.anonymous.elements.SearchForPolicies_Filter" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.util.SchemaAccess ).getSchemaIndex().findTypeData( "wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria", "wsi.remote.gw.webservice.pc.pc900.entities" );
    }
  };

  public SearchForPolicies_Filter() {
    super( -797793221, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria() );
  }

  public SearchForPolicies_Filter( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria typeInstance ) {
    super( -797793221, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SearchForPolicies_Filter( gw.internal.xml.XmlElementState state ) {
    super( -797793221, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.anonymous.elements.SearchForPolicies_Filter> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_DriverLastNames getDriverLastNames() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_DriverLastNames) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DriverLastNames" );
  }


  public final void setDriverLastNames( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_DriverLastNames value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DriverLastNames", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_LicensePlates getLicensePlates() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_LicensePlates) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LicensePlates" );
  }


  public final void setLicensePlates( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_LicensePlates value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LicensePlates", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PolicySystemIDs getPolicySystemIDs() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PolicySystemIDs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicySystemIDs" );
  }


  public final void setPolicySystemIDs( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PolicySystemIDs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicySystemIDs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PostalCodes getPostalCodes() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PostalCodes) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PostalCodes" );
  }


  public final void setPostalCodes( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_PostalCodes value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PostalCodes", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_VINS getVINS() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_VINS) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VINS" );
  }


  public final void setVINS( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPCFilteringCriteria_VINS value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VINS", value );
  }
}
