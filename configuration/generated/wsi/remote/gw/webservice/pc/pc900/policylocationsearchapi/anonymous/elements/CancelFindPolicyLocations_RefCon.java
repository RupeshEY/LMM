/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class CancelFindPolicyLocations_RefCon extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/PolicyLocationSearchAPI", "refCon", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pc/ws/gw/webservice/pc/pc900/ccintegration/PolicyLocationSearchAPI", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.elements.CancelFindPolicyLocations_RefCon" );
    }
  };

  public CancelFindPolicyLocations_RefCon() {
    super( 276084091, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public CancelFindPolicyLocations_RefCon( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( 276084091, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private CancelFindPolicyLocations_RefCon( gw.internal.xml.XmlElementState state ) {
    super( 276084091, state );
  }

  public CancelFindPolicyLocations_RefCon( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.pc.pc900.policylocationsearchapi.anonymous.elements.CancelFindPolicyLocations_RefCon> get$Class() {
    return getClass();
  }
}