package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.database.Query
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCBenefitParameterSetPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSetPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitParameterSetPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (specificWCBenefitParameterSet :  WCBenefitParameterSet, willStartInEditMode :  boolean) : int {
      return 1
    }
    
    // 'beforeCommit' attribute on Popup (id=WCBenefitParameterSetPopup) at WCBenefitParameterSetPopup.pcf: line 12, column 79
    function beforeCommit_5 (pickedValue :  WCBenefitParameterSet) : void {
      validate(aWCBenefitParameterSet)
    }
    
    // 'def' attribute on PanelRef at WCBenefitParameterSetPopup.pcf: line 30, column 63
    function def_onEnter_3 (def :  pcf.WCBenefitParameterSetDV) : void {
      def.onEnter(aWCBenefitParameterSet)
    }
    
    // 'def' attribute on PanelRef at WCBenefitParameterSetPopup.pcf: line 30, column 63
    function def_refreshVariables_4 (def :  pcf.WCBenefitParameterSetDV) : void {
      def.refreshVariables(aWCBenefitParameterSet)
    }
    
    // 'initialValue' attribute on Variable at WCBenefitParameterSetPopup.pcf: line 27, column 37
    function initialValue_0 () : WCBenefitParameterSet {
      return specificWCBenefitParameterSet == null ? new WCBenefitParameterSet() : specificWCBenefitParameterSet
    }
    
    // EditButtons at WCBenefitParameterSetPopup.pcf: line 33, column 49
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at WCBenefitParameterSetPopup.pcf: line 33, column 49
    function pickValue_1 () : WCBenefitParameterSet {
      return aWCBenefitParameterSet
    }
    
    // 'startInEditMode' attribute on Popup (id=WCBenefitParameterSetPopup) at WCBenefitParameterSetPopup.pcf: line 12, column 79
    function startInEditMode_6 () : java.lang.Boolean {
      return willStartInEditMode
    }
    
    override property get CurrentLocation () : pcf.WCBenefitParameterSetPopup {
      return super.CurrentLocation as pcf.WCBenefitParameterSetPopup
    }
    
    property get aWCBenefitParameterSet () : WCBenefitParameterSet {
      return getVariableValue("aWCBenefitParameterSet", 0) as WCBenefitParameterSet
    }
    
    property set aWCBenefitParameterSet ($arg :  WCBenefitParameterSet) {
      setVariableValue("aWCBenefitParameterSet", 0, $arg)
    }
    
    property get specificWCBenefitParameterSet () : WCBenefitParameterSet {
      return getVariableValue("specificWCBenefitParameterSet", 0) as WCBenefitParameterSet
    }
    
    property set specificWCBenefitParameterSet ($arg :  WCBenefitParameterSet) {
      setVariableValue("specificWCBenefitParameterSet", 0, $arg)
    }
    
    property get willStartInEditMode () : boolean {
      return getVariableValue("willStartInEditMode", 0) as java.lang.Boolean
    }
    
    property set willStartInEditMode ($arg :  boolean) {
      setVariableValue("willStartInEditMode", 0, $arg)
    }
    
    
    function validate(wcbp : WCBenefitParameterSet) {
      var startDate = wcbp.StartDate
      var endDate = wcbp.EndDate
      var jurisdiction = wcbp.JurisdictionState
    
      var overlaps = Query.make(entity.WCBenefitParameterSet).compare("JurisdictionState", Equals, jurisdiction)
                                              .compare("ID", NotEquals, wcbp.ID)
                                              .compare("StartDate", LessThanOrEquals, endDate)
                                              .compare("EndDate", GreaterThanOrEquals, startDate).select()
            
      if (overlaps.Count > 0) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.WCParams.BenefitParameters.ConflictWarning"))
      }
    }
    
    
  }
  
  
}