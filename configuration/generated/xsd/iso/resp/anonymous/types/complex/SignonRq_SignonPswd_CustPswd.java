/* Generated by Guidewire XML Code Generator */

package xsd.iso.resp.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class SignonRq_SignonPswd_CustPswd extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EncryptionTypeCd = new javax.xml.namespace.QName( "", "EncryptionTypeCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Pswd = new javax.xml.namespace.QName( "", "Pswd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_EncryptedPswd = new javax.xml.namespace.QName( "", "EncryptedPswd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.resp.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.resp.anonymous.types.complex.SignonRq_SignonPswd_CustPswd" );
    }
  };

  public SignonRq_SignonPswd_CustPswd() {
    super( 1824428214, TYPE.get() );
  }

  private SignonRq_SignonPswd_CustPswd( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1824428214, state );
  }

  protected SignonRq_SignonPswd_CustPswd( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected SignonRq_SignonPswd_CustPswd( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.resp.anonymous.types.complex.SignonRq_SignonPswd_CustPswd> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.resp.anonymous.types.complex.SignonRq_SignonPswd_CustPswd get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getEncryptionTypeCd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_EncryptionTypeCd" );
  }


  public final void setEncryptionTypeCd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_EncryptionTypeCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.SignonRq_SignonPswd_CustPswd_EncryptionTypeCd getEncryptionTypeCd_elem() {
    return (xsd.iso.resp.anonymous.elements.SignonRq_SignonPswd_CustPswd_EncryptionTypeCd) TYPE.get().getPropertyValue( this, "_EncryptionTypeCd_elem" );
  }


  public final void setEncryptionTypeCd_elem( xsd.iso.resp.anonymous.elements.SignonRq_SignonPswd_CustPswd_EncryptionTypeCd value ) {
    TYPE.get().setPropertyValue( this, "_EncryptionTypeCd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPswd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_Pswd" );
  }


  public final void setPswd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_Pswd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.SignonRq_SignonPswd_CustPswd_Pswd getPswd_elem() {
    return (xsd.iso.resp.anonymous.elements.SignonRq_SignonPswd_CustPswd_Pswd) TYPE.get().getPropertyValue( this, "_Pswd_elem" );
  }


  public final void setPswd_elem( xsd.iso.resp.anonymous.elements.SignonRq_SignonPswd_CustPswd_Pswd value ) {
    TYPE.get().setPropertyValue( this, "_Pswd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.resp.anonymous.elements.SignonRq_SignonPswd_CustPswd_EncryptedPswd getEncryptedPswd() {
    return (xsd.iso.resp.anonymous.elements.SignonRq_SignonPswd_CustPswd_EncryptedPswd) TYPE.get().getPropertyValue( this, "_EncryptedPswd" );
  }


  public final void setEncryptedPswd( xsd.iso.resp.anonymous.elements.SignonRq_SignonPswd_CustPswd_EncryptedPswd value ) {
    TYPE.get().setPropertyValue( this, "_EncryptedPswd", value );
  }

}
