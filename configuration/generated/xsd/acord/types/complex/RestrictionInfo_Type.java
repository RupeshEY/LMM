/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class RestrictionInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "RestrictionInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RestrictionCd = new javax.xml.namespace.QName( "", "RestrictionCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RestrictionDesc = new javax.xml.namespace.QName( "", "RestrictionDesc", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.RestrictionInfo_Type" );
    }
  };

  public RestrictionInfo_Type() {
    super( -1329444314, TYPE.get() );
  }

  private RestrictionInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1329444314, state );
  }

  protected RestrictionInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected RestrictionInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.RestrictionInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.RestrictionInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRestrictionCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RestrictionCd" );
  }


  public final void setRestrictionCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RestrictionCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RestrictionCd getRestrictionCd_elem() {
    return (xsd.acord.RestrictionCd) TYPE.get().getPropertyValue( this, "_RestrictionCd_elem" );
  }


  public final void setRestrictionCd_elem( xsd.acord.RestrictionCd value ) {
    TYPE.get().setPropertyValue( this, "_RestrictionCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRestrictionDesc() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RestrictionDesc" );
  }


  public final void setRestrictionDesc( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RestrictionDesc", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RestrictionDesc getRestrictionDesc_elem() {
    return (xsd.acord.RestrictionDesc) TYPE.get().getPropertyValue( this, "_RestrictionDesc_elem" );
  }


  public final void setRestrictionDesc_elem( xsd.acord.RestrictionDesc value ) {
    TYPE.get().setPropertyValue( this, "_RestrictionDesc_elem", value );
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
