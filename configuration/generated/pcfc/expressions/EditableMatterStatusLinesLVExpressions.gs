package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/EditableMatterStatusLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableMatterStatusLinesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/EditableMatterStatusLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableMatterStatusLinesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableMatterStatusLinesLV.pcf: line 29, column 29
    function sortValue_0 (LitStatusTypeLine :  entity.LitStatusTypeLine) : java.lang.Object {
      return LitStatusTypeLine.LitigationStatus
    }
    
    // 'value' attribute on RowIterator at EditableMatterStatusLinesLV.pcf: line 34, column 48
    function sortValue_1 (LitStatusTypeLine :  entity.LitStatusTypeLine) : java.lang.Object {
      return LitStatusTypeLine.StartDate
    }
    
    // 'value' attribute on RowIterator at EditableMatterStatusLinesLV.pcf: line 40, column 53
    function sortValue_2 (LitStatusTypeLine :  entity.LitStatusTypeLine) : java.lang.Object {
      return LitStatusTypeLine.CompletionDate
    }
    
    // 'toAdd' attribute on RowIterator at EditableMatterStatusLinesLV.pcf: line 21, column 46
    function toAdd_15 (LitStatusTypeLine :  entity.LitStatusTypeLine) : void {
      Matter.addToStatusTypeLines(LitStatusTypeLine)
    }
    
    // 'toRemove' attribute on RowIterator at EditableMatterStatusLinesLV.pcf: line 21, column 46
    function toRemove_16 (LitStatusTypeLine :  entity.LitStatusTypeLine) : void {
      Matter.removeFromStatusTypeLines(LitStatusTypeLine)
    }
    
    // 'value' attribute on RowIterator at EditableMatterStatusLinesLV.pcf: line 21, column 46
    function value_17 () : entity.LitStatusTypeLine[] {
      return Matter.StatusTypeLines
    }
    
    property get Matter () : Matter {
      return getRequireValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setRequireValue("Matter", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/litigation/EditableMatterStatusLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableMatterStatusLinesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=CompletionDate) at EditableMatterStatusLinesLV.pcf: line 40, column 53
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      LitStatusTypeLine.CompletionDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at EditableMatterStatusLinesLV.pcf: line 29, column 29
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      LitStatusTypeLine.LitigationStatus = (__VALUE_TO_SET as typekey.MatterStatus)
    }
    
    // 'value' attribute on DateCell (id=StartDate) at EditableMatterStatusLinesLV.pcf: line 34, column 48
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      LitStatusTypeLine.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at EditableMatterStatusLinesLV.pcf: line 29, column 29
    function valueRoot_6 () : java.lang.Object {
      return LitStatusTypeLine
    }
    
    // 'value' attribute on DateCell (id=CompletionDate) at EditableMatterStatusLinesLV.pcf: line 40, column 53
    function value_11 () : java.util.Date {
      return LitStatusTypeLine.CompletionDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at EditableMatterStatusLinesLV.pcf: line 29, column 29
    function value_3 () : typekey.MatterStatus {
      return LitStatusTypeLine.LitigationStatus
    }
    
    // 'value' attribute on DateCell (id=StartDate) at EditableMatterStatusLinesLV.pcf: line 34, column 48
    function value_7 () : java.util.Date {
      return LitStatusTypeLine.StartDate
    }
    
    property get LitStatusTypeLine () : entity.LitStatusTypeLine {
      return getIteratedValue(1) as entity.LitStatusTypeLine
    }
    
    
  }
  
  
}