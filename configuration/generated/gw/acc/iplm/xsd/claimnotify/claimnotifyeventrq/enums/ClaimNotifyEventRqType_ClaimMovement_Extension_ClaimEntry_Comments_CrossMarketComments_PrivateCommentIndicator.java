/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator implements gw.xml.IXmlSchemaEnumValue {
  Y( "Y" ),
  N( "N" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator" );
    }
  };

  private final java.lang.String _stringValue;

  private ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator forValue( java.lang.String value ) {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator forGosuValue( java.lang.String value ) {
    return (gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ClaimMovement_Extension_ClaimEntry_Comments_CrossMarketComments_PrivateCommentIndicator) TYPE.get().cg_forValue( value );
  }

  @java.lang.Override
  public final gw.xml.XmlSimpleValue getSimpleValue() {
    return TYPE.get().getEnumSimpleValue( this );
  } // xmlRefactorRemove

  @java.lang.Override
  public final java.lang.String getStringValue() {
    return _stringValue; // xmlRefactorRemove
  } // xmlRefactorRemove

  @java.lang.Override
  public final java.lang.String getSerializedValue() {
    return _stringValue;
  }

  @java.lang.Override
  public final java.lang.String getValue() {
    return (java.lang.String) TYPE.get().getEnumSimpleValue( this ).getValue();
  } // xmlRefactorRemove

  @java.lang.Override
  public final java.lang.String getGosuValue() {
    return (java.lang.String) TYPE.get().getEnumSimpleValue( this ).getValue();
  }

  @java.lang.Override
  public final String getCode() {
    return name();
  }

  @java.lang.Override
  public final int getOrdinal() {
    return ordinal();
  }

  @java.lang.Override
  public final String toString() {
    return _stringValue;
  }

}
