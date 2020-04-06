package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/summary/RemoveFlagInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RemoveFlagInfoDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($removeFlagInfo :  RemoveFlagInfo, $claim :  Claim, $viaTeamScreen :  boolean) : void {
    __widgetOf(this, pcf.RemoveFlagInfoDV, SECTION_WIDGET_CLASS).setVariables(false, {$removeFlagInfo, $claim, $viaTeamScreen})
  }
  
  function refreshVariables ($removeFlagInfo :  RemoveFlagInfo, $claim :  Claim, $viaTeamScreen :  boolean) : void {
    __widgetOf(this, pcf.RemoveFlagInfoDV, SECTION_WIDGET_CLASS).setVariables(true, {$removeFlagInfo, $claim, $viaTeamScreen})
  }
  
  
}