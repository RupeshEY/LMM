/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BankInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BankInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BankId = new javax.xml.namespace.QName( "", "BankId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BranchId = new javax.xml.namespace.QName( "", "BranchId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MiscParty = new javax.xml.namespace.QName( "", "MiscParty", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BankInfo_Type" );
    }
  };

  public BankInfo_Type() {
    super( 711589640, TYPE.get() );
  }

  private BankInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 711589640, state );
  }

  protected BankInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BankInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.BankInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.BankInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBankId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BankId" );
  }


  public final void setBankId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BankId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BankId getBankId_elem() {
    return (xsd.acord.BankId) TYPE.get().getPropertyValue( this, "_BankId_elem" );
  }


  public final void setBankId_elem( xsd.acord.BankId value ) {
    TYPE.get().setPropertyValue( this, "_BankId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBranchId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BranchId" );
  }


  public final void setBranchId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BranchId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BranchId getBranchId_elem() {
    return (xsd.acord.BranchId) TYPE.get().getPropertyValue( this, "_BranchId_elem" );
  }


  public final void setBranchId_elem( xsd.acord.BranchId value ) {
    TYPE.get().setPropertyValue( this, "_BranchId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.MiscParty> getMiscParty() {
    return (java.util.List<xsd.acord.MiscParty>) TYPE.get().getPropertyValue( this, "_MiscParty" );
  }


  public final void setMiscParty( java.util.List<xsd.acord.MiscParty> value ) {
    TYPE.get().setPropertyValue( this, "_MiscParty", value );
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