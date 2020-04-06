package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotDwellingIncidentCV.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotDwellingIncidentCV_700Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotDwellingIncidentCV.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotDwellingIncidentCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 286, column 25
    function def_onEnter_109 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 286, column 25
    function def_onEnter_111 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_700) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 286, column 25
    function def_onEnter_113 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_800) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 286, column 25
    function def_onEnter_115 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 295, column 21
    function def_onEnter_118 (def :  pcf.ClaimSnapshotIncidentAssessDV_600) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 295, column 21
    function def_onEnter_120 (def :  pcf.ClaimSnapshotIncidentAssessDV_700) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 295, column 21
    function def_onEnter_122 (def :  pcf.ClaimSnapshotIncidentAssessDV_800) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 295, column 21
    function def_onEnter_124 (def :  pcf.ClaimSnapshotIncidentAssessDV_default) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 286, column 25
    function def_refreshVariables_110 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 286, column 25
    function def_refreshVariables_112 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_700) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 286, column 25
    function def_refreshVariables_114 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_800) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 286, column 25
    function def_refreshVariables_116 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 295, column 21
    function def_refreshVariables_119 (def :  pcf.ClaimSnapshotIncidentAssessDV_600) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 295, column 21
    function def_refreshVariables_121 (def :  pcf.ClaimSnapshotIncidentAssessDV_700) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 295, column 21
    function def_refreshVariables_123 (def :  pcf.ClaimSnapshotIncidentAssessDV_800) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 295, column 21
    function def_refreshVariables_125 (def :  pcf.ClaimSnapshotIncidentAssessDV_default) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotDwellingIncidentCV.700.pcf: line 20, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return incidentParam
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.700.pcf: line 286, column 25
    function mode_117 () : java.lang.Object {
      return 700
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDwellingIncidentCV.700.pcf: line 93, column 58
    function sortValue_19 (roomDamage :  dynamic.Dynamic) : java.lang.Object {
      return roomDamage.RoomType
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 36, column 48
    function valueRoot_3 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on TextInput (id=EMSVendor) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 152, column 50
    function valueRoot_51 () : java.lang.Object {
      return incident.ems
    }
    
    // 'value' attribute on TextInput (id=EMSVendor) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 163, column 50
    function valueRoot_55 () : java.lang.Object {
      return incident.debrisremoval
    }
    
    // 'value' attribute on TextInput (id=Address) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 179, column 48
    function valueRoot_59 () : java.lang.Object {
      return incident.Claim.LossLocation
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 36, column 48
    function value_1 () : dynamic.Dynamic {
      return incident.PropertyDesc
    }
    
    // 'value' attribute on TextInput (id=DamageTypesLabel) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 58, column 50
    function value_10 () : dynamic.Dynamic {
      return null
    }
    
    // 'value' attribute on TextInput (id=LossLocation_Mold) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 273, column 50
    function value_103 () : dynamic.Dynamic {
      return incident.MoldInvolved
    }
    
    // 'value' attribute on TextInput (id=LossLocation_Hazard) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 278, column 50
    function value_106 () : dynamic.Dynamic {
      return incident.HazardInvolved
    }
    
    // 'value' attribute on InputIterator (id=DamageTypesIterator) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 63, column 79
    function value_18 () : gw.api.claim.HomeownersHelper.DamageManager[] {
      return gw.api.claim.HomeownersHelper.getDamages(claim).where( \ d -> snapshot[d.ClaimProperty.Name] != null)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDwellingIncidentCV.700.pcf: line 78, column 53
    function value_26 () : dynamic.Dynamic {
      return incident.DwellingRoomDamages
    }
    
    // 'value' attribute on TextInput (id=MaterialsDamaged) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 102, column 50
    function value_27 () : dynamic.Dynamic {
      return incident.MaterialsDamaged
    }
    
    // 'value' attribute on TextInput (id=DamagedAreaSize) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 107, column 50
    function value_30 () : dynamic.Dynamic {
      return incident.DamagedAreaSize
    }
    
    // 'value' attribute on TextInput (id=EstimatedReceived) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 116, column 48
    function value_33 () : dynamic.Dynamic {
      return incident.EstimatesReceived
    }
    
    // 'value' attribute on TextInput (id=EstimateCost) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 122, column 81
    function value_37 () : dynamic.Dynamic {
      return incident.EstRepairCost
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 44, column 48
    function value_4 () : dynamic.Dynamic {
      return incident.Description
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 128, column 81
    function value_42 () : dynamic.Dynamic {
      return incident.EstRepairTime
    }
    
    // 'value' attribute on TextInput (id=AlreadyRepaired) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 133, column 48
    function value_46 () : dynamic.Dynamic {
      return incident.AlreadyRepaired
    }
    
    // 'value' attribute on TextInput (id=EMSVendor) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 152, column 50
    function value_49 () : dynamic.Dynamic {
      return incident.ems.DisplayName
    }
    
    // 'value' attribute on TextInput (id=EMSVendor) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 163, column 50
    function value_53 () : dynamic.Dynamic {
      return incident.debrisremoval.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Address) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 179, column 48
    function value_57 () : dynamic.Dynamic {
      return incident.Claim.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_ClassType) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 188, column 50
    function value_60 () : dynamic.Dynamic {
      return incident.ClassType
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_NumStories) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 194, column 50
    function value_63 () : dynamic.Dynamic {
      return incident.NumStories
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_RoofMaterial) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 199, column 50
    function value_66 () : dynamic.Dynamic {
      return incident.RoofMaterial
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_ExtWallMat) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 204, column 50
    function value_69 () : dynamic.Dynamic {
      return incident.ExtWallMat
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 49, column 48
    function value_7 () : dynamic.Dynamic {
      return incident.LossEstimate
    }
    
    // 'value' attribute on DateInput (id=YearBuilt) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 210, column 50
    function value_72 () : dynamic.Dynamic {
      return incident.YearBuilt
    }
    
    // 'value' attribute on TextInput (id=PropertySize) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 216, column 50
    function value_75 () : dynamic.Dynamic {
      return incident.PropertySize
    }
    
    // 'value' attribute on TextInput (id=OccupancyType) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 224, column 50
    function value_78 () : dynamic.Dynamic {
      return incident.OccupancyType
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_LossArea) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 229, column 50
    function value_81 () : dynamic.Dynamic {
      return incident.LossArea
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_NumberOfPeopleOnPolicy) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 234, column 50
    function value_84 () : dynamic.Dynamic {
      return incident.NumberOfPeopleOnPolicy
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_YearsInHome) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 239, column 50
    function value_87 () : dynamic.Dynamic {
      return incident.YearsInHome
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_SprinklerType) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 249, column 52
    function value_90 () : dynamic.Dynamic {
      return incident.SprinklerType
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_NumSprinkler) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 255, column 52
    function value_93 () : dynamic.Dynamic {
      return incident.NumSprinkler
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_NumSprinkOper) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 261, column 52
    function value_96 () : dynamic.Dynamic {
      return incident.NumSprinkOper
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_SprinkRetServ) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 266, column 52
    function value_99 () : dynamic.Dynamic {
      return incident.SprinkRetServ
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotDwellingIncidentCV.700.pcf: line 241, column 81
    function visible_102 () : java.lang.Boolean {
      return incident.Claim.LossCause.Code == "fire"
    }
    
    // 'visible' attribute on TextInput (id=EstimateCost) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 122, column 81
    function visible_36 () : java.lang.Boolean {
      return incident.EstimatesReceived.Code == "yes"
    }
    
    // 'visible' attribute on InputSet (id=EMSInputSet) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 145, column 50
    function visible_52 () : java.lang.Boolean {
      return incident.ems != null
    }
    
    // 'visible' attribute on InputSet (id=DebrisRemovalInputSet) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 156, column 60
    function visible_56 () : java.lang.Boolean {
      return incident.debrisremoval != null
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get incident () : dynamic.Dynamic {
      return getVariableValue("incident", 0) as dynamic.Dynamic
    }
    
    property set incident ($arg :  dynamic.Dynamic) {
      setVariableValue("incident", 0, $arg)
    }
    
    property get incidentParam () : dynamic.Dynamic {
      return getRequireValue("incidentParam", 0) as dynamic.Dynamic
    }
    
    property set incidentParam ($arg :  dynamic.Dynamic) {
      setRequireValue("incidentParam", 0, $arg)
    }
    
    property get snapshot () : dynamic.Dynamic {
      return getRequireValue("snapshot", 0) as dynamic.Dynamic
    }
    
    property set snapshot ($arg :  dynamic.Dynamic) {
      setRequireValue("snapshot", 0, $arg)
    }
    
    function approvedTotal(itemLine : dynamic.Dynamic) : gw.api.financials.CurrencyAmount {
      var TotalOfApproved: gw.api.financials.CurrencyAmount = gw.api.util.CCCurrencyUtil.getStrict(java.math.BigDecimal.ZERO, claim.Currency)
      for (aline in itemLine) {
        if (aline.Action == "approve") {
          if (aline.EstimateAmount != null) {
            TotalOfApproved = TotalOfApproved + (aline.EstimateAmount as gw.api.financials.CurrencyAmount)
          }
        }
      }
      return TotalOfApproved;
    }
    
    function reviewTotal(itemLine : dynamic.Dynamic) : gw.api.financials.CurrencyAmount {
      var TotalOfInReview: gw.api.financials.CurrencyAmount = gw.api.util.CCCurrencyUtil.getStrict(java.math.BigDecimal.ZERO, claim.Currency)
      for (aline in itemLine) {
        if (aline.Action == "Review" or aline.Action == null) {
          if (aline.EstimateAmount != null) {
            TotalOfInReview = TotalOfInReview + (aline.EstimateAmount as gw.api.financials.CurrencyAmount)
          }
        }
      }
      return TotalOfInReview;
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotDwellingIncidentCV.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotDwellingIncidentCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=NumberOfRooms) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 87, column 47
    function valueRoot_22 () : java.lang.Object {
      return roomDamage
    }
    
    // 'value' attribute on TextCell (id=NumberOfRooms) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 87, column 47
    function value_20 () : dynamic.Dynamic {
      return roomDamage.NumberOfRooms
    }
    
    // 'value' attribute on TextCell (id=RoomType) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 93, column 58
    function value_23 () : dynamic.Dynamic {
      return roomDamage.RoomType
    }
    
    property get roomDamage () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotDwellingIncidentCV.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotDwellingIncidentCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'valueLabel' attribute on CheckBoxInput (id=Damage) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 68, column 49
    function valueLabel_17 () : java.lang.Object {
      return damage.Name
    }
    
    // 'value' attribute on CheckBoxInput (id=Damage) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 68, column 49
    function valueRoot_16 () : java.lang.Object {
      return damage
    }
    
    // 'visible' attribute on CheckBoxInput (id=Damage) at ClaimSnapshotDwellingIncidentCV.700.pcf: line 68, column 49
    function visible_12 () : java.lang.Boolean {
      return damage.Present
    }
    
    property get damage () : gw.api.claim.HomeownersHelper.DamageManager {
      return getIteratedValue(1) as gw.api.claim.HomeownersHelper.DamageManager
    }
    
    
  }
  
  
}