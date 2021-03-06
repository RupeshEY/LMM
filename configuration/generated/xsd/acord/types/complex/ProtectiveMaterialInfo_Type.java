/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ProtectiveMaterialInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ProtectiveMaterialInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProtectiveMaterialCd = new javax.xml.namespace.QName( "", "ProtectiveMaterialCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProtectiveMaterialSpacing = new javax.xml.namespace.QName( "", "ProtectiveMaterialSpacing", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ProtectedAreaCd = new javax.xml.namespace.QName( "", "ProtectedAreaCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ProtectiveMaterialInfo_Type" );
    }
  };

  public ProtectiveMaterialInfo_Type() {
    super( 1123664916, TYPE.get() );
  }

  private ProtectiveMaterialInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1123664916, state );
  }

  protected ProtectiveMaterialInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ProtectiveMaterialInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ProtectiveMaterialInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ProtectiveMaterialInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ProtectiveMaterial getProtectiveMaterialCd() {
    return (xsd.acord.enums.ProtectiveMaterial) TYPE.get().getPropertyValue( this, "_ProtectiveMaterialCd" );
  }


  public final void setProtectiveMaterialCd( xsd.acord.enums.ProtectiveMaterial value ) {
    TYPE.get().setPropertyValue( this, "_ProtectiveMaterialCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProtectiveMaterialCd getProtectiveMaterialCd_elem() {
    return (xsd.acord.ProtectiveMaterialCd) TYPE.get().getPropertyValue( this, "_ProtectiveMaterialCd_elem" );
  }


  public final void setProtectiveMaterialCd_elem( xsd.acord.ProtectiveMaterialCd value ) {
    TYPE.get().setPropertyValue( this, "_ProtectiveMaterialCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProtectiveMaterialSpacing getProtectiveMaterialSpacing() {
    return (xsd.acord.ProtectiveMaterialSpacing) TYPE.get().getPropertyValue( this, "_ProtectiveMaterialSpacing" );
  }


  public final void setProtectiveMaterialSpacing( xsd.acord.ProtectiveMaterialSpacing value ) {
    TYPE.get().setPropertyValue( this, "_ProtectiveMaterialSpacing", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ClearanceTo getProtectedAreaCd() {
    return (xsd.acord.enums.ClearanceTo) TYPE.get().getPropertyValue( this, "_ProtectedAreaCd" );
  }


  public final void setProtectedAreaCd( xsd.acord.enums.ClearanceTo value ) {
    TYPE.get().setPropertyValue( this, "_ProtectedAreaCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ProtectedAreaCd getProtectedAreaCd_elem() {
    return (xsd.acord.ProtectedAreaCd) TYPE.get().getPropertyValue( this, "_ProtectedAreaCd_elem" );
  }


  public final void setProtectedAreaCd_elem( xsd.acord.ProtectedAreaCd value ) {
    TYPE.get().setPropertyValue( this, "_ProtectedAreaCd_elem", value );
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
