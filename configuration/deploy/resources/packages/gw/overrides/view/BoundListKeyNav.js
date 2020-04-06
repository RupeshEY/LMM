/**
 * Better fix from Sencha for the boundlist putting focus back on the input after collapse
 */
Ext.define('EXTJS-17372.view.BoundListKeyNav', {
  override : 'Ext.view.BoundListKeyNav',
  onKeyUp: function(e) {
    this.callParent(arguments);

    e.preventDefault();
  },
  onKeyDown: function(e) {
    this.callParent(arguments);

    e.preventDefault();
  },

  onKeyTab: function(e) {
    var view = this.view,
        field = view.pickerField;

    if (view.isVisible()) {
      // @UpgradedSencha. Do not select the highlighted item if this field has postOnChange
      // Let the blur event do the work for you
      if (field.selectOnTab && !field.postOnChange) {
        this.selectHighlighted(e);
      }

      if (field.collapse) {
        field.collapse();
      }
    }

    // Tab key event is allowed to propagate to field
    return true;
  }
});