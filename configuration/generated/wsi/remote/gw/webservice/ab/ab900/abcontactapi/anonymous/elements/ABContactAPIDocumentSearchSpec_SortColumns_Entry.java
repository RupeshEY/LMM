/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABContactAPIDocumentSearchSpec_SortColumns_Entry extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "Entry", "pogo21" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPIDocumentSearchSpec", "pogo21" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Ascending = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPISearchSortColumn", "Ascending", "pogo9" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BeanPath = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/ABContactAPISearchSortColumn", "BeanPath", "pogo9" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns_Entry" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPISearchSortColumn" );
    }
  };

  public ABContactAPIDocumentSearchSpec_SortColumns_Entry() {
    super( -996951748, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPISearchSortColumn() );
  }

  public ABContactAPIDocumentSearchSpec_SortColumns_Entry( wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPISearchSortColumn typeInstance ) {
    super( -996951748, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABContactAPIDocumentSearchSpec_SortColumns_Entry( gw.internal.xml.XmlElementState state ) {
    super( -996951748, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPIDocumentSearchSpec_SortColumns_Entry> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPISearchSortColumn get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPISearchSortColumn.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab900.abcontactapi.types.complex.ABContactAPISearchSortColumn typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getAscending() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Ascending" );
  }


  public final void setAscending( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Ascending", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPISearchSortColumn_Ascending getAscending_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPISearchSortColumn_Ascending) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Ascending_elem" );
  }


  public final void setAscending_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPISearchSortColumn_Ascending value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Ascending_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBeanPath() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BeanPath" );
  }


  public final void setBeanPath( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BeanPath", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPISearchSortColumn_BeanPath getBeanPath_elem() {
    return (wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPISearchSortColumn_BeanPath) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_BeanPath_elem" );
  }


  public final void setBeanPath_elem( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.ABContactAPISearchSortColumn_BeanPath value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_BeanPath_elem", value );
  }
}
