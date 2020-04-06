package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ISOMatchReportDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ISOMatchReportDetailPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.ISOMatchReportDetailPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (isoMatchReport :  ISOMatchReport) : pcf.api.Destination {
    return __newDestination(config(), {isoMatchReport}, 0)
  }
  
  static function push (isoMatchReport :  ISOMatchReport) : pcf.api.Location {
    return __newDestination(config(), {isoMatchReport}, 0).push()
  }
  
  
}