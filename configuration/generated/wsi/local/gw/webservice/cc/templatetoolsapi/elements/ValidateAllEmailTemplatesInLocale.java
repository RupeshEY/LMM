/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.templatetoolsapi.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ValidateAllEmailTemplatesInLocale extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "validateAllEmailTemplatesInLocale", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BeanNamesAndTypes = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "beanNamesAndTypes", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Locale = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "locale", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.templatetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.templatetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateAllEmailTemplatesInLocale" );
    }
  };

  public ValidateAllEmailTemplatesInLocale() {
    super( 1533209642, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateAllEmailTemplatesInLocale() );
  }

  public ValidateAllEmailTemplatesInLocale( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateAllEmailTemplatesInLocale typeInstance ) {
    super( 1533209642, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ValidateAllEmailTemplatesInLocale( gw.internal.xml.XmlElementState state ) {
    super( 1533209642, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateAllEmailTemplatesInLocale get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateAllEmailTemplatesInLocale.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.types.complex.ValidateAllEmailTemplatesInLocale typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }

  public static wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( wsi.local.gw.webservice.cc.templatetoolsapi.elements.ValidateAllEmailTemplatesInLocale.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateAllEmailTemplatesInLocale_BeanNamesAndTypes getBeanNamesAndTypes() {
    return (wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateAllEmailTemplatesInLocale_BeanNamesAndTypes) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BeanNamesAndTypes" );
  }


  public final void setBeanNamesAndTypes( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateAllEmailTemplatesInLocale_BeanNamesAndTypes value ) {
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
  public final wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateAllEmailTemplatesInLocale_Locale getLocale_elem() {
    return (wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateAllEmailTemplatesInLocale_Locale) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Locale_elem" );
  }


  public final void setLocale_elem( wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateAllEmailTemplatesInLocale_Locale value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Locale_elem", value );
  }
}