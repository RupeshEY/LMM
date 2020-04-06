package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewActivityMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at NewActivityMenuItemSet.pcf: line 24, column 121
    function action_0 () : void {
      NewActivity.go(claim, pattern)
    }
    
    // 'action' attribute on MenuItem (id=item) at NewActivityMenuItemSet.pcf: line 24, column 121
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NewActivity.createDestination(claim, pattern)
    }
    
    // 'label' attribute on MenuItem (id=item) at NewActivityMenuItemSet.pcf: line 24, column 121
    function label_2 () : java.lang.Object {
      return pattern.Subject == null ? DisplayKey.get("Java.NewActivity.NoSubject") : pattern.Subject
    }
    
    property get pattern () : entity.ActivityPattern {
      return getIteratedValue(2) as entity.ActivityPattern
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewActivityMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on MenuItem (id=NewActivityMenuItemSet_Category) at NewActivityMenuItemSet.pcf: line 16, column 149
    function label_4 () : java.lang.Object {
      return categoryMenuItem.Category == null ? DisplayKey.get("Java.NewActivity.NoCategory") : categoryMenuItem.Category.DisplayName
    }
    
    // 'value' attribute on MenuItemIterator at NewActivityMenuItemSet.pcf: line 20, column 48
    function value_3 () : entity.ActivityPattern[] {
      return categoryMenuItem.Patterns
    }
    
    property get categoryMenuItem () : gw.api.activity.ActivityPatternMenuCategory {
      return getIteratedValue(1) as gw.api.activity.ActivityPatternMenuCategory
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewActivityMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MenuItemIterator at NewActivityMenuItemSet.pcf: line 13, column 65
    function value_5 () : gw.api.activity.ActivityPatternMenuCategory[] {
      return gw.api.activity.NewActivityMenuUtil.createMenuItems(claim.ApplicableActivityPatterns)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}