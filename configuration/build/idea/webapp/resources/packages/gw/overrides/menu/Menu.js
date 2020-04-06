Ext.define('gw.override.menu.Menu', {
    override: 'Ext.menu.Menu',
    uses: ['gw.Util'],

    //@UpgradedSencha Some internal changes from latest repo. All addressed for 5.1.1
    menuClickBuffer: 0,

    // @SenchaUpgrade override private method to work around ExtJs bug:
    // Specifying default type for menu items on the menu is not supported
    lookupItemFromObject: function (cmp) {
        var me = this;
        if (cmp.xtype == null && me.defaultType != null && me.defaultType != 'panel') {
            cmp.xtype = me.defaultType;
        }
        return me.callOverridden(arguments);
    },
    /**
     * Extends super to support multi-column and flattened menu:
     */
    initComponent: function () {

        //--- @Sencha 5.1.1
        var me = this,
            cls = [Ext.baseCSSPrefix + 'menu'],
            bodyCls = me.bodyCls ? [me.bodyCls] : [],
            isFloating = me.floating !== false,
            listeners = {
                element: 'el',
                click: me.onClick,
                mouseover: me.onMouseOver,
                scope: me
            };

        if (Ext.supports.Touch) {
            listeners.pointerdown = me.onMouseOver;
        }
        me.on(listeners);
        me.on({
            beforeshow: me.onBeforeShow,
            scope: me
        });

        //----

        var items = me.items || (Ext.isArray(me.initialConfig) ? me.initialConfig : me.initialConfig.items);
        var bMultiColumn = me.numEntriesPerColumn > 0 && items && items.length > me.numEntriesPerColumn;

        if (bMultiColumn) { // multi-column menu

            Ext.apply(me, {
                border: false,
                bodyBorder: false,
                plain: true,
                showSeparator: false
            });
            me.addCls(Ext.baseCSSPrefix + 'columnmenu');
            me.items = [];

            var column = [],
                position = 0,
                itemsInColumn = 0;

            for (var i = 0; i < items.length; i++) {
                if (me.flattened) {
                    gw.Util.appendAndFlattenMenu(items[i], column);
                } else {
                    column.push(items[i]);
                }
                if (items[i].xtype !== 'menuseparator') {
                    itemsInColumn++;
                }
                if (itemsInColumn === me.numEntriesPerColumn) { // starts a new column
                    me.items.push({items: column, multiColumnMenu: true, columnPosition: position++});
                    column = [];
                    itemsInColumn = 0;
                }
            }
            if (column.length > 0) {
                me.items.push({items: column, multiColumnMenu: true, columnPosition: position++})
            }

            me.defaults = Ext.applyIf({
                floating: false,
                plain: true,
                //flex: 1,
                //style: {height: '100%'},
                border: false,
                bodyBorder: false,
                xtype: 'menu',
                cls: Ext.baseCSSPrefix + 'columnmenu-inner',
                defaultType: 'gmenuitem'
            }, me.defaults);

            if (Ext.isArray(me.initialConfig)) {
                me.initialConfig = undefined
            } else if (me.initialConfig) {
                me.initialConfig.items = undefined
            }
            //delete items; // <- @Sencha , me line is meaningless
        }
        else if (me.flattened) { // flattened single-column menu
            var flattened = [];
            Ext.each(me.items, function (item) {
                gw.Util.appendAndFlattenMenu(item, flattened)
            });
            delete me.items;
            me.items = flattened;
        }

        me.callOverridden(arguments);

        if (bMultiColumn) {
            //@UpgradedSencha Use 'hbox' layout
            me.layout = 'hbox';
        }
    },

    //@UpgradedSencha 5.1 Fix for floating menu hide. Fix laneded in Nightlies for 5.1.1 Ticket: EXTJS-16178
    onFocusLeave: function (e) {
        var me = this;

        me.callSuper([e]);
        me.mixins.focusablecontainer.onFocusLeave.call(me, e);
        if (me.floating) {
            me.hide();
        }
    },

    //@UpgradedSencha 5.1 Ticket: EXTJS-16219 - Menu hide on focusLeave should only be for floating menus
    onBoxReady: function() {
        var me = this,
            listeners = {
                click: me.onClick,
                mouseover: me.onMouseOver,
                scope: me
            },
            iconSeparatorCls = me._iconSeparatorCls;

        if (Ext.supports.Touch) {
            listeners.pointerdown = me.onMouseOver;
        }

        me.focusableKeyNav.map.processEvent = function(e) {
            // ESC may be from input fields, and FocusableContainers ignore keys from
            // input fields. We do not want to ignore ESC. ESC hide menus.
            if (e.keyCode === e.ESC) {
                e.target = me.el.dom;
            }
            return e;
        };

        // Handle ESC key
        me.focusableKeyNav.map.addBinding([{
            key: 27,
            handler: me.onEscapeKey,
            scope: me
        },
            // Handle character shotrcuts
            {
                key: /[\w]/,
                handler: me.onShortcutKey,
                scope: me,
                shift: false,
                ctrl: false,
                alt: false
            }]);

        me.callParent(arguments);

        // @UpgradedSencha 5.1 - the below line is copied directly from the overridden ExtJS code
        // TODO: Move this to a subTemplate When we support them in the future
        if (me.showSeparator) {
            me.iconSepEl = me.body.insertFirst({
                role: 'presentation',
                cls: iconSeparatorCls + ' ' + iconSeparatorCls + '-' + me.ui,
                html: '&#160;'
            });
        }

        me.mon(me.el, listeners);

        // Modern IE browsers have click events translated to PointerEvents, and b/c of this the
        // event isn't being canceled like it needs to be. So, we need to add an extra listener.
        if (Ext.supports.MSPointerEvents || Ext.supports.PointerEvents) {
            me.mon(me.el, {
                scope: me,
                click: me.preventClick,
                translate: false
            });
        }

        me.mouseMonitor = me.el.monitorMouseLeave(100, me.onMouseLeave, me);
    },


    //@UpgradedSencha 5.1 Fix for not hiding other menus that are open. Fix landed for 5.1.1 Ticket: EXTJS-16183
    onBeforeShow: function() {
        // Do not allow show immediately after a hide
        if (Ext.Date.getElapsed(this.lastHide) < this.menuClickBuffer) {
            return false;
        }
    },

    beforeShow: function() {
        var me = this,
            activeEl,
            viewHeight;

        // Constrain the height to the containing element's viewable area
        if (me.floating) {

            if (!me.parentMenu && !me.allowOtherMenus) {
                Ext.menu.Manager.hideAll();
            }
            // Only register a focusAnchor to return to on hide if the active element is not the document
            // If there's no focusAnchor, we return to the ownerCmp, or first focusable ancestor.
            activeEl = Ext.Element.getActiveElement();
            me.focusAnchor = activeEl === document.body ? null : activeEl;

            me.savedMaxHeight = me.maxHeight;
            viewHeight = me.container.getViewSize().height;
            me.maxHeight = Math.min(me.maxHeight || viewHeight, viewHeight);
        }

        me.callParent(arguments);
    },

    //@UpgradedSencha 5.1 Fix for not hiding other menus that are open. Fix landed for 5.1.1 Ticket: EXTJS-16183
    afterShow: function () {
        var me = this;

        me.callParent(arguments);
        Ext.menu.Manager.onShow(me);

        // Restore configured maxHeight
        if (me.floating && me.autoFocus) {
            me.maxHeight = me.savedMaxHeight;
            me.focus();
        }
    },

    //@UpgradedSencha 5.1 Fix for not hiding other menus that are open. Fix landed for 5.1.1 Ticket: EXTJS-16183
    onHide: function(animateTarget, cb, scope) {
        var me = this;
        me.callParent([animateTarget, cb, scope]);
        me.lastHide = Ext.Date.now();
        Ext.menu.Manager.onHide(me);
    },

    preventClick: function (e) {
        var item = this.getItemFromEvent(e);
        if (item && !item.href) {
            e.preventDefault();
        }
    },
    //---------- EO EXTJS-16183

    //@UpgradedSencha 5.1 Feature implementation for Left / Right key navigation between multi column menus

    // PLWEB-5803: Tabbing in a floating menu will do nothing, restoring Emerald functionality
    onFocusableContainerTabKey: function(e) {
        if (this.floating) {
            e.stopEvent();
            return false;
        }
    },

    onFocusableContainerLeftKey: function(e) {
        var me = this,
            parent = me.up();

        if (me.multiColumnMenu ) {

            if (me.columnPosition !== 0) {
                //move focus to menu on the left
                var leftMenu = me.up().down('menu[columnPosition='+ (me.columnPosition - 1) +']');
                if (leftMenu) {
                    me.focusFirstItem(leftMenu);
                }
            } else {
                //Left key on the far left column hides menu
                if (parent.floating) {
                    parent.hide();
                }
            }
            e.stopPropagation();
        } else {
            // If we are a submenu, then left arrow focuses the owning MenuItem
            if (me.parentMenu) {
                me.ownerCmp.focus();
            }
            me.hide();
        }
    },

    onFocusableContainerRightKey: function(e) {
        var me = this,
            focusItem = me.lastFocusedChild,
            parent = me.up(),
            rightMenu = parent ? parent.down('menu[columnPosition='+ (me.columnPosition + 1) +']') : null;

        if (focusItem && focusItem.expandMenu) {
            focusItem.expandMenu(e, 0);
            if (focusItem.menu && focusItem.menu.isVisible()) {
              // if there is a expanded menu being shown, then we are done.  Otherwise focusing on the right menu
              // below (if one exists) causes the expanded menu to be closed when the focus leaves it.
              return true;
            }
        }

        if (rightMenu) {
            me.focusFirstItem(rightMenu);
            return true;
        }
    },

    focusFirstItem: function(menu){
        var items = menu.items,
            len = items.length,
            i,
            item;

        for(i = 0; i < len ; i++){
            item = items.getAt(i);
            if (menu.canActivateItem(item)) {
                item.focus();
                break;
            }
        }
    },

    //UpgradedSencha 5.1 EXTJS-16784 Moving item from toolbar overflow back to visible position disables menu on buttons with menu
    privates: {
        setOwnerCmp: function(comp, instanced) {
            var me = this;

            me.parentMenu = comp.isMenuItem ? comp : null;
            me.ownerCmp = comp;
            me.registerWithOwnerCt();

            delete me.hierarchicallyHidden;
            if (me.inheritedState && instanced) {
                me.invalidateInheritedState();
            }
        }
    }

});
