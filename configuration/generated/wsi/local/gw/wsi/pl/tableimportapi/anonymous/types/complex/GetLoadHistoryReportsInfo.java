/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetLoadHistoryReportsInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDownloads = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TableImportAPI", "numDownloads", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.tableimportapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.GetLoadHistoryReportsInfo" );
    }
  };

  public GetLoadHistoryReportsInfo() {
    super( -481557167, TYPE.get() );
  }

  private GetLoadHistoryReportsInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -481557167, state );
  }

  protected GetLoadHistoryReportsInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetLoadHistoryReportsInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.GetLoadHistoryReportsInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.tableimportapi.anonymous.types.complex.GetLoadHistoryReportsInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDownloads() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDownloads" );
  }


  public final void setNumDownloads( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDownloads", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.GetLoadHistoryReportsInfo_NumDownloads getNumDownloads_elem() {
    return (wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.GetLoadHistoryReportsInfo_NumDownloads) TYPE.get().getPropertyValue( this, "_NumDownloads_elem" );
  }


  public final void setNumDownloads_elem( wsi.local.gw.wsi.pl.tableimportapi.anonymous.elements.GetLoadHistoryReportsInfo_NumDownloads value ) {
    TYPE.get().setPropertyValue( this, "_NumDownloads_elem", value );
  }

}