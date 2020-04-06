/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class Catastrophe_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "Catastrophe_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CatastropheCd = new javax.xml.namespace.QName( "", "CatastropheCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CatastropheCdSourceName = new javax.xml.namespace.QName( "", "CatastropheCdSourceName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CatastropheCodeSourceCd = new javax.xml.namespace.QName( "", "CatastropheCodeSourceCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AssignedDt = new javax.xml.namespace.QName( "", "AssignedDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CatastropheDesc = new javax.xml.namespace.QName( "", "CatastropheDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.Catastrophe_Type" );
    }
  };

  public Catastrophe_Type() {
    super( -1185385508, TYPE.get() );
  }

  private Catastrophe_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1185385508, state );
  }

  protected Catastrophe_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected Catastrophe_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.Catastrophe_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.Catastrophe_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCatastropheCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CatastropheCd" );
  }


  public final void setCatastropheCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CatastropheCd getCatastropheCd_elem() {
    return (xsd.acord.CatastropheCd) TYPE.get().getPropertyValue( this, "_CatastropheCd_elem" );
  }


  public final void setCatastropheCd_elem( xsd.acord.CatastropheCd value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCatastropheCdSourceName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CatastropheCdSourceName" );
  }


  public final void setCatastropheCdSourceName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheCdSourceName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CatastropheCdSourceName getCatastropheCdSourceName_elem() {
    return (xsd.acord.CatastropheCdSourceName) TYPE.get().getPropertyValue( this, "_CatastropheCdSourceName_elem" );
  }


  public final void setCatastropheCdSourceName_elem( xsd.acord.CatastropheCdSourceName value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheCdSourceName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.LossSource getCatastropheCodeSourceCd() {
    return (xsd.acord.enums.LossSource) TYPE.get().getPropertyValue( this, "_CatastropheCodeSourceCd" );
  }


  public final void setCatastropheCodeSourceCd( xsd.acord.enums.LossSource value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheCodeSourceCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CatastropheCodeSourceCd getCatastropheCodeSourceCd_elem() {
    return (xsd.acord.CatastropheCodeSourceCd) TYPE.get().getPropertyValue( this, "_CatastropheCodeSourceCd_elem" );
  }


  public final void setCatastropheCodeSourceCd_elem( xsd.acord.CatastropheCodeSourceCd value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheCodeSourceCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAssignedDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AssignedDt" );
  }


  public final void setAssignedDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AssignedDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AssignedDt getAssignedDt_elem() {
    return (xsd.acord.AssignedDt) TYPE.get().getPropertyValue( this, "_AssignedDt_elem" );
  }


  public final void setAssignedDt_elem( xsd.acord.AssignedDt value ) {
    TYPE.get().setPropertyValue( this, "_AssignedDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCatastropheDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CatastropheDesc" );
  }


  public final void setCatastropheDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CatastropheDesc getCatastropheDesc_elem() {
    return (xsd.acord.CatastropheDesc) TYPE.get().getPropertyValue( this, "_CatastropheDesc_elem" );
  }


  public final void setCatastropheDesc_elem( xsd.acord.CatastropheDesc value ) {
    TYPE.get().setPropertyValue( this, "_CatastropheDesc_elem", value );
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