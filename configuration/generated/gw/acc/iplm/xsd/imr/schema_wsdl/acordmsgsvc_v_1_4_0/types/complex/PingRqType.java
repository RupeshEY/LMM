/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class PingRqType extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "PingRqType", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Sender = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "Sender", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Receiver = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "Receiver", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Application = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "Application", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_TimeStamp = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "TimeStamp", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_PingId = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "PingId", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SecurityProfileCd = new javax.xml.namespace.QName( "http://www.ACORD.org/Standards/AcordMsgSvc/1.4.0", "SecurityProfileCd", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex.PingRqType" );
    }
  };

  public PingRqType() {
    super( -1400612853, TYPE.get() );
  }

  private PingRqType( gw.internal.xml.XmlTypeInstanceState state ) {
    super( -1400612853, state );
  }

  protected PingRqType( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected PingRqType( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex.PingRqType> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.types.complex.PingRqType get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Sender getSender() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Sender) TYPE.get().getPropertyValue( this, "_Sender" );
  }


  public final void setSender( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Sender value ) {
    TYPE.get().setPropertyValue( this, "_Sender", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Receiver getReceiver() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Receiver) TYPE.get().getPropertyValue( this, "_Receiver" );
  }


  public final void setReceiver( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Receiver value ) {
    TYPE.get().setPropertyValue( this, "_Receiver", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Application getApplication() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Application) TYPE.get().getPropertyValue( this, "_Application" );
  }


  public final void setApplication( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Application value ) {
    TYPE.get().setPropertyValue( this, "_Application", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.xml.date.XmlDateTime getTimeStamp() {
    return (gw.xml.date.XmlDateTime) TYPE.get().getPropertyValue( this, "_TimeStamp" );
  }


  public final void setTimeStamp( gw.xml.date.XmlDateTime value ) {
    TYPE.get().setPropertyValue( this, "_TimeStamp", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp getTimeStamp_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp) TYPE.get().getPropertyValue( this, "_TimeStamp_elem" );
  }


  public final void setTimeStamp_elem( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.TimeStamp value ) {
    TYPE.get().setPropertyValue( this, "_TimeStamp_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getPingId() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_PingId" );
  }


  public final void setPingId( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_PingId", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PingId getPingId_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PingId) TYPE.get().getPropertyValue( this, "_PingId_elem" );
  }


  public final void setPingId_elem( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PingId value ) {
    TYPE.get().setPropertyValue( this, "_PingId_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.enums.SecurityProfileCd_Type getSecurityProfileCd() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.enums.SecurityProfileCd_Type) TYPE.get().getPropertyValue( this, "_SecurityProfileCd" );
  }


  public final void setSecurityProfileCd( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.enums.SecurityProfileCd_Type value ) {
    TYPE.get().setPropertyValue( this, "_SecurityProfileCd", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.SecurityProfileCd getSecurityProfileCd_elem() {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.SecurityProfileCd) TYPE.get().getPropertyValue( this, "_SecurityProfileCd_elem" );
  }


  public final void setSecurityProfileCd_elem( gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.SecurityProfileCd value ) {
    TYPE.get().setPropertyValue( this, "_SecurityProfileCd_elem", value );
  }

}
