package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/email/EmailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EmailWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/email/EmailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmailWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (activity :  Activity) : int {
      return 1
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Worksheet (id=EmailWorksheet) at EmailWorksheet.pcf: line 11, column 60
    static function canVisit_3 (activity :  Activity, claim :  Claim) : java.lang.Boolean {
      return perm.System.sendemail
    }
    
    // 'def' attribute on ScreenRef at EmailWorksheet.pcf: line 26, column 79
    function def_onEnter_1 (def :  pcf.CreateEmailScreen) : void {
      def.onEnter(activity, claim, activity.EmailTemplate, null)
    }
    
    // 'def' attribute on ScreenRef at EmailWorksheet.pcf: line 26, column 79
    function def_refreshVariables_2 (def :  pcf.CreateEmailScreen) : void {
      def.refreshVariables(activity, claim, activity.EmailTemplate, null)
    }
    
    // 'initialValue' attribute on Variable at EmailWorksheet.pcf: line 24, column 21
    function initialValue_0 () : Claim {
      return activity != null ? activity.Claim : null
    }
    
    override property get CurrentLocation () : pcf.EmailWorksheet {
      return super.CurrentLocation as pcf.EmailWorksheet
    }
    
    property get activity () : Activity {
      return getVariableValue("activity", 0) as Activity
    }
    
    property set activity ($arg :  Activity) {
      setVariableValue("activity", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}