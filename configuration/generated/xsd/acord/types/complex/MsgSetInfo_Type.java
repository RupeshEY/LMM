/* Generated by Guidewire XML Code Generator */

package xsd.acord.types.complex;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData(gw.xsd.w3c.xmlschema.types.complex.AnyType.class)
public class MsgSetInfo_Type extends gw.xsd.w3c.xmlschema.types.complex.AnyType {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "MsgSetInfo_Type", "" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgSetUID = new javax.xml.namespace.QName( "", "MsgSetUID", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_NumMessages = new javax.xml.namespace.QName( "", "NumMessages", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgSetRequestEffDt = new javax.xml.namespace.QName( "", "MsgSetRequestEffDt", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MsgSetRequestExpDt = new javax.xml.namespace.QName( "", "MsgSetRequestExpDt", "" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.types.complex.MsgSetInfo_Type" );
    }
  };

  public MsgSetInfo_Type() {
    super( 632132483, TYPE.get() );
  }

  private MsgSetInfo_Type( gw.internal.xml.XmlTypeInstanceState state ) {
    super( 632132483, state );
  }

  protected MsgSetInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceTypeDataImpl typeData ) {
    super(magic, typeData);
  }

  protected MsgSetInfo_Type( int magic, gw.internal.xml.XmlTypeInstanceState state ) {
    super(magic, state);
  }

  public static gw.xml.XmlTypeInstanceTypeData asTypeData() {
    return TYPE.get();
  }

  @java.lang.Override
  public java.lang.Class<? extends xsd.acord.types.complex.MsgSetInfo_Type> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public xsd.acord.types.complex.MsgSetInfo_Type get$TypeInstance() {
    return this;
  }



  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMsgSetUID() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MsgSetUID" );
  }


  public final void setMsgSetUID( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MsgSetUID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MsgSetUID getMsgSetUID_elem() {
    return (xsd.acord.MsgSetUID) TYPE.get().getPropertyValue( this, "_MsgSetUID_elem" );
  }


  public final void setMsgSetUID_elem( xsd.acord.MsgSetUID value ) {
    TYPE.get().setPropertyValue( this, "_MsgSetUID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Integer getNumMessages() {
    return (java.lang.Integer) TYPE.get().getPropertyValue( this, "_NumMessages" );
  }


  public final void setNumMessages( java.lang.Integer value ) {
    TYPE.get().setPropertyValue( this, "_NumMessages", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.NumMessages getNumMessages_elem() {
    return (xsd.acord.NumMessages) TYPE.get().getPropertyValue( this, "_NumMessages_elem" );
  }


  public final void setNumMessages_elem( xsd.acord.NumMessages value ) {
    TYPE.get().setPropertyValue( this, "_NumMessages_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMsgSetRequestEffDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MsgSetRequestEffDt" );
  }


  public final void setMsgSetRequestEffDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MsgSetRequestEffDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MsgSetRequestEffDt getMsgSetRequestEffDt_elem() {
    return (xsd.acord.MsgSetRequestEffDt) TYPE.get().getPropertyValue( this, "_MsgSetRequestEffDt_elem" );
  }


  public final void setMsgSetRequestEffDt_elem( xsd.acord.MsgSetRequestEffDt value ) {
    TYPE.get().setPropertyValue( this, "_MsgSetRequestEffDt_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getMsgSetRequestExpDt() {
    return (java.lang.String) TYPE.get().getPropertyValue( this, "_MsgSetRequestExpDt" );
  }


  public final void setMsgSetRequestExpDt( java.lang.String value ) {
    TYPE.get().setPropertyValue( this, "_MsgSetRequestExpDt", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final xsd.acord.MsgSetRequestExpDt getMsgSetRequestExpDt_elem() {
    return (xsd.acord.MsgSetRequestExpDt) TYPE.get().getPropertyValue( this, "_MsgSetRequestExpDt_elem" );
  }


  public final void setMsgSetRequestExpDt_elem( xsd.acord.MsgSetRequestExpDt value ) {
    TYPE.get().setPropertyValue( this, "_MsgSetRequestExpDt_elem", value );
  }

}