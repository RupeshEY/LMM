/* Generated by Guidewire XML Code Generator */

package xsd.iso.ak.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus_MsgStatusDesc extends gw.internal.xml.simplevalues.StringXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "MsgStatusDesc", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.ak.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus_MsgStatusDesc" );
    }
  };

  public ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus_MsgStatusDesc() {
    super( -675223456, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.String() );
  }

  public ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus_MsgStatusDesc( gw.xsd.w3c.xmlschema.types.simple.String typeInstance ) {
    super( -675223456, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus_MsgStatusDesc( gw.internal.xml.XmlElementState state ) {
    super( -675223456, state );
  }

  public ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus_MsgStatusDesc( java.lang.String value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.iso.ak.anonymous.elements.ACORD_ClaimsSvcRs_ClaimInvestigationAddRs_MsgStatus_MsgStatusDesc> get$Class() {
    return getClass();
  }
}
