package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.database.Query
@javax.annotation.Generated("config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DenialPeriodPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/statutes/DenialPeriodPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DenialPeriodPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (specificWCDenialPeriod :  WCDenialPeriod, willStartInEditMode :  boolean) : int {
      return 1
    }
    
    // 'beforeCommit' attribute on Popup (id=DenialPeriodPopup) at DenialPeriodPopup.pcf: line 12, column 66
    function beforeCommit_5 (pickedValue :  WCDenialPeriod) : void {
      validate(aWCDenialPeriod)
    }
    
    // 'def' attribute on PanelRef at DenialPeriodPopup.pcf: line 30, column 47
    function def_onEnter_3 (def :  pcf.DenialPeriodDV) : void {
      def.onEnter(aWCDenialPeriod)
    }
    
    // 'def' attribute on PanelRef at DenialPeriodPopup.pcf: line 30, column 47
    function def_refreshVariables_4 (def :  pcf.DenialPeriodDV) : void {
      def.refreshVariables(aWCDenialPeriod)
    }
    
    // 'initialValue' attribute on Variable at DenialPeriodPopup.pcf: line 27, column 30
    function initialValue_0 () : WCDenialPeriod {
      return specificWCDenialPeriod == null ? new WCDenialPeriod() : specificWCDenialPeriod
    }
    
    // EditButtons at DenialPeriodPopup.pcf: line 33, column 42
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at DenialPeriodPopup.pcf: line 33, column 42
    function pickValue_1 () : WCDenialPeriod {
      return aWCDenialPeriod
    }
    
    // 'startInEditMode' attribute on Popup (id=DenialPeriodPopup) at DenialPeriodPopup.pcf: line 12, column 66
    function startInEditMode_6 () : java.lang.Boolean {
      return willStartInEditMode
    }
    
    override property get CurrentLocation () : pcf.DenialPeriodPopup {
      return super.CurrentLocation as pcf.DenialPeriodPopup
    }
    
    property get aWCDenialPeriod () : WCDenialPeriod {
      return getVariableValue("aWCDenialPeriod", 0) as WCDenialPeriod
    }
    
    property set aWCDenialPeriod ($arg :  WCDenialPeriod) {
      setVariableValue("aWCDenialPeriod", 0, $arg)
    }
    
    property get specificWCDenialPeriod () : WCDenialPeriod {
      return getVariableValue("specificWCDenialPeriod", 0) as WCDenialPeriod
    }
    
    property set specificWCDenialPeriod ($arg :  WCDenialPeriod) {
      setVariableValue("specificWCDenialPeriod", 0, $arg)
    }
    
    property get willStartInEditMode () : boolean {
      return getVariableValue("willStartInEditMode", 0) as java.lang.Boolean
    }
    
    property set willStartInEditMode ($arg :  boolean) {
      setVariableValue("willStartInEditMode", 0, $arg)
    }
    
    
    function validate(denialPeriod: entity.WCDenialPeriod) : String {
      
      var endDate = denialPeriod.ExpiryDate
      var startDate = denialPeriod.EffectiveDate
      var jurisdiction = denialPeriod.JurisdictionState
      
      var overlaps = Query.make(entity.WCDenialPeriod).compare("JurisdictionState", Equals, jurisdiction)
                                       .compare("ID", NotEquals, denialPeriod.ID)
                                       .compare("EffectiveDate", LessThanOrEquals, endDate)
                                       .compare("ExpiryDate", GreaterThanOrEquals, startDate).select()
              
      if (overlaps.Count > 0) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.WCParams.DenialPeriod.ConflictWarning"))
      } else {
        return null
      }    
    }
    
    
  }
  
  
}