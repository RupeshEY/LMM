/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(xsd.iso.resp.types.complex.String.class)
public class ClaimsOccurrence_TaxIdentity_TaxIdTypeCd extends gw.xml.XmlTypeInstance {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Codelistref = new javax.xml.namespace.QName( "", "codelistref", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.ClaimsOccurrence_TaxIdentity_TaxIdTypeCd" );
    }
  };

  public ClaimsOccurrence_TaxIdentity_TaxIdTypeCd() {
    super( -981850472, TYPE.get() );
  }

  public ClaimsOccurrence_TaxIdentity_TaxIdTypeCd( java.lang.String value ) {
    this();
    setValue( value );
  }

  private ClaimsOccurrence_TaxIdentity_TaxIdTypeCd( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -981850472, state );
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.ClaimsOccurrence_TaxIdentity_TaxIdTypeCd> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.ClaimsOccurrence_TaxIdentity_TaxIdTypeCd get$TypeInstance() {
    return this;
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getValue() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "Value" );
  }

  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String get$Value() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "Value" );
  }

  public final void setValue( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }

  public final void set$Value( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "Value", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.XmlElement getCodelistref() {
    return (gw.xml.XmlElement) TYPE.get().getPropertyValue( this, "_Codelistref" );
  }


  public final void setCodelistref( gw.xml.XmlElement value ) {
    TYPE.get().setPropertyValue( this, "_Codelistref", value );
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