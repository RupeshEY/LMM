/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ContractValueInterest", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.xchanging.com/claimnotify/rq/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValueInterestAmount = new javax.xml.namespace.QName( "http://www.xchanging.com/claimnotify/rq/1", "ValueInterestAmount", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest" );
    }
  };

  public ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest() {
    super( -1022594436, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest() );
  }

  public ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest typeInstance ) {
    super( -1022594436, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest( gw.internal.xml.XmlElementState state ) {
    super( -1022594436, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest get$TypeInstance() {
    return super.get$TypeInstance().cast( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest.class );
  }

  public final void set$TypeInstance( gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.types.complex.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest_ValueInterestAmount> getValueInterestAmount() {
    return (java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest_ValueInterestAmount>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ValueInterestAmount" );
  }


  public final void setValueInterestAmount( java.util.List<gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Contract_ContractValueInterest_ValueInterestAmount> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ValueInterestAmount", value );
  }

}
