/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class GetAliasByInternalCode extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Typelist = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TypelistToolsAPI", "typelist", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Namespace = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TypelistToolsAPI", "namespace", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Code = new javax.xml.namespace.QName( "http://guidewire.com/pl/ws/gw/wsi/pl/TypelistToolsAPI", "code", "tns" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.wsi.pl.typelisttoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetAliasByInternalCode" );
    }
  };

  public GetAliasByInternalCode() {
    super( 1569229519, TYPE.get() );
  }

  private GetAliasByInternalCode( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1569229519, state );
  }

  protected GetAliasByInternalCode( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected GetAliasByInternalCode( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetAliasByInternalCode> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.types.complex.GetAliasByInternalCode get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTypelist() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Typelist" );
  }


  public final void setTypelist( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Typelist", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasByInternalCode_Typelist getTypelist_elem() {
    return (wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasByInternalCode_Typelist) TYPE.get().getPropertyValue( this, "_Typelist_elem" );
  }


  public final void setTypelist_elem( wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasByInternalCode_Typelist value ) {
    TYPE.get().setPropertyValue( this, "_Typelist_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNamespace() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Namespace" );
  }


  public final void setNamespace( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Namespace", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasByInternalCode_Namespace getNamespace_elem() {
    return (wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasByInternalCode_Namespace) TYPE.get().getPropertyValue( this, "_Namespace_elem" );
  }


  public final void setNamespace_elem( wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasByInternalCode_Namespace value ) {
    TYPE.get().setPropertyValue( this, "_Namespace_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCode() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Code" );
  }


  public final void setCode( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Code", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasByInternalCode_Code getCode_elem() {
    return (wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasByInternalCode_Code) TYPE.get().getPropertyValue( this, "_Code_elem" );
  }


  public final void setCode_elem( wsi.local.gw.wsi.pl.typelisttoolsapi.anonymous.elements.GetAliasByInternalCode_Code value ) {
    TYPE.get().setPropertyValue( this, "_Code_elem", value );
  }

}