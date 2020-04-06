package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddAgreementMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddAgreementMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MenuItemIterator (id=TreatySubMenuIterator) at AddAgreementMenuItemSet.pcf: line 19, column 28
    function value_3 () : Type[] {
      return gw.reins.RIAgreementUIHelper.TreatySubtypes
    }
    
    // 'value' attribute on MenuItemIterator (id=FacSubMenuIterator) at AddAgreementMenuItemSet.pcf: line 35, column 28
    function value_7 () : Type[] {
      return gw.reins.RIAgreementUIHelper.FacultativeSubtypes
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends AddAgreementMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=facSubMenuItem) at AddAgreementMenuItemSet.pcf: line 39, column 52
    function action_4 () : void {
      NewRIAgreement.go(claim, facSubMenuItemIType)
    }
    
    // 'action' attribute on MenuItem (id=facSubMenuItem) at AddAgreementMenuItemSet.pcf: line 39, column 52
    function action_dest_5 () : pcf.api.Destination {
      return pcf.NewRIAgreement.createDestination(claim, facSubMenuItemIType)
    }
    
    // 'label' attribute on MenuItem (id=facSubMenuItem) at AddAgreementMenuItemSet.pcf: line 39, column 52
    function label_6 () : java.lang.Object {
      return facSubMenuItemIType.DisplayName
    }
    
    property get facSubMenuItemIType () : Type {
      return getIteratedValue(1) as Type
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/AddAgreementMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddAgreementMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=treatySubMenuItem) at AddAgreementMenuItemSet.pcf: line 23, column 55
    function action_0 () : void {
      NewRIAgreement.go(claim, treatySubMenuItemIType)
    }
    
    // 'action' attribute on MenuItem (id=treatySubMenuItem) at AddAgreementMenuItemSet.pcf: line 23, column 55
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NewRIAgreement.createDestination(claim, treatySubMenuItemIType)
    }
    
    // 'label' attribute on MenuItem (id=treatySubMenuItem) at AddAgreementMenuItemSet.pcf: line 23, column 55
    function label_2 () : java.lang.Object {
      return treatySubMenuItemIType.DisplayName
    }
    
    property get treatySubMenuItemIType () : Type {
      return getIteratedValue(1) as Type
    }
    
    
  }
  
  
}