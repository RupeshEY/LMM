package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveExcludeDetailsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchiveExcludeDetailsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveExcludeDetailsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveExcludeDetailsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on RowIterator at ArchiveExcludeDetailsLV.pcf: line 24, column 29
    function label_0 () : java.lang.Object {
      return archiveDetails.Label
    }
    
    // 'value' attribute on RowIterator at ArchiveExcludeDetailsLV.pcf: line 24, column 29
    function sortValue_1 (details :  gw.api.archiving.ArchiveDetailsData) : java.lang.Object {
      return details.Description
    }
    
    // 'value' attribute on RowIterator at ArchiveExcludeDetailsLV.pcf: line 31, column 42
    function sortValue_2 (details :  gw.api.archiving.ArchiveDetailsData) : java.lang.Object {
      return details.Count
    }
    
    // 'value' attribute on RowIterator at ArchiveExcludeDetailsLV.pcf: line 15, column 77
    function value_18 () : java.util.List<gw.api.archiving.ArchiveDetailsData> {
      return archiveDetails.DetailsData
    }
    
    // 'visible' attribute on RowIterator at ArchiveExcludeDetailsLV.pcf: line 15, column 77
    function visible_3 () : java.lang.Boolean {
      return !(archiveDetails typeis gw.api.archiving.ArchiveSkippedDetails)
    }
    
    property get archiveDetails () : gw.api.archiving.ArchiveDetails {
      return getRequireValue("archiveDetails", 0) as gw.api.archiving.ArchiveDetails
    }
    
    property set archiveDetails ($arg :  gw.api.archiving.ArchiveDetails) {
      setRequireValue("archiveDetails", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveExcludeDetailsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ArchiveExcludeDetailsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonCell (id=ResetItem) at ArchiveExcludeDetailsLV.pcf: line 38, column 86
    function action_17 () : void {
      details.resetExcludedFlag()
    }
    
    // 'action' attribute on TextCell (id=Description) at ArchiveExcludeDetailsLV.pcf: line 24, column 29
    function action_6 () : void {
      ArchiveItemListPopup.push(details)
    }
    
    // 'action' attribute on TextCell (id=Description) at ArchiveExcludeDetailsLV.pcf: line 24, column 29
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ArchiveItemListPopup.createDestination(details)
    }
    
    // 'available' attribute on ButtonCell (id=ResetItem) at ArchiveExcludeDetailsLV.pcf: line 38, column 86
    function available_14 () : java.lang.Boolean {
      return details.Count > 0
    }
    
    // 'label' attribute on TextCell (id=Description) at ArchiveExcludeDetailsLV.pcf: line 24, column 29
    function label_4 () : java.lang.Object {
      return archiveDetails.Label
    }
    
    // 'value' attribute on TextCell (id=Description) at ArchiveExcludeDetailsLV.pcf: line 24, column 29
    function valueRoot_10 () : java.lang.Object {
      return details
    }
    
    // 'value' attribute on TextCell (id=Count) at ArchiveExcludeDetailsLV.pcf: line 31, column 42
    function value_11 () : java.lang.Integer {
      return details.Count
    }
    
    // 'value' attribute on TextCell (id=Description) at ArchiveExcludeDetailsLV.pcf: line 24, column 29
    function value_5 () : java.lang.String {
      return details.Description
    }
    
    // 'visible' attribute on ButtonCell (id=ResetItem) at ArchiveExcludeDetailsLV.pcf: line 38, column 86
    function visible_15 () : java.lang.Boolean {
      return !(archiveDetails typeis gw.api.archiving.ArchiveSkippedDetails)
    }
    
    property get details () : gw.api.archiving.ArchiveDetailsData {
      return getIteratedValue(1) as gw.api.archiving.ArchiveDetailsData
    }
    
    
  }
  
  
}