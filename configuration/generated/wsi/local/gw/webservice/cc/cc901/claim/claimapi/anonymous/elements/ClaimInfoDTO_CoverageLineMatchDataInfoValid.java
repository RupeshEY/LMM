/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimInfoDTO_CoverageLineMatchDataInfoValid extends gw.internal.xml.simplevalues.BooleanXmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimInfoDTO", "CoverageLineMatchDataInfoValid", "pogo17" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimInfoDTO", "pogo17" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc901.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimInfoDTO_CoverageLineMatchDataInfoValid" );
    }
  };

  public ClaimInfoDTO_CoverageLineMatchDataInfoValid() {
    super( -1293725570, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.xsd.w3c.xmlschema.types.simple.Boolean() );
  }

  public ClaimInfoDTO_CoverageLineMatchDataInfoValid( gw.xsd.w3c.xmlschema.types.simple.Boolean typeInstance ) {
    super( -1293725570, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimInfoDTO_CoverageLineMatchDataInfoValid( gw.internal.xml.XmlElementState state ) {
    super( -1293725570, state );
  }

  public ClaimInfoDTO_CoverageLineMatchDataInfoValid( java.lang.Boolean value ) {
    this();
    set$Value( value );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc901.claim.claimapi.anonymous.elements.ClaimInfoDTO_CoverageLineMatchDataInfoValid> get$Class() {
    return getClass();
  }
}
