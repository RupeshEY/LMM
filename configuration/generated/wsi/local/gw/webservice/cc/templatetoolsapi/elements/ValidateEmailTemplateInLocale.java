/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.templatetoolsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ValidateEmailTemplateInLocale extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "validateEmailTemplateInLocale", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TemplateFileName = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "templateFileName", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BeanNamesAndTypes = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "beanNamesAndTypes", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Locale = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "locale", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.templatetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.templatetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateEmailTemplateInLocale" );
    }
  };

  public ValidateEmailTemplateInLocale() {
    super( 1946203106, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateEmailTemplateInLocale() );
  }

  public ValidateEmailTemplateInLocale( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateEmailTemplateInLocale typeInstance ) {
    super( 1946203106, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ValidateEmailTemplateInLocale( gw.internal.xml.XmlElementState state ) {
    super( 1946203106, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateEmailTemplateInLocale get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateEmailTemplateInLocale.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateEmailTemplateInLocale typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateEmailTemplateInLocale.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTemplateFileName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TemplateFileName" );
  }


  public final void setTemplateFileName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TemplateFileName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateInLocale_TemplateFileName getTemplateFileName_elem() {
    return (wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateInLocale_TemplateFileName) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TemplateFileName_elem" );
  }


  public final void setTemplateFileName_elem( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateInLocale_TemplateFileName value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TemplateFileName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateInLocale_BeanNamesAndTypes getBeanNamesAndTypes() {
    return (wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateInLocale_BeanNamesAndTypes) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BeanNamesAndTypes" );
  }


  public final void setBeanNamesAndTypes( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateInLocale_BeanNamesAndTypes value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BeanNamesAndTypes", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getLocale() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Locale" );
  }


  public final void setLocale( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Locale", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateInLocale_Locale getLocale_elem() {
    return (wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateInLocale_Locale) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Locale_elem" );
  }


  public final void setLocale_elem( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateInLocale_Locale value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Locale_elem", value );
  }
}
