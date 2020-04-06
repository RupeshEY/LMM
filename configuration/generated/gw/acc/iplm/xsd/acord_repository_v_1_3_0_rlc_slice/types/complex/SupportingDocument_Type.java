/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SupportingDocument_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "SupportingDocument_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentId = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "DocumentId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentReference = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "DocumentReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentVersion = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "DocumentVersion", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentVersionDtTime = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "DocumentVersionDtTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentURL = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "DocumentURL", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileId = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "FileId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileFormatCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "FileFormatCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FileSize = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "FileSize", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentTypeCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "DocumentTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ParentDocument = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "ParentDocument", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Owner = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Owner", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Originator = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Originator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommunicationChannelCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "CommunicationChannelCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Operator = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "Operator", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RepositoryService = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "RepositoryService", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.SupportingDocument_Type" );
    }
  };

  public SupportingDocument_Type() {
    super( 779852479, TYPE.get() );
  }

  private SupportingDocument_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 779852479, state );
  }

  protected SupportingDocument_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SupportingDocument_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.SupportingDocument_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.SupportingDocument_Type get$TypeInstance() {
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
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentId getDocumentId_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentId) TYPE.get().getPropertyValue( this, "_DocumentId_elem" );
  }


  public final void setDocumentId_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentId value ) {
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
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentReference getDocumentReference_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentReference) TYPE.get().getPropertyValue( this, "_DocumentReference_elem" );
  }


  public final void setDocumentReference_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentReference value ) {
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
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentVersion getDocumentVersion_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentVersion) TYPE.get().getPropertyValue( this, "_DocumentVersion_elem" );
  }


  public final void setDocumentVersion_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentVersion value ) {
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
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentVersionDtTime getDocumentVersionDtTime_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentVersionDtTime) TYPE.get().getPropertyValue( this, "_DocumentVersionDtTime_elem" );
  }


  public final void setDocumentVersionDtTime_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentVersionDtTime value ) {
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
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentURL getDocumentURL_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentURL) TYPE.get().getPropertyValue( this, "_DocumentURL_elem" );
  }


  public final void setDocumentURL_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentURL value ) {
    TYPE.get().setPropertyValue( this, "_DocumentURL_elem", value );
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
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileId getFileId_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileId) TYPE.get().getPropertyValue( this, "_FileId_elem" );
  }


  public final void setFileId_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileId value ) {
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
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileFormatCd getFileFormatCd_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileFormatCd) TYPE.get().getPropertyValue( this, "_FileFormatCd_elem" );
  }


  public final void setFileFormatCd_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileFormatCd value ) {
    TYPE.get().setPropertyValue( this, "_FileFormatCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileSize getFileSize() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileSize) TYPE.get().getPropertyValue( this, "_FileSize" );
  }


  public final void setFileSize( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FileSize value ) {
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
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentTypeCd getDocumentTypeCd_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentTypeCd) TYPE.get().getPropertyValue( this, "_DocumentTypeCd_elem" );
  }


  public final void setDocumentTypeCd_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.DocumentTypeCd value ) {
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
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ParentDocument getParentDocument() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ParentDocument) TYPE.get().getPropertyValue( this, "_ParentDocument" );
  }


  public final void setParentDocument( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.ParentDocument value ) {
    TYPE.get().setPropertyValue( this, "_ParentDocument", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Owner getOwner() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Owner) TYPE.get().getPropertyValue( this, "_Owner" );
  }


  public final void setOwner( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Owner value ) {
    TYPE.get().setPropertyValue( this, "_Owner", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Originator getOriginator() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Originator) TYPE.get().getPropertyValue( this, "_Originator" );
  }


  public final void setOriginator( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Originator value ) {
    TYPE.get().setPropertyValue( this, "_Originator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCommunicationChannelCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CommunicationChannelCd" );
  }


  public final void setCommunicationChannelCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CommunicationChannelCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.CommunicationChannelCd getCommunicationChannelCd_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.CommunicationChannelCd) TYPE.get().getPropertyValue( this, "_CommunicationChannelCd_elem" );
  }


  public final void setCommunicationChannelCd_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.CommunicationChannelCd value ) {
    TYPE.get().setPropertyValue( this, "_CommunicationChannelCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Operator getOperator() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Operator) TYPE.get().getPropertyValue( this, "_Operator" );
  }


  public final void setOperator( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.Operator value ) {
    TYPE.get().setPropertyValue( this, "_Operator", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService getRepositoryService() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService) TYPE.get().getPropertyValue( this, "_RepositoryService" );
  }


  public final void setRepositoryService( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.RepositoryService value ) {
    TYPE.get().setPropertyValue( this, "_RepositoryService", value );
  }

}