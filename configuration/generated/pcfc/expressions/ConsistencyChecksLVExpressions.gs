package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ConsistencyChecksLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConsistencyChecksLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at ConsistencyChecksLV.pcf: line 22, column 91
    function filters_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return new gw.api.filters.ConsistencyCheckTypelistFilterSet().FilterOptions
    }
    
    // 'value' attribute on RowIterator at ConsistencyChecksLV.pcf: line 29, column 32
    function sortValue_1 (consistencyCheck :  gw.api.database.ConsistencyCheck) : java.lang.Object {
      return consistencyCheck.AssociatedTable.Name
    }
    
    // 'value' attribute on RowIterator at ConsistencyChecksLV.pcf: line 33, column 70
    function sortValue_2 (consistencyCheck :  gw.api.database.ConsistencyCheck) : java.lang.Object {
      return consistencyCheck.ConsistencyCheckType.DisplayName
    }
    
    // 'value' attribute on RowIterator at ConsistencyChecksLV.pcf: line 17, column 54
    function value_11 () : gw.api.database.ConsistencyCheck[] {
      return CCPageHelper.getConsistencyChecks( tableSearch )
    }
    
    property get CCPageHelper () : gw.api.tools.ConsistencyChecksRunsPageHelper {
      return getRequireValue("CCPageHelper", 0) as gw.api.tools.ConsistencyChecksRunsPageHelper
    }
    
    property set CCPageHelper ($arg :  gw.api.tools.ConsistencyChecksRunsPageHelper) {
      setRequireValue("CCPageHelper", 0, $arg)
    }
    
    property get tableSearch () : String {
      return getRequireValue("tableSearch", 0) as String
    }
    
    property set tableSearch ($arg :  String) {
      setRequireValue("tableSearch", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ConsistencyChecksLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ConsistencyChecksLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=table) at ConsistencyChecksLV.pcf: line 29, column 32
    function valueRoot_5 () : java.lang.Object {
      return consistencyCheck.AssociatedTable
    }
    
    // 'value' attribute on TextCell (id=Cell0) at ConsistencyChecksLV.pcf: line 33, column 70
    function valueRoot_8 () : java.lang.Object {
      return consistencyCheck.ConsistencyCheckType
    }
    
    // 'value' attribute on TextCell (id=table) at ConsistencyChecksLV.pcf: line 29, column 32
    function value_3 () : java.lang.String {
      return consistencyCheck.AssociatedTable.Name
    }
    
    // 'value' attribute on TextCell (id=Cell0) at ConsistencyChecksLV.pcf: line 33, column 70
    function value_6 () : java.lang.String {
      return consistencyCheck.ConsistencyCheckType.DisplayName
    }
    
    // 'value' attribute on TextCell (id=consistencyCheckDescription) at ConsistencyChecksLV.pcf: line 40, column 24
    function value_9 () : java.lang.String {
      return consistencyCheck.getDescription()
    }
    
    property get consistencyCheck () : gw.api.database.ConsistencyCheck {
      return getIteratedValue(1) as gw.api.database.ConsistencyCheck
    }
    
    
  }
  
  
}