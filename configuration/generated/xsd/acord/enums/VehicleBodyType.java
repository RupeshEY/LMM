/* Generated by Guidewire XML Code Generator */

package xsd.acord.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum VehicleBodyType implements gw.xml.IXmlSchemaEnumValue {
  _2D( "2D" ),
  _2DRHT( "2DRHT" ),
  _2H( "2H" ),
  _2L( "2L" ),
  _2W( "2W" ),
  _3C( "3C" ),
  _4C( "4C" ),
  _4DRHT( "4DRHT" ),
  _4H( "4H" ),
  _4L( "4L" ),
  _4W( "4W" ),
  _4WD( "4WD" ),
  _5D( "5D" ),
  AA( "AA" ),
  AM( "AM" ),
  AMB( "AMB" ),
  AMBE( "AMBE" ),
  AMBNE( "AMBNE" ),
  AMC( "AMC" ),
  ARPTL( "ARPTL" ),
  ATV( "ATV" ),
  BUS( "BUS" ),
  BUSARP( "BUSARP" ),
  BUSCHR( "BUSCHR" ),
  BUSICTY( "BUSICTY" ),
  BUSOTH( "BUSOTH" ),
  BUSPPIL( "BUSPPIL" ),
  BUSPSP( "BUSPSP" ),
  BUSSSE( "BUSSSE" ),
  BUSURB( "BUSURB" ),
  CB( "CB" ),
  CC( "CC" ),
  CDS( "CDS" ),
  CDSDC( "CDSDC" ),
  CDSW( "CDSW" ),
  CHRTB( "CHRTB" ),
  CL( "CL" ),
  CONVT( "CONVT" ),
  COUPE( "COUPE" ),
  CT( "CT" ),
  DB( "DB" ),
  DMPST( "DMPST" ),
  DMPT( "DMPT" ),
  EA( "EA" ),
  FDNP( "FDNP" ),
  FDP( "FDP" ),
  FNRE( "FNRE" ),
  FNRFC( "FNRFC" ),
  FNRH( "FNRH" ),
  FNRL( "FNRL" ),
  FNRN( "FNRN" ),
  FPCPR( "FPCPR" ),
  GC( "GC" ),
  GO( "GO" ),
  HATCH( "HATCH" ),
  HDTOP( "HDTOP" ),
  LEAM( "LEAM" ),
  LEAP( "LEAP" ),
  LENN( "LENN" ),
  LL( "LL" ),
  LM( "LM" ),
  MB( "MB" ),
  MC( "MC" ),
  MH( "MH" ),
  MNS( "MNS" ),
  MOBL22( "MOBL22" ),
  MOBO22( "MOBO22" ),
  MOBOT( "MOBOT" ),
  MOBUN( "MOBUN" ),
  MP( "MP" ),
  MS( "MS" ),
  OMC( "OMC" ),
  OT( "OT" ),
  Othsb( "Othsb" ),
  PP( "PP" ),
  PPIL( "PPIL" ),
  PPRC( "PPRC" ),
  PPRCF( "PPRCF" ),
  PU( "PU" ),
  PUCM( "PUCM" ),
  PVNOC( "PVNOC" ),
  RT( "RT" ),
  RV( "RV" ),
  SC( "SC" ),
  SD( "SD" ),
  SDS( "SDS" ),
  SDSD( "SDSD" ),
  SDSW( "SDSW" ),
  SEDAN( "SEDAN" ),
  SHRMT( "SHRMT" ),
  SMEF( "SMEF" ),
  SMEN( "SMEN" ),
  SMH22( "SMH22" ),
  SMHO22( "SMHO22" ),
  SNOWM( "SNOWM" ),
  SRVT( "SRVT" ),
  SSEMP( "SSEMP" ),
  SSOTH( "SSOTH" ),
  ST( "ST" ),
  STWAG( "STWAG" ),
  TAXI( "TAXI" ),
  TB( "TB" ),
  TCDSD( "TCDSD" ),
  TCDSW( "TCDSW" ),
  TR( "TR" ),
  TRAE( "TRAE" ),
  TREMO( "TREMO" ),
  TREMP( "TREMP" ),
  TRUCKD( "TRUCKD" ),
  TRUCKT( "TRUCKT" ),
  TRUCKTKTR( "TRUCKTKTR" ),
  UT( "UT" ),
  VAN( "VAN" ),
  VAN8V( "VAN8V" ),
  VANCRG( "VANCRG" ),
  VANEC( "VANEC" ),
  VANES( "VANES" ),
  VANEW( "VANEW" ),
  VANMV( "VANMV" ),
  VANPAN( "VANPAN" ),
  VANPE( "VANPE" ),
  VANPO( "VANPO" ),
  VANSTP( "VANSTP" ),
  VANSV( "VANSV" ),
  VANUTIL( "VANUTIL" ),
  VANVC( "VANVC" ),
  VANWD( "VANWD" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.enums.VehicleBodyType" );
    }
  };

  private final java.lang.String _stringValue;

  private VehicleBodyType( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final xsd.acord.enums.VehicleBodyType forValue( java.lang.String value ) {
    return (xsd.acord.enums.VehicleBodyType) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final xsd.acord.enums.VehicleBodyType forGosuValue( java.lang.String value ) {
    return (xsd.acord.enums.VehicleBodyType) TYPE.get().cg_forValue( value );
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
