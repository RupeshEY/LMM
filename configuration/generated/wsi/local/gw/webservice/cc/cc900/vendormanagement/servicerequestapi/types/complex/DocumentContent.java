/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class DocumentContent extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/DocumentContent", "DocumentContent", "pogo17" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/DocumentContent", "pogo17" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Content = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/DocumentContent", "Content", "pogo17" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MimeType = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/cc900/vendormanagement/DocumentContent", "MimeType", "pogo17" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.DocumentContent" );
    }
  };

  public DocumentContent() {
    super( -1098079574, TYPE.get() );
  }

  private DocumentContent( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1098079574, state );
  }

  protected DocumentContent( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected DocumentContent( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.DocumentContent> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.types.complex.DocumentContent get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final byte[] getContent() {
    return (byte[]) TYPE.get().getPropertyValue( this, "_Content" );
  }


  public final void setContent( byte[] value ) {
    TYPE.get().setPropertyValue( this, "_Content", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_Content getContent_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_Content) TYPE.get().getPropertyValue( this, "_Content_elem" );
  }


  public final void setContent_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_Content value ) {
    TYPE.get().setPropertyValue( this, "_Content_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMimeType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MimeType" );
  }


  public final void setMimeType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MimeType", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_MimeType getMimeType_elem() {
    return (wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_MimeType) TYPE.get().getPropertyValue( this, "_MimeType_elem" );
  }


  public final void setMimeType_elem( wsi.local.gw.webservice.cc.cc900.vendormanagement.servicerequestapi.anonymous.elements.DocumentContent_MimeType value ) {
    TYPE.get().setPropertyValue( this, "_MimeType_elem", value );
  }

}
