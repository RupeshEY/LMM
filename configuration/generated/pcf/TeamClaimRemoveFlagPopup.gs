package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/summary/TeamClaimRemoveFlagPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamClaimRemoveFlagPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.TeamClaimRemoveFlagPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (Claim :  Claim) : pcf.api.Destination {
    return __newDestination(config(), {Claim}, 0)
  }
  
  static function createDestination (Claim :  Claim, ViaTeamScreen :  Boolean) : pcf.api.Destination {
    return __newDestination(config(), {Claim, ViaTeamScreen}, 1)
  }
  
  static function push (Claim :  Claim) : pcf.api.Location {
    return __newDestination(config(), {Claim}, 0).push()
  }
  
  static function push (Claim :  Claim, ViaTeamScreen :  Boolean) : pcf.api.Location {
    return __newDestination(config(), {Claim, ViaTeamScreen}, 1).push()
  }
  
  
}