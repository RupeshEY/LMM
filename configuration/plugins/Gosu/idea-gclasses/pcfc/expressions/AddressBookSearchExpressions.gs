package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookSearchExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookSearch.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookSearchExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterReturnFromPopup' attribute on Page (id=AddressBookSearch) at AddressBookSearch.pcf: line 11, column 69
    function afterReturnFromPopup_2 (popupCommitted :  boolean) : void {
      gw.api.util.SearchUtil.search(CurrentLocation)
    }
    
    // 'canVisit' attribute on Page (id=AddressBookSearch) at AddressBookSearch.pcf: line 11, column 69
    static function canVisit_3 () : java.lang.Boolean {
      return perm.Contact.viewsearchab
    }
    
    // 'def' attribute on ScreenRef at AddressBookSearch.pcf: line 15, column 85
    function def_onEnter_0 (def :  pcf.AddressBookSearchScreen) : void {
      def.onEnter(false, entity.Contact, null, false, {}, false)
    }
    
    // 'def' attribute on ScreenRef at AddressBookSearch.pcf: line 15, column 85
    function def_refreshVariables_1 (def :  pcf.AddressBookSearchScreen) : void {
      def.refreshVariables(false, entity.Contact, null, false, {}, false)
    }
    
    // Page (id=AddressBookSearch) at AddressBookSearch.pcf: line 11, column 69
    static function parent_4 () : pcf.api.Destination {
      return pcf.AddressBook.createDestination()
    }
    
    override property get CurrentLocation () : pcf.AddressBookSearch {
      return super.CurrentLocation as pcf.AddressBookSearch
    }
    
    
  }
  
  
}