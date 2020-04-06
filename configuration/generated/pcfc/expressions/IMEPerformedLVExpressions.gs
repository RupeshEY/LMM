package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IMEPerformedLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IMEPerformedLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at IMEPerformedLV.pcf: line 28, column 40
    function sortValue_0 (IMEPerformed :  entity.IMEPerformed) : java.lang.Object {
      return IMEPerformed.IMEType
    }
    
    // 'value' attribute on RowIterator at IMEPerformedLV.pcf: line 34, column 41
    function sortValue_1 (IMEPerformed :  entity.IMEPerformed) : java.lang.Object {
      return IMEPerformed.IMEDate
    }
    
    // 'toAdd' attribute on RowIterator at IMEPerformedLV.pcf: line 20, column 41
    function toAdd_10 (IMEPerformed :  entity.IMEPerformed) : void {
      Exposure.addToIMEPerformed(IMEPerformed)
    }
    
    // 'toRemove' attribute on RowIterator at IMEPerformedLV.pcf: line 20, column 41
    function toRemove_11 (IMEPerformed :  entity.IMEPerformed) : void {
      Exposure.removeFromIMEPerformed(IMEPerformed)
    }
    
    // 'value' attribute on RowIterator at IMEPerformedLV.pcf: line 20, column 41
    function value_12 () : entity.IMEPerformed[] {
      return Exposure.IMEPerformed
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/IMEPerformedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends IMEPerformedLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=IMEPerformed_IMEType) at IMEPerformedLV.pcf: line 28, column 40
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      IMEPerformed.IMEType = (__VALUE_TO_SET as typekey.IMEType)
    }
    
    // 'value' attribute on DateCell (id=IMEPerformed_IMEDate) at IMEPerformedLV.pcf: line 34, column 41
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      IMEPerformed.IMEDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyCell (id=IMEPerformed_IMEType) at IMEPerformedLV.pcf: line 28, column 40
    function valueRoot_5 () : java.lang.Object {
      return IMEPerformed
    }
    
    // 'value' attribute on TypeKeyCell (id=IMEPerformed_IMEType) at IMEPerformedLV.pcf: line 28, column 40
    function value_2 () : typekey.IMEType {
      return IMEPerformed.IMEType
    }
    
    // 'value' attribute on DateCell (id=IMEPerformed_IMEDate) at IMEPerformedLV.pcf: line 34, column 41
    function value_6 () : java.util.Date {
      return IMEPerformed.IMEDate
    }
    
    property get IMEPerformed () : entity.IMEPerformed {
      return getIteratedValue(1) as entity.IMEPerformed
    }
    
    
  }
  
  
}