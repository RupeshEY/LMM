/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ResidenceEmployees_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ResidenceEmployees_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EmployeeStatusCd = new javax.xml.namespace.QName( "", "EmployeeStatusCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WhereWorkPerformedCd = new javax.xml.namespace.QName( "", "WhereWorkPerformedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployees = new javax.xml.namespace.QName( "", "NumEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumHoursPerWeek = new javax.xml.namespace.QName( "", "NumHoursPerWeek", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DutiesDesc = new javax.xml.namespace.QName( "", "DutiesDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ResidenceEmployees_Type" );
    }
  };

  public ResidenceEmployees_Type() {
    super( -1084932397, TYPE.get() );
  }

  private ResidenceEmployees_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1084932397, state );
  }

  protected ResidenceEmployees_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ResidenceEmployees_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ResidenceEmployees_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ResidenceEmployees_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.EmployeeStatus getEmployeeStatusCd() {
    return (xsd.acord.enums.EmployeeStatus) TYPE.get().getPropertyValue( this, "_EmployeeStatusCd" );
  }


  public final void setEmployeeStatusCd( xsd.acord.enums.EmployeeStatus value ) {
    TYPE.get().setPropertyValue( this, "_EmployeeStatusCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EmployeeStatusCd getEmployeeStatusCd_elem() {
    return (xsd.acord.EmployeeStatusCd) TYPE.get().getPropertyValue( this, "_EmployeeStatusCd_elem" );
  }


  public final void setEmployeeStatusCd_elem( xsd.acord.EmployeeStatusCd value ) {
    TYPE.get().setPropertyValue( this, "_EmployeeStatusCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.WorkPerformed getWhereWorkPerformedCd() {
    return (xsd.acord.enums.WorkPerformed) TYPE.get().getPropertyValue( this, "_WhereWorkPerformedCd" );
  }


  public final void setWhereWorkPerformedCd( xsd.acord.enums.WorkPerformed value ) {
    TYPE.get().setPropertyValue( this, "_WhereWorkPerformedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WhereWorkPerformedCd getWhereWorkPerformedCd_elem() {
    return (xsd.acord.WhereWorkPerformedCd) TYPE.get().getPropertyValue( this, "_WhereWorkPerformedCd_elem" );
  }


  public final void setWhereWorkPerformedCd_elem( xsd.acord.WhereWorkPerformedCd value ) {
    TYPE.get().setPropertyValue( this, "_WhereWorkPerformedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployees() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumEmployees" );
  }


  public final void setNumEmployees( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumEmployees", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployees getNumEmployees_elem() {
    return (xsd.acord.NumEmployees) TYPE.get().getPropertyValue( this, "_NumEmployees_elem" );
  }


  public final void setNumEmployees_elem( xsd.acord.NumEmployees value ) {
    TYPE.get().setPropertyValue( this, "_NumEmployees_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.math.BigDecimal getNumHoursPerWeek() {
    return (java.math.BigDecimal) TYPE.get().getPropertyValue( this, "_NumHoursPerWeek" );
  }


  public final void setNumHoursPerWeek( java.math.BigDecimal value ) {
    TYPE.get().setPropertyValue( this, "_NumHoursPerWeek", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumHoursPerWeek getNumHoursPerWeek_elem() {
    return (xsd.acord.NumHoursPerWeek) TYPE.get().getPropertyValue( this, "_NumHoursPerWeek_elem" );
  }


  public final void setNumHoursPerWeek_elem( xsd.acord.NumHoursPerWeek value ) {
    TYPE.get().setPropertyValue( this, "_NumHoursPerWeek_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getDutiesDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_DutiesDesc" );
  }


  public final void setDutiesDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_DutiesDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DutiesDesc getDutiesDesc_elem() {
    return (xsd.acord.DutiesDesc) TYPE.get().getPropertyValue( this, "_DutiesDesc_elem" );
  }


  public final void setDutiesDesc_elem( xsd.acord.DutiesDesc value ) {
    TYPE.get().setPropertyValue( this, "_DutiesDesc_elem", value );
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
