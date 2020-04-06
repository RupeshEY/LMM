/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.SupportingDocument_Type.class)
public class RetrieveClaimRs_SupportingDocument extends gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.types.complex.SupportingDocument_Type {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FolderReference = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "FolderReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReferredObjects = new javax.xml.namespace.QName( "http://www.xchanging.com/retrieveClaim/rs/1", "ReferredObjects", "" );
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
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_SupportingDocument" );
    }
  };

  public RetrieveClaimRs_SupportingDocument() {
    super( -674509061, TYPE.get() );
  }

  private RetrieveClaimRs_SupportingDocument( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -674509061, state );
  }

  protected RetrieveClaimRs_SupportingDocument( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RetrieveClaimRs_SupportingDocument( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_SupportingDocument> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.types.complex.RetrieveClaimRs_SupportingDocument get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFolderReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FolderReference" );
  }


  public final void setFolderReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FolderReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FolderReference getFolderReference_elem() {
    return (gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FolderReference) TYPE.get().getPropertyValue( this, "_FolderReference_elem" );
  }


  public final void setFolderReference_elem( gw.acc.iplm.xsd.acord_repository_v_1_3_0_rlc_slice.FolderReference value ) {
    TYPE.get().setPropertyValue( this, "_FolderReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_SupportingDocument_ReferredObjects getReferredObjects() {
    return (gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_SupportingDocument_ReferredObjects) TYPE.get().getPropertyValue( this, "_ReferredObjects" );
  }


  public final void setReferredObjects( gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_SupportingDocument_ReferredObjects value ) {
    TYPE.get().setPropertyValue( this, "_ReferredObjects", value );
  }

}