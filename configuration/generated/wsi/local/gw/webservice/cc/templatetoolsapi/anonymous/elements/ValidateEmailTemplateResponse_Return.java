/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ValidateEmailTemplateResponse_Return extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "return", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/TemplateToolsAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.templatetoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateResponse_Return" );
    }
  };

  public ValidateEmailTemplateResponse_Return() {
    super( 1790448234, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public ValidateEmailTemplateResponse_Return( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 1790448234, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ValidateEmailTemplateResponse_Return( gw.internal.xml.XmlElementState state ) {
    super( 1790448234, state );
  }

  public ValidateEmailTemplateResponse_Return( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.templatetoolsapi.anonymous.elements.ValidateEmailTemplateResponse_Return> get$Class() {
    return getClass();
  }
}