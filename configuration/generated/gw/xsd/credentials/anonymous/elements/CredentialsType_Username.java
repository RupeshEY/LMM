/* Generated by Guidewire XML Code Generator */

package gw.xsd.credentials.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CredentialsType_Username extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "username", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.xsd.credentials.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.xsd.credentials.anonymous.elements.CredentialsType_Username" );
    }
  };

  public CredentialsType_Username() {
    super( -1141704544, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public CredentialsType_Username( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( -1141704544, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CredentialsType_Username( gw.internal.xml.XmlElementState state ) {
    super( -1141704544, state );
  }

  public CredentialsType_Username( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.xsd.credentials.anonymous.elements.CredentialsType_Username> get$Class() {
    return getClass();
  }
}