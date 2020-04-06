package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/General/EditableStatuteLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableStatuteLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/EditableStatuteLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableStatuteLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at EditableStatuteLV.pcf: line 16, column 34
    function initialValue_0 () : SubrogationSummary {
      return claim.SubrogationSummary
    }
    
    // 'value' attribute on RowIterator at EditableStatuteLV.pcf: line 36, column 29
    function sortValue_1 (statuteLimitationsLine :  entity.StatuteLimitationsLine) : java.lang.Object {
      return statuteLimitationsLine.StatuteLimitType
    }
    
    // 'value' attribute on RowIterator at EditableStatuteLV.pcf: line 46, column 29
    function sortValue_2 (statuteLimitationsLine :  entity.StatuteLimitationsLine) : java.lang.Object {
      return statuteLimitationsLine.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at EditableStatuteLV.pcf: line 53, column 29
    function sortValue_3 (statuteLimitationsLine :  entity.StatuteLimitationsLine) : java.lang.Object {
      return statuteLimitationsLine.Description
    }
    
    // 'value' attribute on RowIterator at EditableStatuteLV.pcf: line 60, column 29
    function sortValue_4 (statuteLimitationsLine :  entity.StatuteLimitationsLine) : java.lang.Object {
      return statuteLimitationsLine.StatuteDate
    }
    
    // 'toAdd' attribute on RowIterator at EditableStatuteLV.pcf: line 26, column 51
    function toAdd_23 (statuteLimitationsLine :  entity.StatuteLimitationsLine) : void {
      subrogationSummary.addToStatuteLine(statuteLimitationsLine)
    }
    
    // 'toRemove' attribute on RowIterator at EditableStatuteLV.pcf: line 26, column 51
    function toRemove_24 (statuteLimitationsLine :  entity.StatuteLimitationsLine) : void {
      subrogationSummary.removeFromStatuteLine(statuteLimitationsLine)
    }
    
    // 'value' attribute on RowIterator at EditableStatuteLV.pcf: line 26, column 51
    function value_25 () : entity.StatuteLimitationsLine[] {
      return subrogationSummary.StatuteLine
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get subrogationSummary () : SubrogationSummary {
      return getVariableValue("subrogationSummary", 0) as SubrogationSummary
    }
    
    property set subrogationSummary ($arg :  SubrogationSummary) {
      setVariableValue("subrogationSummary", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/EditableStatuteLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableStatuteLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=JurisdictionState) at EditableStatuteLV.pcf: line 46, column 29
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      statuteLimitationsLine.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableStatuteLV.pcf: line 53, column 29
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      statuteLimitationsLine.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateCell (id=StatuteDate) at EditableStatuteLV.pcf: line 60, column 29
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      statuteLimitationsLine.StatuteDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyCell (id=StatuteLimitType) at EditableStatuteLV.pcf: line 36, column 29
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      statuteLimitationsLine.StatuteLimitType = (__VALUE_TO_SET as typekey.StatuteLimitationsType)
    }
    
    // 'filter' attribute on TypeKeyCell (id=JurisdictionState) at EditableStatuteLV.pcf: line 46, column 29
    function filter_14 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'filter' attribute on TypeKeyCell (id=StatuteLimitType) at EditableStatuteLV.pcf: line 36, column 29
    function filter_9 (VALUE :  typekey.StatuteLimitationsType, VALUES :  typekey.StatuteLimitationsType[]) : java.lang.Boolean {
      return VALUE.hasCategory(claim.SubroIsGovernmentInvolved())
    }
    
    // 'value' attribute on TypeKeyCell (id=StatuteLimitType) at EditableStatuteLV.pcf: line 36, column 29
    function valueRoot_8 () : java.lang.Object {
      return statuteLimitationsLine
    }
    
    // 'value' attribute on TypeKeyCell (id=JurisdictionState) at EditableStatuteLV.pcf: line 46, column 29
    function value_10 () : typekey.Jurisdiction {
      return statuteLimitationsLine.JurisdictionState
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableStatuteLV.pcf: line 53, column 29
    function value_15 () : java.lang.String {
      return statuteLimitationsLine.Description
    }
    
    // 'value' attribute on DateCell (id=StatuteDate) at EditableStatuteLV.pcf: line 60, column 29
    function value_19 () : java.util.Date {
      return statuteLimitationsLine.StatuteDate
    }
    
    // 'value' attribute on TypeKeyCell (id=StatuteLimitType) at EditableStatuteLV.pcf: line 36, column 29
    function value_5 () : typekey.StatuteLimitationsType {
      return statuteLimitationsLine.StatuteLimitType
    }
    
    property get statuteLimitationsLine () : entity.StatuteLimitationsLine {
      return getIteratedValue(1) as entity.StatuteLimitationsLine
    }
    
    
  }
  
  
}