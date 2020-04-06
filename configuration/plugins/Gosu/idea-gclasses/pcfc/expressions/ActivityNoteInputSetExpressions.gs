package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityNoteInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityNoteInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityNoteInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityNoteInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Subject) at ActivityNoteInputSet.pcf: line 32, column 41
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.NewNote.Subject = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at ActivityNoteInputSet.pcf: line 43, column 48
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.NewNote.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at ActivityNoteInputSet.pcf: line 20, column 42
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.NewNote.Topic = (__VALUE_TO_SET as typekey.NoteTopicType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Confidential) at ActivityNoteInputSet.pcf: line 49, column 46
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.NewNote.Confidential = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=Text) at ActivityNoteInputSet.pcf: line 57, column 38
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.NewNote.Body = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at ActivityNoteInputSet.pcf: line 26, column 45
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.NewNote.SecurityType = (__VALUE_TO_SET as typekey.NoteSecurityType)
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=RelatedTo) at ActivityNoteInputSet.pcf: line 43, column 48
    function optionGroupLabel_16 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedTo) at ActivityNoteInputSet.pcf: line 43, column 48
    function optionLabel_17 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ActivityNoteInputSet.pcf: line 43, column 48
    function valueRange_18 () : java.lang.Object {
      return Activity.NewNote.Claim.RelatedToCandidates
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at ActivityNoteInputSet.pcf: line 20, column 42
    function valueRoot_3 () : java.lang.Object {
      return Activity.NewNote
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at ActivityNoteInputSet.pcf: line 20, column 42
    function value_0 () : typekey.NoteTopicType {
      return Activity.NewNote.Topic
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at ActivityNoteInputSet.pcf: line 43, column 48
    function value_12 () : gw.pl.persistence.core.Bean {
      return Activity.NewNote.RelatedTo
    }
    
    // 'value' attribute on BooleanRadioInput (id=Confidential) at ActivityNoteInputSet.pcf: line 49, column 46
    function value_21 () : java.lang.Boolean {
      return Activity.NewNote.Confidential
    }
    
    // 'value' attribute on TextAreaInput (id=Text) at ActivityNoteInputSet.pcf: line 57, column 38
    function value_25 () : java.lang.String {
      return Activity.NewNote.Body
    }
    
    // 'value' attribute on TypeKeyInput (id=SecurityType) at ActivityNoteInputSet.pcf: line 26, column 45
    function value_4 () : typekey.NoteSecurityType {
      return Activity.NewNote.SecurityType
    }
    
    // 'value' attribute on TextInput (id=Subject) at ActivityNoteInputSet.pcf: line 32, column 41
    function value_8 () : java.lang.String {
      return Activity.NewNote.Subject
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ActivityNoteInputSet.pcf: line 43, column 48
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ActivityNoteInputSet.pcf: line 43, column 48
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ActivityNoteInputSet.pcf: line 43, column 48
    function verifyValueRange_20 () : void {
      var __valueRangeArg = Activity.NewNote.Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'visible' attribute on InputSet (id=ActivityNoteInputSet) at ActivityNoteInputSet.pcf: line 8, column 32
    function visible_29 () : java.lang.Boolean {
      return perm.Note.create
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    
  }
  
  
}