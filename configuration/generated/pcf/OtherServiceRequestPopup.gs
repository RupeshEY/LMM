package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/OtherServiceRequestPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OtherServiceRequestPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.OtherServiceRequestPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, incident :  Incident) : pcf.api.Destination {
    return __newDestination(config(), {claim, incident}, 0)
  }
  
  static function createDestination (claim :  Claim, incident :  Incident, incidentOtherServices :  java.util.Set<ServiceRequest>, incidentsToExclude :  java.util.Collection<Incident>) : pcf.api.Destination {
    return __newDestination(config(), {claim, incident, incidentOtherServices, incidentsToExclude}, 1)
  }
  
  static function push (claim :  Claim, incident :  Incident) : pcf.api.Location {
    return __newDestination(config(), {claim, incident}, 0).push()
  }
  
  static function push (claim :  Claim, incident :  Incident, incidentOtherServices :  java.util.Set<ServiceRequest>, incidentsToExclude :  java.util.Collection<Incident>) : pcf.api.Location {
    return __newDestination(config(), {claim, incident, incidentOtherServices, incidentsToExclude}, 1).push()
  }
  
  
}