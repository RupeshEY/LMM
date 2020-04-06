package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coveragetype.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewExposureMenuItemSet_coveragetypeExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coveragetype.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuItemTreeEntryExpressionsImpl extends NewExposureMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at NewExposureMenuItemSet.coveragetype.pcf: line 20, column 36
    function action_0 () : void {
      NewExposure.go(claim, item.CoverageType, item.CoverageSubtype, item.lazyLoadCoverage(claim))
    }
    
    // 'action' attribute on MenuItem (id=item) at NewExposureMenuItemSet.coveragetype.pcf: line 20, column 36
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NewExposure.createDestination(claim, item.CoverageType, item.CoverageSubtype, item.lazyLoadCoverage(claim))
    }
    
    // 'children' attribute on MenuItemTree at NewExposureMenuItemSet.coveragetype.pcf: line 15, column 57
    function children_3 () : java.lang.Object {
      return item.Children
    }
    
    // 'label' attribute on MenuItem (id=item) at NewExposureMenuItemSet.coveragetype.pcf: line 20, column 36
    function label_2 () : java.lang.Object {
      return item.DisplayLabel
    }
    
    property get item () : gw.api.exposure.NewExposureMenuItem {
      return getIteratedValue(1) as gw.api.exposure.NewExposureMenuItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.coveragetype.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MenuItemTree at NewExposureMenuItemSet.coveragetype.pcf: line 15, column 57
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