package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchiveGraphInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveGraphInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ArchiveGraphInfo) at ArchiveGraphInfo.pcf: line 9, column 83
    static function canVisit_14 () : java.lang.Boolean {
      return com.guidewire.pl.system.dependency.PLDependencies.getDomainGraphSupport() != null
    }
    
    // Page (id=ArchiveGraphInfo) at ArchiveGraphInfo.pcf: line 9, column 83
    static function parent_15 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ArchiveGraphInfo {
      return super.CurrentLocation as pcf.ArchiveGraphInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=warningMessage2) at ArchiveGraphInfo.pcf: line 107, column 34
    function value_9 () : java.lang.String {
      return warning2
    }
    
    property get warning2 () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=warningMessage1) at ArchiveGraphInfo.pcf: line 85, column 34
    function value_5 () : java.lang.String {
      return warning1
    }
    
    property get warning1 () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveGraphInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScreenExpressionsImpl extends ArchiveGraphInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=download) at ArchiveGraphInfo.pcf: line 26, column 66
    function action_2 () : void {
      gw.api.web.tools.ArchiveGraphInfoPage.download()
    }
    
    // 'initialValue' attribute on Variable at ArchiveGraphInfo.pcf: line 14, column 36
    function initialValue_0 () : java.lang.String[] {
      return com.guidewire.pl.domain.archiving.DomainGraphIssues.validateNothingOutsideOfDomainGraphShouldPointToDomainGraph()
    }
    
    // 'initialValue' attribute on Variable at ArchiveGraphInfo.pcf: line 18, column 36
    function initialValue_1 () : java.lang.String[] {
      return com.guidewire.pl.domain.archiving.DomainGraphIssues.validateNullLinksCannotMakeNodeUnreachable()
    }
    
    // 'value' attribute on RowIterator (id=warningLV2) at ArchiveGraphInfo.pcf: line 101, column 48
    function value_11 () : java.lang.String[] {
      return warnings2
    }
    
    // 'value' attribute on TextAreaInput (id=graph1) at ArchiveGraphInfo.pcf: line 60, column 115
    function value_3 () : java.lang.String {
      return com.guidewire.pl.domain.archiving.DomainGraphIssues.testOutputDomainGraphInDotFormat()
    }
    
    // 'value' attribute on RowIterator (id=warningLV1) at ArchiveGraphInfo.pcf: line 79, column 48
    function value_7 () : java.lang.String[] {
      return warnings1
    }
    
    // 'visible' attribute on PanelRef at ArchiveGraphInfo.pcf: line 91, column 42
    function visible_12 () : java.lang.Boolean {
      return !warnings2.IsEmpty
    }
    
    // 'visible' attribute on PanelRef at ArchiveGraphInfo.pcf: line 115, column 59
    function visible_13 () : java.lang.Boolean {
      return warnings1.IsEmpty and warnings2.IsEmpty
    }
    
    // 'visible' attribute on PanelRef at ArchiveGraphInfo.pcf: line 69, column 42
    function visible_8 () : java.lang.Boolean {
      return !warnings1.IsEmpty
    }
    
    property get warnings1 () : java.lang.String[] {
      return getVariableValue("warnings1", 1) as java.lang.String[]
    }
    
    property set warnings1 ($arg :  java.lang.String[]) {
      setVariableValue("warnings1", 1, $arg)
    }
    
    property get warnings2 () : java.lang.String[] {
      return getVariableValue("warnings2", 1) as java.lang.String[]
    }
    
    property set warnings2 ($arg :  java.lang.String[]) {
      setVariableValue("warnings2", 1, $arg)
    }
    
    
  }
  
  
}