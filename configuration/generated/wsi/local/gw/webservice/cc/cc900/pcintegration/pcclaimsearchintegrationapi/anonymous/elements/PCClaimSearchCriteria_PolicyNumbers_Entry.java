/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class PCClaimSearchCriteria_PolicyNumbers_Entry extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaimSearchCriteria", "Entry", "pogo" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaimSearchCriteria", "pogo" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_PolicyNumbers_Entry" );
    }
  };

  public PCClaimSearchCriteria_PolicyNumbers_Entry() {
    super( -1794296774, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public PCClaimSearchCriteria_PolicyNumbers_Entry( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( -1794296774, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private PCClaimSearchCriteria_PolicyNumbers_Entry( gw.internal.xml.XmlElementState state ) {
    super( -1794296774, state );
  }

  public PCClaimSearchCriteria_PolicyNumbers_Entry( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.pcintegration.pcclaimsearchintegrationapi.anonymous.elements.PCClaimSearchCriteria_PolicyNumbers_Entry> get$Class() {
    return getClass();
  }
}
