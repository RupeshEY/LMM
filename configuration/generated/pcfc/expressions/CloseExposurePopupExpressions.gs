package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/CloseExposurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CloseExposurePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/CloseExposurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseExposurePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (exposure :  Exposure) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=CloseExposurePopup) at CloseExposurePopup.pcf: line 11, column 75
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      closeExposureInfo.beforeCommit()
    }
    
    // 'def' attribute on PanelRef at CloseExposurePopup.pcf: line 30, column 55
    function def_onEnter_2 (def :  pcf.CloseExposureInfoDV) : void {
      def.onEnter(closeExposureInfo)
    }
    
    // 'def' attribute on PanelRef at CloseExposurePopup.pcf: line 30, column 55
    function def_refreshVariables_3 (def :  pcf.CloseExposureInfoDV) : void {
      def.refreshVariables(closeExposureInfo)
    }
    
    // 'initialValue' attribute on Variable at CloseExposurePopup.pcf: line 20, column 33
    function initialValue_0 () : CloseExposureInfo {
      return createInfo()
    }
    
    // 'parent' attribute on Popup (id=CloseExposurePopup) at CloseExposurePopup.pcf: line 11, column 75
    static function parent_5 (exposure :  Exposure) : pcf.api.Destination {
      return pcf.Claim.createDestination(exposure.Claim)
    }
    
    // 'showUpdateConfirmMessage' attribute on EditButtons at CloseExposurePopup.pcf: line 27, column 81
    function showConfirmMessage_1 () : java.lang.Boolean {
      return exposure.hasAwaitingSubmissionPaymentsForToday()
    }
    
    // 'title' attribute on Popup (id=CloseExposurePopup) at CloseExposurePopup.pcf: line 11, column 75
    static function title_6 (exposure :  Exposure) : java.lang.Object {
      return DisplayKey.get("JSP.CloseExposure.Title", exposure)
    }
    
    override property get CurrentLocation () : pcf.CloseExposurePopup {
      return super.CurrentLocation as pcf.CloseExposurePopup
    }
    
    property get closeExposureInfo () : CloseExposureInfo {
      return getVariableValue("closeExposureInfo", 0) as CloseExposureInfo
    }
    
    property set closeExposureInfo ($arg :  CloseExposureInfo) {
      setVariableValue("closeExposureInfo", 0, $arg)
    }
    
    property get exposure () : Exposure {
      return getVariableValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    
    function createInfo() : CloseExposureInfo {
            var info = new CloseExposureInfo();
            info.Exposure = exposure;
            return info;
          }
        
    
    
  }
  
  
}