/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RelatedContactInfoContainer_SourceRelatedContacts extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/RelatedContactInfoContainer", "SourceRelatedContacts", "pogo17" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/RelatedContactInfoContainer", "pogo17" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Entry = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab900/abcontactapi/RelatedContactInfoContainer", "Entry", "pogo17" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RelatedContactInfoContainer_SourceRelatedContacts" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab900.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RelatedContactInfoContainer_SourceRelatedContacts" );
    }
  };

  public RelatedContactInfoContainer_SourceRelatedContacts() {
    super( -1783607854, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RelatedContactInfoContainer_SourceRelatedContacts() );
  }

  public RelatedContactInfoContainer_SourceRelatedContacts( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RelatedContactInfoContainer_SourceRelatedContacts typeInstance ) {
    super( -1783607854, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RelatedContactInfoContainer_SourceRelatedContacts( gw.internal.xml.XmlElementState state ) {
    super( -1783607854, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RelatedContactInfoContainer_SourceRelatedContacts> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RelatedContactInfoContainer_SourceRelatedContacts get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RelatedContactInfoContainer_SourceRelatedContacts.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.types.complex.RelatedContactInfoContainer_SourceRelatedContacts typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RelatedContactInfoContainer_SourceRelatedContacts_Entry> getEntry() {
    return (java.util.List<wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RelatedContactInfoContainer_SourceRelatedContacts_Entry>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Entry" );
  }


  public final void setEntry( java.util.List<wsi.remote.gw.webservice.ab.ab900.abcontactapi.anonymous.elements.RelatedContactInfoContainer_SourceRelatedContacts_Entry> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Entry", value );
  }

}
