/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class ABContactAPISearchCriteria_Tags extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPISearchCriteria", "Tags", "pogo5" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPISearchCriteria", "pogo5" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPISearchCriteria", "Entry", "pogo5" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchCriteria_Tags" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.ABContactAPISearchCriteria_Tags" );
    }
  };

  public ABContactAPISearchCriteria_Tags() {
    super( -308849850, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.ABContactAPISearchCriteria_Tags() );
  }

  public ABContactAPISearchCriteria_Tags( wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.ABContactAPISearchCriteria_Tags typeInstance ) {
    super( -308849850, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private ABContactAPISearchCriteria_Tags( gw.internal.xml.XmlElementState state ) {
    super( -308849850, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchCriteria_Tags> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.ABContactAPISearchCriteria_Tags get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.ABContactAPISearchCriteria_Tags.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.types.complex.ABContactAPISearchCriteria_Tags typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getEntry() {
    return (java.util.List<java.lang.String>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry" );
  }


  public final void setEntry( java.util.List<java.lang.String> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchCriteria_Tags_Entry> getEntry_elem() {
    return (java.util.List<wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchCriteria_Tags_Entry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry_elem" );
  }


  public final void setEntry_elem( java.util.List<wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.ABContactAPISearchCriteria_Tags_Entry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry_elem", value );
  }

}