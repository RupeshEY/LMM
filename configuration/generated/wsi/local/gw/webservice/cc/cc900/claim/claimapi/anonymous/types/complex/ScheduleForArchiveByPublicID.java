/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ScheduleForArchiveByPublicID extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PublicIDs = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/claim/ClaimAPI", "publicIDs", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.claim.claimapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex.ScheduleForArchiveByPublicID" );
    }
  };

  public ScheduleForArchiveByPublicID() {
    super( -438345427, TYPE.get() );
  }

  private ScheduleForArchiveByPublicID( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -438345427, state );
  }

  protected ScheduleForArchiveByPublicID( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ScheduleForArchiveByPublicID( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex.ScheduleForArchiveByPublicID> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.types.complex.ScheduleForArchiveByPublicID get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.ScheduleForArchiveByPublicID_PublicIDs getPublicIDs() {
    return (wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.ScheduleForArchiveByPublicID_PublicIDs) TYPE.get().getPropertyValue( this, "_PublicIDs" );
  }


  public final void setPublicIDs( wsi.local.gw.webservice.cc.cc900.claim.claimapi.anonymous.elements.ScheduleForArchiveByPublicID_PublicIDs value ) {
    TYPE.get().setPropertyValue( this, "_PublicIDs", value );
  }

}
