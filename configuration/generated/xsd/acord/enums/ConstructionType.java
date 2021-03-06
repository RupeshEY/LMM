/* Generated by Guidewire XML Code Generator */

package xsd.acord.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum ConstructionType implements gw.xml.IXmlSchemaEnumValue {
  _6Feet( "6Feet" ),
  A( "A" ),
  Aluminum( "Aluminum" ),
  Asphalt( "Asphalt" ),
  B( "B" ),
  BarnPlank( "BarnPlank" ),
  Basket( "Basket" ),
  BevWd( "BevWd" ),
  BlkDecPnt( "BlkDecPnt" ),
  BlkPnt( "BlkPnt" ),
  Board( "Board" ),
  BrdBat( "BrdBat" ),
  Brick( "Brick" ),
  BrkBlk( "BrkBlk" ),
  BrkBlkCus( "BrkBlkCus" ),
  BrkCom( "BrkCom" ),
  BrkFace( "BrkFace" ),
  BrkSol( "BrkSol" ),
  BrkSolCus( "BrkSolCus" ),
  BrkVen( "BrkVen" ),
  BrkVenCus( "BrkVenCus" ),
  BrStone( "BrStone" ),
  C( "C" ),
  CastIron( "CastIron" ),
  CatI( "CatI" ),
  CatII( "CatII" ),
  CatIII( "CatIII" ),
  Cblock( "Cblock" ),
  CEDRK( "CEDRK" ),
  CementF( "CementF" ),
  Chain( "Chain" ),
  Chain4( "Chain4" ),
  Chain6( "Chain6" ),
  Clapboard( "Clapboard" ),
  ClapRedWd( "ClapRedWd" ),
  ConPour( "ConPour" ),
  E( "E" ),
  EIFSCB( "EIFSCB" ),
  EIFSS( "EIFSS" ),
  Electric( "Electric" ),
  F( "F" ),
  G( "G" ),
  GHWall( "GHWall" ),
  Hedge( "Hedge" ),
  Htile( "Htile" ),
  I( "I" ),
  JM( "JM" ),
  L( "L" ),
  Log( "Log" ),
  LogCed( "LogCed" ),
  MFR( "MFR" ),
  MILL( "MILL" ),
  MineralF( "MineralF" ),
  MNC( "MNC" ),
  MY( "MY" ),
  N( "N" ),
  NC( "NC" ),
  OT( "OT" ),
  P( "P" ),
  Pconcrete( "Pconcrete" ),
  PlateSteel( "PlateSteel" ),
  Plywood( "Plywood" ),
  Pmasonry( "Pmasonry" ),
  Pole( "Pole" ),
  Preconcrete( "Preconcrete" ),
  PreMetal( "PreMetal" ),
  PreStone( "PreStone" ),
  PSteelF( "PSteelF" ),
  PVC( "PVC" ),
  R( "R" ),
  Rail( "Rail" ),
  Rconcrete( "Rconcrete" ),
  S( "S" ),
  SheetMetal( "SheetMetal" ),
  SlumpBlock( "SlumpBlock" ),
  SMNC( "SMNC" ),
  SNC( "SNC" ),
  SplitBlock( "SplitBlock" ),
  SplitRail( "SplitRail" ),
  Sstone( "Sstone" ),
  Steel( "Steel" ),
  SteelF( "SteelF" ),
  SteelSid( "SteelSid" ),
  Stone( "Stone" ),
  StoneBlk( "StoneBlk" ),
  StoneBlkCus( "StoneBlkCus" ),
  StoneCult( "StoneCult" ),
  StoneNatv( "StoneNatv" ),
  StoneSolCus( "StoneSolCus" ),
  StoneVen( "StoneVen" ),
  StoneVenCus( "StoneVenCus" ),
  StuccoC( "StuccoC" ),
  StuccoF( "StuccoF" ),
  StuccoM( "StuccoM" ),
  Suspension( "Suspension" ),
  T( "T" ),
  T111( "T111" ),
  THB( "THB" ),
  V( "V" ),
  Vinyl( "Vinyl" ),
  VSS( "VSS" ),
  WinWall( "WinWall" ),
  Wire( "Wire" ),
  Wood( "Wood" ),
  WoodSid( "WoodSid" ),
  WovenWire( "WovenWire" ),
  WovenWireBarbed( "WovenWireBarbed" ),
  Wshakes( "Wshakes" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.enums.ConstructionType" );
    }
  };

  private final java.lang.String _stringValue;

  private ConstructionType( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final xsd.acord.enums.ConstructionType forValue( java.lang.String value ) {
    return (xsd.acord.enums.ConstructionType) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final xsd.acord.enums.ConstructionType forGosuValue( java.lang.String value ) {
    return (xsd.acord.enums.ConstructionType) TYPE.get().cg_forValue( value );
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
