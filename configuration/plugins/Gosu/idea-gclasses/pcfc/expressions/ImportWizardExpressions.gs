package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ImportWizardExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportWizardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 10, column 29
    function afterCancel_8 () : void {
      ImportDataInfo.cancel(); ImportResults.go(ImportDataInfo)
    }
    
    // 'afterFinish' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 10, column 29
    function afterFinish_13 () : void {
      ImportDataInfo.commitChanges(); ImportResults.go(ImportDataInfo)
    }
    
    // 'allowFinish' attribute on WizardStep (id=Upload) at ImportWizard.pcf: line 24, column 78
    function allowFinish_1 () : java.lang.Boolean {
      return (ImportDataInfo.File != null and ImportDataInfo.NumConflicts == 0) or ImportDataInfo.ResolutionStrategy != MANUAL
    }
    
    // 'allowNext' attribute on WizardStep (id=Upload) at ImportWizard.pcf: line 24, column 78
    function allowNext_2 () : java.lang.Boolean {
      return ImportDataInfo.File != null and ImportDataInfo.NumConflicts > 0 and ImportDataInfo.ResolutionStrategy == MANUAL
    }
    
    // 'canVisit' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 10, column 29
    static function canVisit_9 () : java.lang.Boolean {
      return perm.User.importadmindata
    }
    
    // 'initialValue' attribute on Variable at ImportWizard.pcf: line 16, column 43
    function initialValue_0 () : gw.api.admin.ImportDataInfo {
      return new gw.api.admin.ImportDataInfo()
    }
    
    // Wizard (id=ImportWizard) at ImportWizard.pcf: line 10, column 29
    static function parent_10 () : pcf.api.Destination {
      return pcf.Utilities.createDestination()
    }
    
    // 'screen' attribute on WizardStep (id=Upload) at ImportWizard.pcf: line 24, column 78
    function screen_onEnter_3 (def :  pcf.ImportWizard_UploadScreen) : void {
      def.onEnter(ImportDataInfo)
    }
    
    // 'screen' attribute on WizardStep (id=Upload) at ImportWizard.pcf: line 24, column 78
    function screen_refreshVariables_4 (def :  pcf.ImportWizard_UploadScreen) : void {
      def.refreshVariables(ImportDataInfo)
    }
    
    // 'tabBar' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 10, column 29
    function tabBar_onEnter_11 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on Wizard (id=ImportWizard) at ImportWizard.pcf: line 10, column 29
    function tabBar_refreshVariables_12 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on WizardStepIterator at ImportWizard.pcf: line 28, column 53
    function value_7 () : gw.api.admin.ImportDataConflict[] {
      return ImportDataInfo.Conflicts
    }
    
    override property get CurrentLocation () : pcf.ImportWizard {
      return super.CurrentLocation as pcf.ImportWizard
    }
    
    property get ImportDataInfo () : gw.api.admin.ImportDataInfo {
      return getVariableValue("ImportDataInfo", 0) as gw.api.admin.ImportDataInfo
    }
    
    property set ImportDataInfo ($arg :  gw.api.admin.ImportDataInfo) {
      setVariableValue("ImportDataInfo", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ResolveConflictsExpressionsImpl extends ImportWizardExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'screen' attribute on WizardStep (id=ResolveConflicts) at ImportWizard.pcf: line 32, column 82
    function screen_onEnter_5 (def :  pcf.ImportWizard_ConflictScreen) : void {
      def.onEnter(ImportDataInfo, ImportDataConflict)
    }
    
    // 'screen' attribute on WizardStep (id=ResolveConflicts) at ImportWizard.pcf: line 32, column 82
    function screen_refreshVariables_6 (def :  pcf.ImportWizard_ConflictScreen) : void {
      def.refreshVariables(ImportDataInfo, ImportDataConflict)
    }
    
    property get ImportDataConflict () : gw.api.admin.ImportDataConflict {
      return getWizardStepIteratedValue(1) as gw.api.admin.ImportDataConflict
    }
    
    
  }
  
  
}