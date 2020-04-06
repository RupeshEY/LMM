/**
 * PLWEB-5357: Adding enter key support for the tree panel, mostly used by organizations
 *
 * Delegating the up, down, left and right keys to NavigationModel
 */
Ext.define('gw.tree.TreePanelNavigationModel', {
  extend: 'gw.tree.TreeNavigationModel',

  alias: 'view.navigation.treepanel',

  onKeyEnter: function(keyEvent) {
    var me = this,
        record = me.record;

    me.view.panel.doClick(me.view.panel, record, keyEvent);
  }

});