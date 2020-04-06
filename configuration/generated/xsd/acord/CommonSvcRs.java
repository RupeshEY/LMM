/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CommonSvcRs extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CommonSvcRs", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "", "Status", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPName = new javax.xml.namespace.QName( "", "SPName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountInqRs = new javax.xml.namespace.QName( "", "AccountInqRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ViewInqRs = new javax.xml.namespace.QName( "", "ViewInqRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ActivityNoteRs = new javax.xml.namespace.QName( "", "ActivityNoteRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AgencyQuestionnaireNotificationAddRs = new javax.xml.namespace.QName( "", "AgencyQuestionnaireNotificationAddRs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.CommonSvcRs" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CommonSvcRs_Type" );
    }
  };

  public CommonSvcRs() {
    super( 1912206242, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.CommonSvcRs_Type() );
  }

  public CommonSvcRs( xsd.acord.types.complex.CommonSvcRs_Type typeInstance ) {
    super( 1912206242, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CommonSvcRs( gw.internal.xml.XmlElementState state ) {
    super( 1912206242, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.CommonSvcRs> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.CommonSvcRs_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.CommonSvcRs_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.CommonSvcRs_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.CommonSvcRs parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.CommonSvcRs.class );
  }

  public static xsd.acord.CommonSvcRs parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.CommonSvcRs.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Status getStatus() {
    return (xsd.acord.Status) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Status" );
  }


  public final void setStatus( xsd.acord.Status value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRqUID() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RqUID" );
  }


  public final void setRqUID( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RqUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RqUID getRqUID_elem() {
    return (xsd.acord.RqUID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RqUID_elem" );
  }


  public final void setRqUID_elem( xsd.acord.RqUID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RqUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSPName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPName" );
  }


  public final void setSPName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SPName getSPName_elem() {
    return (xsd.acord.SPName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SPName_elem" );
  }


  public final void setSPName_elem( xsd.acord.SPName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SPName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AccountInqRs> getAccountInqRs() {
    return (java.util.List<xsd.acord.AccountInqRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AccountInqRs" );
  }


  public final void setAccountInqRs( java.util.List<xsd.acord.AccountInqRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AccountInqRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ViewInqRs> getViewInqRs() {
    return (java.util.List<xsd.acord.ViewInqRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ViewInqRs" );
  }


  public final void setViewInqRs( java.util.List<xsd.acord.ViewInqRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ViewInqRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ActivityNoteRs> getActivityNoteRs() {
    return (java.util.List<xsd.acord.ActivityNoteRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ActivityNoteRs" );
  }


  public final void setActivityNoteRs( java.util.List<xsd.acord.ActivityNoteRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ActivityNoteRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.AgencyQuestionnaireNotificationAddRs> getAgencyQuestionnaireNotificationAddRs() {
    return (java.util.List<xsd.acord.AgencyQuestionnaireNotificationAddRs>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AgencyQuestionnaireNotificationAddRs" );
  }


  public final void setAgencyQuestionnaireNotificationAddRs( java.util.List<xsd.acord.AgencyQuestionnaireNotificationAddRs> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AgencyQuestionnaireNotificationAddRs", value );
  }

}