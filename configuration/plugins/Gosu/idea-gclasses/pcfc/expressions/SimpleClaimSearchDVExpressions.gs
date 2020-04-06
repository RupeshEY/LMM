package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SimpleClaimSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/SimpleClaimSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 48, column 56
    function def_onEnter_20 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 48, column 56
    function def_onEnter_22 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 51, column 56
    function def_onEnter_25 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 51, column 56
    function def_onEnter_27 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 61, column 46
    function def_onEnter_34 (def :  pcf.ClaimSearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 48, column 56
    function def_refreshVariables_21 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 48, column 56
    function def_refreshVariables_23 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 51, column 56
    function def_refreshVariables_26 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 51, column 56
    function def_refreshVariables_28 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(ClaimSearchCriteria.NameCriteria))
    }
    
    // 'def' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 61, column 46
    function def_refreshVariables_35 (def :  pcf.ClaimSearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on TextInput (id=UMRNumber) at SimpleClaimSearchDV.pcf: line 30, column 46
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.UMR_Ext = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=UCRNumber) at SimpleClaimSearchDV.pcf: line 36, column 46
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.UCR_Ext = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=SearchFor) at SimpleClaimSearchDV.pcf: line 45, column 56
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.NameSearchType = (__VALUE_TO_SET as typekey.ClaimSearchNameSearchType)
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at SimpleClaimSearchDV.pcf: line 18, column 50
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TaxID) at SimpleClaimSearchDV.pcf: line 57, column 57
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.NameCriteria.TaxId = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at SimpleClaimSearchDV.pcf: line 24, column 51
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.PolicyNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'mode' attribute on InputSetRef at SimpleClaimSearchDV.pcf: line 48, column 56
    function mode_24 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at SimpleClaimSearchDV.pcf: line 18, column 50
    function valueRoot_3 () : java.lang.Object {
      return ClaimSearchCriteria
    }
    
    // 'value' attribute on TextInput (id=TaxID) at SimpleClaimSearchDV.pcf: line 57, column 57
    function valueRoot_33 () : java.lang.Object {
      return ClaimSearchCriteria.NameCriteria
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at SimpleClaimSearchDV.pcf: line 18, column 50
    function value_0 () : java.lang.String {
      return ClaimSearchCriteria.ClaimNumber
    }
    
    // 'value' attribute on TextInput (id=UCRNumber) at SimpleClaimSearchDV.pcf: line 36, column 46
    function value_12 () : java.lang.String {
      return ClaimSearchCriteria.UCR_Ext
    }
    
    // 'value' attribute on TypeKeyInput (id=SearchFor) at SimpleClaimSearchDV.pcf: line 45, column 56
    function value_16 () : typekey.ClaimSearchNameSearchType {
      return ClaimSearchCriteria.NameSearchType
    }
    
    // 'value' attribute on TextInput (id=TaxID) at SimpleClaimSearchDV.pcf: line 57, column 57
    function value_30 () : java.lang.String {
      return ClaimSearchCriteria.NameCriteria.TaxId
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at SimpleClaimSearchDV.pcf: line 24, column 51
    function value_4 () : java.lang.String {
      return ClaimSearchCriteria.PolicyNumber
    }
    
    // 'value' attribute on TextInput (id=UMRNumber) at SimpleClaimSearchDV.pcf: line 30, column 46
    function value_8 () : java.lang.String {
      return ClaimSearchCriteria.UMR_Ext
    }
    
    property get ClaimSearchCriteria () : ClaimSearchCriteria {
      return getRequireValue("ClaimSearchCriteria", 0) as ClaimSearchCriteria
    }
    
    property set ClaimSearchCriteria ($arg :  ClaimSearchCriteria) {
      setRequireValue("ClaimSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}