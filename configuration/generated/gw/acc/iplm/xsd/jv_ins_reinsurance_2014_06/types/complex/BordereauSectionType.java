/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BordereauSectionType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauSectionType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SequenceNbr = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SequenceNbr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SubaccountReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "SubaccountReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContractSection = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "ContractSection", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossOccurrencePeriod = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LossOccurrencePeriod", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_LossOccurrenceYear = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "LossOccurrenceYear", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CauseOfLoss = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CauseOfLoss", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CauseOfLossOld = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CauseOfLossOld", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_JvClassOfBusiness = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "JvClassOfBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NaicClassOfBusiness = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "NaicClassOfBusiness", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RiskLocation = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "RiskLocation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BordereauSectionItem = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "BordereauSectionItem", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauSectionType" );
    }
  };

  public BordereauSectionType() {
    super( 650083627, TYPE.get() );
  }

  private BordereauSectionType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 650083627, state );
  }

  protected BordereauSectionType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BordereauSectionType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauSectionType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.BordereauSectionType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSequenceNbr() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SequenceNbr" );
  }


  public final void setSequenceNbr( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SequenceNbr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SequenceNbr getSequenceNbr_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SequenceNbr) TYPE.get().getPropertyValue( this, "_SequenceNbr_elem" );
  }


  public final void setSequenceNbr_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SequenceNbr value ) {
    TYPE.get().setPropertyValue( this, "_SequenceNbr_elem", value );
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
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description getDescription_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description) TYPE.get().getPropertyValue( this, "_Description_elem" );
  }


  public final void setDescription_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Description value ) {
    TYPE.get().setPropertyValue( this, "_Description_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSubaccountReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SubaccountReference" );
  }


  public final void setSubaccountReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SubaccountReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SubaccountReference getSubaccountReference_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SubaccountReference) TYPE.get().getPropertyValue( this, "_SubaccountReference_elem" );
  }


  public final void setSubaccountReference_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.SubaccountReference value ) {
    TYPE.get().setPropertyValue( this, "_SubaccountReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractSection getContractSection() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractSection) TYPE.get().getPropertyValue( this, "_ContractSection" );
  }


  public final void setContractSection( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.ContractSection value ) {
    TYPE.get().setPropertyValue( this, "_ContractSection", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LossOccurrencePeriod getLossOccurrencePeriod() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LossOccurrencePeriod) TYPE.get().getPropertyValue( this, "_LossOccurrencePeriod" );
  }


  public final void setLossOccurrencePeriod( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LossOccurrencePeriod value ) {
    TYPE.get().setPropertyValue( this, "_LossOccurrencePeriod", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlYear getLossOccurrenceYear() {
    return (gw.xml.date.XmlYear) TYPE.get().getPropertyValue( this, "_LossOccurrenceYear" );
  }


  public final void setLossOccurrenceYear( gw.xml.date.XmlYear value ) {
    TYPE.get().setPropertyValue( this, "_LossOccurrenceYear", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LossOccurrenceYear getLossOccurrenceYear_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LossOccurrenceYear) TYPE.get().getPropertyValue( this, "_LossOccurrenceYear_elem" );
  }


  public final void setLossOccurrenceYear_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.LossOccurrenceYear value ) {
    TYPE.get().setPropertyValue( this, "_LossOccurrenceYear_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCauseOfLoss() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CauseOfLoss" );
  }


  public final void setCauseOfLoss( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CauseOfLoss", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CauseOfLoss getCauseOfLoss_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CauseOfLoss) TYPE.get().getPropertyValue( this, "_CauseOfLoss_elem" );
  }


  public final void setCauseOfLoss_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CauseOfLoss value ) {
    TYPE.get().setPropertyValue( this, "_CauseOfLoss_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCauseOfLossOld() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CauseOfLossOld" );
  }


  public final void setCauseOfLossOld( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CauseOfLossOld", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CauseOfLossOld getCauseOfLossOld_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CauseOfLossOld) TYPE.get().getPropertyValue( this, "_CauseOfLossOld_elem" );
  }


  public final void setCauseOfLossOld_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.CauseOfLossOld value ) {
    TYPE.get().setPropertyValue( this, "_CauseOfLossOld_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getJvClassOfBusiness() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_JvClassOfBusiness" );
  }


  public final void setJvClassOfBusiness( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_JvClassOfBusiness", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.JvClassOfBusiness getJvClassOfBusiness_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.JvClassOfBusiness) TYPE.get().getPropertyValue( this, "_JvClassOfBusiness_elem" );
  }


  public final void setJvClassOfBusiness_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.JvClassOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_JvClassOfBusiness_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNaicClassOfBusiness() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NaicClassOfBusiness" );
  }


  public final void setNaicClassOfBusiness( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NaicClassOfBusiness", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NaicClassOfBusiness getNaicClassOfBusiness_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NaicClassOfBusiness) TYPE.get().getPropertyValue( this, "_NaicClassOfBusiness_elem" );
  }


  public final void setNaicClassOfBusiness_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.NaicClassOfBusiness value ) {
    TYPE.get().setPropertyValue( this, "_NaicClassOfBusiness_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RiskLocation getRiskLocation() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RiskLocation) TYPE.get().getPropertyValue( this, "_RiskLocation" );
  }


  public final void setRiskLocation( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.RiskLocation value ) {
    TYPE.get().setPropertyValue( this, "_RiskLocation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauSectionItem> getBordereauSectionItem() {
    return (java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauSectionItem>) TYPE.get().getPropertyValue( this, "_BordereauSectionItem" );
  }


  public final void setBordereauSectionItem( java.util.List<gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.BordereauSectionItem> value ) {
    TYPE.get().setPropertyValue( this, "_BordereauSectionItem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.BordereauSectionType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.BordereauSectionType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.BordereauSectionType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
