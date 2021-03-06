/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FileAttachmentInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ItemIdInfo = new javax.xml.namespace.QName( "", "ItemIdInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttachmentDesc = new javax.xml.namespace.QName( "", "AttachmentDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttachmentTypeCd = new javax.xml.namespace.QName( "", "AttachmentTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttachmentResponsibilityCd = new javax.xml.namespace.QName( "", "AttachmentResponsibilityCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MIMEContentTypeCd = new javax.xml.namespace.QName( "", "MIMEContentTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MIMEEncodingTypeCd = new javax.xml.namespace.QName( "", "MIMEEncodingTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AttachmentFilename = new javax.xml.namespace.QName( "", "AttachmentFilename", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.FileAttachmentInfo" );
    }
  };

  public FileAttachmentInfo() {
    super( -418251713, TYPE.get() );
  }

  private FileAttachmentInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -418251713, state );
  }

  protected FileAttachmentInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FileAttachmentInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.FileAttachmentInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.FileAttachmentInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.ItemIdInfo getItemIdInfo() {
    return (xsd.iso.req.ItemIdInfo) TYPE.get().getPropertyValue( this, "_ItemIdInfo" );
  }


  public final void setItemIdInfo( xsd.iso.req.ItemIdInfo value ) {
    TYPE.get().setPropertyValue( this, "_ItemIdInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAttachmentDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AttachmentDesc" );
  }


  public final void setAttachmentDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentDesc getAttachmentDesc_elem() {
    return (xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentDesc) TYPE.get().getPropertyValue( this, "_AttachmentDesc_elem" );
  }


  public final void setAttachmentDesc_elem( xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentDesc value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAttachmentTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AttachmentTypeCd" );
  }


  public final void setAttachmentTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentTypeCd getAttachmentTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentTypeCd) TYPE.get().getPropertyValue( this, "_AttachmentTypeCd_elem" );
  }


  public final void setAttachmentTypeCd_elem( xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAttachmentResponsibilityCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AttachmentResponsibilityCd" );
  }


  public final void setAttachmentResponsibilityCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentResponsibilityCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentResponsibilityCd getAttachmentResponsibilityCd_elem() {
    return (xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentResponsibilityCd) TYPE.get().getPropertyValue( this, "_AttachmentResponsibilityCd_elem" );
  }


  public final void setAttachmentResponsibilityCd_elem( xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentResponsibilityCd value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentResponsibilityCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMIMEContentTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MIMEContentTypeCd" );
  }


  public final void setMIMEContentTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MIMEContentTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FileAttachmentInfo_MIMEContentTypeCd getMIMEContentTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.FileAttachmentInfo_MIMEContentTypeCd) TYPE.get().getPropertyValue( this, "_MIMEContentTypeCd_elem" );
  }


  public final void setMIMEContentTypeCd_elem( xsd.iso.req.anonymous.elements.FileAttachmentInfo_MIMEContentTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_MIMEContentTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMIMEEncodingTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MIMEEncodingTypeCd" );
  }


  public final void setMIMEEncodingTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MIMEEncodingTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FileAttachmentInfo_MIMEEncodingTypeCd getMIMEEncodingTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.FileAttachmentInfo_MIMEEncodingTypeCd) TYPE.get().getPropertyValue( this, "_MIMEEncodingTypeCd_elem" );
  }


  public final void setMIMEEncodingTypeCd_elem( xsd.iso.req.anonymous.elements.FileAttachmentInfo_MIMEEncodingTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_MIMEEncodingTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAttachmentFilename() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AttachmentFilename" );
  }


  public final void setAttachmentFilename( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentFilename", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentFilename getAttachmentFilename_elem() {
    return (xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentFilename) TYPE.get().getPropertyValue( this, "_AttachmentFilename_elem" );
  }


  public final void setAttachmentFilename_elem( xsd.iso.req.anonymous.elements.FileAttachmentInfo_AttachmentFilename value ) {
    TYPE.get().setPropertyValue( this, "_AttachmentFilename_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}
