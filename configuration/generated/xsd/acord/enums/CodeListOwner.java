/* Generated by Guidewire XML Code Generator */

package xsd.acord.enums;

@javax.annotation.Generated("gw.xml.codegen.XmlCodeGenerator")
@gw.lang.SimplePropertyProcessing
public enum CodeListOwner implements gw.xml.IXmlSchemaEnumValue {
  AAI( "AAI" ),
  AAMVAnet( "AAMVAnet" ),
  AASCIF( "AASCIF" ),
  ABI( "ABI" ),
  ACORD( "ACORD" ),
  AHC( "AHC" ),
  AIA( "AIA" ),
  AIIM( "AIIM" ),
  ANSI( "ANSI" ),
  ANSIX12( "ANSIX12" ),
  APS( "APS" ),
  ASA( "ASA" ),
  ASTM( "ASTM" ),
  AWG( "AWG" ),
  BC( "BC" ),
  BLS( "BLS" ),
  BT( "BT" ),
  CAA( "CAA" ),
  CCOW( "CCOW" ),
  CEFACTUNEDIFACT( "CEFACTUNEDIFACT" ),
  CENISSS( "CENISSS" ),
  CIC( "CIC" ),
  CIECA( "CIECA" ),
  CLIEDIS( "CLIEDIS" ),
  CO( "CO" ),
  CORBAmed( "CORBAmed" ),
  CPEX( "CPEX" ),
  CRESTA( "CRESTA" ),
  CSIO( "CSIO" ),
  CTSB( "CTSB" ),
  DICOM( "DICOM" ),
  DISA( "DISA" ),
  DLS( "DLS" ),
  DTCC( "DTCC" ),
  EbXML( "ebXML" ),
  ECMA( "ECMA" ),
  EEG7( "eEG7" ),
  FBI( "FBI" ),
  FESG( "FESG" ),
  FHA( "FHA" ),
  FIPA( "FIPA" ),
  FIX( "FIX" ),
  FMCSA( "FMCSA" ),
  FpML( "FpML" ),
  GSTPA( "GSTPA" ),
  HEG( "HEG" ),
  HL7( "HL7" ),
  HRXMLConsortium( "HRXMLConsortium" ),
  I3STF( "I3STF" ),
  IAA( "IAA" ),
  IAIABC( "IAIABC" ),
  IDA( "IDA" ),
  IDMA( "IDMA" ),
  IEEE( "IEEE" ),
  IETF( "IETF" ),
  IFIC( "IFIC" ),
  IFX( "IFX" ),
  IICC( "IICC" ),
  III( "III" ),
  INS( "INS" ),
  ISAC( "ISAC" ),
  ISITC( "ISITC" ),
  ISO( "ISO" ),
  ISOUS( "ISOUS" ),
  IVANS( "IVANS" ),
  JV( "JV" ),
  MIB( "MIB" ),
  MISMO( "MISMO" ),
  MMCF( "MMCF" ),
  NACHA( "NACHA" ),
  NAGS( "NAGS" ),
  NAIC( "NAIC" ),
  NAII( "NAII" ),
  NAILBA( "NAILBA" ),
  NAVA( "NAVA" ),
  NCCI( "NCCI" ),
  NCITS( "NCITS" ),
  NCPDP( "NCPDP" ),
  NHTSA( "NHTSA" ),
  NICB( "NICB" ),
  NISO( "NISO" ),
  NSIT( "NSIT" ),
  OAG( "OAG" ),
  OASIS( "OASIS" ),
  OBI( "OBI" ),
  OFX( "OFX" ),
  OMG( "OMG" ),
  ORIGO( "ORIGO" ),
  OSHA( "OSHA" ),
  PRDB( "PRDB" ),
  PRDP( "PRDP" ),
  RAA( "RAA" ),
  REDX( "REDX" ),
  RN( "RN" ),
  SCRS( "SCRS" ),
  SEMI( "SEMI" ),
  SWIFT( "SWIFT" ),
  TEG( "TEG" ),
  TMForum( "TMForum" ),
  TMWG( "TMWG" ),
  UCC( "UCC" ),
  UNCITL( "UNCITL" ),
  UNCTD( "UNCTD" ),
  USNBTCSJSU( "USNBTCSJSU" ),
  USSS( "USSS" ),
  W3C( "W3C" ),
  WCIO( "WCIO" ),
  WCO( "WCO" ),
  WFMC( "WFMC" ),
  WISe( "WISe" ),
  WTO( "WTO" ),
  XBRL( "XBRL" );
  private static final gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl> TYPE = new gw.internal.xml.util.LockingLazyVar<gw.internal.xml.XmlEnumerationTypeDataImpl>() {
    @java.lang.Override
    public gw.internal.xml.XmlEnumerationTypeDataImpl init() {
      return (gw.internal.xml.XmlEnumerationTypeDataImpl) ( (gw.internal.xml.XmlSchemaAccessImpl) xsd.acord.util.SchemaAccess ).getSchemaIndex().getTypeData( "xsd.acord.enums.CodeListOwner" );
    }
  };

  private final java.lang.String _stringValue;

  private CodeListOwner( java.lang.String stringValue ) {
    _stringValue = stringValue;
  }

  public static final xsd.acord.enums.CodeListOwner forValue( java.lang.String value ) {
    return (xsd.acord.enums.CodeListOwner) TYPE.get().cg_forValue( value );
  } // xmlRefactorRemove

  public static final xsd.acord.enums.CodeListOwner forGosuValue( java.lang.String value ) {
    return (xsd.acord.enums.CodeListOwner) TYPE.get().cg_forValue( value );
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
