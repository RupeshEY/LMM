package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyCovTermsCVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyCovTermsCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyCovTermsCV.pcf: line 17, column 25
    function def_onEnter_4 (def :  pcf.ClaimPolicyCovTermsLV) : void {
      def.onEnter(Coverage)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyCovTermsCV.pcf: line 17, column 25
    function def_refreshVariables_5 (def :  pcf.ClaimPolicyCovTermsLV) : void {
      def.refreshVariables(Coverage)
    }
    
    // 'value' attribute on MenuItemIterator at ClaimPolicyCovTermsCV.pcf: line 29, column 65
    function value_3 () : java.util.List<typekey.CovTerm> {
      return typekey.CovTerm.getTypeKeys(false).where(\ c -> c != typekey.CovTerm.TC_COVTERM)
    }
    
    // 'visible' attribute on Card (id=CovTerms) at ClaimPolicyCovTermsCV.pcf: line 14, column 34
    function visible_6 () : java.lang.Boolean {
      return Coverage != null
    }
    
    property get Coverage () : Coverage {
      return getRequireValue("Coverage", 0) as Coverage
    }
    
    property set Coverage ($arg :  Coverage) {
      setRequireValue("Coverage", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/ClaimPolicyCovTermsCV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimPolicyCovTermsCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=CovTermMenuItem) at ClaimPolicyCovTermsCV.pcf: line 33, column 38
    function action_0 () : void {
      CovTermPopup.push(Coverage, CovTermType, true)
    }
    
    // 'action' attribute on MenuItem (id=CovTermMenuItem) at ClaimPolicyCovTermsCV.pcf: line 33, column 38
    function action_dest_1 () : pcf.api.Destination {
      return pcf.CovTermPopup.createDestination(Coverage, CovTermType, true)
    }
    
    // 'label' attribute on MenuItem (id=CovTermMenuItem) at ClaimPolicyCovTermsCV.pcf: line 33, column 38
    function label_2 () : java.lang.Object {
      return CovTermType
    }
    
    property get CovTermType () : typekey.CovTerm {
      return getIteratedValue(1) as typekey.CovTerm
    }
    
    
  }
  
  
}