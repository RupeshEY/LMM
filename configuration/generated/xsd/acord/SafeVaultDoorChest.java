/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class SafeVaultDoorChest extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SafeVaultDoorChest", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CombinationLockInd = new javax.xml.namespace.QName( "", "CombinationLockInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DoorChestTypeCd = new javax.xml.namespace.QName( "", "DoorChestTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DoorRatingCd = new javax.xml.namespace.QName( "", "DoorRatingCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DoorTypeCd = new javax.xml.namespace.QName( "", "DoorTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RelockingDeviceInd = new javax.xml.namespace.QName( "", "RelockingDeviceInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeLockInd = new javax.xml.namespace.QName( "", "TimeLockInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemDefinition = new javax.xml.namespace.QName( "", "ItemDefinition", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.SafeVaultDoorChest" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SafeVaultDoorChest_Type" );
    }
  };

  public SafeVaultDoorChest() {
    super( -1322483902, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.SafeVaultDoorChest_Type() );
  }

  public SafeVaultDoorChest( xsd.acord.types.complex.SafeVaultDoorChest_Type typeInstance ) {
    super( -1322483902, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private SafeVaultDoorChest( gw.internal.xml.XmlElementState state ) {
    super( -1322483902, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.SafeVaultDoorChest> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.SafeVaultDoorChest_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.SafeVaultDoorChest_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.SafeVaultDoorChest_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.SafeVaultDoorChest parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.SafeVaultDoorChest.class );
  }

  public static xsd.acord.SafeVaultDoorChest parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.SafeVaultDoorChest.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getCombinationLockInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CombinationLockInd" );
  }


  public final void setCombinationLockInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CombinationLockInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CombinationLockInd getCombinationLockInd_elem() {
    return (xsd.acord.CombinationLockInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CombinationLockInd_elem" );
  }


  public final void setCombinationLockInd_elem( xsd.acord.CombinationLockInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CombinationLockInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.DoorChestType getDoorChestTypeCd() {
    return (xsd.acord.enums.DoorChestType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DoorChestTypeCd" );
  }


  public final void setDoorChestTypeCd( xsd.acord.enums.DoorChestType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DoorChestTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DoorChestTypeCd getDoorChestTypeCd_elem() {
    return (xsd.acord.DoorChestTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DoorChestTypeCd_elem" );
  }


  public final void setDoorChestTypeCd_elem( xsd.acord.DoorChestTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DoorChestTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDoorRatingCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DoorRatingCd" );
  }


  public final void setDoorRatingCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DoorRatingCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DoorRatingCd getDoorRatingCd_elem() {
    return (xsd.acord.DoorRatingCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DoorRatingCd_elem" );
  }


  public final void setDoorRatingCd_elem( xsd.acord.DoorRatingCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DoorRatingCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SafeDoorType getDoorTypeCd() {
    return (xsd.acord.enums.SafeDoorType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DoorTypeCd" );
  }


  public final void setDoorTypeCd( xsd.acord.enums.SafeDoorType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DoorTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DoorTypeCd getDoorTypeCd_elem() {
    return (xsd.acord.DoorTypeCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DoorTypeCd_elem" );
  }


  public final void setDoorTypeCd_elem( xsd.acord.DoorTypeCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DoorTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getRelockingDeviceInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RelockingDeviceInd" );
  }


  public final void setRelockingDeviceInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RelockingDeviceInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RelockingDeviceInd getRelockingDeviceInd_elem() {
    return (xsd.acord.RelockingDeviceInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RelockingDeviceInd_elem" );
  }


  public final void setRelockingDeviceInd_elem( xsd.acord.RelockingDeviceInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RelockingDeviceInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getTimeLockInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeLockInd" );
  }


  public final void setTimeLockInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeLockInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TimeLockInd getTimeLockInd_elem() {
    return (xsd.acord.TimeLockInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeLockInd_elem" );
  }


  public final void setTimeLockInd_elem( xsd.acord.TimeLockInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeLockInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ItemDefinition> getItemDefinition() {
    return (java.util.List<xsd.acord.ItemDefinition>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ItemDefinition" );
  }


  public final void setItemDefinition( java.util.List<xsd.acord.ItemDefinition> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ItemDefinition", value );
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