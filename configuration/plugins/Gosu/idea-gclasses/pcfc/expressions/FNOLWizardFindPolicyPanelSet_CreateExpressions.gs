package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.cc.claim.NewClaimPolicyDescription
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizardFindPolicyPanelSet_CreateExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Create.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizardFindPolicyPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_onEnter_45 (def :  pcf.NewClaimPolicyGeneralPanelSet_Auto) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_onEnter_47 (def :  pcf.NewClaimPolicyGeneralPanelSet_Gl) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_onEnter_49 (def :  pcf.NewClaimPolicyGeneralPanelSet_Pr) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_onEnter_51 (def :  pcf.NewClaimPolicyGeneralPanelSet_Trav) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_onEnter_53 (def :  pcf.NewClaimPolicyGeneralPanelSet_Wc) : void {
      def.onEnter(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 101, column 129
    function def_onEnter_60 (def :  pcf.NewClaimVehiclesLV) : void {
      def.onEnter(Claim.Policy.Vehicles, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 113, column 126
    function def_onEnter_65 (def :  pcf.PolicyTripLV) : void {
      def.onEnter( Claim, Wizard )
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 126, column 182
    function def_onEnter_71 (def :  pcf.PolicyLocationLDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 139, column 133
    function def_onEnter_76 (def :  pcf.NewClaimEndorsementsLV) : void {
      def.onEnter(Claim.Policy.Endorsements, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 151, column 130
    function def_onEnter_81 (def :  pcf.NewClaimStatCodesLV) : void {
      def.onEnter(Claim.Policy.StatCodes, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_refreshVariables_46 (def :  pcf.NewClaimPolicyGeneralPanelSet_Auto) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_refreshVariables_48 (def :  pcf.NewClaimPolicyGeneralPanelSet_Gl) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_refreshVariables_50 (def :  pcf.NewClaimPolicyGeneralPanelSet_Pr) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_refreshVariables_52 (def :  pcf.NewClaimPolicyGeneralPanelSet_Trav) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function def_refreshVariables_54 (def :  pcf.NewClaimPolicyGeneralPanelSet_Wc) : void {
      def.refreshVariables(Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 101, column 129
    function def_refreshVariables_61 (def :  pcf.NewClaimVehiclesLV) : void {
      def.refreshVariables(Claim.Policy.Vehicles, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 113, column 126
    function def_refreshVariables_66 (def :  pcf.PolicyTripLV) : void {
      def.refreshVariables( Claim, Wizard )
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 126, column 182
    function def_refreshVariables_72 (def :  pcf.PolicyLocationLDV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 139, column 133
    function def_refreshVariables_77 (def :  pcf.NewClaimEndorsementsLV) : void {
      def.refreshVariables(Claim.Policy.Endorsements, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 151, column 130
    function def_refreshVariables_82 (def :  pcf.NewClaimStatCodesLV) : void {
      def.refreshVariables(Claim.Policy.StatCodes, Claim.Policy)
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 39, column 58
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 46, column 52
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      newPolicy.UnverifiedPolicyNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 58, column 42
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      newPolicy.UnverifiedPolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on RangeRadioInput (id=ClaimLossType) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 73, column 49
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.ClaimMode = (__VALUE_TO_SET as gw.api.claim.NewClaimMode)
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 84, column 43
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimLossDate.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Claim_lossTime) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 91, column 43
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimLossDate.LossTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'editable' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function editable_44 () : java.lang.Boolean {
      return !Claim.Policy.Verified
    }
    
    // 'initialValue' attribute on Variable at FNOLWizardFindPolicyPanelSet.Create.pcf: line 11, column 53
    function initialValue_0 () : gw.cc.claim.NewClaimPolicyDescription {
      return initNewPolicy()
    }
    
    // 'initialValue' attribute on Variable at FNOLWizardFindPolicyPanelSet.Create.pcf: line 21, column 29
    function initialValue_1 () : java.util.Set {
      return Claim.Policy != null ? gw.api.policy.PolicyTabUtil.getTabSet(Claim.Policy) : null
    }
    
    // 'initialValue' attribute on Variable at FNOLWizardFindPolicyPanelSet.Create.pcf: line 25, column 43
    function initialValue_2 () : gw.api.claim.NewClaimMode[] {
      return initClaimModeArray()
    }
    
    // 'initialValue' attribute on Variable at FNOLWizardFindPolicyPanelSet.Create.pcf: line 29, column 47
    function initialValue_3 () : gw.api.claim.ClaimLossDateProxy {
      return new gw.api.claim.ClaimLossDateProxy(Claim)
    }
    
    // 'mode' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 98, column 30
    function mode_55 () : java.lang.Object {
      return Claim.LossType
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizardFindPolicyPanelSet.Create.pcf: line 48, column 71
    function onChange_12 () : void {
      setPolicy(CurrentLocation as pcf.api.Wizard);
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizardFindPolicyPanelSet.Create.pcf: line 60, column 71
    function onChange_17 () : void {
      setPolicy(CurrentLocation as pcf.api.Wizard);
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizardFindPolicyPanelSet.Create.pcf: line 75, column 101
    function onChange_23 () : void {
      setPolicy(CurrentLocation as pcf.api.Wizard);setClaimFirstAndFinalStatus();
    }
    
    // 'showConfirmMessage' attribute on TypeKeyInput (id=Type) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 58, column 42
    function showConfirmMessage_19 () : java.lang.Boolean {
      return Claim.Policy.PolicyType != null
    }
    
    // 'showConfirmMessage' attribute on RangeRadioInput (id=ClaimLossType) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 73, column 49
    function showConfirmMessage_25 () : java.lang.Boolean {
      return Claim.Policy.PolicyType != null and Claim.LossType != Wizard.LossType 
    }
    
    // 'title' attribute on TitleBar at FNOLWizardFindPolicyPanelSet.Create.pcf: line 103, column 302
    function title_56 () : java.lang.String {
      return  (!Claim.Policy.Verified or (Claim.Policy.TotalVehicles == Claim.Policy.Vehicles.length)) ? DisplayKey.get("JSP.NewClaimPolicyDetails.Policy.Vehicles") as String : DisplayKey.get("JSP.NewClaimPolicyDetails.Policy.Vehicles.PartialList", Claim.Policy.TotalVehicles)
    }
    
    // 'title' attribute on TitleBar at FNOLWizardFindPolicyPanelSet.Create.pcf: line 129, column 307
    function title_67 () : java.lang.String {
      return !Claim.Policy.Verified or (Claim.Policy.TotalProperties == Claim.Policy.Properties.length) ? DisplayKey.get("JSP.NewClaimPolicyDetails.Policy.Locations") as String : DisplayKey.get("JSP.NewClaimPolicyDetails.Policy.Locations.PartialList", Claim.Policy.TotalProperties)
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 84, column 43
    function validationExpression_32 () : java.lang.Object {
      return Claim.validateLossDate()
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_lossTime) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 91, column 43
    function validationExpression_38 () : java.lang.Object {
      return Claim.LossDate != null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 39, column 58
    function validationExpression_4 () : java.lang.Object {
      return !Claim.DuplicateClaimNumber ? null : DisplayKey.get("Java.NewClaimWizard.Error.ClaimNumberNotUnique", Claim.ClaimNumber)
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimLossType) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 73, column 49
    function valueRange_29 () : java.lang.Object {
      return claimModeArray
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 39, column 58
    function valueRoot_11 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 46, column 52
    function valueRoot_16 () : java.lang.Object {
      return newPolicy
    }
    
    // 'value' attribute on RangeRadioInput (id=ClaimLossType) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 73, column 49
    function valueRoot_28 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 84, column 43
    function valueRoot_37 () : java.lang.Object {
      return claimLossDate
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 46, column 52
    function value_13 () : java.lang.String {
      return newPolicy.UnverifiedPolicyNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 58, column 42
    function value_18 () : typekey.PolicyType {
      return newPolicy.UnverifiedPolicyType
    }
    
    // 'value' attribute on RangeRadioInput (id=ClaimLossType) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 73, column 49
    function value_24 () : gw.api.claim.NewClaimMode {
      return Wizard.ClaimMode
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 84, column 43
    function value_33 () : java.util.Date {
      return claimLossDate.LossDate
    }
    
    // 'value' attribute on DateInput (id=Claim_lossTime) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 91, column 43
    function value_39 () : java.util.Date {
      return claimLossDate.LossTime
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 39, column 58
    function value_6 () : java.lang.String {
      return Claim.ClaimNumber
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimLossType) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 73, column 49
    function verifyValueRangeIsAllowedType_30 ($$arg :  gw.api.claim.NewClaimMode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimLossType) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 73, column 49
    function verifyValueRangeIsAllowedType_30 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimLossType) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 73, column 49
    function verifyValueRange_31 () : void {
      var __valueRangeArg = claimModeArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_30(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=ClaimNumber2) at FNOLWizardFindPolicyPanelSet.Create.pcf: line 39, column 58
    function visible_5 () : java.lang.Boolean {
      return !Claim.ClaimNumberGenerationEnabled
    }
    
    // 'addVisible' attribute on IteratorButtons at FNOLWizardFindPolicyPanelSet.Create.pcf: line 108, column 52
    function visible_57 () : java.lang.Boolean {
      return  !Claim.Policy.Verified and perm.Policy.edit(Claim)
    }
    
    // 'removeVisible' attribute on IteratorButtons at FNOLWizardFindPolicyPanelSet.Create.pcf: line 108, column 52
    function visible_58 () : java.lang.Boolean {
      return perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 101, column 129
    function visible_59 () : java.lang.Boolean {
      return policyTabSet != null && policyTabSet.contains("Vehicles") && allRequiredFieldsExist()
    }
    
    // 'visible' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 113, column 126
    function visible_64 () : java.lang.Boolean {
      return policyTabSet != null && policyTabSet.contains("Trips") && allRequiredFieldsExist()
    }
    
    // 'visible' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 126, column 182
    function visible_70 () : java.lang.Boolean {
      return policyTabSet != null && (policyTabSet.contains("Properties") or policyTabSet.contains("Classcodes")) && allRequiredFieldsExist()
    }
    
    // 'visible' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 139, column 133
    function visible_75 () : java.lang.Boolean {
      return policyTabSet != null && policyTabSet.contains("Endorsements") && allRequiredFieldsExist()
    }
    
    // 'visible' attribute on PanelRef at FNOLWizardFindPolicyPanelSet.Create.pcf: line 151, column 130
    function visible_80 () : java.lang.Boolean {
      return policyTabSet != null && policyTabSet.contains("Statcodes") && allRequiredFieldsExist()
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get claimLossDate () : gw.api.claim.ClaimLossDateProxy {
      return getVariableValue("claimLossDate", 0) as gw.api.claim.ClaimLossDateProxy
    }
    
    property set claimLossDate ($arg :  gw.api.claim.ClaimLossDateProxy) {
      setVariableValue("claimLossDate", 0, $arg)
    }
    
    property get claimModeArray () : gw.api.claim.NewClaimMode[] {
      return getVariableValue("claimModeArray", 0) as gw.api.claim.NewClaimMode[]
    }
    
    property set claimModeArray ($arg :  gw.api.claim.NewClaimMode[]) {
      setVariableValue("claimModeArray", 0, $arg)
    }
    
    property get newPolicy () : gw.cc.claim.NewClaimPolicyDescription {
      return getVariableValue("newPolicy", 0) as gw.cc.claim.NewClaimPolicyDescription
    }
    
    property set newPolicy ($arg :  gw.cc.claim.NewClaimPolicyDescription) {
      setVariableValue("newPolicy", 0, $arg)
    }
    
    property get policyTabSet () : java.util.Set {
      return getVariableValue("policyTabSet", 0) as java.util.Set
    }
    
    property set policyTabSet ($arg :  java.util.Set) {
      setVariableValue("policyTabSet", 0, $arg)
    }
    
    
    function initNewPolicy() : NewClaimPolicyDescription {
      if (Wizard.PolicyDescription.UnverifiedPolicyType != null) {
        return Wizard.PolicyDescription
      }
      else {
        var policyDescription = Wizard.PolicyDescription
        var user: User = User.util.getCurrentUser()
        policyDescription.UnverifiedPolicyType = user.PolicyType
        return policyDescription
      }
    }
    
    function setClaimFirstAndFinalStatus() {  
      Claim.FirstAndFinal = ("AutoFirstAndFinal" == Wizard.ClaimMode.QuickClaimMode.Mode)
    }
    
    
    function getSelectedClaimMode(modeArray : gw.api.claim.NewClaimMode[]) : gw.api.claim.NewClaimMode {
      var result : gw.api.claim.NewClaimMode = null
      if ((modeArray != null) && (modeArray.length > 0)){
        result = modeArray[0]
        if (Wizard.ClaimMode != null){
          foreach (indivMode in modeArray){
            if (Wizard.ClaimMode == indivMode){
              result = Wizard.ClaimMode  
            }
          }      
        }
      }  
      return result
    }
    
    function initClaimModeArray() : gw.api.claim.NewClaimMode[] {
      var modeArray = Wizard.getAvailableClaimModes(newPolicy.UnverifiedPolicyType)
      var user: User = User.util.getCurrentUser()
      if ((user.LossType != null) && (Wizard.LossType == null)) {
        Wizard.setClaimMode(user.LossType, user.QuickClaim as String)
        if (newPolicy.UnverifiedPolicyType == null){
          var availablePolicyTypes = Wizard.getAvailablePolicyTypes()
          if ((availablePolicyTypes != null) && (availablePolicyTypes.length > 0)) {
            newPolicy.UnverifiedPolicyType = availablePolicyTypes[0]
            modeArray = Wizard.getAvailableClaimModes(newPolicy.UnverifiedPolicyType)
          }
          setPolicy(CurrentLocation as pcf.api.Wizard)
        }
      } else {
        Wizard.ClaimMode = getSelectedClaimMode(modeArray)
      }
      return modeArray
    }
    
    function allRequiredFieldsExist() : boolean {
      return newPolicy.UnverifiedPolicyNumber != null && newPolicy.UnverifiedPolicyType != null && Wizard.getLossType() != null
    }
    
    function hasLossTypeChanged() : boolean {
      return Claim.LossType != null and Wizard.LossType != Claim.LossType
    }
    
    function hasPolicyTypeChanged() : boolean {
      return newPolicy.UnverifiedPolicyType != null and newPolicy.UnverifiedPolicyType != Claim.Policy.PolicyType
    }
    
    function setPolicy(location : pcf.api.Wizard) {
      var policyChanged = false
      
      if (Claim.Policy != null and newPolicy.UnverifiedPolicyNumber != Claim.Policy.PolicyNumber) {
        Claim.Policy.PolicyNumber = newPolicy.UnverifiedPolicyNumber
      }
      
      if (hasPolicyTypeChanged()) {
        claimModeArray = initClaimModeArray()
        if (Claim.Policy != null) {
            Claim.Policy.removeAllRoles()
        }
        //If we're changing claim types, we're nuking all the claim contacts.
        policyChanged = true
      }     
      
        
      if (allRequiredFieldsExist()) {
        if (hasLossTypeChanged() or policyChanged) {
          //if the claim loss type has changed, then must reset the wizard by reentering the wizard.
          var lossDate = Claim.LossDate
          var policyType = newPolicy.UnverifiedPolicyType
          var policyNumber = newPolicy.UnverifiedPolicyNumber
          location.cancel()
          pcf.FNOLWizard.go(policyType, policyNumber, Wizard.ClaimMode, lossDate, Wizard.PageMode)
        }
        
        //when claimMode is changed, the losstype is not changed on claim yet, so must set the claim loss type before setting policy
        if (Claim.LossType == null or Wizard.LossType != Claim.LossType) {
          Claim.LossType = Wizard.LossType
          policyChanged = true
        }
        
        if (policyChanged) {
          newPolicy.setPolicyVerified(false)
          Wizard.PolicyDescription = newPolicy
          Wizard.setPolicy()
          if (Claim.Policy != null) {
            Claim.Policy.removeAllRoles()
          }
          policyTabSet = gw.api.policy.PolicyTabUtil.getTabSet(Claim.Policy)
        }
      }
    }
    
    
  }
  
  
}