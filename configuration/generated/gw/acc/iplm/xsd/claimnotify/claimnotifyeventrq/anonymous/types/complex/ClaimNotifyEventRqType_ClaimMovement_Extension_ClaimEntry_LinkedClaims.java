/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LinkedClaim = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "LinkedClaim", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LinkedMasterSubordinateClaims = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "LinkedMasterSubordinateClaims", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims" );
    }
  };

  public ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims() {
    super( -1475106375, TYPE.get() );
  }

  private ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1475106375, state );
  }

  protected ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims_LinkedClaim> getLinkedClaim() {
    return (java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims_LinkedClaim>) TYPE.get().getPropertyValue( this, "_LinkedClaim" );
  }


  public final void setLinkedClaim( java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims_LinkedClaim> value ) {
    TYPE.get().setPropertyValue( this, "_LinkedClaim", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims_LinkedMasterSubordinateClaims> getLinkedMasterSubordinateClaims() {
    return (java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims_LinkedMasterSubordinateClaims>) TYPE.get().getPropertyValue( this, "_LinkedMasterSubordinateClaims" );
  }


  public final void setLinkedMasterSubordinateClaims( java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_LinkedClaims_LinkedMasterSubordinateClaims> value ) {
    TYPE.get().setPropertyValue( this, "_LinkedMasterSubordinateClaims", value );
  }


}
