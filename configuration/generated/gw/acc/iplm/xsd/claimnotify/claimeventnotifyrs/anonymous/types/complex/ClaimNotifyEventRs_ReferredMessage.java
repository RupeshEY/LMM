/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimNotifyEventRs_ReferredMessage extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UUId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "UUId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServiceProviderReference = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rs/1", "ServiceProviderReference", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex.ClaimNotifyEventRs_ReferredMessage" );
    }
  };

  public ClaimNotifyEventRs_ReferredMessage() {
    super( 257689406, TYPE.get() );
  }

  private ClaimNotifyEventRs_ReferredMessage( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 257689406, state );
  }

  protected ClaimNotifyEventRs_ReferredMessage( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimNotifyEventRs_ReferredMessage( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex.ClaimNotifyEventRs_ReferredMessage> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.types.complex.ClaimNotifyEventRs_ReferredMessage get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUUId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_UUId" );
  }


  public final void setUUId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_UUId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId getUUId_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId) TYPE.get().getPropertyValue( this, "_UUId_elem" );
  }


  public final void setUUId_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.UUId value ) {
    TYPE.get().setPropertyValue( this, "_UUId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServiceProviderReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ServiceProviderReference" );
  }


  public final void setServiceProviderReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ServiceProviderReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.elements.ClaimNotifyEventRs_ReferredMessage_ServiceProviderReference getServiceProviderReference_elem() {
    return (gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.elements.ClaimNotifyEventRs_ReferredMessage_ServiceProviderReference) TYPE.get().getPropertyValue( this, "_ServiceProviderReference_elem" );
  }


  public final void setServiceProviderReference_elem( gw.acc.iplm.xsd.claimnotify.claimeventnotifyrs.anonymous.elements.ClaimNotifyEventRs_ReferredMessage_ServiceProviderReference value ) {
    TYPE.get().setPropertyValue( this, "_ServiceProviderReference_elem", value );
  }

}
