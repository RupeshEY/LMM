/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class FloodWindPolicyInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "FloodWindPolicyInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FloodPostFirmInd = new javax.xml.namespace.QName( "", "FloodPostFirmInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Elevation = new javax.xml.namespace.QName( "", "Elevation", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FloodFormCd = new javax.xml.namespace.QName( "", "FloodFormCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FloodZoneCd = new javax.xml.namespace.QName( "", "FloodZoneCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WindFormCd = new javax.xml.namespace.QName( "", "WindFormCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_WindZoneCd = new javax.xml.namespace.QName( "", "WindZoneCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.FloodWindPolicyInfo_Type" );
    }
  };

  public FloodWindPolicyInfo_Type() {
    super( -1014047238, TYPE.get() );
  }

  private FloodWindPolicyInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1014047238, state );
  }

  protected FloodWindPolicyInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected FloodWindPolicyInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.FloodWindPolicyInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.FloodWindPolicyInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFloodPostFirmInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_FloodPostFirmInd" );
  }


  public final void setFloodPostFirmInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_FloodPostFirmInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FloodPostFirmInd getFloodPostFirmInd_elem() {
    return (xsd.acord.FloodPostFirmInd) TYPE.get().getPropertyValue( this, "_FloodPostFirmInd_elem" );
  }


  public final void setFloodPostFirmInd_elem( xsd.acord.FloodPostFirmInd value ) {
    TYPE.get().setPropertyValue( this, "_FloodPostFirmInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Elevation getElevation() {
    return (xsd.acord.Elevation) TYPE.get().getPropertyValue( this, "_Elevation" );
  }


  public final void setElevation( xsd.acord.Elevation value ) {
    TYPE.get().setPropertyValue( this, "_Elevation", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.FormType getFloodFormCd() {
    return (xsd.acord.enums.FormType) TYPE.get().getPropertyValue( this, "_FloodFormCd" );
  }


  public final void setFloodFormCd( xsd.acord.enums.FormType value ) {
    TYPE.get().setPropertyValue( this, "_FloodFormCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FloodFormCd getFloodFormCd_elem() {
    return (xsd.acord.FloodFormCd) TYPE.get().getPropertyValue( this, "_FloodFormCd_elem" );
  }


  public final void setFloodFormCd_elem( xsd.acord.FloodFormCd value ) {
    TYPE.get().setPropertyValue( this, "_FloodFormCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getFloodZoneCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_FloodZoneCd" );
  }


  public final void setFloodZoneCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_FloodZoneCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FloodZoneCd getFloodZoneCd_elem() {
    return (xsd.acord.FloodZoneCd) TYPE.get().getPropertyValue( this, "_FloodZoneCd_elem" );
  }


  public final void setFloodZoneCd_elem( xsd.acord.FloodZoneCd value ) {
    TYPE.get().setPropertyValue( this, "_FloodZoneCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.FormType getWindFormCd() {
    return (xsd.acord.enums.FormType) TYPE.get().getPropertyValue( this, "_WindFormCd" );
  }


  public final void setWindFormCd( xsd.acord.enums.FormType value ) {
    TYPE.get().setPropertyValue( this, "_WindFormCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WindFormCd getWindFormCd_elem() {
    return (xsd.acord.WindFormCd) TYPE.get().getPropertyValue( this, "_WindFormCd_elem" );
  }


  public final void setWindFormCd_elem( xsd.acord.WindFormCd value ) {
    TYPE.get().setPropertyValue( this, "_WindFormCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getWindZoneCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_WindZoneCd" );
  }


  public final void setWindZoneCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_WindZoneCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.WindZoneCd getWindZoneCd_elem() {
    return (xsd.acord.WindZoneCd) TYPE.get().getPropertyValue( this, "_WindZoneCd_elem" );
  }


  public final void setWindZoneCd_elem( xsd.acord.WindZoneCd value ) {
    TYPE.get().setPropertyValue( this, "_WindZoneCd_elem", value );
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
