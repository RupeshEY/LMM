/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class AddDocument_DocumentToUpload extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "documentToUpload", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/ServiceRequestAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Content = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/DocumentContent", "Content", "pogo17" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MimeType = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/DocumentContent", "MimeType", "pogo17" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddDocument_DocumentToUpload" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.DocumentContent" );
    }
  };

  public AddDocument_DocumentToUpload() {
    super( 622575247, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.DocumentContent() );
  }

  public AddDocument_DocumentToUpload( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.DocumentContent typeInstance ) {
    super( 622575247, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private AddDocument_DocumentToUpload( gw.internal.xml.XmlElementState state ) {
    super( 622575247, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.AddDocument_DocumentToUpload> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.DocumentContent get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.DocumentContent.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.DocumentContent typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final byte[] getContent() {
    return (byte[]) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Content" );
  }


  public final void setContent( byte[] value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Content", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_Content getContent_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_Content) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Content_elem" );
  }


  public final void setContent_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_Content value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Content_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMimeType() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MimeType" );
  }


  public final void setMimeType( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MimeType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_MimeType getMimeType_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_MimeType) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MimeType_elem" );
  }


  public final void setMimeType_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_MimeType value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MimeType_elem", value );
  }
}
