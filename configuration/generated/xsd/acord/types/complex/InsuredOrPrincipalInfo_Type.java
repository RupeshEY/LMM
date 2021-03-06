/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class InsuredOrPrincipalInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "InsuredOrPrincipalInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipalRoleCd = new javax.xml.namespace.QName( "", "InsuredOrPrincipalRoleCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipalRoleDesc = new javax.xml.namespace.QName( "", "InsuredOrPrincipalRoleDesc", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonInfo = new javax.xml.namespace.QName( "", "PersonInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessInfo = new javax.xml.namespace.QName( "", "BusinessInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrincipalInfo = new javax.xml.namespace.QName( "", "PrincipalInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.InsuredOrPrincipalInfo_Type" );
    }
  };

  public InsuredOrPrincipalInfo_Type() {
    super( -1953754909, TYPE.get() );
  }

  private InsuredOrPrincipalInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1953754909, state );
  }

  protected InsuredOrPrincipalInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected InsuredOrPrincipalInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.InsuredOrPrincipalInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.InsuredOrPrincipalInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.enums.InsuredPrincipalRoleType> getInsuredOrPrincipalRoleCd() {
    return (java.util.List<xsd.acord.enums.InsuredPrincipalRoleType>) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipalRoleCd" );
  }


  public final void setInsuredOrPrincipalRoleCd( java.util.List<xsd.acord.enums.InsuredPrincipalRoleType> value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipalRoleCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipalRoleCd> getInsuredOrPrincipalRoleCd_elem() {
    return (java.util.List<xsd.acord.InsuredOrPrincipalRoleCd>) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipalRoleCd_elem" );
  }


  public final void setInsuredOrPrincipalRoleCd_elem( java.util.List<xsd.acord.InsuredOrPrincipalRoleCd> value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipalRoleCd_elem", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsuredOrPrincipalRoleDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipalRoleDesc" );
  }


  public final void setInsuredOrPrincipalRoleDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipalRoleDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.InsuredOrPrincipalRoleDesc getInsuredOrPrincipalRoleDesc_elem() {
    return (xsd.acord.InsuredOrPrincipalRoleDesc) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipalRoleDesc_elem" );
  }


  public final void setInsuredOrPrincipalRoleDesc_elem( xsd.acord.InsuredOrPrincipalRoleDesc value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipalRoleDesc_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PersonInfo getPersonInfo() {
    return (xsd.acord.PersonInfo) TYPE.get().getPropertyValue( this, "_PersonInfo" );
  }


  public final void setPersonInfo( xsd.acord.PersonInfo value ) {
    TYPE.get().setPropertyValue( this, "_PersonInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BusinessInfo getBusinessInfo() {
    return (xsd.acord.BusinessInfo) TYPE.get().getPropertyValue( this, "_BusinessInfo" );
  }


  public final void setBusinessInfo( xsd.acord.BusinessInfo value ) {
    TYPE.get().setPropertyValue( this, "_BusinessInfo", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PrincipalInfo getPrincipalInfo() {
    return (xsd.acord.PrincipalInfo) TYPE.get().getPropertyValue( this, "_PrincipalInfo" );
  }


  public final void setPrincipalInfo( xsd.acord.PrincipalInfo value ) {
    TYPE.get().setPropertyValue( this, "_PrincipalInfo", value );
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
