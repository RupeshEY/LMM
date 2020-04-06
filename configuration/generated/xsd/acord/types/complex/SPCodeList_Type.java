/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SPCodeList_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "SPCodeList_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPCodeListName = new javax.xml.namespace.QName( "", "SPCodeListName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPCode = new javax.xml.namespace.QName( "", "SPCode", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPQuestion = new javax.xml.namespace.QName( "", "SPQuestion", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ReplaceCodeListNameCd = new javax.xml.namespace.QName( "", "ReplaceCodeListNameCd", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.SPCodeList_Type" );
    }
  };

  public SPCodeList_Type() {
    super( 888079114, TYPE.get() );
  }

  private SPCodeList_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 888079114, state );
  }

  protected SPCodeList_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SPCodeList_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.SPCodeList_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.SPCodeList_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSPCodeListName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SPCodeListName" );
  }


  public final void setSPCodeListName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SPCodeListName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SPCodeListName getSPCodeListName_elem() {
    return (xsd.acord.SPCodeListName) TYPE.get().getPropertyValue( this, "_SPCodeListName_elem" );
  }


  public final void setSPCodeListName_elem( xsd.acord.SPCodeListName value ) {
    TYPE.get().setPropertyValue( this, "_SPCodeListName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SPCode> getSPCode() {
    return (java.util.List<xsd.acord.SPCode>) TYPE.get().getPropertyValue( this, "_SPCode" );
  }


  public final void setSPCode( java.util.List<xsd.acord.SPCode> value ) {
    TYPE.get().setPropertyValue( this, "_SPCode", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.acord.SPQuestion> getSPQuestion() {
    return (java.util.List<xsd.acord.SPQuestion>) TYPE.get().getPropertyValue( this, "_SPQuestion" );
  }


  public final void setSPQuestion( java.util.List<xsd.acord.SPQuestion> value ) {
    TYPE.get().setPropertyValue( this, "_SPQuestion", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.CodeLists getReplaceCodeListNameCd() {
    return (xsd.acord.enums.CodeLists) TYPE.get().getPropertyValue( this, "_ReplaceCodeListNameCd" );
  }


  public final void setReplaceCodeListNameCd( xsd.acord.enums.CodeLists value ) {
    TYPE.get().setPropertyValue( this, "_ReplaceCodeListNameCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ReplaceCodeListNameCd getReplaceCodeListNameCd_elem() {
    return (xsd.acord.ReplaceCodeListNameCd) TYPE.get().getPropertyValue( this, "_ReplaceCodeListNameCd_elem" );
  }


  public final void setReplaceCodeListNameCd_elem( xsd.acord.ReplaceCodeListNameCd value ) {
    TYPE.get().setPropertyValue( this, "_ReplaceCodeListNameCd_elem", value );
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