package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/AdjustRIRecoverablesHeaderRowSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdjustRIRecoverablesHeaderRowSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/AdjustRIRecoverablesHeaderRowSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdjustRIRecoverablesHeaderRowSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=HeaderLabel) at AdjustRIRecoverablesHeaderRowSet.pcf: line 19, column 22
    function value_0 () : java.lang.String {
      return HeaderLabel
    }
    
    // 'visible' attribute on TextCell (id=CalculatedChangeLabel) at AdjustRIRecoverablesHeaderRowSet.pcf: line 32, column 22
    function visible_2 () : java.lang.Boolean {
      return Agreement typeis entity.NonProportionalRIAgreement
    }
    
    // 'visible' attribute on TextCell (id=NewCalculatedAmountLabel) at AdjustRIRecoverablesHeaderRowSet.pcf: line 39, column 22
    function visible_3 () : java.lang.Boolean {
      return Agreement.canSetUnadjustedCededReserves() or Agreement.canSetUnadjustedRecoverables()
    }
    
    property get Agreement () : RIAgreement {
      return getRequireValue("Agreement", 0) as RIAgreement
    }
    
    property set Agreement ($arg :  RIAgreement) {
      setRequireValue("Agreement", 0, $arg)
    }
    
    property get HeaderLabel () : String {
      return getRequireValue("HeaderLabel", 0) as String
    }
    
    property set HeaderLabel ($arg :  String) {
      setRequireValue("HeaderLabel", 0, $arg)
    }
    
    
  }
  
  
}