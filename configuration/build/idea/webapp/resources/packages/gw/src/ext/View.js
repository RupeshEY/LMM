/**
 * View port for the app. Config properties:
 * <li> links - tabbar links (e.g. Logout)
 * <li> tabs - tabs in the tabbar
 * <li> infoBar - info bar
 * <li> west - left nav content
 * <li> center - main page content
 * <li> south - work space content
 */
Ext.define('gw.ext.View', {
    extend: 'Ext.container.Viewport',
    alias: 'widget.gview',
    constructor: function (config) {

        /**
         * Updates the worksheet count in the workspace title bar
         * @param southPanel workspace panel
         */
        function  updateWorksheetCount(southPanel) {
            if (southPanel.xtype === 'tabpanel') {
                southPanel.setTitle(gw.app.localize('ExtJS.View.Worksheet.Title', southPanel.items.getCount()));
            }
            // PLWEB-5731 splitbar on minimized workspace panel not appearing after logout
            // When a south panel renders, there should never be a case where the splitter is hidden
            if (southPanel.splitter && southPanel.splitter.isHidden()) {
                southPanel.splitter.show();
            }
        }

        var northConfig = {
            xtype: 'gnorthpanel',
            links: config.links,
            tabs: config.tabs,
            QuickJump: config.QuickJump,
            infoBar: config.infoBar,
            systemAlertBar: config.systemAlertBar,
            hidden: !config.links && !config.tabs && !config.infoBar && !config.QuickJump && !config.systemAlertBar
        };

        var westConfig = {
            xtype: 'gwestpanel'
        };

        if (config.west) {
            westConfig.hidden = false;
            Ext.apply(westConfig, config.west);
            delete config.west;
        }

        var centerConfig = Ext.apply({
            xtype: 'gcenterpanel'
        }, config.center);

        if(config.center){
            delete config.center;
        }

        var southConfig = {
            border: false,
            collapsible: true,
            height: 400,
            hidden: true,
            id: 'southPanel',
            region: 'south',
            floatable: false,
            header: true,
            headerPosition: 'bottom',
            stateful: true,
            stateId: 'gw-workspace',
            listeners: {
                // @SenchaUpgrade workaround ExtJs bug when hide() is called when the southPanel is floated
                beforehide: function () {
                    var me = this;
                    if (me.floated) {
                        me.slideOutFloatedPanel();
                    }
                },
                add: updateWorksheetCount,
                remove: updateWorksheetCount,
                beforeshow: updateWorksheetCount
            },
            split: true,
            defaults: {
                scrollable: true
            },
            xtype: 'tabpanel'
        };

        if (config.south) {
            southConfig.hidden = false;
            Ext.apply(southConfig, config.south);
            delete config.south;
        }

        //@UpgradedSencha 5.1 Remove overnested container!
        Ext.apply(config, {
            id: 'mainform',
            layout: 'border',
            items: [northConfig, westConfig, centerConfig, southConfig]
        });

        this.callParent([config]);
    }
});
