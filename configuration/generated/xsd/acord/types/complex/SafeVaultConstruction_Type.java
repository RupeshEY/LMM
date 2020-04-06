/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SafeVaultConstruction_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SafeVaultConstruction_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ComponentTypeCd = new javax.xml.namespace.QName( "", "ComponentTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConstructionCd = new javax.xml.namespace.QName( "", "ConstructionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Thickness = new javax.xml.namespace.QName( "", "Thickness", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SafeVaultConstruction_Type" );
    }
  };

  public SafeVaultConstruction_Type() {
    super( -1144183574, TYPE.get() );
  }

  private SafeVaultConstruction_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1144183574, state );
  }

  protected SafeVaultConstruction_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SafeVaultConstruction_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.SafeVaultConstruction_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.SafeVaultConstruction_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ComponentType getComponentTypeCd() {
    return (xsd.acord.enums.ComponentType) TYPE.get().getPropertyValue( this, "_ComponentTypeCd" );
  }


  public final void setComponentTypeCd( xsd.acord.enums.ComponentType value ) {
    TYPE.get().setPropertyValue( this, "_ComponentTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ComponentTypeCd getComponentTypeCd_elem() {
    return (xsd.acord.ComponentTypeCd) TYPE.get().getPropertyValue( this, "_ComponentTypeCd_elem" );
  }


  public final void setComponentTypeCd_elem( xsd.acord.ComponentTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_ComponentTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ConstructionType getConstructionCd() {
    return (xsd.acord.enums.ConstructionType) TYPE.get().getPropertyValue( this, "_ConstructionCd" );
  }


  public final void setConstructionCd( xsd.acord.enums.ConstructionType value ) {
    TYPE.get().setPropertyValue( this, "_ConstructionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ConstructionCd getConstructionCd_elem() {
    return (xsd.acord.ConstructionCd) TYPE.get().getPropertyValue( this, "_ConstructionCd_elem" );
  }


  public final void setConstructionCd_elem( xsd.acord.ConstructionCd value ) {
    TYPE.get().setPropertyValue( this, "_ConstructionCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Thickness getThickness() {
    return (xsd.acord.Thickness) TYPE.get().getPropertyValue( this, "_Thickness" );
  }


  public final void setThickness( xsd.acord.Thickness value ) {
    TYPE.get().setPropertyValue( this, "_Thickness", value );
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