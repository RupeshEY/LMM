/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PendingResponseInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "PendingResponseInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgRqUID = new javax.xml.namespace.QName( "", "MsgRqUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgNameCd = new javax.xml.namespace.QName( "", "MsgNameCd", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TransactionRequestDt = new javax.xml.namespace.QName( "", "TransactionRequestDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NotificationDt = new javax.xml.namespace.QName( "", "NotificationDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PendingResponseExpDt = new javax.xml.namespace.QName( "", "PendingResponseExpDt", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.PendingResponseInfo_Type" );
    }
  };

  public PendingResponseInfo_Type() {
    super( 1592375546, TYPE.get() );
  }

  private PendingResponseInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 1592375546, state );
  }

  protected PendingResponseInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PendingResponseInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.PendingResponseInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.PendingResponseInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMsgRqUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MsgRqUID" );
  }


  public final void setMsgRqUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MsgRqUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MsgRqUID getMsgRqUID_elem() {
    return (xsd.acord.MsgRqUID) TYPE.get().getPropertyValue( this, "_MsgRqUID_elem" );
  }


  public final void setMsgRqUID_elem( xsd.acord.MsgRqUID value ) {
    TYPE.get().setPropertyValue( this, "_MsgRqUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.enums.SvcMsg getMsgNameCd() {
    return (xsd.acord.enums.SvcMsg) TYPE.get().getPropertyValue( this, "_MsgNameCd" );
  }


  public final void setMsgNameCd( xsd.acord.enums.SvcMsg value ) {
    TYPE.get().setPropertyValue( this, "_MsgNameCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MsgNameCd getMsgNameCd_elem() {
    return (xsd.acord.MsgNameCd) TYPE.get().getPropertyValue( this, "_MsgNameCd_elem" );
  }


  public final void setMsgNameCd_elem( xsd.acord.MsgNameCd value ) {
    TYPE.get().setPropertyValue( this, "_MsgNameCd_elem", value );
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
  public final xsd.acord.TransactionRequestDt getTransactionRequestDt_elem() {
    return (xsd.acord.TransactionRequestDt) TYPE.get().getPropertyValue( this, "_TransactionRequestDt_elem" );
  }


  public final void setTransactionRequestDt_elem( xsd.acord.TransactionRequestDt value ) {
    TYPE.get().setPropertyValue( this, "_TransactionRequestDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getNotificationDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_NotificationDt" );
  }


  public final void setNotificationDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_NotificationDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NotificationDt getNotificationDt_elem() {
    return (xsd.acord.NotificationDt) TYPE.get().getPropertyValue( this, "_NotificationDt_elem" );
  }


  public final void setNotificationDt_elem( xsd.acord.NotificationDt value ) {
    TYPE.get().setPropertyValue( this, "_NotificationDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPendingResponseExpDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PendingResponseExpDt" );
  }


  public final void setPendingResponseExpDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PendingResponseExpDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.PendingResponseExpDt getPendingResponseExpDt_elem() {
    return (xsd.acord.PendingResponseExpDt) TYPE.get().getPropertyValue( this, "_PendingResponseExpDt_elem" );
  }


  public final void setPendingResponseExpDt_elem( xsd.acord.PendingResponseExpDt value ) {
    TYPE.get().setPropertyValue( this, "_PendingResponseExpDt_elem", value );
  }

}