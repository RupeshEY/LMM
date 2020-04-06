package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/ReviewDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReviewDVExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/review/ReviewDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ReviewDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at ReviewDV.pcf: line 150, column 31
    function def_onEnter_63 (def :  pcf.QuestionSetLV) : void {
      def.onEnter(rqas.QuestionSet, rqas)
    }
    
    // 'def' attribute on ListViewInput at ReviewDV.pcf: line 150, column 31
    function def_refreshVariables_64 (def :  pcf.QuestionSetLV) : void {
      def.refreshVariables(rqas.QuestionSet, rqas)
    }
    
    // 'editable' attribute on ListViewInput at ReviewDV.pcf: line 150, column 31
    function editable_62 () : java.lang.Boolean {
      return !review.isCompleted()
    }
    
    // 'label' attribute on TextInput (id=ReviewCategory) at ReviewDV.pcf: line 146, column 35
    function label_60 () : java.lang.Object {
      return rqas.ReviewCategory.DisplayName
    }
    
    property get rqas () : entity.ReviewQAnswerSet {
      return getIteratedValue(1) as entity.ReviewQAnswerSet
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/contacts/review/ReviewDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReviewDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at ReviewDV.pcf: line 120, column 53
    function valueRoot_54 () : java.lang.Object {
      return categoryScore
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at ReviewDV.pcf: line 120, column 53
    function value_52 () : typekey.ReviewCategory {
      return categoryScore.ReviewCategory
    }
    
    // 'value' attribute on TextCell (id=Score) at ReviewDV.pcf: line 126, column 48
    function value_55 () : java.lang.Integer {
      return categoryScore.Score
    }
    
    property get categoryScore () : entity.ReviewCategoryScore {
      return getIteratedValue(1) as entity.ReviewCategoryScore
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/contacts/review/ReviewDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReviewDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on PickerInput (id=ReviewClaim) at ReviewDV.pcf: line 40, column 34
    function action_7 () : void {
      ClaimSearchPopup.push()
    }
    
    // 'pickLocation' attribute on PickerInput (id=ReviewClaim) at ReviewDV.pcf: line 40, column 34
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ClaimSearchPopup.createDestination()
    }
    
    // 'conversionExpression' attribute on PickerInput (id=ReviewClaim) at ReviewDV.pcf: line 40, column 34
    function conversionExpression_10 (PickedValue :  Object) : entity.Claim {
      return (PickedValue as ClaimSearchView).Claim 
    }
    
    // 'value' attribute on PickerInput (id=ReviewClaim) at ReviewDV.pcf: line 40, column 34
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      review.Claim = (__VALUE_TO_SET as entity.Claim)
    }
    
    // 'value' attribute on RangeInput (id=ReviewRelatedTo) at ReviewDV.pcf: line 50, column 39
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      review.RelatedTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TextInput0) at ReviewDV.pcf: line 78, column 36
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      review.Subcontact = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=ReviewServiceDate) at ReviewDV.pcf: line 83, column 37
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      review.ServiceDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=ReviewServiceType) at ReviewDV.pcf: line 90, column 48
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      review.ServiceType = (__VALUE_TO_SET as typekey.ReviewServiceType)
    }
    
    // 'value' attribute on TextAreaInput (id=ReviewComments) at ReviewDV.pcf: line 99, column 34
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      review.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on PickerInput (id=ReviewClaim) at ReviewDV.pcf: line 40, column 34
    function editable_5 () : java.lang.Boolean {
      return allowClaimEdit
    }
    
    // 'editable' attribute on DetailViewPanel (id=ReviewDV) at ReviewDV.pcf: line 8, column 19
    function editable_66 () : java.lang.Boolean {
      return !review.isCompleted() and perm.Review.edit
    }
    
    // 'filter' attribute on TypeKeyInput (id=ReviewServiceType) at ReviewDV.pcf: line 90, column 48
    function filter_46 (VALUE :  typekey.ReviewServiceType, VALUES :  typekey.ReviewServiceType[]) : java.util.List<typekey.ReviewServiceType> {
      return gw.api.contact.ReviewUtil.filterReviewServiceTypesForContact(review.Contact, VALUES)
    }
    
    // 'initialValue' attribute on Variable at ReviewDV.pcf: line 16, column 23
    function initialValue_0 () : Boolean {
      return review.CategoryScores != null and review.CategoryScores.length > 0
    }
    
    // 'initialValue' attribute on Variable at ReviewDV.pcf: line 24, column 54
    function initialValue_1 () : java.util.List<java.lang.String> {
      return getRoleOwnerDisplayNames(review.Claim)
    }
    
    // 'valueRange' attribute on RangeInput (id=ReviewRelatedTo) at ReviewDV.pcf: line 50, column 39
    function valueRange_18 () : java.lang.Object {
      return roleOwnerStrings
    }
    
    // 'value' attribute on TextInput (id=ReviewType) at ReviewDV.pcf: line 31, column 30
    function valueRoot_4 () : java.lang.Object {
      return review
    }
    
    // 'value' attribute on RangeInput (id=ReviewRelatedTo) at ReviewDV.pcf: line 50, column 39
    function value_14 () : java.lang.String {
      return review.RelatedTo
    }
    
    // 'value' attribute on TextInput (id=ReviewType) at ReviewDV.pcf: line 31, column 30
    function value_2 () : java.lang.String {
      return review.Name
    }
    
    // 'value' attribute on TextInput (id=ReviewedBy) at ReviewDV.pcf: line 55, column 34
    function value_21 () : entity.User {
      return review.ReviewedBy
    }
    
    // 'value' attribute on TextInput (id=ReviewStatus) at ReviewDV.pcf: line 59, column 43
    function value_24 () : java.lang.String {
      return review.getStatusString()
    }
    
    // 'value' attribute on TextInput (id=ReviewScore) at ReviewDV.pcf: line 65, column 41
    function value_27 () : java.lang.Integer {
      return review.Score
    }
    
    // 'value' attribute on TextInput (id=ReviewContact) at ReviewDV.pcf: line 73, column 37
    function value_31 () : entity.Contact {
      return review.Contact
    }
    
    // 'value' attribute on TextInput (id=TextInput0) at ReviewDV.pcf: line 78, column 36
    function value_34 () : java.lang.String {
      return review.Subcontact
    }
    
    // 'value' attribute on DateInput (id=ReviewServiceDate) at ReviewDV.pcf: line 83, column 37
    function value_38 () : java.util.Date {
      return review.ServiceDate
    }
    
    // 'value' attribute on TypeKeyInput (id=ReviewServiceType) at ReviewDV.pcf: line 90, column 48
    function value_42 () : typekey.ReviewServiceType {
      return review.ServiceType
    }
    
    // 'value' attribute on TextAreaInput (id=ReviewComments) at ReviewDV.pcf: line 99, column 34
    function value_47 () : java.lang.String {
      return review.Comments
    }
    
    // 'value' attribute on RowIterator at ReviewDV.pcf: line 113, column 54
    function value_58 () : entity.ReviewCategoryScore[] {
      return review.getSortedCategoryScores()
    }
    
    // 'value' attribute on PickerInput (id=ReviewClaim) at ReviewDV.pcf: line 40, column 34
    function value_6 () : entity.Claim {
      return review.Claim
    }
    
    // 'value' attribute on InputIterator (id=QuestionAnswerSetIterator) at ReviewDV.pcf: line 138, column 47
    function value_65 () : entity.ReviewQAnswerSet[] {
      return review.getSortedQuestionAnswerSets()
    }
    
    // 'valueRange' attribute on RangeInput (id=ReviewRelatedTo) at ReviewDV.pcf: line 50, column 39
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ReviewRelatedTo) at ReviewDV.pcf: line 50, column 39
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ReviewRelatedTo) at ReviewDV.pcf: line 50, column 39
    function verifyValueRange_20 () : void {
      var __valueRangeArg = roleOwnerStrings
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=ReviewScore) at ReviewDV.pcf: line 65, column 41
    function visible_26 () : java.lang.Boolean {
      return review.Score != null
    }
    
    // 'visible' attribute on InputDivider at ReviewDV.pcf: line 101, column 38
    function visible_51 () : java.lang.Boolean {
      return hasCategoryScores
    }
    
    property get allowClaimEdit () : boolean {
      return getRequireValue("allowClaimEdit", 0) as java.lang.Boolean
    }
    
    property set allowClaimEdit ($arg :  boolean) {
      setRequireValue("allowClaimEdit", 0, $arg)
    }
    
    property get hasCategoryScores () : Boolean {
      return getVariableValue("hasCategoryScores", 0) as Boolean
    }
    
    property set hasCategoryScores ($arg :  Boolean) {
      setVariableValue("hasCategoryScores", 0, $arg)
    }
    
    property get review () : Review {
      return getRequireValue("review", 0) as Review
    }
    
    property set review ($arg :  Review) {
      setRequireValue("review", 0, $arg)
    }
    
    property get roleOwnerStrings () : java.util.List<java.lang.String> {
      return getVariableValue("roleOwnerStrings", 0) as java.util.List<java.lang.String>
    }
    
    property set roleOwnerStrings ($arg :  java.util.List<java.lang.String>) {
      setVariableValue("roleOwnerStrings", 0, $arg)
    }
    
    
    function getRoleOwnerDisplayNames(claim : Claim) : java.util.List<String> {
      var displayStrings = new java.util.ArrayList<String>();
      
      for (roleOwner in claim.RoleOwners) {
        displayStrings.add( roleOwner.DisplayName );
      }
    
      return displayStrings;
    }
        
    
    
  }
  
  
}