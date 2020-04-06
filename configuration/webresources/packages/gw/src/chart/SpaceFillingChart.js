//@UpgradedSencha 5.1 New class for Sencha charts package
Ext.define('gw.chart.SpaceFillingChart', {
    extend: 'Ext.chart.SpaceFillingChart',
    alias: 'widget.gspacefillingchart',

    constructor: function (config) {
        if (config.series) {
            Ext.Array.each(config.series, function (item) {
                item.highlight = true;
                item.tooltip = {
                    trackMouse: true
                };

                item.style = Ext.apply(item.style || {}, {
                    opacity: 0.6
                });

                item.tooltip.renderer = function (storeItem) {
                    this.setHtml(Math.round(storeItem.get(item.angleField)));
                };

            })
        }

        this.callParent(arguments);
    }
});
