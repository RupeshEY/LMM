/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SignonRq_SignonCert_Certificate extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ContentTypeCd = new javax.xml.namespace.QName( "", "ContentTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BinLength = new javax.xml.namespace.QName( "", "BinLength", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BinData = new javax.xml.namespace.QName( "", "BinData", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.SignonRq_SignonCert_Certificate" );
    }
  };

  public SignonRq_SignonCert_Certificate() {
    super( 258643224, TYPE.get() );
  }

  private SignonRq_SignonCert_Certificate( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 258643224, state );
  }

  protected SignonRq_SignonCert_Certificate( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SignonRq_SignonCert_Certificate( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.SignonRq_SignonCert_Certificate> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.SignonRq_SignonCert_Certificate get$TypeInstance() {
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
  public final xsd.iso.resp.anonymous.elements.SignonRq_SignonCert_Certificate_ContentTypeCd getContentTypeCd_elem() {
    return (xsd.iso.resp.anonymous.elements.SignonRq_SignonCert_Certificate_ContentTypeCd) TYPE.get().getPropertyValue( this, "_ContentTypeCd_elem" );
  }


  public final void setContentTypeCd_elem( xsd.iso.resp.anonymous.elements.SignonRq_SignonCert_Certificate_ContentTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_ContentTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getBinLength() {
    return (java.lang.Long) TYPE.get().getPropertyValue( this, "_BinLength" );
  }


  public final void setBinLength( java.lang.Long value ) {
    TYPE.get().setPropertyValue( this, "_BinLength", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.SignonRq_SignonCert_Certificate_BinLength getBinLength_elem() {
    return (xsd.iso.resp.anonymous.elements.SignonRq_SignonCert_Certificate_BinLength) TYPE.get().getPropertyValue( this, "_BinLength_elem" );
  }


  public final void setBinLength_elem( xsd.iso.resp.anonymous.elements.SignonRq_SignonCert_Certificate_BinLength value ) {
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
  public final xsd.iso.resp.anonymous.elements.SignonRq_SignonCert_Certificate_BinData getBinData_elem() {
    return (xsd.iso.resp.anonymous.elements.SignonRq_SignonCert_Certificate_BinData) TYPE.get().getPropertyValue( this, "_BinData_elem" );
  }


  public final void setBinData_elem( xsd.iso.resp.anonymous.elements.SignonRq_SignonCert_Certificate_BinData value ) {
    TYPE.get().setPropertyValue( this, "_BinData_elem", value );
  }

}
