/**
 * Adds the ability to change the focus within a focusable container using the tab key.
 * By default, a focusable container will move the focus to the next container/component
 * in the tab order.  This mixin is designed to augment the Ext.util.FocusableContainer mixin and
 * provide support for using the Tab key to navigate through the container.  It also allows
 * for the default left-right arrow key navigation to be disabled.
 *
 * @UpgradedSencha 5.1 - allow tabbing through toolbars and the like
 */
Ext.define('gw.util.TabFocusableContainer', {
  extend: 'Ext.Mixin',
  mixinConfig: {
    id: 'tabfocusablecontainer',

    after: {
      afterRender: 'initTabFocusableContainer'
    }
  },

  disableArrowKeyNavigation: false,
  disableTabKeyNavigation: false, // Allows the ability to disable this mixin for Aria based themes
  privates: {
    initTabFocusableContainer: function() {
      var me = this;
      if (me.disableTabKeyNavigation) {
        return;
      }
      // Allow nested containers to optionally disable
      // children containers' behavior
      // @SenchaUpgrade - the enableFocusableContainer flag is part of the Ext.util.FocusableContainer mixin
      // and this logic was adapted from the initFocusableContainer() method on that class.
      if (me.enableFocusableContainer) {
        if (me.focusableKeyNav) {
          me.doInitTabFocusableContainer();
        } else {
          // If the focusableKeyNav has not yet been initialized by the Ext.util.FocusableContainer initialization,
          // then callback to the initialize method in a few milliseconds.  Hopefully the afterRender callback for that
          // class will have completed by then.
          Ext.defer(me.initTabFocusableContainer, 5, me);
        }
      }
    },
    /**
     * @SenchaUpgrade Adapts the existing Ext.util.FocusableContainer's focusableKeyNav, but switching out the
     * tab (and optionally arrow key) handler(s) from the keyNav's original config.  The config is then replaced and
     * if the focusableKeyNav's keymap has been initialized, then reset the map's bindings and re-add the bindings given
     * the updated config.  This has significant knowledge around the initialization of the KeyNav and KeyMap classes
     * from ExtJs.
     */
    doInitTabFocusableContainer: function() {
      var me = this,
          keyNav = me.focusableKeyNav;
      var config = Ext.apply(keyNav.config, {
        tab: me.onInnerTabKeyNavigation
      });
      if (me.disableArrowKeyNavigation) {
        config = Ext.apply(config, {
          up: me.onDisabledKeyNavigation,
          down: me.onDisabledKeyNavigation,
          left: me.onDisabledKeyNavigation,
          right: me.onDisabledKeyNavigation
        });
      }
      keyNav.config = config;
      if (keyNav.map) {
        keyNav.map.bindings = [];
        keyNav.addBindings(config);
      }
    },
    /**
     * @SenchaUpgrade Uses code (either directly or adapted from) the Ext.util.FocusableContainer's set of private
     * methods to navigate the focusable container with the same code that the arrow key navigation uses, only put
     * in some checks to make sure we exit the container when the tab represents a movement outside of the contained
     * set of children.
     */
    onInnerTabKeyNavigation: function(e) {
      var me = this,
          child = me.getFocusableFromEvent(e),
          forward = !e.shiftKey,
          newChild = me.findNextFocusableChild(child, forward),
          items = me.getFocusables(),
          startIndex = Ext.Array.indexOf(items, child),
          newIndex = Ext.Array.indexOf(items, newChild);

      // Check to see if we have a new child element to which it is valid to move the focus to.  If we are moving
      // forward AND we started with a child that is an actual focusable child of the container (index != -1) AND
      // the new index is bigger than the start index, then we have a valid move forward.  If we are moving backward
      // AND 1) we started with child that was NOT an actual focusable child of the container (index == -1) OR 2) the
      // new index is less than the start index, then we have a valid move backward.
      if (newChild &&
          ((forward && startIndex != -1 && startIndex < newIndex) ||
           (!forward && (startIndex == -1 || startIndex > newIndex)))) {
        // We have a valid move within the container, set the focus to the new child and stop the processing of
        // this event since the tab is officially considered 'consumed' at this point.
        newChild.focus();
        e.stopEvent();
      } else {
        // No proper move, thus we are leaving the container, reset last focused child so that the next enter via
        // tab will compute the proper child element to be focused on
        me.lastFocusedChild = null;
      }
      return newChild;
    },

    onDisabledKeyNavigation: function() {
      return true;
    }
  }
});
