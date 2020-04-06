package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotGeneralPR600PanelSet_HomeownersExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneralPR600PanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 412, column 73
    function sortValue_137 (witness :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(witness.Contact)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 417, column 50
    function sortValue_138 (witness :  dynamic.Dynamic) : java.lang.Object {
      return witness.WitnessStatementInd
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 422, column 50
    function sortValue_139 (witness :  dynamic.Dynamic) : java.lang.Object {
      return witness.WitnessPerspective
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 444, column 50
    function sortValue_149 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.OfficialType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 449, column 50
    function sortValue_150 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.Name
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 454, column 50
    function sortValue_151 (Official :  dynamic.Dynamic) : java.lang.Object {
      return Official.ReportNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 476, column 50
    function sortValue_162 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.MetroReportType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 481, column 50
    function sortValue_163 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.Status
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 486, column 50
    function sortValue_164 (MetroReport :  dynamic.Dynamic) : java.lang.Object {
      return MetroReport.CreateTime
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 23, column 40
    function valueRoot_2 () : java.lang.Object {
      return snapshot
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 69, column 40
    function valueRoot_21 () : java.lang.Object {
      return snapshot.LossLocation
    }
    
    // 'value' attribute on TextInput (id=CatastropheNumber) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 74, column 40
    function valueRoot_24 () : java.lang.Object {
      return snapshot.Catastrophe
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 93, column 42
    function valueRoot_30 () : java.lang.Object {
      return snapshot.PropertyFireDamage
    }
    
    // 'value' attribute on TextInput (id=WaterSource) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 147, column 42
    function valueRoot_55 () : java.lang.Object {
      return snapshot.PropertyWaterDamage
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 23, column 40
    function value_0 () : dynamic.Dynamic {
      return snapshot.Description
    }
    
    // 'value' attribute on TextInput (id=LocationOfTheft) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 41, column 70
    function value_10 () : dynamic.Dynamic {
      return snapshot.LocationOfTheft
    }
    
    // 'value' attribute on PanelIterator (id=InjuryIncidentIterator) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 328, column 42
    function value_127 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(snapshot.Incidents, "InjuryIncident")
    }
    
    // 'value' attribute on PanelIterator (id=PropertyIncidentIterator) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 357, column 42
    function value_136 () : java.lang.Object[] {
      return util.Snapshot.filterBeansOfType(snapshot.Incidents, "FixedPropertyIncident")
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncidentReport) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 46, column 40
    function value_14 () : dynamic.Dynamic {
      return snapshot.IncidentReport
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 407, column 45
    function value_148 () : dynamic.Dynamic {
      return util.Snapshot.getClaimContactRolesByRole(snapshot, "Witness")
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 438, column 45
    function value_161 () : dynamic.Dynamic {
      return snapshot.Officials
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 470, column 45
    function value_174 () : dynamic.Dynamic {
      return snapshot.MetroReports
    }
    
    // 'value' attribute on TextInput (id=Notification_Fault) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 498, column 41
    function value_175 () : dynamic.Dynamic {
      return snapshot.FaultRating
    }
    
    // 'value' attribute on TextInput (id=ClaimPermissionRequired) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 505, column 42
    function value_178 () : dynamic.Dynamic {
      return snapshot.PermissionRequired
    }
    
    // 'value' attribute on InputIterator (id=DamageTypeChooser) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 54, column 69
    function value_18 () : gw.api.claim.HomeownersHelper.DamageManager[] {
      return gw.api.claim.HomeownersHelper.getDamages(claim).where( \ d -> snapshot[d.ClaimProperty.Name] != null)
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 69, column 40
    function value_19 () : dynamic.Dynamic {
      return snapshot.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=CatastropheNumber) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 74, column 40
    function value_22 () : dynamic.Dynamic {
      return snapshot.Catastrophe.DisplayName
    }
    
    // 'value' attribute on BooleanRadioInput (id=WeatherRelated) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 79, column 40
    function value_25 () : dynamic.Dynamic {
      return snapshot.WeatherRelated
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 93, column 42
    function value_28 () : dynamic.Dynamic {
      return snapshot.PropertyFireDamage.Arson
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 30, column 40
    function value_3 () : dynamic.Dynamic {
      return snapshot.LossDate
    }
    
    // 'value' attribute on TextAreaInput (id=FireSource) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 99, column 42
    function value_31 () : dynamic.Dynamic {
      return snapshot.PropertyFireDamage.FireSource
    }
    
    // 'value' attribute on TextAreaInput (id=HowWasFireDiscovered) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 105, column 42
    function value_34 () : dynamic.Dynamic {
      return snapshot.PropertyFireDamage.HowWasFireDiscovered
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireDeptResponded) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 110, column 42
    function value_37 () : dynamic.Dynamic {
      return snapshot.PropertyFireDamage.FireDeptResponded
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsAnyoneInjured) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 117, column 42
    function value_40 () : dynamic.Dynamic {
      return snapshot.PropertyFireDamage.IsAnyoneInjured
    }
    
    // 'value' attribute on BooleanRadioInput (id=SmokeDamageOnly) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 122, column 42
    function value_43 () : dynamic.Dynamic {
      return snapshot.PropertyFireDamage.SmokeDamageOnly
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsHomeHabitable) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 127, column 42
    function value_46 () : dynamic.Dynamic {
      return snapshot.PropertyFireDamage.IsHomeHabitable
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsHomeSecure) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 132, column 42
    function value_49 () : dynamic.Dynamic {
      return snapshot.PropertyFireDamage.IsHomeSecure
    }
    
    // 'value' attribute on TextInput (id=WaterSource) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 147, column 42
    function value_53 () : dynamic.Dynamic {
      return snapshot.PropertyWaterDamage.WaterSource
    }
    
    // 'value' attribute on BooleanRadioInput (id=HasWaterBeenTurnedOff) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 154, column 42
    function value_56 () : dynamic.Dynamic {
      return snapshot.PropertyWaterDamage.HasWaterBeenTurnedOff
    }
    
    // 'value' attribute on TextInput (id=LossCause) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 35, column 40
    function value_6 () : dynamic.Dynamic {
      return snapshot.LossCause
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsRoofCovered) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 160, column 98
    function value_60 () : dynamic.Dynamic {
      return snapshot.PropertyWaterDamage.IsRoofProtected
    }
    
    // 'visible' attribute on PanelRef (id=FireDamageQuestions) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 84, column 53
    function visible_52 () : java.lang.Boolean {
      return snapshot.PropertyFireDamage != null
    }
    
    // 'visible' attribute on BooleanRadioInput (id=IsRoofCovered) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 160, column 98
    function visible_59 () : java.lang.Boolean {
      return snapshot.PropertyWaterDamage.WaterSource.Code == WaterSource.TC_ROOF.Code
    }
    
    // 'visible' attribute on PanelRef (id=WaterDamageQuestions) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 138, column 54
    function visible_64 () : java.lang.Boolean {
      return snapshot.PropertyWaterDamage != null
    }
    
    // 'visible' attribute on TextInput (id=LocationOfTheft) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 41, column 70
    function visible_9 () : java.lang.Boolean {
      return snapshot.LossCause.Code == "burglary"
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get snapshot () : dynamic.Dynamic {
      return getRequireValue("snapshot", 0) as dynamic.Dynamic
    }
    
    property set snapshot ($arg :  dynamic.Dynamic) {
      setRequireValue("snapshot", 0, $arg)
    }
    
    function hasIncidentType( incident : Type ) : boolean {
      if (incident == OtherStructureIncident) {
        return hasIncidentNotOnExposure("OtherStructureIncident")
      } else if (incident == PropertyContentsIncident) {
        return hasIncidentNotOnExposure("PropertyContentsIncident")
      } else if (incident == InjuryIncident) {
        return hasIncidentNotOnExposure("InjuryIncident")
      } else if (incident == DwellingIncident) {
        return hasIncidentNotOnExposure("DwellingIncident")
      } else if (incident == FixedPropertyIncident) {
        return hasIncidentNotOnExposure("FixedPropertyIncident")
      } else if (incident == LivingExpensesIncident) {
        return hasIncidentNotOnExposure("LivingExpensesIncident")
      }
      return false
    }
    
    function hasIncidentNotOnExposure(incidentTypeName : String): boolean {
      return !((util.Snapshot.filterBeansOfType(snapshot.Incidents, incidentTypeName)).where(\ o -> onExposure(o) == false).IsEmpty) ? true : false
    }
    
    function onExposure(incident : dynamic.Dynamic) : boolean {
      var exposures : dynamic.Dynamic = snapshot.Exposures
      for(exposure in exposures) {
        if(exposure.Incident == incident) {
          return true
        }
      }
      return false
    }
    
    //Return the injured party's name or display key
    function getInjuredName(incident:dynamic.Dynamic) : String {
      if(incident.injured!=null and incident.injured.DisplayName.HasContent)
        return incident.injured.DisplayName as String
      else
        return DisplayKey.get("Web.ClaimSnapshotGeneralDV.Homeowners.Injured.Unknown")
    }
    
    function getIncidentCoverageLimit(coverageType : CoverageType) : String {
      var coverages = getPrimaryLocationCoverages()
      if (coverages != null) {
        var coverage = coverages.firstWhere(\ c -> c.Type.Code == coverageType.Code)
        return coverage.ExposureLimit as String 
      } else {
        return null
      }
    }
    
    function getPrimaryLocationCoverages() : dynamic.Dynamic {
      var result = new Object[0]
      var policy = snapshot.Policy
      var location = policy.PrimaryLocation
      if (location != null) {
        var riskUnits = policy.RiskUnits
        for (ru in riskUnits) {
          if (ru.PolicyLocation == location) {
            result = util.Snapshot.filterBeansOfType(ru.Coverages, "PropertyCoverage")
          }
        }
      }
      return result
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DwellingInputSetExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 175, column 39
    function initialValue_65 () : dynamic.Dynamic {
      return (util.Snapshot.filterBeansOfType(snapshot.Incidents, "DwellingIncident")).firstWhere(\ o -> onExposure(o) == false)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 219, column 52
    function sortValue_74 (roomDamage :  dynamic.Dynamic) : java.lang.Object {
      return roomDamage.RoomType
    }
    
    // 'value' attribute on TextAreaInput (id=DwellingDamageDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 188, column 44
    function valueRoot_70 () : java.lang.Object {
      return dwellingIncident
    }
    
    // 'value' attribute on TextInput (id=DwellingLimit) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 182, column 88
    function value_66 () : java.lang.String {
      return getIncidentCoverageLimit(CoverageType.TC_HODW_DWELLING_COV_HOE)
    }
    
    // 'value' attribute on TextAreaInput (id=DwellingDamageDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 188, column 44
    function value_68 () : dynamic.Dynamic {
      return dwellingIncident.Description
    }
    
    // 'value' attribute on TextAreaInput (id=DwellingMaterialsDamaged) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 195, column 44
    function value_71 () : dynamic.Dynamic {
      return dwellingIncident.MaterialsDamaged
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 204, column 47
    function value_81 () : dynamic.Dynamic {
      return dwellingIncident.DwellingRoomDamages
    }
    
    // 'value' attribute on BooleanRadioInput (id=DwellingEstimateReceived) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 228, column 44
    function value_82 () : dynamic.Dynamic {
      return dwellingIncident.EstimatesReceivedBoolean
    }
    
    // 'value' attribute on BooleanRadioInput (id=DwellingAlreadyRepaired) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 233, column 44
    function value_85 () : dynamic.Dynamic {
      return dwellingIncident.AlreadyRepaired
    }
    
    // 'visible' attribute on InputSet (id=DwellingInputSet) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 171, column 64
    function visible_88 () : java.lang.Boolean {
      return hasIncidentType(entity.DwellingIncident)
    }
    
    property get dwellingIncident () : dynamic.Dynamic {
      return getVariableValue("dwellingIncident", 1) as dynamic.Dynamic
    }
    
    property set dwellingIncident ($arg :  dynamic.Dynamic) {
      setVariableValue("dwellingIncident", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends DwellingInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=NumberOfRooms) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 213, column 41
    function valueRoot_77 () : java.lang.Object {
      return roomDamage
    }
    
    // 'value' attribute on TextCell (id=NumberOfRooms) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 213, column 41
    function value_75 () : dynamic.Dynamic {
      return roomDamage.NumberOfRooms
    }
    
    // 'value' attribute on TextCell (id=RoomType) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 219, column 52
    function value_78 () : dynamic.Dynamic {
      return roomDamage.RoomType
    }
    
    property get roomDamage () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=InjuredName) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 344, column 57
    function action_121 () : void {
      ClaimSnapshotInjuredInjuryIncident600Popup.push(claim, injuryIncident)
    }
    
    // 'action' attribute on TextInput (id=InjuredName) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 344, column 57
    function action_dest_122 () : pcf.api.Destination {
      return pcf.ClaimSnapshotInjuredInjuryIncident600Popup.createDestination(claim, injuryIncident)
    }
    
    // 'icon' attribute on BooleanRadioInput (id=PedestrianIcon) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 338, column 38
    function icon_119 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.INJURY.DefaultPanelIcon
    }
    
    // 'value' attribute on TextInput (id=InjuryIncidentDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 348, column 46
    function valueRoot_126 () : java.lang.Object {
      return injuryIncident
    }
    
    // 'value' attribute on TextInput (id=InjuredName) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 344, column 57
    function value_120 () : java.lang.String {
      return getInjuredName(injuryIncident)
    }
    
    // 'value' attribute on TextInput (id=InjuryIncidentDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 348, column 46
    function value_124 () : dynamic.Dynamic {
      return injuryIncident.Description
    }
    
    property get injuryIncident () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=PropertyName) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 374, column 46
    function action_130 () : void {
      ClaimSnapshotFixedPropertyIncidentPopup.push(claim, propertyIncident)
    }
    
    // 'action' attribute on TextInput (id=PropertyName) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 374, column 46
    function action_dest_131 () : pcf.api.Destination {
      return pcf.ClaimSnapshotFixedPropertyIncidentPopup.createDestination(claim, propertyIncident)
    }
    
    // 'icon' attribute on BooleanRadioInput (id=PropertyIcon) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 367, column 38
    function icon_128 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.PROPERTY_LIABILITY.DefaultPanelIcon
    }
    
    // 'value' attribute on TextInput (id=PropertyIncidentDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 378, column 46
    function valueRoot_135 () : java.lang.Object {
      return propertyIncident
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 374, column 46
    function value_129 () : dynamic.Dynamic {
      return propertyIncident.DisplayName == "" ? DisplayKey.get("Web.ClaimSnapshotGeneralDV.Homeowners.Property.Unknown") : propertyIncident.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PropertyIncidentDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 378, column 46
    function value_133 () : dynamic.Dynamic {
      return propertyIncident.Description
    }
    
    property get propertyIncident () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry5ExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=WitnessStatement) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 417, column 50
    function valueRoot_144 () : java.lang.Object {
      return witness
    }
    
    // 'value' attribute on TextCell (id=Contact) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 412, column 73
    function value_140 () : java.lang.String {
      return util.Snapshot.renderValue(witness.Contact)
    }
    
    // 'value' attribute on TextCell (id=WitnessStatement) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 417, column 50
    function value_142 () : dynamic.Dynamic {
      return witness.WitnessStatementInd
    }
    
    // 'value' attribute on TextCell (id=WitnessPerspective) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 422, column 50
    function value_145 () : dynamic.Dynamic {
      return witness.WitnessPerspective
    }
    
    property get witness () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry6ExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 444, column 50
    function valueRoot_154 () : java.lang.Object {
      return Official
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 444, column 50
    function value_152 () : dynamic.Dynamic {
      return Official.OfficialType
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 449, column 50
    function value_155 () : dynamic.Dynamic {
      return Official.Name
    }
    
    // 'value' attribute on TextCell (id=ReportNumber) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 454, column 50
    function value_158 () : dynamic.Dynamic {
      return Official.ReportNumber
    }
    
    property get Official () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry7ExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=MetroReportType) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 476, column 50
    function valueRoot_167 () : java.lang.Object {
      return MetroReport
    }
    
    // 'value' attribute on TextCell (id=MetroReportType) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 476, column 50
    function value_165 () : dynamic.Dynamic {
      return MetroReport.MetroReportType
    }
    
    // 'value' attribute on TextCell (id=MetroReportStatus) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 481, column 50
    function value_168 () : dynamic.Dynamic {
      return MetroReport.Status
    }
    
    // 'value' attribute on TextCell (id=MetroReportOrderDate) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 486, column 50
    function value_171 () : dynamic.Dynamic {
      return MetroReport.CreateTime
    }
    
    property get MetroReport () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'valueLabel' attribute on CheckBoxInput (id=DamageTypeChecked) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 59, column 34
    function valueLabel_17 () : java.lang.Object {
      return damage.Name
    }
    
    property get damage () : gw.api.claim.HomeownersHelper.DamageManager {
      return getIteratedValue(1) as gw.api.claim.HomeownersHelper.DamageManager
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LivingExpensesInputSetExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 300, column 39
    function initialValue_112 () : dynamic.Dynamic {
      return (util.Snapshot.filterBeansOfType(snapshot.Incidents, "LivingExpensesIncident")).firstWhere(\ o -> onExposure(o) == false)
    }
    
    // 'value' attribute on TextAreaInput (id=LivingExpensesDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 313, column 44
    function valueRoot_117 () : java.lang.Object {
      return livingExpensesIncident
    }
    
    // 'value' attribute on TextInput (id=LossOfUseLimit) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 307, column 87
    function value_113 () : java.lang.String {
      return getIncidentCoverageLimit(CoverageType.TC_HODW_LOSS_OF_USE_HOE)
    }
    
    // 'value' attribute on TextAreaInput (id=LivingExpensesDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 313, column 44
    function value_115 () : dynamic.Dynamic {
      return livingExpensesIncident.Description
    }
    
    // 'visible' attribute on InputSet (id=LivingExpensesInputSet) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 296, column 70
    function visible_118 () : java.lang.Boolean {
      return hasIncidentType(entity.LivingExpensesIncident)
    }
    
    property get livingExpensesIncident () : dynamic.Dynamic {
      return getVariableValue("livingExpensesIncident", 1) as dynamic.Dynamic
    }
    
    property set livingExpensesIncident ($arg :  dynamic.Dynamic) {
      setVariableValue("livingExpensesIncident", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherStructureInputSetExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 241, column 39
    function initialValue_89 () : dynamic.Dynamic {
      return (util.Snapshot.filterBeansOfType(snapshot.Incidents, "OtherStructureIncident")).firstWhere(\ o -> onExposure(o) == false)
    }
    
    // 'value' attribute on TextAreaInput (id=OtherStructureDamageDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 254, column 44
    function valueRoot_94 () : java.lang.Object {
      return otherStructureIncident
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherStructureFencesDamaged) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 269, column 44
    function value_101 () : dynamic.Dynamic {
      return otherStructureIncident.FencesDamaged
    }
    
    // 'value' attribute on TextInput (id=OtherStructureLimit) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 248, column 92
    function value_90 () : java.lang.String {
      return getIncidentCoverageLimit(CoverageType.TC_HODW_OTHER_STRUCTURES_HOE)
    }
    
    // 'value' attribute on TextAreaInput (id=OtherStructureDamageDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 254, column 44
    function value_92 () : dynamic.Dynamic {
      return otherStructureIncident.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherStructureEstimateReceived) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 259, column 44
    function value_95 () : dynamic.Dynamic {
      return otherStructureIncident.EstimatesReceivedBoolean
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherStructureAlreadyRepaired) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 264, column 44
    function value_98 () : dynamic.Dynamic {
      return otherStructureIncident.AlreadyRepaired
    }
    
    // 'visible' attribute on InputSet (id=OtherStructureInputSet) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 237, column 70
    function visible_104 () : java.lang.Boolean {
      return hasIncidentType(entity.OtherStructureIncident)
    }
    
    property get otherStructureIncident () : dynamic.Dynamic {
      return getVariableValue("otherStructureIncident", 1) as dynamic.Dynamic
    }
    
    property set otherStructureIncident ($arg :  dynamic.Dynamic) {
      setVariableValue("otherStructureIncident", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyContentsInputSetExpressionsImpl extends ClaimSnapshotGeneralPR600PanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 279, column 39
    function initialValue_105 () : dynamic.Dynamic {
      return (util.Snapshot.filterBeansOfType(snapshot.Incidents, "PropertyContentsIncident")).firstWhere(\ o -> onExposure(o) == false)
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyContentsDamageDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 292, column 44
    function valueRoot_110 () : java.lang.Object {
      return propertyContentsIncident
    }
    
    // 'value' attribute on TextInput (id=PropertyContentsLimit) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 286, column 93
    function value_106 () : java.lang.String {
      return getIncidentCoverageLimit(CoverageType.TC_HODW_PERSONAL_PROPERTY_HOE)
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyContentsDamageDescription) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 292, column 44
    function value_108 () : dynamic.Dynamic {
      return propertyContentsIncident.Description
    }
    
    // 'visible' attribute on InputSet (id=PropertyContentsInputSet) at ClaimSnapshotGeneralPR600PanelSet.Homeowners.pcf: line 275, column 72
    function visible_111 () : java.lang.Boolean {
      return hasIncidentType(entity.PropertyContentsIncident)
    }
    
    property get propertyContentsIncident () : dynamic.Dynamic {
      return getVariableValue("propertyContentsIncident", 1) as dynamic.Dynamic
    }
    
    property set propertyContentsIncident ($arg :  dynamic.Dynamic) {
      setVariableValue("propertyContentsIncident", 1, $arg)
    }
    
    
  }
  
  
}