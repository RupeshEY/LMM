package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/desktop/claims/DesktopClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopClaimsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimDesktopViewList :  gw.api.database.IQueryBeanResult<ClaimDesktopView>, $User :  User, $EnableNavLinks :  Boolean) : void {
    __widgetOf(this, pcf.DesktopClaimsLV, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimDesktopViewList, $User, $EnableNavLinks})
  }
  
  function refreshVariables ($ClaimDesktopViewList :  gw.api.database.IQueryBeanResult<ClaimDesktopView>, $User :  User, $EnableNavLinks :  Boolean) : void {
    __widgetOf(this, pcf.DesktopClaimsLV, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimDesktopViewList, $User, $EnableNavLinks})
  }
  
  
}