/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CommlVehInfo extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlVehSupplement = new javax.xml.namespace.QName( "", "CommlVehSupplement", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CommlCoverage = new javax.xml.namespace.QName( "", "CommlCoverage", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CreditOrSurcharge = new javax.xml.namespace.QName( "", "CreditOrSurcharge", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.CommlVehInfo" );
    }
  };

  public CommlVehInfo() {
    super( 1968962969, TYPE.get() );
  }

  private CommlVehInfo( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1968962969, state );
  }

  protected CommlVehInfo( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CommlVehInfo( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.CommlVehInfo> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.CommlVehInfo get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.CommlVehSupplement getCommlVehSupplement() {
    return (xsd.iso.req.CommlVehSupplement) TYPE.get().getPropertyValue( this, "_CommlVehSupplement" );
  }


  public final void setCommlVehSupplement( xsd.iso.req.CommlVehSupplement value ) {
    TYPE.get().setPropertyValue( this, "_CommlVehSupplement", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.anonymous.elements.CommlVehInfo_CommlCoverage> getCommlCoverage() {
    return (java.util.List<xsd.iso.req.anonymous.elements.CommlVehInfo_CommlCoverage>) TYPE.get().getPropertyValue( this, "_CommlCoverage" );
  }


  public final void setCommlCoverage( java.util.List<xsd.iso.req.anonymous.elements.CommlVehInfo_CommlCoverage> value ) {
    TYPE.get().setPropertyValue( this, "_CommlCoverage", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.CreditOrSurcharge> getCreditOrSurcharge() {
    return (java.util.List<xsd.iso.req.CreditOrSurcharge>) TYPE.get().getPropertyValue( this, "_CreditOrSurcharge" );
  }


  public final void setCreditOrSurcharge( java.util.List<xsd.iso.req.CreditOrSurcharge> value ) {
    TYPE.get().setPropertyValue( this, "_CreditOrSurcharge", value );
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