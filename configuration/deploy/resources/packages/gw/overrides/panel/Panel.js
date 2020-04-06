Ext.define('gw.override.panel.Panel', {
  override: 'Ext.panel.Panel',

  /**
   * PLWEB-4815 SystemAlertBar has a different tabBar configuration. In this special case
   * this.getComponentLayout().getDockedItems will return 'undefined' when it tries to getDockedItems for
   * some previous tabBarItems. We need to add additional checking to make sure this.getComponentLayout().getDockedItems
   * is defined.
   * http://www.sencha.com/forum/showthread.php?181284-An-error-is-thrown-when-the-portal-is-put-inside-a-form-panel
   */
  getDockedItems: function(selector, beforeBody) {
    if (typeof(this.getComponentLayout().getDockedItems) === "function")
      return this.callOverridden([selector, beforeBody]);
    else
      return [];
  }
});