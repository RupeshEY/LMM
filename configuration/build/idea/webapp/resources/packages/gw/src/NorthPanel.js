/**
 * Special widget for north panel
 */
Ext.define('gw.NorthPanel', {
    extend: 'Ext.Container',
    xtype: 'gnorthpanel',
    uses: ['gw.Util'],

    currentTabId: undefined,
    region: 'north',
    id: 'northPanel',
    layout: {
        type: 'vbox',
        align: 'stretch'
    },
    ui: 'top-navigation',
    border: false,
    hidden: true,
    defaults: {
        border: false
    },

    initComponent: function () {
        var tabLinkConfig, tabConfig, infoBarConfig, quickJumpConfig, systemAlertBarConfig,
            me = this;

        tabLinkConfig = Ext.apply({
            id: gw.Util.getTabBarLinksId(),
            xtype: 'gtoolbar',
            // ui: 'top-links',
            ui: 'top-tabs',
            enableOverflow: false,
            //height: 30,
            //@UpgradedSencha 5.1 Theming support from JS for non CMD apps
            height: gw.ThemingConstants.northPanelBarHeight,
            defaults: {
                ui: 'plain-toolbar',
                arrowVisible: false
            }
        }, me.links);

        tabConfig = Ext.apply({
            flex: 1,
            id: gw.Util.getTabsId(),
            xtype: 'gtoolbar',
            ui: 'top-tabs',
            //height: 30,
            //@UpgradedSencha 5.1 Theming support from JS for non CMD apps
            height: gw.ThemingConstants.northPanelBarHeight,
            enableOverflow: true,
            defaults: {
                ui: 'gw-top-menu-toolbar'
            }
        }, me.tabs);

        systemAlertBarConfig = Ext.apply({
            id: 'systemAlertBar',
            hidden: !me.systemAlertBar || !me.systemAlertBar.items,
            xtype: 'panel',
            height: 77,
            border: false,
            cls: 'system_alert'
        }, me.systemAlertBar);

        infoBarConfig = Ext.apply({
            id: 'infoBar',
            hidden: !me.infoBar,
            xtype: 'gtoolbar',
            defaultType: 'gInfoBarItem',
            ui: 'top-info',
            height: 47
        }, me.infoBar);

        Ext.define('gw.gInfoBarItem', {
          extend: 'gw.ext.Button',
          alias: 'widget.gInfoBarItem',

          renderTpl:
            // PLWEB-4389 Removed unselectable attributes from the template
            //'<span id="{id}-btnWrap" data-ref="btnWrap" role="presentation" unselectable="on" style="{btnWrapStyle}" ' +
            '<span id="{id}-btnWrap" data-ref="btnWrap" role="presentation" style="{btnWrapStyle}" ' +
            'class="{btnWrapCls} {btnWrapCls}-{ui} {splitCls}{childElCls}">' +
            //'<span id="{id}-btnEl" data-ref="btnEl" role="presentation" unselectable="on" style="{btnElStyle}" ' +
            '<span id="{id}-btnEl" data-ref="btnEl" role="presentation" style="{btnElStyle}" ' +
            'class="{btnCls} {btnCls}-{ui} {textCls} {noTextCls} {hasIconCls} ' +
            '{iconAlignCls} {textAlignCls} {btnElAutoHeightCls}{childElCls}">' +
            '<tpl if="iconBeforeText">{[values.$comp.renderIcon(values)]}</tpl>' +
            //'<span id="{id}-btnInnerEl" data-ref="btnInnerEl" unselectable="on" ' +
            '<span id="{id}-btnInnerEl" data-ref="btnInnerEl" ' +
            'class="{innerCls} {innerCls}-{ui}{childElCls}">{text}</span>' +
            '<tpl if="!iconBeforeText">{[values.$comp.renderIcon(values)]}</tpl>' +
            '</span>' +
            '</span>' +
            '{[values.$comp.getAfterMarkup ? values.$comp.getAfterMarkup(values) : ""]}' +
              // if "closable" (tab) add a close element icon
            '<tpl if="closable">' +
            '<span id="{id}-closeEl" data-ref="closeEl" class="{baseCls}-close-btn">' +
            '<tpl if="closeText">' +
            ' {closeText}' +
            '</tpl>' +
            '</span>' +
            '</tpl>',


          initComponent: function () {
            var me = this;

            me.callParent(arguments);

            me.autoEl = {
              tag: 'a',
              hidefocus: 'on'
            };

            me.removeCls(Ext.baseCSSPrefix + 'unselectable');
          }
        });

        quickJumpConfig = Ext.apply({
            displayField: 'listText',
            id: 'QuickJump',
            modelId: 'g-quickjump-model',
            valueField: 'text',
            xtype: 'quickjump',
            width: 180
        }, me.QuickJump);

        // Set up a model for quick jump
        Ext.define('g-quickjump-model', {
            extend: 'Ext.data.Model',
            fields: [quickJumpConfig.displayField, quickJumpConfig.valueField]
        });

        var logo = {
            xtype: 'image',
            cls: 'product-logo',
            src: Ext.BLANK_IMAGE_URL,
            width: 200,
            //height: 30,
            height: gw.ThemingConstants.northPanelBarHeight,
            style: {
                'background-image': 'url(images/app/logo.png)',
                'background-position': '0px center',
                'background-repeat': 'no-repeat',
                'margin': "0 0 0 8px"
            }
        };

        me.items = [
            systemAlertBarConfig,
            {
                xtype: 'container',
                cls: 'g-banner',
                //height: 30,
                height: gw.ThemingConstants.northPanelBarHeight,
                layout: {
                    type: 'hbox',
                    align: 'middle'
                },
                items: [
                    logo, tabConfig, quickJumpConfig, tabLinkConfig
                ]
            },
            {
                xtype: 'component',
                cls: 'top-navigation-divisor',
                height: 5
            },
            infoBarConfig
        ];

        me.callParent(arguments);

    },

    /**
     * Updates style class for active tab
     * @param tabId tab id
     */
    setCurrentTab: function (tabId) {
        //If the current tab id is unchanged, do nothing
        if (this.currentTabId && this.currentTabId == tabId) {
            return;
        }
        this.currentTabId = tabId;

        var currentTab, lastVisible;

        Ext.suspendLayouts();
        // for each tab
        Ext.getCmp(gw.Util.getTabsId()).items.each(function (tab) {

            // save the last visible one
            if (tab.isVisible()) {
                lastVisible = tab;
            }

            // active/deactive tabs
            if (tabId === tab.id) {
                tab.addCls('gw-top-menu-selected');
                currentTab = tab;
            }
            else {
                tab.removeCls('gw-top-menu-selected');
            }
        });
        // if not visible, switch tabs position
        // Filed ticket EXTJS-16784. Moving item from toolbar overflow back to visible position disables menu on buttons with menu
        // At the moment there is no immediate fox for this.
        if (lastVisible && currentTab && !currentTab.isVisible()) {
            currentTab.show();

            var toolbar = currentTab.up(),
            //index = 0,
                toolbarInnerWidth = toolbar.getLayout().innerCt.getWidth(),
                lastVisibleRight = lastVisible.el.getLocalX() + lastVisible.el.getWidth() + lastVisible.margin$.right, //@SenchaUpdate margin$ is private
                availableSpace = toolbarInnerWidth - lastVisibleRight,
                currentTabWidth = currentTab.getWidth();

            // find open space
            if (currentTabWidth < availableSpace) {
                //index = toolbar.items.indexOf(lastVisible) + 1;

            }
            else {
                while (currentTabWidth > availableSpace) {
                    availableSpace += lastVisible.getWidth();

                    if (currentTabWidth < availableSpace || !lastVisible.previousSibling()) {
                        break;
                    }

                    lastVisible = lastVisible.previousSibling();
                }
            }

            //Move in to new location
            toolbar.moveBefore(currentTab, lastVisible);
        }

        Ext.resumeLayouts();
    },

    /**
     * Updates tab links
     * @param config config for all tab links
     */
    setLinks: function (config) {
        this._replaceItemsAndChecksum(Ext.getCmp(gw.Util.getTabBarLinksId()), config);
    },

    /**
     * Updates tabs
     * @param config config for all tabs
     */
    setTabs: function (config) {
        this._replaceItemsAndChecksum(Ext.getCmp(gw.Util.getTabsId()), config);
    },

    /**
     * Updates info bar
     * @param config info bar config
     */
    setInfoBar: function (config) {
        var infoBar = Ext.ComponentManager.get('infoBar');

        if (config.hidden) {
            if (infoBar.isVisible()) {
                infoBar.hide();
            }
            infoBar.checksum = null;
        }
        else {
            this._replaceItemsAndChecksum(infoBar, config);
        }
    },

    setSystemAlertBar: function (config) {
        var systemAlertBar = Ext.getCmp('systemAlertBar');
        if (!config.items) {
            if (systemAlertBar.isVisible()) {
                systemAlertBar.hide();
            }
            systemAlertBar.checksum = null;
        }
        else {
            this._replaceItemsAndChecksum(systemAlertBar, config);
        }
    },

    /**
     * Updates quickJump
     * @param config quick jump config
     */
    setQuickJump: function (config) {
        var quickJump = Ext.getCmp('QuickJump');

        if (config.hidden) {
            if (quickJump.isVisible()) {
                quickJump.hide();
            }
        }
        else if (!quickJump.isVisible()) {
            quickJump.show();
        }

        if (config.emptyText) {
            quickJump.updateEmptyText();
        }
    },

    /**
     * Replaces all items of a component, and updates its checksum property
     */
    _replaceItemsAndChecksum: function (comp, config) {
        gw.Util.replaceItems(comp, config);
        comp.checksum = config.checksum;
    }
});
