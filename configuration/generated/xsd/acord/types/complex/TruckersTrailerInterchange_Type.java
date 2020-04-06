/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class TruckersTrailerInterchange_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "TruckersTrailerInterchange_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FarthestTerminalZoneCd = new javax.xml.namespace.QName( "", "FarthestTerminalZoneCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumDays = new javax.xml.namespace.QName( "", "NumDays", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumTrailers = new javax.xml.namespace.QName( "", "NumTrailers", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RadiusUse = new javax.xml.namespace.QName( "", "RadiusUse", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RadiusCd = new javax.xml.namespace.QName( "", "RadiusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.TruckersTrailerInterchange_Type" );
    }
  };

  public TruckersTrailerInterchange_Type() {
    super( 1206193202, TYPE.get() );
  }

  private TruckersTrailerInterchange_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1206193202, state );
  }

  protected TruckersTrailerInterchange_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected TruckersTrailerInterchange_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.TruckersTrailerInterchange_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.TruckersTrailerInterchange_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFarthestTerminalZoneCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FarthestTerminalZoneCd" );
  }


  public final void setFarthestTerminalZoneCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FarthestTerminalZoneCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FarthestTerminalZoneCd getFarthestTerminalZoneCd_elem() {
    return (xsd.acord.FarthestTerminalZoneCd) TYPE.get().getPropertyValue( this, "_FarthestTerminalZoneCd_elem" );
  }


  public final void setFarthestTerminalZoneCd_elem( xsd.acord.FarthestTerminalZoneCd value ) {
    TYPE.get().setPropertyValue( this, "_FarthestTerminalZoneCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumDays() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumDays" );
  }


  public final void setNumDays( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumDays", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumDays getNumDays_elem() {
    return (xsd.acord.NumDays) TYPE.get().getPropertyValue( this, "_NumDays_elem" );
  }


  public final void setNumDays_elem( xsd.acord.NumDays value ) {
    TYPE.get().setPropertyValue( this, "_NumDays_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumTrailers() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumTrailers" );
  }


  public final void setNumTrailers( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumTrailers", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumTrailers getNumTrailers_elem() {
    return (xsd.acord.NumTrailers) TYPE.get().getPropertyValue( this, "_NumTrailers_elem" );
  }


  public final void setNumTrailers_elem( xsd.acord.NumTrailers value ) {
    TYPE.get().setPropertyValue( this, "_NumTrailers_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RadiusUse getRadiusUse() {
    return (xsd.acord.RadiusUse) TYPE.get().getPropertyValue( this, "_RadiusUse" );
  }


  public final void setRadiusUse( xsd.acord.RadiusUse value ) {
    TYPE.get().setPropertyValue( this, "_RadiusUse", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRadiusCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RadiusCd" );
  }


  public final void setRadiusCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RadiusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RadiusCd getRadiusCd_elem() {
    return (xsd.acord.RadiusCd) TYPE.get().getPropertyValue( this, "_RadiusCd_elem" );
  }


  public final void setRadiusCd_elem( xsd.acord.RadiusCd value ) {
    TYPE.get().setPropertyValue( this, "_RadiusCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.acord.CommlCoverage>) TYPE.get().getPropertyValue( this, "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.acord.CommlCoverage> value ) {
    TYPE.get().setPropertyValue( this, "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.CreditOrSurcharge> getCreditOrSurcharge() {
    return (java.util.List<xsd.acord.CreditOrSurcharge>) TYPE.get().getPropertyValue( this, "_CreditOrSurcharge" );
  }


  public final void setCreditOrSurcharge( java.util.List<xsd.acord.CreditOrSurcharge> value ) {
    TYPE.get().setPropertyValue( this, "_CreditOrSurcharge", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}