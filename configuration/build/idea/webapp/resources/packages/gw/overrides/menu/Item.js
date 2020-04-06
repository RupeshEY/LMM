Ext.define('gw.override.menu.Item', {
    override: 'Ext.menu.Item',

  /**
   * @UpgradedSencha 5.1, make sure to mark the actual submenu of this menu as 
   */
    disable: function() {
      var me = this;
      if (me.menu && !me.menu.disabled) {
        me.menu.disabled = true;
      }
      me.callParent(arguments);
    },

    enable: function() {
      var me = this;
      if (me.menu && me.menu.disabled) {
        me.menu.disabled = false;
      }
      me.callParent(arguments);
    },

    //UpgradedSencha 5.1 EXTJS-16784 Moving item from toolbar overflow back to visible position disables menu on buttons with menu
    setMenu: function(menu, destroyMenu) {
        var me = this,
            oldMenu = me.menu,
            arrowEl = me.arrowEl,
            instanced;

        if (oldMenu) {
            oldMenu.ownerCmp = oldMenu.parentMenu = null;

            if (destroyMenu === true || (destroyMenu !== false && me.destroyMenu)) {
                Ext.destroy(oldMenu);
            }
        }
        if (menu) {
            instanced = menu.isMenu;
            menu = me.menu = Ext.menu.Manager.get(menu, {
                ownerCmp: me,
                focusOnToFront: false
            });
            // We need to forcibly set this here because we could be passed an existing menu, which means
            // the config above won't get applied during creation.
            menu.setOwnerCmp(me, instanced);
        } else {
            menu = me.menu = null;
        }

        if (menu && me.rendered && !me.destroying && arrowEl) {
            arrowEl[menu ? 'addCls' : 'removeCls'](me.arrowCls);
        }
    }
});

/**
 * @UpgradedSencha 5.1, don't expand disabled menu items.  Temporary fix for EXTJS-16319.  Remove when upgrading to a
 * version with the offical Sencha fix.
 */
Ext.define('EXTJS-16319.menu.Item', {
  override: 'Ext.menu.Item',
  /**
   * @param event
   * @param delay
   */
  expandMenu: function (event, delay) {
    if (!this.disabled) {
      this.callParent(arguments);
    }
  }

});