/**
 * Allows tabbing out from a grid panel.
 */
Ext.define('gw.override.selection.RowModel', {
  override: 'Ext.selection.RowModel',
  uses: ['Ext.grid.CellContext', 'gw.app'],
  //@UpgradedSencha 5.1 Match override implementation
  onEditorTab: function(editingPlugin, e) {
    var navModel = this.view.getNavigationModel(),
        position = navModel.getPosition();
    if (!position && editingPlugin && editingPlugin.context) {
      // If the navigation model has no position due to the editing plugin being active, set the editingPlugin's
      // context into the navigation model so that it knows where it is.
      navModel.setPosition(editingPlugin.context, null, e, true, true); // Suppress events and prevent navigation!
    }
    return navModel._handleTabKeyNavigation(e, editingPlugin);
  }

});
