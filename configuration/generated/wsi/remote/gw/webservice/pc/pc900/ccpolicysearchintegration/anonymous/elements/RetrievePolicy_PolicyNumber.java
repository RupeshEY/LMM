/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrievePolicy_PolicyNumber extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/CCPolicySearchIntegration", "policyNumber", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/CCPolicySearchIntegration", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_PolicyNumber" );
    }
  };

  public RetrievePolicy_PolicyNumber() {
    super( -122406889, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public RetrievePolicy_PolicyNumber( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( -122406889, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrievePolicy_PolicyNumber( gw.internal.xml.XmlElementState state ) {
    super( -122406889, state );
  }

  public RetrievePolicy_PolicyNumber( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.anonymous.elements.RetrievePolicy_PolicyNumber> get$Class() {
    return getClass();
  }
}
