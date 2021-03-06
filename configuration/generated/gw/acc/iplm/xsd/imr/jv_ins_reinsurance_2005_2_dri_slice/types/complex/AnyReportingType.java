/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class AnyReportingType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "AnyReportingType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReportDue = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "ReportDue", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProvisionFrequency = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "ProvisionFrequency", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AnnualAsOfDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "AnnualAsOfDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.AnyReportingType" );
    }
  };

  public AnyReportingType() {
    super( 675637276, TYPE.get() );
  }

  private AnyReportingType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 675637276, state );
  }

  protected AnyReportingType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected AnyReportingType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.AnyReportingType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.AnyReportingType get$TypeInstance() {
    return this;
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
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReportDue getReportDue() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReportDue) TYPE.get().getPropertyValue( this, "_ReportDue" );
  }


  public final void setReportDue( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ReportDue value ) {
    TYPE.get().setPropertyValue( this, "_ReportDue", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getProvisionFrequency() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ProvisionFrequency" );
  }


  public final void setProvisionFrequency( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ProvisionFrequency", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ProvisionFrequency getProvisionFrequency_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ProvisionFrequency) TYPE.get().getPropertyValue( this, "_ProvisionFrequency_elem" );
  }


  public final void setProvisionFrequency_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.ProvisionFrequency value ) {
    TYPE.get().setPropertyValue( this, "_ProvisionFrequency_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAnnualAsOfDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AnnualAsOfDate" );
  }


  public final void setAnnualAsOfDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AnnualAsOfDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.AnnualAsOfDate getAnnualAsOfDate_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.AnnualAsOfDate) TYPE.get().getPropertyValue( this, "_AnnualAsOfDate_elem" );
  }


  public final void setAnnualAsOfDate_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.AnnualAsOfDate value ) {
    TYPE.get().setPropertyValue( this, "_AnnualAsOfDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.AnyReportingType_Extension getExtension() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.AnyReportingType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.AnyReportingType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
