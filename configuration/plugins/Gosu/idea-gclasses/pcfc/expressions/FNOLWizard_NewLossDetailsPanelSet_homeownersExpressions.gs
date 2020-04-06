package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_NewLossDetailsPanelSet_homeownersExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailViewPanelExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=EditIncident) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 308, column 55
    function action_149 () : void {
      incidentUIHelper.goToViewIncidentInFNOLWizard(incident)
    }
    
    // 'action' attribute on MenuItem (id=RemoveIncident) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 314, column 57
    function action_152 () : void {
      claim.removeFromIncidents(incident); gw.api.claim.FnolServiceRequestHelper.removeIncidentServiceRequests(incident, wizard)
    }
    
    // 'action' attribute on TextInput (id=Name) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 304, column 75
    function action_155 () : void {
      incidentUIHelper.goToViewIncidentInFNOLWizard(incident)
    }
    
    // 'confirmMessage' attribute on MenuItem (id=RemoveIncident) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 314, column 57
    function confirmMessage_153 () : java.lang.String {
      return incidentUIHelper.RemoveConfirmMsg
    }
    
    // 'icon' attribute on BooleanRadioInput (id=IncidentIcon) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 295, column 38
    function icon_147 () : java.lang.String {
      return incidentUIHelper.Icons.getPanelIcon(incident)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 287, column 53
    function initialValue_146 () : gw.api.claim.IncidentUIHelper {
      return wizard.HomeownersHelper.IncidentListUIHelper.getIncidentUIHelper(incident)
    }
    
    // 'label' attribute on MenuItem (id=EditIncident) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 308, column 55
    function label_150 () : java.lang.Object {
      return incidentUIHelper.EditLabel
    }
    
    // 'label' attribute on MenuItem (id=RemoveIncident) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 314, column 57
    function label_154 () : java.lang.Object {
      return incidentUIHelper.RemoveLabel
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 320, column 47
    function valueRoot_159 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on TextInput (id=Name) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 304, column 75
    function value_148 () : java.lang.String {
      return incidentUIHelper.getInstanceDisplayName(incident)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 320, column 47
    function value_157 () : java.lang.String {
      return incident.Description
    }
    
    // 'visible' attribute on MenuItem (id=RemoveIncident) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 314, column 57
    function visible_151 () : java.lang.Boolean {
      return (!incident.UsedByExposure)
    }
    
    property get incidentUIHelper () : gw.api.claim.IncidentUIHelper {
      return getVariableValue("incidentUIHelper", 2) as gw.api.claim.IncidentUIHelper
    }
    
    property set incidentUIHelper ($arg :  gw.api.claim.IncidentUIHelper) {
      setVariableValue("incidentUIHelper", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_NewLossDetailsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=AddInjuryButton) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 265, column 125
    function action_139 () : void {
      FNOLInjuryIncidentPopup.push(claim, null)
    }
    
    // 'action' attribute on ToolbarButton (id=AddPropertyDamageButton) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 270, column 133
    function action_142 () : void {
      NewFixedPropertyIncidentPopup.push(claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AddInjuryButton) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 265, column 125
    function action_dest_140 () : pcf.api.Destination {
      return pcf.FNOLInjuryIncidentPopup.createDestination(claim, null)
    }
    
    // 'action' attribute on ToolbarButton (id=AddPropertyDamageButton) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 270, column 133
    function action_dest_143 () : pcf.api.Destination {
      return pcf.NewFixedPropertyIncidentPopup.createDestination(claim)
    }
    
    // 'columns' attribute on Layout at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 276, column 25
    function columns_145 () : java.lang.Double {
      return 4
    }
    
    // 'def' attribute on ListViewInput (id=WitnessLV) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 343, column 31
    function def_onEnter_161 (def :  pcf.EditableWitnessesLV) : void {
      def.onEnter(claim.getClaimContactRolesByRole(ContactRole.TC_WITNESS), claim, ContactRole.TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 354, column 31
    function def_onEnter_163 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on ListViewInput (id=PoliceReportLV) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 366, column 31
    function def_onEnter_165 (def :  pcf.MetroReportsLV) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on InputSetRef (id=AddressDetailInputSetRef) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 103, column 84
    function def_onEnter_46 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(wizard.HomeownersHelper.getAddressesWithoutPrimaryLocation())
    }
    
    // 'def' attribute on PanelRef (id=FireDamageQuestionsPanelSet) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 123, column 50
    function def_onEnter_64 (def :  pcf.FireDamageQuestionsPanelSet) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef (id=WaterDamageQuestionsPanelSet) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 130, column 51
    function def_onEnter_67 (def :  pcf.WaterDamageQuestionsPanelSet) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 158, column 110
    function def_onEnter_75 (def :  pcf.EditableRoomsLV) : void {
      def.onEnter(wizard.HomeownersHelper.DwellingIncident)
    }
    
    // 'def' attribute on ListViewInput (id=WitnessLV) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 343, column 31
    function def_refreshVariables_162 (def :  pcf.EditableWitnessesLV) : void {
      def.refreshVariables(claim.getClaimContactRolesByRole(ContactRole.TC_WITNESS), claim, ContactRole.TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 354, column 31
    function def_refreshVariables_164 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on ListViewInput (id=PoliceReportLV) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 366, column 31
    function def_refreshVariables_166 (def :  pcf.MetroReportsLV) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on InputSetRef (id=AddressDetailInputSetRef) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 103, column 84
    function def_refreshVariables_47 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(wizard.HomeownersHelper.getAddressesWithoutPrimaryLocation())
    }
    
    // 'def' attribute on PanelRef (id=FireDamageQuestionsPanelSet) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 123, column 50
    function def_refreshVariables_65 (def :  pcf.FireDamageQuestionsPanelSet) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on PanelRef (id=WaterDamageQuestionsPanelSet) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 130, column 51
    function def_refreshVariables_68 (def :  pcf.WaterDamageQuestionsPanelSet) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on ListViewInput at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 158, column 110
    function def_refreshVariables_76 (def :  pcf.EditableRoomsLV) : void {
      def.refreshVariables(wizard.HomeownersHelper.DwellingIncident)
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherStructureEstimateReceived) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 203, column 96
    function defaultSetter_102 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.OtherStructureIncident.EstimatesReceivedBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherStructureAlreadyRepaired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 208, column 87
    function defaultSetter_106 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.OtherStructureIncident.AlreadyRepaired = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherStructureFencesDamaged) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 213, column 85
    function defaultSetter_110 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.OtherStructureIncident.FencesDamaged = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on InputGroup (id=OtherStructureInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 186, column 102
    function defaultSetter_114 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.OtherStructureIncidentPresent = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 37, column 41
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyContentsDamageDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 233, column 85
    function defaultSetter_121 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.PropertyContentsIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on InputGroup (id=PropertyContentsInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 221, column 104
    function defaultSetter_125 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.PropertyContentsIncidentPresent = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=LivingExpensesDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 251, column 83
    function defaultSetter_132 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.LivingExpensesIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on InputGroup (id=LivingExpensesInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 239, column 102
    function defaultSetter_136 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.LivingExpensesIncidentPresent = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 382, column 46
    function defaultSetter_169 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on RangeInput (id=ClaimPermissionRequired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 390, column 52
    function defaultSetter_173 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.PermissionRequired = (__VALUE_TO_SET as typekey.ClaimSecurityType)
    }
    
    // 'value' attribute on TypeKeyInput (id=LocationOfTheft) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 47, column 53
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.LocationOfTheft = (__VALUE_TO_SET as typekey.LocationOfTheft)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 23, column 38
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 53, column 41
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 65, column 42
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.SelectedDamageNames = (__VALUE_TO_SET as java.lang.String[])
    }
    
    // 'value' attribute on Choice (id=PrimaryLocationChoice) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 78, column 42
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.LocationChoice = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 112, column 43
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WeatherRelated) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 117, column 41
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.WeatherRelated = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=DwellingDamageDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 155, column 77
    function defaultSetter_73 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.DwellingIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=DwellingMaterialsDamaged) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 170, column 82
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.DwellingIncident.MaterialsDamaged = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=DwellingEstimateReceived) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 175, column 90
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.DwellingIncident.EstimatesReceivedBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=DwellingAlreadyRepaired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 180, column 81
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.DwellingIncident.AlreadyRepaired = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on InputGroup (id=DwellingInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 143, column 96
    function defaultSetter_91 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.DwellingIncidentPresent = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=OtherStructureDamageDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 198, column 83
    function defaultSetter_98 (__VALUE_TO_SET :  java.lang.Object) : void {
      wizard.HomeownersHelper.OtherStructureIncident.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'icon' attribute on InputGroup (id=OtherStructureInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 186, column 102
    function icon_116 () : java.lang.String {
      return gw.api.claim.HomeownersHelper.CHECKBOX_OTHER_STRUCTURES_ICON
    }
    
    // 'icon' attribute on InputGroup (id=PropertyContentsInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 221, column 104
    function icon_127 () : java.lang.String {
      return gw.api.claim.HomeownersHelper.CHECKBOX_PROPERTY_CONTENTS_ICON
    }
    
    // 'icon' attribute on InputGroup (id=LivingExpensesInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 239, column 102
    function icon_138 () : java.lang.String {
      return gw.api.claim.HomeownersHelper.CHECKBOX_LIVING_EXPENSES_ICON
    }
    
    // 'icon' attribute on ToolbarButton (id=AddInjuryButton) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 265, column 125
    function icon_141 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.INJURY.ButtonIcon
    }
    
    // 'icon' attribute on ToolbarButton (id=AddPropertyDamageButton) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 270, column 133
    function icon_144 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.PROPERTY_LIABILITY.ButtonIcon
    }
    
    // 'icon' attribute on InputGroup (id=DwellingInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 143, column 96
    function icon_93 () : java.lang.String {
      return gw.api.claim.HomeownersHelper.CHECKBOX_DWELLING_ICON
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 39, column 81
    function onChange_9 () : void {
      wizard.HomeownersHelper.setDamageAccordingToLossCause()
    }
    
    // 'optionIcon' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 65, column 42
    function optionIcon_28 (VALUE :  java.lang.String) : java.lang.String {
      return wizard.HomeownersHelper.getDamageManagerByPropertyName(VALUE).Icon
    }
    
    // 'optionLabel' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 65, column 42
    function optionLabel_29 (VALUE :  java.lang.String) : java.lang.String {
      return wizard.HomeownersHelper.getDamageManagerByPropertyName(VALUE).Name
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 30, column 35
    function validationExpression_4 () : java.lang.Object {
      return claim.LossDate == null || claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimPermissionRequired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 390, column 52
    function valueRange_175 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getAvailableTypes()
    }
    
    // 'valueRange' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 65, column 42
    function valueRange_30 () : java.lang.Object {
      return wizard.HomeownersHelper.DamageNames
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 112, column 43
    function valueRange_56 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyContentsDamageDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 233, column 85
    function valueRoot_122 () : java.lang.Object {
      return wizard.HomeownersHelper.PropertyContentsIncident
    }
    
    // 'value' attribute on TextAreaInput (id=LivingExpensesDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 251, column 83
    function valueRoot_133 () : java.lang.Object {
      return wizard.HomeownersHelper.LivingExpensesIncident
    }
    
    // 'value' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 65, column 42
    function valueRoot_27 () : java.lang.Object {
      return wizard.HomeownersHelper
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 23, column 38
    function valueRoot_3 () : java.lang.Object {
      return claim
    }
    
    // 'value' attribute on TextInput (id=PropertyAddress) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 87, column 73
    function valueRoot_37 () : java.lang.Object {
      return claim.Policy.PrimaryLocation.Address
    }
    
    // 'value' attribute on TextAreaInput (id=DwellingDamageDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 155, column 77
    function valueRoot_74 () : java.lang.Object {
      return wizard.HomeownersHelper.DwellingIncident
    }
    
    // 'value' attribute on TextAreaInput (id=OtherStructureDamageDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 198, column 83
    function valueRoot_99 () : java.lang.Object {
      return wizard.HomeownersHelper.OtherStructureIncident
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 23, column 38
    function value_0 () : java.lang.String {
      return claim.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 37, column 41
    function value_10 () : typekey.LossCause {
      return claim.LossCause
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherStructureEstimateReceived) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 203, column 96
    function value_100 () : java.lang.Boolean {
      return wizard.HomeownersHelper.OtherStructureIncident.EstimatesReceivedBoolean
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherStructureAlreadyRepaired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 208, column 87
    function value_104 () : java.lang.Boolean {
      return wizard.HomeownersHelper.OtherStructureIncident.AlreadyRepaired
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherStructureFencesDamaged) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 213, column 85
    function value_108 () : java.lang.Boolean {
      return wizard.HomeownersHelper.OtherStructureIncident.FencesDamaged
    }
    
    // 'value' attribute on CurrencyInput (id=PropertyContentsLimit) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 226, column 117
    function value_117 () : gw.api.financials.CurrencyAmount {
      return wizard.HomeownersHelper.getIncidentCoverageLimit(CoverageType.TC_HODW_PERSONAL_PROPERTY_HOE)
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyContentsDamageDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 233, column 85
    function value_119 () : java.lang.String {
      return wizard.HomeownersHelper.PropertyContentsIncident.Description
    }
    
    // 'value' attribute on CurrencyInput (id=LivingExpensesLimit) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 244, column 111
    function value_128 () : gw.api.financials.CurrencyAmount {
      return wizard.HomeownersHelper.getIncidentCoverageLimit(CoverageType.TC_HODW_LOSS_OF_USE_HOE)
    }
    
    // 'value' attribute on TextAreaInput (id=LivingExpensesDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 251, column 83
    function value_130 () : java.lang.String {
      return wizard.HomeownersHelper.LivingExpensesIncident.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=LocationOfTheft) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 47, column 53
    function value_15 () : typekey.LocationOfTheft {
      return claim.LocationOfTheft
    }
    
    // 'value' attribute on PanelIterator (id=IncidentIterator) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 281, column 41
    function value_160 () : entity.Incident[] {
      return wizard.HomeownersHelper.IncidentListUIHelper.SortedIncidents
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 382, column 46
    function value_167 () : typekey.FaultRating {
      return claim.FaultRating
    }
    
    // 'value' attribute on RangeInput (id=ClaimPermissionRequired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 390, column 52
    function value_171 () : typekey.ClaimSecurityType {
      return claim.PermissionRequired
    }
    
    // 'value' attribute on BooleanRadioInput (id=Status_IncidentReport) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 53, column 41
    function value_20 () : java.lang.Boolean {
      return claim.IncidentReport
    }
    
    // 'value' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 65, column 42
    function value_24 () : java.lang.String[] {
      return wizard.HomeownersHelper.SelectedDamageNames
    }
    
    // 'value' attribute on TextInput (id=PrimaryLocationChoiceLabel) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 83, column 45
    function value_33 () : java.lang.Object {
      return null
    }
    
    // 'value' attribute on TextInput (id=PropertyAddress) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 87, column 73
    function value_35 () : java.lang.String {
      return claim.Policy.PrimaryLocation.Address.DisplayName
    }
    
    // 'value' attribute on Choice (id=PrimaryLocationChoice) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 78, column 42
    function value_38 () : java.lang.String {
      return wizard.HomeownersHelper.LocationChoice
    }
    
    // 'value' attribute on Choice (id=PrimaryLocationChoice) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 78, column 42
    function value_41 () : java.lang.Object {
      return wizard.HomeownersHelper.LocationChoice
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 30, column 35
    function value_5 () : java.util.Date {
      return claim.LossDate
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 112, column 43
    function value_52 () : entity.Catastrophe {
      return claim.Catastrophe
    }
    
    // 'value' attribute on BooleanRadioInput (id=WeatherRelated) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 117, column 41
    function value_59 () : java.lang.Boolean {
      return claim.WeatherRelated
    }
    
    // 'value' attribute on CurrencyInput (id=DwellingLimit) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 148, column 112
    function value_69 () : gw.api.financials.CurrencyAmount {
      return wizard.HomeownersHelper.getIncidentCoverageLimit(CoverageType.TC_HODW_DWELLING_COV_HOE)
    }
    
    // 'value' attribute on TextAreaInput (id=DwellingDamageDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 155, column 77
    function value_71 () : java.lang.String {
      return wizard.HomeownersHelper.DwellingIncident.Description
    }
    
    // 'value' attribute on TextAreaInput (id=DwellingMaterialsDamaged) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 170, column 82
    function value_77 () : java.lang.String {
      return wizard.HomeownersHelper.DwellingIncident.MaterialsDamaged
    }
    
    // 'value' attribute on BooleanRadioInput (id=DwellingEstimateReceived) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 175, column 90
    function value_81 () : java.lang.Boolean {
      return wizard.HomeownersHelper.DwellingIncident.EstimatesReceivedBoolean
    }
    
    // 'value' attribute on BooleanRadioInput (id=DwellingAlreadyRepaired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 180, column 81
    function value_85 () : java.lang.Boolean {
      return wizard.HomeownersHelper.DwellingIncident.AlreadyRepaired
    }
    
    // 'value' attribute on CurrencyInput (id=OtherStructureLimit) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 191, column 116
    function value_94 () : gw.api.financials.CurrencyAmount {
      return wizard.HomeownersHelper.getIncidentCoverageLimit(CoverageType.TC_HODW_OTHER_STRUCTURES_HOE)
    }
    
    // 'value' attribute on TextAreaInput (id=OtherStructureDamageDescription) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 198, column 83
    function value_96 () : java.lang.String {
      return wizard.HomeownersHelper.OtherStructureIncident.Description
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimPermissionRequired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 390, column 52
    function verifyValueRangeIsAllowedType_176 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimPermissionRequired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 390, column 52
    function verifyValueRangeIsAllowedType_176 ($$arg :  typekey.ClaimSecurityType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 65, column 42
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 65, column 42
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 112, column 43
    function verifyValueRangeIsAllowedType_57 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 112, column 43
    function verifyValueRangeIsAllowedType_57 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 112, column 43
    function verifyValueRangeIsAllowedType_57 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimPermissionRequired) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 390, column 52
    function verifyValueRange_177 () : void {
      var __valueRangeArg = gw.api.claim.ClaimUtil.getAvailableTypes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_176(__valueRangeArg)
    }
    
    // 'valueRange' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 65, column 42
    function verifyValueRange_32 () : void {
      var __valueRangeArg = wizard.HomeownersHelper.DamageNames
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_31(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 112, column 43
    function verifyValueRange_58 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_57(__valueRangeArg)
    }
    
    // 'childrenVisible' attribute on InputGroup (id=OtherStructureInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 186, column 102
    function visible_112 () : java.lang.Boolean {
      return wizard.HomeownersHelper.OtherStructureIncidentPresent
    }
    
    // 'childrenVisible' attribute on InputGroup (id=PropertyContentsInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 221, column 104
    function visible_123 () : java.lang.Boolean {
      return wizard.HomeownersHelper.PropertyContentsIncidentPresent
    }
    
    // 'childrenVisible' attribute on InputGroup (id=LivingExpensesInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 239, column 102
    function visible_134 () : java.lang.Boolean {
      return wizard.HomeownersHelper.LivingExpensesIncidentPresent
    }
    
    // 'visible' attribute on TypeKeyInput (id=LocationOfTheft) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 47, column 53
    function visible_14 () : java.lang.Boolean {
      return claim.LossCause == TC_BURGLARY
    }
    
    // 'visible' attribute on InputSet at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 73, column 58
    function visible_42 () : java.lang.Boolean {
      return claim.Policy.PrimaryLocation != null
    }
    
    // 'visible' attribute on InputSetRef (id=AddressDetailInputSetRef) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 103, column 84
    function visible_45 () : java.lang.Boolean {
      return wizard.HomeownersHelper.LocationChoice == "other"
    }
    
    // 'visible' attribute on PanelRef (id=FireDamageQuestionsPanelSet) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 123, column 50
    function visible_63 () : java.lang.Boolean {
      return claim.PropertyFireDamage != null
    }
    
    // 'visible' attribute on PanelRef (id=WaterDamageQuestionsPanelSet) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 130, column 51
    function visible_66 () : java.lang.Boolean {
      return claim.PropertyWaterDamage != null
    }
    
    // 'childrenVisible' attribute on InputGroup (id=DwellingInputGroup) at FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf: line 143, column 96
    function visible_89 () : java.lang.Boolean {
      return wizard.HomeownersHelper.DwellingIncidentPresent
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("wizard", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsPanelSet.homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLWizard_NewLossDetailsPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get incident () : entity.Incident {
      return getIteratedValue(1) as entity.Incident
    }
    
    
  }
  
  
}