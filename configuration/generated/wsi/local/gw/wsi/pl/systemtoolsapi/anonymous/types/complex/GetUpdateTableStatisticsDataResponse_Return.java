/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetUpdateTableStatisticsDataResponse_Return extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/SystemToolsAPI", "Entry", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.systemtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetUpdateTableStatisticsDataResponse_Return" );
    }
  };

  public GetUpdateTableStatisticsDataResponse_Return() {
    super( 331095701, TYPE.get() );
  }

  private GetUpdateTableStatisticsDataResponse_Return( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 331095701, state );
  }

  protected GetUpdateTableStatisticsDataResponse_Return( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetUpdateTableStatisticsDataResponse_Return( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetUpdateTableStatisticsDataResponse_Return> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.types.complex.GetUpdateTableStatisticsDataResponse_Return get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetUpdateTableStatisticsDataResponse_Return_Entry> getEntry() {
    return (java.util.List<wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetUpdateTableStatisticsDataResponse_Return_Entry>) TYPE.get().getPropertyValue( this, "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.local.gw.wsi.pl.systemtoolsapi.anonymous.elements.GetUpdateTableStatisticsDataResponse_Return_Entry> value ) {
    TYPE.get().setPropertyValue( this, "_Entry", value );
  }


}