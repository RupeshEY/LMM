/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class DriverVeh_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "DriverVeh_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_OwnedVehInd = new javax.xml.namespace.QName( "", "OwnedVehInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_UsePct = new javax.xml.namespace.QName( "", "UsePct", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DriverUseCd = new javax.xml.namespace.QName( "", "DriverUseCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_DriverRef = new javax.xml.namespace.QName( "", "DriverRef", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_VehRef = new javax.xml.namespace.QName( "", "VehRef", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.DriverVeh_Type" );
    }
  };

  public DriverVeh_Type() {
    super( -2037430769, TYPE.get() );
  }

  private DriverVeh_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -2037430769, state );
  }

  protected DriverVeh_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected DriverVeh_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.DriverVeh_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.DriverVeh_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getOwnedVehInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_OwnedVehInd" );
  }


  public final void setOwnedVehInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_OwnedVehInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.OwnedVehInd getOwnedVehInd_elem() {
    return (xsd.acord.OwnedVehInd) TYPE.get().getPropertyValue( this, "_OwnedVehInd_elem" );
  }


  public final void setOwnedVehInd_elem( xsd.acord.OwnedVehInd value ) {
    TYPE.get().setPropertyValue( this, "_OwnedVehInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getUsePct() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_UsePct" );
  }


  public final void setUsePct( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_UsePct", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.UsePct getUsePct_elem() {
    return (xsd.acord.UsePct) TYPE.get().getPropertyValue( this, "_UsePct_elem" );
  }


  public final void setUsePct_elem( xsd.acord.UsePct value ) {
    TYPE.get().setPropertyValue( this, "_UsePct_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.DriverUse getDriverUseCd() {
    return (xsd.acord.enums.DriverUse) TYPE.get().getPropertyValue( this, "_DriverUseCd" );
  }


  public final void setDriverUseCd( xsd.acord.enums.DriverUse value ) {
    TYPE.get().setPropertyValue( this, "_DriverUseCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DriverUseCd getDriverUseCd_elem() {
    return (xsd.acord.DriverUseCd) TYPE.get().getPropertyValue( this, "_DriverUseCd_elem" );
  }


  public final void setDriverUseCd_elem( xsd.acord.DriverUseCd value ) {
    TYPE.get().setPropertyValue( this, "_DriverUseCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Id" );
  }


  public final void setId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Id", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getDriverRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_DriverRef" );
  }


  public final void setDriverRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_DriverRef", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getVehRef() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_VehRef" );
  }


  public final void setVehRef( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_VehRef", value );
  }

}
