package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newnote/NoteTemplateSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NoteTemplateSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newnote/NoteTemplateSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoteTemplateSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at NoteTemplateSearchDV.pcf: line 45, column 41
    function def_onEnter_22 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at NoteTemplateSearchDV.pcf: line 45, column 41
    function def_refreshVariables_23 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at NoteTemplateSearchDV.pcf: line 30, column 67
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteTemplateSearchCriteria.Language = (__VALUE_TO_SET as typekey.LanguageType)
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at NoteTemplateSearchDV.pcf: line 36, column 39
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteTemplateSearchCriteria.Lob = (__VALUE_TO_SET as typekey.LossType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at NoteTemplateSearchDV.pcf: line 16, column 44
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteTemplateSearchCriteria.Topic = (__VALUE_TO_SET as typekey.NoteTopicType)
    }
    
    // 'value' attribute on TextInput (id=Keywords) at NoteTemplateSearchDV.pcf: line 41, column 54
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteTemplateSearchCriteria.Keywords = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at NoteTemplateSearchDV.pcf: line 22, column 39
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      NoteTemplateSearchCriteria.Type = (__VALUE_TO_SET as typekey.NoteType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at NoteTemplateSearchDV.pcf: line 16, column 44
    function valueRoot_3 () : java.lang.Object {
      return NoteTemplateSearchCriteria
    }
    
    // 'value' attribute on TypeKeyInput (id=Topic) at NoteTemplateSearchDV.pcf: line 16, column 44
    function value_0 () : typekey.NoteTopicType {
      return NoteTemplateSearchCriteria.Topic
    }
    
    // 'value' attribute on TypeKeyInput (id=LossType) at NoteTemplateSearchDV.pcf: line 36, column 39
    function value_14 () : typekey.LossType {
      return NoteTemplateSearchCriteria.Lob
    }
    
    // 'value' attribute on TextInput (id=Keywords) at NoteTemplateSearchDV.pcf: line 41, column 54
    function value_18 () : java.lang.String {
      return NoteTemplateSearchCriteria.Keywords
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at NoteTemplateSearchDV.pcf: line 22, column 39
    function value_4 () : typekey.NoteType {
      return NoteTemplateSearchCriteria.Type
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at NoteTemplateSearchDV.pcf: line 30, column 67
    function value_9 () : typekey.LanguageType {
      return NoteTemplateSearchCriteria.Language
    }
    
    // 'visible' attribute on TypeKeyInput (id=Language) at NoteTemplateSearchDV.pcf: line 30, column 67
    function visible_8 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    property get NoteTemplateSearchCriteria () : NoteTemplateSearchCriteria {
      return getRequireValue("NoteTemplateSearchCriteria", 0) as NoteTemplateSearchCriteria
    }
    
    property set NoteTemplateSearchCriteria ($arg :  NoteTemplateSearchCriteria) {
      setRequireValue("NoteTemplateSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}