//@UpgradedSencha 5.1 - Fix for not hiding other menus that are open.
// Fix landed for 5.1.1 Ticket: EXTJS-16183, some other partial commits have changed this file.
// Including the all the latest changes from repo.
Ext.define('gw.override.menu.Manager', {
    override: 'Ext.menu.Manager',

    visible: [],

    constructor: function() {
        var me = this;

        // Lazily create the mousedown listener on first menu show
        me.onShow = function () {
            delete me.onShow; // remove this hook
            Ext.getBody().on('mousedown', me.checkActiveMenus, me);
            return me.onShow.apply(me, arguments); // do the real thing
        };
    },

    checkActiveMenus: function(e) {
        var allMenus = this.visible,
            len = allMenus.length,
            i, menu;

      // Hide the menus in reverse order as it seems the hiding of menus removes it from the visible list
        for (i = len - 1; i >= 0; --i) {
            menu = allMenus[i];
            if (!menu.containsFocus && !menu.owns(e)) {
                menu.hide();
            }
        }
    },

    /**
     * {@link Ext.menu.Menu#afterShow} adds itself to the visible list here.
     * @private
     */
    onShow: function(menu) {
        if (menu.floating) {
            Ext.Array.include(this.visible, menu);
        }
    },

    /**
     * {@link Ext.menu.Menu#onHide} removes itself from the visible list here.
     * @private
     */
    onHide: function(menu) {
        if (menu.floating) {
            Ext.Array.remove(this.visible, menu);
        }
    },

    /**
     * Hides all floating menus that are currently visible
     * @return {Boolean} success True if any active menus were hidden.
     */
    hideAll: function() {
        var allMenus = this.visible,
            len = allMenus.length,
            result = false,
            i;

        // Hide the menus in reverse order as it seems the hiding of menus removes it from the visible list
        for (i = len - 1; i >= 0; --i) {
          if (allMenus[i]) {
            allMenus[i].hide();
            result = true;
          }
        }
        return result;
    }
});
