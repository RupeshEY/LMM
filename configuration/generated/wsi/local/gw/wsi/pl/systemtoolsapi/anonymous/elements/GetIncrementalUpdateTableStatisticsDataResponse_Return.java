/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class GetIncrementalUpdateTableStatisticsDataResponse_Return extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "return", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "Entry", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetIncrementalUpdateTableStatisticsDataResponse_Return" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetIncrementalUpdateTableStatisticsDataResponse_Return" );
    }
  };

  public GetIncrementalUpdateTableStatisticsDataResponse_Return() {
    super( -1805696083, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetIncrementalUpdateTableStatisticsDataResponse_Return() );
  }

  public GetIncrementalUpdateTableStatisticsDataResponse_Return( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetIncrementalUpdateTableStatisticsDataResponse_Return typeInstance ) {
    super( -1805696083, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private GetIncrementalUpdateTableStatisticsDataResponse_Return( gw.internal.xml.XmlElementState state ) {
    super( -1805696083, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetIncrementalUpdateTableStatisticsDataResponse_Return> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetIncrementalUpdateTableStatisticsDataResponse_Return get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetIncrementalUpdateTableStatisticsDataResponse_Return.class );
  }

  public final void set$TypeInstance( wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetIncrementalUpdateTableStatisticsDataResponse_Return typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetIncrementalUpdateTableStatisticsDataResponse_Return_Entry> getEntry() {
    return (java.util.List<wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetIncrementalUpdateTableStatisticsDataResponse_Return_Entry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetIncrementalUpdateTableStatisticsDataResponse_Return_Entry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry", value );
  }

}