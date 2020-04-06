package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableOfficialsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableOfficialsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableOfficialsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOfficialsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableOfficialsLV.pcf: line 30, column 45
    function sortValue_0 (Official :  entity.Official) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at EditableOfficialsLV.pcf: line 36, column 34
    function sortValue_1 (Official :  entity.Official) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at EditableOfficialsLV.pcf: line 42, column 42
    function sortValue_2 (Official :  entity.Official) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'toAdd' attribute on RowIterator at EditableOfficialsLV.pcf: line 22, column 37
    function toAdd_15 (Official :  entity.Official) : void {
      Claim.addToOfficials(Official)
    }
    
    // 'toRemove' attribute on RowIterator at EditableOfficialsLV.pcf: line 22, column 37
    function toRemove_16 (Official :  entity.Official) : void {
      Claim.removeFromOfficials(Official)
    }
    
    // 'value' attribute on RowIterator at EditableOfficialsLV.pcf: line 22, column 37
    function value_17 () : entity.Official[] {
      return Claim.Officials
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableOfficialsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableOfficialsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at EditableOfficialsLV.pcf: line 42, column 42
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Official.ReportNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=OfficialType) at EditableOfficialsLV.pcf: line 30, column 45
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      Official.OfficialType = (__VALUE_TO_SET as typekey.OfficialType)
    }
    
    // 'value' attribute on TextCell (id=Name) at EditableOfficialsLV.pcf: line 36, column 34
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      Official.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=OfficialType) at EditableOfficialsLV.pcf: line 30, column 45
    function valueRoot_6 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at EditableOfficialsLV.pcf: line 42, column 42
    function value_11 () : java.lang.String {
      return Official.ReportNumber
    }
    
    // 'value' attribute on TypeKeyCell (id=OfficialType) at EditableOfficialsLV.pcf: line 30, column 45
    function value_3 () : typekey.OfficialType {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at EditableOfficialsLV.pcf: line 36, column 34
    function value_7 () : java.lang.String {
      return Official.Name
    }
    
    property get Official () : entity.Official {
      return getIteratedValue(1) as entity.Official
    }
    
    
  }
  
  
}