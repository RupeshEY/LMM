/* Generated by Guidewire XML Code Generator */

package wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class RetrieveRelatedContactsResponse_Return extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPI", "return", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/ABContactAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SourceRelatedContacts = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/RelatedContactInfoContainer", "SourceRelatedContacts", "pogo17" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TargetRelatedContacts = new javax.xml.namespace.QName( "http://guidewire.com/ab/ws/gw/webservice/ab/ab801/abcontactapi/RelatedContactInfoContainer", "TargetRelatedContacts", "pogo17" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RetrieveRelatedContactsResponse_Return" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.remote.gw.webservice.ab.ab801.abcontactapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.RelatedContactInfoContainer" );
    }
  };

  public RetrieveRelatedContactsResponse_Return() {
    super( -822002884, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.RelatedContactInfoContainer() );
  }

  public RetrieveRelatedContactsResponse_Return( wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.RelatedContactInfoContainer typeInstance ) {
    super( -822002884, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private RetrieveRelatedContactsResponse_Return( gw.internal.xml.XmlElementState state ) {
    super( -822002884, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RetrieveRelatedContactsResponse_Return> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.RelatedContactInfoContainer get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.RelatedContactInfoContainer.class );
  }

  public final void set$TypeInstance( wsi.remote.gw.webservice.ab.ab801.abcontactapi.types.complex.RelatedContactInfoContainer typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RelatedContactInfoContainer_SourceRelatedContacts getSourceRelatedContacts() {
    return (wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RelatedContactInfoContainer_SourceRelatedContacts) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SourceRelatedContacts" );
  }


  public final void setSourceRelatedContacts( wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RelatedContactInfoContainer_SourceRelatedContacts value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SourceRelatedContacts", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RelatedContactInfoContainer_TargetRelatedContacts getTargetRelatedContacts() {
    return (wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RelatedContactInfoContainer_TargetRelatedContacts) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TargetRelatedContacts" );
  }


  public final void setTargetRelatedContacts( wsi.remote.gw.webservice.ab.ab801.abcontactapi.anonymous.elements.RelatedContactInfoContainer_TargetRelatedContacts value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TargetRelatedContacts", value );
  }
}