/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CalculationPeriodType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "CalculationPeriodType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "StartDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndDate = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndDate", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StartDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "StartDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EndDateTime = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "EndDateTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeDuration = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "TimeDuration", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Extension = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/1", "Extension", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.CalculationPeriodType" );
    }
  };

  public CalculationPeriodType() {
    super( 428027915, TYPE.get() );
  }

  private CalculationPeriodType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 428027915, state );
  }

  protected CalculationPeriodType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CalculationPeriodType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.CalculationPeriodType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.types.complex.CalculationPeriodType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStartDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StartDate" );
  }


  public final void setStartDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StartDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDate getStartDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDate) TYPE.get().getPropertyValue( this, "_StartDate_elem" );
  }


  public final void setStartDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDate value ) {
    TYPE.get().setPropertyValue( this, "_StartDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndDate() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EndDate" );
  }


  public final void setEndDate( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EndDate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDate getEndDate_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDate) TYPE.get().getPropertyValue( this, "_EndDate_elem" );
  }


  public final void setEndDate_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDate value ) {
    TYPE.get().setPropertyValue( this, "_EndDate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStartDateTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_StartDateTime" );
  }


  public final void setStartDateTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_StartDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDateTime getStartDateTime_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDateTime) TYPE.get().getPropertyValue( this, "_StartDateTime_elem" );
  }


  public final void setStartDateTime_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.StartDateTime value ) {
    TYPE.get().setPropertyValue( this, "_StartDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEndDateTime() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EndDateTime" );
  }


  public final void setEndDateTime( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EndDateTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDateTime getEndDateTime_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDateTime) TYPE.get().getPropertyValue( this, "_EndDateTime_elem" );
  }


  public final void setEndDateTime_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.EndDateTime value ) {
    TYPE.get().setPropertyValue( this, "_EndDateTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getTimeDuration() {
    return (java.lang.Long) TYPE.get().getPropertyValue( this, "_TimeDuration" );
  }


  public final void setTimeDuration( java.lang.Long value ) {
    TYPE.get().setPropertyValue( this, "_TimeDuration", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeDuration getTimeDuration_elem() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeDuration) TYPE.get().getPropertyValue( this, "_TimeDuration_elem" );
  }


  public final void setTimeDuration_elem( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.TimeDuration value ) {
    TYPE.get().setPropertyValue( this, "_TimeDuration_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.CalculationPeriodType_Extension getExtension() {
    return (gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.CalculationPeriodType_Extension) TYPE.get().getPropertyValue( this, "_Extension" );
  }


  public final void setExtension( gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.anonymous.elements.CalculationPeriodType_Extension value ) {
    TYPE.get().setPropertyValue( this, "_Extension", value );
  }

}
