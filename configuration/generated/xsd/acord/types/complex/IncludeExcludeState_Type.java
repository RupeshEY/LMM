/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class IncludeExcludeState_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "IncludeExcludeState_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_IncludedExcludedCd = new javax.xml.namespace.QName( "", "IncludedExcludedCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_StateProvCd = new javax.xml.namespace.QName( "", "StateProvCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.IncludeExcludeState_Type" );
    }
  };

  public IncludeExcludeState_Type() {
    super( -360590143, TYPE.get() );
  }

  private IncludeExcludeState_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -360590143, state );
  }

  protected IncludeExcludeState_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected IncludeExcludeState_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.IncludeExcludeState_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.IncludeExcludeState_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.IncludedExcludedIndicator getIncludedExcludedCd() {
    return (xsd.acord.enums.IncludedExcludedIndicator) TYPE.get().getPropertyValue( this, "_IncludedExcludedCd" );
  }


  public final void setIncludedExcludedCd( xsd.acord.enums.IncludedExcludedIndicator value ) {
    TYPE.get().setPropertyValue( this, "_IncludedExcludedCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.IncludedExcludedCd getIncludedExcludedCd_elem() {
    return (xsd.acord.IncludedExcludedCd) TYPE.get().getPropertyValue( this, "_IncludedExcludedCd_elem" );
  }


  public final void setIncludedExcludedCd_elem( xsd.acord.IncludedExcludedCd value ) {
    TYPE.get().setPropertyValue( this, "_IncludedExcludedCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<java.lang.String> getStateProvCd() {
    return (java.util.List<java.lang.String>) TYPE.get().getPropertyValue( this, "_StateProvCd" );
  }


  public final void setStateProvCd( java.util.List<java.lang.String> value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.StateProvCd> getStateProvCd_elem() {
    return (java.util.List<xsd.acord.StateProvCd>) TYPE.get().getPropertyValue( this, "_StateProvCd_elem" );
  }


  public final void setStateProvCd_elem( java.util.List<xsd.acord.StateProvCd> value ) {
    TYPE.get().setPropertyValue( this, "_StateProvCd_elem", value );
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
