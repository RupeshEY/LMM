/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SubcontractorInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SubcontractorInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompAuditExposure = new javax.xml.namespace.QName( "", "WorkCompAuditExposure", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractorsUnderwritingQuestions = new javax.xml.namespace.QName( "", "ContractorsUnderwritingQuestions", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubcontractorRef = new javax.xml.namespace.QName( "", "SubcontractorRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_SubLocationRef = new javax.xml.namespace.QName( "", "SubLocationRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SubcontractorInfo_Type" );
    }
  };

  public SubcontractorInfo_Type() {
    super( -1553740387, TYPE.get() );
  }

  private SubcontractorInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1553740387, state );
  }

  protected SubcontractorInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SubcontractorInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.SubcontractorInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.SubcontractorInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProvCd getStateProvCd_elem() {
    return (xsd.acord.StateProvCd) TYPE.get().getPropertyValue( this, "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.acord.StateProvCd value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.WorkCompAuditExposure> getWorkCompAuditExposure() {
    return (java.util.List<xsd.acord.WorkCompAuditExposure>) TYPE.get().getPropertyValue( this, "_WorkCompAuditExposure" );
  }


  public final void setWorkCompAuditExposure( java.util.List<xsd.acord.WorkCompAuditExposure> value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompAuditExposure", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContractorsUnderwritingQuestions getContractorsUnderwritingQuestions() {
    return (xsd.acord.ContractorsUnderwritingQuestions) TYPE.get().getPropertyValue( this, "_ContractorsUnderwritingQuestions" );
  }


  public final void setContractorsUnderwritingQuestions( xsd.acord.ContractorsUnderwritingQuestions value ) {
    TYPE.get().setPropertyValue( this, "_ContractorsUnderwritingQuestions", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubcontractorRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_SubcontractorRef" );
  }


  public final void setSubcontractorRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_SubcontractorRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getSubLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_SubLocationRef" );
  }


  public final void setSubLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_SubLocationRef", value );
  }

}