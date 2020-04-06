/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ThimbleInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "ThimbleInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ThimbleThroughCd = new javax.xml.namespace.QName( "", "ThimbleThroughCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Diameter = new javax.xml.namespace.QName( "", "Diameter", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.ThimbleInfo_Type" );
    }
  };

  public ThimbleInfo_Type() {
    super( -430860401, TYPE.get() );
  }

  private ThimbleInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -430860401, state );
  }

  protected ThimbleInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ThimbleInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.ThimbleInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.ThimbleInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.ThimbleThrough getThimbleThroughCd() {
    return (xsd.acord.enums.ThimbleThrough) TYPE.get().getPropertyValue( this, "_ThimbleThroughCd" );
  }


  public final void setThimbleThroughCd( xsd.acord.enums.ThimbleThrough value ) {
    TYPE.get().setPropertyValue( this, "_ThimbleThroughCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ThimbleThroughCd getThimbleThroughCd_elem() {
    return (xsd.acord.ThimbleThroughCd) TYPE.get().getPropertyValue( this, "_ThimbleThroughCd_elem" );
  }


  public final void setThimbleThroughCd_elem( xsd.acord.ThimbleThroughCd value ) {
    TYPE.get().setPropertyValue( this, "_ThimbleThroughCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.Diameter getDiameter() {
    return (xsd.acord.Diameter) TYPE.get().getPropertyValue( this, "_Diameter" );
  }


  public final void setDiameter( xsd.acord.Diameter value ) {
    TYPE.get().setPropertyValue( this, "_Diameter", value );
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