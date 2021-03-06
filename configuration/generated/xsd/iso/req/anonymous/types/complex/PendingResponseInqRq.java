/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PendingResponseInqRq extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_RqUID = new javax.xml.namespace.QName( "", "RqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionRequestDt = new javax.xml.namespace.QName( "", "TransactionRequestDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PendingResponseInfo = new javax.xml.namespace.QName( "", "PendingResponseInfo", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.PendingResponseInqRq" );
    }
  };

  public PendingResponseInqRq() {
    super( 1073192421, TYPE.get() );
  }

  private PendingResponseInqRq( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1073192421, state );
  }

  protected PendingResponseInqRq( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PendingResponseInqRq( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.PendingResponseInqRq> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.PendingResponseInqRq get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getRqUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_RqUID" );
  }


  public final void setRqUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_RqUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.RqUID getRqUID_elem() {
    return (xsd.iso.req.RqUID) TYPE.get().getPropertyValue( this, "_RqUID_elem" );
  }


  public final void setRqUID_elem( xsd.iso.req.RqUID value ) {
    TYPE.get().setPropertyValue( this, "_RqUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getTransactionRequestDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_TransactionRequestDt" );
  }


  public final void setTransactionRequestDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_TransactionRequestDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.TransactionRequestDt getTransactionRequestDt_elem() {
    return (xsd.iso.req.TransactionRequestDt) TYPE.get().getPropertyValue( this, "_TransactionRequestDt_elem" );
  }


  public final void setTransactionRequestDt_elem( xsd.iso.req.TransactionRequestDt value ) {
    TYPE.get().setPropertyValue( this, "_TransactionRequestDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.PendingResponseInfo> getPendingResponseInfo() {
    return (java.util.List<xsd.iso.req.PendingResponseInfo>) TYPE.get().getPropertyValue( this, "_PendingResponseInfo" );
  }


  public final void setPendingResponseInfo( java.util.List<xsd.iso.req.PendingResponseInfo> value ) {
    TYPE.get().setPropertyValue( this, "_PendingResponseInfo", value );
  }


}
