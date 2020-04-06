package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReopenExposurePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ReopenExposurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenExposurePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (exposureToReopen :  Exposure) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=ReopenExposurePopup) at ReopenExposurePopup.pcf: line 11, column 84
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      reopenExposureInfo.beforeCommit()
    }
    
    // 'def' attribute on PanelRef at ReopenExposurePopup.pcf: line 28, column 57
    function def_onEnter_1 (def :  pcf.ReopenExposureInfoDV) : void {
      def.onEnter(reopenExposureInfo)
    }
    
    // 'def' attribute on PanelRef at ReopenExposurePopup.pcf: line 28, column 57
    function def_refreshVariables_2 (def :  pcf.ReopenExposureInfoDV) : void {
      def.refreshVariables(reopenExposureInfo)
    }
    
    // 'initialValue' attribute on Variable at ReopenExposurePopup.pcf: line 20, column 34
    function initialValue_0 () : ReopenExposureInfo {
      return createInfo()
    }
    
    // 'parent' attribute on Popup (id=ReopenExposurePopup) at ReopenExposurePopup.pcf: line 11, column 84
    static function parent_4 (exposureToReopen :  Exposure) : pcf.api.Destination {
      return pcf.Claim.createDestination(exposureToReopen.Claim)
    }
    
    // 'title' attribute on Popup (id=ReopenExposurePopup) at ReopenExposurePopup.pcf: line 11, column 84
    static function title_5 (exposureToReopen :  Exposure) : java.lang.Object {
      return DisplayKey.get("JSP.ReopenExposure.Title", exposureToReopen)
    }
    
    override property get CurrentLocation () : pcf.ReopenExposurePopup {
      return super.CurrentLocation as pcf.ReopenExposurePopup
    }
    
    property get exposureToReopen () : Exposure {
      return getVariableValue("exposureToReopen", 0) as Exposure
    }
    
    property set exposureToReopen ($arg :  Exposure) {
      setVariableValue("exposureToReopen", 0, $arg)
    }
    
    property get reopenExposureInfo () : ReopenExposureInfo {
      return getVariableValue("reopenExposureInfo", 0) as ReopenExposureInfo
    }
    
    property set reopenExposureInfo ($arg :  ReopenExposureInfo) {
      setVariableValue("reopenExposureInfo", 0, $arg)
    }
    
    
    function createInfo() : ReopenExposureInfo {
            var info = new ReopenExposureInfo();
            info.Exposure = exposureToReopen;
            return info;
          }
        
    
    
  }
  
  
}