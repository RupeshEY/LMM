package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityCompensableInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityCompensableInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityCompensableInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityCompensableInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=UpdateCompensability) at ActivityCompensableInputSet.pcf: line 18, column 62
    function action_2 () : void {
      ClaimLossDetailsForward.goInMain(Claim, true)
    }
    
    // 'action' attribute on ButtonInput (id=UpdateCompensability) at ActivityCompensableInputSet.pcf: line 18, column 62
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimLossDetailsForward.createDestination(Claim, true)
    }
    
    // 'visible' attribute on ButtonInput (id=UpdateCompensability) at ActivityCompensableInputSet.pcf: line 18, column 62
    function visible_0 () : java.lang.Boolean {
      return Claim.CompensableActivity.Status == TC_OPEN
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}