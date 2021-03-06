/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class WorkCompLocInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "WorkCompLocInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SICCd = new javax.xml.namespace.QName( "", "SICCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NAICSCd = new javax.xml.namespace.QName( "", "NAICSCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumEmployees = new javax.xml.namespace.QName( "", "NumEmployees", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WorkCompRateClass = new javax.xml.namespace.QName( "", "WorkCompRateClass", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_HighestFloorNumberOccupied = new javax.xml.namespace.QName( "", "HighestFloorNumberOccupied", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_LocationRef = new javax.xml.namespace.QName( "", "LocationRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_NameInfoRef = new javax.xml.namespace.QName( "", "NameInfoRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.WorkCompLocInfo_Type" );
    }
  };

  public WorkCompLocInfo_Type() {
    super( 280726290, TYPE.get() );
  }

  private WorkCompLocInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 280726290, state );
  }

  protected WorkCompLocInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected WorkCompLocInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.WorkCompLocInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.WorkCompLocInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSICCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SICCd" );
  }


  public final void setSICCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SICCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SICCd getSICCd_elem() {
    return (xsd.acord.SICCd) TYPE.get().getPropertyValue( this, "_SICCd_elem" );
  }


  public final void setSICCd_elem( xsd.acord.SICCd value ) {
    TYPE.get().setPropertyValue( this, "_SICCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNAICSCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NAICSCd" );
  }


  public final void setNAICSCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NAICSCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NAICSCd getNAICSCd_elem() {
    return (xsd.acord.NAICSCd) TYPE.get().getPropertyValue( this, "_NAICSCd_elem" );
  }


  public final void setNAICSCd_elem( xsd.acord.NAICSCd value ) {
    TYPE.get().setPropertyValue( this, "_NAICSCd_elem", value );
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
  public final java.util.List<xsd.acord.WorkCompRateClass> getWorkCompRateClass() {
    return (java.util.List<xsd.acord.WorkCompRateClass>) TYPE.get().getPropertyValue( this, "_WorkCompRateClass" );
  }


  public final void setWorkCompRateClass( java.util.List<xsd.acord.WorkCompRateClass> value ) {
    TYPE.get().setPropertyValue( this, "_WorkCompRateClass", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getHighestFloorNumberOccupied() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_HighestFloorNumberOccupied" );
  }


  public final void setHighestFloorNumberOccupied( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_HighestFloorNumberOccupied", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.HighestFloorNumberOccupied getHighestFloorNumberOccupied_elem() {
    return (xsd.acord.HighestFloorNumberOccupied) TYPE.get().getPropertyValue( this, "_HighestFloorNumberOccupied_elem" );
  }


  public final void setHighestFloorNumberOccupied_elem( xsd.acord.HighestFloorNumberOccupied value ) {
    TYPE.get().setPropertyValue( this, "_HighestFloorNumberOccupied_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getLocationRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_LocationRef" );
  }


  public final void setLocationRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_LocationRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getNameInfoRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_NameInfoRef" );
  }


  public final void setNameInfoRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_NameInfoRef", value );
  }

}
