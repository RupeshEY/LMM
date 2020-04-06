Ext.define('gw.ext.FieldSet', {
  extend: 'Ext.form.FieldSet',
  alias: 'widget.gfieldset',
  uses: ['gw.app', 'Ext.form.FieldSet'],

  initComponent: function() {
    var me = this;
    if (me.title && me.icon) {
      me.title = '<div style="padding-left:20px; background: no-repeat url(\'' + me.icon + '\')">' + me.title + '</div>';
    }
    me.callParent(arguments);
  },

  /**
   * @UpgradedSencha 5.1 - the legend is still visible when the fieldset is collapsed.
   *
   * PLWEB-4848: The collapsed field set's checkbox won't respond properly when it is given the focus via keyboard
   * unless the checkbox and it's legend container are marked with the special flag, collapseImmune = true.
   * This was found by digging into the Ext.Component.isHierarchicallyHidden() method which is called indirectly via
   * the canFocus() method in the Ext.util.Focusable.onFocus() method.  It seems by setting this flag, the UI now knows
   * that the legend and it's checkbox will still be visible even when the fieldset is considered collapsed, causing
   * canFocus() to return 'true' rather than the 'false' it returned before this fix.
   *
   * @private
   * @returns {*|Object}
   */
  createLegendCt: function () {
    var ct = this.callParent(arguments);
    ct.collapseImmune = true;
    return ct;
  },

  // fix the value and id for checkbox
  createCheckboxCmp: function () {
    var cb = this.callParent(arguments);
    cb.inputValue = 'true';
    cb.inputId = cb.name;
    cb.collapseImmune = true; // PLWEB-4848: the checkbox is still visible when the fieldset is collapsed.
    return cb;
  },

  privates: {
    // @SenchaUpgrade override ExtJs private method to support confirm dialog (async) and load content from server when expanding
    onCheckChange: function (cmp, checked) {
      var me = this;
      var newValue = this.checkboxCmp.getValue();
      var firstTimeExpand = false;
      if (me.checkboxCmp.getValue() && me.items.length == 0) {
        // need to load content from server when expanded for the first time
        firstTimeExpand = true;
      }
      gw.app.handleChange(me, newValue, !newValue, function (options, success, response) {
        // checking postedToServer to determine if separate request should be made.
        // loading content of the inputGroup will be part of poc if postOnChange is specified.
        if (firstTimeExpand &&
            (!options || (options && !options.postedToServer))) {
          // Makes a separate call to just expand the inputGroup if there was no post to server.
          var params = {};
          params[me.checkboxName] = me.checkboxCmp.inputValue;
          gw.app.requestViewRoot(me.id, params)
        }
        // invoke super
        Ext.form.FieldSet.prototype.onCheckChange.call(me, cmp, checked);
        // @SenchaUpgrade workaround an ExtJs4.2 bug that hierarchyState.collapsed is out of date:
        if (me.hierarchyState) {
          me.hierarchyState.invalid = true
        }
      }, firstTimeExpand ? {firstTimeExpand: true} : undefined)
    }
  }
});
