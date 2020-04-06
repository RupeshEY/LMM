package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDV.catastrophe_review.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDV_catastrophe_reviewExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDV.catastrophe_review.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 14, column 111
    function def_onEnter_1 (def :  pcf.ActivityCompensableInputSet) : void {
      def.onEnter(Activity.Claim, Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 29, column 47
    function def_onEnter_11 (def :  pcf.ActivityNoteInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 34, column 49
    function def_onEnter_15 (def :  pcf.ActivityBulkInvoiceWarningInputSet) : void {
      def.onEnter(Activity.BulkInvoice)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 38, column 51
    function def_onEnter_18 (def :  pcf.ActivityTrackingInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 16, column 50
    function def_onEnter_3 (def :  pcf.ActivityDetailsInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 19, column 48
    function def_onEnter_5 (def :  pcf.ActivityOwnerInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 23, column 60
    function def_onEnter_7 (def :  pcf.ActivityCatastropheInputSet) : void {
      def.onEnter(Activity.Claim)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 26, column 51
    function def_onEnter_9 (def :  pcf.ActivityDocumentInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 26, column 51
    function def_refreshVariables_10 (def :  pcf.ActivityDocumentInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 29, column 47
    function def_refreshVariables_12 (def :  pcf.ActivityNoteInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 34, column 49
    function def_refreshVariables_16 (def :  pcf.ActivityBulkInvoiceWarningInputSet) : void {
      def.refreshVariables(Activity.BulkInvoice)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 38, column 51
    function def_refreshVariables_19 (def :  pcf.ActivityTrackingInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 14, column 111
    function def_refreshVariables_2 (def :  pcf.ActivityCompensableInputSet) : void {
      def.refreshVariables(Activity.Claim, Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 16, column 50
    function def_refreshVariables_4 (def :  pcf.ActivityDetailsInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 19, column 48
    function def_refreshVariables_6 (def :  pcf.ActivityOwnerInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 23, column 60
    function def_refreshVariables_8 (def :  pcf.ActivityCatastropheInputSet) : void {
      def.refreshVariables(Activity.Claim)
    }
    
    // 'visible' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 14, column 111
    function visible_0 () : java.lang.Boolean {
      return Activity.ActivityPattern.PublicID == "default_data:10019" /* claim_acceptance */
    }
    
    // 'visible' attribute on InputDivider at ActivityDV.catastrophe_review.pcf: line 31, column 37
    function visible_13 () : java.lang.Boolean {
      return perm.Note.create
    }
    
    // 'visible' attribute on InputSetRef at ActivityDV.catastrophe_review.pcf: line 34, column 49
    function visible_14 () : java.lang.Boolean {
      return null != Activity.BulkInvoice
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    
  }
  
  
}