package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityTrackingInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityTrackingInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityTrackingInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityTrackingInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=CompleteDate) at ActivityTrackingInputSet.pcf: line 17, column 35
    function valueRoot_2 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TextInput (id=CloseUser) at ActivityTrackingInputSet.pcf: line 21, column 47
    function valueRoot_5 () : java.lang.Object {
      return Activity.CloseUser
    }
    
    // 'value' attribute on DateInput (id=CompleteDate) at ActivityTrackingInputSet.pcf: line 17, column 35
    function value_0 () : java.util.Date {
      return Activity.CloseDate
    }
    
    // 'value' attribute on TextInput (id=CloseUser) at ActivityTrackingInputSet.pcf: line 21, column 47
    function value_3 () : java.lang.String {
      return Activity.CloseUser.DisplayName
    }
    
    // 'value' attribute on BooleanRadioInput (id=Recurring) at ActivityTrackingInputSet.pcf: line 25, column 35
    function value_6 () : java.lang.Boolean {
      return Activity.Recurring
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    
  }
  
  
}