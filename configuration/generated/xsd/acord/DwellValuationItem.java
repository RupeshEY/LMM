/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class DwellValuationItem extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "DwellValuationItem", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnits = new javax.xml.namespace.QName( "", "NumUnits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DetailCost = new javax.xml.namespace.QName( "", "DetailCost", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.DwellValuationItem" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.DwellValuationItem_Type" );
    }
  };

  public DwellValuationItem() {
    super( -982481130, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.DwellValuationItem_Type() );
  }

  public DwellValuationItem( xsd.acord.types.complex.DwellValuationItem_Type typeInstance ) {
    super( -982481130, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private DwellValuationItem( gw.internal.xml.XmlElementState state ) {
    super( -982481130, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.DwellValuationItem> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.DwellValuationItem_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.DwellValuationItem_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.DwellValuationItem_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.DwellValuationItem parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.DwellValuationItem.class );
  }

  public static xsd.acord.DwellValuationItem parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.DwellValuationItem.class );
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
  public final xsd.acord.Description getDescription_elem() {
    return (xsd.acord.Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( xsd.acord.Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNumUnits() {
    return (java.math.BigDecimal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits" );
  }


  public final void setNumUnits( java.math.BigDecimal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumUnits getNumUnits_elem() {
    return (xsd.acord.NumUnits) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumUnits_elem" );
  }


  public final void setNumUnits_elem( xsd.acord.NumUnits value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumUnits_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DetailCost getDetailCost() {
    return (xsd.acord.DetailCost) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DetailCost" );
  }


  public final void setDetailCost( xsd.acord.DetailCost value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DetailCost", value );
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