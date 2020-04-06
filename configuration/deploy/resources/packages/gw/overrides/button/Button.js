Ext.define('gw.override.button.Button', {
  override: 'Ext.button.Button',
  uses: ['gw.Util'],
  // @UpgradedSencha 5.1, This delay is needed by ExtJs to make a feature work properly, but the delay breaks the tests.
  // Therefore, we need to be able to change this value in our test suite to pass tests, so we make the
  // menuClickBuffer value an internal constant that can be overridden in the tests.
  defaultMenuClickBuffer: 250,

  // PLWEB-5604 Clicking on Update Button after POC does not work in IE
  // With synthetic event in Ext 5.1, a force focus is introduced because
  // of unselectable in IE prevents button to take focus
  // This addition in turn disable the code in Guidewire where POC should
  // happen after mouse is released, so we need to manually call gw.app.onMouseDown
  // @private
  onMouseDown: function(e) {
    var me = this, targetEl;

    if (Ext.isIE || e.pointerType === 'touch') {
      // In IE the use of unselectable on the button's elements causes the element
      // to not receive focus, even when it is directly clicked.
      // On Touch devices, we need to explicitly focus on touchstart.

      // === begin override ===
      targetEl = me.getTargetEl();
      if (targetEl && targetEl.dom) {
        gw.app.onMouseDown(e, targetEl.dom);
      }
      // === end override ===

      me.getFocusEl().focus();
    }

    if (!me.disabled && e.button === 0) {
      Ext.button.Manager.onButtonMousedown(me, e);
      me.addCls(me._pressedCls);
    }
  },

  showMenu: function () {
    gw.Util.createAndShowOnDemandMenuIfNeeded(this);
    return this.callOverridden(arguments);
  },

  // @UpgradedSencha 5.1 - we do not want the button to have a _blank target if there is no href specified.
  // this breaks some tests with selenium and is a different behavior than the 4.x implementation which did not add
  // the target when the href was not specified.  Will file a bug against Sencha soon.
  enable: function (silent) {
    var me = this,
        retVal = this.callParent(arguments);
    if (!me.href && me.hrefTarget === '_blank' && me.el && me.el.dom) {
      me.el.dom.removeAttribute('target');
    }
    return retVal;
  },

  //UpgradedSencha 5.1 EXTJS-16784 Moving item from toolbar overflow back to visible position disables menu on buttons with menu
  //Can be removed once merged and upgraded to 5.1.1, but have to check against the changelog if this fix was actually merged
  setMenu: function (menu, destroyMenu, /* private */ initial) {
    var me = this,
        oldMenu = me.menu,
        instanced;

    if (oldMenu && !initial) {
      if (destroyMenu !== false && me.destroyMenu) {
        oldMenu.destroy();
      }
      oldMenu.ownerCmp = null;
    }

    if (menu) {
      instanced = menu.isMenu;
      // Retrieve menu by id or instantiate instance if needed.
      menu = Ext.menu.Manager.get(menu, {
        // Use ownerCmp as the upward link. Menus *must have no ownerCt* - they are global floaters.
        // Upward navigation is done using the up() method.
        ownerCmp: me
      });
      // We need to forcibly set this here because we could be passed an existing menu, which means
      // the config above won't get applied during creation.
      menu.setOwnerCmp(me, instanced);

      // Menu can't reshow within 250ms of being hidden.
      // Likewise, must set here in case an instantiated Menu is passed.
      // This is so that clicking on this button when the menu is visible
      // leaves the menu hidden. Mousedown hides it, and the click caused by
      // mouseup should not reshow.
      // @UpgradedSencha 5.1 - use the constant
      menu.menuClickBuffer = me.defaultMenuClickBuffer;

      me.mon(menu, {
        scope: me,
        show: me.onMenuShow,
        hide: me.onMenuHide
      });

      // If the button wasn't initially configured with a menu or has previously been unset then we need
      // to poke the split classes onto the btnWrap dom element.
      if (!oldMenu && me.getArrowVisible()) {
        me.split = true;
        if (me.rendered) {
          me._addSplitCls();
          me.updateLayout();
        }
      }

      me.menu = menu;
    } else {
      if (me.rendered) {
        me._removeSplitCls();
        me.updateLayout();
      }

      me.split = false;
      me.menu = null;
    }
  }
});
