package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/ReviewsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReviewsPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/review/ReviewsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ReviewCardPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=Reviews_AddReviewNewMenuItem) at ReviewsPanelSet.pcf: line 56, column 40
    function action_4 () : void {
      pcf.CreateReviewPopup.push( selected, contact, claim )
    }
    
    // 'action' attribute on MenuItem (id=Reviews_AddReviewNewMenuItem) at ReviewsPanelSet.pcf: line 56, column 40
    function action_dest_5 () : pcf.api.Destination {
      return pcf.CreateReviewPopup.createDestination( selected, contact, claim )
    }
    
    // 'label' attribute on MenuItem (id=Reviews_AddReviewNewMenuItem) at ReviewsPanelSet.pcf: line 56, column 40
    function label_6 () : java.lang.Object {
      return selected.Name
    }
    
    property get selected () : entity.ReviewType {
      return getIteratedValue(2) as entity.ReviewType
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/contacts/review/ReviewsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReviewCardPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=Reviews_AddReviewNewMenuItem) at ReviewsPanelSet.pcf: line 41, column 40
    function action_0 () : void {
      createNewReview(selected)
    }
    
    // 'label' attribute on MenuItem (id=Reviews_AddReviewNewMenuItem) at ReviewsPanelSet.pcf: line 41, column 40
    function label_1 () : java.lang.Object {
      return selected.Name
    }
    
    property get selected () : entity.ReviewType {
      return getIteratedValue(2) as entity.ReviewType
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/contacts/review/ReviewsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewCardPanelExpressionsImpl extends ReviewsPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton) at ReviewsPanelSet.pcf: line 82, column 110
    function action_17 () : void {
      pcf.ContactReviewPopup.push( selectedReview )
    }
    
    // 'action' attribute on ToolbarButton (id=Delete) at ReviewsPanelSet.pcf: line 90, column 65
    function action_20 () : void {
      selectedReview.delete()
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton) at ReviewsPanelSet.pcf: line 82, column 110
    function action_dest_18 () : pcf.api.Destination {
      return pcf.ContactReviewPopup.createDestination( selectedReview )
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ReviewCompleteSelectedNRE) at ReviewsPanelSet.pcf: line 66, column 76
    function allCheckedRowsAction_10 (CheckedValues :  entity.Review[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.contact.ReviewUtil.completeSelectedReviews( CheckedValues, CurrentLocation )
    }
    
    // 'def' attribute on PanelRef at ReviewsPanelSet.pcf: line 27, column 29
    function def_onEnter_11 (def :  pcf.ReviewsLV_ab) : void {
      def.onEnter(contact, claim)
    }
    
    // 'def' attribute on PanelRef at ReviewsPanelSet.pcf: line 27, column 29
    function def_onEnter_13 (def :  pcf.ReviewsLV_default) : void {
      def.onEnter(contact, claim)
    }
    
    // 'def' attribute on PanelRef at ReviewsPanelSet.pcf: line 75, column 51
    function def_onEnter_21 (def :  pcf.ReviewDV) : void {
      def.onEnter(selectedReview, false)
    }
    
    // 'def' attribute on PanelRef at ReviewsPanelSet.pcf: line 27, column 29
    function def_refreshVariables_12 (def :  pcf.ReviewsLV_ab) : void {
      def.refreshVariables(contact, claim)
    }
    
    // 'def' attribute on PanelRef at ReviewsPanelSet.pcf: line 27, column 29
    function def_refreshVariables_14 (def :  pcf.ReviewsLV_default) : void {
      def.refreshVariables(contact, claim)
    }
    
    // 'def' attribute on PanelRef at ReviewsPanelSet.pcf: line 75, column 51
    function def_refreshVariables_22 (def :  pcf.ReviewDV) : void {
      def.refreshVariables(selectedReview, false)
    }
    
    // 'mode' attribute on PanelRef at ReviewsPanelSet.pcf: line 27, column 29
    function mode_15 () : java.lang.Object {
      return isInAB(inAB)
    }
    
    // 'value' attribute on MenuItemIterator at ReviewsPanelSet.pcf: line 37, column 47
    function value_2 () : entity.ReviewType[] {
      return gw.api.contact.ReviewUtil.findReviewTypesForContact(contact)
    }
    
    // 'visible' attribute on ToolbarButton (id=ToolbarButton) at ReviewsPanelSet.pcf: line 82, column 110
    function visible_16 () : java.lang.Boolean {
      return (!requireEdit or claim.Closed) and !selectedReview.Completed and perm.Review.edit
    }
    
    // 'visible' attribute on ToolbarButton (id=Delete) at ReviewsPanelSet.pcf: line 90, column 65
    function visible_19 () : java.lang.Boolean {
      return perm.Review.delete( selectedReview )
    }
    
    // 'visible' attribute on Card (id=ReviewDetailCard) at ReviewsPanelSet.pcf: line 73, column 38
    function visible_23 () : java.lang.Boolean {
      return perm.Review.view
    }
    
    // 'visible' attribute on ToolbarButton (id=Reviews_AddReviewNewRE) at ReviewsPanelSet.pcf: line 33, column 42
    function visible_3 () : java.lang.Boolean {
      return perm.Review.create
    }
    
    // 'visible' attribute on ToolbarButton (id=Reviews_AddReviewNewNRE) at ReviewsPanelSet.pcf: line 48, column 77
    function visible_8 () : java.lang.Boolean {
      return (!requireEdit or claim.Closed) and perm.Review.create
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ReviewCompleteSelectedNRE) at ReviewsPanelSet.pcf: line 66, column 76
    function visible_9 () : java.lang.Boolean {
      return perm.Review.edit and contact.AddressBookUID != null
    }
    
    property get selectedReview () : Review {
      return getCurrentSelection(1) as Review
    }
    
    property set selectedReview ($arg :  Review) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/contacts/review/ReviewsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get contact () : Contact {
      return getRequireValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setRequireValue("contact", 0, $arg)
    }
    
    property get inAB () : Boolean {
      return getRequireValue("inAB", 0) as Boolean
    }
    
    property set inAB ($arg :  Boolean) {
      setRequireValue("inAB", 0, $arg)
    }
    
    property get requireEdit () : Boolean {
      return getRequireValue("requireEdit", 0) as Boolean
    }
    
    property set requireEdit ($arg :  Boolean) {
      setRequireValue("requireEdit", 0, $arg)
    }
    
    
    function createNewReview(type : ReviewType) : Review {
      return gw.api.contact.ReviewUtil.createNewReview(type, contact, claim);
    }
    
    function isInAB(useAB : Boolean) : String {
      if (useAB) return "ab";
      return "default";
    }
        
    
    
  }
  
  
}