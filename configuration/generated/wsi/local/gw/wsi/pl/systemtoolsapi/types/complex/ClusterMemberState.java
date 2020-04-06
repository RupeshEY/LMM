/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClusterMemberState extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "ClusterMemberState", "pogo5" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/gw/api/system/cluster", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BgTasksStopped = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "BgTasksStopped", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Components = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "Components", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InCluster = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "InCluster", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LastUpdateTime = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "LastUpdateTime", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlannedShutdownInitiated = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "PlannedShutdownInitiated", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PlannedShutdownTime = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "PlannedShutdownTime", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Roles = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "Roles", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Runlevel = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "Runlevel", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServerId = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "ServerId", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ServerStarted = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "ServerStarted", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UserSessions = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/system/cluster", "UserSessions", "pogo5" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ClusterMemberState" );
    }
  };

  public ClusterMemberState() {
    super( 382298233, TYPE.get() );
  }

  private ClusterMemberState( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 382298233, state );
  }

  protected ClusterMemberState( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClusterMemberState( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ClusterMemberState> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.ClusterMemberState get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getBgTasksStopped() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_BgTasksStopped" );
  }


  public final void setBgTasksStopped( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_BgTasksStopped", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_BgTasksStopped getBgTasksStopped_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_BgTasksStopped) TYPE.get().getPropertyValue( this, "_BgTasksStopped_elem" );
  }


  public final void setBgTasksStopped_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_BgTasksStopped value ) {
    TYPE.get().setPropertyValue( this, "_BgTasksStopped_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Components getComponents() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Components) TYPE.get().getPropertyValue( this, "_Components" );
  }


  public final void setComponents( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Components value ) {
    TYPE.get().setPropertyValue( this, "_Components", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getInCluster() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_InCluster" );
  }


  public final void setInCluster( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_InCluster", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_InCluster getInCluster_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_InCluster) TYPE.get().getPropertyValue( this, "_InCluster_elem" );
  }


  public final void setInCluster_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_InCluster value ) {
    TYPE.get().setPropertyValue( this, "_InCluster_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getLastUpdateTime() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_LastUpdateTime" );
  }


  public final void setLastUpdateTime( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_LastUpdateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_LastUpdateTime getLastUpdateTime_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_LastUpdateTime) TYPE.get().getPropertyValue( this, "_LastUpdateTime_elem" );
  }


  public final void setLastUpdateTime_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_LastUpdateTime value ) {
    TYPE.get().setPropertyValue( this, "_LastUpdateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getPlannedShutdownInitiated() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_PlannedShutdownInitiated" );
  }


  public final void setPlannedShutdownInitiated( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_PlannedShutdownInitiated", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_PlannedShutdownInitiated getPlannedShutdownInitiated_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_PlannedShutdownInitiated) TYPE.get().getPropertyValue( this, "_PlannedShutdownInitiated_elem" );
  }


  public final void setPlannedShutdownInitiated_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_PlannedShutdownInitiated value ) {
    TYPE.get().setPropertyValue( this, "_PlannedShutdownInitiated_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getPlannedShutdownTime() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_PlannedShutdownTime" );
  }


  public final void setPlannedShutdownTime( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_PlannedShutdownTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_PlannedShutdownTime getPlannedShutdownTime_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_PlannedShutdownTime) TYPE.get().getPropertyValue( this, "_PlannedShutdownTime_elem" );
  }


  public final void setPlannedShutdownTime_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_PlannedShutdownTime value ) {
    TYPE.get().setPropertyValue( this, "_PlannedShutdownTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Roles getRoles() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Roles) TYPE.get().getPropertyValue( this, "_Roles" );
  }


  public final void setRoles( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Roles value ) {
    TYPE.get().setPropertyValue( this, "_Roles", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.enums.Runlevel getRunlevel() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.enums.Runlevel) TYPE.get().getPropertyValue( this, "_Runlevel" );
  }


  public final void setRunlevel( wsi.local.gw.wsi.pl.systemtoolsapi.enums.Runlevel value ) {
    TYPE.get().setPropertyValue( this, "_Runlevel", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Runlevel getRunlevel_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Runlevel) TYPE.get().getPropertyValue( this, "_Runlevel_elem" );
  }


  public final void setRunlevel_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_Runlevel value ) {
    TYPE.get().setPropertyValue( this, "_Runlevel_elem", value );
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
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_ServerId getServerId_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_ServerId) TYPE.get().getPropertyValue( this, "_ServerId_elem" );
  }


  public final void setServerId_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_ServerId value ) {
    TYPE.get().setPropertyValue( this, "_ServerId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getServerStarted() {
    return (java.util.Date) TYPE.get().getPropertyValue( this, "_ServerStarted" );
  }


  public final void setServerStarted( java.util.Date value ) {
    TYPE.get().setPropertyValue( this, "_ServerStarted", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_ServerStarted getServerStarted_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_ServerStarted) TYPE.get().getPropertyValue( this, "_ServerStarted_elem" );
  }


  public final void setServerStarted_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_ServerStarted value ) {
    TYPE.get().setPropertyValue( this, "_ServerStarted_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getUserSessions() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_UserSessions" );
  }


  public final void setUserSessions( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_UserSessions", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_UserSessions getUserSessions_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_UserSessions) TYPE.get().getPropertyValue( this, "_UserSessions_elem" );
  }


  public final void setUserSessions_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.ClusterMemberState_UserSessions value ) {
    TYPE.get().setPropertyValue( this, "_UserSessions_elem", value );
  }

}