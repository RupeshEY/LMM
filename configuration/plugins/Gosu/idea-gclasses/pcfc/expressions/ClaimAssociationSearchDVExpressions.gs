package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimAssociationSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/ClaimAssociationSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAssociationSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 37, column 56
    function def_onEnter_12 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter( new gw.api.name.SearchNameOwner(ClaimAssociationSearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 37, column 56
    function def_onEnter_14 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter( new gw.api.name.SearchNameOwner(ClaimAssociationSearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 40, column 56
    function def_onEnter_17 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter( new gw.api.name.SearchNameOwner(ClaimAssociationSearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 40, column 56
    function def_onEnter_19 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter( new gw.api.name.SearchNameOwner(ClaimAssociationSearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 44, column 41
    function def_onEnter_22 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 37, column 56
    function def_refreshVariables_13 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables( new gw.api.name.SearchNameOwner(ClaimAssociationSearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 37, column 56
    function def_refreshVariables_15 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables( new gw.api.name.SearchNameOwner(ClaimAssociationSearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 40, column 56
    function def_refreshVariables_18 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables( new gw.api.name.SearchNameOwner(ClaimAssociationSearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 40, column 56
    function def_refreshVariables_20 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables( new gw.api.name.SearchNameOwner(ClaimAssociationSearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 44, column 41
    function def_refreshVariables_23 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at ClaimAssociationSearchDV.pcf: line 30, column 58
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimAssociationSearchCriteria.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=ClaimAssociation_Title) at ClaimAssociationSearchDV.pcf: line 18, column 55
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimAssociationSearchCriteria.Title = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Claim_ClaimNumber) at ClaimAssociationSearchDV.pcf: line 25, column 61
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimAssociationSearchCriteria.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'mode' attribute on InputSetRef at ClaimAssociationSearchDV.pcf: line 37, column 56
    function mode_16 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'value' attribute on TextInput (id=ClaimAssociation_Title) at ClaimAssociationSearchDV.pcf: line 18, column 55
    function valueRoot_3 () : java.lang.Object {
      return ClaimAssociationSearchCriteria
    }
    
    // 'value' attribute on TextInput (id=ClaimAssociation_Title) at ClaimAssociationSearchDV.pcf: line 18, column 55
    function value_0 () : java.lang.String {
      return ClaimAssociationSearchCriteria.Title
    }
    
    // 'value' attribute on TextInput (id=Claim_ClaimNumber) at ClaimAssociationSearchDV.pcf: line 25, column 61
    function value_4 () : java.lang.String {
      return ClaimAssociationSearchCriteria.ClaimNumber
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at ClaimAssociationSearchDV.pcf: line 30, column 58
    function value_8 () : java.util.Date {
      return ClaimAssociationSearchCriteria.LossDate
    }
    
    property get ClaimAssociationSearchCriteria () : ClaimAssociationSearchCriteria {
      return getRequireValue("ClaimAssociationSearchCriteria", 0) as ClaimAssociationSearchCriteria
    }
    
    property set ClaimAssociationSearchCriteria ($arg :  ClaimAssociationSearchCriteria) {
      setRequireValue("ClaimAssociationSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}