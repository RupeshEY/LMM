Ext.define('gw.override.layout.container.boxOverflow.Menu', {
    override: 'Ext.layout.container.boxOverflow.Menu',

    //@UpgradedSencha 5.1 Ticket: EXTJS-16784 Moving item from toolbar overflow back to visible position disables menu on buttons with menu
    //Fix menu showing after overflow #14715
    //Good for 5.1.1

    constructor: function(config) {
        var me = this;

        me.callParent([config]);

        /**
         * @property {Array} menuItems
         * Array of all items that are currently hidden and should go into the dropdown menu
         */
        me.menuItems = [];
    },

    beginLayout: function (ownerContext) {
        this.callSuper([ownerContext]);      //bypass parent since the parent the whole purpose is to override the parent

        // Before layout, we need to re-show all items which we may have hidden due to a
        // previous overflow...
        this.clearOverflow(ownerContext);
    },

    beginLayoutCycle: function (ownerContext, firstCycle) {
        this.callParent([ownerContext, firstCycle]);

        if (!firstCycle) {
            // if we are being re-run, we need to clear any overflow from the last run and
            // recache the childItems collection
            this.clearOverflow(ownerContext);

            this.layout.cacheChildItems(ownerContext);
        }
    },

    clearItem: function(comp) {
        var menu = comp.menu;

        if (comp.isButton && menu) {
            // If the button had a menu, forcibly set it
            // again so that the ownerCmp is reset correctly
            // and is no longer pointing at the overflow
            comp.setMenu(menu, false);
        }
    },

    getSuffixConfig: function() {
        var me = this,
            layout = me.layout,
            owner = layout.owner,
            oid = owner.id;

        /**
         * @private
         * @property {Ext.menu.Menu} menu
         * The expand menu - holds items for every item that cannot be shown
         * because the container is currently not large enough.
         */
        me.menu = new Ext.menu.Menu({
            listeners: {
                scope: me,
                beforeshow: me.beforeMenuShow
            }
        });

        /**
         * @private
         * @property {Ext.button.Button} menuTrigger
         * The expand button which triggers the overflow menu to be shown
         */
        me.menuTrigger = new Ext.button.Button({
            id: oid + '-menu-trigger',
            cls: me.menuCls + '-after ' + Ext.baseCSSPrefix + 'toolbar-item',
            plain: owner.usePlainButtons,
            ownerCt: owner, // To enable the Menu to ascertain a valid zIndexManager owner in the same tree
            ownerLayout: layout,
            iconCls: Ext.baseCSSPrefix + me.getOwnerType(owner) + '-more-icon',
            ui: owner.defaultButtonUI || 'default',
            menu: me.menu,
            // Menu will be empty when we're showing it because we populate items after
            showEmptyMenu: true,
            getSplitCls: function() { return '';}
        });

        return me.menuTrigger.getRenderTree();
    },

    clearOverflow: function(ownerContext) {
        var me = this,
            items = me.menuItems,
            length = items.length,
            owner = me.layout.owner,
            asLayoutRoot = owner._asLayoutRoot,
            item, i;

        owner.suspendLayouts();
        me.captureChildElements();
        me.hideTrigger();
        owner.resumeLayouts();

        for (i = 0; i < length; i++) {
            item = items[i];

            // What we are doing here is preventing the layout bubble from invalidating our
            // owner component. We need just the button to be added to the layout run.
            item.suspendLayouts();
            item.show();
            me.clearItem(item);
            item.resumeLayouts(asLayoutRoot);
        }

        items.length = 0;
    },

    showTrigger: function(ownerContext) {
        var me = this,
            layout = me.layout,
            owner = layout.owner,
            names = layout.names,
            startProp = names.x,
            sizeProp = names.width,
            plan = ownerContext.state.boxPlan,
            available = plan.targetSize[sizeProp],
            childItems = ownerContext.childItems,
            menuTrigger = me.menuTrigger,
            menuItems = me.menuItems,
            childContext, comp, i, props, len;

        // We don't want the menuTrigger.show to cause owner's layout to be invalidated, so
        // we force just the button to be invalidated and added to the current run.
        menuTrigger.suspendLayouts();
        menuTrigger.show();
        menuTrigger.resumeLayouts(me._asLayoutRoot);

        available -= me.triggerTotalWidth;

        owner.suspendLayouts();

        // Hide all items which are off the end, and store them to allow them to be restored
        // before each layout operation.
        for (i = 0, len = menuItems.length; i < len; ++i) {
            me.clearItem(menuItems[i]);
        }
        menuItems.length = 0;

        for (i = 0, len = childItems.length; i < len; i++) {
            childContext = childItems[i];
            props = childContext.props;
            if (props[startProp] + props[sizeProp] > available) {
                comp = childContext.target;
                me.menuItems.push(comp);
                comp.hide();
            }
        }

        owner.resumeLayouts();
    },

    // End override -----------

    //Factors in the change from above implementation.
    //Has to be reverted once EXTJS-16784 is merged (5.1.1)
    createMenuConfig: function (component, hideOnClick) {
        var id = component.initialConfig.id; //added

        var config = Ext.apply({}, component.initialConfig),
            group  = component.toggleGroup;

        Ext.copyTo(config, component, [
            'iconCls', 'icon', 'itemId', 'disabled', 'handler', 'scope', 'menu', 'tabIndex'
        ]);

        Ext.applyIf(config, {
            text: component.overflowText || component.text,
            hideOnClick: hideOnClick,
            destroyMenu: false,
            listeners: null
        });

        // Clone must have same value, and must sync original's value on change
        if (component.isFormField) {
            config.value = component.getValue();

            // Sync the original component's value when the clone changes value.
            // This intentionally overwrites any developer-configured change listener on the clone.
            // That's because we monitor the clone's change event, and sync the
            // original field by calling setValue, so the original field's change
            // event will still fire.
            config.listeners = {
                change: function(c, newVal, oldVal) {
                    component.setValue(newVal);
                }
            };
        }

        // ToggleButtons become CheckItems
        else if (group || component.enableToggle) {
            Ext.apply(config, {
                hideOnClick: false,
                group: group,
                checked: component.pressed,
                handler: function (item, e) {
                    component.onClick(e);
                }
            });
        }

        // Buttons may have their text or icon changed - this must be propagated to the clone in the overflow menu
        if (component.isButton && !component.changeListenersAdded) {
            component.on({
                textchange: this.onButtonAttrChange,
                iconchange: this.onButtonAttrChange,
                toggle: this.onButtonToggle
            });
            component.changeListenersAdded = true;
        }

        // Typically margins are used to separate items in a toolbar
        // but don't really make a lot of sense in a menu, so we strip
        // them out here.
        delete config.margin;
        delete config.ownerCt;
        delete config.xtype;
        delete config.id;
        delete config.itemId;

        Ext.applyIf(config, {xtype: 'gmenuitem', eventId: id}); // added
        return config;
    },

    // @private
    // @UpgradedSencha 5.1.1 IE reflow is broken, hard-code to 36px
    captureChildElements: function() {
        var me = this,
            menuTrigger = me.menuTrigger,
            names = me.layout.names;

        // The rendering flag is set when getRenderTree is called which we do when returning markup string for the owning layout's "suffix"
        if (menuTrigger.rendering) {
            menuTrigger.finishRender();
            if (Ext.isIE) {
                me.triggerTotalWidth = 36;  //PLWEB-6059: IE dies when you try to get the offsetWidth. Something is wrong with the reflow.
            } else {
                me.triggerTotalWidth = menuTrigger[names.getWidth]() + menuTrigger.el.getMargin(names.parallelMargins);
            }
        }
    }
});