/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ClusterMemberState_Components_Entry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "Entry", "pogo5" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/system/cluster", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Code = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "Code", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LeaseExpiration = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "LeaseExpiration", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Name = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "Name", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReplacementId = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "ReplacementId", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RetryFailover = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "RetryFailover", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServerId = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "ServerId", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartRequested = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "StartRequested", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Started = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "Started", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_State = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "State", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Stopped = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "Stopped", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TerminateRequested = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "TerminateRequested", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransferRequested = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "TransferRequested", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransferTarget = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "TransferTarget", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Type = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "Type", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UniqueId = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "UniqueId", "pogo5" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Components_Entry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ComponentInfo" );
    }
  };

  public ClusterMemberState_Components_Entry() {
    super( 1474744286, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ComponentInfo() );
  }

  public ClusterMemberState_Components_Entry( wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ComponentInfo typeInstance ) {
    super( 1474744286, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ClusterMemberState_Components_Entry( gw.internal.xml.XmlElementState state ) {
    super( 1474744286, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Components_Entry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ComponentInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ComponentInfo.class );
  }

  public final void set$TypeInstance( wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ComponentInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Code" );
  }


  public final void setCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Code", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Code getCode_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Code) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Code_elem" );
  }


  public final void setCode_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Code value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Code_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getLeaseExpiration() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LeaseExpiration" );
  }


  public final void setLeaseExpiration( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LeaseExpiration", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_LeaseExpiration getLeaseExpiration_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_LeaseExpiration) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_LeaseExpiration_elem" );
  }


  public final void setLeaseExpiration_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_LeaseExpiration value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_LeaseExpiration_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getName() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Name" );
  }


  public final void setName( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Name", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Name getName_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Name) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Name_elem" );
  }


  public final void setName_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Name value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Name_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReplacementId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReplacementId" );
  }


  public final void setReplacementId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReplacementId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ReplacementId getReplacementId_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ReplacementId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ReplacementId_elem" );
  }


  public final void setReplacementId_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ReplacementId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ReplacementId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getRetryFailover() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RetryFailover" );
  }


  public final void setRetryFailover( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RetryFailover", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_RetryFailover getRetryFailover_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_RetryFailover) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_RetryFailover_elem" );
  }


  public final void setRetryFailover_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_RetryFailover value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_RetryFailover_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServerId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServerId" );
  }


  public final void setServerId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServerId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ServerId getServerId_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ServerId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ServerId_elem" );
  }


  public final void setServerId_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ServerId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ServerId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getStartRequested() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartRequested" );
  }


  public final void setStartRequested( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartRequested", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_StartRequested getStartRequested_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_StartRequested) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartRequested_elem" );
  }


  public final void setStartRequested_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_StartRequested value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartRequested_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getStarted() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Started" );
  }


  public final void setStarted( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Started", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Started getStarted_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Started) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Started_elem" );
  }


  public final void setStarted_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Started value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Started_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState getState() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_State" );
  }


  public final void setState( wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_State", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_State getState_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_State) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_State_elem" );
  }


  public final void setState_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_State value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_State_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getStopped() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Stopped" );
  }


  public final void setStopped( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Stopped", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Stopped getStopped_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Stopped) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Stopped_elem" );
  }


  public final void setStopped_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Stopped value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Stopped_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getTerminateRequested() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerminateRequested" );
  }


  public final void setTerminateRequested( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerminateRequested", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TerminateRequested getTerminateRequested_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TerminateRequested) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TerminateRequested_elem" );
  }


  public final void setTerminateRequested_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TerminateRequested value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TerminateRequested_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getTransferRequested() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransferRequested" );
  }


  public final void setTransferRequested( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransferRequested", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferRequested getTransferRequested_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferRequested) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransferRequested_elem" );
  }


  public final void setTransferRequested_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferRequested value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransferRequested_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransferTarget() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransferTarget" );
  }


  public final void setTransferTarget( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransferTarget", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferTarget getTransferTarget_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferTarget) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TransferTarget_elem" );
  }


  public final void setTransferTarget_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferTarget value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TransferTarget_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentType getType() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type" );
  }


  public final void setType( wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Type getType_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Type) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Type_elem" );
  }


  public final void setType_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Type value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Type_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUniqueId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UniqueId" );
  }


  public final void setUniqueId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UniqueId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_UniqueId getUniqueId_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_UniqueId) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UniqueId_elem" );
  }


  public final void setUniqueId_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_UniqueId value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UniqueId_elem", value );
  }
}
