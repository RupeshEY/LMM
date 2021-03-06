/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ShareHoldersInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ShareHoldersInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumSharesHeld = new javax.xml.namespace.QName( "", "NumSharesHeld", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SharesHeldPct = new javax.xml.namespace.QName( "", "SharesHeldPct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DirectorOrOfficerInd = new javax.xml.namespace.QName( "", "DirectorOrOfficerInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BoardDirectorsRepInd = new javax.xml.namespace.QName( "", "BoardDirectorsRepInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.ShareHoldersInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ShareHoldersInfo_Type" );
    }
  };

  public ShareHoldersInfo() {
    super( 909234602, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.ShareHoldersInfo_Type() );
  }

  public ShareHoldersInfo( xsd.acord.types.complex.ShareHoldersInfo_Type typeInstance ) {
    super( 909234602, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ShareHoldersInfo( gw.internal.xml.XmlElementState state ) {
    super( 909234602, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.ShareHoldersInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.ShareHoldersInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.ShareHoldersInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.ShareHoldersInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.ShareHoldersInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.ShareHoldersInfo.class );
  }

  public static xsd.acord.ShareHoldersInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.ShareHoldersInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MiscParty getMiscParty() {
    return (xsd.acord.MiscParty) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MiscParty" );
  }


  public final void setMiscParty( xsd.acord.MiscParty value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MiscParty", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumSharesHeld() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumSharesHeld" );
  }


  public final void setNumSharesHeld( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumSharesHeld", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumSharesHeld getNumSharesHeld_elem() {
    return (xsd.acord.NumSharesHeld) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumSharesHeld_elem" );
  }


  public final void setNumSharesHeld_elem( xsd.acord.NumSharesHeld value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumSharesHeld_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getSharesHeldPct() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SharesHeldPct" );
  }


  public final void setSharesHeldPct( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SharesHeldPct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SharesHeldPct getSharesHeldPct_elem() {
    return (xsd.acord.SharesHeldPct) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SharesHeldPct_elem" );
  }


  public final void setSharesHeldPct_elem( xsd.acord.SharesHeldPct value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SharesHeldPct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getDirectorOrOfficerInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DirectorOrOfficerInd" );
  }


  public final void setDirectorOrOfficerInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DirectorOrOfficerInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DirectorOrOfficerInd getDirectorOrOfficerInd_elem() {
    return (xsd.acord.DirectorOrOfficerInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DirectorOrOfficerInd_elem" );
  }


  public final void setDirectorOrOfficerInd_elem( xsd.acord.DirectorOrOfficerInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DirectorOrOfficerInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getBoardDirectorsRepInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BoardDirectorsRepInd" );
  }


  public final void setBoardDirectorsRepInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BoardDirectorsRepInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BoardDirectorsRepInd getBoardDirectorsRepInd_elem() {
    return (xsd.acord.BoardDirectorsRepInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BoardDirectorsRepInd_elem" );
  }


  public final void setBoardDirectorsRepInd_elem( xsd.acord.BoardDirectorsRepInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BoardDirectorsRepInd_elem", value );
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
