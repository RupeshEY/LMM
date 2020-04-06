package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/ActivityNotesPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityNotesPageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/notes/ActivityNotesPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityNotesPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Activity :  Activity) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ActivityNotesPage) at ActivityNotesPage.pcf: line 10, column 60
    static function canVisit_2 (Activity :  Activity, Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimnotes
    }
    
    // 'def' attribute on ScreenRef at ActivityNotesPage.pcf: line 20, column 49
    function def_onEnter_0 (def :  pcf.NotesSearchScreen) : void {
      def.onEnter(Claim, Activity)
    }
    
    // 'def' attribute on ScreenRef at ActivityNotesPage.pcf: line 20, column 49
    function def_refreshVariables_1 (def :  pcf.NotesSearchScreen) : void {
      def.refreshVariables(Claim, Activity)
    }
    
    // 'parent' attribute on Page (id=ActivityNotesPage) at ActivityNotesPage.pcf: line 10, column 60
    static function parent_3 (Activity :  Activity, Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimWorkplan.createDestination(Claim)
    }
    
    property get Activity () : Activity {
      return getVariableValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setVariableValue("Activity", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ActivityNotesPage {
      return super.CurrentLocation as pcf.ActivityNotesPage
    }
    
    
  }
  
  
}