/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GetRecentAWRSnapshotInfoResponse_Return_Entry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "Entry", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BeginIntervalTime = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/database", "BeginIntervalTime", "pogo3" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/database", "Description", "pogo3" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Id = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/database", "Id", "pogo3" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SnapTime = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/database", "SnapTime", "pogo3" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SnapshotChosen = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/database", "SnapshotChosen", "pogo3" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartupTime = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/database", "StartupTime", "pogo3" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetRecentAWRSnapshotInfoResponse_Return_Entry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.DatabaseSnapshotInfo" );
    }
  };

  public GetRecentAWRSnapshotInfoResponse_Return_Entry() {
    super( 1890408855, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.DatabaseSnapshotInfo() );
  }

  public GetRecentAWRSnapshotInfoResponse_Return_Entry( wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.DatabaseSnapshotInfo typeInstance ) {
    super( 1890408855, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GetRecentAWRSnapshotInfoResponse_Return_Entry( gw.internal.xml.XmlElementState state ) {
    super( 1890408855, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetRecentAWRSnapshotInfoResponse_Return_Entry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.DatabaseSnapshotInfo get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.DatabaseSnapshotInfo.class );
  }

  public final void set$TypeInstance( wsi.local.gw.wsi.pl.systemtoolsapi.types.complex.DatabaseSnapshotInfo typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getBeginIntervalTime() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BeginIntervalTime" );
  }


  public final void setBeginIntervalTime( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BeginIntervalTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_BeginIntervalTime getBeginIntervalTime_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_BeginIntervalTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BeginIntervalTime_elem" );
  }


  public final void setBeginIntervalTime_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_BeginIntervalTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BeginIntervalTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_Description getDescription_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_Description) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Description_elem" );
  }


  public final void setDescription_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_Description value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getId() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_Id getId_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_Id) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id_elem" );
  }


  public final void setId_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_Id value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getSnapTime() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SnapTime" );
  }


  public final void setSnapTime( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SnapTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_SnapTime getSnapTime_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_SnapTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SnapTime_elem" );
  }


  public final void setSnapTime_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_SnapTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SnapTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getSnapshotChosen() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SnapshotChosen" );
  }


  public final void setSnapshotChosen( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SnapshotChosen", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_SnapshotChosen getSnapshotChosen_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_SnapshotChosen) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SnapshotChosen_elem" );
  }


  public final void setSnapshotChosen_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_SnapshotChosen value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SnapshotChosen_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.Date getStartupTime() {
    return (java.util.Date) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartupTime" );
  }


  public final void setStartupTime( java.util.Date value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartupTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_StartupTime getStartupTime_elem() {
    return (wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_StartupTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartupTime_elem" );
  }


  public final void setStartupTime_elem( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.DatabaseSnapshotInfo_StartupTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartupTime_elem", value );
  }
}