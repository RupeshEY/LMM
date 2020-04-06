package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBook.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBook.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=AddressBook) at AddressBook.pcf: line 12, column 39
    function action_0 () : void {
      pcf.AddressBookSearch.go()
    }
    
    // 'location' attribute on LocationGroup (id=AddressBook) at AddressBook.pcf: line 12, column 39
    function action_dest_1 () : pcf.api.Destination {
      return pcf.AddressBookSearch.createDestination()
    }
    
    // LocationGroup (id=AddressBook) at AddressBook.pcf: line 7, column 64
    static function firstVisitableChildDestinationMethod_4 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.AddressBookSearch.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'tabBar' attribute on LocationGroup (id=AddressBook) at AddressBook.pcf: line 7, column 64
    function tabBar_onEnter_2 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=AddressBook) at AddressBook.pcf: line 7, column 64
    function tabBar_refreshVariables_3 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.AddressBook {
      return super.CurrentLocation as pcf.AddressBook
    }
    
    
  }
  
  
}