/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.simple.DecType.class)
public class RateType extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "RateType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_RateUnit = new javax.xml.namespace.QName( "", "RateUnit", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.RateType" );
    }
  };

  public RateType() {
    super( -1117441958, TYPE.get() );
  }

  public RateType( java.math.BigDecimal value ) {
    this();
    setValue( value );
  }

  private RateType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1117441958, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.RateType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.jv_ins_reinsurance_2005_2_dri_slice.types.complex.RateType get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getValue() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal get$Value() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRateUnit() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RateUnit" );
  }


  public final void setRateUnit( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RateUnit", value );
  }

}
