/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CCPolicy_RiskUnits extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "RiskUnits", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ccintegration", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClassCode = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "ClassCode", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Coverages = new javax.xml.namespace.QName( "http://guidewire.com/pc/ccintegration", "Coverages", "tns" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_PolicySystemID = new javax.xml.namespace.QName( "", "PolicySystemID", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_RUNumber = new javax.xml.namespace.QName( "", "RUNumber", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPolicy_RiskUnits" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.entities.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCRiskUnit" );
    }
  };

  public CCPolicy_RiskUnits() {
    super( -1273042551, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCRiskUnit() );
  }

  public CCPolicy_RiskUnits( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCRiskUnit typeInstance ) {
    super( -1273042551, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CCPolicy_RiskUnits( gw.internal.xml.XmlElementState state ) {
    super( -1273042551, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCPolicy_RiskUnits> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCRiskUnit get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCRiskUnit.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCRiskUnit typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getClassCode() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClassCode" );
  }


  public final void setClassCode( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClassCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCRiskUnit_ClassCode getClassCode_elem() {
    return (wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCRiskUnit_ClassCode) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ClassCode_elem" );
  }


  public final void setClassCode_elem( wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCRiskUnit_ClassCode value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ClassCode_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCRiskUnit_Coverages> getCoverages() {
    return (java.util.List<wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCRiskUnit_Coverages>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Coverages" );
  }


  public final void setCoverages( java.util.List<wsi.remote.gw.webservice.pc.pc900.entities.anonymous.elements.CCRiskUnit_Coverages> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Coverages", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPolicySystemID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PolicySystemID" );
  }


  public final void setPolicySystemID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PolicySystemID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getRUNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RUNumber" );
  }


  public final void setRUNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RUNumber", value );
  }
}
