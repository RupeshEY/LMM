/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class BINARY_NoID extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "BINARY_NoID", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContentTypeCd = new javax.xml.namespace.QName( "", "ContentTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BinLength = new javax.xml.namespace.QName( "", "BinLength", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BinData = new javax.xml.namespace.QName( "", "BinData", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.BINARY_NoID" );
    }
  };

  public BINARY_NoID() {
    super( 1438132275, TYPE.get() );
  }

  private BINARY_NoID( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1438132275, state );
  }

  protected BINARY_NoID( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected BINARY_NoID( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.BINARY_NoID> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.BINARY_NoID get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getContentTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_ContentTypeCd" );
  }


  public final void setContentTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_ContentTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.ContentTypeCd getContentTypeCd_elem() {
    return (xsd.acord.ContentTypeCd) TYPE.get().getPropertyValue( this, "_ContentTypeCd_elem" );
  }


  public final void setContentTypeCd_elem( xsd.acord.ContentTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_ContentTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getBinLength() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_BinLength" );
  }


  public final void setBinLength( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_BinLength", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BinLength getBinLength_elem() {
    return (xsd.acord.BinLength) TYPE.get().getPropertyValue( this, "_BinLength_elem" );
  }


  public final void setBinLength_elem( xsd.acord.BinLength value ) {
    TYPE.get().setPropertyValue( this, "_BinLength_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getBinData() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_BinData" );
  }


  public final void setBinData( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_BinData", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.BinData getBinData_elem() {
    return (xsd.acord.BinData) TYPE.get().getPropertyValue( this, "_BinData_elem" );
  }


  public final void setBinData_elem( xsd.acord.BinData value ) {
    TYPE.get().setPropertyValue( this, "_BinData_elem", value );
  }

}
