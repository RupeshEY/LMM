package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/CreateReviewPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CreateReviewPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/review/CreateReviewPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateReviewPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (reviewType :  ReviewType, contact :  Contact) : int {
      return 1
    }
    
    static function __constructorIndex (reviewType :  ReviewType, contact :  Contact, claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=UpdateButton) at CreateReviewPopup.pcf: line 39, column 53
    function action_4 () : void {
      review.updateScores();CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=CancelButton) at CreateReviewPopup.pcf: line 44, column 25
    function action_5 () : void {
      CurrentLocation.cancel()
    }
    
    // 'action' attribute on ToolbarButton (id=ReviewScreen_CompleteButton) at CreateReviewPopup.pcf: line 53, column 40
    function action_7 () : void {
      review.complete()
    }
    
    // 'action' attribute on ToolbarButton (id=ReviewScreen_DeleteButton) at CreateReviewPopup.pcf: line 59, column 67
    function action_8 () : void {
      review.delete(); CurrentLocation.cancel();
    }
    
    // 'canEdit' attribute on Popup (id=CreateReviewPopup) at CreateReviewPopup.pcf: line 10, column 60
    function canEdit_11 () : java.lang.Boolean {
      return !review.isCompleted()
    }
    
    // 'def' attribute on PanelRef at CreateReviewPopup.pcf: line 62, column 49
    function def_onEnter_9 (def :  pcf.ReviewDV) : void {
      def.onEnter(review, allowClaimEdit)
    }
    
    // 'def' attribute on PanelRef at CreateReviewPopup.pcf: line 62, column 49
    function def_refreshVariables_10 (def :  pcf.ReviewDV) : void {
      def.refreshVariables(review, allowClaimEdit)
    }
    
    // 'initialValue' attribute on Variable at CreateReviewPopup.pcf: line 24, column 21
    function initialValue_0 () : Claim {
      return null
    }
    
    // 'initialValue' attribute on Variable at CreateReviewPopup.pcf: line 28, column 29
    function initialValue_1 () : entity.Review {
      return createNewReview()
    }
    
    // 'initialValue' attribute on Variable at CreateReviewPopup.pcf: line 32, column 23
    function initialValue_2 () : boolean {
      return review.Claim == null
    }
    
    // 'visible' attribute on ToolbarButton (id=UpdateButton) at CreateReviewPopup.pcf: line 39, column 53
    function visible_3 () : java.lang.Boolean {
      return CurrentLocation.isInEditMode()
    }
    
    // 'visible' attribute on ToolbarButton (id=ReviewScreen_CompleteButton) at CreateReviewPopup.pcf: line 53, column 40
    function visible_6 () : java.lang.Boolean {
      return !review.Completed
    }
    
    override property get CurrentLocation () : pcf.CreateReviewPopup {
      return super.CurrentLocation as pcf.CreateReviewPopup
    }
    
    property get allowClaimEdit () : boolean {
      return getVariableValue("allowClaimEdit", 0) as java.lang.Boolean
    }
    
    property set allowClaimEdit ($arg :  boolean) {
      setVariableValue("allowClaimEdit", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get contact () : Contact {
      return getVariableValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setVariableValue("contact", 0, $arg)
    }
    
    property get review () : entity.Review {
      return getVariableValue("review", 0) as entity.Review
    }
    
    property set review ($arg :  entity.Review) {
      setVariableValue("review", 0, $arg)
    }
    
    property get reviewType () : ReviewType {
      return getVariableValue("reviewType", 0) as ReviewType
    }
    
    property set reviewType ($arg :  ReviewType) {
      setVariableValue("reviewType", 0, $arg)
    }
    
    
    function createNewReview() : Review {
            review = gw.api.contact.ReviewUtil.createNewReview(reviewType,contact,claim);
            review.Claim = claim;
            return review
          }
        
    
    
  }
  
  
}