package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadErrorsInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=rowNumber) at LoadErrorsInfo.pcf: line 107, column 38
    function valueRoot_25 () : java.lang.Object {
      return LoadErrorRow
    }
    
    // 'value' attribute on TextCell (id=rowNumber) at LoadErrorsInfo.pcf: line 107, column 38
    function value_23 () : java.lang.Long {
      return LoadErrorRow.RowNumber
    }
    
    // 'value' attribute on TextCell (id=luwid) at LoadErrorsInfo.pcf: line 112, column 38
    function value_26 () : java.lang.String {
      return LoadErrorRow.LUWID
    }
    
    property get LoadErrorRow () : entity.LoadErrorRow {
      return getIteratedValue(2) as entity.LoadErrorRow
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=count) at LoadErrorsInfo.pcf: line 74, column 30
    function valueRoot_16 () : java.lang.Object {
      return LoadError.getLoadErrorRows()
    }
    
    // 'value' attribute on TextCell (id=tablename) at LoadErrorsInfo.pcf: line 49, column 30
    function valueRoot_4 () : java.lang.Object {
      return LoadError
    }
    
    // 'value' attribute on TextCell (id=errortype) at LoadErrorsInfo.pcf: line 55, column 30
    function valueRoot_7 () : java.lang.Object {
      return LoadError.LoadErrorType
    }
    
    // 'value' attribute on TextCell (id=query) at LoadErrorsInfo.pcf: line 67, column 30
    function value_11 () : java.lang.String {
      return LoadError.Query
    }
    
    // 'value' attribute on TextCell (id=count) at LoadErrorsInfo.pcf: line 74, column 30
    function value_14 () : java.lang.Integer {
      return LoadError.getLoadErrorRows().Count
    }
    
    // 'value' attribute on BooleanRadioCell (id=Cell0) at LoadErrorsInfo.pcf: line 80, column 30
    function value_17 () : java.lang.Boolean {
      return LoadError.LUWIDErrorRowPresent
    }
    
    // 'value' attribute on TextCell (id=tablename) at LoadErrorsInfo.pcf: line 49, column 30
    function value_2 () : java.lang.String {
      return LoadError.TableName
    }
    
    // 'value' attribute on TextCell (id=errortype) at LoadErrorsInfo.pcf: line 55, column 30
    function value_5 () : java.lang.String {
      return LoadError.LoadErrorType.DisplayName
    }
    
    // 'value' attribute on TextCell (id=errormessage) at LoadErrorsInfo.pcf: line 61, column 30
    function value_8 () : java.lang.String {
      return LoadError.ErrorMessage
    }
    
    property get LoadError () : entity.LoadError {
      return getIteratedValue(2) as entity.LoadError
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends LoadErrorsInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at LoadErrorsInfo.pcf: line 107, column 38
    function sortValue_21 (LoadErrorRow :  entity.LoadErrorRow) : java.lang.Object {
      return LoadErrorRow.RowNumber
    }
    
    // 'value' attribute on RowIterator at LoadErrorsInfo.pcf: line 112, column 38
    function sortValue_22 (LoadErrorRow :  entity.LoadErrorRow) : java.lang.Object {
      return LoadErrorRow.LUWID
    }
    
    // 'value' attribute on RowIterator (id=loadErrorListColumns) at LoadErrorsInfo.pcf: line 42, column 82
    function value_20 () : gw.api.database.IQueryBeanResult<entity.LoadError> {
      return PageHelper.getLoadErrors() as gw.api.database.IQueryBeanResult<LoadError>
    }
    
    // 'value' attribute on RowIterator at LoadErrorsInfo.pcf: line 100, column 93
    function value_29 () : gw.api.database.IQueryBeanResult<entity.LoadErrorRow> {
      return SelectedLoadError.getLoadErrorRows() as gw.api.database.IQueryBeanResult<LoadErrorRow>
    }
    
    property get SelectedLoadError () : LoadError {
      return getCurrentSelection(1) as LoadError
    }
    
    property set SelectedLoadError ($arg :  LoadError) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadErrorsInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadErrorsInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=DownloadParms) at LoadErrorsInfo.pcf: line 28, column 66
    function action_1 () : void {
      PageHelper.download()
    }
    
    // 'initialValue' attribute on Variable at LoadErrorsInfo.pcf: line 17, column 45
    function initialValue_0 () : gw.api.tools.LoadErrorsHelper {
      return new gw.api.tools.LoadErrorsHelper()
    }
    
    // 'parent' attribute on Page (id=LoadErrorsInfo) at LoadErrorsInfo.pcf: line 11, column 75
    static function parent_30 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    override property get CurrentLocation () : pcf.LoadErrorsInfo {
      return super.CurrentLocation as pcf.LoadErrorsInfo
    }
    
    property get PageHelper () : gw.api.tools.LoadErrorsHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.LoadErrorsHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadErrorsHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}