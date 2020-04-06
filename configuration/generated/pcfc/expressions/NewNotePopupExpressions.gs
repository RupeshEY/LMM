package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/NewNotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewNotePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/notes/NewNotePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewNotePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 3
    }
    
    static function __constructorIndex (claim :  Claim, relatedTo :  KeyableBean) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, relatedTo :  KeyableBean, topic :  NoteTopicType) : int {
      return 2
    }
    
    static function __constructorIndex (claim :  Claim, topic :  NoteTopicType) : int {
      return 1
    }
    
    // 'def' attribute on PanelRef at NewNotePopup.pcf: line 44, column 69
    function def_onEnter_4 (def :  pcf.NoteDetailDV) : void {
      def.onEnter(note, topicEditable, relatedToEditable)
    }
    
    // 'def' attribute on PanelRef at NewNotePopup.pcf: line 44, column 69
    function def_refreshVariables_5 (def :  pcf.NoteDetailDV) : void {
      def.refreshVariables(note, topicEditable, relatedToEditable)
    }
    
    // 'initialValue' attribute on Variable at NewNotePopup.pcf: line 21, column 20
    function initialValue_0 () : Note {
      return claim.newNote(topic, relatedTo)
    }
    
    // 'initialValue' attribute on Variable at NewNotePopup.pcf: line 34, column 23
    function initialValue_1 () : boolean {
      return topic == null
    }
    
    // 'initialValue' attribute on Variable at NewNotePopup.pcf: line 38, column 23
    function initialValue_2 () : boolean {
      return relatedTo == null
    }
    
    // EditButtons at NewNotePopup.pcf: line 41, column 23
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    override property get CurrentLocation () : pcf.NewNotePopup {
      return super.CurrentLocation as pcf.NewNotePopup
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
    
    property get relatedTo () : KeyableBean {
      return getVariableValue("relatedTo", 0) as KeyableBean
    }
    
    property set relatedTo ($arg :  KeyableBean) {
      setVariableValue("relatedTo", 0, $arg)
    }
    
    property get relatedToEditable () : boolean {
      return getVariableValue("relatedToEditable", 0) as java.lang.Boolean
    }
    
    property set relatedToEditable ($arg :  boolean) {
      setVariableValue("relatedToEditable", 0, $arg)
    }
    
    property get topic () : NoteTopicType {
      return getVariableValue("topic", 0) as NoteTopicType
    }
    
    property set topic ($arg :  NoteTopicType) {
      setVariableValue("topic", 0, $arg)
    }
    
    property get topicEditable () : boolean {
      return getVariableValue("topicEditable", 0) as java.lang.Boolean
    }
    
    property set topicEditable ($arg :  boolean) {
      setVariableValue("topicEditable", 0, $arg)
    }
    
    
  }
  
  
}