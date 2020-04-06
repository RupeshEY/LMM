package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/activitypatterns/NewActivityPattern.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewActivityPatternExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/activitypatterns/NewActivityPattern.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewActivityPatternExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Category :  ActivityCategory) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewActivityPattern) at NewActivityPattern.pcf: line 15, column 93
    function afterCancel_3 () : void {
      ActivityPatterns.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewActivityPattern) at NewActivityPattern.pcf: line 15, column 93
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.ActivityPatterns.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewActivityPattern) at NewActivityPattern.pcf: line 15, column 93
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      ActivityPatterns.go()
    }
    
    // 'canVisit' attribute on Page (id=NewActivityPattern) at NewActivityPattern.pcf: line 15, column 93
    static function canVisit_6 (Category :  ActivityCategory) : java.lang.Boolean {
      return perm.ActivityPattern.create
    }
    
    // 'def' attribute on ScreenRef at NewActivityPattern.pcf: line 26, column 59
    function def_onEnter_1 (def :  pcf.ActivityPatternDetailScreen) : void {
      def.onEnter(ActivityPattern)
    }
    
    // 'def' attribute on ScreenRef at NewActivityPattern.pcf: line 26, column 59
    function def_refreshVariables_2 (def :  pcf.ActivityPatternDetailScreen) : void {
      def.refreshVariables(ActivityPattern)
    }
    
    // 'initialValue' attribute on Variable at NewActivityPattern.pcf: line 24, column 31
    function initialValue_0 () : ActivityPattern {
      return new ActivityPattern()
    }
    
    // 'parent' attribute on Page (id=NewActivityPattern) at NewActivityPattern.pcf: line 15, column 93
    static function parent_7 (Category :  ActivityCategory) : pcf.api.Destination {
      return pcf.ActivityPatterns.createDestination()
    }
    
    // 'startEditing' attribute on Page (id=NewActivityPattern) at NewActivityPattern.pcf: line 15, column 93
    function startEditing_8 () : void {
      ActivityPattern.Category = Category; ActivityPattern.setInitialValues()
    }
    
    property get ActivityPattern () : ActivityPattern {
      return getVariableValue("ActivityPattern", 0) as ActivityPattern
    }
    
    property set ActivityPattern ($arg :  ActivityPattern) {
      setVariableValue("ActivityPattern", 0, $arg)
    }
    
    property get Category () : ActivityCategory {
      return getVariableValue("Category", 0) as ActivityCategory
    }
    
    property set Category ($arg :  ActivityCategory) {
      setVariableValue("Category", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewActivityPattern {
      return super.CurrentLocation as pcf.NewActivityPattern
    }
    
    
  }
  
  
}