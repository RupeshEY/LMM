/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class TypeKeyData_Retired extends gw.internal.xml.simplevalues.BooleanXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/typelisttools", "Retired", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/webservice/typelisttools", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.typelisttoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.TypeKeyData_Retired" );
    }
  };

  public TypeKeyData_Retired() {
    super( -162873629, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Boolean() );
  }

  public TypeKeyData_Retired( gw.xsd.w3c.xmlschema.types.simple.Boolean typeInstance ) {
    super( -162873629, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private TypeKeyData_Retired( gw.internal.xml.XmlElementState state ) {
    super( -162873629, state );
  }

  public TypeKeyData_Retired( java.lang.Boolean value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.TypeKeyData_Retired> get$Class() {
    return getClass();
  }
}