package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/MarkInvoicePaidPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MarkInvoicePaidPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/MarkInvoicePaidPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MarkInvoicePaidPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (invoice :  ServiceRequestInvoice) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=MarkInvoicePaidPopup) at MarkInvoicePaidPopup.pcf: line 10, column 82
    function beforeCommit_8 (pickedValue :  java.lang.Object) : void {
      invoice.pay()
    }
    
    // 'value' attribute on RangeInput (id=ClaimChecks) at MarkInvoicePaidPopup.pcf: line 30, column 41
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      invoice.Check = (__VALUE_TO_SET as entity.Check)
    }
    
    // EditButtons at MarkInvoicePaidPopup.pcf: line 18, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimChecks) at MarkInvoicePaidPopup.pcf: line 30, column 41
    function valueRange_5 () : java.lang.Object {
      return CompatibleChecks
    }
    
    // 'value' attribute on RangeInput (id=ClaimChecks) at MarkInvoicePaidPopup.pcf: line 30, column 41
    function valueRoot_4 () : java.lang.Object {
      return invoice
    }
    
    // 'value' attribute on RangeInput (id=ClaimChecks) at MarkInvoicePaidPopup.pcf: line 30, column 41
    function value_1 () : entity.Check {
      return invoice.Check
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimChecks) at MarkInvoicePaidPopup.pcf: line 30, column 41
    function verifyValueRangeIsAllowedType_6 ($$arg :  entity.Check[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimChecks) at MarkInvoicePaidPopup.pcf: line 30, column 41
    function verifyValueRangeIsAllowedType_6 ($$arg :  gw.api.database.IQueryBeanResult<entity.Check>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimChecks) at MarkInvoicePaidPopup.pcf: line 30, column 41
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimChecks) at MarkInvoicePaidPopup.pcf: line 30, column 41
    function verifyValueRange_7 () : void {
      var __valueRangeArg = CompatibleChecks
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.MarkInvoicePaidPopup {
      return super.CurrentLocation as pcf.MarkInvoicePaidPopup
    }
    
    property get invoice () : ServiceRequestInvoice {
      return getVariableValue("invoice", 0) as ServiceRequestInvoice
    }
    
    property set invoice ($arg :  ServiceRequestInvoice) {
      setVariableValue("invoice", 0, $arg)
    }
    
    /**
     * Return all the claim checks that matches the following conditions:
     * are single-payee
     * are non-recurring,
     * have the same currency as the service request
     */
    property get CompatibleChecks(): java.util.List<Check> {
      return invoice.ServiceRequest.Claim.ChecksQuery.where( \ check -> check.Currency.equals(invoice.ServiceRequest.Currency)
                                          and not check.CheckSet.Recurring
                                          and not check.isGroupMember(false))
    }
    
    
  }
  
  
}