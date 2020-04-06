package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentLine/EditableAssessmentLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableAssessmentLinesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentLine/EditableAssessmentLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableAssessmentLinesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableAssessmentLinesLV.pcf: line 29, column 46
    function sortValue_0 (AssessmentLine :  entity.AssessmentLine) : java.lang.Object {
      return AssessmentLine.StatusDate
    }
    
    // 'value' attribute on RowIterator at EditableAssessmentLinesLV.pcf: line 35, column 48
    function sortValue_1 (AssessmentLine :  entity.AssessmentLine) : java.lang.Object {
      return AssessmentLine.Event
    }
    
    // 'value' attribute on RowIterator at EditableAssessmentLinesLV.pcf: line 41, column 24
    function sortValue_2 (AssessmentLine :  entity.AssessmentLine) : java.lang.Object {
      return AssessmentLine.Note
    }
    
    // 'toAdd' attribute on RowIterator at EditableAssessmentLinesLV.pcf: line 20, column 43
    function toAdd_15 (AssessmentLine :  entity.AssessmentLine) : void {
      AssessmentSource.addToStatusLine(AssessmentLine)
    }
    
    // 'toRemove' attribute on RowIterator at EditableAssessmentLinesLV.pcf: line 20, column 43
    function toRemove_16 (AssessmentLine :  entity.AssessmentLine) : void {
      AssessmentSource.removeFromStatusLine(AssessmentLine)
    }
    
    // 'value' attribute on RowIterator at EditableAssessmentLinesLV.pcf: line 20, column 43
    function value_17 () : entity.AssessmentLine[] {
      return AssessmentSource.StatusLine
    }
    
    property get AssessmentSource () : AssessmentSource {
      return getRequireValue("AssessmentSource", 0) as AssessmentSource
    }
    
    property set AssessmentSource ($arg :  AssessmentSource) {
      setRequireValue("AssessmentSource", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentLine/EditableAssessmentLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableAssessmentLinesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditableAssessmentLinesLV.pcf: line 41, column 24
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentLine.Note = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateCell (id=AssessmentStatusDate) at EditableAssessmentLinesLV.pcf: line 29, column 46
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentLine.StatusDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at EditableAssessmentLinesLV.pcf: line 35, column 48
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentLine.Event = (__VALUE_TO_SET as typekey.AssessmentEvent)
    }
    
    // 'value' attribute on DateCell (id=AssessmentStatusDate) at EditableAssessmentLinesLV.pcf: line 29, column 46
    function valueRoot_6 () : java.lang.Object {
      return AssessmentLine
    }
    
    // 'value' attribute on TextCell (id=Notes) at EditableAssessmentLinesLV.pcf: line 41, column 24
    function value_11 () : java.lang.String {
      return AssessmentLine.Note
    }
    
    // 'value' attribute on DateCell (id=AssessmentStatusDate) at EditableAssessmentLinesLV.pcf: line 29, column 46
    function value_3 () : java.util.Date {
      return AssessmentLine.StatusDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at EditableAssessmentLinesLV.pcf: line 35, column 48
    function value_7 () : typekey.AssessmentEvent {
      return AssessmentLine.Event
    }
    
    property get AssessmentLine () : entity.AssessmentLine {
      return getIteratedValue(1) as entity.AssessmentLine
    }
    
    
  }
  
  
}