/* Generated by Guidewire XML Code Generator */

package xsd.acord.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum SharesType implements gw.xml.IXmlSchemaEnumValue {
  Convertible( "Convertible" ),
  FullyDiluted( "FullyDiluted" ),
  NonVoting( "NonVoting" ),
  Outstanding( "Outstanding" ),
  Preferred( "Preferred" ),
  Voting( "Voting" ),
  VotingOwnedByDirectors( "VotingOwnedByDirectors" ),
  VotingOwnedByOfficers( "VotingOwnedByOfficers" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.enums.SharesType" );
    }
  };

  private final java.lang.String _stringValue;

  private SharesType( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final xsd.acord.enums.SharesType forValue( java.lang.String value ) {
    return (xsd.acord.enums.SharesType) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final xsd.acord.enums.SharesType forGosuValue( java.lang.String value ) {
    return (xsd.acord.enums.SharesType) TYPE.get().cg_forValue( value );
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
