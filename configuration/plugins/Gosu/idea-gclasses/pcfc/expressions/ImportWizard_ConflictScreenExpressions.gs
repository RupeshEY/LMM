package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ImportWizard_ConflictScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportWizard_ConflictScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Overwrite) at ImportWizard_ConflictScreen.pcf: line 28, column 49
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ImportDataConflict.Overwrite = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=Overwrite) at ImportWizard_ConflictScreen.pcf: line 28, column 49
    function editable_2 () : java.lang.Boolean {
      return canDiscardConflict(ImportDataConflict)
    }
    
    // 'label' attribute on AlertBar (id=ConflictAlert) at ImportWizard_ConflictScreen.pcf: line 19, column 63
    function label_1 () : java.lang.Object {
      return getConflictAlert(ImportDataConflict)
    }
    
    // 'value' attribute on RowIterator at ImportWizard_ConflictScreen.pcf: line 68, column 52
    function sortValue_22 (FieldConflict :  gw.api.admin.ImportDataFieldConflict) : java.lang.Object {
      return FieldConflict.FieldName
    }
    
    // 'value' attribute on RowIterator at ImportWizard_ConflictScreen.pcf: line 74, column 56
    function sortValue_23 (FieldConflict :  gw.api.admin.ImportDataFieldConflict) : java.lang.Object {
      return FieldConflict.ExistingValue
    }
    
    // 'value' attribute on RowIterator at ImportWizard_ConflictScreen.pcf: line 80, column 54
    function sortValue_24 (FieldConflict :  gw.api.admin.ImportDataFieldConflict) : java.lang.Object {
      return FieldConflict.ImportValue
    }
    
    // 'value' attribute on TextInput (id=Resolution) at ImportWizard_ConflictScreen.pcf: line 33, column 69
    function valueRoot_10 () : java.lang.Object {
      return ImportDataInfo
    }
    
    // 'value' attribute on BooleanRadioInput (id=Overwrite) at ImportWizard_ConflictScreen.pcf: line 28, column 49
    function valueRoot_7 () : java.lang.Object {
      return ImportDataConflict
    }
    
    // 'value' attribute on TextInput (id=Message) at ImportWizard_ConflictScreen.pcf: line 37, column 156
    function value_11 () : java.lang.String {
      return DisplayKey.get("Web.Admin.ImportWizard.ConflictDV.ConflictNumber",  ImportDataConflict.Number ,  ImportDataInfo.NumConflicts)
    }
    
    // 'value' attribute on TextInput (id=Type) at ImportWizard_ConflictScreen.pcf: line 41, column 50
    function value_13 () : java.lang.String {
      return ImportDataConflict.EntityType
    }
    
    // 'value' attribute on TextInput (id=PublicID) at ImportWizard_ConflictScreen.pcf: line 45, column 48
    function value_16 () : java.lang.String {
      return ImportDataConflict.PublicID
    }
    
    // 'value' attribute on TextInput (id=DisplayName) at ImportWizard_ConflictScreen.pcf: line 49, column 51
    function value_19 () : java.lang.String {
      return ImportDataConflict.DisplayName
    }
    
    // 'value' attribute on BooleanRadioInput (id=Overwrite) at ImportWizard_ConflictScreen.pcf: line 28, column 49
    function value_3 () : java.lang.Boolean {
      return ImportDataConflict.Overwrite
    }
    
    // 'value' attribute on RowIterator at ImportWizard_ConflictScreen.pcf: line 62, column 66
    function value_42 () : gw.api.admin.ImportDataFieldConflict[] {
      return ImportDataConflict.FieldConflicts
    }
    
    // 'value' attribute on TextInput (id=Resolution) at ImportWizard_ConflictScreen.pcf: line 33, column 69
    function value_8 () : gw.api.admin.ImportDataInfo.ResolutionOption {
      return ImportDataInfo.ResolutionStrategy
    }
    
    // 'visible' attribute on AlertBar (id=ConflictAlert) at ImportWizard_ConflictScreen.pcf: line 19, column 63
    function visible_0 () : java.lang.Boolean {
      return getConflictAlert(ImportDataConflict) != null
    }
    
    property get ImportDataConflict () : gw.api.admin.ImportDataConflict {
      return getRequireValue("ImportDataConflict", 0) as gw.api.admin.ImportDataConflict
    }
    
    property set ImportDataConflict ($arg :  gw.api.admin.ImportDataConflict) {
      setRequireValue("ImportDataConflict", 0, $arg)
    }
    
    property get ImportDataInfo () : gw.api.admin.ImportDataInfo {
      return getRequireValue("ImportDataInfo", 0) as gw.api.admin.ImportDataInfo
    }
    
    property set ImportDataInfo ($arg :  gw.api.admin.ImportDataInfo) {
      setRequireValue("ImportDataInfo", 0, $arg)
    }
    
    function getConflictAlert(conflict : gw.api.admin.ImportDataConflict) : String {
      switch (getRootType(conflict)) {
        case entity.ClaimMetricLimit:
        case entity.ExposureMetricLimit:
          return DisplayKey.get("Web.Admin.ImportWizard.ConflictScreen.MetricLimitConflictAlert")
        case entity.PolicyTypeMetricLimits:
          return DisplayKey.get("Web.Admin.ImportWizard.ConflictScreen.PolicyTypeMetricLimitsConflictAlert")
        default:
          return null
      }
    }
    
    function canDiscardConflict(conflict : gw.api.admin.ImportDataConflict) : boolean {
      return getRootType(conflict) != entity.PolicyTypeMetricLimits
    }
    
    function getRootType(conflict : gw.api.admin.ImportDataConflict) : gw.entity.IEntityType {
      var type = gw.lang.reflect.TypeSystem.getByFullNameIfValid("entity." + conflict.EntityType)
      return type typeis gw.entity.IEntityType ? type.RootType : null
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_ConflictScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ImportWizard_ConflictScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ExistingValue) at ImportWizard_ConflictScreen.pcf: line 74, column 56
    function action_31 () : void {
      ImportWizard_ArrayDiffPopup.push(FieldConflict.ArrayDifferences)
    }
    
    // 'action' attribute on TextCell (id=ImportValue) at ImportWizard_ConflictScreen.pcf: line 80, column 54
    function action_38 () : void {
      ImportWizard_ArrayDiffPopup.push(FieldConflict.ArrayDifferences)
    }
    
    // 'action' attribute on TextCell (id=ExistingValue) at ImportWizard_ConflictScreen.pcf: line 74, column 56
    function action_dest_32 () : pcf.api.Destination {
      return pcf.ImportWizard_ArrayDiffPopup.createDestination(FieldConflict.ArrayDifferences)
    }
    
    // 'action' attribute on TextCell (id=ImportValue) at ImportWizard_ConflictScreen.pcf: line 80, column 54
    function action_dest_39 () : pcf.api.Destination {
      return pcf.ImportWizard_ArrayDiffPopup.createDestination(FieldConflict.ArrayDifferences)
    }
    
    // 'available' attribute on TextCell (id=ExistingValue) at ImportWizard_ConflictScreen.pcf: line 74, column 56
    function available_28 () : java.lang.Boolean {
      return FieldConflict.isArrayConflict()
    }
    
    // 'value' attribute on TextCell (id=FieldName) at ImportWizard_ConflictScreen.pcf: line 68, column 52
    function valueRoot_27 () : java.lang.Object {
      return FieldConflict
    }
    
    // 'value' attribute on TextCell (id=FieldName) at ImportWizard_ConflictScreen.pcf: line 68, column 52
    function value_25 () : java.lang.String {
      return FieldConflict.FieldName
    }
    
    // 'value' attribute on TextCell (id=ExistingValue) at ImportWizard_ConflictScreen.pcf: line 74, column 56
    function value_29 () : java.lang.String {
      return FieldConflict.ExistingValue
    }
    
    // 'value' attribute on TextCell (id=ImportValue) at ImportWizard_ConflictScreen.pcf: line 80, column 54
    function value_36 () : java.lang.String {
      return FieldConflict.ImportValue
    }
    
    property get FieldConflict () : gw.api.admin.ImportDataFieldConflict {
      return getIteratedValue(1) as gw.api.admin.ImportDataFieldConflict
    }
    
    
  }
  
  
}