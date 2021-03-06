/* Generated by Guidewire XML Code Generator */

package xsd.acord.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum LogType implements gw.xml.IXmlSchemaEnumValue {
  AIRF( "AIRF" ),
  AK( "AK" ),
  AMPHIB( "AMPHIB" ),
  ANLYR( "ANLYR" ),
  ANNYR( "ANNYR" ),
  CHART( "CHART" ),
  CNELYR( "CNELYR" ),
  CNENYR( "CNENYR" ),
  CONVENT( "CONVENT" ),
  DUST( "DUST" ),
  ENG1( "ENG1" ),
  ENG2( "ENG2" ),
  ENG3( "ENG3" ),
  ENG4( "ENG4" ),
  FERT( "FERT" ),
  HERD( "HERD" ),
  INSTR( "INSTR" ),
  INSTRU( "INSTRU" ),
  LAST12MO( "LAST12MO" ),
  LAST90DAY( "LAST90DAY" ),
  MEL( "MEL" ),
  MESEA( "MESEA" ),
  OT( "OT" ),
  PIC( "PIC" ),
  RENT( "RENT" ),
  REOLYR( "REOLYR" ),
  REONYR( "REONYR" ),
  RETRACT( "RETRACT" ),
  RWAERIAL( "RWAERIAL" ),
  RWING( "RWING" ),
  SEED( "SEED" ),
  SETURBO( "SETURBO" ),
  SIC( "SIC" ),
  SPRAY( "SPRAY" ),
  TAERIAL( "TAERIAL" ),
  TAGRI( "TAGRI" ),
  TOTAL( "TOTAL" ),
  TRWAG( "TRWAG" ),
  TRWING( "TRWING" ),
  TSEA( "TSEA" ),
  TURBOJET( "TURBOJET" ),
  TURBOPROP( "TURBOPROP" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.enums.LogType" );
    }
  };

  private final java.lang.String _stringValue;

  private LogType( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final xsd.acord.enums.LogType forValue( java.lang.String value ) {
    return (xsd.acord.enums.LogType) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final xsd.acord.enums.LogType forGosuValue( java.lang.String value ) {
    return (xsd.acord.enums.LogType) TYPE.get().cg_forValue( value );
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
