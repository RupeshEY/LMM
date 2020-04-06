package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDV.quote.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatementDV_quoteExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/StatementDV.quote.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 9, column 49
    function action_32 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 12, column 49
    function action_34 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 9, column 49
    function action_dest_33 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 12, column 49
    function action_dest_35 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'def' attribute on ListViewInput at StatementDV.quote.pcf: line 80, column 54
    function def_onEnter_59 (def :  pcf.StatementLineItemLV) : void {
      def.onEnter(currentQuote)
    }
    
    // 'def' attribute on ListViewInput at StatementDV.quote.pcf: line 80, column 54
    function def_refreshVariables_60 (def :  pcf.StatementLineItemLV) : void {
      def.refreshVariables(currentQuote)
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at StatementDV.quote.pcf: line 38, column 55
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      currentQuote.ReferenceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=DaysToPerformService) at StatementDV.quote.pcf: line 55, column 55
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      (currentQuote as ServiceRequestQuote).ExpectedDaysToPerformService = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at StatementDV.quote.pcf: line 75, column 55
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      currentQuote.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=ReferenceNumber) at StatementDV.quote.pcf: line 38, column 55
    function editable_7 () : java.lang.Boolean {
      return currentQuote.New
    }
    
    // 'validationExpression' attribute on TextInput (id=DaysToPerformService) at StatementDV.quote.pcf: line 55, column 55
    function validationExpression_21 () : java.lang.Object {
      return ((currentQuote as ServiceRequestQuote).ExpectedDaysToPerformService >= 0) ? null : DisplayKey.get("Web.ServiceRequest.Quote.InvalidNumberOfDaysToPerformService")
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function valueRange_39 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'value' attribute on TextInput (id=DaysToPerformService) at StatementDV.quote.pcf: line 55, column 55
    function valueRoot_29 () : java.lang.Object {
      return (currentQuote as ServiceRequestQuote)
    }
    
    // 'value' attribute on CurrencyInput (id=quoteTotal) at StatementDV.quote.pcf: line 31, column 92
    function valueRoot_6 () : java.lang.Object {
      return currentQuote
    }
    
    // 'value' attribute on DateInput (id=CreationDate) at StatementDV.quote.pcf: line 45, column 101
    function value_16 () : java.util.Date {
      return currentQuote.StatementCreationTime
    }
    
    // 'value' attribute on TextInput (id=DaysToPerformService) at StatementDV.quote.pcf: line 55, column 55
    function value_23 () : java.lang.Integer {
      return (currentQuote as ServiceRequestQuote).ExpectedDaysToPerformService
    }
    
    // 'value' attribute on CurrencyInput (id=quoteTotal) at StatementDV.quote.pcf: line 31, column 92
    function value_3 () : gw.api.financials.CurrencyAmount {
      return currentQuote.Amount
    }
    
    // 'value' attribute on UserInput (id=ApprovedBy) at StatementDV.quote.pcf: line 61, column 139
    function value_31 () : entity.User {
      return currentQuote.ApprovedBy
    }
    
    // 'value' attribute on DateInput (id=ApprovalDate) at StatementDV.quote.pcf: line 67, column 141
    function value_46 () : java.util.Date {
      return currentQuote.ApprovalDate
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at StatementDV.quote.pcf: line 75, column 55
    function value_52 () : java.lang.String {
      return currentQuote.Description
    }
    
    // 'value' attribute on TextInput (id=ReferenceNumber) at StatementDV.quote.pcf: line 38, column 55
    function value_9 () : java.lang.String {
      return currentQuote.ReferenceNumber
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_40 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_40 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_40 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=ApprovedBy) at UserWidget.xml: line 6, column 85
    function verifyValueRange_41 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_40(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=NoQuotesMessage) at StatementDV.quote.pcf: line 26, column 60
    function visible_0 () : java.lang.Boolean {
      return currentQuote == null and not isEditable
    }
    
    // 'visible' attribute on DateInput (id=CreationDate) at StatementDV.quote.pcf: line 45, column 101
    function visible_15 () : java.lang.Boolean {
      return !(currentQuote == null or isEditable) or currentQuote.ServiceRequest.IsPromotion
    }
    
    // 'visible' attribute on CurrencyInput (id=quoteTotal) at StatementDV.quote.pcf: line 31, column 92
    function visible_2 () : java.lang.Boolean {
      return (!(currentQuote == null or isEditable) and !CurrentLocation.InEditMode)
    }
    
    // 'visible' attribute on UserInput (id=ApprovedBy) at StatementDV.quote.pcf: line 61, column 139
    function visible_30 () : java.lang.Boolean {
      return (!(currentQuote == null or isEditable) or currentQuote.ServiceRequest.IsPromotion) and currentQuote.ApprovedBy != null
    }
    
    // 'visible' attribute on DateInput (id=ApprovalDate) at StatementDV.quote.pcf: line 67, column 141
    function visible_45 () : java.lang.Boolean {
      return (!(currentQuote == null or isEditable) or currentQuote.ServiceRequest.IsPromotion) and currentQuote.ApprovalDate != null
    }
    
    // 'visible' attribute on TextInput (id=ReferenceNumber) at StatementDV.quote.pcf: line 38, column 55
    function visible_8 () : java.lang.Boolean {
      return currentQuote != null or isEditable
    }
    
    property get currentQuote () : ServiceRequestStatement {
      return getRequireValue("currentQuote", 0) as ServiceRequestStatement
    }
    
    property set currentQuote ($arg :  ServiceRequestStatement) {
      setRequireValue("currentQuote", 0, $arg)
    }
    
    property get isEditable () : boolean {
      return getRequireValue("isEditable", 0) as java.lang.Boolean
    }
    
    property set isEditable ($arg :  boolean) {
      setRequireValue("isEditable", 0, $arg)
    }
    
    property get previousTotal () : gw.api.financials.CurrencyAmount {
      return getRequireValue("previousTotal", 0) as gw.api.financials.CurrencyAmount
    }
    
    property set previousTotal ($arg :  gw.api.financials.CurrencyAmount) {
      setRequireValue("previousTotal", 0, $arg)
    }
    
    
  }
  
  
}