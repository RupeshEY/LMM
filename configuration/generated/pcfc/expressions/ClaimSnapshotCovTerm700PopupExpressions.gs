package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/shared/ClaimSnapshotCovTerm700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotCovTerm700PopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/shared/ClaimSnapshotCovTerm700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotCovTerm700PopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (CovTerm :  dynamic.Dynamic) : int {
      return 0
    }
    
    // 'value' attribute on TextInput (id=CovTermPattern) at ClaimSnapshotCovTerm700Popup.pcf: line 21, column 42
    function valueRoot_2 () : java.lang.Object {
      return CovTerm
    }
    
    // 'value' attribute on TextInput (id=CovTermPattern) at ClaimSnapshotCovTerm700Popup.pcf: line 21, column 42
    function value_0 () : dynamic.Dynamic {
      return CovTerm.CovTermPattern
    }
    
    // 'value' attribute on TextInput (id=Code) at ClaimSnapshotCovTerm700Popup.pcf: line 45, column 44
    function value_12 () : dynamic.Dynamic {
      return CovTerm.Code
    }
    
    // 'value' attribute on TextInput (id=Description) at ClaimSnapshotCovTerm700Popup.pcf: line 50, column 44
    function value_15 () : dynamic.Dynamic {
      return CovTerm.Description
    }
    
    // 'value' attribute on TextInput (id=FinancialAmount) at ClaimSnapshotCovTerm700Popup.pcf: line 58, column 44
    function value_19 () : dynamic.Dynamic {
      return CovTerm.FinancialAmount
    }
    
    // 'value' attribute on TextInput (id=NumericValue) at ClaimSnapshotCovTerm700Popup.pcf: line 66, column 44
    function value_23 () : dynamic.Dynamic {
      return CovTerm.NumericValue
    }
    
    // 'value' attribute on TextInput (id=Units) at ClaimSnapshotCovTerm700Popup.pcf: line 71, column 44
    function value_26 () : dynamic.Dynamic {
      return CovTerm.Units
    }
    
    // 'value' attribute on TextInput (id=ModelRestriction) at ClaimSnapshotCovTerm700Popup.pcf: line 26, column 42
    function value_3 () : dynamic.Dynamic {
      return CovTerm.ModelRestriction
    }
    
    // 'value' attribute on TextInput (id=ModelAggregation) at ClaimSnapshotCovTerm700Popup.pcf: line 31, column 42
    function value_6 () : dynamic.Dynamic {
      return CovTerm.ModelAggregation
    }
    
    // 'value' attribute on TextInput (id=Type) at ClaimSnapshotCovTerm700Popup.pcf: line 38, column 42
    function value_9 () : dynamic.Dynamic {
      return CovTerm.Subtype
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotCovTerm700Popup.pcf: line 40, column 143
    function visible_18 () : java.lang.Boolean {
      return CovTerm.getFieldValue("Subtype").toString().containsIgnoreCase(entity.ClassificationCovTerm.Type.DisplayName)
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotCovTerm700Popup.pcf: line 53, column 138
    function visible_22 () : java.lang.Boolean {
      return CovTerm.getFieldValue("Subtype").toString().containsIgnoreCase(entity.FinancialCovTerm.Type.DisplayName)
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotCovTerm700Popup.pcf: line 61, column 136
    function visible_29 () : java.lang.Boolean {
      return CovTerm.getFieldValue("Subtype").toString().containsIgnoreCase(entity.NumericCovTerm.Type.DisplayName)
    }
    
    property get CovTerm () : dynamic.Dynamic {
      return getVariableValue("CovTerm", 0) as dynamic.Dynamic
    }
    
    property set CovTerm ($arg :  dynamic.Dynamic) {
      setVariableValue("CovTerm", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotCovTerm700Popup {
      return super.CurrentLocation as pcf.ClaimSnapshotCovTerm700Popup
    }
    
    
  }
  
  
}