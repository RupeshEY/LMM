package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/DocumentNoteDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentNoteDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/DocumentNoteDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentNoteDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Confidential) at DocumentNoteDV.pcf: line 34, column 36
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.Confidential = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=Body) at DocumentNoteDV.pcf: line 42, column 28
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.Body = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at DocumentNoteDV.pcf: line 19, column 44
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.Topic = (__VALUE_TO_SET as typekey.NoteTopicType)
    }
    
    // 'value' attribute on TextInput (id=Subject) at DocumentNoteDV.pcf: line 24, column 31
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.Subject = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Topic) at DocumentNoteDV.pcf: line 19, column 44
    function editable_0 () : java.lang.Boolean {
      return Note.New
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at DocumentNoteDV.pcf: line 19, column 44
    function valueRoot_5 () : java.lang.Object {
      return Note
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at DocumentNoteDV.pcf: line 19, column 44
    function value_1 () : typekey.NoteTopicType {
      return Note.Topic
    }
    
    // 'value' attribute on BooleanRadioInput (id=Confidential) at DocumentNoteDV.pcf: line 34, column 36
    function value_10 () : java.lang.Boolean {
      return Note.Confidential
    }
    
    // 'value' attribute on TextAreaInput (id=Body) at DocumentNoteDV.pcf: line 42, column 28
    function value_15 () : java.lang.String {
      return Note.Body
    }
    
    // 'value' attribute on TextInput (id=Subject) at DocumentNoteDV.pcf: line 24, column 31
    function value_6 () : java.lang.String {
      return Note.Subject
    }
    
    property get Note () : Note {
      return getRequireValue("Note", 0) as Note
    }
    
    property set Note ($arg :  Note) {
      setRequireValue("Note", 0, $arg)
    }
    
    
  }
  
  
}