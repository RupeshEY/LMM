/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BillLadingInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BillLadingInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FullValueInd = new javax.xml.namespace.QName( "", "FullValueInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ValueInfo = new javax.xml.namespace.QName( "", "ValueInfo", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BillLadingInfo_Type" );
    }
  };

  public BillLadingInfo_Type() {
    super( 415398250, TYPE.get() );
  }

  private BillLadingInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 415398250, state );
  }

  protected BillLadingInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BillLadingInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.BillLadingInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.BillLadingInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getFullValueInd() {
    return (java.lang.Boolean) TYPE.get().getPropertyValue( this, "_FullValueInd" );
  }


  public final void setFullValueInd( java.lang.Boolean value ) {
    TYPE.get().setPropertyValue( this, "_FullValueInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.FullValueInd getFullValueInd_elem() {
    return (xsd.acord.FullValueInd) TYPE.get().getPropertyValue( this, "_FullValueInd_elem" );
  }


  public final void setFullValueInd_elem( xsd.acord.FullValueInd value ) {
    TYPE.get().setPropertyValue( this, "_FullValueInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ValueInfo getValueInfo() {
    return (xsd.acord.ValueInfo) TYPE.get().getPropertyValue( this, "_ValueInfo" );
  }


  public final void setValueInfo( xsd.acord.ValueInfo value ) {
    TYPE.get().setPropertyValue( this, "_ValueInfo", value );
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