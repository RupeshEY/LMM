/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrieveDocumentsForContact_AbContactAPIDocumentSearchSpec extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "abContactAPIDocumentSearchSpec", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ChunkSize = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "ChunkSize", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ExcludeTotal = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "ExcludeTotal", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_GetNumResultsOnly = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "GetNumResultsOnly", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SortColumns = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "SortColumns", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartRow = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "StartRow", "pogo21" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_AbContactAPIDocumentSearchSpec" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec" );
    }
  };

  public RetrieveDocumentsForContact_AbContactAPIDocumentSearchSpec() {
    super( -1218667627, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec() );
  }

  public RetrieveDocumentsForContact_AbContactAPIDocumentSearchSpec( wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec typeInstance ) {
    super( -1218667627, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrieveDocumentsForContact_AbContactAPIDocumentSearchSpec( gw.internal.xml.XmlElementState state ) {
    super( -1218667627, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RetrieveDocumentsForContact_AbContactAPIDocumentSearchSpec> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPIDocumentSearchSpec typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getChunkSize() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChunkSize" );
  }


  public final void setChunkSize( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChunkSize", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ChunkSize getChunkSize_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ChunkSize) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ChunkSize_elem" );
  }


  public final void setChunkSize_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ChunkSize value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ChunkSize_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getExcludeTotal() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcludeTotal" );
  }


  public final void setExcludeTotal( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcludeTotal", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ExcludeTotal getExcludeTotal_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ExcludeTotal) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ExcludeTotal_elem" );
  }


  public final void setExcludeTotal_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_ExcludeTotal value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ExcludeTotal_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getGetNumResultsOnly() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GetNumResultsOnly" );
  }


  public final void setGetNumResultsOnly( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GetNumResultsOnly", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_GetNumResultsOnly getGetNumResultsOnly_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_GetNumResultsOnly) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_GetNumResultsOnly_elem" );
  }


  public final void setGetNumResultsOnly_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_GetNumResultsOnly value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_GetNumResultsOnly_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns getSortColumns() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SortColumns" );
  }


  public final void setSortColumns( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SortColumns", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getStartRow() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartRow" );
  }


  public final void setStartRow( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartRow", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_StartRow getStartRow_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_StartRow) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StartRow_elem" );
  }


  public final void setStartRow_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_StartRow value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StartRow_elem", value );
  }
}
