/* Generated by Guidewire XML Code Generator */

package wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
@gw.xml.annotation.SuperTypeData({ })
public final class AckMessage_Ack extends gw.xml.XmlElement {
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "ack", "tns" );
  public static final gw.xml.XmlNamespace $NAMESPACE = new gw.xml.XmlNamespace( "http://guidewire.com/cc/ws/gw/webservice/cc/MessagingToolsAPI", "tns" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_AckCode = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "AckCode", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_CustomEvents = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "CustomEvents", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Duplicate = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "Duplicate", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Error = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "Error", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_ErrorDescription = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "ErrorDescription", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_FieldChanges = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "FieldChanges", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_MessageID = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "MessageID", "pogo2" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Retryable = new javax.xml.namespace.QName( "http://guidewire.com/gw/api/webservice/messagingTools", "Retryable", "pogo2" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlElementTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlElementTypeDataImpl init() {
      return (gw.internal.xml.XmlElementTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.AckMessage_Ack" );
    }
  };
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl> TYPEINSTANCETYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlTypeInstanceTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlTypeInstanceTypeDataImpl init() {
      return (gw.internal.xml.XmlTypeInstanceTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) wsi.local.gw.webservice.cc.messagingtoolsapi.util.SchemaAccess ).getSchemaIndex().getTypeData( "wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement" );
    }
  };

  public AckMessage_Ack() {
    super( -2107356840, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), new wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement() );
  }

  public AckMessage_Ack( wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement typeInstance ) {
    super( -2107356840, $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  private AckMessage_Ack( gw.internal.xml.XmlElementState state ) {
    super( -2107356840, state );
  }

  public static gw.xml.XmlElementTypeData asTypeData() {
    return TYPE.get();
  }

  public static gw.xml.XmlTypeInstanceTypeData getDefaultTypeInstanceTypeData() {
    return TYPEINSTANCETYPE.get();
  }

  @java.lang.Override
  public final java.lang.Class<? extends wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.AckMessage_Ack> get$Class() {
    return getClass();
  }

  @java.lang.Override
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement get$TypeInstance() {
    return super.get$TypeInstance().cast( wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement.class );
  }

  public final void set$TypeInstance( wsi.local.gw.webservice.cc.messagingtoolsapi.types.complex.Acknowledgement typeInstance ) {
    _state.setTypeInstance( typeInstance );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getAckCode() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AckCode" );
  }


  public final void setAckCode( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AckCode", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_AckCode getAckCode_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_AckCode) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_AckCode_elem" );
  }


  public final void setAckCode_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_AckCode value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_AckCode_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_CustomEvents getCustomEvents() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_CustomEvents) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_CustomEvents" );
  }


  public final void setCustomEvents( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_CustomEvents value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_CustomEvents", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getDuplicate() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Duplicate" );
  }


  public final void setDuplicate( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Duplicate", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_Duplicate getDuplicate_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_Duplicate) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Duplicate_elem" );
  }


  public final void setDuplicate_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_Duplicate value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Duplicate_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getError() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Error" );
  }


  public final void setError( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Error", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_Error getError_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_Error) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Error_elem" );
  }


  public final void setError_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_Error value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Error_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.String getErrorDescription() {
    return (java.lang.String) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ErrorDescription" );
  }


  public final void setErrorDescription( java.lang.String value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ErrorDescription", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_ErrorDescription getErrorDescription_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_ErrorDescription) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_ErrorDescription_elem" );
  }


  public final void setErrorDescription_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_ErrorDescription value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_ErrorDescription_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_FieldChanges getFieldChanges() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_FieldChanges) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_FieldChanges" );
  }


  public final void setFieldChanges( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_FieldChanges value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_FieldChanges", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Long getMessageID() {
    return (java.lang.Long) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MessageID" );
  }


  public final void setMessageID( java.lang.Long value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MessageID", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_MessageID getMessageID_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_MessageID) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_MessageID_elem" );
  }


  public final void setMessageID_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_MessageID value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_MessageID_elem", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final java.lang.Boolean getRetryable() {
    return (java.lang.Boolean) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Retryable" );
  }


  public final void setRetryable( java.lang.Boolean value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Retryable", value );
  }


  @gw.lang.Autocreate
  @gw.lang.Autoinsert
  public final wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_Retryable getRetryable_elem() {
    return (wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_Retryable) TYPEINSTANCETYPE.get().getPropertyValue( get$TypeInstance(), "_Retryable_elem" );
  }


  public final void setRetryable_elem( wsi.local.gw.webservice.cc.messagingtoolsapi.anonymous.elements.Acknowledgement_Retryable value ) {
    TYPEINSTANCETYPE.get().setPropertyValue( get$TypeInstance(), "_Retryable_elem", value );
  }
}
