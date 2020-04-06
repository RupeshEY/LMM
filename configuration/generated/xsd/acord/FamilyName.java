/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class FamilyName extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FamilyName", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TitlePrefix = new javax.xml.namespace.QName( "", "TitlePrefix", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FamilyNames = new javax.xml.namespace.QName( "", "FamilyNames", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Surname = new javax.xml.namespace.QName( "", "Surname", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NameSuffix = new javax.xml.namespace.QName( "", "NameSuffix", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.FamilyName" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.FamilyName_Type" );
    }
  };

  public FamilyName() {
    super( 91399299, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.FamilyName_Type() );
  }

  public FamilyName( xsd.acord.types.complex.FamilyName_Type typeInstance ) {
    super( 91399299, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private FamilyName( gw.internal.xml.XmlElementState state ) {
    super( 91399299, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.FamilyName> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.FamilyName_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.FamilyName_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.FamilyName_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.FamilyName parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.FamilyName.class );
  }

  public static xsd.acord.FamilyName parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.FamilyName.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTitlePrefix() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TitlePrefix" );
  }


  public final void setTitlePrefix( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TitlePrefix", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TitlePrefix getTitlePrefix_elem() {
    return (xsd.acord.TitlePrefix) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TitlePrefix_elem" );
  }


  public final void setTitlePrefix_elem( xsd.acord.TitlePrefix value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TitlePrefix_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFamilyNames() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FamilyNames" );
  }


  public final void setFamilyNames( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FamilyNames", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FamilyNames getFamilyNames_elem() {
    return (xsd.acord.FamilyNames) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FamilyNames_elem" );
  }


  public final void setFamilyNames_elem( xsd.acord.FamilyNames value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FamilyNames_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSurname() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Surname" );
  }


  public final void setSurname( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Surname", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Surname getSurname_elem() {
    return (xsd.acord.Surname) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Surname_elem" );
  }


  public final void setSurname_elem( xsd.acord.Surname value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Surname_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNameSuffix() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NameSuffix" );
  }


  public final void setNameSuffix( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NameSuffix", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NameSuffix getNameSuffix_elem() {
    return (xsd.acord.NameSuffix) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NameSuffix_elem" );
  }


  public final void setNameSuffix_elem( xsd.acord.NameSuffix value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NameSuffix_elem", value );
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