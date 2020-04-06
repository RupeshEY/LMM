package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 15, column 111
    function def_onEnter_1 (def :  pcf.ActivityCompensableInputSet) : void {
      def.onEnter(Activity.Claim, Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 28, column 47
    function def_onEnter_10 (def :  pcf.ActivityNoteInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 33, column 49
    function def_onEnter_14 (def :  pcf.ActivityBulkInvoiceWarningInputSet) : void {
      def.onEnter(Activity.BulkInvoice)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 37, column 51
    function def_onEnter_17 (def :  pcf.ActivityTrackingInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 17, column 50
    function def_onEnter_3 (def :  pcf.ActivityDetailsInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 20, column 48
    function def_onEnter_5 (def :  pcf.ActivityOwnerInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 24, column 51
    function def_onEnter_7 (def :  pcf.ActivityDocumentInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 28, column 47
    function def_refreshVariables_11 (def :  pcf.ActivityNoteInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 33, column 49
    function def_refreshVariables_15 (def :  pcf.ActivityBulkInvoiceWarningInputSet) : void {
      def.refreshVariables(Activity.BulkInvoice)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 37, column 51
    function def_refreshVariables_18 (def :  pcf.ActivityTrackingInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 15, column 111
    function def_refreshVariables_2 (def :  pcf.ActivityCompensableInputSet) : void {
      def.refreshVariables(Activity.Claim, Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 17, column 50
    function def_refreshVariables_4 (def :  pcf.ActivityDetailsInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 20, column 48
    function def_refreshVariables_6 (def :  pcf.ActivityOwnerInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.default.pcf: line 24, column 51
    function def_refreshVariables_8 (def :  pcf.ActivityDocumentInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'visible' attribute on InputSetRef at ActivityDV.default.pcf: line 15, column 111
    function visible_0 () : java.lang.Boolean {
      return Activity.ActivityPattern.PublicID == "default_data:10019" /* claim_acceptance */
    }
    
    // 'visible' attribute on InputDivider at ActivityDV.default.pcf: line 30, column 37
    function visible_12 () : java.lang.Boolean {
      return perm.Note.create
    }
    
    // 'visible' attribute on InputSetRef at ActivityDV.default.pcf: line 33, column 49
    function visible_13 () : java.lang.Boolean {
      return null != Activity.BulkInvoice
    }
    
    // 'visible' attribute on InputSetRef at ActivityDV.default.pcf: line 28, column 47
    function visible_9 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    
  }
  
  
}