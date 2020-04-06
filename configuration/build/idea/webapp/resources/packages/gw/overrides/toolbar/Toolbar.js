/**
 * Do not add leading separator or adjacent toolbar separators.
 * @UpgradedSencha 5.1 - Also allow for tab focusing within the container.
 */
Ext.define('gw.override.toolbar.Toolbar', {
  override: 'Ext.toolbar.Toolbar',
  uses: ['Ext.toolbar.Separator'],
  mixins: ['gw.util.TabFocusableContainer'],

  initComponent: function () {
    this.on('beforeadd', function (container, comp, index) {
      if (comp instanceof Ext.toolbar.Separator && (
        index === 0 || container.items.get(index - 1) instanceof Ext.toolbar.Separator
        )) {
        comp.destroy();
        return false;
      }
    });

    this.callParent(arguments);
  },

  privates: {
    // @private
    initDefaultFocusable: function (beforeRender) {
      var me = this,
          activeIndex = me.activeChildTabIndex,
          haveFocusable = false,
          // @UpgradedSencha 5.1 - handle shift-tab properly
          // Override - detect whether the event object is a key event with the shift key held
          keyEvents = ['keydown', 'keypress'],
          forward = Ext.EventObject && Ext.Array.contains(keyEvents, Ext.EventObject.type) ? !Ext.EventObject.shiftKey : true,
          // End - Override
          items, item, i, len, tabIdx;

      items = me.getFocusables();
      len   = items.length;

      if (!len) {
        return;
      }

      // Check if any child Focusable is already active.
      // Note that we're not determining *which* focusable child
      // to focus here, only that we have some focusables.
      for (i = 0; i < len; i++) {
        item = items[i];

        if (item.focusable) {
          haveFocusable = true;
          tabIdx = item.getTabIndex();

          if (tabIdx != null && tabIdx >= activeIndex) {
            return item;
          }
        }
      }

      // No interactive children found, no point in going further
      if (!haveFocusable) {
        return;
      }

      // No child is focusable by default, so the first *interactive*
      // one gets initial childTabIndex. We are not looking for a focusable
      // child here because it may not be focusable yet if this happens
      // before rendering; we assume that an interactive child will become
      // focusable later and now activateFocusable() will just assign it
      // the respective tabIndex.
      //
      // Override - Handle shift tabbing properly
      //item = me.findNextFocusableChild(null, true, items, beforeRender);
      item = me.findNextFocusableChild(null, forward, items, beforeRender);
      // End - Override
      if (item) {
        me.activateFocusable(item);
      }

      return item;
    }
  }

});