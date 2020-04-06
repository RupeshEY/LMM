package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotTripIncidentScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotTripIncidentScreen_800Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotTripIncidentScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotTripIncidentScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotTripIncidentScreen.800.pcf: line 14, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return IncidentParam
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotTripIncidentScreen.800.pcf: line 61, column 44
    function valueRoot_14 () : java.lang.Object {
      return TripIncidentParam
    }
    
    // 'value' attribute on TextInput (id=GeographicalRegion) at ClaimSnapshotTripIncidentScreen.800.pcf: line 36, column 44
    function valueRoot_5 () : java.lang.Object {
      return TripIncidentParam.TripRU
    }
    
    // 'value' attribute on TextInput (id=TripRU) at ClaimSnapshotTripIncidentScreen.800.pcf: line 29, column 43
    function value_1 () : dynamic.Dynamic {
      return TripIncidentParam.TripRU.RUNumber +": " + TripIncidentParam.TripRU.TripDescription
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSnapshotTripIncidentScreen.800.pcf: line 61, column 44
    function value_12 () : dynamic.Dynamic {
      return TripIncidentParam.Description
    }
    
    // 'value' attribute on TextInput (id=GeographicalRegion) at ClaimSnapshotTripIncidentScreen.800.pcf: line 36, column 44
    function value_3 () : dynamic.Dynamic {
      return TripIncidentParam.TripRU.GeographicalRegion
    }
    
    // 'value' attribute on DateInput (id=StartDate) at ClaimSnapshotTripIncidentScreen.800.pcf: line 41, column 44
    function value_6 () : dynamic.Dynamic {
      return TripIncidentParam.TripRU.StartDate
    }
    
    // 'value' attribute on DateInput (id=EndDate) at ClaimSnapshotTripIncidentScreen.800.pcf: line 46, column 44
    function value_9 () : dynamic.Dynamic {
      return TripIncidentParam.TripRU.EndDate
    }
    
    property get IncidentParam () : dynamic.Dynamic {
      return getRequireValue("IncidentParam", 0) as dynamic.Dynamic
    }
    
    property set IncidentParam ($arg :  dynamic.Dynamic) {
      setRequireValue("IncidentParam", 0, $arg)
    }
    
    property get TripIncidentParam () : dynamic.Dynamic {
      return getVariableValue("TripIncidentParam", 0) as dynamic.Dynamic
    }
    
    property set TripIncidentParam ($arg :  dynamic.Dynamic) {
      setVariableValue("TripIncidentParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotTripIncidentScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CarrierName) at ClaimSnapshotTripIncidentScreen.800.pcf: line 151, column 54
    function valueRoot_42 () : java.lang.Object {
      return anAddnlTripSegment
    }
    
    // 'value' attribute on TextCell (id=CarrierName) at ClaimSnapshotTripIncidentScreen.800.pcf: line 151, column 54
    function value_40 () : dynamic.Dynamic {
      return anAddnlTripSegment.CarrierName
    }
    
    // 'value' attribute on TextCell (id=CarrierNumber) at ClaimSnapshotTripIncidentScreen.800.pcf: line 157, column 54
    function value_43 () : dynamic.Dynamic {
      return anAddnlTripSegment.CarrierNumber
    }
    
    // 'value' attribute on TextCell (id=TransportType) at ClaimSnapshotTripIncidentScreen.800.pcf: line 163, column 54
    function value_46 () : dynamic.Dynamic {
      return anAddnlTripSegment.TransportType
    }
    
    // 'value' attribute on TextCell (id=StartedOn) at ClaimSnapshotTripIncidentScreen.800.pcf: line 169, column 54
    function value_49 () : dynamic.Dynamic {
      return anAddnlTripSegment.StartDate
    }
    
    property get anAddnlTripSegment () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotTripIncidentScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ListDetailPanel2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=AffectedAccommodationName) at ClaimSnapshotTripIncidentScreen.800.pcf: line 203, column 50
    function valueRoot_59 () : java.lang.Object {
      return aTripAccommodation
    }
    
    // 'value' attribute on TextCell (id=AffectedAccommodationName) at ClaimSnapshotTripIncidentScreen.800.pcf: line 203, column 50
    function value_57 () : dynamic.Dynamic {
      return aTripAccommodation.PropertyName
    }
    
    // 'value' attribute on TextCell (id=ReasonForCancellation) at ClaimSnapshotTripIncidentScreen.800.pcf: line 209, column 50
    function value_60 () : dynamic.Dynamic {
      return aTripAccommodation.ReasonForCancellation
    }
    
    // 'value' attribute on TextCell (id=AccommodationStatus) at ClaimSnapshotTripIncidentScreen.800.pcf: line 214, column 254
    function value_63 () : java.lang.String {
      return aTripAccommodation.CancelOnly as Boolean ? DisplayKey.get("Web.TripIncidentAccommodationLV.AccommodationStatus.Cancelled") : DisplayKey.get("Web.TripIncidentAccommodationLV.AccommodationStatus.Rebooked")
    }
    
    property get aTripAccommodation () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotTripIncidentScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends ListDetailPanel2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=AddnlTripAccommodation_DisplayName) at ClaimSnapshotTripIncidentScreen.800.pcf: line 244, column 54
    function valueRoot_69 () : java.lang.Object {
      return anAddnlTripAccommodation
    }
    
    // 'value' attribute on TextCell (id=AddnlTripAccommodation_DisplayName) at ClaimSnapshotTripIncidentScreen.800.pcf: line 244, column 54
    function value_67 () : dynamic.Dynamic {
      return anAddnlTripAccommodation.PropertyName
    }
    
    property get anAddnlTripAccommodation () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotTripIncidentScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CarrierName) at ClaimSnapshotTripIncidentScreen.800.pcf: line 97, column 50
    function valueRoot_23 () : java.lang.Object {
      return aTripSegment
    }
    
    // 'value' attribute on TextCell (id=CarrierName) at ClaimSnapshotTripIncidentScreen.800.pcf: line 97, column 50
    function value_21 () : dynamic.Dynamic {
      return aTripSegment.CarrierName
    }
    
    // 'value' attribute on TextCell (id=CarrierNumber) at ClaimSnapshotTripIncidentScreen.800.pcf: line 103, column 50
    function value_24 () : dynamic.Dynamic {
      return aTripSegment.CarrierNumber
    }
    
    // 'value' attribute on TextCell (id=TransportType) at ClaimSnapshotTripIncidentScreen.800.pcf: line 109, column 50
    function value_27 () : dynamic.Dynamic {
      return aTripSegment.TransportType
    }
    
    // 'value' attribute on TextCell (id=StartedOn) at ClaimSnapshotTripIncidentScreen.800.pcf: line 115, column 50
    function value_30 () : dynamic.Dynamic {
      return aTripSegment.StartDate
    }
    
    // 'value' attribute on TextCell (id=SegmentStatus) at ClaimSnapshotTripIncidentScreen.800.pcf: line 120, column 224
    function value_33 () : java.lang.String {
      return aTripSegment.CancelOnly as Boolean ? DisplayKey.get("Web.TripIncidentSegmentLV.SegmentStatus.Cancelled") : DisplayKey.get("Web.TripIncidentSegmentLV.SegmentStatus.Rebooked")
    }
    
    property get aTripSegment () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotTripIncidentScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanel2ExpressionsImpl extends ClaimSnapshotTripIncidentScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 203, column 50
    function sortValue_54 (aTripAccommodation :  dynamic.Dynamic) : java.lang.Object {
      return aTripAccommodation.PropertyName
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 209, column 50
    function sortValue_55 (aTripAccommodation :  dynamic.Dynamic) : java.lang.Object {
      return aTripAccommodation.ReasonForCancellation
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 214, column 254
    function sortValue_56 (aTripAccommodation :  dynamic.Dynamic) : java.lang.Object {
      return aTripAccommodation.CancelOnly as Boolean ? DisplayKey.get("Web.TripIncidentAccommodationLV.AccommodationStatus.Cancelled") : DisplayKey.get("Web.TripIncidentAccommodationLV.AccommodationStatus.Rebooked")
    }
    
    // 'value' attribute on RowIterator (id=AddnlTripAccommodationIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 244, column 54
    function sortValue_66 (anAddnlTripAccommodation :  dynamic.Dynamic) : java.lang.Object {
      return anAddnlTripAccommodation.PropertyName
    }
    
    // 'value' attribute on RowIterator (id=TripAccommodationIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 195, column 45
    function value_65 () : dynamic.Dynamic {
      return TripIncidentParam.TripAccommodations
    }
    
    // 'value' attribute on RowIterator (id=AddnlTripAccommodationIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 236, column 49
    function value_70 () : dynamic.Dynamic {
      return eachTripAccommodation.AddnlTripAccommodations
    }
    
    // 'visible' attribute on Card (id=AffectedTripAccommodationCard) at ClaimSnapshotTripIncidentScreen.800.pcf: line 224, column 67
    function visible_71 () : java.lang.Boolean {
      return eachTripAccommodation.CancelOnly == false
    }
    
    property get eachTripAccommodation () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set eachTripAccommodation ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotTripIncidentScreen.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotTripIncidentScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at ClaimSnapshotTripIncidentScreen.800.pcf: line 89, column 34
    function sortBy_15 (aTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return aTripSegment.StartedOn
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 97, column 50
    function sortValue_16 (aTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return aTripSegment.CarrierName
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 103, column 50
    function sortValue_17 (aTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return aTripSegment.CarrierNumber
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 109, column 50
    function sortValue_18 (aTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return aTripSegment.TransportType
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 115, column 50
    function sortValue_19 (aTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return aTripSegment.StartDate
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 120, column 224
    function sortValue_20 (aTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return aTripSegment.CancelOnly as Boolean ? DisplayKey.get("Web.TripIncidentSegmentLV.SegmentStatus.Cancelled") : DisplayKey.get("Web.TripIncidentSegmentLV.SegmentStatus.Rebooked")
    }
    
    // 'value' attribute on RowIterator (id=AddnlTripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 151, column 54
    function sortValue_36 (anAddnlTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return anAddnlTripSegment.CarrierName
    }
    
    // 'value' attribute on RowIterator (id=AddnlTripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 157, column 54
    function sortValue_37 (anAddnlTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return anAddnlTripSegment.CarrierNumber
    }
    
    // 'value' attribute on RowIterator (id=AddnlTripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 163, column 54
    function sortValue_38 (anAddnlTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return anAddnlTripSegment.TransportType
    }
    
    // 'value' attribute on RowIterator (id=AddnlTripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 169, column 54
    function sortValue_39 (anAddnlTripSegment :  dynamic.Dynamic) : java.lang.Object {
      return anAddnlTripSegment.StartDate
    }
    
    // 'value' attribute on RowIterator (id=TripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 86, column 45
    function value_35 () : dynamic.Dynamic {
      return TripIncidentParam.TripSegments
    }
    
    // 'value' attribute on RowIterator (id=AddnlTripSegmentIterator) at ClaimSnapshotTripIncidentScreen.800.pcf: line 142, column 49
    function value_52 () : dynamic.Dynamic {
      return eachTripSegment.AddnlTripSegments
    }
    
    // 'visible' attribute on Card (id=AffectedTripSegmentCard) at ClaimSnapshotTripIncidentScreen.800.pcf: line 130, column 61
    function visible_53 () : java.lang.Boolean {
      return eachTripSegment.CancelOnly == false
    }
    
    property get eachTripSegment () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set eachTripSegment ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}