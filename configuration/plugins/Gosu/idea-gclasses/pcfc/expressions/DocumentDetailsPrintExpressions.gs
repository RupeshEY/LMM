package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/documents/print/DocumentDetailsPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentDetailsPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/documents/print/DocumentDetailsPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, DocumentParam :  Document) : int {
      return 0
    }
    
    // 'columns' attribute on Layout at DocumentDetailsPrint.pcf: line 24, column 25
    function columns_0 () : java.lang.Double {
      return 1
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPrint.pcf: line 27, column 38
    function def_onEnter_1 (def :  pcf.DocumentDetailsEditInputSet_default) : void {
      def.onEnter(new gw.document.DocumentDetailsCCHelper(DocumentParam, false, \docLink -> docLink.Unlinkable), false)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPrint.pcf: line 27, column 38
    function def_onEnter_3 (def :  pcf.DocumentDetailsEditInputSet_email_sent) : void {
      def.onEnter(new gw.document.DocumentDetailsCCHelper(DocumentParam, false, \docLink -> docLink.Unlinkable), false)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPrint.pcf: line 30, column 38
    function def_onEnter_6 (def :  pcf.DocumentDetailsEditSupplementalInputSet) : void {
      def.onEnter(DocumentParam)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPrint.pcf: line 27, column 38
    function def_refreshVariables_2 (def :  pcf.DocumentDetailsEditInputSet_default) : void {
      def.refreshVariables(new gw.document.DocumentDetailsCCHelper(DocumentParam, false, \docLink -> docLink.Unlinkable), false)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPrint.pcf: line 27, column 38
    function def_refreshVariables_4 (def :  pcf.DocumentDetailsEditInputSet_email_sent) : void {
      def.refreshVariables(new gw.document.DocumentDetailsCCHelper(DocumentParam, false, \docLink -> docLink.Unlinkable), false)
    }
    
    // 'def' attribute on InputSetRef at DocumentDetailsPrint.pcf: line 30, column 38
    function def_refreshVariables_7 (def :  pcf.DocumentDetailsEditSupplementalInputSet) : void {
      def.refreshVariables(DocumentParam)
    }
    
    // 'mode' attribute on InputSetRef at DocumentDetailsPrint.pcf: line 27, column 38
    function mode_5 () : java.lang.Object {
      return DocumentParam.Type
    }
    
    // 'parent' attribute on Page (id=DocumentDetailsPrint) at DocumentDetailsPrint.pcf: line 9, column 67
    static function parent_9 (Claim :  Claim, DocumentParam :  Document) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.DocumentDetailsPrint {
      return super.CurrentLocation as pcf.DocumentDetailsPrint
    }
    
    property get DocumentParam () : Document {
      return getVariableValue("DocumentParam", 0) as Document
    }
    
    property set DocumentParam ($arg :  Document) {
      setVariableValue("DocumentParam", 0, $arg)
    }
    
    
  }
  
  
}