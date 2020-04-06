package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_EditNotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_EditNotePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_EditNotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_EditNotePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (note :  Note, claim :  Claim) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at FNOLWizard_EditNotePopup.pcf: line 19, column 53
    function def_onEnter_0 (def :  pcf.FNOLWizard_EditNoteScreen) : void {
      def.onEnter(note, claim)
    }
    
    // 'def' attribute on ScreenRef at FNOLWizard_EditNotePopup.pcf: line 19, column 53
    function def_refreshVariables_1 (def :  pcf.FNOLWizard_EditNoteScreen) : void {
      def.refreshVariables(note, claim)
    }
    
    // 'title' attribute on Popup (id=FNOLWizard_EditNotePopup) at FNOLWizard_EditNotePopup.pcf: line 9, column 18
    static function title_2 (claim :  Claim, note :  Note) : java.lang.Object {
      return null
    }
    
    override property get CurrentLocation () : pcf.FNOLWizard_EditNotePopup {
      return super.CurrentLocation as pcf.FNOLWizard_EditNotePopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get note () : Note {
      return getVariableValue("note", 0) as Note
    }
    
    property set note ($arg :  Note) {
      setVariableValue("note", 0, $arg)
    }
    
    
  }
  
  
}