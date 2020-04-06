package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncidentCV.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotDwellingIncidentCV_800Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncidentCV.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotDwellingIncidentCVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 256, column 25
    function def_onEnter_101 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 256, column 25
    function def_onEnter_103 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_700) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 256, column 25
    function def_onEnter_105 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_800) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 256, column 25
    function def_onEnter_107 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default) : void {
      def.onEnter(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 265, column 21
    function def_onEnter_110 (def :  pcf.ClaimSnapshotIncidentAssessDV_600) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 265, column 21
    function def_onEnter_112 (def :  pcf.ClaimSnapshotIncidentAssessDV_700) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 265, column 21
    function def_onEnter_114 (def :  pcf.ClaimSnapshotIncidentAssessDV_800) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 265, column 21
    function def_onEnter_116 (def :  pcf.ClaimSnapshotIncidentAssessDV_default) : void {
      def.onEnter(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 256, column 25
    function def_refreshVariables_102 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_600) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 256, column 25
    function def_refreshVariables_104 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_700) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 256, column 25
    function def_refreshVariables_106 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_800) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 256, column 25
    function def_refreshVariables_108 (def :  pcf.ClaimSnapshotIncidentRelatedExposuresPanelSet_default) : void {
      def.refreshVariables(claim, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 265, column 21
    function def_refreshVariables_111 (def :  pcf.ClaimSnapshotIncidentAssessDV_600) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 265, column 21
    function def_refreshVariables_113 (def :  pcf.ClaimSnapshotIncidentAssessDV_700) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 265, column 21
    function def_refreshVariables_115 (def :  pcf.ClaimSnapshotIncidentAssessDV_800) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 265, column 21
    function def_refreshVariables_117 (def :  pcf.ClaimSnapshotIncidentAssessDV_default) : void {
      def.refreshVariables(claim, incident, snapshot)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotDwellingIncidentCV.800.pcf: line 20, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return incidentParam
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotDwellingIncidentCV.800.pcf: line 256, column 25
    function mode_109 () : java.lang.Object {
      return 800
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDwellingIncidentCV.800.pcf: line 93, column 58
    function sortValue_19 (roomDamage :  dynamic.Dynamic) : java.lang.Object {
      return roomDamage.RoomType
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 36, column 48
    function valueRoot_3 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on TextInput (id=Address) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 149, column 48
    function valueRoot_51 () : java.lang.Object {
      return incident.Claim.LossLocation
    }
    
    // 'value' attribute on TextInput (id=PropertyDescription) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 36, column 48
    function value_1 () : dynamic.Dynamic {
      return incident.PropertyDesc
    }
    
    // 'value' attribute on TextInput (id=DamageTypesLabel) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 58, column 50
    function value_10 () : dynamic.Dynamic {
      return null
    }
    
    // 'value' attribute on InputIterator (id=DamageTypesIterator) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 63, column 79
    function value_18 () : gw.api.claim.HomeownersHelper.DamageManager[] {
      return gw.api.claim.HomeownersHelper.getDamages(claim).where( \ d -> snapshot[d.ClaimProperty.Name] != null)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotDwellingIncidentCV.800.pcf: line 78, column 53
    function value_26 () : dynamic.Dynamic {
      return incident.DwellingRoomDamages
    }
    
    // 'value' attribute on TextInput (id=MaterialsDamaged) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 102, column 50
    function value_27 () : dynamic.Dynamic {
      return incident.MaterialsDamaged
    }
    
    // 'value' attribute on TextInput (id=DamagedAreaSize) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 107, column 50
    function value_30 () : dynamic.Dynamic {
      return incident.DamagedAreaSize
    }
    
    // 'value' attribute on TextInput (id=EstimatedReceived) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 116, column 48
    function value_33 () : dynamic.Dynamic {
      return incident.EstimatesReceived
    }
    
    // 'value' attribute on TextInput (id=EstimateCost) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 122, column 81
    function value_37 () : dynamic.Dynamic {
      return incident.EstRepairCost
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 44, column 48
    function value_4 () : dynamic.Dynamic {
      return incident.Description
    }
    
    // 'value' attribute on TextInput (id=EstimateTime) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 128, column 81
    function value_42 () : dynamic.Dynamic {
      return incident.EstRepairTime
    }
    
    // 'value' attribute on TextInput (id=AlreadyRepaired) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 133, column 48
    function value_46 () : dynamic.Dynamic {
      return incident.AlreadyRepaired
    }
    
    // 'value' attribute on TextInput (id=Address) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 149, column 48
    function value_49 () : dynamic.Dynamic {
      return incident.Claim.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_ClassType) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 158, column 50
    function value_52 () : dynamic.Dynamic {
      return incident.ClassType
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_NumStories) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 164, column 50
    function value_55 () : dynamic.Dynamic {
      return incident.NumStories
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_RoofMaterial) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 169, column 50
    function value_58 () : dynamic.Dynamic {
      return incident.RoofMaterial
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_ExtWallMat) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 174, column 50
    function value_61 () : dynamic.Dynamic {
      return incident.ExtWallMat
    }
    
    // 'value' attribute on DateInput (id=YearBuilt) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 180, column 50
    function value_64 () : dynamic.Dynamic {
      return incident.YearBuilt
    }
    
    // 'value' attribute on TextInput (id=PropertySize) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 186, column 50
    function value_67 () : dynamic.Dynamic {
      return incident.PropertySize
    }
    
    // 'value' attribute on TextInput (id=LossEstimate) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 49, column 48
    function value_7 () : dynamic.Dynamic {
      return incident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=OccupancyType) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 194, column 50
    function value_70 () : dynamic.Dynamic {
      return incident.OccupancyType
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_LossArea) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 199, column 50
    function value_73 () : dynamic.Dynamic {
      return incident.LossArea
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_NumberOfPeopleOnPolicy) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 204, column 50
    function value_76 () : dynamic.Dynamic {
      return incident.NumberOfPeopleOnPolicy
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_YearsInHome) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 209, column 50
    function value_79 () : dynamic.Dynamic {
      return incident.YearsInHome
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_SprinklerType) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 219, column 52
    function value_82 () : dynamic.Dynamic {
      return incident.SprinklerType
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_NumSprinkler) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 225, column 52
    function value_85 () : dynamic.Dynamic {
      return incident.NumSprinkler
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_NumSprinkOper) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 231, column 52
    function value_88 () : dynamic.Dynamic {
      return incident.NumSprinkOper
    }
    
    // 'value' attribute on TextInput (id=DwellingAttribute_SprinkRetServ) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 236, column 52
    function value_91 () : dynamic.Dynamic {
      return incident.SprinkRetServ
    }
    
    // 'value' attribute on TextInput (id=LossLocation_Mold) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 243, column 50
    function value_95 () : dynamic.Dynamic {
      return incident.MoldInvolved
    }
    
    // 'value' attribute on TextInput (id=LossLocation_Hazard) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 248, column 50
    function value_98 () : dynamic.Dynamic {
      return incident.HazardInvolved
    }
    
    // 'visible' attribute on TextInput (id=EstimateCost) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 122, column 81
    function visible_36 () : java.lang.Boolean {
      return incident.EstimatesReceived.Code == "yes"
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotDwellingIncidentCV.800.pcf: line 211, column 81
    function visible_94 () : java.lang.Boolean {
      return incident.Claim.LossCause.Code == "fire"
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncidentCV.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotDwellingIncidentCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=NumberOfRooms) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 87, column 47
    function valueRoot_22 () : java.lang.Object {
      return roomDamage
    }
    
    // 'value' attribute on TextCell (id=NumberOfRooms) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 87, column 47
    function value_20 () : dynamic.Dynamic {
      return roomDamage.NumberOfRooms
    }
    
    // 'value' attribute on TextCell (id=RoomType) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 93, column 58
    function value_23 () : dynamic.Dynamic {
      return roomDamage.RoomType
    }
    
    property get roomDamage () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncidentCV.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotDwellingIncidentCVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'valueLabel' attribute on CheckBoxInput (id=Damage) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 68, column 49
    function valueLabel_17 () : java.lang.Object {
      return damage.Name
    }
    
    // 'value' attribute on CheckBoxInput (id=Damage) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 68, column 49
    function valueRoot_16 () : java.lang.Object {
      return damage
    }
    
    // 'visible' attribute on CheckBoxInput (id=Damage) at ClaimSnapshotDwellingIncidentCV.800.pcf: line 68, column 49
    function visible_12 () : java.lang.Boolean {
      return damage.Present
    }
    
    property get damage () : gw.api.claim.HomeownersHelper.DamageManager {
      return getIteratedValue(1) as gw.api.claim.HomeownersHelper.DamageManager
    }
    
    
  }
  
  
}