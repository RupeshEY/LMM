/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class EditScope_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "EditScope_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RestrictedContextPath = new javax.xml.namespace.QName( "", "RestrictedContextPath", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EditCase = new javax.xml.namespace.QName( "", "EditCase", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_DefaultEditCase = new javax.xml.namespace.QName( "", "DefaultEditCase", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.EditScope_Type" );
    }
  };

  public EditScope_Type() {
    super( -1139786346, TYPE.get() );
  }

  private EditScope_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1139786346, state );
  }

  protected EditScope_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected EditScope_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.EditScope_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.EditScope_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRestrictedContextPath() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RestrictedContextPath" );
  }


  public final void setRestrictedContextPath( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RestrictedContextPath", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.RestrictedContextPath getRestrictedContextPath_elem() {
    return (xsd.acord.RestrictedContextPath) TYPE.get().getPropertyValue( this, "_RestrictedContextPath_elem" );
  }


  public final void setRestrictedContextPath_elem( xsd.acord.RestrictedContextPath value ) {
    TYPE.get().setPropertyValue( this, "_RestrictedContextPath_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.EditCase> getEditCase() {
    return (java.util.List<xsd.acord.EditCase>) TYPE.get().getPropertyValue( this, "_EditCase" );
  }


  public final void setEditCase( java.util.List<xsd.acord.EditCase> value ) {
    TYPE.get().setPropertyValue( this, "_EditCase", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.DefaultEditCase getDefaultEditCase() {
    return (xsd.acord.DefaultEditCase) TYPE.get().getPropertyValue( this, "_DefaultEditCase" );
  }


  public final void setDefaultEditCase( xsd.acord.DefaultEditCase value ) {
    TYPE.get().setPropertyValue( this, "_DefaultEditCase", value );
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
