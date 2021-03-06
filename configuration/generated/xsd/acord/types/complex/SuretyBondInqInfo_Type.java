/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SuretyBondInqInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SuretyBondInqInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_InsuredOrPrincipal = new javax.xml.namespace.QName( "", "InsuredOrPrincipal", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PartialSuretyBond = new javax.xml.namespace.QName( "", "PartialSuretyBond", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuretyBondSearchInfo = new javax.xml.namespace.QName( "", "SuretyBondSearchInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AccountNumberId = new javax.xml.namespace.QName( "", "AccountNumberId", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SuretyBondInqInfo_Type" );
    }
  };

  public SuretyBondInqInfo_Type() {
    super( 2108534819, TYPE.get() );
  }

  private SuretyBondInqInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 2108534819, state );
  }

  protected SuretyBondInqInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SuretyBondInqInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.SuretyBondInqInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.SuretyBondInqInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.InsuredOrPrincipal> getInsuredOrPrincipal() {
    return (java.util.List<xsd.acord.InsuredOrPrincipal>) TYPE.get().getPropertyValue( this, "_InsuredOrPrincipal" );
  }


  public final void setInsuredOrPrincipal( java.util.List<xsd.acord.InsuredOrPrincipal> value ) {
    TYPE.get().setPropertyValue( this, "_InsuredOrPrincipal", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.PartialSuretyBond> getPartialSuretyBond() {
    return (java.util.List<xsd.acord.PartialSuretyBond>) TYPE.get().getPropertyValue( this, "_PartialSuretyBond" );
  }


  public final void setPartialSuretyBond( java.util.List<xsd.acord.PartialSuretyBond> value ) {
    TYPE.get().setPropertyValue( this, "_PartialSuretyBond", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SuretyBondSearchInfo> getSuretyBondSearchInfo() {
    return (java.util.List<xsd.acord.SuretyBondSearchInfo>) TYPE.get().getPropertyValue( this, "_SuretyBondSearchInfo" );
  }


  public final void setSuretyBondSearchInfo( java.util.List<xsd.acord.SuretyBondSearchInfo> value ) {
    TYPE.get().setPropertyValue( this, "_SuretyBondSearchInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAccountNumberId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AccountNumberId" );
  }


  public final void setAccountNumberId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AccountNumberId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AccountNumberId getAccountNumberId_elem() {
    return (xsd.acord.AccountNumberId) TYPE.get().getPropertyValue( this, "_AccountNumberId_elem" );
  }


  public final void setAccountNumberId_elem( xsd.acord.AccountNumberId value ) {
    TYPE.get().setPropertyValue( this, "_AccountNumberId_elem", value );
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
