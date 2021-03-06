/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ComponentInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "ComponentInfo", "pogo5" );
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
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ComponentInfo" );
    }
  };

  public ComponentInfo() {
    super( 181244175, TYPE.get() );
  }

  private ComponentInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 181244175, state );
  }

  protected ComponentInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ComponentInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ComponentInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ComponentInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCode() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Code" );
  }


  public final void setCode( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Code", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Code getCode_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Code) TYPE.get().getPropertyValue( this, "_Code_elem" );
  }


  public final void setCode_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Code value ) {
    TYPE.get().setPropertyValue( this, "_Code_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getLeaseExpiration() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_LeaseExpiration" );
  }


  public final void setLeaseExpiration( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_LeaseExpiration", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_LeaseExpiration getLeaseExpiration_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_LeaseExpiration) TYPE.get().getPropertyValue( this, "_LeaseExpiration_elem" );
  }


  public final void setLeaseExpiration_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_LeaseExpiration value ) {
    TYPE.get().setPropertyValue( this, "_LeaseExpiration_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Name" );
  }


  public final void setName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Name", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Name getName_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Name) TYPE.get().getPropertyValue( this, "_Name_elem" );
  }


  public final void setName_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Name value ) {
    TYPE.get().setPropertyValue( this, "_Name_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReplacementId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ReplacementId" );
  }


  public final void setReplacementId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ReplacementId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ReplacementId getReplacementId_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ReplacementId) TYPE.get().getPropertyValue( this, "_ReplacementId_elem" );
  }


  public final void setReplacementId_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ReplacementId value ) {
    TYPE.get().setPropertyValue( this, "_ReplacementId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getRetryFailover() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_RetryFailover" );
  }


  public final void setRetryFailover( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_RetryFailover", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_RetryFailover getRetryFailover_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_RetryFailover) TYPE.get().getPropertyValue( this, "_RetryFailover_elem" );
  }


  public final void setRetryFailover_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_RetryFailover value ) {
    TYPE.get().setPropertyValue( this, "_RetryFailover_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getServerId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ServerId" );
  }


  public final void setServerId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ServerId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ServerId getServerId_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ServerId) TYPE.get().getPropertyValue( this, "_ServerId_elem" );
  }


  public final void setServerId_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_ServerId value ) {
    TYPE.get().setPropertyValue( this, "_ServerId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getStartRequested() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_StartRequested" );
  }


  public final void setStartRequested( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_StartRequested", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_StartRequested getStartRequested_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_StartRequested) TYPE.get().getPropertyValue( this, "_StartRequested_elem" );
  }


  public final void setStartRequested_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_StartRequested value ) {
    TYPE.get().setPropertyValue( this, "_StartRequested_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getStarted() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_Started" );
  }


  public final void setStarted( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_Started", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Started getStarted_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Started) TYPE.get().getPropertyValue( this, "_Started_elem" );
  }


  public final void setStarted_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Started value ) {
    TYPE.get().setPropertyValue( this, "_Started_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState getState() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState) TYPE.get().getPropertyValue( this, "_State" );
  }


  public final void setState( wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentState value ) {
    TYPE.get().setPropertyValue( this, "_State", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_State getState_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_State) TYPE.get().getPropertyValue( this, "_State_elem" );
  }


  public final void setState_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_State value ) {
    TYPE.get().setPropertyValue( this, "_State_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getStopped() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_Stopped" );
  }


  public final void setStopped( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_Stopped", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Stopped getStopped_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Stopped) TYPE.get().getPropertyValue( this, "_Stopped_elem" );
  }


  public final void setStopped_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Stopped value ) {
    TYPE.get().setPropertyValue( this, "_Stopped_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getTerminateRequested() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_TerminateRequested" );
  }


  public final void setTerminateRequested( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_TerminateRequested", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TerminateRequested getTerminateRequested_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TerminateRequested) TYPE.get().getPropertyValue( this, "_TerminateRequested_elem" );
  }


  public final void setTerminateRequested_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TerminateRequested value ) {
    TYPE.get().setPropertyValue( this, "_TerminateRequested_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getTransferRequested() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_TransferRequested" );
  }


  public final void setTransferRequested( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_TransferRequested", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferRequested getTransferRequested_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferRequested) TYPE.get().getPropertyValue( this, "_TransferRequested_elem" );
  }


  public final void setTransferRequested_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferRequested value ) {
    TYPE.get().setPropertyValue( this, "_TransferRequested_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransferTarget() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TransferTarget" );
  }


  public final void setTransferTarget( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TransferTarget", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferTarget getTransferTarget_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferTarget) TYPE.get().getPropertyValue( this, "_TransferTarget_elem" );
  }


  public final void setTransferTarget_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_TransferTarget value ) {
    TYPE.get().setPropertyValue( this, "_TransferTarget_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentType getType() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentType) TYPE.get().getPropertyValue( this, "_Type" );
  }


  public final void setType( wsi.local.gw.wsi.pl.systemtoolsapi.enums.ComponentType value ) {
    TYPE.get().setPropertyValue( this, "_Type", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Type getType_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Type) TYPE.get().getPropertyValue( this, "_Type_elem" );
  }


  public final void setType_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_Type value ) {
    TYPE.get().setPropertyValue( this, "_Type_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUniqueId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_UniqueId" );
  }


  public final void setUniqueId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_UniqueId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_UniqueId getUniqueId_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_UniqueId) TYPE.get().getPropertyValue( this, "_UniqueId_elem" );
  }


  public final void setUniqueId_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ComponentInfo_UniqueId value ) {
    TYPE.get().setPropertyValue( this, "_UniqueId_elem", value );
  }

}
