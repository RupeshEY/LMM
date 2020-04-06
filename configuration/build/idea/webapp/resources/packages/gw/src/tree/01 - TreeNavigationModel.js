Ext.define('gw.tree.TreeNavigationModel', {
  extend: 'Ext.tree.NavigationModel',

  alias: 'view.navigation.treeNav',

    /**
     * The thing in the navigation model that causes the current focused element to also become immediately selected is
     * the 'navigation' event that is fired automatically with an event unless the preventNavigation parameter is set to
     * true.  In order to automatically turn this off for any keyboard navigation except for when we want it, we override
     * this method that will generally transform any falsey value for preventNav into true, when the overridePreventNav
     * method is not defined and we have a 'key' event.  When it IS defined, we use that value instead.
     *
     * @param recordIndex
     * @param columnIndex
     * @param keyEvent
     * @param suppressEvent
     * @param preventNav
     * @param overridePreventNavigation
     */

  //@private
  setPosition: function(recordIndex, columnIndex, event, suppressEvent, preventNav, overridePreventNav) {
    var eventType = event && event.type ? event.type.toLowerCase() : "",
      isKeyEvent = eventType.indexOf("key") == 0,
      prevent = overridePreventNav !== undefined ? overridePreventNav : preventNav || isKeyEvent;
    this.callParent([recordIndex, columnIndex, event, suppressEvent, prevent]);
  }

});