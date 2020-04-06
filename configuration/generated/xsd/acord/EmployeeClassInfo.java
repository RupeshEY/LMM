/* Generated by Guidewire XML Code Generator */

package xsd.acord;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class EmployeeClassInfo extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "EmployeeClassInfo", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OccupationClassInfo = new javax.xml.namespace.QName( "", "OccupationClassInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployees = new javax.xml.namespace.QName( "", "NumEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumOfficers = new javax.xml.namespace.QName( "", "NumOfficers", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployeesHandleMoneySecurities = new javax.xml.namespace.QName( "", "NumEmployeesHandleMoneySecurities", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumLeasedEmployees = new javax.xml.namespace.QName( "", "NumLeasedEmployees", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.EmployeeClassInfo" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.EmployeeClassInfo_Type" );
    }
  };

  public EmployeeClassInfo() {
    super( 196676676, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new xsd.acord.types.complex.EmployeeClassInfo_Type() );
  }

  public EmployeeClassInfo( xsd.acord.types.complex.EmployeeClassInfo_Type typeInstance ) {
    super( 196676676, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private EmployeeClassInfo( gw.internal.xml.XmlElementState state ) {
    super( 196676676, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends xsd.acord.EmployeeClassInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final xsd.acord.types.complex.EmployeeClassInfo_Type get$TypeInstance() {
    return super.get$TypeInstance().cast( xsd.acord.types.complex.EmployeeClassInfo_Type.class );
  }

  public final void set$TypeInstance( xsd.acord.types.complex.EmployeeClassInfo_Type typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }

  public static xsd.acord.EmployeeClassInfo parse( byte[] bytes ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, null ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( byte[] bytes, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), bytes, options ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.io.File file ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, null ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), file, options ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.io.InputStream stream ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, null ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.io.InputStream stream, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), stream, options ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.io.Reader reader ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, null ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), reader, options ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.lang.String xmlString ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, null ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), xmlString, options ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.net.URL url ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, null ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), url, options ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.nio.file.Path path ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, null ).cast( xsd.acord.EmployeeClassInfo.class );
  }

  public static xsd.acord.EmployeeClassInfo parse( java.nio.file.Path path, gw.xml.XmlParseOptions options ) {
    return gw.internal.xml.XmlElementInternals.instance().cg_parse( TYPE.get(), path, options ).cast( xsd.acord.EmployeeClassInfo.class );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.OccupationClassInfo> getOccupationClassInfo() {
    return (java.util.List<xsd.acord.OccupationClassInfo>) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_OccupationClassInfo" );
  }


  public final void setOccupationClassInfo( java.util.List<xsd.acord.OccupationClassInfo> value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_OccupationClassInfo", value );
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
  public final java.lang.Integer getNumOfficers() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumOfficers" );
  }


  public final void setNumOfficers( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumOfficers", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumOfficers getNumOfficers_elem() {
    return (xsd.acord.NumOfficers) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumOfficers_elem" );
  }


  public final void setNumOfficers_elem( xsd.acord.NumOfficers value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumOfficers_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumEmployeesHandleMoneySecurities() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesHandleMoneySecurities" );
  }


  public final void setNumEmployeesHandleMoneySecurities( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesHandleMoneySecurities", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumEmployeesHandleMoneySecurities getNumEmployeesHandleMoneySecurities_elem() {
    return (xsd.acord.NumEmployeesHandleMoneySecurities) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumEmployeesHandleMoneySecurities_elem" );
  }


  public final void setNumEmployeesHandleMoneySecurities_elem( xsd.acord.NumEmployeesHandleMoneySecurities value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumEmployeesHandleMoneySecurities_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumLeasedEmployees() {
    return (java.lang.Integer) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLeasedEmployees" );
  }


  public final void setNumLeasedEmployees( java.lang.Integer value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLeasedEmployees", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumLeasedEmployees getNumLeasedEmployees_elem() {
    return (xsd.acord.NumLeasedEmployees) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_NumLeasedEmployees_elem" );
  }


  public final void setNumLeasedEmployees_elem( xsd.acord.NumLeasedEmployees value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_NumLeasedEmployees_elem", value );
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