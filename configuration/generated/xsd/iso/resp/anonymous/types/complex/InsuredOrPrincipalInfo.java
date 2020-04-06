/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.iso.resp.types.complex.INSUREDORPRINCIPALENTITY.class)
public class InsuredOrPrincipalInfo extends xsd.iso.resp.types.complex.INSUREDORPRINCIPALENTITY {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipalRoleCd = new javax.xml.namespace.QName( "", "InsuredOrPrincipalRoleCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PersonInfo = new javax.xml.namespace.QName( "", "PersonInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BusinessInfo = new javax.xml.namespace.QName( "", "BusinessInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PrincipalInfo = new javax.xml.namespace.QName( "", "PrincipalInfo", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.InsuredOrPrincipalInfo" );
    }
  };

  public InsuredOrPrincipalInfo() {
    super( -219065485, TYPE.get() );
  }

  private InsuredOrPrincipalInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -219065485, state );
  }

  protected InsuredOrPrincipalInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected InsuredOrPrincipalInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.InsuredOrPrincipalInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.InsuredOrPrincipalInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getInsuredOrPrincipalRoleCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipalRoleCd" );
  }


  public final void setInsuredOrPrincipalRoleCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipalRoleCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.InsuredOrPrincipalInfo_InsuredOrPrincipalRoleCd getInsuredOrPrincipalRoleCd_elem() {
    return (xsd.iso.resp.anonymous.elements.InsuredOrPrincipalInfo_InsuredOrPrincipalRoleCd) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipalRoleCd_elem" );
  }


  public final void setInsuredOrPrincipalRoleCd_elem( xsd.iso.resp.anonymous.elements.InsuredOrPrincipalInfo_InsuredOrPrincipalRoleCd value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipalRoleCd_elem", value );
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