/* Generated by Guidewire XML Code Generator */

package xsd.acord.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum ItemDefinitionType implements gw.xml.IXmlSchemaEnumValue {
  Antenna( "Antenna" ),
  BE( "BE" ),
  CombinationLock( "CombinationLock" ),
  Crane( "Crane" ),
  EDP( "EDP" ),
  FireReceptacle( "FireReceptacle" ),
  HeatingUnit( "HeatingUnit" ),
  Helicopter( "Helicopter" ),
  Hoist( "Hoist" ),
  IChest( "IChest" ),
  IDoor( "IDoor" ),
  IrrigatnEquip( "IrrigatnEquip" ),
  KeyLock( "KeyLock" ),
  MachAndEquip( "MachAndEquip" ),
  MH( "MH" ),
  MO( "MO" ),
  Other( "Other" ),
  PA( "PA" ),
  Relock( "Relock" ),
  Safe( "Safe" ),
  ScheduledProperty( "ScheduledProperty" ),
  Shell( "Shell" ),
  Structure( "Structure" ),
  TimeLock( "TimeLock" ),
  ToolsSupplies( "ToolsSupplies" ),
  Tower( "Tower" ),
  Trailer( "Trailer" ),
  Vault( "Vault" ),
  Watercraft( "Watercraft" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.enums.ItemDefinitionType" );
    }
  };

  private final java.lang.String _stringValue;

  private ItemDefinitionType( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final xsd.acord.enums.ItemDefinitionType forValue( java.lang.String value ) {
    return (xsd.acord.enums.ItemDefinitionType) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final xsd.acord.enums.ItemDefinitionType forGosuValue( java.lang.String value ) {
    return (xsd.acord.enums.ItemDefinitionType) TYPE.get().cg_forValue( value );
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
