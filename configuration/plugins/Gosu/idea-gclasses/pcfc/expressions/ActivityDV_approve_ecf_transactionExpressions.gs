package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDV.approve_ecf_transaction.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDV_approve_ecf_transactionExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDV.approve_ecf_transaction.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 18, column 285
    function action_11 () : void {
      if (Activity.LMMessage_Ext.CreateUser.Contact != null) { ClaimContactDetailPopup.push(Activity.LMMessage_Ext.CreateUser.Contact, Activity.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function action_12 () : void {
      ClaimContactDetailPopup.push(Activity.LMMessage_Ext.CreateUser.Contact, Activity.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 16, column 225
    function action_9 () : void {
      AddressBookPickerPopup.push(statictypeof (Activity.LMMessage_Ext.CreateUser.Contact), Activity.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_10 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Activity.LMMessage_Ext.CreateUser.Contact), Activity.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Activity.LMMessage_Ext.CreateUser.Contact, Activity.Claim)
    }
    
    // 'def' attribute on ListViewInput at ActivityDV.approve_ecf_transaction.pcf: line 15, column 94
    function def_onEnter_0 (def :  pcf.ApprovalHistoryLV) : void {
      def.onEnter((Activity.LMMessage_Ext as ECFMessageClaimResponseRq_Ext).ApprovalHistory)
    }
    
    // 'def' attribute on ListViewInput at ActivityDV.approve_ecf_transaction.pcf: line 22, column 41
    function def_onEnter_2 (def :  pcf.ECFTransactionLV) : void {
      def.onEnter(Activity.LMMessage_Ext as ECFMessageClaimResponseRq_Ext)
    }
    
    // 'def' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_6 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Activity.LMMessage_Ext.CreateUser.Contact), null, Activity.Claim)
    }
    
    // 'def' attribute on ListViewInput at ActivityDV.approve_ecf_transaction.pcf: line 15, column 94
    function def_refreshVariables_1 (def :  pcf.ApprovalHistoryLV) : void {
      def.refreshVariables((Activity.LMMessage_Ext as ECFMessageClaimResponseRq_Ext).ApprovalHistory)
    }
    
    // 'def' attribute on ListViewInput at ActivityDV.approve_ecf_transaction.pcf: line 22, column 41
    function def_refreshVariables_3 (def :  pcf.ECFTransactionLV) : void {
      def.refreshVariables(Activity.LMMessage_Ext as ECFMessageClaimResponseRq_Ext)
    }
    
    // 'def' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_7 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Activity.LMMessage_Ext.CreateUser.Contact), null, Activity.Claim)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function onPick_14 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Activity.LMMessage_Ext.CreateUser.Contact); var result = eval("Activity.LMMessage_Ext.CreateUser.Contact = Activity.Claim.resolveContact(Activity.LMMessage_Ext.CreateUser.Contact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_17 () : java.lang.Object {
      return Activity.Claim.RelatedUserContactArray
    }
    
    // 'value' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_16 () : java.lang.Object {
      return Activity.LMMessage_Ext.CreateUser
    }
    
    // 'value' attribute on DateInput (id=Details_CreateTime) at ActivityDV.approve_ecf_transaction.pcf: line 38, column 52
    function valueRoot_25 () : java.lang.Object {
      return Activity.LMMessage_Ext
    }
    
    // 'value' attribute on DateInput (id=Details_CreateTime) at ActivityDV.approve_ecf_transaction.pcf: line 38, column 52
    function value_23 () : java.util.Date {
      return Activity.LMMessage_Ext.CreateTime
    }
    
    // 'value' attribute on ClaimContactInput (id=Details_CreateUser) at ActivityDV.approve_ecf_transaction.pcf: line 34, column 41
    function value_4 () : entity.UserContact {
      return Activity.LMMessage_Ext.CreateUser.Contact
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_18 ($$arg :  entity.UserContact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_18 ($$arg :  gw.api.database.IQueryBeanResult<entity.UserContact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_19 () : void {
      var __valueRangeArg = Activity.Claim.RelatedUserContactArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Details_CreateUser) at ActivityDV.approve_ecf_transaction.pcf: line 34, column 41
    function verifyValueType_22 () : void {
      var __valueTypeArg : entity.UserContact
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 14, column 229
    function visible_5 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Details_CreateUser) at ClaimContactWidget.xml: line 16, column 225
    function visible_8 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Activity.LMMessage_Ext.CreateUser.Contact), Activity.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    
  }
  
  
}