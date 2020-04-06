package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheClaimsHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheClaimsHistoryLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheClaimsHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheClaimsHistoryLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at CatastropheClaimsHistoryLV.pcf: line 26, column 43
    function sortValue_0 (history :  entity.CatastropheClaimsHistory) : java.lang.Object {
      return history.EventTimestamp
    }
    
    // 'value' attribute on RowIterator at CatastropheClaimsHistoryLV.pcf: line 30, column 40
    function sortValue_1 (history :  entity.CatastropheClaimsHistory) : java.lang.Object {
      return history.Description
    }
    
    // 'value' attribute on RowIterator at CatastropheClaimsHistoryLV.pcf: line 17, column 53
    function value_8 () : entity.CatastropheClaimsHistory[] {
      return catastrophe.ClaimsHistory
    }
    
    property get catastrophe () : Catastrophe {
      return getRequireValue("catastrophe", 0) as Catastrophe
    }
    
    property set catastrophe ($arg :  Catastrophe) {
      setRequireValue("catastrophe", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheClaimsHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CatastropheClaimsHistoryLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=Eventtimestamp) at CatastropheClaimsHistoryLV.pcf: line 26, column 43
    function valueRoot_4 () : java.lang.Object {
      return history
    }
    
    // 'value' attribute on DateCell (id=Eventtimestamp) at CatastropheClaimsHistoryLV.pcf: line 26, column 43
    function value_2 () : java.util.Date {
      return history.EventTimestamp
    }
    
    // 'value' attribute on TextCell (id=Description) at CatastropheClaimsHistoryLV.pcf: line 30, column 40
    function value_5 () : java.lang.String {
      return history.Description
    }
    
    property get history () : entity.CatastropheClaimsHistory {
      return getIteratedValue(1) as entity.CatastropheClaimsHistory
    }
    
    
  }
  
  
}