/* Generated by Guidewire XML Code Generator */

package xsd.iso.req.anonymous.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class ACORD extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonRq = new javax.xml.namespace.QName( "", "SignonRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SuppressNotificationInd = new javax.xml.namespace.QName( "", "SuppressNotificationInd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BaseSvcRq = new javax.xml.namespace.QName( "", "BaseSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSvcRq = new javax.xml.namespace.QName( "", "ClaimsSvcRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignoffRq = new javax.xml.namespace.QName( "", "SignoffRq", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Status = new javax.xml.namespace.QName( "", "Status", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignonRs = new javax.xml.namespace.QName( "", "SignonRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PendingResponseInfo = new javax.xml.namespace.QName( "", "PendingResponseInfo", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_BaseSvcRs = new javax.xml.namespace.QName( "", "BaseSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ClaimsSvcRs = new javax.xml.namespace.QName( "", "ClaimsSvcRs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SignoffRs = new javax.xml.namespace.QName( "", "SignoffRs", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.iso.req.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.iso.req.anonymous.types.complex.ACORD" );
    }
  };

  public ACORD() {
    super( 1536076557, TYPE.get() );
  }

  private ACORD( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1536076557, state );
  }

  protected ACORD( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected ACORD( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.iso.req.anonymous.types.complex.ACORD> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.iso.req.anonymous.types.complex.ACORD get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.SignonRq getSignonRq() {
    return (xsd.iso.req.SignonRq) TYPE.get().getPropertyValue( this, "_SignonRq" );
  }


  public final void setSignonRq( xsd.iso.req.SignonRq value ) {
    TYPE.get().setPropertyValue( this, "_SignonRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getSuppressNotificationInd() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_SuppressNotificationInd" );
  }


  public final void setSuppressNotificationInd( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_SuppressNotificationInd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.SuppressNotificationInd getSuppressNotificationInd_elem() {
    return (xsd.iso.req.SuppressNotificationInd) TYPE.get().getPropertyValue( this, "_SuppressNotificationInd_elem" );
  }


  public final void setSuppressNotificationInd_elem( xsd.iso.req.SuppressNotificationInd value ) {
    TYPE.get().setPropertyValue( this, "_SuppressNotificationInd_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ACORD_BaseSvcRq getBaseSvcRq() {
    return (xsd.iso.req.anonymous.elements.ACORD_BaseSvcRq) TYPE.get().getPropertyValue( this, "_BaseSvcRq" );
  }


  public final void setBaseSvcRq( xsd.iso.req.anonymous.elements.ACORD_BaseSvcRq value ) {
    TYPE.get().setPropertyValue( this, "_BaseSvcRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ClaimsSvcRq> getClaimsSvcRq() {
    return (java.util.List<xsd.iso.req.ClaimsSvcRq>) TYPE.get().getPropertyValue( this, "_ClaimsSvcRq" );
  }


  public final void setClaimsSvcRq( java.util.List<xsd.iso.req.ClaimsSvcRq> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsSvcRq", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ACORD_SignoffRq getSignoffRq() {
    return (xsd.iso.req.anonymous.elements.ACORD_SignoffRq) TYPE.get().getPropertyValue( this, "_SignoffRq" );
  }


  public final void setSignoffRq( xsd.iso.req.anonymous.elements.ACORD_SignoffRq value ) {
    TYPE.get().setPropertyValue( this, "_SignoffRq", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.Status getStatus() {
    return (xsd.iso.req.Status) TYPE.get().getPropertyValue( this, "_Status" );
  }


  public final void setStatus( xsd.iso.req.Status value ) {
    TYPE.get().setPropertyValue( this, "_Status", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.SignonRs getSignonRs() {
    return (xsd.iso.req.SignonRs) TYPE.get().getPropertyValue( this, "_SignonRs" );
  }


  public final void setSignonRs( xsd.iso.req.SignonRs value ) {
    TYPE.get().setPropertyValue( this, "_SignonRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.PendingResponseInfo> getPendingResponseInfo() {
    return (java.util.List<xsd.iso.req.PendingResponseInfo>) TYPE.get().getPropertyValue( this, "_PendingResponseInfo" );
  }


  public final void setPendingResponseInfo( java.util.List<xsd.iso.req.PendingResponseInfo> value ) {
    TYPE.get().setPropertyValue( this, "_PendingResponseInfo", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.anonymous.elements.ACORD_BaseSvcRs getBaseSvcRs() {
    return (xsd.iso.req.anonymous.elements.ACORD_BaseSvcRs) TYPE.get().getPropertyValue( this, "_BaseSvcRs" );
  }


  public final void setBaseSvcRs( xsd.iso.req.anonymous.elements.ACORD_BaseSvcRs value ) {
    TYPE.get().setPropertyValue( this, "_BaseSvcRs", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.util.List<xsd.iso.req.ClaimsSvcRs> getClaimsSvcRs() {
    return (java.util.List<xsd.iso.req.ClaimsSvcRs>) TYPE.get().getPropertyValue( this, "_ClaimsSvcRs" );
  }


  public final void setClaimsSvcRs( java.util.List<xsd.iso.req.ClaimsSvcRs> value ) {
    TYPE.get().setPropertyValue( this, "_ClaimsSvcRs", value );
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.iso.req.SignoffRs getSignoffRs() {
    return (xsd.iso.req.SignoffRs) TYPE.get().getPropertyValue( this, "_SignoffRs" );
  }


  public final void setSignoffRs( xsd.iso.req.SignoffRs value ) {
    TYPE.get().setPropertyValue( this, "_SignoffRs", value );
  }

}