/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class CustId_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "CustId_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SPName = new javax.xml.namespace.QName( "", "SPName", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustPermId = new javax.xml.namespace.QName( "", "CustPermId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustLoginId = new javax.xml.namespace.QName( "", "CustLoginId", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.CustId_Type" );
    }
  };

  public CustId_Type() {
    super( 1034708484, TYPE.get() );
  }

  private CustId_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1034708484, state );
  }

  protected CustId_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected CustId_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.CustId_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.CustId_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSPName() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SPName" );
  }


  public final void setSPName( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SPName", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.SPName getSPName_elem() {
    return (xsd.acord.SPName) TYPE.get().getPropertyValue( this, "_SPName_elem" );
  }


  public final void setSPName_elem( xsd.acord.SPName value ) {
    TYPE.get().setPropertyValue( this, "_SPName_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCustPermId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CustPermId" );
  }


  public final void setCustPermId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CustPermId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CustPermId getCustPermId_elem() {
    return (xsd.acord.CustPermId) TYPE.get().getPropertyValue( this, "_CustPermId_elem" );
  }


  public final void setCustPermId_elem( xsd.acord.CustPermId value ) {
    TYPE.get().setPropertyValue( this, "_CustPermId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getCustLoginId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_CustLoginId" );
  }


  public final void setCustLoginId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_CustLoginId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.CustLoginId getCustLoginId_elem() {
    return (xsd.acord.CustLoginId) TYPE.get().getPropertyValue( this, "_CustLoginId_elem" );
  }


  public final void setCustLoginId_elem( xsd.acord.CustLoginId value ) {
    TYPE.get().setPropertyValue( this, "_CustLoginId_elem", value );
  }

}