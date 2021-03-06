/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.jvinsreinsurance;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class NoticeOfCancellation extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "NoticeOfCancellation", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DueDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "DueDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NoticePeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "NoticePeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.NoticeOfCancellationType" );
    }
  };

  public NoticeOfCancellation() {
    super( -303659967, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.NoticeOfCancellationType() );
  }

  public NoticeOfCancellation( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.NoticeOfCancellationType typeInstance ) {
    super( -303659967, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private NoticeOfCancellation( gw.internal.xml.XmlElementState state ) {
    super( -303659967, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.NoticeOfCancellationType get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.NoticeOfCancellationType.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.types.complex.NoticeOfCancellationType typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
  }

  public static gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticeOfCancellation.class );
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
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDueDate() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DueDate" );
  }


  public final void setDueDate( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DueDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.DueDate getDueDate_elem() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.DueDate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_DueDate_elem" );
  }


  public final void setDueDate_elem( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.DueDate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_DueDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticePeriod getNoticePeriod() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticePeriod) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NoticePeriod" );
  }


  public final void setNoticePeriod( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.NoticePeriod value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NoticePeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.NoticeOfCancellationType_Extension getExtension() {
    return (gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.NoticeOfCancellationType_Extension) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.anonymous.elements.NoticeOfCancellationType_Extension value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Extension", value );
  }
}
