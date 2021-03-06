/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SupportingInformationType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "SupportingInformationType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentId = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "DocumentId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Reference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Reference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentVersion = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "DocumentVersion", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_URL = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "URL", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreationDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "CreationDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommunicationChannel = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "CommunicationChannel", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DocumentStatus = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "DocumentStatus", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Extension", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DocumentType = new javax.xml.namespace.QName( "", "DocumentType", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.SupportingInformationType" );
    }
  };

  public SupportingInformationType() {
    super( 650174515, TYPE.get() );
  }

  private SupportingInformationType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 650174515, state );
  }

  protected SupportingInformationType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SupportingInformationType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.SupportingInformationType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.SupportingInformationType get$TypeInstance() {
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
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DocumentId getDocumentId_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DocumentId) TYPE.get().getPropertyValue( this, "_DocumentId_elem" );
  }


  public final void setDocumentId_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DocumentId value ) {
    TYPE.get().setPropertyValue( this, "_DocumentId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Reference" );
  }


  public final void setReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Reference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Reference getReference_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Reference) TYPE.get().getPropertyValue( this, "_Reference_elem" );
  }


  public final void setReference_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Reference value ) {
    TYPE.get().setPropertyValue( this, "_Reference_elem", value );
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
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DocumentVersion getDocumentVersion_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DocumentVersion) TYPE.get().getPropertyValue( this, "_DocumentVersion_elem" );
  }


  public final void setDocumentVersion_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DocumentVersion value ) {
    TYPE.get().setPropertyValue( this, "_DocumentVersion_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getURL() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_URL" );
  }


  public final void setURL( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_URL", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.URL getURL_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.URL) TYPE.get().getPropertyValue( this, "_URL_elem" );
  }


  public final void setURL_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.URL value ) {
    TYPE.get().setPropertyValue( this, "_URL_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCreationDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CreationDate" );
  }


  public final void setCreationDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CreationDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.CreationDate getCreationDate_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.CreationDate) TYPE.get().getPropertyValue( this, "_CreationDate_elem" );
  }


  public final void setCreationDate_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.CreationDate value ) {
    TYPE.get().setPropertyValue( this, "_CreationDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCommunicationChannel() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CommunicationChannel" );
  }


  public final void setCommunicationChannel( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CommunicationChannel", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.CommunicationChannel getCommunicationChannel_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.CommunicationChannel) TYPE.get().getPropertyValue( this, "_CommunicationChannel_elem" );
  }


  public final void setCommunicationChannel_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.CommunicationChannel value ) {
    TYPE.get().setPropertyValue( this, "_CommunicationChannel_elem", value );
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
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDocumentStatus() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DocumentStatus" );
  }


  public final void setDocumentStatus( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DocumentStatus", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DocumentStatus getDocumentStatus_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DocumentStatus) TYPE.get().getPropertyValue( this, "_DocumentStatus_elem" );
  }


  public final void setDocumentStatus_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.DocumentStatus value ) {
    TYPE.get().setPropertyValue( this, "_DocumentStatus_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.SupportingInformationType_Extension getExtension() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.SupportingInformationType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.SupportingInformationType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDocumentType() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DocumentType" );
  }


  public final void setDocumentType( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DocumentType", value );
  }

}
