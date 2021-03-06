/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CommlVehFleetInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommlVehFleetInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehsOwned = new javax.xml.namespace.QName( "", "NumVehsOwned", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehsIntermediateRadius = new javax.xml.namespace.QName( "", "NumVehsIntermediateRadius", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehsLocalRadius = new javax.xml.namespace.QName( "", "NumVehsLocalRadius", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehsLongDistanceRadius = new javax.xml.namespace.QName( "", "NumVehsLongDistanceRadius", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehsLongTermLeased = new javax.xml.namespace.QName( "", "NumVehsLongTermLeased", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehsNonOwned = new javax.xml.namespace.QName( "", "NumVehsNonOwned", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehsTripLeased = new javax.xml.namespace.QName( "", "NumVehsTripLeased", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PropertyHauledDesc = new javax.xml.namespace.QName( "", "PropertyHauledDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RadiusUse = new javax.xml.namespace.QName( "", "RadiusUse", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TerritoryCd = new javax.xml.namespace.QName( "", "TerritoryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_VehTypeCd = new javax.xml.namespace.QName( "", "VehTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehs = new javax.xml.namespace.QName( "", "NumVehs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumVehLeased = new javax.xml.namespace.QName( "", "NumVehLeased", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_OtherOrPriorPolicyRef = new javax.xml.namespace.QName( "", "OtherOrPriorPolicyRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CommlVehFleetInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommlVehFleetInfo_Type" );
    }
  };

  public CommlVehFleetInfo() {
    super( 2121184143, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CommlVehFleetInfo_Type() );
  }

  public CommlVehFleetInfo( xsd.acord.types.complex.CommlVehFleetInfo_Type typeInstance ) {
    super( 2121184143, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CommlVehFleetInfo( gw.internal.xml.XmlElementState state ) {
    super( 2121184143, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CommlVehFleetInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CommlVehFleetInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CommlVehFleetInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CommlVehFleetInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CommlVehFleetInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CommlVehFleetInfo.class );
  }

  public static xsd.acord.CommlVehFleetInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CommlVehFleetInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehsOwned() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsOwned" );
  }


  public final void setNumVehsOwned( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsOwned", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehsOwned getNumVehsOwned_elem() {
    return (xsd.acord.NumVehsOwned) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsOwned_elem" );
  }


  public final void setNumVehsOwned_elem( xsd.acord.NumVehsOwned value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsOwned_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehsIntermediateRadius() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsIntermediateRadius" );
  }


  public final void setNumVehsIntermediateRadius( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsIntermediateRadius", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehsIntermediateRadius getNumVehsIntermediateRadius_elem() {
    return (xsd.acord.NumVehsIntermediateRadius) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsIntermediateRadius_elem" );
  }


  public final void setNumVehsIntermediateRadius_elem( xsd.acord.NumVehsIntermediateRadius value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsIntermediateRadius_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehsLocalRadius() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsLocalRadius" );
  }


  public final void setNumVehsLocalRadius( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsLocalRadius", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehsLocalRadius getNumVehsLocalRadius_elem() {
    return (xsd.acord.NumVehsLocalRadius) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsLocalRadius_elem" );
  }


  public final void setNumVehsLocalRadius_elem( xsd.acord.NumVehsLocalRadius value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsLocalRadius_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehsLongDistanceRadius() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsLongDistanceRadius" );
  }


  public final void setNumVehsLongDistanceRadius( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsLongDistanceRadius", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehsLongDistanceRadius getNumVehsLongDistanceRadius_elem() {
    return (xsd.acord.NumVehsLongDistanceRadius) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsLongDistanceRadius_elem" );
  }


  public final void setNumVehsLongDistanceRadius_elem( xsd.acord.NumVehsLongDistanceRadius value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsLongDistanceRadius_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehsLongTermLeased() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsLongTermLeased" );
  }


  public final void setNumVehsLongTermLeased( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsLongTermLeased", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehsLongTermLeased getNumVehsLongTermLeased_elem() {
    return (xsd.acord.NumVehsLongTermLeased) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsLongTermLeased_elem" );
  }


  public final void setNumVehsLongTermLeased_elem( xsd.acord.NumVehsLongTermLeased value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsLongTermLeased_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehsNonOwned() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsNonOwned" );
  }


  public final void setNumVehsNonOwned( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsNonOwned", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehsNonOwned getNumVehsNonOwned_elem() {
    return (xsd.acord.NumVehsNonOwned) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsNonOwned_elem" );
  }


  public final void setNumVehsNonOwned_elem( xsd.acord.NumVehsNonOwned value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsNonOwned_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehsTripLeased() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsTripLeased" );
  }


  public final void setNumVehsTripLeased( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsTripLeased", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehsTripLeased getNumVehsTripLeased_elem() {
    return (xsd.acord.NumVehsTripLeased) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehsTripLeased_elem" );
  }


  public final void setNumVehsTripLeased_elem( xsd.acord.NumVehsTripLeased value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehsTripLeased_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPropertyHauledDesc() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyHauledDesc" );
  }


  public final void setPropertyHauledDesc( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyHauledDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PropertyHauledDesc getPropertyHauledDesc_elem() {
    return (xsd.acord.PropertyHauledDesc) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PropertyHauledDesc_elem" );
  }


  public final void setPropertyHauledDesc_elem( xsd.acord.PropertyHauledDesc value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PropertyHauledDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RadiusUse getRadiusUse() {
    return (xsd.acord.RadiusUse) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RadiusUse" );
  }


  public final void setRadiusUse( xsd.acord.RadiusUse value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RadiusUse", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTerritoryCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerritoryCd" );
  }


  public final void setTerritoryCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerritoryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TerritoryCd getTerritoryCd_elem() {
    return (xsd.acord.TerritoryCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerritoryCd_elem" );
  }


  public final void setTerritoryCd_elem( xsd.acord.TerritoryCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerritoryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.VehicleType getVehTypeCd() {
    return (xsd.acord.enums.VehicleType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehTypeCd" );
  }


  public final void setVehTypeCd( xsd.acord.enums.VehicleType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.VehTypeCd getVehTypeCd_elem() {
    return (xsd.acord.VehTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_VehTypeCd_elem" );
  }


  public final void setVehTypeCd_elem( xsd.acord.VehTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_VehTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehs() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehs" );
  }


  public final void setNumVehs( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehs getNumVehs_elem() {
    return (xsd.acord.NumVehs) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehs_elem" );
  }


  public final void setNumVehs_elem( xsd.acord.NumVehs value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehs_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumVehLeased() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehLeased" );
  }


  public final void setNumVehLeased( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehLeased", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumVehLeased getNumVehLeased_elem() {
    return (xsd.acord.NumVehLeased) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumVehLeased_elem" );
  }


  public final void setNumVehLeased_elem( xsd.acord.NumVehLeased value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumVehLeased_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getOtherOrPriorPolicyRef() {
    return (gw.xml.XmlElement) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicyRef" );
  }


  public final void setOtherOrPriorPolicyRef( gw.xml.XmlElement value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OtherOrPriorPolicyRef", value );
  }
}
