/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ClaimsOccurrence_TaxIdentity extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxIdTypeCd = new javax.xml.namespace.QName( "", "TaxIdTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TaxId = new javax.xml.namespace.QName( "", "TaxId", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ClaimsOccurrence_TaxIdentity" );
    }
  };

  public ClaimsOccurrence_TaxIdentity() {
    super( 1432458564, TYPE.get() );
  }

  private ClaimsOccurrence_TaxIdentity( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1432458564, state );
  }

  protected ClaimsOccurrence_TaxIdentity( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ClaimsOccurrence_TaxIdentity( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ClaimsOccurrence_TaxIdentity> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ClaimsOccurrence_TaxIdentity get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTaxIdTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TaxIdTypeCd" );
  }


  public final void setTaxIdTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TaxIdTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsOccurrence_TaxIdentity_TaxIdTypeCd getTaxIdTypeCd_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsOccurrence_TaxIdentity_TaxIdTypeCd) TYPE.get().getPropertyValue( this, "_TaxIdTypeCd_elem" );
  }


  public final void setTaxIdTypeCd_elem( xsd.iso.req.anonymous.elements.ClaimsOccurrence_TaxIdentity_TaxIdTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_TaxIdTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTaxId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TaxId" );
  }


  public final void setTaxId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TaxId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ClaimsOccurrence_TaxIdentity_TaxId getTaxId_elem() {
    return (xsd.iso.req.anonymous.elements.ClaimsOccurrence_TaxIdentity_TaxId) TYPE.get().getPropertyValue( this, "_TaxId_elem" );
  }


  public final void setTaxId_elem( xsd.iso.req.anonymous.elements.ClaimsOccurrence_TaxIdentity_TaxId value ) {
    TYPE.get().setPropertyValue( this, "_TaxId_elem", value );
  }

}