/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class AddressDTO_FailureGeocoding extends gw.internal.xml.simplevalues.BooleanXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/AddressDTO", "FailureGeocoding", "pogo6" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/AddressDTO", "pogo6" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.AddressDTO_FailureGeocoding" );
    }
  };

  public AddressDTO_FailureGeocoding() {
    super( -966861963, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Boolean() );
  }

  public AddressDTO_FailureGeocoding( gw.xsd.w3c.xmlschema.types.simple.Boolean typeInstance ) {
    super( -966861963, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private AddressDTO_FailureGeocoding( gw.internal.xml.XmlElementState state ) {
    super( -966861963, state );
  }

  public AddressDTO_FailureGeocoding( java.lang.Boolean value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.financials.claimfinancialsapi.anonymous.elements.AddressDTO_FailureGeocoding> get$Class() {
    return getClass();
  }
}
