/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class EmployeeCountInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "EmployeeCountInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EmployeeCountryCd = new javax.xml.namespace.QName( "", "EmployeeCountryCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UnionInd = new javax.xml.namespace.QName( "", "UnionInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SalaryRangeInfo = new javax.xml.namespace.QName( "", "SalaryRangeInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeSpan = new javax.xml.namespace.QName( "", "TimeSpan", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesFullTime = new javax.xml.namespace.QName( "", "NumEmployeesFullTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesPartTime = new javax.xml.namespace.QName( "", "NumEmployeesPartTime", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumSeasonalEmployees = new javax.xml.namespace.QName( "", "NumSeasonalEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumTemporaryEmployees = new javax.xml.namespace.QName( "", "NumTemporaryEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesResigned = new javax.xml.namespace.QName( "", "NumEmployeesResigned", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesTerminated = new javax.xml.namespace.QName( "", "NumEmployeesTerminated", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesLeased = new javax.xml.namespace.QName( "", "NumEmployeesLeased", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumIndependantContractors = new javax.xml.namespace.QName( "", "NumIndependantContractors", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployees = new javax.xml.namespace.QName( "", "NumEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesExempt = new javax.xml.namespace.QName( "", "NumEmployeesExempt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesNonExempt = new javax.xml.namespace.QName( "", "NumEmployeesNonExempt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumLocations = new javax.xml.namespace.QName( "", "NumLocations", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.EmployeeCountInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.EmployeeCountInfo_Type" );
    }
  };

  public EmployeeCountInfo() {
    super( 1558122587, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.EmployeeCountInfo_Type() );
  }

  public EmployeeCountInfo( xsd.acord.types.complex.EmployeeCountInfo_Type typeInstance ) {
    super( 1558122587, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private EmployeeCountInfo( gw.internal.xml.XmlElementState state ) {
    super( 1558122587, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.EmployeeCountInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.EmployeeCountInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.EmployeeCountInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.EmployeeCountInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.EmployeeCountInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.EmployeeCountInfo.class );
  }

  public static xsd.acord.EmployeeCountInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.EmployeeCountInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getStateProvCd() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StateProvCd" );
  }


  public final void setStateProvCd( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StateProvCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.StateProvCd getStateProvCd_elem() {
    return (xsd.acord.StateProvCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( xsd.acord.StateProvCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_StateProvCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.EmployeeCountry getEmployeeCountryCd() {
    return (xsd.acord.enums.EmployeeCountry) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EmployeeCountryCd" );
  }


  public final void setEmployeeCountryCd( xsd.acord.enums.EmployeeCountry value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EmployeeCountryCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.EmployeeCountryCd getEmployeeCountryCd_elem() {
    return (xsd.acord.EmployeeCountryCd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_EmployeeCountryCd_elem" );
  }


  public final void setEmployeeCountryCd_elem( xsd.acord.EmployeeCountryCd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_EmployeeCountryCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getUnionInd() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UnionInd" );
  }


  public final void setUnionInd( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UnionInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UnionInd getUnionInd_elem() {
    return (xsd.acord.UnionInd) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_UnionInd_elem" );
  }


  public final void setUnionInd_elem( xsd.acord.UnionInd value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_UnionInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SalaryRangeInfo getSalaryRangeInfo() {
    return (xsd.acord.SalaryRangeInfo) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_SalaryRangeInfo" );
  }


  public final void setSalaryRangeInfo( xsd.acord.SalaryRangeInfo value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_SalaryRangeInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.TimeSpan getTimeSpan() {
    return (xsd.acord.TimeSpan) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_TimeSpan" );
  }


  public final void setTimeSpan( xsd.acord.TimeSpan value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_TimeSpan", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesFullTime() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesFullTime" );
  }


  public final void setNumEmployeesFullTime( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesFullTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesFullTime getNumEmployeesFullTime_elem() {
    return (xsd.acord.NumEmployeesFullTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesFullTime_elem" );
  }


  public final void setNumEmployeesFullTime_elem( xsd.acord.NumEmployeesFullTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesFullTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesPartTime() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesPartTime" );
  }


  public final void setNumEmployeesPartTime( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesPartTime", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesPartTime getNumEmployeesPartTime_elem() {
    return (xsd.acord.NumEmployeesPartTime) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesPartTime_elem" );
  }


  public final void setNumEmployeesPartTime_elem( xsd.acord.NumEmployeesPartTime value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesPartTime_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumSeasonalEmployees() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumSeasonalEmployees" );
  }


  public final void setNumSeasonalEmployees( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumSeasonalEmployees", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumSeasonalEmployees getNumSeasonalEmployees_elem() {
    return (xsd.acord.NumSeasonalEmployees) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumSeasonalEmployees_elem" );
  }


  public final void setNumSeasonalEmployees_elem( xsd.acord.NumSeasonalEmployees value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumSeasonalEmployees_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumTemporaryEmployees() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumTemporaryEmployees" );
  }


  public final void setNumTemporaryEmployees( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumTemporaryEmployees", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumTemporaryEmployees getNumTemporaryEmployees_elem() {
    return (xsd.acord.NumTemporaryEmployees) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumTemporaryEmployees_elem" );
  }


  public final void setNumTemporaryEmployees_elem( xsd.acord.NumTemporaryEmployees value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumTemporaryEmployees_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesResigned() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesResigned" );
  }


  public final void setNumEmployeesResigned( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesResigned", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesResigned getNumEmployeesResigned_elem() {
    return (xsd.acord.NumEmployeesResigned) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesResigned_elem" );
  }


  public final void setNumEmployeesResigned_elem( xsd.acord.NumEmployeesResigned value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesResigned_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesTerminated() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesTerminated" );
  }


  public final void setNumEmployeesTerminated( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesTerminated", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesTerminated getNumEmployeesTerminated_elem() {
    return (xsd.acord.NumEmployeesTerminated) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesTerminated_elem" );
  }


  public final void setNumEmployeesTerminated_elem( xsd.acord.NumEmployeesTerminated value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesTerminated_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesLeased() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesLeased" );
  }


  public final void setNumEmployeesLeased( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesLeased", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesLeased getNumEmployeesLeased_elem() {
    return (xsd.acord.NumEmployeesLeased) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesLeased_elem" );
  }


  public final void setNumEmployeesLeased_elem( xsd.acord.NumEmployeesLeased value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesLeased_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumIndependantContractors() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumIndependantContractors" );
  }


  public final void setNumIndependantContractors( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumIndependantContractors", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumIndependantContractors getNumIndependantContractors_elem() {
    return (xsd.acord.NumIndependantContractors) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumIndependantContractors_elem" );
  }


  public final void setNumIndependantContractors_elem( xsd.acord.NumIndependantContractors value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumIndependantContractors_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployees() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployees" );
  }


  public final void setNumEmployees( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployees", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployees getNumEmployees_elem() {
    return (xsd.acord.NumEmployees) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployees_elem" );
  }


  public final void setNumEmployees_elem( xsd.acord.NumEmployees value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployees_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesExempt() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesExempt" );
  }


  public final void setNumEmployeesExempt( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesExempt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesExempt getNumEmployeesExempt_elem() {
    return (xsd.acord.NumEmployeesExempt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesExempt_elem" );
  }


  public final void setNumEmployeesExempt_elem( xsd.acord.NumEmployeesExempt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesExempt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesNonExempt() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesNonExempt" );
  }


  public final void setNumEmployeesNonExempt( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesNonExempt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesNonExempt getNumEmployeesNonExempt_elem() {
    return (xsd.acord.NumEmployeesNonExempt) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesNonExempt_elem" );
  }


  public final void setNumEmployeesNonExempt_elem( xsd.acord.NumEmployeesNonExempt value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesNonExempt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumLocations() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLocations" );
  }


  public final void setNumLocations( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLocations", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumLocations getNumLocations_elem() {
    return (xsd.acord.NumLocations) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLocations_elem" );
  }


  public final void setNumLocations_elem( xsd.acord.NumLocations value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLocations_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Id", value );
  }
}
