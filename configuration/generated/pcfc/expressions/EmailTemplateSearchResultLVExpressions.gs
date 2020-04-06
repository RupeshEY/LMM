package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EmailTemplateSearchResultLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmailTemplateSearchResultLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EmailTemplateSearchResultLV.pcf: line 20, column 49
    function sortValue_0 (EmailTemplateDescriptor :  gw.plugin.email.IEmailTemplateDescriptor) : java.lang.Object {
      return EmailTemplateDescriptor.Name
    }
    
    // 'value' attribute on RowIterator at EmailTemplateSearchResultLV.pcf: line 24, column 50
    function sortValue_1 (EmailTemplateDescriptor :  gw.plugin.email.IEmailTemplateDescriptor) : java.lang.Object {
      return EmailTemplateDescriptor.Topic
    }
    
    // 'sortBy' attribute on RowIterator at EmailTemplateSearchResultLV.pcf: line 31, column 69
    function sortValue_3 (EmailTemplateDescriptor :  gw.plugin.email.IEmailTemplateDescriptor) : java.lang.Object {
      return EmailTemplateDescriptor.Locale
    }
    
    // 'value' attribute on RowIterator at EmailTemplateSearchResultLV.pcf: line 15, column 62
    function value_14 () : gw.plugin.email.IEmailTemplateDescriptor[] {
      return EmailTemplateDescriptorList
    }
    
    // 'visible' attribute on RowIterator at EmailTemplateSearchResultLV.pcf: line 31, column 69
    function visible_2 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    property get EmailTemplateDescriptorList () : gw.plugin.email.IEmailTemplateDescriptor[] {
      return getRequireValue("EmailTemplateDescriptorList", 0) as gw.plugin.email.IEmailTemplateDescriptor[]
    }
    
    property set EmailTemplateDescriptorList ($arg :  gw.plugin.email.IEmailTemplateDescriptor[]) {
      setRequireValue("EmailTemplateDescriptorList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/email/EmailTemplateSearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EmailTemplateSearchResultLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickValue' attribute on RowIterator at EmailTemplateSearchResultLV.pcf: line 15, column 62
    function pickValue_13 () : gw.plugin.email.IEmailTemplateDescriptor {
      return EmailTemplateDescriptor
    }
    
    // 'value' attribute on TextCell (id=Template) at EmailTemplateSearchResultLV.pcf: line 20, column 49
    function valueRoot_6 () : java.lang.Object {
      return EmailTemplateDescriptor
    }
    
    // 'value' attribute on TypeKeyCell (id=Language) at EmailTemplateSearchResultLV.pcf: line 31, column 69
    function value_11 () : typekey.LanguageType {
      return gw.api.util.LocaleUtil.toLanguageType(EmailTemplateDescriptor.Locale)
    }
    
    // 'value' attribute on TextCell (id=Template) at EmailTemplateSearchResultLV.pcf: line 20, column 49
    function value_4 () : java.lang.String {
      return EmailTemplateDescriptor.Name
    }
    
    // 'value' attribute on TextCell (id=Topic) at EmailTemplateSearchResultLV.pcf: line 24, column 50
    function value_7 () : java.lang.String {
      return EmailTemplateDescriptor.Topic
    }
    
    // 'visible' attribute on TypeKeyCell (id=Language) at EmailTemplateSearchResultLV.pcf: line 31, column 69
    function visible_10 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    property get EmailTemplateDescriptor () : gw.plugin.email.IEmailTemplateDescriptor {
      return getIteratedValue(1) as gw.plugin.email.IEmailTemplateDescriptor
    }
    
    
  }
  
  
}