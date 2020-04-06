package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickEmailTemplatePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickEmailTemplatePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (inSearchCriteria :  gw.api.email.EmailTemplateSearchCriteria) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=PickEmailTemplatePopup_CancelButton) at PickEmailTemplatePopup.pcf: line 21, column 25
    function action_0 () : void {
      CurrentLocation.cancel();
    }
    
    override property get CurrentLocation () : pcf.PickEmailTemplatePopup {
      return super.CurrentLocation as pcf.PickEmailTemplatePopup
    }
    
    property get inSearchCriteria () : gw.api.email.EmailTemplateSearchCriteria {
      return getVariableValue("inSearchCriteria", 0) as gw.api.email.EmailTemplateSearchCriteria
    }
    
    property set inSearchCriteria ($arg :  gw.api.email.EmailTemplateSearchCriteria) {
      setVariableValue("inSearchCriteria", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/email/PickEmailTemplatePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends PickEmailTemplatePopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at PickEmailTemplatePopup.pcf: line 31, column 56
    function def_onEnter_1 (def :  pcf.EmailTemplateSearchDV) : void {
      def.onEnter(searchCriteria)
    }
    
    // 'def' attribute on PanelRef at PickEmailTemplatePopup.pcf: line 33, column 75
    function def_onEnter_3 (def :  pcf.EmailTemplateSearchResultLV) : void {
      def.onEnter(EmailTemplateDescriptorList)
    }
    
    // 'def' attribute on PanelRef at PickEmailTemplatePopup.pcf: line 31, column 56
    function def_refreshVariables_2 (def :  pcf.EmailTemplateSearchDV) : void {
      def.refreshVariables(searchCriteria)
    }
    
    // 'def' attribute on PanelRef at PickEmailTemplatePopup.pcf: line 33, column 75
    function def_refreshVariables_4 (def :  pcf.EmailTemplateSearchResultLV) : void {
      def.refreshVariables(EmailTemplateDescriptorList)
    }
    
    // 'searchCriteria' attribute on SearchPanel at PickEmailTemplatePopup.pcf: line 29, column 72
    function searchCriteria_6 () : gw.api.email.EmailTemplateSearchCriteria {
      return inSearchCriteria.copy()
    }
    
    // 'search' attribute on SearchPanel at PickEmailTemplatePopup.pcf: line 29, column 72
    function search_5 () : java.lang.Object {
      return searchCriteria.performSearch()
    }
    
    property get EmailTemplateDescriptorList () : gw.plugin.email.IEmailTemplateDescriptor[] {
      return getResultsValue(1) as gw.plugin.email.IEmailTemplateDescriptor[]
    }
    
    property get searchCriteria () : gw.api.email.EmailTemplateSearchCriteria {
      return getCriteriaValue(1) as gw.api.email.EmailTemplateSearchCriteria
    }
    
    property set searchCriteria ($arg :  gw.api.email.EmailTemplateSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}