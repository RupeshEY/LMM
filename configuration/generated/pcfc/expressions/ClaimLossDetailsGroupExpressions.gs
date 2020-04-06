package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimLossDetailsGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossDetailsGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 16, column 43
    function action_2 () : void {
      pcf.ClaimLossDetails.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 20, column 21
    function action_4 () : void {
      pcf.ClaimAssociations.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 24, column 21
    function action_6 () : void {
      pcf.SIDetails.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 16, column 43
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 20, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimAssociations.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 24, column 21
    function action_dest_7 () : pcf.api.Destination {
      return pcf.SIDetails.createDestination(Claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 8, column 63
    static function canVisit_13 (Claim :  Claim) : java.lang.Boolean {
      return (perm.Claim.view(Claim) and (perm.System.viewclaimbasics or perm.ClaimAssociation.view))
    }
    
    // LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 8, column 63
    static function firstVisitableChildDestinationMethod_17 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimLossDetails.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimAssociations.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.SIDetails.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      for (var Exposure in (Claim.OrderedExposures)) {
        dest = pcf.LossDetailsExposureDetail.createDestination(Exposure)
        if (dest.canVisitSelf()) {
          return dest
        }
      }
      return null
    }
    
    // LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 8, column 63
    static function parent_14 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 8, column 63
    function tabBar_onEnter_15 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 8, column 63
    function tabBar_refreshVariables_16 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on LocationRefIterator at ClaimLossDetailsGroup.pcf: line 29, column 95
    function value_1 () : entity.Exposure[] {
      return Claim.OrderedExposures
    }
    
    // 'visible' attribute on LocationRefIterator at ClaimLossDetailsGroup.pcf: line 29, column 95
    function visible_0 () : java.lang.Boolean {
      return Claim.ExposureListVisibleInLossDetails and (Claim.LossType != LossType.TC_WC)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimLossDetailsGroup {
      return super.CurrentLocation as pcf.ClaimLossDetailsGroup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimLossDetailsGroupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 32, column 57
    function action_9 () : void {
      pcf.LossDetailsExposureDetail.go(Exposure)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 32, column 57
    function action_dest_10 () : pcf.api.Destination {
      return pcf.LossDetailsExposureDetail.createDestination(Exposure)
    }
    
    // 'label' attribute on LocationGroup (id=ClaimLossDetailsGroup) at ClaimLossDetailsGroup.pcf: line 32, column 57
    function label_11 () : java.lang.Object {
      return DisplayKey.get("JSP.ClaimPageLinks.DynamicPageLinks.Exposure", Exposure.ExposureType)
    }
    
    property get Exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimLossDetailsGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimLossDetailsGroupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get Exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  
}