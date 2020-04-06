/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Endorsement_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Endorsement_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndorsementReference = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "EndorsementReference", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndorsementName = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "EndorsementName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Description = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Description", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EffectiveDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "EffectiveDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.Endorsement_Type" );
    }
  };

  public Endorsement_Type() {
    super( -624174869, TYPE.get() );
  }

  private Endorsement_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -624174869, state );
  }

  protected Endorsement_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Endorsement_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.Endorsement_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.Endorsement_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndorsementReference() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EndorsementReference" );
  }


  public final void setEndorsementReference( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EndorsementReference", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.EndorsementReference getEndorsementReference_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.EndorsementReference) TYPE.get().getPropertyValue( this, "_EndorsementReference_elem" );
  }


  public final void setEndorsementReference_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.EndorsementReference value ) {
    TYPE.get().setPropertyValue( this, "_EndorsementReference_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndorsementName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EndorsementName" );
  }


  public final void setEndorsementName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EndorsementName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.EndorsementName getEndorsementName_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.EndorsementName) TYPE.get().getPropertyValue( this, "_EndorsementName_elem" );
  }


  public final void setEndorsementName_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.EndorsementName value ) {
    TYPE.get().setPropertyValue( this, "_EndorsementName_elem", value );
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
  public final java.lang.String getEffectiveDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EffectiveDate" );
  }


  public final void setEffectiveDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.EffectiveDate getEffectiveDate_elem() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.EffectiveDate) TYPE.get().getPropertyValue( this, "_EffectiveDate_elem" );
  }


  public final void setEffectiveDate_elem( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.EffectiveDate value ) {
    TYPE.get().setPropertyValue( this, "_EffectiveDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.Endorsement_Type_Extension getExtension() {
    return (gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.Endorsement_Type_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.anonymous.elements.Endorsement_Type_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}