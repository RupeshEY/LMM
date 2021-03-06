/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CommunicationsInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommunicationsInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CallLetters = new javax.xml.namespace.QName( "", "CallLetters", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BroadcastOperationTypeCd = new javax.xml.namespace.QName( "", "BroadcastOperationTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BroadcastTypeCd = new javax.xml.namespace.QName( "", "BroadcastTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FallingTowerRangeInd = new javax.xml.namespace.QName( "", "FallingTowerRangeInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LocationEquipmentCd = new javax.xml.namespace.QName( "", "LocationEquipmentCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TowerAntennaInfo = new javax.xml.namespace.QName( "", "TowerAntennaInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CommunicationsInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommunicationsInfo_Type" );
    }
  };

  public CommunicationsInfo() {
    super( -516749793, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CommunicationsInfo_Type() );
  }

  public CommunicationsInfo( xsd.acord.types.complex.CommunicationsInfo_Type typeInstance ) {
    super( -516749793, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CommunicationsInfo( gw.internal.xml.XmlElementState state ) {
    super( -516749793, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CommunicationsInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CommunicationsInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CommunicationsInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CommunicationsInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CommunicationsInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CommunicationsInfo.class );
  }

  public static xsd.acord.CommunicationsInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CommunicationsInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCallLetters() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CallLetters" );
  }


  public final void setCallLetters( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CallLetters", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CallLetters getCallLetters_elem() {
    return (xsd.acord.CallLetters) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CallLetters_elem" );
  }


  public final void setCallLetters_elem( xsd.acord.CallLetters value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CallLetters_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.BroadcastOperation getBroadcastOperationTypeCd() {
    return (xsd.acord.enums.BroadcastOperation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BroadcastOperationTypeCd" );
  }


  public final void setBroadcastOperationTypeCd( xsd.acord.enums.BroadcastOperation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BroadcastOperationTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BroadcastOperationTypeCd getBroadcastOperationTypeCd_elem() {
    return (xsd.acord.BroadcastOperationTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BroadcastOperationTypeCd_elem" );
  }


  public final void setBroadcastOperationTypeCd_elem( xsd.acord.BroadcastOperationTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BroadcastOperationTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.Broadcast getBroadcastTypeCd() {
    return (xsd.acord.enums.Broadcast) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BroadcastTypeCd" );
  }


  public final void setBroadcastTypeCd( xsd.acord.enums.Broadcast value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BroadcastTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BroadcastTypeCd getBroadcastTypeCd_elem() {
    return (xsd.acord.BroadcastTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BroadcastTypeCd_elem" );
  }


  public final void setBroadcastTypeCd_elem( xsd.acord.BroadcastTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BroadcastTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFallingTowerRangeInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FallingTowerRangeInd" );
  }


  public final void setFallingTowerRangeInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FallingTowerRangeInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FallingTowerRangeInd getFallingTowerRangeInd_elem() {
    return (xsd.acord.FallingTowerRangeInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FallingTowerRangeInd_elem" );
  }


  public final void setFallingTowerRangeInd_elem( xsd.acord.FallingTowerRangeInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FallingTowerRangeInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ItemLocation getLocationEquipmentCd() {
    return (xsd.acord.enums.ItemLocation) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocationEquipmentCd" );
  }


  public final void setLocationEquipmentCd( xsd.acord.enums.ItemLocation value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocationEquipmentCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.LocationEquipmentCd getLocationEquipmentCd_elem() {
    return (xsd.acord.LocationEquipmentCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LocationEquipmentCd_elem" );
  }


  public final void setLocationEquipmentCd_elem( xsd.acord.LocationEquipmentCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LocationEquipmentCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.TowerAntennaInfo> getTowerAntennaInfo() {
    return (java.util.List<xsd.acord.TowerAntennaInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TowerAntennaInfo" );
  }


  public final void setTowerAntennaInfo( java.util.List<xsd.acord.TowerAntennaInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TowerAntennaInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}
