/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class MessengerProtectionInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "MessengerProtectionInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SequenceNumber = new javax.xml.namespace.QName( "", "SequenceNumber", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumGuards = new javax.xml.namespace.QName( "", "NumGuards", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrivateConveyanceInd = new javax.xml.namespace.QName( "", "PrivateConveyanceInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SafetySatchelInd = new javax.xml.namespace.QName( "", "SafetySatchelInd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.MessengerProtectionInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.MessengerProtectionInfo_Type" );
    }
  };

  public MessengerProtectionInfo() {
    super( -648333018, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.MessengerProtectionInfo_Type() );
  }

  public MessengerProtectionInfo( xsd.acord.types.complex.MessengerProtectionInfo_Type typeInstance ) {
    super( -648333018, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private MessengerProtectionInfo( gw.internal.xml.XmlElementState state ) {
    super( -648333018, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.MessengerProtectionInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.MessengerProtectionInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.MessengerProtectionInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.MessengerProtectionInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.MessengerProtectionInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.MessengerProtectionInfo.class );
  }

  public static xsd.acord.MessengerProtectionInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.MessengerProtectionInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getSequenceNumber() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SequenceNumber" );
  }


  public final void setSequenceNumber( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SequenceNumber", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SequenceNumber getSequenceNumber_elem() {
    return (xsd.acord.SequenceNumber) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SequenceNumber_elem" );
  }


  public final void setSequenceNumber_elem( xsd.acord.SequenceNumber value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SequenceNumber_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumGuards() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGuards" );
  }


  public final void setNumGuards( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGuards", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumGuards getNumGuards_elem() {
    return (xsd.acord.NumGuards) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumGuards_elem" );
  }


  public final void setNumGuards_elem( xsd.acord.NumGuards value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumGuards_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getPrivateConveyanceInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrivateConveyanceInd" );
  }


  public final void setPrivateConveyanceInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrivateConveyanceInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PrivateConveyanceInd getPrivateConveyanceInd_elem() {
    return (xsd.acord.PrivateConveyanceInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_PrivateConveyanceInd_elem" );
  }


  public final void setPrivateConveyanceInd_elem( xsd.acord.PrivateConveyanceInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_PrivateConveyanceInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSafetySatchelInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SafetySatchelInd" );
  }


  public final void setSafetySatchelInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SafetySatchelInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SafetySatchelInd getSafetySatchelInd_elem() {
    return (xsd.acord.SafetySatchelInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SafetySatchelInd_elem" );
  }


  public final void setSafetySatchelInd_elem( xsd.acord.SafetySatchelInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SafetySatchelInd_elem", value );
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