/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SPRelationalEditDefinition_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SPRelationalEditDefinition_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContextPath = new javax.xml.namespace.QName( "", "ContextPath", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ConditionExpr = new javax.xml.namespace.QName( "", "ConditionExpr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AssertionExpr = new javax.xml.namespace.QName( "", "AssertionExpr", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ErrorText = new javax.xml.namespace.QName( "", "ErrorText", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SPRelationalEditDefinition_Type" );
    }
  };

  public SPRelationalEditDefinition_Type() {
    super( -676761391, TYPE.get() );
  }

  private SPRelationalEditDefinition_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -676761391, state );
  }

  protected SPRelationalEditDefinition_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SPRelationalEditDefinition_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.SPRelationalEditDefinition_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.SPRelationalEditDefinition_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContextPath() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ContextPath" );
  }


  public final void setContextPath( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ContextPath", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContextPath getContextPath_elem() {
    return (xsd.acord.ContextPath) TYPE.get().getPropertyValue( this, "_ContextPath_elem" );
  }


  public final void setContextPath_elem( xsd.acord.ContextPath value ) {
    TYPE.get().setPropertyValue( this, "_ContextPath_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getConditionExpr() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ConditionExpr" );
  }


  public final void setConditionExpr( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ConditionExpr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ConditionExpr getConditionExpr_elem() {
    return (xsd.acord.ConditionExpr) TYPE.get().getPropertyValue( this, "_ConditionExpr_elem" );
  }


  public final void setConditionExpr_elem( xsd.acord.ConditionExpr value ) {
    TYPE.get().setPropertyValue( this, "_ConditionExpr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAssertionExpr() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_AssertionExpr" );
  }


  public final void setAssertionExpr( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_AssertionExpr", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.AssertionExpr getAssertionExpr_elem() {
    return (xsd.acord.AssertionExpr) TYPE.get().getPropertyValue( this, "_AssertionExpr_elem" );
  }


  public final void setAssertionExpr_elem( xsd.acord.AssertionExpr value ) {
    TYPE.get().setPropertyValue( this, "_AssertionExpr_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getErrorText() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_ErrorText" );
  }


  public final void setErrorText( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_ErrorText", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.ErrorText> getErrorText_elem() {
    return (java.util.List<xsd.acord.ErrorText>) TYPE.get().getPropertyValue( this, "_ErrorText_elem" );
  }


  public final void setErrorText_elem( java.util.List<xsd.acord.ErrorText> value ) {
    TYPE.get().setPropertyValue( this, "_ErrorText_elem", value );
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
