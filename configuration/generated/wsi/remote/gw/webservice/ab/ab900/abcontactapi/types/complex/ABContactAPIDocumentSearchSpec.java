/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ABContactAPIDocumentSearchSpec extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "ABContactAPIDocumentSearchSpec", "pogo21" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ChunkSize = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "ChunkSize", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcludeTotal = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "ExcludeTotal", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GetNumResultsOnly = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "GetNumResultsOnly", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SortColumns = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "SortColumns", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartRow = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "StartRow", "pogo21" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec" );
    }
  };

  public ABContactAPIDocumentSearchSpec() {
    super( -293227022, TYPE.get() );
  }

  private ABContactAPIDocumentSearchSpec( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -293227022, state );
  }

  protected ABContactAPIDocumentSearchSpec( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ABContactAPIDocumentSearchSpec( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getChunkSize() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_ChunkSize" );
  }


  public final void setChunkSize( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_ChunkSize", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ChunkSize getChunkSize_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ChunkSize) TYPE.get().getPropertyValue( this, "_ChunkSize_elem" );
  }


  public final void setChunkSize_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ChunkSize value ) {
    TYPE.get().setPropertyValue( this, "_ChunkSize_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getExcludeTotal() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_ExcludeTotal" );
  }


  public final void setExcludeTotal( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_ExcludeTotal", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ExcludeTotal getExcludeTotal_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ExcludeTotal) TYPE.get().getPropertyValue( this, "_ExcludeTotal_elem" );
  }


  public final void setExcludeTotal_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ExcludeTotal value ) {
    TYPE.get().setPropertyValue( this, "_ExcludeTotal_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getGetNumResultsOnly() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_GetNumResultsOnly" );
  }


  public final void setGetNumResultsOnly( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_GetNumResultsOnly", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_GetNumResultsOnly getGetNumResultsOnly_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_GetNumResultsOnly) TYPE.get().getPropertyValue( this, "_GetNumResultsOnly_elem" );
  }


  public final void setGetNumResultsOnly_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_GetNumResultsOnly value ) {
    TYPE.get().setPropertyValue( this, "_GetNumResultsOnly_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns getSortColumns() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns) TYPE.get().getPropertyValue( this, "_SortColumns" );
  }


  public final void setSortColumns( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns value ) {
    TYPE.get().setPropertyValue( this, "_SortColumns", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getStartRow() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_StartRow" );
  }


  public final void setStartRow( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_StartRow", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_StartRow getStartRow_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_StartRow) TYPE.get().getPropertyValue( this, "_StartRow_elem" );
  }


  public final void setStartRow_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_StartRow value ) {
    TYPE.get().setPropertyValue( this, "_StartRow_elem", value );
  }

}