/* Generated by Guidewire XML Code Generator */

package xsd.acord.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum DrivingRecord implements gw.xml.IXmlSchemaEnumValue {
  ACC( "ACC" ),
  ACCAF( "ACCAF" ),
  ACCNF( "ACCNF" ),
  ADMOV( "ADMOV" ),
  ADV( "ADV" ),
  BIACC( "BIACC" ),
  CARE( "CARE" ),
  CIT( "CIT" ),
  DBA( "DBA" ),
  DBT( "DBT" ),
  DOC( "DOC" ),
  DPO( "DPO" ),
  DTS( "DTS" ),
  DWI( "DWI" ),
  DWIDD( "DWIDD" ),
  DWLS( "DWLS" ),
  ENDGR( "ENDGR" ),
  EQUIP( "EQUIP" ),
  FFC( "FFC" ),
  FFD( "FFD" ),
  FRP( "FRP" ),
  FSRL( "FSRL" ),
  FSSS( "FSSS" ),
  FTSSB( "FTSSB" ),
  HOM( "HOM" ),
  JEO( "JEO" ),
  JFE( "JFE" ),
  JMA( "JMA" ),
  JND( "JND" ),
  JNH( "JNH" ),
  LAL( "LAL" ),
  LBS( "LBS" ),
  LDR( "LDR" ),
  LEX( "LEX" ),
  LMR( "LMR" ),
  LNL( "LNL" ),
  LSR( "LSR" ),
  LXL( "LXL" ),
  MBV( "MBV" ),
  MFC( "MFC" ),
  MIB( "MIB" ),
  MID( "MID" ),
  MIL( "MIL" ),
  MIN( "MIN" ),
  MTC( "MTC" ),
  MTO( "MTO" ),
  MUN( "MUN" ),
  MWS( "MWS" ),
  MYP( "MYP" ),
  MYR( "MYR" ),
  NVIO( "NVIO" ),
  OT( "OT" ),
  OWI( "OWI" ),
  OWL( "OWL" ),
  PARK( "PARK" ),
  PASS( "PASS" ),
  PDACC( "PDACC" ),
  PNTS( "PNTS" ),
  POL( "POL" ),
  RACE( "RACE" ),
  RECKL( "RECKL" ),
  RFRF( "RFRF" ),
  RL( "RL" ),
  SEN( "SEN" ),
  SOBR( "SOBR" ),
  SPEED( "SPEED" ),
  SRWI( "SRWI" ),
  STF( "STF" ),
  STOP( "STOP" ),
  THEFT( "THEFT" ),
  TURN( "TURN" ),
  VIN( "VIN" ),
  VIO( "VIO" ),
  VNC( "VNC" ),
  VRL( "VRL" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.enums.DrivingRecord" );
    }
  };

  private final java.lang.String _stringValue;

  private DrivingRecord( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final xsd.acord.enums.DrivingRecord forValue( java.lang.String value ) {
    return (xsd.acord.enums.DrivingRecord) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final xsd.acord.enums.DrivingRecord forGosuValue( java.lang.String value ) {
    return (xsd.acord.enums.DrivingRecord) TYPE.get().cg_forValue( value );
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
