/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SupplementaryNameInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SupplementaryNameInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SupplementaryNameCd = new javax.xml.namespace.QName( "", "SupplementaryNameCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SupplementaryName = new javax.xml.namespace.QName( "", "SupplementaryName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BranchId = new javax.xml.namespace.QName( "", "BranchId", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SupplementaryNameInfo_Type" );
    }
  };

  public SupplementaryNameInfo_Type() {
    super( -882926024, TYPE.get() );
  }

  private SupplementaryNameInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -882926024, state );
  }

  protected SupplementaryNameInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SupplementaryNameInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.SupplementaryNameInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.SupplementaryNameInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SupplementaryNameType getSupplementaryNameCd() {
    return (xsd.acord.enums.SupplementaryNameType) TYPE.get().getPropertyValue( this, "_SupplementaryNameCd" );
  }


  public final void setSupplementaryNameCd( xsd.acord.enums.SupplementaryNameType value ) {
    TYPE.get().setPropertyValue( this, "_SupplementaryNameCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SupplementaryNameCd getSupplementaryNameCd_elem() {
    return (xsd.acord.SupplementaryNameCd) TYPE.get().getPropertyValue( this, "_SupplementaryNameCd_elem" );
  }


  public final void setSupplementaryNameCd_elem( xsd.acord.SupplementaryNameCd value ) {
    TYPE.get().setPropertyValue( this, "_SupplementaryNameCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSupplementaryName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SupplementaryName" );
  }


  public final void setSupplementaryName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SupplementaryName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SupplementaryName getSupplementaryName_elem() {
    return (xsd.acord.SupplementaryName) TYPE.get().getPropertyValue( this, "_SupplementaryName_elem" );
  }


  public final void setSupplementaryName_elem( xsd.acord.SupplementaryName value ) {
    TYPE.get().setPropertyValue( this, "_SupplementaryName_elem", value );
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
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }

}