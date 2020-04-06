package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coverage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimNewExposureMenuItemSet_coverageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coverage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuItemTreeEntryExpressionsImpl extends NewClaimNewExposureMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at NewClaimNewExposureMenuItemSet.coverage.pcf: line 22, column 36
    function action_0 () : void {
      NewClaimWizard_NewExposurePopup.push(claim, wizard, item.loadCoverageFromBundle(claim), item.CoverageType, item.CoverageSubtype)
    }
    
    // 'action' attribute on MenuItem (id=item) at NewClaimNewExposureMenuItemSet.coverage.pcf: line 22, column 36
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NewClaimWizard_NewExposurePopup.createDestination(claim, wizard, item.loadCoverageFromBundle(claim), item.CoverageType, item.CoverageSubtype)
    }
    
    // 'children' attribute on MenuItemTree at NewClaimNewExposureMenuItemSet.coverage.pcf: line 18, column 57
    function children_3 () : java.lang.Object {
      return item.Children
    }
    
    // 'label' attribute on MenuItem (id=item) at NewClaimNewExposureMenuItemSet.coverage.pcf: line 22, column 36
    function label_2 () : java.lang.Object {
      return item.DisplayLabel
    }
    
    property get item () : gw.api.exposure.NewExposureMenuItem {
      return getIteratedValue(1) as gw.api.exposure.NewExposureMenuItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimNewExposureMenuItemSet.coverage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimNewExposureMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MenuItemTree at NewClaimNewExposureMenuItemSet.coverage.pcf: line 18, column 57
    function value_4 () : gw.api.exposure.NewExposureMenuItem[] {
      return gw.api.exposure.NewExposureMenuUtil.createItemsByCoverage(claim)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}