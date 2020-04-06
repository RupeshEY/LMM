package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewExposureMenuItemSet_bothExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuItemTreeEntry2ExpressionsImpl extends NewExposureMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at NewExposureMenuItemSet.both.pcf: line 41, column 38
    function action_6 () : void {
      NewExposure.go(claim, item.CoverageType, item.CoverageSubtype, item.lazyLoadCoverage(claim))
    }
    
    // 'action' attribute on MenuItem (id=item) at NewExposureMenuItemSet.both.pcf: line 41, column 38
    function action_dest_7 () : pcf.api.Destination {
      return pcf.NewExposure.createDestination(claim, item.CoverageType, item.CoverageSubtype, item.lazyLoadCoverage(claim))
    }
    
    // 'available' attribute on MenuItem (id=item) at NewExposureMenuItemSet.both.pcf: line 41, column 38
    function available_5 () : java.lang.Boolean {
      return (item.CoverageType != null and item.CoverageSubtype != null) or item.Children.length > 0
    }
    
    // 'children' attribute on MenuItemTree at NewExposureMenuItemSet.both.pcf: line 35, column 59
    function children_9 () : java.lang.Object {
      return item.Children
    }
    
    // 'label' attribute on MenuItem (id=item) at NewExposureMenuItemSet.both.pcf: line 41, column 38
    function label_8 () : java.lang.Object {
      return item.DisplayLabel
    }
    
    property get item () : gw.api.exposure.NewExposureMenuItem {
      return getIteratedValue(1) as gw.api.exposure.NewExposureMenuItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuItemTreeEntryExpressionsImpl extends NewExposureMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at NewExposureMenuItemSet.both.pcf: line 24, column 38
    function action_0 () : void {
      NewExposure.go(claim, item.CoverageType, item.CoverageSubtype, item.lazyLoadCoverage(claim))
    }
    
    // 'action' attribute on MenuItem (id=item) at NewExposureMenuItemSet.both.pcf: line 24, column 38
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NewExposure.createDestination(claim, item.CoverageType, item.CoverageSubtype, item.lazyLoadCoverage(claim))
    }
    
    // 'children' attribute on MenuItemTree at NewExposureMenuItemSet.both.pcf: line 19, column 59
    function children_3 () : java.lang.Object {
      return item.Children
    }
    
    // 'label' attribute on MenuItem (id=item) at NewExposureMenuItemSet.both.pcf: line 24, column 38
    function label_2 () : java.lang.Object {
      return item.DisplayLabel
    }
    
    property get item () : gw.api.exposure.NewExposureMenuItem {
      return getIteratedValue(1) as gw.api.exposure.NewExposureMenuItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.both.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MenuItemTree at NewExposureMenuItemSet.both.pcf: line 35, column 59
    function value_10 () : gw.api.exposure.NewExposureMenuItem[] {
      return gw.api.exposure.NewExposureMenuUtil.createItemsByCoverage(claim)
    }
    
    // 'value' attribute on MenuItemTree at NewExposureMenuItemSet.both.pcf: line 19, column 59
    function value_4 () : gw.api.exposure.NewExposureMenuItem[] {
      return gw.api.exposure.NewExposureMenuUtil.createItemsByCoverageType(claim)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}