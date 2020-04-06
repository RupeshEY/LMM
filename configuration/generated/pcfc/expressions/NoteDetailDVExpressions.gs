package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/notes/NoteDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NoteDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/notes/NoteDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoteDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Subject) at NoteDetailDV.pcf: line 34, column 31
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.Subject = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at NoteDetailDV.pcf: line 45, column 50
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Confidential) at NoteDetailDV.pcf: line 51, column 36
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.Confidential = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=Body) at NoteDetailDV.pcf: line 61, column 38
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.Body = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at NoteDetailDV.pcf: line 23, column 44
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.Topic = (__VALUE_TO_SET as typekey.NoteTopicType)
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at NoteDetailDV.pcf: line 29, column 47
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Note.SecurityType = (__VALUE_TO_SET as typekey.NoteSecurityType)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Topic) at NoteDetailDV.pcf: line 23, column 44
    function editable_0 () : java.lang.Boolean {
      return topicEditable
    }
    
    // 'editable' attribute on RangeInput (id=RelatedTo) at NoteDetailDV.pcf: line 45, column 50
    function editable_14 () : java.lang.Boolean {
      return relatedToEditable
    }
    
    // 'editable' attribute on TextAreaInput (id=Body) at NoteDetailDV.pcf: line 61, column 38
    function editable_29 () : java.lang.Boolean {
      return Note.isBodyEditable()
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=RelatedTo) at NoteDetailDV.pcf: line 45, column 50
    function optionGroupLabel_20 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedTo) at NoteDetailDV.pcf: line 45, column 50
    function optionLabel_21 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NoteDetailDV.pcf: line 45, column 50
    function valueRange_22 () : java.lang.Object {
      return Note.Claim.RelatedToCandidates
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at NoteDetailDV.pcf: line 23, column 44
    function valueRoot_5 () : java.lang.Object {
      return Note
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at NoteDetailDV.pcf: line 23, column 44
    function value_1 () : typekey.NoteTopicType {
      return Note.Topic
    }
    
    // 'value' attribute on TextInput (id=Subject) at NoteDetailDV.pcf: line 34, column 31
    function value_10 () : java.lang.String {
      return Note.Subject
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at NoteDetailDV.pcf: line 45, column 50
    function value_15 () : gw.pl.persistence.core.Bean {
      return Note.RelatedTo
    }
    
    // 'value' attribute on BooleanRadioInput (id=Confidential) at NoteDetailDV.pcf: line 51, column 36
    function value_25 () : java.lang.Boolean {
      return Note.Confidential
    }
    
    // 'value' attribute on TextAreaInput (id=Body) at NoteDetailDV.pcf: line 61, column 38
    function value_31 () : java.lang.String {
      return Note.Body
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at NoteDetailDV.pcf: line 29, column 47
    function value_6 () : typekey.NoteSecurityType {
      return Note.SecurityType
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NoteDetailDV.pcf: line 45, column 50
    function verifyValueRangeIsAllowedType_23 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NoteDetailDV.pcf: line 45, column 50
    function verifyValueRangeIsAllowedType_23 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NoteDetailDV.pcf: line 45, column 50
    function verifyValueRange_24 () : void {
      var __valueRangeArg = Note.Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_23(__valueRangeArg)
    }
    
    // 'visible' attribute on TextAreaInput (id=Body) at NoteDetailDV.pcf: line 61, column 38
    function visible_30 () : java.lang.Boolean {
      return Note.BodyEditable
    }
    
    // 'visible' attribute on NoteBodyInput (id=NoteBody) at NoteDetailDV.pcf: line 66, column 42
    function visible_37 () : java.lang.Boolean {
      return not Note.BodyEditable
    }
    
    property get Note () : Note {
      return getRequireValue("Note", 0) as Note
    }
    
    property set Note ($arg :  Note) {
      setRequireValue("Note", 0, $arg)
    }
    
    property get relatedToEditable () : boolean {
      return getRequireValue("relatedToEditable", 0) as java.lang.Boolean
    }
    
    property set relatedToEditable ($arg :  boolean) {
      setRequireValue("relatedToEditable", 0, $arg)
    }
    
    property get topicEditable () : boolean {
      return getRequireValue("topicEditable", 0) as java.lang.Boolean
    }
    
    property set topicEditable ($arg :  boolean) {
      setRequireValue("topicEditable", 0, $arg)
    }
    
    
  }
  
  
}