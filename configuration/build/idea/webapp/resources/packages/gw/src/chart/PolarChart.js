//@UpgradedSencha 5.1 New class for Sencha charts package
Ext.define('gw.chart.PolarChart', {
    extend: 'Ext.chart.PolarChart',
    alias: 'widget.gpolarchart',

    interactions: 'rotate',

    constructor: function (config) {
        var me = this,
            i = 0,
            iLen = config.axes ? config.axes.length : 0;

        //Add grid to axes , must be done on serverside as config
        for(; i < iLen; i++ ){
            config.axes[i].grid = true;
        }

        if (config.series) {
            Ext.Array.each(config.series, function (item) {

                item.tooltip = {
                    trackMouse: true
                };

                switch (item.type) {
                    case 'pie':
                        item.highlight = false;
                        if (item.label && !item.label.display) {
                            Ext.applyIf(item.label, {display: 'rotate'});
                        } else if (item.label && item.label.display === 'none') {

                            // PLWEB-5251 display: 'none' is broken in ExtJS 5.1.0. EXTJS-14177 is their issue I think.
                            Ext.applyIf(item.label, {
                                calloutLine: {
                                    color: 'rgba(0,0,0,0)'
                                },
                                renderer: function(val) {
                                    return '';
                                }
                            });
                        }

                        item.tooltip.renderer = function (storeItem) {
                            // calculate and display percentage on hover
                            var total = 0;
                            me.store.each(function (rec) {
                                total += rec.get(item.angleField);
                            });

                            this.setHtml((item.label.field ? storeItem.get(item.label.field) : '') +
                            ' (' + Math.round(storeItem.get(item.angleField)) +
                            ', ' + Math.round(storeItem.get(item.angleField) / total * 100) + '%)');
                        };
                        break;

                    case 'radar':
                        item.marker = true;
                        
                        item.style = Ext.apply(item.style || {}, {
                            opacity: 0.6,
                            lineWidth: 2,
                            fillStyle: 'none'// match legacy implementation, although new filed style looks nicer
                        });

                        item.tooltip.renderer = function (storeItem, item) {
                            for (var i = 0, iLen = item.series.getYField().length; i < iLen; i++) {
                                var dataField = (iLen === 1) ?
                                    item.series.getYField()[i] :
                                    item.field;
                                if (item.series.getYField()[i] === dataField) {
                                    this.setHtml(item.series.getTitle()[i] + ': ' + storeItem.get(dataField));
                                    break;
                                }
                            }
                        };
                        break;

                    case 'gauge':
                        item.marker = true; //add markers on corners

                        item.style = Ext.apply(item.style || {}, {
                            opacity: 0.6
                        });

                        item.tooltip.renderer = function (storeItem) {
                            this.setHtml(Math.round(storeItem.get(item.angleField)));
                        };
                        break;
                }
            })
        }

        me.callParent(arguments);
    }
});
