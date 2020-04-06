Ext.define('gw.override.form.RadioGroup', {
  override: 'Ext.form.RadioGroup',
  mixins: [
    'gw.util.TabFocusableContainer'
  ],

  formItemCls : 'g-radio-group',

  privates: {
    // @private
    initDefaultFocusable: function(beforeRender) {
      // @UpgradedSencha 5.1 - disable the auto-focusing to the selected value and handling shift-tab properly
      // begin -- Override
      var me = this,
          keyEvents = ['keydown', 'keypress'],
          forward = Ext.EventObject && Ext.Array.contains(keyEvents, Ext.EventObject.type) ? !Ext.EventObject.shiftKey : true,
          item;
      //var me = this,
      //    checked, item;
      //checked = me.getChecked();
      //
      //// In a Radio group, only one button is supposed to be checked
      ////<debug>
      //if (checked.length > 1) {
      //  Ext.log.error("RadioGroup " + me.id + " has more than one checked button");
      //}
      ////</debug>

      //// If we have a checked button, it gets the initial childTabIndex,
      //// otherwise the first button gets it
      //if (checked.length) {
      //  item = checked[0];
      //}
      //else {
      //  item = me.findNextFocusableChild(null, true, null, beforeRender);
      //}

      item = me.findNextFocusableChild(null, forward, null, beforeRender);
      // end -- override

      if (item) {
        me.activateFocusable(item);
      }

      return item;
    },

    // @private
    focusChild: function(radio, forward, e) {
      var nextRadio = this.mixins.focusablecontainer.focusChild.apply(this, arguments);

      // @UpgradedSencha 5.1 - disable the auto-value setting
      // begin -- Override
      //
      //// Ctrl-arrow does not select the radio that is going to be focused
      //if (!e.ctrlKey) {
      //  nextRadio.setValue(true);
      //}
      // End -- override
    }

  }
});
