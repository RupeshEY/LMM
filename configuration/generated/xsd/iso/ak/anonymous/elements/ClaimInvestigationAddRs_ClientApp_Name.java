/* Generated by Guidewire XML Code Generator */

package xsd.iso.ak.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimInvestigationAddRs_ClientApp_Name extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Name", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.ak.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.ak.anonymous.elements.ClaimInvestigationAddRs_ClientApp_Name" );
    }
  };

  public ClaimInvestigationAddRs_ClientApp_Name() {
    super( -1674195593, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public ClaimInvestigationAddRs_ClientApp_Name( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( -1674195593, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimInvestigationAddRs_ClientApp_Name( gw.internal.xml.XmlElementState state ) {
    super( -1674195593, state );
  }

  public ClaimInvestigationAddRs_ClientApp_Name( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.ak.anonymous.elements.ClaimInvestigationAddRs_ClientApp_Name> get$Class() {
    return getClass();
  }
}