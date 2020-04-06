package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/EditNotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditNotePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/notes/EditNotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditNotePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (note :  entity.Note) : int {
      return 0
    }
    
    static function __constructorIndex (note :  entity.Note, topicEditable :  boolean, relatedToEditable :  boolean) : int {
      return 1
    }
    
    // 'def' attribute on PanelRef at EditNotePopup.pcf: line 31, column 69
    function def_onEnter_1 (def :  pcf.NoteDetailDV) : void {
      def.onEnter(note, topicEditable, relatedToEditable)
    }
    
    // 'def' attribute on PanelRef at EditNotePopup.pcf: line 31, column 69
    function def_refreshVariables_2 (def :  pcf.NoteDetailDV) : void {
      def.refreshVariables(note, topicEditable, relatedToEditable)
    }
    
    // EditButtons at EditNotePopup.pcf: line 28, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    override property get CurrentLocation () : pcf.EditNotePopup {
      return super.CurrentLocation as pcf.EditNotePopup
    }
    
    property get note () : entity.Note {
      return getVariableValue("note", 0) as entity.Note
    }
    
    property set note ($arg :  entity.Note) {
      setVariableValue("note", 0, $arg)
    }
    
    property get relatedToEditable () : boolean {
      return getVariableValue("relatedToEditable", 0) as java.lang.Boolean
    }
    
    property set relatedToEditable ($arg :  boolean) {
      setVariableValue("relatedToEditable", 0, $arg)
    }
    
    property get topicEditable () : boolean {
      return getVariableValue("topicEditable", 0) as java.lang.Boolean
    }
    
    property set topicEditable ($arg :  boolean) {
      setVariableValue("topicEditable", 0, $arg)
    }
    
    
  }
  
  
}