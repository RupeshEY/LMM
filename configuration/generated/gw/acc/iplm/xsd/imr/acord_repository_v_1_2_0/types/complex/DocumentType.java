/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class DocumentType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "DocumentType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentId = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "DocumentId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentReference = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "DocumentReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentVersion = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "DocumentVersion", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentVersionDtTime = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "DocumentVersionDtTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentURL = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "DocumentURL", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InheritIndicator = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "InheritIndicator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileId = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "FileId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileFormatCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "FileFormatCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileSize = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "FileSize", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentTypeCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "DocumentTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ParentFolder = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "ParentFolder", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ParentDocument = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "ParentDocument", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.DocumentType" );
    }
  };

  public DocumentType() {
    super( -1418829345, TYPE.get() );
  }

  private DocumentType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1418829345, state );
  }

  protected DocumentType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected DocumentType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.DocumentType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.types.complex.DocumentType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDocumentId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DocumentId" );
  }


  public final void setDocumentId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DocumentId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentId getDocumentId_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentId) TYPE.get().getPropertyValue( this, "_DocumentId_elem" );
  }


  public final void setDocumentId_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentId value ) {
    TYPE.get().setPropertyValue( this, "_DocumentId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDocumentReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DocumentReference" );
  }


  public final void setDocumentReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DocumentReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentReference getDocumentReference_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentReference) TYPE.get().getPropertyValue( this, "_DocumentReference_elem" );
  }


  public final void setDocumentReference_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentReference value ) {
    TYPE.get().setPropertyValue( this, "_DocumentReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDocumentVersion() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DocumentVersion" );
  }


  public final void setDocumentVersion( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DocumentVersion", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentVersion getDocumentVersion_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentVersion) TYPE.get().getPropertyValue( this, "_DocumentVersion_elem" );
  }


  public final void setDocumentVersion_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentVersion value ) {
    TYPE.get().setPropertyValue( this, "_DocumentVersion_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDateTime getDocumentVersionDtTime() {
    return (gw.xml.date.XmlDateTime) TYPE.get().getPropertyValue( this, "_DocumentVersionDtTime" );
  }


  public final void setDocumentVersionDtTime( gw.xml.date.XmlDateTime value ) {
    TYPE.get().setPropertyValue( this, "_DocumentVersionDtTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentVersionDtTime getDocumentVersionDtTime_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentVersionDtTime) TYPE.get().getPropertyValue( this, "_DocumentVersionDtTime_elem" );
  }


  public final void setDocumentVersionDtTime_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentVersionDtTime value ) {
    TYPE.get().setPropertyValue( this, "_DocumentVersionDtTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDocumentURL() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DocumentURL" );
  }


  public final void setDocumentURL( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DocumentURL", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentURL getDocumentURL_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentURL) TYPE.get().getPropertyValue( this, "_DocumentURL_elem" );
  }


  public final void setDocumentURL_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentURL value ) {
    TYPE.get().setPropertyValue( this, "_DocumentURL_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getInheritIndicator() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_InheritIndicator" );
  }


  public final void setInheritIndicator( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_InheritIndicator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.InheritIndicator getInheritIndicator_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.InheritIndicator) TYPE.get().getPropertyValue( this, "_InheritIndicator_elem" );
  }


  public final void setInheritIndicator_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.InheritIndicator value ) {
    TYPE.get().setPropertyValue( this, "_InheritIndicator_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFileId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FileId" );
  }


  public final void setFileId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FileId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileId getFileId_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileId) TYPE.get().getPropertyValue( this, "_FileId_elem" );
  }


  public final void setFileId_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileId value ) {
    TYPE.get().setPropertyValue( this, "_FileId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFileFormatCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FileFormatCd" );
  }


  public final void setFileFormatCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FileFormatCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileFormatCd getFileFormatCd_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileFormatCd) TYPE.get().getPropertyValue( this, "_FileFormatCd_elem" );
  }


  public final void setFileFormatCd_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileFormatCd value ) {
    TYPE.get().setPropertyValue( this, "_FileFormatCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileSize getFileSize() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileSize) TYPE.get().getPropertyValue( this, "_FileSize" );
  }


  public final void setFileSize( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.FileSize value ) {
    TYPE.get().setPropertyValue( this, "_FileSize", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDocumentTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DocumentTypeCd" );
  }


  public final void setDocumentTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DocumentTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentTypeCd getDocumentTypeCd_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentTypeCd) TYPE.get().getPropertyValue( this, "_DocumentTypeCd_elem" );
  }


  public final void setDocumentTypeCd_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_DocumentTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDescription() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Description" );
  }


  public final void setDescription( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Description", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ParentFolder getParentFolder() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ParentFolder) TYPE.get().getPropertyValue( this, "_ParentFolder" );
  }


  public final void setParentFolder( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ParentFolder value ) {
    TYPE.get().setPropertyValue( this, "_ParentFolder", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ParentDocument getParentDocument() {
    return (gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ParentDocument) TYPE.get().getPropertyValue( this, "_ParentDocument" );
  }


  public final void setParentDocument( gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.ParentDocument value ) {
    TYPE.get().setPropertyValue( this, "_ParentDocument", value );
  }

}
