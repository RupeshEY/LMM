package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coverage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewExposureMenuItemSet_coverageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coverage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuItemTreeEntryExpressionsImpl extends NewExposureMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at NewExposureMenuItemSet.coverage.pcf: line 21, column 36
    function action_1 () : void {
      NewExposure.go(claim, item.CoverageType, item.CoverageSubtype, item.lazyLoadCoverage(claim))
    }
    
    // 'action' attribute on MenuItem (id=item) at NewExposureMenuItemSet.coverage.pcf: line 21, column 36
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewExposure.createDestination(claim, item.CoverageType, item.CoverageSubtype, item.lazyLoadCoverage(claim))
    }
    
    // 'available' attribute on MenuItem (id=item) at NewExposureMenuItemSet.coverage.pcf: line 21, column 36
    function available_0 () : java.lang.Boolean {
      return (item.CoverageType != null and item.CoverageSubtype != null) or item.Children.length > 0
    }
    
    // 'children' attribute on MenuItemTree at NewExposureMenuItemSet.coverage.pcf: line 15, column 57
    function children_4 () : java.lang.Object {
      return item.Children
    }
    
    // 'label' attribute on MenuItem (id=item) at NewExposureMenuItemSet.coverage.pcf: line 21, column 36
    function label_3 () : java.lang.Object {
      return item.DisplayLabel
    }
    
    property get item () : gw.api.exposure.NewExposureMenuItem {
      return getIteratedValue(1) as gw.api.exposure.NewExposureMenuItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coverage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MenuItemTree at NewExposureMenuItemSet.coverage.pcf: line 15, column 57
    function value_5 () : gw.api.exposure.NewExposureMenuItem[] {
      return gw.api.exposure.NewExposureMenuUtil.createItemsByCoverage(claim)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}