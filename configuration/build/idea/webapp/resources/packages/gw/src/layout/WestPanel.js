/**
 * Special widget for west panel
 */
Ext.define('gw.layout.WestPanel', {
    extend: 'Ext.panel.Panel', // Needs to be a Panel in order to be collapsible, but not Container
    alias: 'widget.gwestpanel',
    alternateClassName: ['gw.westpanel'],
    stateful: true,
    stateId: 'gw-leftnav',

    id          : 'westPanel',
    layout      : 'anchor',
    region      : 'west',
    collapseMode: 'mini',
    scrollable  : true,
    header      : false,
    collapsible : true,
    hidden      : true,
    split       : true,
    border      : false,
    style       : {padding: 0},
    //@UpgradedSencha 5.1
    //Note: To use it with CMD move property declaration in to  initComponent method
    width       : gw.ThemingConstants.westPanelWidth,
    defaults    : {
        anchor: '0'
    },
    hideCollapseTool: true,     // only collapse west panel thru the splitter
    floatable       : true,  // allow floating when clicking on title bar

    WEST_PANEL_CHILD_PROP: ['actionsButton', 'accelerated', 'menuTree', 'menuLinks', 'independent'],
    WEST_PANEL_CURRENT_PROP: ['currentAccelerated', 'currentMenuLinks', 'currentIndependent'],
    WEST_PANEL_CURRENT_PATH_PROP: {
        currentAccelerated: 1,
        currentMenuLinks: 3,
        currentIndependent: 4
    },

    initComponent: function() {
        var me = this;

        me.updateProps(me.getProperties());
        me.clearProperties();
        me.callParent(arguments);
        if (Ext.isIE) {
            // Fixed PLWEB-4801: Hide Left Nav feature breaks navigation in IE - add a special handler for IE only
            // that fires on show
            me.on({show: me.showOnIEFix});
        }
    },

    getProperties: function() {
        var me  = this,
            obj = Ext.copyTo({}, me, me.WEST_PANEL_CURRENT_PROP);
        return Ext.copyTo(obj, me, me.WEST_PANEL_CHILD_PROP);
    },

    clearProperties: function() {
        var me = this,
            props = [].concat(me.WEST_PANEL_CHILD_PROP).concat(me.WEST_PANEL_CURRENT_PROP);

        Ext.each(props, function(prop) {
            delete me[prop];
        });
    },

    privates: {
        applyDefaults: function (config) {

            // action button
            if (config.ui === 'action') {
                Ext.applyIf(config, {
                    margin: '9px 12px',
                    iconCls: 'ico-action',
                    iconAlign: 'right',
                    textAlign: 'left'
                });
            }

            // treepanel (Default Root Group type)
            if (config.items && config.items[0] && config.items[0].xtype === 'treepanel') {
                Ext.apply(config.items[0], {
                    viewConfig: {
                        navigationModel: 'treepanel'
                    }
                });
            }

            // treepanels
            if (config.xtype === 'accordionpanel') {
                config.useArrows = true;
                config.border = config.bodyBorder = false;
            }

            // panel with only one tree child with fixed height, inherit height
            if (config.items && config.items.length === 1 && config.items[0].height) {
                Ext.apply(config, {
                    layout: 'fit',
                    height: config.items[0].height,
                    scrollable: false,
                    scroll: false,
                    border: false
                });
                Ext.apply(config.items[0], {
                    border: false,
                    bodyBorder: false,
                    height: null,
                    scrollable: true,
                    useArrows: true
                });
            }

            // no height defined
            else if (!config.height) {
                config.manageHeight = false;
            }

            return this.callParent(arguments);
        }
    },

    /**
     * Updates properties in order
     * @param config map of properties
     */
    updateProps: function(config) {
        var i, len, propConfig, placeholders,
            me = this,
            hasChanges = false;
        me.suspendLayouts();

        if (Ext.isIE && me.hidden) {
            // if it's IE and we are hidden then we are going to remember that we were once hidden.
            me.wasIEHidden = true;
        }

        // guarantee placeholders
        if (!me.items || me.items.length === 0) {
            hasChanges = true;
            placeholders = [
                {xtype: 'component', hidden: true}, // actions button
                {xtype: 'component', hidden: true}, // accelerated menu links
                {xtype: 'component', hidden: true}, // menu tree
                {xtype: 'component', hidden: true}, // menu links
                {xtype: 'component', hidden: true}  // independent steps
            ];

            if (!me.items || Ext.isArray(me.items)) {
                me.items = placeholders;

            }
            else {
                me.add(placeholders);
            }
        }

        // first, update child properties
        for (i = 0, len = me.WEST_PANEL_CHILD_PROP.length; i < len; i++) {
            propConfig = config[me.WEST_PANEL_CHILD_PROP[i]];
            if (propConfig && me.replaceItemAt(propConfig, i) === true) {
                hasChanges = true;
            }
        }

        // second, set "current" path, after all children are updated
        me.expandCurrentItems(config);

        // PLWEB-4826 splitter disappears after re-logged in with a minimimized west panel
        // When a west panel renders, there should never be a case where the splitter is hidden
        if (me.splitter && me.splitter.isHidden()) {
            me.splitter.show();
        }
        // clear flags
        me.resumeLayouts(hasChanges);
    },

    /**
     * Expands child items that are "current", recursively
     * @param menuLinks the parent comp
     * @param config an array of "current" child item id in order, starting from the top
     */
    expandCurrentItems: function(config) {
        var me = this,
            currentPathProperties = me.WEST_PANEL_CURRENT_PATH_PROP,
            k, currentPath, treePanel, treePanelIndex;

        for (k in currentPathProperties) {
            if (currentPathProperties.hasOwnProperty(k)) {

                currentPath     = config[k];
                treePanelIndex  = currentPathProperties[k];
                treePanel       = Ext.isArray(me.items) ? me.items[treePanelIndex] : me.getComponent(treePanelIndex);

                if (currentPath) {
                    treePanel.autoSelectionPath = currentPath.length > 0 ? currentPath[currentPath.length - 1] : null;
                }
            }
        }
    },

    replaceItemAt: function(newItem, index) {
        var me = this;

        if (!me.items.get) { // me hasn't been initialized, simply override the config
            me.items[index] = newItem;
        }
        else {

            var oldItem = me.items.get(index);

            // avoid unnecessary replaces by checking if items, id, or visibility changed
            var idChanged           = oldItem.id !== newItem.id,
                itemsChanged        = !(me.countItems(oldItem) === 0 && me.countItems(newItem) === 0),
                visibilityChanged   = !((oldItem.hidden || false) === (newItem.hidden || false));

            if (!itemsChanged && !visibilityChanged && !idChanged) {
                return false; //no changes
            }

            // replace
            me.remove(oldItem);
            newItem = me.insert(index, newItem);
        }

        return true; //changes made
    },

    countItems: function(item) {
        var me = this;

        var directItems = (item.items ? item.items.length : 0);
        var menuItems = (item.menu ? me.countItems(item.menu) : 0);
        return directItems + menuItems;
    },

    showOnIEFix: function() {
        var me = this;
        if (me.wasIEHidden && !me.hidden) {
            // we were once hidden and now we are visible, so redraw the element after a slight delay
            // so that our components are properly shown.  This delay seems necessary to push the redraw() command out
            // of the scope of the normal event processing, so that it happens after the resumeLayouts() call has
            // finished.
            Ext.defer(function() {
                this.el.redraw();
            }, 1, me);
        }
        delete me.wasIEHidden;
    }
});