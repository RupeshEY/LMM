/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class MiscPartyInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "MiscPartyInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscPartyRoleCd = new javax.xml.namespace.QName( "", "MiscPartyRoleCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscPartySubRoleCd = new javax.xml.namespace.QName( "", "MiscPartySubRoleCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BirthDt = new javax.xml.namespace.QName( "", "BirthDt", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.MiscPartyInfo_Type" );
    }
  };

  public MiscPartyInfo_Type() {
    super( 95873560, TYPE.get() );
  }

  private MiscPartyInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 95873560, state );
  }

  protected MiscPartyInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected MiscPartyInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.MiscPartyInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.MiscPartyInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.RoleType getMiscPartyRoleCd() {
    return (xsd.acord.enums.RoleType) TYPE.get().getPropertyValue( this, "_MiscPartyRoleCd" );
  }


  public final void setMiscPartyRoleCd( xsd.acord.enums.RoleType value ) {
    TYPE.get().setPropertyValue( this, "_MiscPartyRoleCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MiscPartyRoleCd getMiscPartyRoleCd_elem() {
    return (xsd.acord.MiscPartyRoleCd) TYPE.get().getPropertyValue( this, "_MiscPartyRoleCd_elem" );
  }


  public final void setMiscPartyRoleCd_elem( xsd.acord.MiscPartyRoleCd value ) {
    TYPE.get().setPropertyValue( this, "_MiscPartyRoleCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SubRoleType getMiscPartySubRoleCd() {
    return (xsd.acord.enums.SubRoleType) TYPE.get().getPropertyValue( this, "_MiscPartySubRoleCd" );
  }


  public final void setMiscPartySubRoleCd( xsd.acord.enums.SubRoleType value ) {
    TYPE.get().setPropertyValue( this, "_MiscPartySubRoleCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MiscPartySubRoleCd getMiscPartySubRoleCd_elem() {
    return (xsd.acord.MiscPartySubRoleCd) TYPE.get().getPropertyValue( this, "_MiscPartySubRoleCd_elem" );
  }


  public final void setMiscPartySubRoleCd_elem( xsd.acord.MiscPartySubRoleCd value ) {
    TYPE.get().setPropertyValue( this, "_MiscPartySubRoleCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBirthDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BirthDt" );
  }


  public final void setBirthDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BirthDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BirthDt getBirthDt_elem() {
    return (xsd.acord.BirthDt) TYPE.get().getPropertyValue( this, "_BirthDt_elem" );
  }


  public final void setBirthDt_elem( xsd.acord.BirthDt value ) {
    TYPE.get().setPropertyValue( this, "_BirthDt_elem", value );
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