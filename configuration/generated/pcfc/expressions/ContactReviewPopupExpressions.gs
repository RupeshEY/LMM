package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/ContactReviewPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactReviewPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/review/ContactReviewPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactReviewPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (review :  Review) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=UpdateButton) at ContactReviewPopup.pcf: line 22, column 53
    function action_1 () : void {
      review.updateScores();CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=CancelButton) at ContactReviewPopup.pcf: line 27, column 25
    function action_2 () : void {
      CurrentLocation.cancel()
    }
    
    // 'canEdit' attribute on Popup (id=ContactReviewPopup) at ContactReviewPopup.pcf: line 10, column 99
    function canEdit_5 () : java.lang.Boolean {
      return !review.isCompleted()
    }
    
    // 'def' attribute on PanelRef at ContactReviewPopup.pcf: line 30, column 40
    function def_onEnter_3 (def :  pcf.ReviewDV) : void {
      def.onEnter(review, false)
    }
    
    // 'def' attribute on PanelRef at ContactReviewPopup.pcf: line 30, column 40
    function def_refreshVariables_4 (def :  pcf.ReviewDV) : void {
      def.refreshVariables(review, false)
    }
    
    // 'title' attribute on Popup (id=ContactReviewPopup) at ContactReviewPopup.pcf: line 10, column 99
    static function title_6 (review :  Review) : java.lang.Object {
      return DisplayKey.get("Web.Reviews.ReviewPopup.Title", review.Contact.DisplayName)
    }
    
    // 'visible' attribute on ToolbarButton (id=UpdateButton) at ContactReviewPopup.pcf: line 22, column 53
    function visible_0 () : java.lang.Boolean {
      return CurrentLocation.isInEditMode()
    }
    
    override property get CurrentLocation () : pcf.ContactReviewPopup {
      return super.CurrentLocation as pcf.ContactReviewPopup
    }
    
    property get review () : Review {
      return getVariableValue("review", 0) as Review
    }
    
    property set review ($arg :  Review) {
      setVariableValue("review", 0, $arg)
    }
    
    
  }
  
  
}