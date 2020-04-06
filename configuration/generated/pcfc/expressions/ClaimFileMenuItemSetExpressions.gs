package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/ClaimFileMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimFileMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/ClaimFileMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFileMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_ReopenExposure) at ClaimFileMenuItemSet.pcf: line 42, column 101
    function action_12 () : void {
      if (gw.api.claim.ReopenUtil.requireExplanation(entity.Exposure)) {ReopenExposurePopup.push(CurrentExposure());} else {gw.api.claim.ReopenUtil.reopenExposureWithoutExplanation(CurrentExposure());}
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_Print) at ClaimFileMenuItemSet.pcf: line 46, column 72
    function action_13 () : void {
      ClaimPrintout.push(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_SyncStatus) at ClaimFileMenuItemSet.pcf: line 50, column 72
    function action_15 () : void {
      ClaimSyncStatusPopup.push(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_Assign) at ClaimFileMenuItemSet.pcf: line 22, column 45
    function action_2 () : void {
      AssignClaimsPopup.push(new gw.api.claim.ClaimAssignmentPopup(Claim));
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_CloseClaim) at ClaimFileMenuItemSet.pcf: line 27, column 58
    function action_4 () : void {
      CloseClaimPopup.push(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_ReopenClaim) at ClaimFileMenuItemSet.pcf: line 32, column 59
    function action_7 () : void {
      if (gw.api.claim.ReopenUtil.requireExplanation(entity.Claim)) {ReopenClaimPopup.push(Claim);} else {gw.api.claim.ReopenUtil.reopenClaimWithoutExplanation(Claim);}
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_CloseExposure) at ClaimFileMenuItemSet.pcf: line 37, column 100
    function action_9 () : void {
      CloseExposurePopup.push(CurrentExposure())
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_CloseExposure) at ClaimFileMenuItemSet.pcf: line 37, column 100
    function action_dest_10 () : pcf.api.Destination {
      return pcf.CloseExposurePopup.createDestination(CurrentExposure())
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_Print) at ClaimFileMenuItemSet.pcf: line 46, column 72
    function action_dest_14 () : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_SyncStatus) at ClaimFileMenuItemSet.pcf: line 50, column 72
    function action_dest_16 () : pcf.api.Destination {
      return pcf.ClaimSyncStatusPopup.createDestination(Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuActions_CloseClaim) at ClaimFileMenuItemSet.pcf: line 27, column 58
    function action_dest_5 () : pcf.api.Destination {
      return pcf.CloseClaimPopup.createDestination(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimFileMenuItemSet.pcf: line 13, column 41
    function initialValue_0 () : typekey.ValidationLevel[] {
      return gw.api.validation.ValidationUtil.getValidationLevelsInReverseOrder(new ValidationLevel[] {})
    }
    
    // 'value' attribute on MenuItemIterator at ClaimFileMenuItemSet.pcf: line 58, column 49
    function value_19 () : typekey.ValidationLevel[] {
      return validationLevels
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_Assign) at ClaimFileMenuItemSet.pcf: line 22, column 45
    function visible_1 () : java.lang.Boolean {
      return perm.Claim.assign(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_ReopenExposure) at ClaimFileMenuItemSet.pcf: line 42, column 101
    function visible_11 () : java.lang.Boolean {
      return CurrentExposure() != null and CurrentExposure().canReopen(User.util.CurrentUser)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_ClaimValidation) at ClaimFileMenuItemSet.pcf: line 54, column 46
    function visible_20 () : java.lang.Boolean {
      return perm.Claim.validate(Claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_CloseClaim) at ClaimFileMenuItemSet.pcf: line 27, column 58
    function visible_3 () : java.lang.Boolean {
      return Claim.canClose(User.util.CurrentUser)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_ExposureValidation) at ClaimFileMenuItemSet.pcf: line 96, column 91
    function visible_32 () : java.lang.Boolean {
      return CurrentExposure() != null and perm.Exposure.validate(CurrentExposure())
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_ClaimActions) at ClaimFileMenuItemSet.pcf: line 17, column 31
    function visible_33 () : java.lang.Boolean {
      return Claim != null
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_ReopenClaim) at ClaimFileMenuItemSet.pcf: line 32, column 59
    function visible_6 () : java.lang.Boolean {
      return Claim.canReopen(User.util.CurrentUser)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimMenuActions_CloseExposure) at ClaimFileMenuItemSet.pcf: line 37, column 100
    function visible_8 () : java.lang.Boolean {
      return CurrentExposure() != null and CurrentExposure().canClose(User.util.CurrentUser)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get validationLevels () : typekey.ValidationLevel[] {
      return getVariableValue("validationLevels", 0) as typekey.ValidationLevel[]
    }
    
    property set validationLevels ($arg :  typekey.ValidationLevel[]) {
      setVariableValue("validationLevels", 0, $arg)
    }
    
    
    function CurrentExposure() : Exposure {
            return gw.api.exposure.CurrentExposureHelper.getCurrentExposure();
          }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/ClaimFileMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimFileMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at ClaimFileMenuItemSet.pcf: line 76, column 50
    function action_21 () : void {
      gw.api.validation.ValidationUtil.validateClaimAndExposures(Claim, ValidationLevel)
    }
    
    // 'label' attribute on MenuItem (id=item) at ClaimFileMenuItemSet.pcf: line 76, column 50
    function label_22 () : java.lang.Object {
      return ValidationLevel.DisplayName
    }
    
    property get ValidationLevel () : typekey.ValidationLevel {
      return getIteratedValue(1) as typekey.ValidationLevel
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/ClaimFileMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimFileMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at ClaimFileMenuItemSet.pcf: line 90, column 50
    function action_25 () : void {
      gw.api.validation.ValidationUtil.validatePolicyForClaim(Claim, ValidationLevel)
    }
    
    // 'label' attribute on MenuItem (id=item) at ClaimFileMenuItemSet.pcf: line 90, column 50
    function label_26 () : java.lang.Object {
      return ValidationLevel.DisplayName
    }
    
    property get ValidationLevel () : typekey.ValidationLevel {
      return getIteratedValue(1) as typekey.ValidationLevel
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/ClaimFileMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimFileMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at ClaimFileMenuItemSet.pcf: line 104, column 50
    function action_29 () : void {
      gw.api.validation.ValidationUtil.validateExposureUnit(CurrentExposure(), ValidationLevel)
    }
    
    // 'label' attribute on MenuItem (id=item) at ClaimFileMenuItemSet.pcf: line 104, column 50
    function label_30 () : java.lang.Object {
      return ValidationLevel.DisplayName
    }
    
    property get ValidationLevel () : typekey.ValidationLevel {
      return getIteratedValue(1) as typekey.ValidationLevel
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/ClaimFileMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimFileMenuItemSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=item) at ClaimFileMenuItemSet.pcf: line 62, column 50
    function action_17 () : void {
      gw.api.validation.ValidationUtil.validateClaim(Claim, ValidationLevel)
    }
    
    // 'label' attribute on MenuItem (id=item) at ClaimFileMenuItemSet.pcf: line 62, column 50
    function label_18 () : java.lang.Object {
      return ValidationLevel.DisplayName
    }
    
    property get ValidationLevel () : typekey.ValidationLevel {
      return getIteratedValue(1) as typekey.ValidationLevel
    }
    
    
  }
  
  
}