/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.londonmarket.acordmsgsvc.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class MEASUREMENTX_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "MEASUREMENTX_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumUnits = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "NumUnits", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnitMeasurementCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1", "UnitMeasurementCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.londonmarket.acordmsgsvc.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.londonmarket.acordmsgsvc.types.complex.MEASUREMENTX_Type" );
    }
  };

  public MEASUREMENTX_Type() {
    super( 812009888, TYPE.get() );
  }

  private MEASUREMENTX_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 812009888, state );
  }

  protected MEASUREMENTX_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected MEASUREMENTX_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.londonmarket.acordmsgsvc.types.complex.MEASUREMENTX_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.londonmarket.acordmsgsvc.types.complex.MEASUREMENTX_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNumUnits() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_NumUnits" );
  }


  public final void setNumUnits( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_NumUnits", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.acordmsgsvc.NumUnits getNumUnits_elem() {
    return (gw.acc.iplm.xsd.londonmarket.acordmsgsvc.NumUnits) TYPE.get().getPropertyValue( this, "_NumUnits_elem" );
  }


  public final void setNumUnits_elem( gw.acc.iplm.xsd.londonmarket.acordmsgsvc.NumUnits value ) {
    TYPE.get().setPropertyValue( this, "_NumUnits_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getUnitMeasurementCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_UnitMeasurementCd" );
  }


  public final void setUnitMeasurementCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_UnitMeasurementCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.londonmarket.acordmsgsvc.UnitMeasurementCd getUnitMeasurementCd_elem() {
    return (gw.acc.iplm.xsd.londonmarket.acordmsgsvc.UnitMeasurementCd) TYPE.get().getPropertyValue( this, "_UnitMeasurementCd_elem" );
  }


  public final void setUnitMeasurementCd_elem( gw.acc.iplm.xsd.londonmarket.acordmsgsvc.UnitMeasurementCd value ) {
    TYPE.get().setPropertyValue( this, "_UnitMeasurementCd_elem", value );
  }

}
