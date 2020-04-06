/* Generated by Guidewire XML Code Generator */

package gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum FaultCodesType implements gw.xml.IXmlSchemaEnumValue {
  InvalidAddressingHeader( "InvalidAddressingHeader" ),
  InvalidAddress( "InvalidAddress" ),
  InvalidEPR( "InvalidEPR" ),
  InvalidCardinality( "InvalidCardinality" ),
  MissingAddressInEPR( "MissingAddressInEPR" ),
  DuplicateMessageID( "DuplicateMessageID" ),
  ActionMismatch( "ActionMismatch" ),
  MessageAddressingHeaderRequired( "MessageAddressingHeaderRequired" ),
  DestinationUnreachable( "DestinationUnreachable" ),
  ActionNotSupported( "ActionNotSupported" ),
  EndpointUnavailable( "EndpointUnavailable" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.util.SchemaAccess ).getSchemaIndex().getTypeData( "gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.enums.FaultCodesType" );
    }
  };

  private final java.lang.String _stringValue;

  private FaultCodesType( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.enums.FaultCodesType forValue( javax.xml.namespace.QName value ) {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.enums.FaultCodesType) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.enums.FaultCodesType forGosuValue( javax.xml.namespace.QName value ) {
    return (gw.acc.iplm.xsd.imr.schema_wsdl.ws_addr.enums.FaultCodesType) TYPE.get().cg_forValue( value );
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
  public final javax.xml.namespace.QName getValue() {
    return (javax.xml.namespace.QName) TYPE.get().getEnumSimpleValue( this ).getValue();
  } // xmlRefactorRemove

  @java.lang.Override
  public final javax.xml.namespace.QName getGosuValue() {
    return (javax.xml.namespace.QName) TYPE.get().getEnumSimpleValue( this ).getValue();
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