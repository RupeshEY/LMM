package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimDocumentsPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimDocumentsPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimDocumentsPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, includeHidden :  boolean) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimDocumentsPrint) at ClaimDocumentsPrint.pcf: line 11, column 79
    static function canVisit_4 (Claim :  Claim, includeHidden :  boolean) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewdocs
    }
    
    // 'def' attribute on PanelRef at ClaimDocumentsPrint.pcf: line 31, column 65
    function def_onEnter_2 (def :  pcf.DocumentsLV) : void {
      def.onEnter(DocumentList, DocumentSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimDocumentsPrint.pcf: line 31, column 65
    function def_refreshVariables_3 (def :  pcf.DocumentsLV) : void {
      def.refreshVariables(DocumentList, DocumentSearchCriteria)
    }
    
    // 'initialValue' attribute on Variable at ClaimDocumentsPrint.pcf: line 23, column 38
    function initialValue_0 () : DocumentSearchCriteria {
      return gw.api.print.PrintDocumentsUtil.createDocumentSearchCriteria(Claim, includeHidden)
    }
    
    // 'initialValue' attribute on Variable at ClaimDocumentsPrint.pcf: line 27, column 83
    function initialValue_1 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return gw.api.print.PrintDocumentsUtil.getDocumentSearchQuery(DocumentSearchCriteria)
    }
    
    // 'parent' attribute on Page (id=ClaimDocumentsPrint) at ClaimDocumentsPrint.pcf: line 11, column 79
    static function parent_5 (Claim :  Claim, includeHidden :  boolean) : pcf.api.Destination {
      return pcf.ClaimDocuments.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimDocumentsPrint {
      return super.CurrentLocation as pcf.ClaimDocumentsPrint
    }
    
    property get DocumentList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("DocumentList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set DocumentList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("DocumentList", 0, $arg)
    }
    
    property get DocumentSearchCriteria () : DocumentSearchCriteria {
      return getVariableValue("DocumentSearchCriteria", 0) as DocumentSearchCriteria
    }
    
    property set DocumentSearchCriteria ($arg :  DocumentSearchCriteria) {
      setVariableValue("DocumentSearchCriteria", 0, $arg)
    }
    
    property get includeHidden () : boolean {
      return getVariableValue("includeHidden", 0) as java.lang.Boolean
    }
    
    property set includeHidden ($arg :  boolean) {
      setVariableValue("includeHidden", 0, $arg)
    }
    
    
  }
  
  
}